package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jj0 extends lj0 {

    /* renamed from: f, reason: collision with root package name */
    private final String f7146f;

    /* renamed from: g, reason: collision with root package name */
    private final int f7147g;

    public jj0(String str, int i7) {
        this.f7146f = str;
        this.f7147g = i7;
    }

    @Override // com.google.android.gms.internal.ads.mj0
    public final int a() {
        return this.f7147g;
    }

    @Override // com.google.android.gms.internal.ads.mj0
    public final String c() {
        return this.f7146f;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof jj0)) {
            jj0 jj0Var = (jj0) obj;
            if (r3.n.a(this.f7146f, jj0Var.f7146f) && r3.n.a(Integer.valueOf(this.f7147g), Integer.valueOf(jj0Var.f7147g))) {
                return true;
            }
        }
        return false;
    }
}
