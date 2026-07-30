package F0;

import android.os.Parcel;
import android.util.SparseIntArray;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f944d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f945e;

    /* renamed from: f, reason: collision with root package name */
    public final int f946f;

    /* renamed from: g, reason: collision with root package name */
    public final int f947g;

    /* renamed from: h, reason: collision with root package name */
    public final String f948h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f949j;

    /* renamed from: k, reason: collision with root package name */
    public int f950k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new s.b(), new s.b(), new s.b());
    }

    @Override // F0.b
    public final c a() {
        Parcel parcel = this.f945e;
        int dataPosition = parcel.dataPosition();
        int i = this.f949j;
        if (i == this.f946f) {
            i = this.f947g;
        }
        return new c(parcel, dataPosition, i, AbstractC5051n.g(new StringBuilder(), this.f948h, "  "), this.f941a, this.f942b, this.f943c);
    }

    @Override // F0.b
    public final boolean e(int i) {
        while (this.f949j < this.f947g) {
            int i4 = this.f950k;
            if (i4 == i) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i9 = this.f949j;
            Parcel parcel = this.f945e;
            parcel.setDataPosition(i9);
            int readInt = parcel.readInt();
            this.f950k = parcel.readInt();
            this.f949j += readInt;
        }
        return this.f950k == i;
    }

    @Override // F0.b
    public final void h(int i) {
        int i4 = this.i;
        SparseIntArray sparseIntArray = this.f944d;
        Parcel parcel = this.f945e;
        if (i4 >= 0) {
            int i9 = sparseIntArray.get(i4);
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

    public c(Parcel parcel, int i, int i4, String str, s.b bVar, s.b bVar2, s.b bVar3) {
        super(bVar, bVar2, bVar3);
        this.f944d = new SparseIntArray();
        this.i = -1;
        this.f950k = -1;
        this.f945e = parcel;
        this.f946f = i;
        this.f947g = i4;
        this.f949j = i;
        this.f948h = str;
    }
}
