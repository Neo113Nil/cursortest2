package com.aiming.mdt.a;

import android.app.Activity;
import android.text.TextUtils;
import com.aiming.mdt.adt.C0226;
import com.aiming.mdt.utils.C0276;
import com.aiming.mdt.utils.C0282;
import com.aiming.mdt.utils.C0290;

/* renamed from: com.aiming.mdt.a.ʽˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0170 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String[] f575 = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE"};

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m639(Activity activity, String str) {
        if (!C0290.m984(activity)) {
            C0282.m971("init error activity is not available");
            return "Activity is null or destroyed";
        }
        if (TextUtils.isEmpty(str)) {
            C0282.m971("init error appKey is empty");
            return "Empty AppKey";
        }
        if (C0226.m823(activity)) {
            C0282.m971("init error gdpr is rejected");
            return "gdpr rejected";
        }
        if (!C0276.m940(activity, f575)) {
            C0282.m971("init error permission is not granted");
            return "The required permission is not register on Manifest";
        }
        if (C0079.m244(activity)) {
            return "";
        }
        C0282.m971("init error network is not available");
        return "Network is not available,please check network";
    }
}
