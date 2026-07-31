package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class az extends zd implements cz {
    az(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final void M5(gz gzVar) {
        Parcel E = E();
        be.f(E, gzVar);
        O0(8, E);
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float b() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float d() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final float e() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.cz
    public final gz h() {
        gz ezVar;
        Parcel q02 = q0(11, E());
        IBinder readStrongBinder = q02.readStrongBinder();
        if (readStrongBinder == null) {
            ezVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            ezVar = queryLocalInterface instanceof gz ? (gz) queryLocalInterface : new ez(readStrongBinder);
        }
        q02.recycle();
        return ezVar;
    }
}
