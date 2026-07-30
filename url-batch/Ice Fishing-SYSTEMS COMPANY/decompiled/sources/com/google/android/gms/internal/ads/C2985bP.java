package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.bP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2985bP {

    /* renamed from: d, reason: collision with root package name */
    public static final C2985bP f29486d = new G2().b();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29487a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f29488b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29489c;

    public /* synthetic */ C2985bP(G2 g22) {
        this.f29487a = g22.f25091a;
        this.f29488b = g22.f25092b;
        this.f29489c = g22.f25093c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2985bP.class != obj.getClass()) {
            return false;
        }
        C2985bP c2985bP = (C2985bP) obj;
        return this.f29487a == c2985bP.f29487a && this.f29488b == c2985bP.f29488b && this.f29489c == c2985bP.f29489c;
    }

    public final int hashCode() {
        int i = (this.f29487a ? 1 : 0) << 2;
        boolean z8 = this.f29488b;
        return (z8 ? 1 : 0) + (z8 ? 1 : 0) + i + (this.f29489c ? 1 : 0);
    }
}
