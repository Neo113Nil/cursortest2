package m0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends AbstractC0276a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3194e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3195f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3196g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3197j;

    /* renamed from: k, reason: collision with root package name */
    public int f3198k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // m0.AbstractC0276a
    public final b a() {
        Parcel parcel = this.f3194e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3197j;
        if (i == this.f3195f) {
            i = this.f3196g;
        }
        return new b(parcel, dataPosition, i, this.h + "  ", this.f3191a, this.f3192b, this.f3193c);
    }

    @Override // m0.AbstractC0276a
    public final boolean e(int i) {
        while (this.f3197j < this.f3196g) {
            int i2 = this.f3198k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3197j;
            Parcel parcel = this.f3194e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3198k = parcel.readInt();
            this.f3197j += readInt;
        }
        return this.f3198k == i;
    }

    @Override // m0.AbstractC0276a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3194e;
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
        this.f3198k = -1;
        this.f3194e = parcel;
        this.f3195f = i;
        this.f3196g = i2;
        this.f3197j = i;
        this.h = str;
    }
}
