package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.dl;
import defpackage.o8;
import defpackage.v1;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new v1(2);
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

    public b(a aVar) {
        int size = aVar.a.size();
        this.f = new int[size * 6];
        if (!aVar.g) {
            o8.t("Not on back stack");
            throw null;
        }
        this.g = new ArrayList(size);
        this.h = new int[size];
        this.i = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            dl dlVar = (dl) aVar.a.get(i2);
            int i3 = i + 1;
            this.f[i] = dlVar.a;
            ArrayList arrayList = this.g;
            Fragment fragment = dlVar.b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f;
            iArr[i3] = dlVar.c ? 1 : 0;
            iArr[i + 2] = dlVar.d;
            iArr[i + 3] = dlVar.e;
            int i4 = i + 5;
            iArr[i + 4] = dlVar.f;
            i += 6;
            iArr[i4] = dlVar.g;
            this.h[i2] = dlVar.h.ordinal();
            this.i[i2] = dlVar.i.ordinal();
        }
        this.j = aVar.f;
        this.k = aVar.h;
        this.l = aVar.r;
        this.m = aVar.i;
        this.n = aVar.j;
        this.o = aVar.k;
        this.p = aVar.l;
        this.q = aVar.m;
        this.r = aVar.n;
        this.s = aVar.o;
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

    public b(Parcel parcel) {
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
