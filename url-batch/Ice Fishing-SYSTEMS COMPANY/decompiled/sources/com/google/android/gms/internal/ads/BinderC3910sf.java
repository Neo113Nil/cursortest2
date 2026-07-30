package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.sf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3910sf extends AbstractBinderC3186f8 implements InterfaceC3047cf {

    /* renamed from: n, reason: collision with root package name */
    public final String f34252n;

    /* renamed from: u, reason: collision with root package name */
    public final int f34253u;

    public BinderC3910sf(String str, int i) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f34252n = str;
        this.f34253u = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f34252n);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f34253u);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3047cf
    public final String c() {
        return this.f34252n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3047cf
    public final int f() {
        return this.f34253u;
    }
}
