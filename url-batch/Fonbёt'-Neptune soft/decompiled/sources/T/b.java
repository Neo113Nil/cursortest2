package T;

import android.os.Parcel;
import android.util.SparseIntArray;
import n.C0268a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1078d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1079e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1080f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1081g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1082h;

    /* renamed from: i, reason: collision with root package name */
    public int f1083i;

    /* renamed from: j, reason: collision with root package name */
    public int f1084j;

    /* renamed from: k, reason: collision with root package name */
    public int f1085k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0268a(), new C0268a(), new C0268a());
    }

    @Override // T.a
    public final b a() {
        Parcel parcel = this.f1079e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1084j;
        if (i2 == this.f1080f) {
            i2 = this.f1081g;
        }
        return new b(parcel, dataPosition, i2, this.f1082h + "  ", this.f1075a, this.f1076b, this.f1077c);
    }

    @Override // T.a
    public final boolean e(int i2) {
        while (this.f1084j < this.f1081g) {
            int i3 = this.f1085k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f1084j;
            Parcel parcel = this.f1079e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f1085k = parcel.readInt();
            this.f1084j += readInt;
        }
        return this.f1085k == i2;
    }

    @Override // T.a
    public final void h(int i2) {
        int i3 = this.f1083i;
        SparseIntArray sparseIntArray = this.f1078d;
        Parcel parcel = this.f1079e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f1083i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, C0268a c0268a, C0268a c0268a2, C0268a c0268a3) {
        super(c0268a, c0268a2, c0268a3);
        this.f1078d = new SparseIntArray();
        this.f1083i = -1;
        this.f1085k = -1;
        this.f1079e = parcel;
        this.f1080f = i2;
        this.f1081g = i3;
        this.f1084j = i2;
        this.f1082h = str;
    }
}
