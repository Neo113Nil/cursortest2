package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ee, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3155ee extends Z2.a implements InterfaceC3264ge {
    public final InterfaceC3101de R0(V2.b bVar, BinderC3317hd binderC3317hd) {
        InterfaceC3101de c3046ce;
        Parcel A02 = A0();
        AbstractC3241g8.e(A02, bVar);
        AbstractC3241g8.e(A02, binderC3317hd);
        A02.writeInt(261710000);
        Parcel D02 = D0(A02, 1);
        IBinder readStrongBinder = D02.readStrongBinder();
        if (readStrongBinder == null) {
            c3046ce = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3046ce = queryLocalInterface instanceof InterfaceC3101de ? (InterfaceC3101de) queryLocalInterface : new C3046ce(readStrongBinder);
        }
        D02.recycle();
        return c3046ce;
    }
}
