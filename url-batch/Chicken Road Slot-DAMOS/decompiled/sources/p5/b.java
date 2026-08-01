package p5;

import android.os.Parcel;
import android.util.SparseIntArray;
import s.e;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f7672d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f7673e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7674f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7675h;

    /* renamed from: i, reason: collision with root package name */
    public int f7676i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f7677k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // p5.a
    public final b a() {
        Parcel parcel = this.f7673e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.j;
        if (i3 == this.f7674f) {
            i3 = this.g;
        }
        return new b(parcel, dataPosition, i3, v4.a.o(new StringBuilder(), this.f7675h, "  "), this.f7669a, this.f7670b, this.f7671c);
    }

    @Override // p5.a
    public final boolean e(int i3) {
        while (true) {
            int i10 = this.j;
            int i11 = this.f7677k;
            if (i10 >= this.g) {
                return i11 == i3;
            }
            if (i11 == i3) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i12 = this.j;
            Parcel parcel = this.f7673e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.f7677k = parcel.readInt();
            this.j += readInt;
        }
    }

    @Override // p5.a
    public final void h(int i3) {
        int i10 = this.f7676i;
        SparseIntArray sparseIntArray = this.f7672d;
        Parcel parcel = this.f7673e;
        if (i10 >= 0) {
            int i11 = sparseIntArray.get(i10);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
        this.f7676i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i10, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f7672d = new SparseIntArray();
        this.f7676i = -1;
        this.f7677k = -1;
        this.f7673e = parcel;
        this.f7674f = i3;
        this.g = i10;
        this.j = i3;
        this.f7675h = str;
    }
}
