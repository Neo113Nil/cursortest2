package com.xsj.crasheye;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
class StacktraceHash {
    private static String guidRegex = "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[34][0-9a-fA-F]{3}-[89ab][0-9a-fA-F]{3}-[0-9a-fA-F]{12}";
    private static String hexRegex = "0[xX][0-9a-fA-F]+";

    StacktraceHash() {
    }

    public static final HashMap<String, String> manipulateStacktrace(String str, String str2) {
        String str3;
        if (str == null || str2 == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String[] split = str2.split("\n\t");
        if (split.length == 1) {
            split = str2.split("\n");
        }
        String removeFirstDate = removeFirstDate(split[0]);
        try {
            str3 = removeFirstDate.substring(0, removeFirstDate.indexOf(":"));
        } catch (Exception unused) {
            str3 = removeFirstDate;
        }
        hashMap.put(TJAdUnitConstants.String.MESSAGE, removeFirstDate.replaceAll("\n", " ").replaceAll("Caused by:", ""));
        hashMap.put("klass", str3);
        if (str.contains(".")) {
            String[] split2 = str.split("\\.");
            if (split2[0].length() > 3) {
                str = split2[0];
            } else {
                str = split2[1];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str4 : split) {
            if (str4.indexOf(str) != -1 && str4.indexOf(str) <= 20) {
                sb.append(str4);
                sb.append("\n");
            }
        }
        if (sb.length() == 0) {
            for (String str5 : split) {
                if (str5.length() > 10 && str5.trim().startsWith("at ") && !str5.contains("...") && !str5.contains(".java.") && !str5.substring(0, 10).contains(TapjoyConstants.TJC_DEVICE_PLATFORM_TYPE) && !str5.contains("org.apache") && !str5.contains("org.acra") && !str5.contains("dalvik") && !str5.contains(".acra.")) {
                    sb.append(str5);
                    sb.append("\n");
                }
            }
        }
        if (sb.length() == 0) {
            for (String str6 : split) {
                if (str6.length() > 10 && str6.trim().startsWith("at ") && (str6.contains(".java") || str6.contains("Unknown"))) {
                    sb.append(str6);
                    sb.append("\n");
                }
            }
        }
        String str7 = sb.toString().split("\n")[0];
        hashMap.put("library", str7.contains(str) ? null : str7.split("\\.")[1]);
        hashMap.put("where", str7.contains("(") ? str7.substring(str7.indexOf("(") + 1, str7.indexOf(")")) : "Unknown");
        String replaceAll = sb.toString().replaceAll("@\\w+", "").replaceAll(hexRegex, "").replaceAll(guidRegex, "").replaceAll("$\\w+", "");
        if (!str7.contains(".java:")) {
            replaceAll = replaceAll.replace(str7, str7.replaceAll("\\d+", ""));
        }
        hashMap.put("errorHash", md5(replaceAll));
        return hashMap;
    }

    public static String getMD5ForJavascriptError(String str) {
        return md5(str.replaceAll("@\\w+", "").replaceAll(hexRegex, "").replaceAll(guidRegex, "").replaceAll("$\\w+", ""));
    }

    private static String md5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes());
            String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = "0" + bigInteger;
            }
            return bigInteger;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String removeFirstDate(String str) {
        if (str.contains("\n")) {
            return Pattern.compile("[\\d]{2}:[\\d]{2}:[\\d]{2}").matcher(str).find() ? str.split("\\n")[1] : str;
        }
        return str;
    }
}
