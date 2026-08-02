package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class af implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ag(1);
    final int[] a;
    final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;

    public af(ae aeVar) {
        int size = aeVar.d.size();
        this.a = new int[size * 6];
        if (!aeVar.j) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ce ceVar = (ce) aeVar.d.get(i2);
            int i3 = i + 1;
            this.a[i] = ceVar.a;
            ArrayList arrayList = this.b;
            bd bdVar = ceVar.b;
            arrayList.add(bdVar != null ? bdVar.m : null);
            int[] iArr = this.a;
            iArr[i3] = ceVar.c ? 1 : 0;
            iArr[i + 2] = ceVar.d;
            iArr[i + 3] = ceVar.e;
            int i4 = i + 5;
            iArr[i + 4] = ceVar.f;
            i += 6;
            iArr[i4] = ceVar.g;
            this.c[i2] = ceVar.h.ordinal();
            this.d[i2] = ceVar.i.ordinal();
        }
        this.e = aeVar.i;
        this.f = aeVar.l;
        this.g = aeVar.c;
        this.h = aeVar.m;
        this.i = aeVar.n;
        this.j = aeVar.o;
        this.k = aeVar.p;
        this.l = aeVar.q;
        this.m = aeVar.r;
        this.n = aeVar.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public af(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
