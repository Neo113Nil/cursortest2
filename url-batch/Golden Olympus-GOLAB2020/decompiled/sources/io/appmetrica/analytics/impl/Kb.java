package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: classes3.dex */
public final class Kb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f37879a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f37880b;

    public Kb(Handler handler, V2 v22) {
        this.f37879a = new WeakReference(handler);
        this.f37880b = new WeakReference(v22);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f37879a.get();
        V2 v22 = (V2) this.f37880b.get();
        if (handler == null || v22 == null) {
            return;
        }
        boolean f4 = v22.f38392b.f();
        if (!f4) {
            PublicLogger publicLogger = v22.f38393c;
            Set set = R9.f38186a;
            EnumC3063wb enumC3063wb = EnumC3063wb.EVENT_TYPE_UNDEFINED;
            C2694i4 c2694i4 = new C2694i4("", "", 3, 0, publicLogger);
            Ji ji = v22.f38398h;
            Sh sh = v22.f38392b;
            ji.getClass();
            ji.a(Ji.a(c2694i4, sh), sh, 1, null);
        }
        if (f4) {
            return;
        }
        Jb.a(handler, v22, this);
    }
}
