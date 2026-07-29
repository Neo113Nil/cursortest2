package com.dancingbogo.skyrolline.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: ComponentUtil.java */
/* loaded from: classes2.dex */
public class e {
    public static boolean a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(String str, Context context) {
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setPackage("com.android.vending");
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            } else {
                intent.addFlags(524288);
            }
            intent.setData(Uri.parse(str));
            return a(context, intent);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
