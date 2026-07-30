package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xm implements Parcelable {
    public static final Parcelable.Creator<xm> CREATOR = new s3(2);
    public final int[] m;
    public final ArrayList n;
    public final int[] o;
    public final int[] p;
    public final int q;
    public final String r;
    public final int s;
    public final int t;
    public final CharSequence u;
    public final int v;
    public final CharSequence w;
    public final ArrayList x;
    public final ArrayList y;
    public final boolean z;

    public xm(wm wmVar) {
        int size = wmVar.a.size();
        this.m = new int[size * 6];
        if (!wmVar.g) {
            lh.g("Not on back stack");
            throw null;
        }
        this.n = new ArrayList(size);
        this.o = new int[size];
        this.p = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            os0 os0Var = (os0) wmVar.a.get(i2);
            int i3 = i + 1;
            this.m[i] = os0Var.a;
            ArrayList arrayList = this.n;
            fr0 fr0Var = os0Var.b;
            arrayList.add(fr0Var != null ? fr0Var.mWho : null);
            int[] iArr = this.m;
            iArr[i3] = os0Var.c ? 1 : 0;
            iArr[i + 2] = os0Var.d;
            iArr[i + 3] = os0Var.e;
            int i4 = i + 5;
            iArr[i + 4] = os0Var.f;
            i += 6;
            iArr[i4] = os0Var.g;
            this.o[i2] = os0Var.h.ordinal();
            this.p[i2] = os0Var.i.ordinal();
        }
        this.q = wmVar.f;
        this.r = wmVar.h;
        this.s = wmVar.r;
        this.t = wmVar.i;
        this.u = wmVar.j;
        this.v = wmVar.k;
        this.w = wmVar.l;
        this.x = wmVar.m;
        this.y = wmVar.n;
        this.z = wmVar.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.m);
        parcel.writeStringList(this.n);
        parcel.writeIntArray(this.o);
        parcel.writeIntArray(this.p);
        parcel.writeInt(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        TextUtils.writeToParcel(this.u, parcel, 0);
        parcel.writeInt(this.v);
        TextUtils.writeToParcel(this.w, parcel, 0);
        parcel.writeStringList(this.x);
        parcel.writeStringList(this.y);
        parcel.writeInt(this.z ? 1 : 0);
    }

    public xm(Parcel parcel) {
        this.m = parcel.createIntArray();
        this.n = parcel.createStringArrayList();
        this.o = parcel.createIntArray();
        this.p = parcel.createIntArray();
        this.q = parcel.readInt();
        this.r = parcel.readString();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.u = (CharSequence) creator.createFromParcel(parcel);
        this.v = parcel.readInt();
        this.w = (CharSequence) creator.createFromParcel(parcel);
        this.x = parcel.createStringArrayList();
        this.y = parcel.createStringArrayList();
        this.z = parcel.readInt() != 0;
    }
}
