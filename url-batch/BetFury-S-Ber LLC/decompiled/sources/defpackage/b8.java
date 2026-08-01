package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.a;
import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class b8 implements Parcelable {
    public static final Parcelable.Creator<b8> CREATOR = new u1(2);
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

    public b8(a8 a8Var) {
        int size = a8Var.a.size();
        this.f = new int[size * 6];
        if (!a8Var.g) {
            s9.u("Not on back stack");
            throw null;
        }
        this.g = new ArrayList(size);
        this.h = new int[size];
        this.i = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            uq uqVar = (uq) a8Var.a.get(i2);
            int i3 = i + 1;
            this.f[i] = uqVar.a;
            ArrayList arrayList = this.g;
            a aVar = uqVar.b;
            arrayList.add(aVar != null ? aVar.j : null);
            int[] iArr = this.f;
            iArr[i3] = uqVar.c ? 1 : 0;
            iArr[i + 2] = uqVar.d;
            iArr[i + 3] = uqVar.e;
            int i4 = i + 5;
            iArr[i + 4] = uqVar.f;
            i += 6;
            iArr[i4] = uqVar.g;
            this.h[i2] = uqVar.h.ordinal();
            this.i[i2] = uqVar.i.ordinal();
        }
        this.j = a8Var.f;
        this.k = a8Var.h;
        this.l = a8Var.r;
        this.m = a8Var.i;
        this.n = a8Var.j;
        this.o = a8Var.k;
        this.p = a8Var.l;
        this.q = a8Var.m;
        this.r = a8Var.n;
        this.s = a8Var.o;
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

    public b8(Parcel parcel) {
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
