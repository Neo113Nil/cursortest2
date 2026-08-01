package s7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.p5;
import com.google.android.gms.internal.measurement.r5;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f0 extends p5 implements h0 {
    public f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // s7.h0
    public final byte[] A(String str, u uVar) {
        Parcel F = F();
        r5.b(F, uVar);
        F.writeString(str);
        Parcel E = E(F, 9);
        byte[] createByteArray = E.createByteArray();
        E.recycle();
        return createByteArray;
    }

    @Override // s7.h0
    public final void B(u uVar, r4 r4Var) {
        Parcel F = F();
        r5.b(F, uVar);
        r5.b(F, r4Var);
        G(F, 1);
    }

    @Override // s7.h0
    public final void a(r4 r4Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        G(F, 4);
    }

    @Override // s7.h0
    public final List c(String str, String str2, String str3, boolean z10) {
        Parcel F = F();
        F.writeString(null);
        F.writeString(str2);
        F.writeString(str3);
        ClassLoader classLoader = r5.f2731a;
        F.writeInt(z10 ? 1 : 0);
        Parcel E = E(F, 15);
        ArrayList createTypedArrayList = E.createTypedArrayList(m4.CREATOR);
        E.recycle();
        return createTypedArrayList;
    }

    @Override // s7.h0
    public final void d(r4 r4Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        G(F, 18);
    }

    @Override // s7.h0
    public final void f(r4 r4Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        G(F, 27);
    }

    @Override // s7.h0
    public final void g(Bundle bundle, r4 r4Var) {
        Parcel F = F();
        r5.b(F, bundle);
        r5.b(F, r4Var);
        G(F, 19);
    }

    @Override // s7.h0
    public final List h(String str, String str2, boolean z10, r4 r4Var) {
        Parcel F = F();
        F.writeString(str);
        F.writeString(str2);
        ClassLoader classLoader = r5.f2731a;
        F.writeInt(z10 ? 1 : 0);
        r5.b(F, r4Var);
        Parcel E = E(F, 14);
        ArrayList createTypedArrayList = E.createTypedArrayList(m4.CREATOR);
        E.recycle();
        return createTypedArrayList;
    }

    @Override // s7.h0
    public final void i(r4 r4Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        G(F, 25);
    }

    @Override // s7.h0
    public final void l(long j, String str, String str2, String str3) {
        Parcel F = F();
        F.writeLong(j);
        F.writeString(str);
        F.writeString(str2);
        F.writeString(str3);
        G(F, 10);
    }

    @Override // s7.h0
    public final String m(r4 r4Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        Parcel E = E(F, 11);
        String readString = E.readString();
        E.recycle();
        return readString;
    }

    @Override // s7.h0
    public final List n(String str, String str2, r4 r4Var) {
        Parcel F = F();
        F.writeString(str);
        F.writeString(str2);
        r5.b(F, r4Var);
        Parcel E = E(F, 16);
        ArrayList createTypedArrayList = E.createTypedArrayList(e.CREATOR);
        E.recycle();
        return createTypedArrayList;
    }

    @Override // s7.h0
    public final void o(r4 r4Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        G(F, 26);
    }

    @Override // s7.h0
    public final void p(r4 r4Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        G(F, 6);
    }

    @Override // s7.h0
    public final void q(r4 r4Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        G(F, 20);
    }

    @Override // s7.h0
    public final List r(String str, String str2, String str3) {
        Parcel F = F();
        F.writeString(null);
        F.writeString(str2);
        F.writeString(str3);
        Parcel E = E(F, 17);
        ArrayList createTypedArrayList = E.createTypedArrayList(e.CREATOR);
        E.recycle();
        return createTypedArrayList;
    }

    @Override // s7.h0
    public final void s(e eVar, r4 r4Var) {
        Parcel F = F();
        r5.b(F, eVar);
        r5.b(F, r4Var);
        G(F, 12);
    }

    @Override // s7.h0
    public final void u(r4 r4Var, d dVar) {
        Parcel F = F();
        r5.b(F, r4Var);
        r5.b(F, dVar);
        G(F, 30);
    }

    @Override // s7.h0
    public final i v(r4 r4Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        Parcel E = E(F, 21);
        i iVar = (i) r5.a(E, i.CREATOR);
        E.recycle();
        return iVar;
    }

    @Override // s7.h0
    public final void x(m4 m4Var, r4 r4Var) {
        Parcel F = F();
        r5.b(F, m4Var);
        r5.b(F, r4Var);
        G(F, 2);
    }

    @Override // s7.h0
    public final void y(r4 r4Var, b4 b4Var, l0 l0Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        r5.b(F, b4Var);
        r5.c(F, l0Var);
        G(F, 29);
    }

    @Override // s7.h0
    public final void z(r4 r4Var, Bundle bundle, j0 j0Var) {
        Parcel F = F();
        r5.b(F, r4Var);
        r5.b(F, bundle);
        r5.c(F, j0Var);
        G(F, 31);
    }
}
