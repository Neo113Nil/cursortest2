package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.He, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2585He extends Z2.a implements InterfaceC2636Ke {
    public C2585He(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2636Ke
    public final void B2(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, parcelFileDescriptor);
        G0(A02, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2636Ke
    public final void J0(t2.n nVar) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, nVar);
        G0(A02, 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2636Ke
    public final void m3(ParcelFileDescriptor parcelFileDescriptor, C2687Ne c2687Ne) {
        Parcel A02 = A0();
        AbstractC3241g8.c(A02, parcelFileDescriptor);
        AbstractC3241g8.c(A02, c2687Ne);
        G0(A02, 3);
    }
}
