package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class Fb {

    /* renamed from: a, reason: collision with root package name */
    public final C2769l2 f37530a = new C2769l2();

    /* renamed from: b, reason: collision with root package name */
    public final G6 f37531b = new G6();

    /* renamed from: c, reason: collision with root package name */
    public C3075wn f37532c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37533d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37534e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, InterfaceC2856ob interfaceC2856ob) {
        if (this.f37534e) {
            return;
        }
        CollectionsKt.addAll(this.f37531b.f37566a, new InterfaceC2488ab[]{this.f37530a.a(context, appMetricaConfig, interfaceC2856ob)});
        this.f37534e = true;
    }

    public final synchronized void b() {
        if (this.f37533d) {
            return;
        }
        G6 g6 = this.f37531b;
        ArrayList arrayList = C3082x4.l().f40124i.f39363a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        g6.f37566a.addAll(arrayList2);
        this.f37533d = true;
    }

    public final synchronized void c() {
        try {
            if (this.f37532c != null) {
                return;
            }
            U1 u12 = new U1(this.f37531b);
            this.f37532c = new C3075wn(u12);
            C3049vn c3049vn = new C3049vn();
            c3049vn.f39988a.add(u12);
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                c3049vn.f39988a.add(defaultUncaughtExceptionHandler);
            }
            Thread.setDefaultUncaughtExceptionHandler(c3049vn);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        this.f37531b.f37566a.clear();
        this.f37533d = false;
        this.f37534e = false;
    }
}
