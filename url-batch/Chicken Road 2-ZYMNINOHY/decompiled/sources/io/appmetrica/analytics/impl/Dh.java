package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes.dex */
public final class Dh extends X4 {

    /* renamed from: w, reason: collision with root package name */
    public final String f10200w;

    /* renamed from: x, reason: collision with root package name */
    public final E6 f10201x;

    public Dh(Context context, Q4 q4, C0837o4 c0837o4, E6 e6, C0622fm c0622fm, V4 v4, InterfaceC0945s9 interfaceC0945s9) {
        this(context, q4, new C0729k0(), new TimePassedChecker(), new C0528c5(context, q4, c0837o4, v4, c0622fm, new C1109yh(e6), C0817na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0817na.k().l(), interfaceC0945s9), e6, c0837o4);
    }

    @Override // io.appmetrica.analytics.impl.X4, io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public final synchronized void a(C0837o4 c0837o4) {
        super.a(c0837o4);
        this.f10201x.a(this.f10200w, c0837o4.f12492i);
    }

    public Dh(Context context, Q4 q4, C0729k0 c0729k0, TimePassedChecker timePassedChecker, C0528c5 c0528c5, E6 e6, C0837o4 c0837o4) {
        super(context, q4, c0729k0, timePassedChecker, c0528c5, c0837o4);
        this.f10200w = q4.b();
        this.f10201x = e6;
    }
}
