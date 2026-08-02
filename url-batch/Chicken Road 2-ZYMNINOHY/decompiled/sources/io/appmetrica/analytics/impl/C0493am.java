package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493am extends M5 {

    /* renamed from: b, reason: collision with root package name */
    public final C1121z3 f11443b;

    public C0493am(Context context, String str) {
        this(context, str, new SafePackageManager(), C0817na.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.M5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0519bm load(L5 l5) {
        C0519bm c0519bm = (C0519bm) super.load(l5);
        C0622fm c0622fm = l5.f10564a;
        c0519bm.f11554d = c0622fm.f11865f;
        c0519bm.f11555e = c0622fm.f11866g;
        Zl zl = (Zl) l5.componentArguments;
        String str = zl.f11397a;
        if (str != null) {
            c0519bm.f11556f = str;
            c0519bm.f11557g = zl.f11398b;
        }
        Map<String, String> map = zl.f11399c;
        c0519bm.f11558h = map;
        c0519bm.f11559i = (C0913r3) this.f11443b.a(new C0913r3(map, S7.f10933c));
        Zl zl2 = (Zl) l5.componentArguments;
        c0519bm.f11561k = zl2.f11400d;
        c0519bm.f11560j = zl2.f11401e;
        C0622fm c0622fm2 = l5.f10564a;
        c0519bm.f11562l = c0622fm2.f11873p;
        c0519bm.f11563m = c0622fm2.f11875r;
        long j4 = c0622fm2.v;
        if (c0519bm.n == 0) {
            c0519bm.n = j4;
        }
        return c0519bm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0519bm();
    }

    public C0493am(Context context, String str, SafePackageManager safePackageManager, C1121z3 c1121z3) {
        super(context, str, safePackageManager);
        this.f11443b = c1121z3;
    }

    public final C0519bm a() {
        return new C0519bm();
    }
}
