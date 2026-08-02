package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public abstract class B0 {
    public static I6 a(Handler handler, A0 a02) {
        return new I6(handler, a02);
    }

    public static Gf a(Context context, I6 i6) {
        return new Gf(context, i6);
    }

    public static Bi a(Gf gf, Context context, ICommonExecutor iCommonExecutor) {
        C0737p0 c0737p0 = new C0737p0(context, iCommonExecutor, C0585j4.l().e());
        return new Bi(c0737p0, new Un(new C0825sb()), new M4(gf), new C0447dk(context, c0737p0));
    }

    public static Sl a(Context context, Bi bi, C0364af c0364af, Handler handler) {
        return new Sl(bi, new C0371am(context, c0364af), handler);
    }

    public static C0727og a(Bi bi, C0364af c0364af, Handler handler) {
        return new C0727og(bi, c0364af, handler, c0364af.s());
    }

    public static C0729oi a(Context context, Gf gf, Bi bi, Handler handler, Sl sl) {
        return new C0729oi(context, gf, bi, handler, sl);
    }

    public static C0594jd a(Context context) {
        return new C0594jd(C0585j4.l().f7594c.a(), C0585j4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
