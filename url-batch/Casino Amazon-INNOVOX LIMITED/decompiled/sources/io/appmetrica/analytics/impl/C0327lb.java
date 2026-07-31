package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.lb, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0327lb {

    /* renamed from: a, reason: collision with root package name */
    public final C0189g2 f1358a = new C0189g2();
    public final C0322l6 b = new C0322l6();
    public An c;
    public boolean d;
    public boolean e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, Ua ua) {
        if (this.e) {
            return;
        }
        CollectionsKt.addAll(this.b.f1354a, new Ga[]{this.f1358a.a(context, appMetricaConfig, ua)});
        this.e = true;
    }

    public final synchronized void b() {
        if (this.d) {
            return;
        }
        C0322l6 c0322l6 = this.b;
        ArrayList arrayList = C0088c4.l().i.f1403a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c0322l6.f1354a.addAll(arrayList2);
        this.d = true;
    }

    public final synchronized void c() {
        if (this.c != null) {
            return;
        }
        P1 p1 = new P1(this.b);
        this.c = new An(p1);
        C0688zn c0688zn = new C0688zn();
        c0688zn.f1603a.add(p1);
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            c0688zn.f1603a.add(defaultUncaughtExceptionHandler);
        }
        Thread.setDefaultUncaughtExceptionHandler(c0688zn);
    }

    public final synchronized void a() {
        this.b.f1354a.clear();
        this.d = false;
        this.e = false;
    }
}
