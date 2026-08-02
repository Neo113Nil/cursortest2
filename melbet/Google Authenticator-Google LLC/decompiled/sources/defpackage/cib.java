package defpackage;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cib extends cri {
    public static final Parcelable.Creator CREATOR = new aqr(13);
    public final cid a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final int g;
    public final String h;
    public final boolean i;
    public final byte[] j;
    public final String k;
    public final boolean l;
    public final Network m;
    public final boolean n;
    public final int o;

    public cib(cid cidVar, String str, List list, List list2, List list3, List list4, int i, String str2, boolean z, byte[] bArr, String str3, boolean z2, Network network, boolean z3, int i2) {
        this.a = cidVar;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = str2;
        this.i = z;
        this.j = bArr;
        this.k = str3;
        this.l = z2;
        this.m = network;
        this.n = z3;
        this.o = i2;
    }

    public static cia a() {
        cia ciaVar = new cia();
        ciaVar.h = (byte) (ciaVar.h | 2);
        ciaVar.c(0);
        ciaVar.d(false);
        ciaVar.e(false);
        ciaVar.g = 1;
        ciaVar.h = (byte) (ciaVar.h | 16);
        return ciaVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cid cidVar = this.a;
        int q = oy.q(parcel, 20293);
        oy.H(parcel, 1, cidVar, i);
        oy.I(parcel, 2, this.b);
        oy.K(parcel, 3, this.c);
        oy.K(parcel, 4, this.d);
        oy.K(parcel, 5, this.e);
        oy.K(parcel, 6, this.f);
        oy.v(parcel, 7, this.g);
        oy.I(parcel, 8, this.h);
        oy.s(parcel, 9, this.i);
        oy.A(parcel, 10, this.j);
        oy.I(parcel, 11, this.k);
        oy.s(parcel, 12, this.l);
        oy.H(parcel, 13, this.m, i);
        oy.s(parcel, 14, this.n);
        oy.v(parcel, 15, this.o);
        oy.r(parcel, q);
    }
}
