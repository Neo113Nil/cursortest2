package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public final class p extends b4.a {
    p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final x3.a B3(x3.a aVar, String str, int i7, x3.a aVar2) {
        Parcel q02 = q0();
        b4.c.c(q02, aVar);
        q02.writeString(str);
        q02.writeInt(i7);
        b4.c.c(q02, aVar2);
        Parcel E = E(3, q02);
        x3.a q03 = a.AbstractBinderC0153a.q0(E.readStrongBinder());
        E.recycle();
        return q03;
    }

    public final x3.a O0(x3.a aVar, String str, int i7, x3.a aVar2) {
        Parcel q02 = q0();
        b4.c.c(q02, aVar);
        q02.writeString(str);
        q02.writeInt(i7);
        b4.c.c(q02, aVar2);
        Parcel E = E(2, q02);
        x3.a q03 = a.AbstractBinderC0153a.q0(E.readStrongBinder());
        E.recycle();
        return q03;
    }
}
