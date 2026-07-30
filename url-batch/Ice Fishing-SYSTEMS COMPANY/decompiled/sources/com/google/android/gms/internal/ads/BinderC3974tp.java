package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.tp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3974tp extends AbstractBinderC2619Je {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC4082vp f34472n;

    public BinderC3974tp(AbstractC4082vp abstractC4082vp) {
        this.f34472n = abstractC4082vp;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2636Ke
    public final void B2(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        AbstractC4082vp abstractC4082vp = this.f34472n;
        abstractC4082vp.f34864n.a(new C2511Cp(autoCloseInputStream, abstractC4082vp.f34868x));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2636Ke
    public final void J0(t2.n nVar) {
        C3320hg c3320hg = this.f34472n.f34864n;
        nVar.getClass();
        c3320hg.b(new t2.m(nVar.f40920n, nVar.f40921u));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2636Ke
    public final void m3(ParcelFileDescriptor parcelFileDescriptor, C2687Ne c2687Ne) {
        this.f34472n.f34864n.a(new C2511Cp(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), c2687Ne));
    }
}
