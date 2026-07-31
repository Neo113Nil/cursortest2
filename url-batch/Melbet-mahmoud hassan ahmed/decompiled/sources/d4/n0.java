package d4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class n0 extends a implements p0 {
    n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // d4.p0
    public final void A3(Bundle bundle, r0 r0Var, long j7) {
        Parcel E = E();
        h0.c(E, bundle);
        h0.d(E, r0Var);
        E.writeLong(j7);
        q0(32, E);
    }

    @Override // d4.p0
    public final void D1(r0 r0Var) {
        Parcel E = E();
        h0.d(E, r0Var);
        q0(21, E);
    }

    @Override // d4.p0
    public final void J5(String str, String str2, x3.a aVar, boolean z6, long j7) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        h0.d(E, aVar);
        h0.a(E, z6);
        E.writeLong(j7);
        q0(4, E);
    }

    @Override // d4.p0
    public final void K1(r0 r0Var) {
        Parcel E = E();
        h0.d(E, r0Var);
        q0(22, E);
    }

    @Override // d4.p0
    public final void N5(x3.a aVar, long j7) {
        Parcel E = E();
        h0.d(E, aVar);
        E.writeLong(j7);
        q0(30, E);
    }

    @Override // d4.p0
    public final void P5(x3.a aVar, Bundle bundle, long j7) {
        Parcel E = E();
        h0.d(E, aVar);
        h0.c(E, bundle);
        E.writeLong(j7);
        q0(27, E);
    }

    @Override // d4.p0
    public final void R2(String str, String str2, Bundle bundle, boolean z6, boolean z7, long j7) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        h0.c(E, bundle);
        h0.a(E, z6);
        h0.a(E, z7);
        E.writeLong(j7);
        q0(2, E);
    }

    @Override // d4.p0
    public final void R5(r0 r0Var) {
        Parcel E = E();
        h0.d(E, r0Var);
        q0(19, E);
    }

    @Override // d4.p0
    public final void S4(String str, long j7) {
        Parcel E = E();
        E.writeString(str);
        E.writeLong(j7);
        q0(24, E);
    }

    @Override // d4.p0
    public final void T0(x3.a aVar, long j7) {
        Parcel E = E();
        h0.d(E, aVar);
        E.writeLong(j7);
        q0(29, E);
    }

    @Override // d4.p0
    public final void W3(Bundle bundle, long j7) {
        Parcel E = E();
        h0.c(E, bundle);
        E.writeLong(j7);
        q0(44, E);
    }

    @Override // d4.p0
    public final void W4(x3.a aVar, long j7) {
        Parcel E = E();
        h0.d(E, aVar);
        E.writeLong(j7);
        q0(28, E);
    }

    @Override // d4.p0
    public final void Y0(Bundle bundle, long j7) {
        Parcel E = E();
        h0.c(E, bundle);
        E.writeLong(j7);
        q0(8, E);
    }

    @Override // d4.p0
    public final void f1(String str, long j7) {
        Parcel E = E();
        E.writeString(str);
        E.writeLong(j7);
        q0(23, E);
    }

    @Override // d4.p0
    public final void f2(String str, String str2, r0 r0Var) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        h0.d(E, r0Var);
        q0(10, E);
    }

    @Override // d4.p0
    public final void f5(x3.a aVar, long j7) {
        Parcel E = E();
        h0.d(E, aVar);
        E.writeLong(j7);
        q0(25, E);
    }

    @Override // d4.p0
    public final void i6(String str, String str2, boolean z6, r0 r0Var) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        h0.a(E, z6);
        h0.d(E, r0Var);
        q0(5, E);
    }

    @Override // d4.p0
    public final void l2(String str, String str2, Bundle bundle) {
        Parcel E = E();
        E.writeString(str);
        E.writeString(str2);
        h0.c(E, bundle);
        q0(9, E);
    }

    @Override // d4.p0
    public final void o3(x3.a aVar, String str, String str2, long j7) {
        Parcel E = E();
        h0.d(E, aVar);
        E.writeString(str);
        E.writeString(str2);
        E.writeLong(j7);
        q0(15, E);
    }

    @Override // d4.p0
    public final void p4(x3.a aVar, long j7) {
        Parcel E = E();
        h0.d(E, aVar);
        E.writeLong(j7);
        q0(26, E);
    }

    @Override // d4.p0
    public final void p6(String str, r0 r0Var) {
        Parcel E = E();
        E.writeString(str);
        h0.d(E, r0Var);
        q0(6, E);
    }

    @Override // d4.p0
    public final void q2(x3.a aVar, r0 r0Var, long j7) {
        Parcel E = E();
        h0.d(E, aVar);
        h0.d(E, r0Var);
        E.writeLong(j7);
        q0(31, E);
    }

    @Override // d4.p0
    public final void s1(int i7, String str, x3.a aVar, x3.a aVar2, x3.a aVar3) {
        Parcel E = E();
        E.writeInt(5);
        E.writeString(str);
        h0.d(E, aVar);
        h0.d(E, aVar2);
        h0.d(E, aVar3);
        q0(33, E);
    }

    @Override // d4.p0
    public final void s2(x3.a aVar, s0 s0Var, long j7) {
        Parcel E = E();
        h0.d(E, aVar);
        h0.c(E, s0Var);
        E.writeLong(j7);
        q0(1, E);
    }

    @Override // d4.p0
    public final void s3(r0 r0Var) {
        Parcel E = E();
        h0.d(E, r0Var);
        q0(17, E);
    }

    @Override // d4.p0
    public final void v4(r0 r0Var) {
        Parcel E = E();
        h0.d(E, r0Var);
        q0(16, E);
    }
}
