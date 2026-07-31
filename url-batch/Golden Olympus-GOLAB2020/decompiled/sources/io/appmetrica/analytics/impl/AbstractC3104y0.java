package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3104y0 {
    public static W6 a(Handler handler, C3078x0 c3078x0) {
        return new W6(handler, c3078x0);
    }

    public static Pf a(Context context, W6 w6) {
        return new Pf(context, w6);
    }

    public static Ji a(Pf pf, Context context, ICommonExecutor iCommonExecutor) {
        C2793m0 c2793m0 = new C2793m0(context, iCommonExecutor, C3082x4.l().e());
        return new Ji(c2793m0, new Pn(new Gb()), new C2482a5(pf), new C2709ik(context, c2793m0));
    }

    public static Ol a(Context context, Ji ji, C2730jf c2730jf, Handler handler) {
        return new Ol(ji, new Wl(context, c2730jf), handler);
    }

    public static C3068wg a(Ji ji, C2730jf c2730jf, Handler handler) {
        return new C3068wg(ji, c2730jf, handler, c2730jf.s());
    }

    public static C3070wi a(Context context, Pf pf, Ji ji, Handler handler, Ol ol) {
        return new C3070wi(context, pf, ji, handler, ol);
    }
}
