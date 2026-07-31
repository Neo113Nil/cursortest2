package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import x3.a;

/* loaded from: classes.dex */
public final class ey2 extends zd implements gy2 {
    ey2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // com.google.android.gms.internal.ads.gy2
    public final void H0(x3.a aVar, x3.a aVar2) {
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, aVar2);
        O0(8, E);
    }

    @Override // com.google.android.gms.internal.ads.gy2
    public final x3.a Q2(String str, x3.a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Parcel E = E();
        E.writeString(str);
        be.f(E, aVar);
        E.writeString("");
        E.writeString("javascript");
        E.writeString(str4);
        E.writeString("Google");
        E.writeString(str6);
        E.writeString(str7);
        E.writeString(str8);
        Parcel q02 = q0(11, E);
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.gy2
    public final boolean U(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        Parcel q02 = q0(2, E);
        boolean g7 = be.g(q02);
        q02.recycle();
        return g7;
    }

    @Override // com.google.android.gms.internal.ads.gy2
    public final void Y(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(7, E);
    }

    @Override // com.google.android.gms.internal.ads.gy2
    public final String e() {
        Parcel q02 = q0(6, E());
        String readString = q02.readString();
        q02.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.gy2
    public final void i2(x3.a aVar, x3.a aVar2) {
        Parcel E = E();
        be.f(E, aVar);
        be.f(E, aVar2);
        O0(5, E);
    }

    @Override // com.google.android.gms.internal.ads.gy2
    public final x3.a m4(String str, x3.a aVar, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Parcel E = E();
        E.writeString(str);
        be.f(E, aVar);
        E.writeString("");
        E.writeString("javascript");
        E.writeString(str4);
        E.writeString(str5);
        E.writeString(str6);
        E.writeString(str7);
        E.writeString(str8);
        Parcel q02 = q0(10, E);
        x3.a q03 = a.AbstractBinderC0153a.q0(q02.readStrongBinder());
        q02.recycle();
        return q03;
    }

    @Override // com.google.android.gms.internal.ads.gy2
    public final void x0(x3.a aVar) {
        Parcel E = E();
        be.f(E, aVar);
        O0(4, E);
    }
}
