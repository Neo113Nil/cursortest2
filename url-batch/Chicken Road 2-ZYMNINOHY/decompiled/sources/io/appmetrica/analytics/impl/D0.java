package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public abstract class D0 {
    public static B6 a(Handler handler, C0 c02) {
        return new B6(handler, c02);
    }

    public static Bf a(Context context, B6 b6) {
        return new Bf(context, b6);
    }

    public static C1058wi a(Bf bf, Context context, ICommonExecutor iCommonExecutor) {
        C0859p0 c0859p0 = new C0859p0(context, iCommonExecutor);
        return new C1058wi(c0859p0, new Sn(new C0766lb()), new F4(bf), new Yj(context, c0859p0));
    }

    public static Ol a(Context context, C1058wi c1058wi, Ve ve, Handler handler) {
        return new Ol(c1058wi, new Wl(context, ve), handler);
    }

    public static C0719jg a(C1058wi c1058wi, Ve ve, Handler handler) {
        return new C0719jg(c1058wi, ve, handler, ve.s());
    }

    public static C0721ji a(Context context, Bf bf, C1058wi c1058wi, Handler handler, Ol ol) {
        return new C0721ji(context, bf, c1058wi, handler, ol);
    }

    public static C0536cd a(Context context) {
        return new C0536cd(C0501b4.l().f11457c.a(), C0501b4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
