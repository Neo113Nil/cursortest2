package a0;

import N.p;
import android.os.Parcel;
import android.util.SparseIntArray;
import q.C0582b;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221b extends AbstractC0220a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f3116d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f3117e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3118f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3119g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3120h;

    /* renamed from: i, reason: collision with root package name */
    public int f3121i;

    /* renamed from: j, reason: collision with root package name */
    public int f3122j;

    /* renamed from: k, reason: collision with root package name */
    public int f3123k;

    public C0221b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0582b(), new C0582b(), new C0582b());
    }

    @Override // a0.AbstractC0220a
    public final C0221b a() {
        Parcel parcel = this.f3117e;
        int dataPosition = parcel.dataPosition();
        int i7 = this.f3122j;
        if (i7 == this.f3118f) {
            i7 = this.f3119g;
        }
        return new C0221b(parcel, dataPosition, i7, p.b(new StringBuilder(), this.f3120h, "  "), this.f3113a, this.f3114b, this.f3115c);
    }

    @Override // a0.AbstractC0220a
    public final boolean e(int i7) {
        while (this.f3122j < this.f3119g) {
            int i8 = this.f3123k;
            if (i8 == i7) {
                return true;
            }
            if (String.valueOf(i8).compareTo(String.valueOf(i7)) > 0) {
                return false;
            }
            int i9 = this.f3122j;
            Parcel parcel = this.f3117e;
            parcel.setDataPosition(i9);
            int readInt = parcel.readInt();
            this.f3123k = parcel.readInt();
            this.f3122j += readInt;
        }
        return this.f3123k == i7;
    }

    @Override // a0.AbstractC0220a
    public final void h(int i7) {
        int i8 = this.f3121i;
        SparseIntArray sparseIntArray = this.f3116d;
        Parcel parcel = this.f3117e;
        if (i8 >= 0) {
            int i9 = sparseIntArray.get(i8);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i9);
            parcel.writeInt(dataPosition - i9);
            parcel.setDataPosition(dataPosition);
        }
        this.f3121i = i7;
        sparseIntArray.put(i7, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i7);
    }

    public C0221b(Parcel parcel, int i7, int i8, String str, C0582b c0582b, C0582b c0582b2, C0582b c0582b3) {
        super(c0582b, c0582b2, c0582b3);
        this.f3116d = new SparseIntArray();
        this.f3121i = -1;
        this.f3123k = -1;
        this.f3117e = parcel;
        this.f3118f = i7;
        this.f3119g = i8;
        this.f3122j = i7;
        this.f3120h = str;
    }
}
