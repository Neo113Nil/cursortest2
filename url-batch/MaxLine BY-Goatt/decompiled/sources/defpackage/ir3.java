package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ir3 extends w93 {
    public final b01 J(st1 st1Var, String str, int i, st1 st1Var2) {
        Parcel d = d();
        wd3.c(d, st1Var);
        d.writeString(str);
        d.writeInt(i);
        wd3.c(d, st1Var2);
        Parcel b = b(d, 2);
        b01 I = st1.I(b.readStrongBinder());
        b.recycle();
        return I;
    }

    public final b01 K(st1 st1Var, String str, int i, st1 st1Var2) {
        Parcel d = d();
        wd3.c(d, st1Var);
        d.writeString(str);
        d.writeInt(i);
        wd3.c(d, st1Var2);
        Parcel b = b(d, 3);
        b01 I = st1.I(b.readStrongBinder());
        b.recycle();
        return I;
    }
}
