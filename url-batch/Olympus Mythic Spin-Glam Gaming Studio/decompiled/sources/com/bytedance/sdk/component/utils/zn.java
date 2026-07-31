package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class zn {
    private static HashMap<String, ArrayList<String>> zmn = new HashMap<>();

    public static ArrayList<String> zmn(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (zmn.get(str) != null) {
                return zmn.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : fs(context, packageName)) {
                    String str2 = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        str2 = zmn(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        str2 = zmn(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = zmn(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception unused) {
            }
            zmn.put(str, arrayList);
        }
        return arrayList;
    }

    public static String zmn(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> zmn2 = zmn(context, "SHA1");
        if (zmn2 != null && zmn2.size() != 0) {
            for (int i = 0; i < zmn2.size(); i++) {
                sb.append(zmn2.get(i));
                if (i < zmn2.size() - 1) {
                    sb.append(StringUtils.COMMA);
                }
            }
        }
        return sb.toString();
    }

    private static Signature[] fs(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String zmn(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] digest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception unused) {
            return "error!";
        }
    }
}
