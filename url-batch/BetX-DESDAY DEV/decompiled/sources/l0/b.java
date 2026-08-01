package l0;

import android.os.Parcel;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class b extends AbstractC0302a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f3509d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3510e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3511f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3512g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3513j;

    /* renamed from: k, reason: collision with root package name */
    public int f3514k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new o.b(), new o.b(), new o.b());
    }

    @Override // l0.AbstractC0302a
    public final b a() {
        Parcel parcel = this.f3510e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3513j;
        if (i == this.f3511f) {
            i = this.f3512g;
        }
        return new b(parcel, dataPosition, i, this.h + "  ", this.f3506a, this.f3507b, this.f3508c);
    }

    @Override // l0.AbstractC0302a
    public final boolean e(int i) {
        while (this.f3513j < this.f3512g) {
            int i2 = this.f3514k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f3513j;
            Parcel parcel = this.f3510e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f3514k = parcel.readInt();
            this.f3513j += readInt;
        }
        return this.f3514k == i;
    }

    @Override // l0.AbstractC0302a
    public final void h(int i) {
        int i2 = this.i;
        SparseIntArray sparseIntArray = this.f3509d;
        Parcel parcel = this.f3510e;
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
        this.f3509d = new SparseIntArray();
        this.i = -1;
        this.f3514k = -1;
        this.f3510e = parcel;
        this.f3511f = i;
        this.f3512g = i2;
        this.f3513j = i;
        this.h = str;
    }
}
