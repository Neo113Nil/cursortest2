package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.id, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3371id extends Z2.a implements InterfaceC3423jd {
    @Override // com.google.android.gms.internal.ads.InterfaceC3423jd
    public final InterfaceC2669Md C(String str) {
        InterfaceC2669Md c2652Ld;
        Parcel A02 = A0();
        A02.writeString(str);
        Parcel D02 = D0(A02, 3);
        IBinder readStrongBinder = D02.readStrongBinder();
        int i = BinderC2737Qd.f27178u;
        if (readStrongBinder == null) {
            c2652Ld = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
            c2652Ld = queryLocalInterface instanceof InterfaceC2669Md ? (InterfaceC2669Md) queryLocalInterface : new C2652Ld(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter", 2);
        }
        D02.recycle();
        return c2652Ld;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3423jd
    public final boolean E(String str) {
        Parcel A02 = A0();
        A02.writeString(str);
        Parcel D02 = D0(A02, 4);
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3423jd
    public final boolean N(String str) {
        Parcel A02 = A0();
        A02.writeString(str);
        Parcel D02 = D0(A02, 2);
        ClassLoader classLoader = AbstractC3241g8.f30958a;
        boolean z8 = D02.readInt() != 0;
        D02.recycle();
        return z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3423jd
    public final InterfaceC3531ld b(String str) {
        InterfaceC3531ld c3477kd;
        Parcel A02 = A0();
        A02.writeString(str);
        Parcel D02 = D0(A02, 1);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c3477kd = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            c3477kd = queryLocalInterface instanceof InterfaceC3531ld ? (InterfaceC3531ld) queryLocalInterface : new C3477kd(readStrongBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter", 2);
        }
        D02.recycle();
        return c3477kd;
    }
}
