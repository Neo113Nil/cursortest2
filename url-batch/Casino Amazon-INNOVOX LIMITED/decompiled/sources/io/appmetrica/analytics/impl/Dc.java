package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Dc {

    /* renamed from: a, reason: collision with root package name */
    public final Ym f809a;
    public final Ym b;
    public final C0370n4 c;
    public final PublicLogger d;
    public final String e;

    public Dc(String str, PublicLogger publicLogger) {
        this(new C0370n4(30), new Ym(50, str.concat("map key"), publicLogger), new Ym(4000, str.concat("map value"), publicLogger), str, publicLogger);
    }

    public Dc(C0370n4 c0370n4, Ym ym, Ym ym2, String str, PublicLogger publicLogger) {
        this.c = c0370n4;
        this.f809a = ym;
        this.b = ym2;
        this.e = str;
        this.d = publicLogger;
    }
}
