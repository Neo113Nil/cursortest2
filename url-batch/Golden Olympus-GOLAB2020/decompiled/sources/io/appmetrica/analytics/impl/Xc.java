package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Xc {

    /* renamed from: a, reason: collision with root package name */
    public final Wm f38518a;

    /* renamed from: b, reason: collision with root package name */
    public final Wm f38519b;

    /* renamed from: c, reason: collision with root package name */
    public final H4 f38520c;

    /* renamed from: d, reason: collision with root package name */
    public final PublicLogger f38521d;

    /* renamed from: e, reason: collision with root package name */
    public final String f38522e;

    public Xc(String str, PublicLogger publicLogger) {
        this(new H4(30), new Wm(50, str.concat("map key"), publicLogger), new Wm(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Xc(H4 h4, Wm wm, Wm wm2, String str, PublicLogger publicLogger) {
        this.f38520c = h4;
        this.f38518a = wm;
        this.f38519b = wm2;
        this.f38522e = str;
        this.f38521d = publicLogger;
    }
}
