package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x6 extends a7 {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f2972s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f2973t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f2974u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a6 f2975v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d7 f2976w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(d7 d7Var, String str, String str2, boolean z10, a6 a6Var) {
        super(d7Var, true);
        this.f2972s = str;
        this.f2973t = str2;
        this.f2974u = z10;
        this.f2975v = a6Var;
        this.f2976w = d7Var;
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void a() {
        d6 d6Var = this.f2976w.f2229e;
        c7.c0.g(d6Var);
        d6Var.getUserProperties(this.f2972s, this.f2973t, this.f2974u, this.f2975v);
    }

    @Override // com.google.android.gms.internal.measurement.a7
    public final void b() {
        this.f2975v.j(null);
    }
}
