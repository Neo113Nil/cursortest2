package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;

/* loaded from: classes.dex */
public final class Ih extends C0608e5 {

    /* renamed from: w, reason: collision with root package name */
    public final String f6958w;

    /* renamed from: x, reason: collision with root package name */
    public final L6 f6959x;

    public Ih(Context context, X4 x42, C1047v4 c1047v4, L6 l6, C0754jm c0754jm, AbstractC0557c5 abstractC0557c5, InterfaceC1154z9 interfaceC1154z9) {
        this(context, x42, new C0758k0(), new TimePassedChecker(), new C0737j5(context, x42, c1047v4, abstractC0557c5, c0754jm, new Dh(l6), C1027ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C1027ua.k().l(), interfaceC1154z9), l6, c1047v4);
    }

    @Override // io.appmetrica.analytics.impl.C0608e5, io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public final synchronized void a(C1047v4 c1047v4) {
        super.a(c1047v4);
        this.f6959x.a(this.f6958w, c1047v4.f9434i);
    }

    public Ih(Context context, X4 x42, C0758k0 c0758k0, TimePassedChecker timePassedChecker, C0737j5 c0737j5, L6 l6, C1047v4 c1047v4) {
        super(context, x42, c0758k0, timePassedChecker, c0737j5, c1047v4);
        this.f6958w = x42.b();
        this.f6959x = l6;
    }
}
