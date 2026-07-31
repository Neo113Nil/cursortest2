package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes3.dex */
public abstract class D0 {
    public static C6 a(Handler handler, C0 c0) {
        return new C6(handler, c0);
    }

    public static Cf a(Context context, C6 c6) {
        return new Cf(context, c6);
    }

    public static C0633xi a(Cf cf, Context context, ICommonExecutor iCommonExecutor) {
        C0416p0 c0416p0 = new C0416p0(context, iCommonExecutor);
        return new C0633xi(c0416p0, new Tn(new C0352mb()), new G4(cf), new Zj(context, c0416p0));
    }

    public static Pl a(Context context, C0633xi c0633xi, We we, Handler handler) {
        return new Pl(c0633xi, new Xl(context, we), handler);
    }

    public static C0306kg a(C0633xi c0633xi, We we, Handler handler) {
        return new C0306kg(c0633xi, we, handler, we.s());
    }

    public static C0308ki a(Context context, Cf cf, C0633xi c0633xi, Handler handler, Pl pl) {
        return new C0308ki(context, cf, c0633xi, handler, pl);
    }

    public static C0123dd a(Context context) {
        return new C0123dd(C0088c4.l().c.a(), C0088c4.l().b(context), "client_modules", new SystemTimeProvider());
    }
}
