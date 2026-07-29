package com.cmplay.base.util;

import android.content.Context;

/* compiled from: PromotionSdkUtil.java */
/* loaded from: classes.dex */
public class w {
    public static void a(Context context) {
        try {
            Class.forName("com.cmplay.internalpush.f").getMethod("init", Context.class).invoke(null, context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
