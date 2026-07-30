package cn.hutool.core.lang;

import cn.hutool.core.exceptions.ValidateException;
import cn.hutool.core.util.IdcardUtil;
import com.baidu.ar.util.SystemInfoUtil;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class c1 {
    public static final Pattern GENERAL = n0.GENERAL;
    public static final Pattern NUMBERS = n0.NUMBERS;
    public static final Pattern GROUP_VAR = n0.GROUP_VAR;
    public static final Pattern IPV4 = n0.IPV4;
    public static final Pattern IPV6 = n0.IPV6;
    public static final Pattern MONEY = n0.MONEY;
    public static final Pattern EMAIL = n0.EMAIL;
    public static final Pattern EMAIL_WITH_CHINESE = n0.EMAIL_WITH_CHINESE;
    public static final Pattern MOBILE = n0.MOBILE;
    public static final Pattern CITIZEN_ID = n0.CITIZEN_ID;
    public static final Pattern ZIP_CODE = n0.ZIP_CODE;
    public static final Pattern BIRTHDAY = n0.BIRTHDAY;
    public static final Pattern URL = n0.URL;
    public static final Pattern URL_HTTP = n0.URL_HTTP;
    public static final Pattern GENERAL_WITH_CHINESE = n0.GENERAL_WITH_CHINESE;
    public static final Pattern UUID = n0.UUID;
    public static final Pattern UUID_SIMPLE = n0.UUID_SIMPLE;
    public static final Pattern PLATE_NUMBER = n0.PLATE_NUMBER;
    public static final Pattern CAR_VIN = n0.CAR_VIN;
    public static final Pattern CAR_DRIVING_LICENCE = n0.CAR_DRIVING_LICENCE;

    public static void checkIndexLimit(int i8, int i9) {
        if (i8 > (i9 + 1) * 10) {
            throw new ValidateException("Index [{}] is too large for size: [{}]", Integer.valueOf(i8), Integer.valueOf(i9));
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        return cn.hutool.core.util.e0.equal(obj, obj2);
    }

    public static boolean hasChinese(CharSequence charSequence) {
        return cn.hutool.core.util.p0.contains(cn.hutool.core.util.p0.RE_CHINESES, charSequence);
    }

    public static boolean hasNumber(CharSequence charSequence) {
        return cn.hutool.core.util.p0.contains(n0.NUMBERS, charSequence);
    }

    public static boolean isBetween(Number number, Number number2, Number number3) {
        q.notNull(number);
        q.notNull(number2);
        q.notNull(number3);
        double doubleValue = number.doubleValue();
        return doubleValue >= number2.doubleValue() && doubleValue <= number3.doubleValue();
    }

    public static boolean isBirthday(int i8, int i9, int i10) {
        int thisYear = cn.hutool.core.date.z.thisYear();
        if (i8 < 1900 || i8 > thisYear || i9 < 1 || i9 > 12 || i10 < 1 || i10 > 31) {
            return false;
        }
        if (i10 == 31 && (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11)) {
            return false;
        }
        return i9 != 2 || i10 < 29 || (i10 == 29 && cn.hutool.core.date.z.isLeapYear(i8));
    }

    public static boolean isCarDrivingLicence(CharSequence charSequence) {
        return isMatchRegex(CAR_DRIVING_LICENCE, charSequence);
    }

    public static boolean isCarVin(CharSequence charSequence) {
        return isMatchRegex(CAR_VIN, charSequence);
    }

    public static boolean isChinese(CharSequence charSequence) {
        return isMatchRegex(n0.CHINESES, charSequence);
    }

    public static boolean isChineseName(CharSequence charSequence) {
        return isMatchRegex(n0.CHINESE_NAME, charSequence);
    }

    public static boolean isCitizenId(CharSequence charSequence) {
        return IdcardUtil.isValidCard(String.valueOf(charSequence));
    }

    public static boolean isCreditCode(CharSequence charSequence) {
        return cn.hutool.core.util.q.isCreditCode(charSequence);
    }

    public static boolean isEmail(CharSequence charSequence) {
        return isMatchRegex(EMAIL, charSequence);
    }

    public static boolean isEmpty(Object obj) {
        return obj == null || ((obj instanceof String) && cn.hutool.core.text.l.isEmpty((String) obj));
    }

    public static boolean isFalse(boolean z7) {
        return !z7;
    }

    public static boolean isGeneral(CharSequence charSequence) {
        return isMatchRegex(GENERAL, charSequence);
    }

    public static boolean isGeneralWithChinese(CharSequence charSequence) {
        return isMatchRegex(GENERAL_WITH_CHINESE, charSequence);
    }

    public static boolean isHex(CharSequence charSequence) {
        return isMatchRegex(n0.HEX, charSequence);
    }

    public static boolean isIpv4(CharSequence charSequence) {
        return isMatchRegex(IPV4, charSequence);
    }

    public static boolean isIpv6(CharSequence charSequence) {
        return isMatchRegex(IPV6, charSequence);
    }

    public static boolean isLetter(CharSequence charSequence) {
        return cn.hutool.core.text.l.isAllCharMatch(charSequence, new d0() { // from class: cn.hutool.core.lang.b1
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                return Character.isLetter(((Character) obj).charValue());
            }
        });
    }

    public static boolean isLowerCase(CharSequence charSequence) {
        return cn.hutool.core.text.l.isAllCharMatch(charSequence, new d0() { // from class: cn.hutool.core.lang.z0
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                return Character.isLowerCase(((Character) obj).charValue());
            }
        });
    }

    public static boolean isMac(CharSequence charSequence) {
        return isMatchRegex(n0.MAC_ADDRESS, charSequence);
    }

    public static boolean isMatchRegex(Pattern pattern, CharSequence charSequence) {
        return cn.hutool.core.util.p0.isMatch(pattern, charSequence);
    }

    public static boolean isMobile(CharSequence charSequence) {
        return isMatchRegex(MOBILE, charSequence);
    }

    public static boolean isMoney(CharSequence charSequence) {
        return isMatchRegex(MONEY, charSequence);
    }

    public static boolean isNotEmpty(Object obj) {
        return !isEmpty(obj);
    }

    public static boolean isNotNull(Object obj) {
        return obj != null;
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isNumber(CharSequence charSequence) {
        return cn.hutool.core.util.d0.isNumber(charSequence);
    }

    public static boolean isPlateNumber(CharSequence charSequence) {
        return isMatchRegex(PLATE_NUMBER, charSequence);
    }

    public static boolean isTrue(boolean z7) {
        return z7;
    }

    public static boolean isUUID(CharSequence charSequence) {
        return isMatchRegex(UUID, charSequence) || isMatchRegex(UUID_SIMPLE, charSequence);
    }

    public static boolean isUpperCase(CharSequence charSequence) {
        return cn.hutool.core.text.l.isAllCharMatch(charSequence, new d0() { // from class: cn.hutool.core.lang.a1
            @Override // cn.hutool.core.lang.d0
            public final boolean match(Object obj) {
                return Character.isUpperCase(((Character) obj).charValue());
            }
        });
    }

    public static boolean isUrl(CharSequence charSequence) {
        if (cn.hutool.core.text.l.isBlank(charSequence)) {
            return false;
        }
        try {
            new URL(cn.hutool.core.text.l.str(charSequence));
            return true;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static boolean isWord(CharSequence charSequence) {
        return isMatchRegex(n0.WORD, charSequence);
    }

    public static boolean isZipCode(CharSequence charSequence) {
        return isMatchRegex(ZIP_CODE, charSequence);
    }

    public static void validateBetween(Number number, Number number2, Number number3, String str) {
        if (!isBetween(number, number2, number3)) {
            throw new ValidateException(str);
        }
    }

    public static <T extends CharSequence> T validateBirthday(T t7, String str) {
        if (isBirthday(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateCarDrivingLicence(T t7, String str) {
        if (isCarDrivingLicence(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateCarVin(T t7, String str) {
        if (isCarVin(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateChinese(T t7, String str) {
        if (isChinese(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateCitizenIdNumber(T t7, String str) {
        if (isCitizenId(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateEmail(T t7, String str) {
        if (isEmail(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T> T validateEmpty(T t7, String str) {
        if (isNotEmpty(t7)) {
            throw new ValidateException(str);
        }
        return t7;
    }

    public static Object validateEqual(Object obj, Object obj2, String str) {
        if (equal(obj, obj2)) {
            return obj;
        }
        throw new ValidateException(str);
    }

    public static boolean validateFalse(boolean z7, String str, Object... objArr) {
        if (isTrue(z7)) {
            throw new ValidateException(str, objArr);
        }
        return false;
    }

    public static <T extends CharSequence> T validateGeneral(T t7, String str) {
        if (isGeneral(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateGeneralWithChinese(T t7, String str) {
        if (isGeneralWithChinese(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateHex(T t7, String str) {
        if (isHex(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateIpv4(T t7, String str) {
        if (isIpv4(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateIpv6(T t7, String str) {
        if (isIpv6(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateLetter(T t7, String str) {
        if (isLetter(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateLowerCase(T t7, String str) {
        if (isLowerCase(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateMac(T t7, String str) {
        if (isMac(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateMatchRegex(String str, T t7, String str2) {
        if (isMatchRegex(str, t7)) {
            return t7;
        }
        throw new ValidateException(str2);
    }

    public static <T extends CharSequence> T validateMobile(T t7, String str) {
        if (isMobile(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateMoney(T t7, String str) {
        if (isMoney(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T> T validateNotEmpty(T t7, String str) {
        if (isEmpty(t7)) {
            throw new ValidateException(str);
        }
        return t7;
    }

    public static void validateNotEmptyAndEqual(Object obj, Object obj2, String str) {
        validateNotEmpty(obj, str);
        validateEqual(obj, obj2, str);
    }

    public static void validateNotEmptyAndNotEqual(Object obj, Object obj2, String str) {
        validateNotEmpty(obj, str);
        validateNotEqual(obj, obj2, str);
    }

    public static void validateNotEqual(Object obj, Object obj2, String str) {
        if (equal(obj, obj2)) {
            throw new ValidateException(str);
        }
    }

    public static <T> T validateNotNull(T t7, String str, Object... objArr) {
        if (isNull(t7)) {
            throw new ValidateException(str, objArr);
        }
        return t7;
    }

    public static <T> T validateNull(T t7, String str, Object... objArr) {
        if (isNotNull(t7)) {
            throw new ValidateException(str, objArr);
        }
        return null;
    }

    public static String validateNumber(String str, String str2) {
        if (isNumber(str)) {
            return str;
        }
        throw new ValidateException(str2);
    }

    public static <T extends CharSequence> T validatePlateNumber(T t7, String str) {
        if (isPlateNumber(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static boolean validateTrue(boolean z7, String str, Object... objArr) {
        if (isFalse(z7)) {
            throw new ValidateException(str, objArr);
        }
        return true;
    }

    public static <T extends CharSequence> T validateUUID(T t7, String str) {
        if (isUUID(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateUpperCase(T t7, String str) {
        if (isUpperCase(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateUrl(T t7, String str) {
        if (isUrl(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateWord(T t7, String str) {
        if (isWord(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static <T extends CharSequence> T validateZipCode(T t7, String str) {
        if (isZipCode(t7)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static boolean isEmail(CharSequence charSequence, boolean z7) {
        return z7 ? isMatchRegex(EMAIL_WITH_CHINESE, charSequence) : isEmail(charSequence);
    }

    public static boolean isGeneral(CharSequence charSequence, int i8, int i9) {
        if (i8 < 0) {
            i8 = 0;
        }
        String str = "^\\w{" + i8 + SystemInfoUtil.COMMA + i9 + "}$";
        if (i9 <= 0) {
            str = "^\\w{" + i8 + ",}$";
        }
        return isMatchRegex(str, charSequence);
    }

    public static boolean isMatchRegex(String str, CharSequence charSequence) {
        return cn.hutool.core.util.p0.isMatch(str, charSequence);
    }

    public static boolean isBirthday(CharSequence charSequence) {
        Matcher matcher = BIRTHDAY.matcher(charSequence);
        if (matcher.find()) {
            return isBirthday(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(5)));
        }
        return false;
    }

    public static <T extends CharSequence> T validateGeneral(T t7, int i8, int i9, String str) {
        if (isGeneral(t7, i8, i9)) {
            return t7;
        }
        throw new ValidateException(str);
    }

    public static boolean isGeneral(CharSequence charSequence, int i8) {
        return isGeneral(charSequence, i8, 0);
    }

    public static <T extends CharSequence> T validateGeneral(T t7, int i8, String str) {
        return (T) validateGeneral(t7, i8, 0, str);
    }
}
