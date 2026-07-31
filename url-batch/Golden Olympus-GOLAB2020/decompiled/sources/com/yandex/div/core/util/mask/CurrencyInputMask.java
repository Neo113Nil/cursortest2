package com.yandex.div.core.util.mask;

import com.yandex.div.core.util.mask.BaseInputMask;
import io.jsonwebtoken.JwtParser;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class CurrencyInputMask extends BaseInputMask {

    @NotNull
    private NumberFormat currencyFormatter;
    private final char currencyKey;

    @NotNull
    private final Function1<Exception, Unit> onError;

    @NotNull
    private final List<Character> separators;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyInputMask(@NotNull Locale locale, @NotNull Function1<? super Exception, Unit> onError) {
        super(new BaseInputMask.MaskData("", CollectionsKt.emptyList(), false));
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(onError, "onError");
        this.onError = onError;
        this.currencyKey = (char) 164;
        this.separators = CollectionsKt.listOf((Object[]) new Character[]{Character.valueOf(JwtParser.SEPARATOR_CHAR), ','});
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        Intrinsics.checkNotNullExpressionValue(currencyInstance, "getCurrencyInstance(locale)");
        this.currencyFormatter = clearFormatter(currencyInstance);
    }

    private final NumberFormat clearFormatter(NumberFormat numberFormat) {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            Intrinsics.checkNotNullExpressionValue(pattern, "toPattern()");
            StringBuilder sb = new StringBuilder();
            int length = pattern.length();
            for (int i4 = 0; i4 < length; i4++) {
                char charAt = pattern.charAt(i4);
                if (charAt != this.currencyKey) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            decimalFormat.applyPattern(StringsKt.W0(sb2).toString());
        }
        return numberFormat;
    }

    private final String formatPattern(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (Character.isDigit(charAt)) {
                sb.append('#');
            } else {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private final DecimalFormatSymbols getDecimalFormatSymbols() {
        NumberFormat numberFormat = this.currencyFormatter;
        Intrinsics.checkNotNull(numberFormat, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) numberFormat).getDecimalFormatSymbols();
        Intrinsics.checkNotNullExpressionValue(decimalFormatSymbols, "currencyFormatter as Dec…mat).decimalFormatSymbols");
        return decimalFormatSymbols;
    }

    private final String getWithNbsp(String str) {
        return StringsKt.F(str, ' ', (char) 160, false, 4, null);
    }

    private final boolean inDiff(TextDiff textDiff, int i4) {
        return textDiff.getStart() <= i4 && i4 < textDiff.getStart() + textDiff.getAdded();
    }

    private final void invalidateMaskDataForFormatted(Number number) {
        String formatted = this.currencyFormatter.format(number);
        Intrinsics.checkNotNullExpressionValue(formatted, "formatted");
        String formatPattern = formatPattern(formatted);
        BaseInputMask.MaskKey maskKey = new BaseInputMask.MaskKey('#', "\\d", '0');
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(getDecimalFormatSymbols().getDecimalSeparator());
        sb.append(']');
        updateMaskData(new BaseInputMask.MaskData(formatPattern, CollectionsKt.listOf((Object[]) new BaseInputMask.MaskKey[]{maskKey, new BaseInputMask.MaskKey(decimalSeparator, sb.toString(), getDecimalFormatSymbols().getDecimalSeparator())}), getMaskData().getAlwaysVisible()), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0127 A[EDGE_INSN: B:85:0x0127->B:76:0x0127 BREAK  A[LOOP:3: B:70:0x0112->B:73:0x0124], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String toValidFormat(String str, TextDiff textDiff) {
        int i4;
        int i5;
        int i6;
        int length;
        int length2;
        int i7;
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        int i8 = 0;
        while (true) {
            i4 = -1;
            if (i8 >= str.length()) {
                i8 = -1;
                break;
            }
            if (str.charAt(i8) == decimalSeparator && !inDiff(textDiff, i8)) {
                break;
            }
            i8++;
        }
        if (textDiff.getAdded() == 1 && textDiff.getRemoved() == 0) {
            if (this.separators.contains(Character.valueOf(str.charAt(textDiff.getStart())))) {
                i5 = textDiff.getStart();
                int maximumFractionDigits = this.currencyFormatter.getMaximumFractionDigits();
                if (i8 == -1) {
                    i6 = maximumFractionDigits;
                    for (int i9 = i8; i9 < str.length(); i9++) {
                        if (Character.isDigit(str.charAt(i9)) && !inDiff(textDiff, i9)) {
                            i6--;
                        }
                    }
                } else {
                    int i10 = 0;
                    int i11 = 0;
                    boolean z4 = false;
                    i6 = maximumFractionDigits;
                    while (i10 < str.length()) {
                        char charAt = str.charAt(i10);
                        int i12 = i11 + 1;
                        boolean inDiff = inDiff(textDiff, i11);
                        if (charAt == decimalSeparator) {
                            z4 = true;
                        } else if (!inDiff && z4 && Character.isDigit(charAt)) {
                            i6--;
                        }
                        i10++;
                        i11 = i12;
                    }
                }
                boolean z5 = (StringsKt.O(str, decimalSeparator, false, 2, null) && i5 == -1) ? false : true;
                StringBuilder sb = new StringBuilder();
                boolean z6 = false;
                for (length = str.length() - 1; length >= 0; length--) {
                    char charAt2 = str.charAt(length);
                    boolean z7 = sb.length() <= maximumFractionDigits;
                    if (Character.isDigit(charAt2)) {
                        if (!inDiff(textDiff, length) || z6 || !z5) {
                            sb.append(charAt2);
                        } else if (i6 > 0) {
                            sb.append(charAt2);
                            i6--;
                        }
                    } else if (z7 && i8 == -1 && length == i5) {
                        sb.append(decimalSeparator);
                        z6 = true;
                    } else if (z7 && charAt2 == decimalSeparator && (i8 == length || i8 == -1)) {
                        sb.append(decimalSeparator);
                        z6 = true;
                        i8 = length;
                    }
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                String obj = StringsKt.g1(sb2).toString();
                length2 = obj.length();
                i7 = 0;
                while (true) {
                    if (i7 >= length2) {
                        break;
                    }
                    if (obj.charAt(i7) != getDecimalFormatSymbols().getZeroDigit()) {
                        i4 = i7;
                        break;
                    }
                    i7++;
                }
                return i4 > 0 ? obj : obj.charAt(i4) == getDecimalFormatSymbols().getDecimalSeparator() ? StringsKt.a1(obj, i4 - 1) : StringsKt.a1(obj, i4);
            }
        }
        i5 = -1;
        int maximumFractionDigits2 = this.currencyFormatter.getMaximumFractionDigits();
        if (i8 == -1) {
        }
        if (StringsKt.O(str, decimalSeparator, false, 2, null)) {
        }
        StringBuilder sb3 = new StringBuilder();
        boolean z62 = false;
        while (length >= 0) {
        }
        String sb22 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb22, "toString(...)");
        String obj2 = StringsKt.g1(sb22).toString();
        length2 = obj2.length();
        i7 = 0;
        while (true) {
            if (i7 >= length2) {
            }
            i7++;
        }
        if (i4 > 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[LOOP:1: B:11:0x003d->B:14:0x0049, LOOP_START, PHI: r2
      0x003d: PHI (r2v10 int) = (r2v3 int), (r2v11 int) binds: [B:10:0x003b, B:14:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    @Override // com.yandex.div.core.util.mask.BaseInputMask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void applyChangeFrom(@NotNull String newValue, @Nullable Integer num) {
        int length;
        boolean z4;
        String validFormat;
        String valueOf;
        Number parse;
        int abs;
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        TextDiff build = TextDiff.Companion.build(getValue(), getWithNbsp(newValue));
        char decimalSeparator = getDecimalFormatSymbols().getDecimalSeparator();
        String value = getValue();
        int length2 = value.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i4 = length2 - 1;
                if (value.charAt(length2) == decimalSeparator) {
                    break;
                } else if (i4 < 0) {
                    break;
                } else {
                    length2 = i4;
                }
            }
            length = newValue.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (newValue.charAt(length) == decimalSeparator) {
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            length = -1;
            z4 = length2 == length || (length2 == -1 && length == -1);
            validFormat = toValidFormat(newValue, build);
            NumberFormat numberFormat = this.currencyFormatter;
            if (StringsKt.I0(validFormat, decimalSeparator, false, 2, null)) {
                valueOf = StringsKt.z(validFormat) ? String.valueOf(getDecimalFormatSymbols().getZeroDigit()) : validFormat;
            } else {
                valueOf = getDecimalFormatSymbols().getZeroDigit() + validFormat;
            }
            parse = numberFormat.parse(valueOf);
            if (parse == null) {
                parse = 0;
            }
            cleanup(build);
            if (z4) {
                invalidateMaskDataForFormatted(parse);
            }
            BaseInputMask.replaceChars$default(this, validFormat, 0, null, 4, null);
            if (getValue().length() > build.getStart() || getValue().charAt(build.getStart()) != getDecimalFormatSymbols().getGroupingSeparator()) {
                abs = Math.abs(getValue().length() - (newValue.length() - (num == null ? num.intValue() : getCursorPosition())));
            } else {
                abs = num != null ? num.intValue() : getCursorPosition();
            }
            setCursorPosition(g.g(abs, getValue().length()));
        }
        length2 = -1;
        length = newValue.length() - 1;
        if (length >= 0) {
        }
        length = -1;
        if (length2 == length) {
        }
        validFormat = toValidFormat(newValue, build);
        NumberFormat numberFormat2 = this.currencyFormatter;
        if (StringsKt.I0(validFormat, decimalSeparator, false, 2, null)) {
        }
        parse = numberFormat2.parse(valueOf);
        if (parse == null) {
        }
        cleanup(build);
        if (z4) {
        }
        BaseInputMask.replaceChars$default(this, validFormat, 0, null, 4, null);
        if (getValue().length() > build.getStart()) {
        }
        abs = Math.abs(getValue().length() - (newValue.length() - (num == null ? num.intValue() : getCursorPosition())));
        setCursorPosition(g.g(abs, getValue().length()));
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(@NotNull Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.onError.invoke(exception);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void overrideRawValue(@NotNull String newRawValue) {
        Intrinsics.checkNotNullParameter(newRawValue, "newRawValue");
        Number parse = this.currencyFormatter.parse(newRawValue);
        if (parse == null) {
            parse = 0;
        }
        invalidateMaskDataForFormatted(parse);
        super.overrideRawValue(newRawValue);
    }

    public final void updateCurrencyParams(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String F4 = StringsKt.F(getRawValue(), getDecimalFormatSymbols().getDecimalSeparator(), JwtParser.SEPARATOR_CHAR, false, 4, null);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        Intrinsics.checkNotNullExpressionValue(currencyInstance, "getCurrencyInstance(locale)");
        this.currencyFormatter = clearFormatter(currencyInstance);
        BaseInputMask.applyChangeFrom$default(this, StringsKt.F(F4, JwtParser.SEPARATOR_CHAR, getDecimalFormatSymbols().getDecimalSeparator(), false, 4, null), null, 2, null);
    }
}
