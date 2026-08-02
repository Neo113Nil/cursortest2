package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class L1 {

    /* renamed from: d, reason: collision with root package name */
    public static A1 f10555d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10556a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1119z1 f10557b;

    /* renamed from: c, reason: collision with root package name */
    public BinderC1093y1 f10558c;

    public L1(Context context, InterfaceC1119z1 interfaceC1119z1) {
        this.f10556a = context;
        this.f10557b = interfaceC1119z1;
    }

    public final void b() {
        C0817na.a(this.f10556a);
        PublicLogger.Companion.init(this.f10556a);
        Context context = this.f10556a;
        InterfaceC1119z1 interfaceC1119z1 = this.f10557b;
        if (f10555d == null) {
            B1 b12 = new B1(context, interfaceC1119z1, new C0554d5(context));
            C0594ek c0594ek = C0817na.f12417I.v;
            E1 e12 = new E1(b12);
            LinkedHashMap linkedHashMap = c0594ek.f11808a;
            Object obj = linkedHashMap.get(1);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(1, obj);
            }
            ((List) obj).add(e12);
            f10555d = b12;
        }
        A1 a12 = f10555d;
        if (a12 != null) {
            this.f10558c = new BinderC1093y1(a12);
            C0817na c0817na = C0817na.f12417I;
            c0817na.f12431f = new C0800mj(c0817na.f12426a, new C0826nj(a12));
            ((B1) a12).onCreate();
        }
    }

    public final boolean c(Intent intent) {
        A1 a12 = f10555d;
        if (a12 != null) {
            ((B1) a12).b(intent);
        }
        String action = intent.getAction();
        return (action == null || !w3.o.a0(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) && intent.getData() == null;
    }

    public final void d() {
        f10555d = null;
    }

    public final void a(Intent intent, int i4) {
        A1 a12 = f10555d;
        if (a12 != null) {
            ((C0988u0) ((B1) a12).f10073c).f12794a.stopSelf(i4);
        }
    }

    public final void c() {
        A1 a12 = f10555d;
        if (a12 != null) {
            ((B1) a12).onDestroy();
        }
    }

    public final int a(Intent intent, int i4, int i5) {
        A1 a12 = f10555d;
        if (a12 == null) {
            return 2;
        }
        ((C0988u0) ((B1) a12).f10073c).f12794a.stopSelf(i5);
        return 2;
    }

    public final IBinder a(Intent intent) {
        A1 a12 = f10555d;
        if (a12 != null) {
            ((B1) a12).a(intent);
        }
        String action = intent.getAction();
        if (action != null && w3.o.a0(action, "io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK", false)) {
            return new Co();
        }
        BinderC1093y1 binderC1093y1 = this.f10558c;
        if (binderC1093y1 != null) {
            return binderC1093y1;
        }
        kotlin.jvm.internal.i.i("coreBinder");
        throw null;
    }

    public final void a(Configuration configuration) {
        if (f10555d != null) {
            C0817na.f12417I.v().a(configuration);
        }
    }

    public final void b(Intent intent) {
        A1 a12 = f10555d;
        if (a12 != null) {
            ((B1) a12).c(intent);
        }
    }
}
