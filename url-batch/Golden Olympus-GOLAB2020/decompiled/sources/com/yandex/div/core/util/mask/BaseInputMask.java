package com.yandex.div.core.util.mask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class BaseInputMask {
    private int cursorPosition;
    protected List<? extends MaskChar> destructedValue;

    @NotNull
    private final Map<Character, Regex> filters;

    @NotNull
    private MaskData maskData;

    @Metadata
    public static abstract class MaskChar {

        @Metadata
        public static final class Dynamic extends MaskChar {

            /* renamed from: char, reason: not valid java name */
            @Nullable
            private Character f0char;

            @Nullable
            private final Regex filter;
            private final char placeholder;

            public Dynamic(@Nullable Character ch, @Nullable Regex regex, char c4) {
                super(null);
                this.f0char = ch;
                this.filter = regex;
                this.placeholder = c4;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dynamic)) {
                    return false;
                }
                Dynamic dynamic = (Dynamic) obj;
                return Intrinsics.areEqual(this.f0char, dynamic.f0char) && Intrinsics.areEqual(this.filter, dynamic.filter) && this.placeholder == dynamic.placeholder;
            }

            @Nullable
            public final Character getChar() {
                return this.f0char;
            }

            @Nullable
            public final Regex getFilter() {
                return this.filter;
            }

            public final char getPlaceholder() {
                return this.placeholder;
            }

            public int hashCode() {
                Character ch = this.f0char;
                int hashCode = (ch == null ? 0 : ch.hashCode()) * 31;
                Regex regex = this.filter;
                return ((hashCode + (regex != null ? regex.hashCode() : 0)) * 31) + Character.hashCode(this.placeholder);
            }

            public final void setChar(@Nullable Character ch) {
                this.f0char = ch;
            }

            @NotNull
            public String toString() {
                return "Dynamic(char=" + this.f0char + ", filter=" + this.filter + ", placeholder=" + this.placeholder + ')';
            }
        }

        @Metadata
        public static final class Static extends MaskChar {

            /* renamed from: char, reason: not valid java name */
            private final char f1char;

            public Static(char c4) {
                super(null);
                this.f1char = c4;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Static) && this.f1char == ((Static) obj).f1char;
            }

            public final char getChar() {
                return this.f1char;
            }

            public int hashCode() {
                return Character.hashCode(this.f1char);
            }

            @NotNull
            public String toString() {
                return "Static(char=" + this.f1char + ')';
            }
        }

        public /* synthetic */ MaskChar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private MaskChar() {
        }
    }

    @Metadata
    public static final class MaskData {
        private final boolean alwaysVisible;

        @NotNull
        private final List<MaskKey> decoding;

        @NotNull
        private final String pattern;

        public MaskData(@NotNull String pattern, @NotNull List<MaskKey> decoding, boolean z4) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(decoding, "decoding");
            this.pattern = pattern;
            this.decoding = decoding;
            this.alwaysVisible = z4;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaskData)) {
                return false;
            }
            MaskData maskData = (MaskData) obj;
            return Intrinsics.areEqual(this.pattern, maskData.pattern) && Intrinsics.areEqual(this.decoding, maskData.decoding) && this.alwaysVisible == maskData.alwaysVisible;
        }

        public final boolean getAlwaysVisible() {
            return this.alwaysVisible;
        }

        @NotNull
        public final List<MaskKey> getDecoding() {
            return this.decoding;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.pattern.hashCode() * 31) + this.decoding.hashCode()) * 31;
            boolean z4 = this.alwaysVisible;
            int i4 = z4;
            if (z4 != 0) {
                i4 = 1;
            }
            return hashCode + i4;
        }

        @NotNull
        public String toString() {
            return "MaskData(pattern=" + this.pattern + ", decoding=" + this.decoding + ", alwaysVisible=" + this.alwaysVisible + ')';
        }
    }

    @Metadata
    public static final class MaskKey {

        @Nullable
        private final String filter;
        private final char key;
        private final char placeholder;

        public MaskKey(char c4, @Nullable String str, char c5) {
            this.key = c4;
            this.filter = str;
            this.placeholder = c5;
        }

        @Nullable
        public final String getFilter() {
            return this.filter;
        }

        public final char getKey() {
            return this.key;
        }

        public final char getPlaceholder() {
            return this.placeholder;
        }
    }

    public BaseInputMask(@NotNull MaskData initialMaskData) {
        Intrinsics.checkNotNullParameter(initialMaskData, "initialMaskData");
        this.maskData = initialMaskData;
        this.filters = new LinkedHashMap();
        updateMaskData$default(this, initialMaskData, false, 2, null);
    }

    public static /* synthetic */ void applyChangeFrom$default(BaseInputMask baseInputMask, String str, Integer num, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyChangeFrom");
        }
        if ((i4 & 2) != 0) {
            num = null;
        }
        baseInputMask.applyChangeFrom(str, num);
    }

    private final String buildBodySubstring(TextDiff textDiff, String str) {
        String substring = str.substring(textDiff.getStart(), textDiff.getStart() + textDiff.getAdded());
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    private final String buildTailSubstring(TextDiff textDiff) {
        return collectValueRange(textDiff.getStart() + textDiff.getRemoved(), getDestructedValue().size() - 1);
    }

    private final int calculateMaxShift(String str, int i4) {
        int i5;
        if (this.filters.size() <= 1) {
            int i6 = 0;
            while (i4 < getDestructedValue().size()) {
                if (getDestructedValue().get(i4) instanceof MaskChar.Dynamic) {
                    i6++;
                }
                i4++;
            }
            i5 = i6 - str.length();
        } else {
            String calculateInsertableSubstring = calculateInsertableSubstring(str, i4);
            int i7 = 0;
            while (i7 < getDestructedValue().size() && Intrinsics.areEqual(calculateInsertableSubstring, calculateInsertableSubstring(str, i4 + i7))) {
                i7++;
            }
            i5 = i7 - 1;
        }
        return g.d(i5, 0);
    }

    public static /* synthetic */ void replaceChars$default(BaseInputMask baseInputMask, String str, int i4, Integer num, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceChars");
        }
        if ((i5 & 4) != 0) {
            num = null;
        }
        baseInputMask.replaceChars(str, i4, num);
    }

    public static /* synthetic */ void updateMaskData$default(BaseInputMask baseInputMask, MaskData maskData, boolean z4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMaskData");
        }
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        baseInputMask.updateMaskData(maskData, z4);
    }

    public void applyChangeFrom(@NotNull String newValue, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        TextDiff build = TextDiff.Companion.build(getValue(), newValue);
        if (num != null) {
            build = new TextDiff(g.d(num.intValue() - build.getAdded(), 0), build.getAdded(), build.getRemoved());
        }
        calculateCursorPosition(build, replaceBodyTail(build, newValue));
    }

    protected final void calculateCursorPosition(@NotNull TextDiff textDiff, int i4) {
        Intrinsics.checkNotNullParameter(textDiff, "textDiff");
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        if (textDiff.getStart() < firstEmptyHolderIndex) {
            firstEmptyHolderIndex = Math.min(firstHolderAfter(i4), getValue().length());
        }
        this.cursorPosition = firstEmptyHolderIndex;
    }

    @NotNull
    protected final String calculateInsertableSubstring(@NotNull String substring, int i4) {
        Intrinsics.checkNotNullParameter(substring, "substring");
        StringBuilder sb = new StringBuilder();
        E e4 = new E();
        e4.f41130b = i4;
        BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1 baseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1 = new BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1(e4, this);
        for (int i5 = 0; i5 < substring.length(); i5++) {
            char charAt = substring.charAt(i5);
            Regex regex = (Regex) baseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1.invoke();
            if (regex != null && regex.d(String.valueOf(charAt))) {
                sb.append(charAt);
                e4.f41130b++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "charsCanBeInsertedStringBuilder.toString()");
        return sb2;
    }

    protected final void cleanup(@NotNull TextDiff textDiff) {
        Intrinsics.checkNotNullParameter(textDiff, "textDiff");
        if (textDiff.getAdded() == 0 && textDiff.getRemoved() == 1) {
            int start = textDiff.getStart();
            while (true) {
                if (start < 0) {
                    break;
                }
                MaskChar maskChar = getDestructedValue().get(start);
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        dynamic.setChar(null);
                        break;
                    }
                }
                start--;
            }
        }
        clearRange(textDiff.getStart(), getDestructedValue().size());
    }

    protected final void clearRange(int i4, int i5) {
        while (i4 < i5 && i4 < getDestructedValue().size()) {
            MaskChar maskChar = getDestructedValue().get(i4);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(null);
            }
            i4++;
        }
    }

    @NotNull
    protected final String collectValueRange(int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        while (i4 <= i5) {
            MaskChar maskChar = getDestructedValue().get(i4);
            if (maskChar instanceof MaskChar.Dynamic) {
                MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                if (dynamic.getChar() != null) {
                    sb.append(dynamic.getChar());
                }
            }
            i4++;
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "tailStringBuilder.toString()");
        return sb2;
    }

    protected final int firstHolderAfter(int i4) {
        while (i4 < getDestructedValue().size() && !(getDestructedValue().get(i4) instanceof MaskChar.Dynamic)) {
            i4++;
        }
        return i4;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    @NotNull
    protected final List<MaskChar> getDestructedValue() {
        List list = this.destructedValue;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("destructedValue");
        return null;
    }

    protected final int getFirstEmptyHolderIndex() {
        Iterator<MaskChar> it = getDestructedValue().iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i4 = -1;
                break;
            }
            MaskChar next = it.next();
            if ((next instanceof MaskChar.Dynamic) && ((MaskChar.Dynamic) next).getChar() == null) {
                break;
            }
            i4++;
        }
        return i4 != -1 ? i4 : getDestructedValue().size();
    }

    @NotNull
    protected final MaskData getMaskData() {
        return this.maskData;
    }

    @NotNull
    public final String getRawValue() {
        return collectValueRange(0, getDestructedValue().size() - 1);
    }

    @NotNull
    public final String getValue() {
        StringBuilder sb = new StringBuilder();
        List<MaskChar> destructedValue = getDestructedValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : destructedValue) {
            MaskChar maskChar = (MaskChar) obj;
            if (!(maskChar instanceof MaskChar.Static)) {
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        sb.append(dynamic.getChar());
                    }
                }
                if (!this.maskData.getAlwaysVisible()) {
                    break;
                }
                Intrinsics.checkNotNull(maskChar, "null cannot be cast to non-null type com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic");
                sb.append(((MaskChar.Dynamic) maskChar).getPlaceholder());
            } else {
                sb.append(((MaskChar.Static) maskChar).getChar());
            }
            arrayList.add(obj);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public abstract void onException(@NotNull Exception exc);

    public void overrideRawValue(@NotNull String newRawValue) {
        Intrinsics.checkNotNullParameter(newRawValue, "newRawValue");
        clearRange(0, getDestructedValue().size());
        replaceChars$default(this, newRawValue, 0, null, 4, null);
        this.cursorPosition = Math.min(this.cursorPosition, getValue().length());
    }

    protected final int replaceBodyTail(@NotNull TextDiff textDiff, @NotNull String newValue) {
        Intrinsics.checkNotNullParameter(textDiff, "textDiff");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String buildBodySubstring = buildBodySubstring(textDiff, newValue);
        String buildTailSubstring = buildTailSubstring(textDiff);
        cleanup(textDiff);
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        replaceChars(buildBodySubstring, firstEmptyHolderIndex, buildTailSubstring.length() == 0 ? null : Integer.valueOf(calculateMaxShift(buildTailSubstring, firstEmptyHolderIndex)));
        int firstEmptyHolderIndex2 = getFirstEmptyHolderIndex();
        replaceChars$default(this, buildTailSubstring, firstEmptyHolderIndex2, null, 4, null);
        return firstEmptyHolderIndex2;
    }

    protected final void replaceChars(@NotNull String substring, int i4, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(substring, "substring");
        String calculateInsertableSubstring = calculateInsertableSubstring(substring, i4);
        if (num != null) {
            calculateInsertableSubstring = StringsKt.i1(calculateInsertableSubstring, num.intValue());
        }
        int i5 = 0;
        while (i4 < getDestructedValue().size() && i5 < calculateInsertableSubstring.length()) {
            MaskChar maskChar = getDestructedValue().get(i4);
            char charAt = calculateInsertableSubstring.charAt(i5);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(Character.valueOf(charAt));
                i5++;
            }
            i4++;
        }
    }

    protected final void setCursorPosition(int i4) {
        this.cursorPosition = i4;
    }

    protected final void setDestructedValue(@NotNull List<? extends MaskChar> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.destructedValue = list;
    }

    public void updateMaskData(@NotNull MaskData newMaskData, boolean z4) {
        Object obj;
        Intrinsics.checkNotNullParameter(newMaskData, "newMaskData");
        String rawValue = (Intrinsics.areEqual(this.maskData, newMaskData) || !z4) ? null : getRawValue();
        this.maskData = newMaskData;
        this.filters.clear();
        for (MaskKey maskKey : this.maskData.getDecoding()) {
            try {
                String filter = maskKey.getFilter();
                if (filter != null) {
                    this.filters.put(Character.valueOf(maskKey.getKey()), new Regex(filter));
                }
            } catch (PatternSyntaxException e4) {
                onException(e4);
            }
        }
        String pattern = this.maskData.getPattern();
        ArrayList arrayList = new ArrayList(pattern.length());
        for (int i4 = 0; i4 < pattern.length(); i4++) {
            char charAt = pattern.charAt(i4);
            Iterator<T> it = this.maskData.getDecoding().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((MaskKey) obj).getKey() == charAt) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MaskKey maskKey2 = (MaskKey) obj;
            arrayList.add(maskKey2 != null ? new MaskChar.Dynamic(null, this.filters.get(Character.valueOf(maskKey2.getKey())), maskKey2.getPlaceholder()) : new MaskChar.Static(charAt));
        }
        setDestructedValue(arrayList);
        if (rawValue != null) {
            overrideRawValue(rawValue);
        }
    }
}
