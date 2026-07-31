package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public final class no0 {
    public static Context a(Context context) {
        return c(context).b();
    }

    public static <T> T b(Context context, String str, lo0<IBinder, T> lo0Var) {
        try {
            return lo0Var.c(c(context).d(str));
        } catch (Exception e7) {
            throw new mo0(e7);
        }
    }

    private static DynamiteModule c(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.f2489b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e7) {
            throw new mo0(e7);
        }
    }
}
