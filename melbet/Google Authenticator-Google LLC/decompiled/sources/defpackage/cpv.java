package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cpv extends cri {
    public static final Parcelable.Creator CREATOR = new ckq(19);
    Bundle a;
    cli[] b;
    int c;
    public cpw d;
    cpx e;

    public cpv(Bundle bundle, cli[] cliVarArr, int i, cpw cpwVar, cpx cpxVar) {
        this.a = bundle;
        this.b = cliVarArr;
        this.c = i;
        this.d = cpwVar;
        this.e = cpxVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = oy.q(parcel, 20293);
        oy.z(parcel, 1, this.a);
        oy.L(parcel, 2, this.b, i);
        oy.v(parcel, 3, this.c);
        oy.H(parcel, 4, this.d, i);
        oy.H(parcel, 5, this.e, i);
        oy.r(parcel, q);
    }

    public cpv() {
    }
}
