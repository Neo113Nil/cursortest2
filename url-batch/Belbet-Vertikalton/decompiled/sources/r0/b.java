package r0;

import G1.AbstractC0001b;
import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends AbstractC0350a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f4031d;
    public final Parcel e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4032f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4033g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4034h;
    public int i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f4035k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new q.b(), new q.b(), new q.b());
    }

    @Override // r0.AbstractC0350a
    public final b a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f4032f) {
            i = this.f4033g;
        }
        return new b(parcel, dataPosition, i, AbstractC0001b.g(new StringBuilder(), this.f4034h, "  "), this.f4028a, this.f4029b, this.f4030c);
    }

    @Override // r0.AbstractC0350a
    public final boolean e(int i) {
        while (this.j < this.f4033g) {
            int i2 = this.f4035k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f4035k = parcel.readInt();
            this.j += readInt;
        }
        return this.f4035k == i;
    }

    @Override // r0.AbstractC0350a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.f4031d;
        Parcel parcel = this.e;
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

    public b(Parcel parcel, int i, int i2, String str, q.b bVar, q.b bVar2, q.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f4031d = new SparseIntArray();
        this.i = -1;
        this.f4035k = -1;
        this.e = parcel;
        this.f4032f = i;
        this.f4033g = i2;
        this.j = i;
        this.f4034h = str;
    }
}
