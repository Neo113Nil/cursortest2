package o0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends AbstractC0281a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3410e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3411f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3412g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3413h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3414j;

    /* renamed from: k, reason: collision with root package name */
    public int f3415k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p.b(), new p.b(), new p.b());
    }

    @Override // o0.AbstractC0281a
    public final b a() {
        Parcel parcel = this.f3410e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3414j;
        if (i == this.f3411f) {
            i = this.f3412g;
        }
        return new b(parcel, dataPosition, i, this.f3413h + "  ", this.f3407a, this.f3408b, this.f3409c);
    }

    @Override // o0.AbstractC0281a
    public final boolean e(int i) {
        while (this.f3414j < this.f3412g) {
            int i2 = this.f3415k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3414j;
            Parcel parcel = this.f3410e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3415k = parcel.readInt();
            this.f3414j += readInt;
        }
        return this.f3415k == i;
    }

    @Override // o0.AbstractC0281a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3410e;
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

    public b(Parcel parcel, int i, int i2, String str, p.b bVar, p.b bVar2, p.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.f3415k = -1;
        this.f3410e = parcel;
        this.f3411f = i;
        this.f3412g = i2;
        this.f3414j = i;
        this.f3413h = str;
    }
}
