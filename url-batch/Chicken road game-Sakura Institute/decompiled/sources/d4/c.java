package d4;

import a0.m;
import android.os.Parcel;
import android.util.SparseIntArray;
import i.e;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2597d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f2598e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2599f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2600g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2601h;

    /* renamed from: i, reason: collision with root package name */
    public int f2602i;

    /* renamed from: j, reason: collision with root package name */
    public int f2603j;

    /* renamed from: k, reason: collision with root package name */
    public int f2604k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // d4.b
    public final c a() {
        Parcel parcel = this.f2598e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f2603j;
        if (i7 == this.f2599f) {
            i7 = this.f2600g;
        }
        return new c(parcel, dataPosition, i7, m.m(new StringBuilder(), this.f2601h, "  "), this.f2594a, this.f2595b, this.f2596c);
    }

    @Override // d4.b
    public final boolean e(int i7) {
        while (this.f2603j < this.f2600g) {
            int i8 = this.f2604k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i9 = this.f2603j;
            Parcel parcel = this.f2598e;
            parcel.setDataPosition(i9);
            int readInt = parcel.readInt();
            this.f2604k = parcel.readInt();
            this.f2603j += readInt;
        }
        return this.f2604k == i7;
    }

    @Override // d4.b
    public final void h(int i7) {
        int i8 = this.f2602i;
        SparseIntArray sparseIntArray = this.f2597d;
        Parcel parcel = this.f2598e;
        if (i8 >= 0) {
            int i9 = sparseIntArray.get(i8);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(dataPosition - i9);
            parcel.setDataPosition(dataPosition);
        }
        this.f2602i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public c(Parcel parcel, int i7, int i8, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f2597d = new SparseIntArray();
        this.f2602i = -1;
        this.f2604k = -1;
        this.f2598e = parcel;
        this.f2599f = i7;
        this.f2600g = i8;
        this.f2603j = i7;
        this.f2601h = str;
    }
}
