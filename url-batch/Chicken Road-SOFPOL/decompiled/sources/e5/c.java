package e5;

import android.os.Parcel;
import android.util.SparseIntArray;
import o.e;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2496d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f2497e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2498f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2499g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2500h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f2501j;

    /* renamed from: k, reason: collision with root package name */
    public int f2502k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // e5.b
    public final c a() {
        Parcel parcel = this.f2497e;
        int dataPosition = parcel.dataPosition();
        int i = this.f2501j;
        if (i == this.f2498f) {
            i = this.f2499g;
        }
        return new c(parcel, dataPosition, i, this.f2500h + "  ", this.f2493a, this.f2494b, this.f2495c);
    }

    @Override // e5.b
    public final boolean e(int i) {
        while (this.f2501j < this.f2499g) {
            int i8 = this.f2502k;
            if (i8 == i) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i9 = this.f2501j;
            Parcel parcel = this.f2497e;
            parcel.setDataPosition(i9);
            int readInt = parcel.readInt();
            this.f2502k = parcel.readInt();
            this.f2501j += readInt;
        }
        return this.f2502k == i;
    }

    @Override // e5.b
    public final void h(int i) {
        int i8 = this.i;
        SparseIntArray sparseIntArray = this.f2496d;
        Parcel parcel = this.f2497e;
        if (i8 >= 0) {
            int i9 = sparseIntArray.get(i8);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(dataPosition - i9);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public c(Parcel parcel, int i, int i8, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f2496d = new SparseIntArray();
        this.i = -1;
        this.f2502k = -1;
        this.f2497e = parcel;
        this.f2498f = i;
        this.f2499g = i8;
        this.f2501j = i;
        this.f2500h = str;
    }
}
