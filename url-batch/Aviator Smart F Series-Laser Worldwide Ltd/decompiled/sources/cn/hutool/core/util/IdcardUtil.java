package cn.hutool.core.util;

import androidx.exifinterface.media.ExifInterface;
import cn.hutool.core.date.DateTime;
import com.realsil.sdk.dfu.DfuConstants;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class IdcardUtil {
    private static final int CHINA_ID_MAX_LENGTH = 18;
    private static final int CHINA_ID_MIN_LENGTH = 15;
    private static final Map<String, String> CITY_CODES;
    private static final int[] POWER = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
    private static final Map<Character, Integer> TW_FIRST_CODE;

    public static class Idcard implements Serializable {
        private static final long serialVersionUID = 1;
        private final int age;
        private final DateTime birthDate;
        private final String cityCode;
        private final Integer gender;
        private final String provinceCode;

        public Idcard(String str) {
            this.provinceCode = IdcardUtil.getProvinceCodeByIdCard(str);
            this.cityCode = IdcardUtil.getCityCodeByIdCard(str);
            this.birthDate = IdcardUtil.getBirthDate(str);
            this.gender = Integer.valueOf(IdcardUtil.getGenderByIdCard(str));
            this.age = IdcardUtil.getAgeByIdCard(str);
        }

        public int getAge() {
            return this.age;
        }

        public DateTime getBirthDate() {
            return this.birthDate;
        }

        public String getCityCode() {
            return this.cityCode;
        }

        public Integer getGender() {
            return this.gender;
        }

        public String getProvince() {
            return (String) IdcardUtil.CITY_CODES.get(this.provinceCode);
        }

        public String getProvinceCode() {
            return this.provinceCode;
        }

        public String toString() {
            return "Idcard{provinceCode='" + this.provinceCode + "', cityCode='" + this.cityCode + "', birthDate=" + this.birthDate + ", gender=" + this.gender + ", age=" + this.age + '}';
        }
    }

    static {
        HashMap hashMap = new HashMap();
        CITY_CODES = hashMap;
        HashMap hashMap2 = new HashMap();
        TW_FIRST_CODE = hashMap2;
        hashMap.put("11", "北京");
        hashMap.put("12", "天津");
        hashMap.put("13", "河北");
        hashMap.put("14", "山西");
        hashMap.put("15", "内蒙古");
        hashMap.put("21", "辽宁");
        hashMap.put("22", "吉林");
        hashMap.put("23", "黑龙江");
        hashMap.put("31", "上海");
        hashMap.put("32", "江苏");
        hashMap.put("33", "浙江");
        hashMap.put("34", "安徽");
        hashMap.put("35", "福建");
        hashMap.put("36", "江西");
        hashMap.put("37", "山东");
        hashMap.put("41", "河南");
        hashMap.put("42", "湖北");
        hashMap.put("43", "湖南");
        hashMap.put("44", "广东");
        hashMap.put("45", "广西");
        hashMap.put("46", "海南");
        hashMap.put("50", "重庆");
        hashMap.put("51", "四川");
        hashMap.put("52", "贵州");
        hashMap.put("53", "云南");
        hashMap.put("54", "西藏");
        hashMap.put("61", "陕西");
        hashMap.put("62", "甘肃");
        hashMap.put("63", "青海");
        hashMap.put("64", "宁夏");
        hashMap.put("65", "新疆");
        hashMap.put("71", "台湾");
        hashMap.put("81", "香港");
        hashMap.put("82", "澳门");
        hashMap.put("83", "台湾");
        hashMap.put("91", "国外");
        hashMap2.put('A', 10);
        hashMap2.put('B', 11);
        hashMap2.put('C', 12);
        hashMap2.put('D', 13);
        hashMap2.put('E', 14);
        hashMap2.put('F', 15);
        hashMap2.put('G', 16);
        hashMap2.put('H', 17);
        hashMap2.put('J', 18);
        hashMap2.put('K', 19);
        hashMap2.put(Character.valueOf(org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_RANDOM_LT), 20);
        hashMap2.put('M', 21);
        hashMap2.put('N', 22);
        hashMap2.put('P', 23);
        hashMap2.put('Q', 24);
        hashMap2.put(Character.valueOf(org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_RANDOM_REGULAR), 25);
        hashMap2.put('S', 26);
        hashMap2.put('T', 27);
        hashMap2.put(Character.valueOf(org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_RANDOM_UT), 28);
        hashMap2.put('V', 29);
        hashMap2.put('X', 30);
        hashMap2.put('Y', 31);
        hashMap2.put('W', 32);
        hashMap2.put(Character.valueOf(org.bouncycastle.pqc.math.linearalgebra.k.MATRIX_TYPE_ZERO), 33);
        hashMap2.put('I', 34);
        hashMap2.put('O', 35);
    }

    public static String convert15To18(String str) {
        if (str.length() != 15 || !p0.isMatch(cn.hutool.core.lang.n0.NUMBERS, str)) {
            return null;
        }
        int year = cn.hutool.core.date.z.year(cn.hutool.core.date.z.parse(str.substring(6, 12), "yyMMdd"));
        if (year > 2000) {
            year -= 100;
        }
        StringBuilder builder = c1.builder();
        builder.append((CharSequence) str, 0, 6);
        builder.append(year);
        builder.append(str.substring(8));
        builder.append(getCheckCode18(builder.toString()));
        return builder.toString();
    }

    public static String convert18To15(String str) {
        if (!cn.hutool.core.text.l.isNotBlank(str) || !isValidCard18(str)) {
            return str;
        }
        return str.substring(0, 6) + str.substring(8, str.length() - 1);
    }

    public static int getAgeByIdCard(String str) {
        return getAgeByIdCard(str, cn.hutool.core.date.z.date());
    }

    public static String getBirth(String str) {
        cn.hutool.core.lang.q.notBlank(str, "id card must be not blank!", new Object[0]);
        int length = str.length();
        if (length < 15) {
            return null;
        }
        if (length == 15) {
            str = convert15To18(str);
        }
        Objects.requireNonNull(str);
        return str.substring(6, 14);
    }

    public static String getBirthByIdCard(String str) {
        return getBirth(str);
    }

    public static DateTime getBirthDate(String str) {
        String birthByIdCard = getBirthByIdCard(str);
        if (birthByIdCard == null) {
            return null;
        }
        return cn.hutool.core.date.z.parse(birthByIdCard, cn.hutool.core.date.d.PURE_DATE_FORMAT);
    }

    private static char getCheckCode18(String str) {
        return getCheckCode18(getPowerSum(str.toCharArray()));
    }

    public static String getCityCodeByIdCard(String str) {
        int length = str.length();
        if (length == 15 || length == 18) {
            return str.substring(0, 4);
        }
        return null;
    }

    public static Short getDayByIdCard(String str) {
        int length = str.length();
        if (length < 15) {
            return null;
        }
        if (length == 15) {
            str = convert15To18(str);
        }
        Objects.requireNonNull(str);
        return Short.valueOf(str.substring(12, 14));
    }

    public static String getDistrictCodeByIdCard(String str) {
        int length = str.length();
        if (length == 15 || length == 18) {
            return str.substring(0, 6);
        }
        return null;
    }

    public static int getGenderByIdCard(String str) {
        cn.hutool.core.lang.q.notBlank(str);
        int length = str.length();
        if (length != 15 && length != 18) {
            throw new IllegalArgumentException("ID Card length must be 15 or 18");
        }
        if (length == 15) {
            str = convert15To18(str);
        }
        Objects.requireNonNull(str);
        return str.charAt(16) % 2 != 0 ? 1 : 0;
    }

    public static Idcard getIdcardInfo(String str) {
        return new Idcard(str);
    }

    public static Short getMonthByIdCard(String str) {
        int length = str.length();
        if (length < 15) {
            return null;
        }
        if (length == 15) {
            str = convert15To18(str);
        }
        Objects.requireNonNull(str);
        return Short.valueOf(str.substring(10, 12));
    }

    private static int getPowerSum(char[] cArr) {
        if (POWER.length != cArr.length) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < cArr.length; i9++) {
            i8 += Integer.parseInt(String.valueOf(cArr[i9])) * POWER[i9];
        }
        return i8;
    }

    public static String getProvinceByIdCard(String str) {
        String provinceCodeByIdCard = getProvinceCodeByIdCard(str);
        if (cn.hutool.core.text.l.isNotBlank(provinceCodeByIdCard)) {
            return CITY_CODES.get(provinceCodeByIdCard);
        }
        return null;
    }

    public static String getProvinceCodeByIdCard(String str) {
        int length = str.length();
        if (length == 15 || length == 18) {
            return str.substring(0, 2);
        }
        return null;
    }

    public static Short getYearByIdCard(String str) {
        int length = str.length();
        if (length < 15) {
            return null;
        }
        if (length == 15) {
            str = convert15To18(str);
        }
        Objects.requireNonNull(str);
        return Short.valueOf(str.substring(6, 10));
    }

    public static String hide(String str, int i8, int i9) {
        return cn.hutool.core.text.l.hide(str, i8, i9);
    }

    public static boolean isValidCard(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return false;
        }
        int length = str.length();
        if (length == 10) {
            String[] isValidCard10 = isValidCard10(str);
            return isValidCard10 != null && "true".equals(isValidCard10[2]);
        }
        if (length == 15) {
            return isValidCard15(str);
        }
        if (length != 18) {
            return false;
        }
        return isValidCard18(str);
    }

    public static String[] isValidCard10(String str) {
        if (cn.hutool.core.text.l.isBlank(str)) {
            return null;
        }
        String[] strArr = new String[3];
        String replaceAll = str.replaceAll("[()]", "");
        if (replaceAll.length() != 8 && replaceAll.length() != 9 && str.length() != 10) {
            return null;
        }
        if (str.matches("^[a-zA-Z][0-9]{9}$")) {
            strArr[0] = "台湾";
            char charAt = str.charAt(1);
            if ('1' == charAt) {
                strArr[1] = "M";
            } else {
                if ('2' != charAt) {
                    strArr[1] = "N";
                    strArr[2] = "false";
                    return strArr;
                }
                strArr[1] = "F";
            }
            strArr[2] = isValidTWCard(str) ? "true" : "false";
        } else if (str.matches("^[157][0-9]{6}\\(?[0-9A-Z]\\)?$")) {
            strArr[0] = "澳门";
            strArr[1] = "N";
            strArr[2] = "true";
        } else {
            if (!str.matches("^[A-Z]{1,2}[0-9]{6}\\(?[0-9A]\\)?$")) {
                return null;
            }
            strArr[0] = "香港";
            strArr[1] = "N";
            strArr[2] = isValidHKCard(str) ? "true" : "false";
        }
        return strArr;
    }

    public static boolean isValidCard15(String str) {
        if (str == null || 15 != str.length() || !p0.isMatch(cn.hutool.core.lang.n0.NUMBERS, str)) {
            return false;
        }
        if (CITY_CODES.get(str.substring(0, 2)) == null) {
            return false;
        }
        return cn.hutool.core.lang.c1.isBirthday("19" + str.substring(6, 12));
    }

    public static boolean isValidCard18(String str) {
        return isValidCard18(str, true);
    }

    public static boolean isValidHKCard(String str) {
        int upperCase;
        String replaceAll = str.replaceAll("[()]", "");
        if (replaceAll.length() == 9) {
            upperCase = ((Character.toUpperCase(replaceAll.charAt(0)) - '7') * 9) + ((Character.toUpperCase(replaceAll.charAt(1)) - '7') * 8);
            replaceAll = replaceAll.substring(1, 9);
        } else {
            upperCase = ((Character.toUpperCase(replaceAll.charAt(0)) - '7') * 8) + DfuConstants.PROGRESS_HAND_OVER_PROCESSING;
        }
        int i8 = 7;
        String substring = replaceAll.substring(1, 7);
        String substring2 = replaceAll.substring(7, 8);
        for (char c8 : substring.toCharArray()) {
            upperCase += Integer.parseInt(String.valueOf(c8)) * i8;
            i8--;
        }
        return (ExifInterface.GPS_MEASUREMENT_IN_PROGRESS.equalsIgnoreCase(substring2) ? upperCase + 10 : upperCase + Integer.parseInt(substring2)) % 11 == 0;
    }

    public static boolean isValidTWCard(String str) {
        Integer num;
        if (str == null || str.length() != 10 || (num = TW_FIRST_CODE.get(Character.valueOf(str.charAt(0)))) == null) {
            return false;
        }
        int intValue = (num.intValue() / 10) + ((num.intValue() % 10) * 9);
        int i8 = 8;
        for (char c8 : str.substring(1, 9).toCharArray()) {
            intValue += Integer.parseInt(String.valueOf(c8)) * i8;
            i8--;
        }
        int i9 = intValue % 10;
        return (i9 == 0 ? 0 : 10 - i9) == Integer.parseInt(str.substring(9, 10));
    }

    public static int getAgeByIdCard(String str, Date date) {
        return cn.hutool.core.date.z.age(cn.hutool.core.date.z.parse(getBirthByIdCard(str), cn.hutool.core.date.d.PURE_DATE_PATTERN), date);
    }

    public static boolean isValidCard18(String str, boolean z7) {
        if (str == null || 18 != str.length()) {
            return false;
        }
        if (CITY_CODES.get(str.substring(0, 2)) == null || !cn.hutool.core.lang.c1.isBirthday(str.substring(6, 14))) {
            return false;
        }
        String substring = str.substring(0, 17);
        if (p0.isMatch(cn.hutool.core.lang.n0.NUMBERS, substring)) {
            return k.equals(getCheckCode18(substring), str.charAt(17), z7);
        }
        return false;
    }

    private static char getCheckCode18(int i8) {
        switch (i8 % 11) {
            case 0:
                return '1';
            case 1:
                return '0';
            case 2:
                return 'X';
            case 3:
                return '9';
            case 4:
                return '8';
            case 5:
                return '7';
            case 6:
                return '6';
            case 7:
                return '5';
            case 8:
                return '4';
            case 9:
                return '3';
            case 10:
                return '2';
            default:
                return ' ';
        }
    }
}
