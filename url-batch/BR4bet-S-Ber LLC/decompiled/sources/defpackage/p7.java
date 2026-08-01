package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class p7 implements Parcelable {
    public static final Parcelable.Creator<p7> CREATOR = new s1(2);
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

    public p7(o7 o7Var) {
        int size = o7Var.a.size();
        this.f = new int[size * 6];
        if (!o7Var.g) {
            g9.s("Not on back stack");
            throw null;
        }
        this.g = new ArrayList(size);
        this.h = new int[size];
        this.i = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            on onVar = (on) o7Var.a.get(i2);
            int i3 = i + 1;
            this.f[i] = onVar.a;
            ArrayList arrayList = this.g;
            pm pmVar = onVar.b;
            arrayList.add(pmVar != null ? pmVar.j : null);
            int[] iArr = this.f;
            iArr[i3] = onVar.c ? 1 : 0;
            iArr[i + 2] = onVar.d;
            iArr[i + 3] = onVar.e;
            int i4 = i + 5;
            iArr[i + 4] = onVar.f;
            i += 6;
            iArr[i4] = onVar.g;
            this.h[i2] = onVar.h.ordinal();
            this.i[i2] = onVar.i.ordinal();
        }
        this.j = o7Var.f;
        this.k = o7Var.h;
        this.l = o7Var.r;
        this.m = o7Var.i;
        this.n = o7Var.j;
        this.o = o7Var.k;
        this.p = o7Var.l;
        this.q = o7Var.m;
        this.r = o7Var.n;
        this.s = o7Var.o;
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

    public p7(Parcel parcel) {
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
