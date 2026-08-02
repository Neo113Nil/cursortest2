package kotlin.io.encoding;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;

/* loaded from: classes9.dex */
public class Base64 {
    public static final Default Default = new Default(null);
    public final boolean isMimeScheme;
    public final boolean isUrlSafe;

    public final class Default extends Base64 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(DefaultConstructorMarker defaultConstructorMarker) {
            super(-1, false, false);
            PaddingOption[] paddingOptionArr = PaddingOption.$VALUES;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PaddingOption {
        public static final /* synthetic */ PaddingOption[] $VALUES = {new PaddingOption("PRESENT", 0), new PaddingOption("ABSENT", 1), new PaddingOption("PRESENT_OPTIONAL", 2), new PaddingOption("ABSENT_OPTIONAL", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        PaddingOption EF5;

        public static PaddingOption valueOf(String str) {
            return (PaddingOption) Enum.valueOf(PaddingOption.class, str);
        }

        public static PaddingOption[] values() {
            return (PaddingOption[]) $VALUES.clone();
        }
    }

    static {
        PaddingOption[] paddingOptionArr = PaddingOption.$VALUES;
        new Base64(-1, true, false);
        new Base64(76, false, true);
        new Base64(64, false, true);
    }

    public Base64(int i, boolean z, boolean z2) {
        PaddingOption[] paddingOptionArr = PaddingOption.$VALUES;
        this.isUrlSafe = z;
        this.isMimeScheme = z2;
        if (z && z2) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
    }

    public static byte[] decode$default(Default r19, CharSequence charSequence, int i, int i2) {
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        char c;
        int i6;
        int i7 = 0;
        int i8 = (i2 & 2) != 0 ? 0 : i;
        int length = charSequence.length();
        r19.getClass();
        boolean z = r19.isMimeScheme;
        charSequence.getClass();
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            int length2 = str.length();
            AbstractList.Companion.getClass();
            AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i8, length, length2);
            bArr = str.substring(i8, length).getBytes(Charsets.ISO_8859_1);
            bArr.getClass();
        } else {
            int length3 = charSequence.length();
            AbstractList.Companion.getClass();
            AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(i8, length, length3);
            byte[] bArr2 = new byte[length - i8];
            int i9 = 0;
            while (i8 < length) {
                char charAt = charSequence.charAt(i8);
                if (charAt <= 255) {
                    bArr2[i9] = (byte) charAt;
                    i9++;
                } else {
                    bArr2[i9] = 63;
                    i9++;
                }
                i8++;
            }
            bArr = bArr2;
        }
        int length4 = bArr.length;
        int length5 = bArr.length;
        AbstractList.Companion.getClass();
        AbstractList.Companion.checkBoundsIndexes$kotlin_stdlib(0, length4, length5);
        int i10 = 1;
        int i11 = -2;
        if (length4 == 0) {
            i4 = 0;
        } else {
            if (length4 == 1) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(length4, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                return null;
            }
            if (z) {
                i3 = length4;
                int i12 = 0;
                while (true) {
                    if (i12 >= length4) {
                        break;
                    }
                    int i13 = Base64Kt.base64DecodeMap[bArr[i12] & 255];
                    if (i13 < 0) {
                        if (i13 == -2) {
                            i3 -= length4 - i12;
                            break;
                        }
                        i3--;
                    }
                    i12++;
                }
            } else if (bArr[length4 - 1] == 61) {
                i3 = length4 - 1;
                if (bArr[length4 - 2] == 61) {
                    i3 = length4 - 2;
                }
            } else {
                i3 = length4;
            }
            i4 = (int) ((i3 * 6) / 8);
        }
        byte[] bArr3 = new byte[i4];
        int[] iArr2 = r19.isUrlSafe ? Base64Kt.base64UrlDecodeMap : Base64Kt.base64DecodeMap;
        int i14 = -8;
        int i15 = 0;
        int i16 = 0;
        int i17 = -8;
        while (true) {
            int i18 = i10;
            if (i15 >= length4) {
                i5 = 0;
                break;
            }
            if (i17 != i14 || (i6 = i15 + 3) >= length4) {
                iArr = iArr2;
            } else {
                iArr = iArr2;
                int i19 = i15 + 4;
                int i20 = (iArr[bArr[i15 + 2] & 255] << 6) | (iArr2[bArr[i15 + 1] & 255] << 12) | (iArr2[bArr[i15] & 255] << 18) | iArr[bArr[i6] & 255];
                if (i20 >= 0) {
                    bArr3[i7] = (byte) (i20 >> 16);
                    int i21 = i7 + 2;
                    bArr3[i7 + 1] = (byte) (i20 >> 8);
                    i7 += 3;
                    bArr3[i21] = (byte) i20;
                    i10 = i18;
                    iArr2 = iArr;
                    i15 = i19;
                    i11 = -2;
                    i14 = -8;
                }
            }
            int i22 = bArr[i15] & 255;
            int i23 = iArr[i22];
            if (i23 >= 0) {
                c = '=';
                i15++;
                i16 = (i16 << 6) | i23;
                int i24 = i17 + 6;
                if (i24 >= 0) {
                    bArr3[i7] = (byte) (i16 >>> i24);
                    i16 &= (i18 << i24) - 1;
                    i17 -= 2;
                    i10 = i18;
                    i7++;
                } else {
                    i10 = i18;
                    i17 = i24;
                }
            } else if (i23 != -2) {
                c = '=';
                if (!z) {
                    StringBuilder sb = new StringBuilder("Invalid symbol '");
                    sb.append((char) i22);
                    sb.append("'(");
                    String num = Integer.toString(i22, CharsKt.checkRadix(8));
                    num.getClass();
                    sb.append(num);
                    a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i15, ") at index ", sb));
                    return null;
                }
                i15++;
                i10 = i18;
            } else {
                if (i17 == -8) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i15, "Redundant pad character at index "));
                    return null;
                }
                if (i17 == -6) {
                    PaddingOption[] paddingOptionArr = PaddingOption.$VALUES;
                } else if (i17 == -4) {
                    PaddingOption[] paddingOptionArr2 = PaddingOption.$VALUES;
                    int i25 = i15 + 1;
                    if (z) {
                        while (i25 < length4) {
                            if (Base64Kt.base64DecodeMap[bArr[i25] & 255] != -1) {
                                break;
                            }
                            i25++;
                        }
                    }
                    if (i25 == length4 || bArr[i25] != 61) {
                        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i25, "Missing one pad character at index "));
                        return null;
                    }
                    i15 = i25 + 1;
                    i5 = i18;
                    i11 = -2;
                } else if (i17 != -2) {
                    a$$ExternalSyntheticBUOutline0.m$1("Unreachable");
                    return null;
                }
                i15++;
                i5 = i18;
                i11 = -2;
            }
            iArr2 = iArr;
            i11 = -2;
            i14 = -8;
        }
        if (i17 == i11) {
            a$$ExternalSyntheticBUOutline0.m$3("The last unit of input does not have enough bits");
            return null;
        }
        if (i17 != -8 && i5 == 0) {
            PaddingOption[] paddingOptionArr3 = PaddingOption.$VALUES;
            a$$ExternalSyntheticBUOutline0.m$3("The padding option is set to PRESENT, but the input is not properly padded");
            return null;
        }
        if (i16 != 0) {
            a$$ExternalSyntheticBUOutline0.m$3("The pad bits must be zeros");
            return null;
        }
        if (z) {
            while (i15 < length4) {
                if (Base64Kt.base64DecodeMap[bArr[i15] & 255] != -1) {
                    break;
                }
                i15++;
            }
        }
        if (i15 >= length4) {
            if (i7 == i4) {
                return bArr3;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            return null;
        }
        int i26 = bArr[i15] & 255;
        char c2 = (char) i26;
        String num2 = Integer.toString(i26, CharsKt.checkRadix(8));
        num2.getClass();
        StringBuilder sb2 = new StringBuilder("Symbol '");
        sb2.append(c2);
        sb2.append("'(");
        sb2.append(num2);
        sb2.append(") at index ");
        sb2.append(i15 - 1);
        sb2.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb2.toString());
    }
}
