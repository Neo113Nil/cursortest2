package cn.hutool.core.util;

/* loaded from: classes.dex */
public class DesensitizedUtil {

    public enum DesensitizedType {
        USER_ID,
        CHINESE_NAME,
        ID_CARD,
        FIXED_PHONE,
        MOBILE_PHONE,
        ADDRESS,
        EMAIL,
        PASSWORD,
        CAR_LICENSE,
        BANK_CARD,
        IPV4,
        IPV6,
        FIRST_MASK,
        CLEAR_TO_NULL,
        CLEAR_TO_EMPTY
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType;

        static {
            int[] iArr = new int[DesensitizedType.values().length];
            $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType = iArr;
            try {
                iArr[DesensitizedType.USER_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.CHINESE_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.FIXED_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.MOBILE_PHONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.ADDRESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.EMAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.PASSWORD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.CAR_LICENSE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.BANK_CARD.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.IPV4.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.IPV6.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.FIRST_MASK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.CLEAR_TO_EMPTY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[DesensitizedType.CLEAR_TO_NULL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static String address(String str, int i8) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return "";
        }
        int length = str.length();
        return cn.hutool.core.text.l.hide(str, length - i8, length);
    }

    public static String bankCard(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return str;
        }
        String cleanBlank = cn.hutool.core.text.l.cleanBlank(str);
        if (cleanBlank.length() < 9) {
            return cleanBlank;
        }
        int length = cleanBlank.length();
        int i8 = length % 4;
        if (i8 == 0) {
            i8 = 4;
        }
        int i9 = (length - 4) - i8;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) cleanBlank, 0, 4);
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 % 4 == 0) {
                sb.append(' ');
            }
            sb.append('*');
        }
        sb.append(' ');
        sb.append((CharSequence) cleanBlank, length - i8, length);
        return sb.toString();
    }

    public static String carLicense(String str) {
        return cn.hutool.core.text.l.isBlank(str) ? "" : str.length() == 7 ? cn.hutool.core.text.l.hide(str, 3, 6) : str.length() == 8 ? cn.hutool.core.text.l.hide(str, 3, 7) : str;
    }

    public static String chineseName(String str) {
        return firstMask(str);
    }

    public static String clear() {
        return "";
    }

    public static String clearToNull() {
        return null;
    }

    public static String desensitized(CharSequence charSequence, DesensitizedType desensitizedType) {
        if (cn.hutool.core.text.l.isBlank(charSequence)) {
            return "";
        }
        String valueOf = String.valueOf(charSequence);
        switch (a.$SwitchMap$cn$hutool$core$util$DesensitizedUtil$DesensitizedType[desensitizedType.ordinal()]) {
            case 1:
                return String.valueOf(userId());
            case 2:
                return chineseName(String.valueOf(charSequence));
            case 3:
                return idCardNum(String.valueOf(charSequence), 1, 2);
            case 4:
                return fixedPhone(String.valueOf(charSequence));
            case 5:
                return mobilePhone(String.valueOf(charSequence));
            case 6:
                return address(String.valueOf(charSequence), 8);
            case 7:
                return email(String.valueOf(charSequence));
            case 8:
                return password(String.valueOf(charSequence));
            case 9:
                return carLicense(String.valueOf(charSequence));
            case 10:
                return bankCard(String.valueOf(charSequence));
            case 11:
                return ipv4(String.valueOf(charSequence));
            case 12:
                return ipv6(String.valueOf(charSequence));
            case 13:
                return firstMask(String.valueOf(charSequence));
            case 14:
                return clear();
            case 15:
                return clearToNull();
            default:
                return valueOf;
        }
    }

    public static String email(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return "";
        }
        int indexOf = cn.hutool.core.text.l.indexOf(str, '@');
        return indexOf <= 1 ? str : cn.hutool.core.text.l.hide(str, 1, indexOf);
    }

    public static String firstMask(String str) {
        return cn.hutool.core.text.l.isBlank(str) ? "" : cn.hutool.core.text.l.hide(str, 1, str.length());
    }

    public static String fixedPhone(String str) {
        return cn.hutool.core.text.l.isBlank(str) ? "" : cn.hutool.core.text.l.hide(str, 4, str.length() - 2);
    }

    public static String idCardNum(String str, int i8, int i9) {
        return (!cn.hutool.core.text.l.isBlank(str) && i8 + i9 <= str.length() && i8 >= 0 && i9 >= 0) ? cn.hutool.core.text.l.hide(str, i8, str.length() - i9) : "";
    }

    public static String ipv4(String str) {
        return cn.hutool.core.text.l.subBefore((CharSequence) str, '.', false) + ".*.*.*";
    }

    public static String ipv6(String str) {
        return cn.hutool.core.text.l.subBefore((CharSequence) str, ':', false) + ":*:*:*:*:*:*:*";
    }

    public static String mobilePhone(String str) {
        return cn.hutool.core.text.l.isBlank(str) ? "" : cn.hutool.core.text.l.hide(str, 3, str.length() - 4);
    }

    public static String password(String str) {
        return cn.hutool.core.text.l.isBlank(str) ? "" : cn.hutool.core.text.l.repeat('*', str.length());
    }

    public static Long userId() {
        return 0L;
    }
}
