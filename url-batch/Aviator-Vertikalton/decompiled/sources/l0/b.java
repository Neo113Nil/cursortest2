package l0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends AbstractC0300a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f3506d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3507e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3508f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3509g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3510j;

    /* renamed from: k, reason: collision with root package name */
    public int f3511k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // l0.AbstractC0300a
    public final b a() {
        Parcel parcel = this.f3507e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3510j;
        if (i == this.f3508f) {
            i = this.f3509g;
        }
        return new b(parcel, dataPosition, i, this.h + "  ", this.f3503a, this.f3504b, this.f3505c);
    }

    @Override // l0.AbstractC0300a
    public final boolean e(int i) {
        while (this.f3510j < this.f3509g) {
            int i2 = this.f3511k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3510j;
            Parcel parcel = this.f3507e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3511k = parcel.readInt();
            this.f3510j += readInt;
        }
        return this.f3511k == i;
    }

    @Override // l0.AbstractC0300a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.f3506d;
        Parcel parcel = this.f3507e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i2, String str, o.b bVar, o.b bVar2, o.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f3506d = new SparseIntArray();
        this.i = -1;
        this.f3511k = -1;
        this.f3507e = parcel;
        this.f3508f = i;
        this.f3509g = i2;
        this.f3510j = i;
        this.h = str;
    }
}
