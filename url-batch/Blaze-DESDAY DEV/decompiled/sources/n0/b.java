package n0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends AbstractC0281a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3238e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3239f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3240g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3241j;

    /* renamed from: k, reason: collision with root package name */
    public int f3242k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // n0.AbstractC0281a
    public final b a() {
        Parcel parcel = this.f3238e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3241j;
        if (i == this.f3239f) {
            i = this.f3240g;
        }
        return new b(parcel, dataPosition, i, this.h + "  ", this.f3235a, this.f3236b, this.f3237c);
    }

    @Override // n0.AbstractC0281a
    public final boolean e(int i) {
        while (this.f3241j < this.f3240g) {
            int i2 = this.f3242k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3241j;
            Parcel parcel = this.f3238e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3242k = parcel.readInt();
            this.f3241j += readInt;
        }
        return this.f3242k == i;
    }

    @Override // n0.AbstractC0281a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3238e;
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
        this.f3242k = -1;
        this.f3238e = parcel;
        this.f3239f = i;
        this.f3240g = i2;
        this.f3241j = i;
        this.h = str;
    }
}
