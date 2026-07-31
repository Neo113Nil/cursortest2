package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public final class i40 extends zd implements k40 {
    i40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final x3.a h() {
        Parcel q02 = q0(4, E());
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }
}
