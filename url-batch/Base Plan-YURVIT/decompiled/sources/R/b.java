package R;

import android.os.Parcel;
import android.util.SparseIntArray;
import m.C0199a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f814d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f815e;

    /* renamed from: f, reason: collision with root package name */
    public final int f816f;

    /* renamed from: g, reason: collision with root package name */
    public final int f817g;

    /* renamed from: h, reason: collision with root package name */
    public final String f818h;

    /* renamed from: i, reason: collision with root package name */
    public int f819i;

    /* renamed from: j, reason: collision with root package name */
    public int f820j;

    /* renamed from: k, reason: collision with root package name */
    public int f821k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0199a(), new C0199a(), new C0199a());
    }

    @Override // R.a
    public final b a() {
        Parcel parcel = this.f815e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f820j;
        if (i2 == this.f816f) {
            i2 = this.f817g;
        }
        return new b(parcel, dataPosition, i2, this.f818h + "  ", this.f811a, this.f812b, this.f813c);
    }

    @Override // R.a
    public final boolean e(int i2) {
        while (this.f820j < this.f817g) {
            int i3 = this.f821k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f820j;
            Parcel parcel = this.f815e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f821k = parcel.readInt();
            this.f820j += readInt;
        }
        return this.f821k == i2;
    }

    @Override // R.a
    public final void h(int i2) {
        int i3 = this.f819i;
        SparseIntArray sparseIntArray = this.f814d;
        Parcel parcel = this.f815e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f819i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, C0199a c0199a, C0199a c0199a2, C0199a c0199a3) {
        super(c0199a, c0199a2, c0199a3);
        this.f814d = new SparseIntArray();
        this.f819i = -1;
        this.f821k = -1;
        this.f815e = parcel;
        this.f816f = i2;
        this.f817g = i3;
        this.f820j = i2;
        this.f818h = str;
    }
}
