package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class dm1 extends j40 {

    /* renamed from: f, reason: collision with root package name */
    private final rm1 f4246f;

    /* renamed from: g, reason: collision with root package name */
    private x3.a f4247g;

    public dm1(rm1 rm1Var) {
        this.f4246f = rm1Var;
    }

    private static float s6(x3.a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) x3.b.O0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void R1(s50 s50Var) {
        if (((Boolean) sw.c().b(m10.I4)).booleanValue() && (this.f4246f.R() instanceof bv0)) {
            ((bv0) this.f4246f.R()).y6(s50Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final float b() {
        if (!((Boolean) sw.c().b(m10.H4)).booleanValue()) {
            return 0.0f;
        }
        if (this.f4246f.J() != 0.0f) {
            return this.f4246f.J();
        }
        if (this.f4246f.R() != null) {
            try {
                return this.f4246f.R().b();
            } catch (RemoteException e7) {
                io0.e("Remote exception getting video controller aspect ratio.", e7);
                return 0.0f;
            }
        }
        x3.a aVar = this.f4247g;
        if (aVar != null) {
            return s6(aVar);
        }
        n40 U = this.f4246f.U();
        if (U == null) {
            return 0.0f;
        }
        float g7 = (U.g() == -1 || U.c() == -1) ? 0.0f : U.g() / U.c();
        return g7 == 0.0f ? s6(U.d()) : g7;
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final float d() {
        if (((Boolean) sw.c().b(m10.I4)).booleanValue() && this.f4246f.R() != null) {
            return this.f4246f.R().d();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void d0(x3.a aVar) {
        this.f4247g = aVar;
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final float e() {
        if (((Boolean) sw.c().b(m10.I4)).booleanValue() && this.f4246f.R() != null) {
            return this.f4246f.R().e();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final cz f() {
        if (((Boolean) sw.c().b(m10.I4)).booleanValue()) {
            return this.f4246f.R();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final x3.a h() {
        x3.a aVar = this.f4247g;
        if (aVar != null) {
            return aVar;
        }
        n40 U = this.f4246f.U();
        if (U == null) {
            return null;
        }
        return U.d();
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final boolean j() {
        return ((Boolean) sw.c().b(m10.I4)).booleanValue() && this.f4246f.R() != null;
    }
}
