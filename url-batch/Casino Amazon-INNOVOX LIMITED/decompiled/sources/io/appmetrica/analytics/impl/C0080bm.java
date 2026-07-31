package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0080bm extends N5 {
    public final A3 b;

    public C0080bm(Context context, String str) {
        this(context, str, new SafePackageManager(), C0401oa.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0106cm load(M5 m5) {
        C0106cm c0106cm = (C0106cm) super.load(m5);
        C0209gm c0209gm = m5.f949a;
        c0106cm.d = c0209gm.f;
        c0106cm.e = c0209gm.g;
        C0054am c0054am = (C0054am) m5.componentArguments;
        String str = c0054am.f1170a;
        if (str != null) {
            c0106cm.f = str;
            c0106cm.g = c0054am.b;
        }
        Map<String, String> map = c0054am.c;
        c0106cm.h = map;
        c0106cm.i = (C0493s3) this.b.a(new C0493s3(map, T7.c));
        C0054am c0054am2 = (C0054am) m5.componentArguments;
        c0106cm.k = c0054am2.d;
        c0106cm.j = c0054am2.e;
        C0209gm c0209gm2 = m5.f949a;
        c0106cm.l = c0209gm2.p;
        c0106cm.m = c0209gm2.r;
        long j = c0209gm2.v;
        if (c0106cm.n == 0) {
            c0106cm.n = j;
        }
        return c0106cm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0106cm();
    }

    public C0080bm(Context context, String str, SafePackageManager safePackageManager, A3 a3) {
        super(context, str, safePackageManager);
        this.b = a3;
    }

    public final C0106cm a() {
        return new C0106cm();
    }
}
