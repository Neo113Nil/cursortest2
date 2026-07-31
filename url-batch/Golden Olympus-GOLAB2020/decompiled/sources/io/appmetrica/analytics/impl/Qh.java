package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes3.dex */
public final class Qh extends C2953s5 {

    /* renamed from: v, reason: collision with root package name */
    public final String f38169v;

    /* renamed from: w, reason: collision with root package name */
    public final Z6 f38170w;

    public Qh(@NonNull Context context, @NonNull C2772l5 c2772l5, @NonNull J4 j4, @NonNull Z6 z6, @NonNull C2633fm c2633fm, @NonNull AbstractC2902q5 abstractC2902q5, @NonNull N9 n9) {
        this(context, c2772l5, new C2690i0(), new TimePassedChecker(), new C3083x5(context, c2772l5, j4, abstractC2902q5, c2633fm, new Lh(z6), Ia.j().w().d(), PackageManagerUtils.getAppVersionCodeInt(context), Ia.j().k(), n9), z6, j4);
    }

    @Override // io.appmetrica.analytics.impl.C2953s5, io.appmetrica.analytics.impl.InterfaceC2752kb, io.appmetrica.analytics.impl.Za
    public final synchronized void a(@NonNull J4 j4) {
        super.a(j4);
        this.f38170w.a(this.f38169v, j4.f37797i);
    }

    public Qh(Context context, C2772l5 c2772l5, C2690i0 c2690i0, TimePassedChecker timePassedChecker, C3083x5 c3083x5, Z6 z6, J4 j4) {
        super(context, c2772l5, c2690i0, timePassedChecker, c3083x5, j4);
        this.f38169v = c2772l5.b();
        this.f38170w = z6;
    }
}
