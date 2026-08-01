package m1;

import android.os.Parcel;
import android.util.SparseIntArray;
import q.f;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f2728e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2729f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2730g;
    public final String h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2731j;

    /* renamed from: k, reason: collision with root package name */
    public int f2732k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override // m1.a
    public final b a() {
        Parcel parcel = this.f2728e;
        int dataPosition = parcel.dataPosition();
        int i = this.f2731j;
        if (i == this.f2729f) {
            i = this.f2730g;
        }
        return new b(parcel, dataPosition, i, this.h + "  ", this.f2725a, this.f2726b, this.f2727c);
    }

    @Override // m1.a
    public final boolean e(int i) {
        while (this.f2731j < this.f2730g) {
            int i4 = this.f2732k;
            if (i4 == i) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i5 = this.f2731j;
            Parcel parcel = this.f2728e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f2732k = parcel.readInt();
            this.f2731j += readInt;
        }
        return this.f2732k == i;
    }

    @Override // m1.a
    public final void h(int i) {
        int i4 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f2728e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public b(Parcel parcel, int i, int i4, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.f2732k = -1;
        this.f2728e = parcel;
        this.f2729f = i;
        this.f2730g = i4;
        this.f2731j = i;
        this.h = str;
    }
}
