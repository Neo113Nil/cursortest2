package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625em extends T5 {

    /* renamed from: b, reason: collision with root package name */
    public final H3 f8157b;

    public C0625em(Context context, String str) {
        this(context, str, new SafePackageManager(), C1027ua.k().f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0651fm load(S5 s5) {
        C0651fm c0651fm = (C0651fm) super.load(s5);
        C0754jm c0754jm = s5.f7418a;
        c0651fm.f8195d = c0754jm.f8564f;
        c0651fm.f8196e = c0754jm.f8565g;
        C0600dm c0600dm = (C0600dm) s5.componentArguments;
        String str = c0600dm.f8054a;
        if (str != null) {
            c0651fm.f8197f = str;
            c0651fm.f8198g = c0600dm.f8055b;
        }
        Map<String, String> map = c0600dm.f8056c;
        c0651fm.f8199h = map;
        c0651fm.f8200i = (C1148z3) this.f8157b.a(new C1148z3(map, Y7.f7730c));
        C0600dm c0600dm2 = (C0600dm) s5.componentArguments;
        c0651fm.f8202k = c0600dm2.f8057d;
        c0651fm.f8201j = c0600dm2.f8058e;
        C0754jm c0754jm2 = s5.f7418a;
        c0651fm.f8203l = c0754jm2.f8574p;
        c0651fm.f8204m = c0754jm2.f8576r;
        long j2 = c0754jm2.f8580v;
        if (c0651fm.f8205n == 0) {
            c0651fm.f8205n = j2;
        }
        return c0651fm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C0651fm();
    }

    public C0625em(Context context, String str, SafePackageManager safePackageManager, H3 h3) {
        super(context, str, safePackageManager);
        this.f8157b = h3;
    }

    public final C0651fm a() {
        return new C0651fm();
    }
}
