package l1;

import android.os.Parcel;
import android.util.SparseIntArray;
import q.f;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class b extends a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f2549e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2550f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2551g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2552h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2553j;

    /* renamed from: k, reason: collision with root package name */
    public int f2554k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override // l1.a
    public final b a() {
        Parcel parcel = this.f2549e;
        int dataPosition = parcel.dataPosition();
        int i = this.f2553j;
        if (i == this.f2550f) {
            i = this.f2551g;
        }
        return new b(parcel, dataPosition, i, this.f2552h + "  ", this.f2546a, this.f2547b, this.f2548c);
    }

    @Override // l1.a
    public final boolean e(int i) {
        while (this.f2553j < this.f2551g) {
            int i4 = this.f2554k;
            if (i4 == i) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i5 = this.f2553j;
            Parcel parcel = this.f2549e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f2554k = parcel.readInt();
            this.f2553j += readInt;
        }
        return this.f2554k == i;
    }

    @Override // l1.a
    public final void h(int i) {
        int i4 = this.i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f2549e;
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
        this.f2554k = -1;
        this.f2549e = parcel;
        this.f2550f = i;
        this.f2551g = i4;
        this.f2553j = i;
        this.f2552h = str;
    }
}
