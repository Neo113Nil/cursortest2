package p0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311b extends AbstractC0310a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3391e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3392f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3393g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3394j;

    /* renamed from: k, reason: collision with root package name */
    public int f3395k;

    public C0311b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // p0.AbstractC0310a
    public final C0311b a() {
        Parcel parcel = this.f3391e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3394j;
        if (i == this.f3392f) {
            i = this.f3393g;
        }
        return new C0311b(parcel, dataPosition, i, this.h + "  ", this.f3388a, this.f3389b, this.f3390c);
    }

    @Override // p0.AbstractC0310a
    public final boolean e(int i) {
        while (this.f3394j < this.f3393g) {
            int i2 = this.f3395k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3394j;
            Parcel parcel = this.f3391e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3395k = parcel.readInt();
            this.f3394j += readInt;
        }
        return this.f3395k == i;
    }

    @Override // p0.AbstractC0310a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3391e;
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

    public C0311b(Parcel parcel, int i, int i2, String str, o.b bVar, o.b bVar2, o.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.f3395k = -1;
        this.f3391e = parcel;
        this.f3392f = i;
        this.f3393g = i2;
        this.f3394j = i;
        this.h = str;
    }
}
