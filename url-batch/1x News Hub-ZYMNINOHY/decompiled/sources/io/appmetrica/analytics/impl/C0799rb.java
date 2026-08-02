package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799rb {

    /* renamed from: a, reason: collision with root package name */
    public final C0713o2 f8226a = new C0713o2();

    /* renamed from: b, reason: collision with root package name */
    public final C0794r6 f8227b = new C0794r6();

    /* renamed from: c, reason: collision with root package name */
    public Bn f8228c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8229d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8230e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC0360ab interfaceC0360ab) {
        if (this.f8230e) {
            return;
        }
        c2.k.P(this.f8227b.f8209a, new Ma[]{this.f8226a.a(context, appMetricaConfig, interfaceC0360ab)});
        this.f8230e = true;
    }

    public final synchronized void b() {
        if (this.f8229d) {
            return;
        }
        C0794r6 c0794r6 = this.f8227b;
        ArrayList arrayList = C0585j4.l().f7599i.f8106a;
        ArrayList arrayList2 = new ArrayList(c2.g.N(arrayList));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c0794r6.f8209a.addAll(arrayList2);
        this.f8229d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f8228c != null) {
                return;
            }
            X1 x12 = new X1(this.f8227b);
            this.f8228c = new Bn(x12);
            An an = new An();
            an.f5792a.add(x12);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                an.f5792a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(an);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f8227b.f8209a.clear();
        this.f8229d = false;
        this.f8230e = false;
    }
}
