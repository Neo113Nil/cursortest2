package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes.dex */
public final class Ih extends C0457e5 {

    /* renamed from: w, reason: collision with root package name */
    public final String f6158w;

    /* renamed from: x, reason: collision with root package name */
    public final L6 f6159x;

    public Ih(Context context, X4 x4, C0896v4 c0896v4, L6 l6, C0603jm c0603jm, AbstractC0406c5 abstractC0406c5, InterfaceC1003z9 interfaceC1003z9) {
        this(context, x4, new C0607k0(), new TimePassedChecker(), new C0586j5(context, x4, c0896v4, abstractC0406c5, c0603jm, new Dh(l6), C0876ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C0876ua.k().l(), interfaceC1003z9), l6, c0896v4);
    }

    @Override // io.appmetrica.analytics.impl.C0457e5, io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public final synchronized void a(C0896v4 c0896v4) {
        super.a(c0896v4);
        this.f6159x.a(this.f6158w, c0896v4.f8484i);
    }

    public Ih(Context context, X4 x4, C0607k0 c0607k0, TimePassedChecker timePassedChecker, C0586j5 c0586j5, L6 l6, C0896v4 c0896v4) {
        super(context, x4, c0607k0, timePassedChecker, c0586j5, c0896v4);
        this.f6158w = x4.b();
        this.f6159x = l6;
    }
}
