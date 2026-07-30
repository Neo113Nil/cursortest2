package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.up, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4028up extends AbstractBinderC2619Je {

    /* renamed from: n, reason: collision with root package name */
    public final C3320hg f34664n;

    /* renamed from: u, reason: collision with root package name */
    public final C2687Ne f34665u;

    public BinderC4028up(C3320hg c3320hg, C2687Ne c2687Ne) {
        this.f34664n = c3320hg;
        this.f34665u = c2687Ne;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2636Ke
    public final void B2(ParcelFileDescriptor parcelFileDescriptor) {
        this.f34664n.a(new C2511Cp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f34665u));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2636Ke
    public final void J0(t2.n nVar) {
        nVar.getClass();
        this.f34664n.b(new t2.m(nVar.f40920n, nVar.f40921u));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2636Ke
    public final void m3(ParcelFileDescriptor parcelFileDescriptor, C2687Ne c2687Ne) {
        this.f34664n.a(new C2511Cp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2687Ne));
    }
}
