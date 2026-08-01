package o0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253b extends AbstractC0252a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3307e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3308f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3309g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3310j;

    /* renamed from: k, reason: collision with root package name */
    public int f3311k;

    public C0253b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new q.b(), new q.b(), new q.b());
    }

    @Override // o0.AbstractC0252a
    public final C0253b a() {
        Parcel parcel = this.f3307e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3310j;
        if (i == this.f3308f) {
            i = this.f3309g;
        }
        return new C0253b(parcel, dataPosition, i, this.h + "  ", this.f3304a, this.f3305b, this.f3306c);
    }

    @Override // o0.AbstractC0252a
    public final boolean e(int i) {
        while (this.f3310j < this.f3309g) {
            int i2 = this.f3311k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3310j;
            Parcel parcel = this.f3307e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3311k = parcel.readInt();
            this.f3310j += readInt;
        }
        return this.f3311k == i;
    }

    @Override // o0.AbstractC0252a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3307e;
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

    public C0253b(Parcel parcel, int i, int i2, String str, q.b bVar, q.b bVar2, q.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.f3311k = -1;
        this.f3307e = parcel;
        this.f3308f = i;
        this.f3309g = i2;
        this.f3310j = i;
        this.h = str;
    }
}
