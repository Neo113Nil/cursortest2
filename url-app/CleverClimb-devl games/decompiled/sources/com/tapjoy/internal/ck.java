package com.tapjoy.internal;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class ck {

    /* renamed from: a, reason: collision with root package name */
    private static cl f7888a = new cl();

    public static String a() {
        return "1.1.0-tapjoy";
    }

    public static boolean b() {
        return f7888a.f7889a;
    }

    public static boolean a(String str, Context context) {
        cl clVar = f7888a;
        Context applicationContext = context.getApplicationContext();
        cl.b(str);
        dp.a(applicationContext, "Application Context cannot be null");
        if (!(cl.a("1.1.0-tapjoy") == cl.a(str))) {
            return false;
        }
        if (!clVar.f7889a) {
            clVar.f7889a = true;
            dh a2 = dh.a();
            a2.f7944b = new cp(new Handler(), applicationContext, new cm(), a2);
            de.a().f7931a = applicationContext.getApplicationContext();
            dm.a(applicationContext);
            df.a().f7937a = applicationContext != null ? applicationContext.getApplicationContext() : null;
        }
        return true;
    }
}
