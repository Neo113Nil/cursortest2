package A1;

import android.os.Parcel;
import android.util.SparseIntArray;
import j.C0487e;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f15d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f16e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18g;

    /* renamed from: h, reason: collision with root package name */
    public final String f19h;

    /* renamed from: i, reason: collision with root package name */
    public int f20i;

    /* renamed from: j, reason: collision with root package name */
    public int f21j;

    /* renamed from: k, reason: collision with root package name */
    public int f22k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0487e(), new C0487e(), new C0487e());
    }

    @Override // A1.b
    public final c a() {
        Parcel parcel = this.f16e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f21j;
        if (i3 == this.f17f) {
            i3 = this.f18g;
        }
        return new c(parcel, dataPosition, i3, this.f19h + "  ", this.f12a, this.f13b, this.f14c);
    }

    @Override // A1.b
    public final boolean e(int i3) {
        while (this.f21j < this.f18g) {
            int i4 = this.f22k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f21j;
            Parcel parcel = this.f16e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f22k = parcel.readInt();
            this.f21j += readInt;
        }
        return this.f22k == i3;
    }

    @Override // A1.b
    public final void h(int i3) {
        int i4 = this.f20i;
        SparseIntArray sparseIntArray = this.f15d;
        Parcel parcel = this.f16e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.f20i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public c(Parcel parcel, int i3, int i4, String str, C0487e c0487e, C0487e c0487e2, C0487e c0487e3) {
        super(c0487e, c0487e2, c0487e3);
        this.f15d = new SparseIntArray();
        this.f20i = -1;
        this.f22k = -1;
        this.f16e = parcel;
        this.f17f = i3;
        this.f18g = i4;
        this.f21j = i3;
        this.f19h = str;
    }
}
