package r0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314b extends AbstractC0313a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3828e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3829f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3830g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3831j;

    /* renamed from: k, reason: collision with root package name */
    public int f3832k;

    public C0314b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // r0.AbstractC0313a
    public final C0314b a() {
        Parcel parcel = this.f3828e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3831j;
        if (i == this.f3829f) {
            i = this.f3830g;
        }
        return new C0314b(parcel, dataPosition, i, this.h + "  ", this.f3825a, this.f3826b, this.f3827c);
    }

    @Override // r0.AbstractC0313a
    public final boolean e(int i) {
        while (this.f3831j < this.f3830g) {
            int i2 = this.f3832k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3831j;
            Parcel parcel = this.f3828e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3832k = parcel.readInt();
            this.f3831j += readInt;
        }
        return this.f3832k == i;
    }

    @Override // r0.AbstractC0313a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3828e;
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

    public C0314b(Parcel parcel, int i, int i2, String str, o.b bVar, o.b bVar2, o.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.f3832k = -1;
        this.f3828e = parcel;
        this.f3829f = i;
        this.f3830g = i2;
        this.f3831j = i;
        this.h = str;
    }
}
