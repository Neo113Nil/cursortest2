package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.kb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740kb {

    /* renamed from: a, reason: collision with root package name */
    public final C0602f2 f12214a = new C0602f2();

    /* renamed from: b, reason: collision with root package name */
    public final C0735k6 f12215b = new C0735k6();

    /* renamed from: c, reason: collision with root package name */
    public C1141zn f12216c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12217d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12218e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, Ta ta) {
        if (this.f12218e) {
            return;
        }
        d3.o.a0(this.f12215b.f12197a, new Fa[]{this.f12214a.a(context, appMetricaConfig, ta)});
        this.f12218e = true;
    }

    public final synchronized void b() {
        if (this.f12217d) {
            return;
        }
        C0735k6 c0735k6 = this.f12215b;
        ArrayList arrayList = C0501b4.l().f11463i.f12381a;
        ArrayList arrayList2 = new ArrayList(d3.k.Y(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c0735k6.f12197a.addAll(arrayList2);
        this.f12217d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f12216c != null) {
                return;
            }
            O1 o12 = new O1(this.f12215b);
            this.f12216c = new C1141zn(o12);
            C1115yn c1115yn = new C1115yn();
            c1115yn.f13086a.add(o12);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c1115yn.f13086a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(c1115yn);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f12215b.f12197a.clear();
        this.f12217d = false;
        this.f12218e = false;
    }
}
