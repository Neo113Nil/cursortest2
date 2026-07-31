package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class li {

    /* renamed from: a, reason: collision with root package name */
    public final vi f7976a = new vi();

    /* renamed from: b, reason: collision with root package name */
    public final lh f7977b;

    /* renamed from: c, reason: collision with root package name */
    public si f7978c;

    /* renamed from: d, reason: collision with root package name */
    public ii f7979d;

    /* renamed from: e, reason: collision with root package name */
    public int f7980e;

    /* renamed from: f, reason: collision with root package name */
    public int f7981f;

    /* renamed from: g, reason: collision with root package name */
    public int f7982g;

    /* renamed from: h, reason: collision with root package name */
    public kh f7983h;

    /* renamed from: i, reason: collision with root package name */
    public ti f7984i;

    public li(lh lhVar) {
        this.f7977b = lhVar;
    }

    public final void a(si siVar, ii iiVar) {
        Objects.requireNonNull(siVar);
        this.f7978c = siVar;
        Objects.requireNonNull(iiVar);
        this.f7979d = iiVar;
        this.f7977b.b(siVar.f11833f);
        b();
    }

    public final void b() {
        vi viVar = this.f7976a;
        viVar.f13386d = 0;
        viVar.f13400r = 0L;
        viVar.f13394l = false;
        viVar.f13399q = false;
        viVar.f13396n = null;
        this.f7980e = 0;
        this.f7982g = 0;
        this.f7981f = 0;
        this.f7983h = null;
        this.f7984i = null;
    }
}
