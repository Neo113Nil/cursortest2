package Z;

import E1.AbstractC0033i;
import android.os.Parcel;
import android.util.SparseIntArray;
import p.C1169e;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1908d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1909e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1910g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1911h;

    /* renamed from: i, reason: collision with root package name */
    public int f1912i;

    /* renamed from: j, reason: collision with root package name */
    public int f1913j;

    /* renamed from: k, reason: collision with root package name */
    public int f1914k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1169e(0), new C1169e(0), new C1169e(0));
    }

    @Override // Z.a
    public final b a() {
        Parcel parcel = this.f1909e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f1913j;
        if (i3 == this.f) {
            i3 = this.f1910g;
        }
        return new b(parcel, dataPosition, i3, AbstractC0033i.m(new StringBuilder(), this.f1911h, "  "), this.f1905a, this.f1906b, this.f1907c);
    }

    @Override // Z.a
    public final boolean e(int i3) {
        while (this.f1913j < this.f1910g) {
            int i4 = this.f1914k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f1913j;
            Parcel parcel = this.f1909e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f1914k = parcel.readInt();
            this.f1913j += readInt;
        }
        return this.f1914k == i3;
    }

    @Override // Z.a
    public final void i(int i3) {
        int i4 = this.f1912i;
        SparseIntArray sparseIntArray = this.f1908d;
        Parcel parcel = this.f1909e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.f1912i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public b(Parcel parcel, int i3, int i4, String str, C1169e c1169e, C1169e c1169e2, C1169e c1169e3) {
        super(c1169e, c1169e2, c1169e3);
        this.f1908d = new SparseIntArray();
        this.f1912i = -1;
        this.f1914k = -1;
        this.f1909e = parcel;
        this.f = i3;
        this.f1910g = i4;
        this.f1913j = i3;
        this.f1911h = str;
    }
}
