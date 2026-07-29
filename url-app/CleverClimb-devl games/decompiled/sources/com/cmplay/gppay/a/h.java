package com.cmplay.gppay.a;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public class h {
    public static boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            return true;
        }
        Log.e("IABUtil/Security", "Purchase verification failed: missing data.");
        return false;
    }
}
