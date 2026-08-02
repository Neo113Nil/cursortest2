package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474em extends T5 {

    /* renamed from: b, reason: collision with root package name */
    public final H3 f7290b;

    public C0474em(Context context, String str) {
        this(context, str, new SafePackageManager(), C0876ua.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0500fm load(S5 s5) {
        C0500fm c0500fm = (C0500fm) super.load(s5);
        C0603jm c0603jm = s5.f6596a;
        c0500fm.f7328d = c0603jm.f;
        c0500fm.f7329e = c0603jm.f7668g;
        C0449dm c0449dm = (C0449dm) s5.componentArguments;
        String str = c0449dm.f7196a;
        if (str != null) {
            c0500fm.f = str;
            c0500fm.f7330g = c0449dm.f7197b;
        }
        Map<String, String> map = c0449dm.f7198c;
        c0500fm.f7331h = map;
        c0500fm.f7332i = (C0997z3) this.f7290b.a(new C0997z3(map, Y7.f6892c));
        C0449dm c0449dm2 = (C0449dm) s5.componentArguments;
        c0500fm.f7334k = c0449dm2.f7199d;
        c0500fm.f7333j = c0449dm2.f7200e;
        C0603jm c0603jm2 = s5.f6596a;
        c0500fm.f7335l = c0603jm2.f7676p;
        c0500fm.f7336m = c0603jm2.f7678r;
        long j3 = c0603jm2.v;
        if (c0500fm.f7337n == 0) {
            c0500fm.f7337n = j3;
        }
        return c0500fm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0500fm();
    }

    public C0474em(Context context, String str, SafePackageManager safePackageManager, H3 h3) {
        super(context, str, safePackageManager);
        this.f7290b = h3;
    }

    public final C0500fm a() {
        return new C0500fm();
    }
}
