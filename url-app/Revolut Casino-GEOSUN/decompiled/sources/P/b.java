package P;

import android.os.Parcel;
import android.util.SparseIntArray;
import k.C0179a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f754d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f755e;

    /* renamed from: f, reason: collision with root package name */
    public final int f756f;

    /* renamed from: g, reason: collision with root package name */
    public final int f757g;

    /* renamed from: h, reason: collision with root package name */
    public final String f758h;

    /* renamed from: i, reason: collision with root package name */
    public int f759i;

    /* renamed from: j, reason: collision with root package name */
    public int f760j;

    /* renamed from: k, reason: collision with root package name */
    public int f761k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0179a(), new C0179a(), new C0179a());
    }

    @Override // P.a
    public final b a() {
        Parcel parcel = this.f755e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f760j;
        if (i2 == this.f756f) {
            i2 = this.f757g;
        }
        return new b(parcel, dataPosition, i2, this.f758h + "  ", this.f751a, this.f752b, this.f753c);
    }

    @Override // P.a
    public final boolean e(int i2) {
        while (this.f760j < this.f757g) {
            int i3 = this.f761k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f760j;
            Parcel parcel = this.f755e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f761k = parcel.readInt();
            this.f760j += readInt;
        }
        return this.f761k == i2;
    }

    @Override // P.a
    public final void h(int i2) {
        int i3 = this.f759i;
        SparseIntArray sparseIntArray = this.f754d;
        Parcel parcel = this.f755e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f759i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, C0179a c0179a, C0179a c0179a2, C0179a c0179a3) {
        super(c0179a, c0179a2, c0179a3);
        this.f754d = new SparseIntArray();
        this.f759i = -1;
        this.f761k = -1;
        this.f755e = parcel;
        this.f756f = i2;
        this.f757g = i3;
        this.f760j = i2;
        this.f758h = str;
    }
}
