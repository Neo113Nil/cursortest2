package m0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends AbstractC0276a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3171e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3172f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3173g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3174j;

    /* renamed from: k, reason: collision with root package name */
    public int f3175k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // m0.AbstractC0276a
    public final b a() {
        Parcel parcel = this.f3171e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3174j;
        if (i == this.f3172f) {
            i = this.f3173g;
        }
        return new b(parcel, dataPosition, i, this.h + "  ", this.f3168a, this.f3169b, this.f3170c);
    }

    @Override // m0.AbstractC0276a
    public final boolean e(int i) {
        while (this.f3174j < this.f3173g) {
            int i2 = this.f3175k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3174j;
            Parcel parcel = this.f3171e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3175k = parcel.readInt();
            this.f3174j += readInt;
        }
        return this.f3175k == i;
    }

    @Override // m0.AbstractC0276a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3171e;
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
        this.d = new SparseIntArray();
        this.i = -1;
        this.f3175k = -1;
        this.f3171e = parcel;
        this.f3172f = i;
        this.f3173g = i2;
        this.f3174j = i;
        this.h = str;
    }
}
