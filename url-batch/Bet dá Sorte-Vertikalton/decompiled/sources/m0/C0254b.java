package m0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: m0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254b extends AbstractC0253a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3143e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3144f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3145g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3146j;

    /* renamed from: k, reason: collision with root package name */
    public int f3147k;

    public C0254b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // m0.AbstractC0253a
    public final C0254b a() {
        Parcel parcel = this.f3143e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3146j;
        if (i == this.f3144f) {
            i = this.f3145g;
        }
        return new C0254b(parcel, dataPosition, i, this.h + "  ", this.f3140a, this.f3141b, this.f3142c);
    }

    @Override // m0.AbstractC0253a
    public final boolean e(int i) {
        while (this.f3146j < this.f3145g) {
            int i2 = this.f3147k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3146j;
            Parcel parcel = this.f3143e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3147k = parcel.readInt();
            this.f3146j += readInt;
        }
        return this.f3147k == i;
    }

    @Override // m0.AbstractC0253a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f3143e;
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

    public C0254b(Parcel parcel, int i, int i2, String str, o.b bVar, o.b bVar2, o.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.f3147k = -1;
        this.f3143e = parcel;
        this.f3144f = i;
        this.f3145g = i2;
        this.f3146j = i;
        this.h = str;
    }
}
