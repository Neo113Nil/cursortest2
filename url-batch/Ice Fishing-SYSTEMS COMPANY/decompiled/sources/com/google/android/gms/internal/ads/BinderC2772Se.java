package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Se, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2772Se extends AbstractBinderC3186f8 {

    /* renamed from: n, reason: collision with root package name */
    public final String f27578n;

    /* renamed from: u, reason: collision with root package name */
    public final int f27579u;

    public BinderC2772Se(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f27578n = str;
        this.f27579u = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.f27578n);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f27579u);
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BinderC2772Se)) {
            return false;
        }
        BinderC2772Se binderC2772Se = (BinderC2772Se) obj;
        return O2.w.l(this.f27578n, binderC2772Se.f27578n) && O2.w.l(Integer.valueOf(this.f27579u), Integer.valueOf(binderC2772Se.f27579u));
    }
}
