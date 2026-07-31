package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class k90 extends zd implements m90 {
    k90(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.m90
    public final void j3(List<f90> list) {
        Parcel E = E();
        E.writeTypedList(list);
        O0(1, E);
    }
}
