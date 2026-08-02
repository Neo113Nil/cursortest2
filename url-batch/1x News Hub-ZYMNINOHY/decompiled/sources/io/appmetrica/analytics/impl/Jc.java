package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Jc {

    /* renamed from: a, reason: collision with root package name */
    public final C0372an f6201a;

    /* renamed from: b, reason: collision with root package name */
    public final C0372an f6202b;

    /* renamed from: c, reason: collision with root package name */
    public final C0844t4 f6203c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicLogger f6204d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6205e;

    public Jc(String str, PublicLogger publicLogger) {
        this(new C0844t4(30), new C0372an(50, str.concat("map key"), publicLogger), new C0372an(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Jc(C0844t4 c0844t4, C0372an c0372an, C0372an c0372an2, String str, PublicLogger publicLogger) {
        this.f6203c = c0844t4;
        this.f6201a = c0372an;
        this.f6202b = c0372an2;
        this.f6205e = str;
        this.f6204d = publicLogger;
    }
}
