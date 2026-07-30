package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.MetadataRepo;
import java.util.Arrays;
import java.util.Set;

@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;
    private static final int MAX_LOOK_AROUND_CHARACTER = 16;

    @Nullable
    private final int[] mEmojiAsDefaultStyleExceptions;

    @NonNull
    private EmojiCompat.GlyphChecker mGlyphChecker;

    @NonNull
    private final MetadataRepo mMetadataRepo;

    @NonNull
    private final EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    @RequiresApi(19)
    private static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
        }

        static int findIndexBackward(CharSequence charSequence, int i8, int i9) {
            int length = charSequence.length();
            if (i8 < 0 || length < i8 || i9 < 0) {
                return -1;
            }
            while (true) {
                boolean z7 = false;
                while (i9 != 0) {
                    i8--;
                    if (i8 < 0) {
                        return z7 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i8);
                    if (z7) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i9--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i9--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z7 = true;
                    }
                }
                return i8;
            }
        }

        static int findIndexForward(CharSequence charSequence, int i8, int i9) {
            int length = charSequence.length();
            if (i8 < 0 || length < i8 || i9 < 0) {
                return -1;
            }
            while (true) {
                boolean z7 = false;
                while (i9 != 0) {
                    if (i8 >= length) {
                        if (z7) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i8);
                    if (z7) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i9--;
                        i8++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i9--;
                        i8++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i8++;
                        z7 = true;
                    }
                }
                return i8;
            }
        }
    }

    private static class EmojiProcessAddSpanCallback implements EmojiProcessCallback<UnprecomputeTextOnModificationSpannable> {
        private final EmojiCompat.SpanFactory mSpanFactory;

        @Nullable
        public UnprecomputeTextOnModificationSpannable spannable;

        EmojiProcessAddSpanCallback(@Nullable UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable, EmojiCompat.SpanFactory spanFactory) {
            this.spannable = unprecomputeTextOnModificationSpannable;
            this.mSpanFactory = spanFactory;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public UnprecomputeTextOnModificationSpannable getResult() {
            return this.spannable;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i8, int i9, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.spannable == null) {
                this.spannable = new UnprecomputeTextOnModificationSpannable(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.spannable.setSpan(this.mSpanFactory.createSpan(typefaceEmojiRasterizer), i8, i9, 33);
            return true;
        }
    }

    private interface EmojiProcessCallback<T> {
        T getResult();

        boolean handleEmoji(@NonNull CharSequence charSequence, int i8, int i9, TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    private static class EmojiProcessLookupCallback implements EmojiProcessCallback<EmojiProcessLookupCallback> {
        private final int mOffset;
        public int start = -1;
        public int end = -1;

        EmojiProcessLookupCallback(int i8) {
            this.mOffset = i8;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public EmojiProcessLookupCallback getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i8, int i9, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i10 = this.mOffset;
            if (i8 > i10 || i10 >= i9) {
                return i9 <= i10;
            }
            this.start = i8;
            this.end = i9;
            return false;
        }
    }

    private static class MarkExclusionCallback implements EmojiProcessCallback<MarkExclusionCallback> {
        private final String mExclusion;

        MarkExclusionCallback(String str) {
            this.mExclusion = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public MarkExclusionCallback getResult() {
            return this;
        }

        @Override // androidx.emoji2.text.EmojiProcessor.EmojiProcessCallback
        public boolean handleEmoji(@NonNull CharSequence charSequence, int i8, int i9, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i8, i9), this.mExclusion)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }
    }

    static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final MetadataRepo.Node mRootNode;
        private int mState = 1;
        private final boolean mUseEmojiAsDefaultStyle;

        ProcessorSm(MetadataRepo.Node node, boolean z7, int[] iArr) {
            this.mRootNode = node;
            this.mCurrentNode = node;
            this.mUseEmojiAsDefaultStyle = z7;
            this.mEmojiAsDefaultStyleExceptions = iArr;
        }

        private static boolean isEmojiStyle(int i8) {
            return i8 == 65039;
        }

        private static boolean isTextStyle(int i8) {
            return i8 == 65038;
        }

        private int reset() {
            this.mState = 1;
            this.mCurrentNode = this.mRootNode;
            this.mCurrentDepth = 0;
            return 1;
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
            if (this.mCurrentNode.getData().isDefaultEmoji() || isEmojiStyle(this.mLastCodepoint)) {
                return true;
            }
            if (this.mUseEmojiAsDefaultStyle) {
                if (this.mEmojiAsDefaultStyleExceptions == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.mEmojiAsDefaultStyleExceptions, this.mCurrentNode.getData().getCodepointAt(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int check(int i8) {
            MetadataRepo.Node node = this.mCurrentNode.get(i8);
            int i9 = 2;
            if (this.mState != 2) {
                if (node == null) {
                    i9 = reset();
                } else {
                    this.mState = 2;
                    this.mCurrentNode = node;
                    this.mCurrentDepth = 1;
                }
            } else if (node != null) {
                this.mCurrentNode = node;
                this.mCurrentDepth++;
            } else if (isTextStyle(i8)) {
                i9 = reset();
            } else if (!isEmojiStyle(i8)) {
                if (this.mCurrentNode.getData() != null) {
                    i9 = 3;
                    if (this.mCurrentDepth != 1) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    } else if (shouldUseEmojiPresentationStyleForSingleCodepoint()) {
                        this.mFlushNode = this.mCurrentNode;
                        reset();
                    } else {
                        i9 = reset();
                    }
                } else {
                    i9 = reset();
                }
            }
            this.mLastCodepoint = i8;
            return i9;
        }

        TypefaceEmojiRasterizer getCurrentMetadata() {
            return this.mCurrentNode.getData();
        }

        TypefaceEmojiRasterizer getFlushMetadata() {
            return this.mFlushNode.getData();
        }

        boolean isInFlushableState() {
            return this.mState == 2 && this.mCurrentNode.getData() != null && (this.mCurrentDepth > 1 || shouldUseEmojiPresentationStyleForSingleCodepoint());
        }
    }

    EmojiProcessor(@NonNull MetadataRepo metadataRepo, @NonNull EmojiCompat.SpanFactory spanFactory, @NonNull EmojiCompat.GlyphChecker glyphChecker, boolean z7, @Nullable int[] iArr, @NonNull Set<int[]> set) {
        this.mSpanFactory = spanFactory;
        this.mMetadataRepo = metadataRepo;
        this.mGlyphChecker = glyphChecker;
        this.mUseEmojiAsDefaultStyle = z7;
        this.mEmojiAsDefaultStyleExceptions = iArr;
        initExclusions(set);
    }

    private static boolean delete(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z7) {
        EmojiSpan[] emojiSpanArr;
        if (hasModifiers(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!hasInvalidSelection(selectionStart, selectionEnd) && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z7 && spanStart == selectionStart) || ((!z7 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, boolean z7) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i8 >= 0 && i9 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (hasInvalidSelection(selectionStart, selectionEnd)) {
                return false;
            }
            if (z7) {
                max = CodepointIndexFinder.findIndexBackward(editable, selectionStart, Math.max(i8, 0));
                min = CodepointIndexFinder.findIndexForward(editable, selectionEnd, Math.max(i9, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i8, 0);
                min = Math.min(selectionEnd + i9, editable.length());
            }
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(max, min, EmojiSpan.class);
            if (emojiSpanArr != null && emojiSpanArr.length > 0) {
                for (EmojiSpan emojiSpan : emojiSpanArr) {
                    int spanStart = editable.getSpanStart(emojiSpan);
                    int spanEnd = editable.getSpanEnd(emojiSpan);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean handleOnKeyDown(@NonNull Editable editable, int i8, @NonNull KeyEvent keyEvent) {
        boolean delete;
        if (i8 != 67) {
            if (i8 == 112) {
                delete = delete(editable, keyEvent, true);
            }
            return false;
        }
        delete = delete(editable, keyEvent, false);
        if (delete) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        }
        return false;
    }

    private boolean hasGlyph(CharSequence charSequence, int i8, int i9, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
            typefaceEmojiRasterizer.setHasGlyph(this.mGlyphChecker.hasGlyph(charSequence, i8, i9, typefaceEmojiRasterizer.getSdkAdded()));
        }
        return typefaceEmojiRasterizer.getHasGlyph() == 2;
    }

    private static boolean hasInvalidSelection(int i8, int i9) {
        return i8 == -1 || i9 == -1 || i8 != i9;
    }

    private static boolean hasModifiers(@NonNull KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void initExclusions(@NonNull Set<int[]> set) {
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr : set) {
            String str = new String(iArr, 0, iArr.length);
            process(str, 0, str.length(), 1, true, new MarkExclusionCallback(str));
        }
    }

    int getEmojiEnd(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8) {
        if (i8 < 0 || i8 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i8, i8 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i8 - 16), Math.min(charSequence.length(), i8 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i8))).end;
    }

    int getEmojiMatch(@NonNull CharSequence charSequence) {
        return getEmojiMatch(charSequence, this.mMetadataRepo.getMetadataVersion());
    }

    int getEmojiStart(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8) {
        if (i8 < 0 || i8 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i8, i8 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((EmojiProcessLookupCallback) process(charSequence, Math.max(0, i8 - 16), Math.min(charSequence.length(), i8 + 16), Integer.MAX_VALUE, true, new EmojiProcessLookupCallback(i8))).start;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:51:0x000e, B:54:0x0013, B:56:0x0017, B:58:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:24:0x0066, B:30:0x0074, B:31:0x0080, B:33:0x0094, B:6:0x002f), top: B:50:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:51:0x000e, B:54:0x0013, B:56:0x0017, B:58:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:24:0x0066, B:30:0x0074, B:31:0x0080, B:33:0x0094, B:6:0x002f), top: B:50:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    CharSequence process(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, @IntRange(from = 0) int i10, boolean z7) {
        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable;
        int i11;
        UnprecomputeTextOnModificationSpannable unprecomputeTextOnModificationSpannable2;
        EmojiSpan[] emojiSpanArr;
        boolean z8 = charSequence instanceof SpannableBuilder;
        if (z8) {
            ((SpannableBuilder) charSequence).beginBatchEdit();
        }
        if (!z8) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    unprecomputeTextOnModificationSpannable = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i8 + (-1), i9 + 1, EmojiSpan.class) > i9) ? null : new UnprecomputeTextOnModificationSpannable(charSequence);
                    if (unprecomputeTextOnModificationSpannable != null && (emojiSpanArr = (EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(i8, i9, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
                        for (EmojiSpan emojiSpan : emojiSpanArr) {
                            int spanStart = unprecomputeTextOnModificationSpannable.getSpanStart(emojiSpan);
                            int spanEnd = unprecomputeTextOnModificationSpannable.getSpanEnd(emojiSpan);
                            if (spanStart != i9) {
                                unprecomputeTextOnModificationSpannable.removeSpan(emojiSpan);
                            }
                            i8 = Math.min(spanStart, i8);
                            i9 = Math.max(spanEnd, i9);
                        }
                    }
                    i11 = i9;
                    if (i8 != i11 && i8 < charSequence.length()) {
                        if (i10 != Integer.MAX_VALUE && unprecomputeTextOnModificationSpannable != null) {
                            i10 -= ((EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(0, unprecomputeTextOnModificationSpannable.length(), EmojiSpan.class)).length;
                        }
                        unprecomputeTextOnModificationSpannable2 = (UnprecomputeTextOnModificationSpannable) process(charSequence, i8, i11, i10, z7, new EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable, this.mSpanFactory));
                        if (unprecomputeTextOnModificationSpannable2 != null) {
                            if (z8) {
                                ((SpannableBuilder) charSequence).endBatchEdit();
                            }
                            return charSequence;
                        }
                        Spannable unwrappedSpannable = unprecomputeTextOnModificationSpannable2.getUnwrappedSpannable();
                        if (z8) {
                            ((SpannableBuilder) charSequence).endBatchEdit();
                        }
                        return unwrappedSpannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z8) {
                    ((SpannableBuilder) charSequence).endBatchEdit();
                }
            }
        }
        unprecomputeTextOnModificationSpannable = new UnprecomputeTextOnModificationSpannable((Spannable) charSequence);
        if (unprecomputeTextOnModificationSpannable != null) {
            while (r6 < r5) {
            }
        }
        i11 = i9;
        if (i8 != i11) {
            if (i10 != Integer.MAX_VALUE) {
                i10 -= ((EmojiSpan[]) unprecomputeTextOnModificationSpannable.getSpans(0, unprecomputeTextOnModificationSpannable.length(), EmojiSpan.class)).length;
            }
            unprecomputeTextOnModificationSpannable2 = (UnprecomputeTextOnModificationSpannable) process(charSequence, i8, i11, i10, z7, new EmojiProcessAddSpanCallback(unprecomputeTextOnModificationSpannable, this.mSpanFactory));
            if (unprecomputeTextOnModificationSpannable2 != null) {
            }
        }
        return charSequence;
    }

    int getEmojiMatch(@NonNull CharSequence charSequence, int i8) {
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int length = charSequence.length();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < length) {
            int codePointAt = Character.codePointAt(charSequence, i9);
            int check = processorSm.check(codePointAt);
            TypefaceEmojiRasterizer currentMetadata = processorSm.getCurrentMetadata();
            if (check == 1) {
                i9 += Character.charCount(codePointAt);
                i11 = 0;
            } else if (check == 2) {
                i9 += Character.charCount(codePointAt);
            } else if (check == 3) {
                currentMetadata = processorSm.getFlushMetadata();
                if (currentMetadata.getCompatAdded() <= i8) {
                    i10++;
                }
            }
            if (currentMetadata != null && currentMetadata.getCompatAdded() <= i8) {
                i11++;
            }
        }
        if (i10 != 0) {
            return 2;
        }
        if (!processorSm.isInFlushableState() || processorSm.getCurrentMetadata().getCompatAdded() > i8) {
            return i11 == 0 ? 0 : 2;
        }
        return 1;
    }

    private <T> T process(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, @IntRange(from = 0) int i10, boolean z7, EmojiProcessCallback<T> emojiProcessCallback) {
        int i11;
        ProcessorSm processorSm = new ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
        int codePointAt = Character.codePointAt(charSequence, i8);
        int i12 = 0;
        boolean z8 = true;
        loop0: while (true) {
            i11 = i8;
            while (i8 < i9 && i12 < i10 && z8) {
                int check = processorSm.check(codePointAt);
                if (check == 1) {
                    i11 += Character.charCount(Character.codePointAt(charSequence, i11));
                    if (i11 < i9) {
                        codePointAt = Character.codePointAt(charSequence, i11);
                    }
                    i8 = i11;
                } else if (check == 2) {
                    i8 += Character.charCount(codePointAt);
                    if (i8 < i9) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                } else if (check == 3) {
                    if (z7 || !hasGlyph(charSequence, i11, i8, processorSm.getFlushMetadata())) {
                        z8 = emojiProcessCallback.handleEmoji(charSequence, i11, i8, processorSm.getFlushMetadata());
                        i12++;
                    }
                }
            }
        }
        if (processorSm.isInFlushableState() && i12 < i10 && z8 && (z7 || !hasGlyph(charSequence, i11, i8, processorSm.getCurrentMetadata()))) {
            emojiProcessCallback.handleEmoji(charSequence, i11, i8, processorSm.getCurrentMetadata());
        }
        return emojiProcessCallback.getResult();
    }
}
