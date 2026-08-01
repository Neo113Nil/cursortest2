package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: AppSigning.java */
/* loaded from: classes.dex */
public class vG {
    private static HashMap<String, ArrayList<String>> pvs = new HashMap<>();

    public static ArrayList<String> pvs(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (pvs.get(str) != null) {
                return pvs.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : icD(context, packageName)) {
                    String str2 = "error!";
                    if ("MD5".equals(str)) {
                        str2 = pvs(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        str2 = pvs(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = pvs(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception e) {
                Ju.icD(e.toString());
            }
            pvs.put(str, arrayList);
        }
        return arrayList;
    }

    public static String pvs(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> pvs2 = pvs(context, "SHA1");
        if (pvs2 != null && pvs2.size() != 0) {
            for (int i = 0; i < pvs2.size(); i++) {
                sb.append(pvs2.get(i));
                if (i < pvs2.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static Signature[] icD(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e) {
            Ju.icD(e.toString());
            return null;
        }
    }

    private static String pvs(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] digest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception e) {
            Ju.icD(e.toString());
            return "error!";
        }
    }
}
