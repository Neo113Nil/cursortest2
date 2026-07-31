package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: LayoutHelper.kt */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u0010/\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "Landroid/text/Layout;", "layout", "<init>", "(Landroid/text/Layout;)V", "", "offset", "", "primary", "", "getDownstreamHorizontal", "(IZ)F", "lineEnd", "lineEndToVisibleEnd", "(I)I", "paragraphIndex", "Ljava/text/Bidi;", "analyzeBidi", "(I)Ljava/text/Bidi;", "upstream", "getParagraphForOffset", "(IZ)I", "getParagraphStart", "isRtlParagraph", "(I)Z", "usePrimaryDirection", "getHorizontalPosition", "(IZZ)F", "", "c", "isLineEndSpace", "(C)Z", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "", "paragraphEnds", "Ljava/util/List;", "", "paragraphBidi", "", "bidiProcessedParagraphs", "[Z", "", "tmpBuffer", "[C", "paragraphCount", "I", "getParagraphCount", "()I", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LayoutHelper {
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List paragraphBidi;
    private final int paragraphCount;
    private final List paragraphEnds;
    private char[] tmpBuffer;

    public final boolean isLineEndSpace(char c) {
        return c == ' ' || c == '\n' || c == 5760 || (8192 <= c && c < 8203 && c != 8199) || c == 8287 || c == 12288;
    }

    public LayoutHelper(Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            CharSequence text = this.layout.getText();
            Intrinsics.checkNotNullExpressionValue(text, "layout.text");
            int indexOf$default = StringsKt.indexOf$default(text, '\n', i, false, 4, (Object) null);
            i = indexOf$default < 0 ? this.layout.getText().length() : indexOf$default + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r0.getRunCount() == 1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bidi analyzeBidi(int paragraphIndex) {
        Bidi bidi;
        if (this.bidiProcessedParagraphs[paragraphIndex]) {
            return (Bidi) this.paragraphBidi.get(paragraphIndex);
        }
        int intValue = paragraphIndex == 0 ? 0 : ((Number) this.paragraphEnds.get(paragraphIndex - 1)).intValue();
        int intValue2 = ((Number) this.paragraphEnds.get(paragraphIndex)).intValue();
        int i = intValue2 - intValue;
        char[] cArr = this.tmpBuffer;
        if (cArr == null || cArr.length < i) {
            cArr = new char[i];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i)) {
            bidi = new Bidi(cArr2, 0, null, 0, i, isRtlParagraph(paragraphIndex) ? 1 : 0);
        }
        bidi = null;
        this.paragraphBidi.set(paragraphIndex, bidi);
        this.bidiProcessedParagraphs[paragraphIndex] = true;
        if (bidi != null) {
            char[] cArr3 = this.tmpBuffer;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.tmpBuffer = cArr2;
        return bidi;
    }

    public final int getParagraphForOffset(int offset, boolean upstream) {
        int binarySearch$default = CollectionsKt.binarySearch$default(this.paragraphEnds, Integer.valueOf(offset), 0, 0, 6, (Object) null);
        int i = binarySearch$default < 0 ? -(binarySearch$default + 1) : binarySearch$default + 1;
        if (upstream && i > 0) {
            int i2 = i - 1;
            if (offset == ((Number) this.paragraphEnds.get(i2)).intValue()) {
                return i2;
            }
        }
        return i;
    }

    public final int getParagraphStart(int paragraphIndex) {
        if (paragraphIndex == 0) {
            return 0;
        }
        return ((Number) this.paragraphEnds.get(paragraphIndex - 1)).intValue();
    }

    public final boolean isRtlParagraph(int paragraphIndex) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(paragraphIndex))) == -1;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection, boolean upstream) {
        if (!upstream) {
            return getDownstreamHorizontal(offset, usePrimaryDirection);
        }
        int lineForOffset = LayoutCompatKt.getLineForOffset(this.layout, offset, upstream);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (offset != lineStart && offset != lineEnd) {
            return getDownstreamHorizontal(offset, usePrimaryDirection);
        }
        if (offset == 0 || offset == this.layout.getText().length()) {
            return getDownstreamHorizontal(offset, usePrimaryDirection);
        }
        int paragraphForOffset = getParagraphForOffset(offset, upstream);
        boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
        int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i = lineStart - paragraphStart;
        int i2 = lineEndToVisibleEnd - paragraphStart;
        Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi createLineBidi = analyzeBidi != null ? analyzeBidi.createLineBidi(i, i2) : null;
        boolean z = false;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (usePrimaryDirection || isRtlParagraph == isRtlCharAt) {
                isRtlParagraph = !isRtlParagraph;
            }
            if (offset == lineStart) {
                z = isRtlParagraph;
            } else if (!isRtlParagraph) {
                z = true;
            }
            Layout layout = this.layout;
            return z ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i3 = 0; i3 < runCount; i3++) {
            bidiRunArr[i3] = new BidiRun(createLineBidi.getRunStart(i3) + lineStart, createLineBidi.getRunLimit(i3) + lineStart, createLineBidi.getRunLevel(i3) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i4 = 0; i4 < runCount2; i4++) {
            bArr[i4] = (byte) createLineBidi.getRunLevel(i4);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i5 = -1;
        if (offset == lineStart) {
            int i6 = 0;
            while (true) {
                if (i6 >= runCount) {
                    break;
                }
                if (bidiRunArr[i6].getStart() == offset) {
                    i5 = i6;
                    break;
                }
                i6++;
            }
            BidiRun bidiRun = bidiRunArr[i5];
            if (usePrimaryDirection || isRtlParagraph == bidiRun.getIsRtl()) {
                isRtlParagraph = !isRtlParagraph;
            }
            if (i5 == 0 && isRtlParagraph) {
                return this.layout.getLineLeft(lineForOffset);
            }
            if (i5 == ArraysKt.getLastIndex(bidiRunArr) && !isRtlParagraph) {
                return this.layout.getLineRight(lineForOffset);
            }
            if (isRtlParagraph) {
                return this.layout.getPrimaryHorizontal(bidiRunArr[i5 - 1].getStart());
            }
            return this.layout.getPrimaryHorizontal(bidiRunArr[i5 + 1].getStart());
        }
        int i7 = 0;
        while (true) {
            if (i7 >= runCount) {
                break;
            }
            if (bidiRunArr[i7].getEnd() == offset) {
                i5 = i7;
                break;
            }
            i7++;
        }
        BidiRun bidiRun2 = bidiRunArr[i5];
        if (!usePrimaryDirection && isRtlParagraph != bidiRun2.getIsRtl()) {
            isRtlParagraph = !isRtlParagraph;
        }
        if (i5 == 0 && isRtlParagraph) {
            return this.layout.getLineLeft(lineForOffset);
        }
        if (i5 == ArraysKt.getLastIndex(bidiRunArr) && !isRtlParagraph) {
            return this.layout.getLineRight(lineForOffset);
        }
        if (isRtlParagraph) {
            return this.layout.getPrimaryHorizontal(bidiRunArr[i5 - 1].getEnd());
        }
        return this.layout.getPrimaryHorizontal(bidiRunArr[i5 + 1].getEnd());
    }

    private final float getDownstreamHorizontal(int offset, boolean primary) {
        if (primary) {
            return this.layout.getPrimaryHorizontal(offset);
        }
        return this.layout.getSecondaryHorizontal(offset);
    }

    /* compiled from: LayoutHelper.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "", "start", "end", "", "isRtl", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getStart", "getEnd", "Z", "()Z", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final /* data */ class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) other;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.start) * 31) + Integer.hashCode(this.end)) * 31;
            boolean z = this.isRtl;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }

        public BidiRun(int i, int i2, boolean z) {
            this.start = i;
            this.end = i2;
            this.isRtl = z;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        /* renamed from: isRtl, reason: from getter */
        public final boolean getIsRtl() {
            return this.isRtl;
        }
    }

    private final int lineEndToVisibleEnd(int lineEnd) {
        while (lineEnd > 0 && isLineEndSpace(this.layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        return lineEnd;
    }
}
