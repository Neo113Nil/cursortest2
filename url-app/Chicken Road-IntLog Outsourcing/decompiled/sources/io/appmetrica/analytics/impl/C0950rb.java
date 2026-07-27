package io.appmetrica.analytics.impl;

import android.content.Context;
import g4.AbstractC0465j;
import g4.AbstractC0467l;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950rb {

    /* renamed from: a, reason: collision with root package name */
    public final C0864o2 f9161a = new C0864o2();

    /* renamed from: b, reason: collision with root package name */
    public final C0945r6 f9162b = new C0945r6();

    /* renamed from: c, reason: collision with root package name */
    public Bn f9163c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9164d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9165e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC0511ab interfaceC0511ab) {
        if (this.f9165e) {
            return;
        }
        AbstractC0465j.E0(this.f9162b.f9143a, new Ma[]{this.f9161a.a(context, appMetricaConfig, interfaceC0511ab)});
        this.f9165e = true;
    }

    public final synchronized void b() {
        if (this.f9164d) {
            return;
        }
        C0945r6 c0945r6 = this.f9162b;
        ArrayList arrayList = C0736j4.l().f8490i.f9034a;
        ArrayList arrayList2 = new ArrayList(AbstractC0467l.D0(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c0945r6.f9143a.addAll(arrayList2);
        this.f9164d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f9163c != null) {
                return;
            }
            X1 x12 = new X1(this.f9162b);
            this.f9163c = new Bn(x12);
            An an = new An();
            an.f6572a.add(x12);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                an.f6572a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(an);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f9162b.f9143a.clear();
        this.f9164d = false;
        this.f9165e = false;
    }
}
