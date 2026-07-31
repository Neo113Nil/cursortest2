package com.chartboost.sdk.impl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.tasks.Task;

/* loaded from: classes10.dex */
public class l1 {
    public static l1 a = new l1();

    public static l1 b() {
        return a;
    }

    public Task a(Context context) {
        try {
            return AppSet.getClient(context).getAppSetIdInfo();
        } catch (Exception e) {
            xb.b("Cannot retrieve appSetId client", e);
            return null;
        }
    }

    public boolean a(CharSequence charSequence) {
        return TextUtils.isEmpty(charSequence);
    }

    public String a() {
        return Build.VERSION.RELEASE;
    }
}
