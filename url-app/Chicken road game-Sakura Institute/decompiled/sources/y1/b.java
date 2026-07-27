package y1;

import A.AbstractC0017m;
import android.os.Parcel;
import android.util.SparseIntArray;
import i.C0670e;

/* loaded from: classes.dex */
public final class b extends AbstractC1320a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f11646d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f11647e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11648f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11649g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11650h;

    /* renamed from: i, reason: collision with root package name */
    public int f11651i;

    /* renamed from: j, reason: collision with root package name */
    public int f11652j;

    /* renamed from: k, reason: collision with root package name */
    public int f11653k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0670e(0), new C0670e(0), new C0670e(0));
    }

    @Override // y1.AbstractC1320a
    public final b a() {
        Parcel parcel = this.f11647e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f11652j;
        if (i2 == this.f11648f) {
            i2 = this.f11649g;
        }
        return new b(parcel, dataPosition, i2, AbstractC0017m.n(new StringBuilder(), this.f11650h, "  "), this.f11643a, this.f11644b, this.f11645c);
    }

    @Override // y1.AbstractC1320a
    public final boolean e(int i2) {
        while (this.f11652j < this.f11649g) {
            int i4 = this.f11653k;
            if (i4 == i2) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i5 = this.f11652j;
            Parcel parcel = this.f11647e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f11653k = parcel.readInt();
            this.f11652j += readInt;
        }
        return this.f11653k == i2;
    }

    @Override // y1.AbstractC1320a
    public final void h(int i2) {
        int i4 = this.f11651i;
        SparseIntArray sparseIntArray = this.f11646d;
        Parcel parcel = this.f11647e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.f11651i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i4, String str, C0670e c0670e, C0670e c0670e2, C0670e c0670e3) {
        super(c0670e, c0670e2, c0670e3);
        this.f11646d = new SparseIntArray();
        this.f11651i = -1;
        this.f11653k = -1;
        this.f11647e = parcel;
        this.f11648f = i2;
        this.f11649g = i4;
        this.f11652j = i2;
        this.f11650h = str;
    }
}
