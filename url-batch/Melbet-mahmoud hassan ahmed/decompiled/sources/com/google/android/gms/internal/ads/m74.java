package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class m74 extends ei0 {

    /* renamed from: h, reason: collision with root package name */
    private static final Object f8443h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static final zo f8444i;

    /* renamed from: c, reason: collision with root package name */
    private final long f8445c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8446d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8447e;

    /* renamed from: f, reason: collision with root package name */
    private final zo f8448f;

    /* renamed from: g, reason: collision with root package name */
    private final th f8449g;

    static {
        g4 g4Var = new g4();
        g4Var.a("SinglePeriodTimeline");
        g4Var.b(Uri.EMPTY);
        f8444i = g4Var.c();
    }

    public m74(long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z6, boolean z7, boolean z8, Object obj, zo zoVar, th thVar) {
        this.f8445c = j10;
        this.f8446d = j11;
        this.f8447e = z6;
        this.f8448f = zoVar;
        this.f8449g = thVar;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int a(Object obj) {
        return f8443h.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final pf0 d(int i7, pf0 pf0Var, boolean z6) {
        wu1.a(i7, 0, 1);
        pf0Var.j(null, z6 ? f8443h : null, 0, this.f8445c, 0L, y51.f14553c, false);
        return pf0Var;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final hh0 e(int i7, hh0 hh0Var, long j7) {
        wu1.a(i7, 0, 1);
        hh0Var.a(hh0.f6244o, this.f8448f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f8447e, false, this.f8449g, 0L, this.f8446d, 0, 0, 0L);
        return hh0Var;
    }

    @Override // com.google.android.gms.internal.ads.ei0
    public final Object f(int i7) {
        wu1.a(i7, 0, 1);
        return f8443h;
    }
}
