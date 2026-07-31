package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public final class l40 extends zd implements n40 {
    l40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final double a() {
        Parcel q02 = q0(3, E());
        double readDouble = q02.readDouble();
        q02.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final Uri b() {
        Parcel q02 = q0(2, E());
        Uri uri = (Uri) be.a(q02, Uri.CREATOR);
        q02.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final int c() {
        Parcel q02 = q0(5, E());
        int readInt = q02.readInt();
        q02.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final x3.a d() {
        Parcel q02 = q0(1, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.n40
    public final int g() {
        Parcel q02 = q0(4, E());
        int readInt = q02.readInt();
        q02.recycle();
        return readInt;
    }
}
