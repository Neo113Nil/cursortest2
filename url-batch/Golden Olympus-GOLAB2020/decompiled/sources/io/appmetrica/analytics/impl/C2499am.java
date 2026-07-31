package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2499am extends AbstractC2696i6 {

    /* renamed from: b, reason: collision with root package name */
    public final V3 f38683b;

    public C2499am(@NonNull Context context, @NonNull String str) {
        this(context, str, new SafePackageManager(), Ia.j().e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC2696i6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C2526bm load(@NonNull C2670h6 c2670h6) {
        C2526bm c2526bm = (C2526bm) super.load(c2670h6);
        C2633fm c2633fm = c2670h6.f39126a;
        c2526bm.f38742d = c2633fm.f38984f;
        c2526bm.f38743e = c2633fm.f38985g;
        Zl zl = (Zl) c2670h6.componentArguments;
        String str = zl.f38644a;
        if (str != null) {
            c2526bm.f38744f = str;
            c2526bm.f38745g = zl.f38645b;
        }
        Map<String, String> map = zl.f38646c;
        c2526bm.f38746h = map;
        c2526bm.f38747i = (N3) this.f38683b.a(new N3(map, EnumC2775l8.f39393c));
        Zl zl2 = (Zl) c2670h6.componentArguments;
        c2526bm.f38749k = zl2.f38647d;
        c2526bm.f38748j = zl2.f38648e;
        C2633fm c2633fm2 = c2670h6.f39126a;
        c2526bm.f38750l = c2633fm2.f38994p;
        c2526bm.f38751m = c2633fm2.f38996r;
        long j4 = c2633fm2.f39000v;
        if (c2526bm.f38752n == 0) {
            c2526bm.f38752n = j4;
        }
        return c2526bm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C2526bm();
    }

    public C2499am(@NonNull Context context, @NonNull String str, @NonNull SafePackageManager safePackageManager, @NonNull V3 v32) {
        super(context, str, safePackageManager);
        this.f38683b = v32;
    }

    @NonNull
    public final C2526bm a() {
        return new C2526bm();
    }
}
