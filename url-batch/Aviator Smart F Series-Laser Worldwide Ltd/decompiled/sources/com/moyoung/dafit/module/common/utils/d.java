package com.moyoung.dafit.module.common.utils;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes4.dex */
public class d {

    @SuppressLint({"StaticFieldLeak"})
    private static Context context;

    public static Context get() {
        return context.getApplicationContext();
    }

    public static void setContext(Context context2) {
        context = context2;
    }
}
