package com.xsj.crasheye;

import android.content.Context;
import android.content.SharedPreferences;
import com.tapjoy.TapjoyConstants;
import com.umeng.commonsdk.proguard.ao;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Random;

/* loaded from: classes2.dex */
class UidManager {
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int UID_CORRECT_LENTH = 32;
    private static final String UID_ERROR_ID = "12345678901234567890123456789012";
    private static final String UID_FIELD = "UID_FIELD";
    private static final String UID_NOSAVED = "UID_NOSAVED";
    private static final String UID_PREFERENCES = "UIDPREFERENCES";

    UidManager() {
    }

    protected static final String getUid(Context context) {
        SharedPreferences sharedPreferences;
        if (Properties.UID != null && Properties.UID.length() == 32) {
            return Properties.UID;
        }
        String str = UID_ERROR_ID;
        if (context != null && (sharedPreferences = context.getSharedPreferences(UID_PREFERENCES, 0)) != null) {
            str = sharedPreferences.getString(UID_FIELD, UID_NOSAVED);
        }
        if (!str.equals(UID_NOSAVED) && !str.equals(UID_ERROR_ID)) {
            return str;
        }
        String generateUid = generateUid();
        saveUid(context, generateUid);
        return generateUid;
    }

    protected static boolean saveUid(Context context, String str) {
        if (str == null || str.length() != 32) {
            return false;
        }
        Properties.UID = str;
        SharedPreferences sharedPreferences = context.getSharedPreferences(UID_PREFERENCES, 0);
        if (sharedPreferences != null) {
            return sharedPreferences.edit().putString(UID_FIELD, str).commit();
        }
        return false;
    }

    private static final String generateUid() {
        byte[] bArr;
        String l = Long.valueOf(new Date().getTime()).toString();
        try {
            bArr = MessageDigest.getInstance("MD5").digest((String.valueOf(l) + new Object().toString() + String.valueOf(System.nanoTime()) + Integer.toString((int) (new Random(System.currentTimeMillis()).nextDouble() * 65535.0d)) + TapjoyConstants.TJC_ANDROID_ID).getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            bArr = null;
            return new String(encodeHex(bArr));
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            bArr = null;
            return new String(encodeHex(bArr));
        }
        return new String(encodeHex(bArr));
    }

    private static final char[] encodeHex(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            cArr[i] = DIGITS[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = DIGITS[bArr[i2] & ao.m];
        }
        return cArr;
    }
}
