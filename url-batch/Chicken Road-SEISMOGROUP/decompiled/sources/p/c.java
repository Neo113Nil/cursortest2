package p;

import android.os.Parcel;
import android.util.SparseIntArray;
import e.C0022a;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1124d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1125e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1126f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1127g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1128h;

    /* renamed from: i, reason: collision with root package name */
    public int f1129i;

    /* renamed from: j, reason: collision with root package name */
    public int f1130j;

    /* renamed from: k, reason: collision with root package name */
    public int f1131k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0022a(), new C0022a(), new C0022a());
    }

    @Override // p.b
    public final c a() {
        Parcel parcel = this.f1125e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1130j;
        if (i2 == this.f1126f) {
            i2 = this.f1127g;
        }
        return new c(parcel, dataPosition, i2, this.f1128h + "  ", this.f1121a, this.f1122b, this.f1123c);
    }

    @Override // p.b
    public final boolean e(int i2) {
        while (this.f1130j < this.f1127g) {
            int i3 = this.f1131k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f1130j;
            Parcel parcel = this.f1125e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f1131k = parcel.readInt();
            this.f1130j += readInt;
        }
        return this.f1131k == i2;
    }

    @Override // p.b
    public final void h(int i2) {
        int i3 = this.f1129i;
        SparseIntArray sparseIntArray = this.f1124d;
        Parcel parcel = this.f1125e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f1129i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public c(Parcel parcel, int i2, int i3, String str, C0022a c0022a, C0022a c0022a2, C0022a c0022a3) {
        super(c0022a, c0022a2, c0022a3);
        this.f1124d = new SparseIntArray();
        this.f1129i = -1;
        this.f1131k = -1;
        this.f1125e = parcel;
        this.f1126f = i2;
        this.f1127g = i3;
        this.f1130j = i2;
        this.f1128h = str;
    }
}
