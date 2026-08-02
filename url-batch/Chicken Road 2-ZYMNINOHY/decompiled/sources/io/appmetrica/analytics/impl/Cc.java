package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Cc {

    /* renamed from: a, reason: collision with root package name */
    public final Xm f10154a;

    /* renamed from: b, reason: collision with root package name */
    public final Xm f10155b;

    /* renamed from: c, reason: collision with root package name */
    public final C0785m4 f10156c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicLogger f10157d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10158e;

    public Cc(String str, PublicLogger publicLogger) {
        this(new C0785m4(30), new Xm(50, str.concat("map key"), publicLogger), new Xm(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Cc(C0785m4 c0785m4, Xm xm, Xm xm2, String str, PublicLogger publicLogger) {
        this.f10156c = c0785m4;
        this.f10154a = xm;
        this.f10155b = xm2;
        this.f10158e = str;
        this.f10157d = publicLogger;
    }
}
