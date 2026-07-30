package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vg3 extends w93 implements yg3 {
    public vg3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // defpackage.yg3
    public final void A(cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        H(d, 20);
    }

    @Override // defpackage.yg3
    public final void B(cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        H(d, 6);
    }

    @Override // defpackage.yg3
    public final void C(cs3 cs3Var, Bundle bundle, bh3 bh3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        od3.b(d, bundle);
        od3.c(d, bh3Var);
        H(d, 31);
    }

    @Override // defpackage.yg3
    public final void D(cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        H(d, 26);
    }

    @Override // defpackage.yg3
    public final void E(tq3 tq3Var, cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, tq3Var);
        od3.b(d, cs3Var);
        H(d, 2);
    }

    @Override // defpackage.yg3
    public final String F(cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        Parcel c = c(d, 11);
        String readString = c.readString();
        c.recycle();
        return readString;
    }

    @Override // defpackage.yg3
    public final List G(String str, String str2, boolean z, cs3 cs3Var) {
        Parcel d = d();
        d.writeString(str);
        d.writeString(str2);
        ClassLoader classLoader = od3.a;
        d.writeInt(z ? 1 : 0);
        od3.b(d, cs3Var);
        Parcel c = c(d, 14);
        ArrayList createTypedArrayList = c.createTypedArrayList(tq3.CREATOR);
        c.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.yg3
    public final jc3 f(cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        Parcel c = c(d, 21);
        jc3 jc3Var = (jc3) od3.a(c, jc3.CREATOR);
        c.recycle();
        return jc3Var;
    }

    @Override // defpackage.yg3
    public final void g(Bundle bundle, cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, bundle);
        od3.b(d, cs3Var);
        H(d, 19);
    }

    @Override // defpackage.yg3
    public final List h(String str, String str2, String str3, boolean z) {
        Parcel d = d();
        d.writeString(null);
        d.writeString(str2);
        d.writeString(str3);
        ClassLoader classLoader = od3.a;
        d.writeInt(z ? 1 : 0);
        Parcel c = c(d, 15);
        ArrayList createTypedArrayList = c.createTypedArrayList(tq3.CREATOR);
        c.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.yg3
    public final void j(cs3 cs3Var, tb3 tb3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        od3.b(d, tb3Var);
        H(d, 30);
    }

    @Override // defpackage.yg3
    public final void k(kd3 kd3Var, cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, kd3Var);
        od3.b(d, cs3Var);
        H(d, 1);
    }

    @Override // defpackage.yg3
    public final void l(cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        H(d, 4);
    }

    @Override // defpackage.yg3
    public final void n(cs3 cs3Var, qp3 qp3Var, eh3 eh3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        od3.b(d, qp3Var);
        od3.c(d, eh3Var);
        H(d, 29);
    }

    @Override // defpackage.yg3
    public final void p(long j, String str, String str2, String str3) {
        Parcel d = d();
        d.writeLong(j);
        d.writeString(str);
        d.writeString(str2);
        d.writeString(str3);
        H(d, 10);
    }

    @Override // defpackage.yg3
    public final void q(yb3 yb3Var, cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, yb3Var);
        od3.b(d, cs3Var);
        H(d, 12);
    }

    @Override // defpackage.yg3
    public final byte[] r(String str, kd3 kd3Var) {
        Parcel d = d();
        od3.b(d, kd3Var);
        d.writeString(str);
        Parcel c = c(d, 9);
        byte[] createByteArray = c.createByteArray();
        c.recycle();
        return createByteArray;
    }

    @Override // defpackage.yg3
    public final List t(String str, String str2, String str3) {
        Parcel d = d();
        d.writeString(null);
        d.writeString(str2);
        d.writeString(str3);
        Parcel c = c(d, 17);
        ArrayList createTypedArrayList = c.createTypedArrayList(yb3.CREATOR);
        c.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.yg3
    public final void u(cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        H(d, 25);
    }

    @Override // defpackage.yg3
    public final List w(String str, String str2, cs3 cs3Var) {
        Parcel d = d();
        d.writeString(str);
        d.writeString(str2);
        od3.b(d, cs3Var);
        Parcel c = c(d, 16);
        ArrayList createTypedArrayList = c.createTypedArrayList(yb3.CREATOR);
        c.recycle();
        return createTypedArrayList;
    }

    @Override // defpackage.yg3
    public final void y(cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        H(d, 27);
    }

    @Override // defpackage.yg3
    public final void z(cs3 cs3Var) {
        Parcel d = d();
        od3.b(d, cs3Var);
        H(d, 18);
    }
}
