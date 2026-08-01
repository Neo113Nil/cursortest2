package n0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends AbstractC0278a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3205e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3206f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3207g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3208j;

    /* renamed from: k, reason: collision with root package name */
    public int f3209k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // n0.AbstractC0278a
    public final b a() {
        Parcel parcel = this.f3205e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3208j;
        if (i == this.f3206f) {
            i = this.f3207g;
        }
        return new b(parcel, dataPosition, i, this.h + "  ", this.f3202a, this.f3203b, this.f3204c);
    }

    @Override // n0.AbstractC0278a
    public final boolean e(int i) {
        while (this.f3208j < this.f3207g) {
            int i2 = this.f3209k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3208j;
            Parcel parcel = this.f3205e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3209k = parcel.readInt();
            this.f3208j += readInt;
        }
        return this.f3209k == i;
    }

    @Override // n0.AbstractC0278a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3205e;
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
        this.f3209k = -1;
        this.f3205e = parcel;
        this.f3206f = i;
        this.f3207g = i2;
        this.f3208j = i;
        this.h = str;
    }
}
