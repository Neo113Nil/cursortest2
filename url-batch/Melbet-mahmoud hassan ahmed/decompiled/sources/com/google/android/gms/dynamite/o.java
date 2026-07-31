package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public final class o extends b4.a {
    o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int B3(x3.a aVar, String str, boolean z6) {
        Parcel q02 = q0();
        b4.c.c(q02, aVar);
        q02.writeString(str);
        b4.c.a(q02, z6);
        Parcel E = E(3, q02);
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final x3.a C3(x3.a aVar, String str, int i7) {
        Parcel q02 = q0();
        b4.c.c(q02, aVar);
        q02.writeString(str);
        q02.writeInt(i7);
        Parcel E = E(4, q02);
        x3.a q03 = a.AbstractBinderC0153a.q0(E.readStrongBinder());
        E.recycle();
        return q03;
    }

    public final int C5() {
        Parcel E = E(6, q0());
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final x3.a O0(x3.a aVar, String str, int i7) {
        Parcel q02 = q0();
        b4.c.c(q02, aVar);
        q02.writeString(str);
        q02.writeInt(i7);
        Parcel E = E(2, q02);
        x3.a q03 = a.AbstractBinderC0153a.q0(E.readStrongBinder());
        E.recycle();
        return q03;
    }

    public final x3.a k6(x3.a aVar, String str, boolean z6, long j7) {
        Parcel q02 = q0();
        b4.c.c(q02, aVar);
        q02.writeString(str);
        b4.c.a(q02, z6);
        q02.writeLong(j7);
        Parcel E = E(7, q02);
        x3.a q03 = a.AbstractBinderC0153a.q0(E.readStrongBinder());
        E.recycle();
        return q03;
    }

    public final int o4(x3.a aVar, String str, boolean z6) {
        Parcel q02 = q0();
        b4.c.c(q02, aVar);
        q02.writeString(str);
        b4.c.a(q02, z6);
        Parcel E = E(5, q02);
        int readInt = E.readInt();
        E.recycle();
        return readInt;
    }

    public final x3.a r6(x3.a aVar, String str, int i7, x3.a aVar2) {
        Parcel q02 = q0();
        b4.c.c(q02, aVar);
        q02.writeString(str);
        q02.writeInt(i7);
        b4.c.c(q02, aVar2);
        Parcel E = E(8, q02);
        x3.a q03 = a.AbstractBinderC0153a.q0(E.readStrongBinder());
        E.recycle();
        return q03;
    }
}
