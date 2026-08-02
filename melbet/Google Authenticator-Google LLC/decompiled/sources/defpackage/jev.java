package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jev extends cri {
    public static final Parcelable.Creator CREATOR = new jew();
    public final int a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final Point[] e;
    public final int f;
    public final jeo g;
    public final jer h;
    public final jes i;
    public final jeu j;
    public final jet k;
    public final jep l;
    public final jel m;
    public final jem n;
    public final jen o;

    public jev(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, jeo jeoVar, jer jerVar, jes jesVar, jeu jeuVar, jet jetVar, jep jepVar, jel jelVar, jem jemVar, jen jenVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = pointArr;
        this.f = i2;
        this.g = jeoVar;
        this.h = jerVar;
        this.i = jesVar;
        this.j = jeuVar;
        this.k = jetVar;
        this.l = jepVar;
        this.m = jelVar;
        this.n = jemVar;
        this.o = jenVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int q = oy.q(parcel, 20293);
        oy.v(parcel, 1, i2);
        oy.I(parcel, 2, this.b);
        oy.I(parcel, 3, this.c);
        oy.A(parcel, 4, this.d);
        oy.L(parcel, 5, this.e, i);
        oy.v(parcel, 6, this.f);
        oy.H(parcel, 7, this.g, i);
        oy.H(parcel, 8, this.h, i);
        oy.H(parcel, 9, this.i, i);
        oy.H(parcel, 10, this.j, i);
        oy.H(parcel, 11, this.k, i);
        oy.H(parcel, 12, this.l, i);
        oy.H(parcel, 13, this.m, i);
        oy.H(parcel, 14, this.n, i);
        oy.H(parcel, 15, this.o, i);
        oy.r(parcel, q);
    }
}
