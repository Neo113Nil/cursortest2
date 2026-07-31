package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class wa implements y13 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u03 f13778a;

    wa(u03 u03Var) {
        this.f13778a = u03Var;
    }

    @Override // com.google.android.gms.internal.ads.y13
    public final void a(int i7, long j7, String str) {
        this.f13778a.e(i7, System.currentTimeMillis() - j7, str);
    }

    @Override // com.google.android.gms.internal.ads.y13
    public final void b(int i7, long j7) {
        this.f13778a.d(i7, System.currentTimeMillis() - j7);
    }
}
