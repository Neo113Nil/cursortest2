package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class f7 implements Parcelable {
    public static final Parcelable.Creator<f7> CREATOR = new r1(2);
    public final int[] f;
    public final ArrayList g;
    public final int[] h;
    public final int[] i;
    public final int j;
    public final String k;
    public final int l;
    public final int m;
    public final CharSequence n;
    public final int o;
    public final CharSequence p;
    public final ArrayList q;
    public final ArrayList r;
    public final boolean s;

    public f7(e7 e7Var) {
        int size = e7Var.a.size();
        this.f = new int[size * 6];
        if (!e7Var.g) {
            t8.t("Not on back stack");
            throw null;
        }
        this.g = new ArrayList(size);
        this.h = new int[size];
        this.i = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jl jlVar = (jl) e7Var.a.get(i2);
            int i3 = i + 1;
            this.f[i] = jlVar.a;
            ArrayList arrayList = this.g;
            mk mkVar = jlVar.b;
            arrayList.add(mkVar != null ? mkVar.j : null);
            int[] iArr = this.f;
            iArr[i3] = jlVar.c ? 1 : 0;
            iArr[i + 2] = jlVar.d;
            iArr[i + 3] = jlVar.e;
            int i4 = i + 5;
            iArr[i + 4] = jlVar.f;
            i += 6;
            iArr[i4] = jlVar.g;
            this.h[i2] = jlVar.h.ordinal();
            this.i[i2] = jlVar.i.ordinal();
        }
        this.j = e7Var.f;
        this.k = e7Var.h;
        this.l = e7Var.r;
        this.m = e7Var.i;
        this.n = e7Var.j;
        this.o = e7Var.k;
        this.p = e7Var.l;
        this.q = e7Var.m;
        this.r = e7Var.n;
        this.s = e7Var.o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f);
        parcel.writeStringList(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeInt(this.o);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeStringList(this.q);
        parcel.writeStringList(this.r);
        parcel.writeInt(this.s ? 1 : 0);
    }

    public f7(Parcel parcel) {
        this.f = parcel.createIntArray();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.i = parcel.createIntArray();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.n = (CharSequence) creator.createFromParcel(parcel);
        this.o = parcel.readInt();
        this.p = (CharSequence) creator.createFromParcel(parcel);
        this.q = parcel.createStringArrayList();
        this.r = parcel.createStringArrayList();
        this.s = parcel.readInt() != 0;
    }
}
