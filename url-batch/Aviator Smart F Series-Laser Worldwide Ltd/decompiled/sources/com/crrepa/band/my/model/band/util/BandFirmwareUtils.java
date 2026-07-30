package com.crrepa.band.my.model.band.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class BandFirmwareUtils {
    private static final int DEFAULT_FIRMWARE_CODE = 170;
    private static final int FIRMWARE_TYPE_INDEX = 1;
    private static final int FIRMWARE_VERSION_INDEX = 2;
    private static final int FIRMWARE_VERSION_LENGTH = 3;
    private static final String FIRMWARE_VERSION_REGEX = "-";
    private static final String LETTER_REGEX = "[A-Za-z]+";
    private static final String NUMBER_REGEX = "\\d+";

    private BandFirmwareUtils() {
    }

    public static String getFirmwareType(String str) {
        String[] splitFirmwareVersion = splitFirmwareVersion(str, "-");
        if (splitFirmwareVersion == null || splitFirmwareVersion.length < 3) {
            return null;
        }
        String str2 = splitFirmwareVersion[1];
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2.substring(0, str2.length() - 1);
    }

    public static int getFirmwareVersionCode(String str) {
        String[] splitFirmwareVersion = splitFirmwareVersion(str, "-");
        int i8 = DEFAULT_FIRMWARE_CODE;
        if (splitFirmwareVersion != null && splitFirmwareVersion.length >= 3) {
            Matcher matcher = Pattern.compile(NUMBER_REGEX).matcher(splitFirmwareVersion[2]);
            ArrayList arrayList = new ArrayList();
            while (matcher.find()) {
                String group = matcher.group(0);
                Objects.requireNonNull(group);
                arrayList.add(Integer.valueOf(group));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i8 = (i8 * 10) + ((Integer) it.next()).intValue();
            }
        }
        return i8;
    }

    private static String[] splitFirmwareVersion(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(str2);
    }
}
