package t0;

import android.os.Parcel;
import android.util.SparseIntArray;
import r4.f;
import u.C0934e;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903b extends AbstractC0902a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f7887d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f7888e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7889f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7890g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7891h;

    /* renamed from: i, reason: collision with root package name */
    public int f7892i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f7893k;

    public C0903b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0934e(0), new C0934e(0), new C0934e(0));
    }

    @Override // t0.AbstractC0902a
    public final C0903b a() {
        Parcel parcel = this.f7888e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.j;
        if (i2 == this.f7889f) {
            i2 = this.f7890g;
        }
        return new C0903b(parcel, dataPosition, i2, f.f(new StringBuilder(), this.f7891h, "  "), this.f7884a, this.f7885b, this.f7886c);
    }

    @Override // t0.AbstractC0902a
    public final boolean e(int i2) {
        while (this.j < this.f7890g) {
            int i5 = this.f7893k;
            if (i5 == i2) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i7 = this.j;
            Parcel parcel = this.f7888e;
            parcel.setDataPosition(i7);
            int readInt = parcel.readInt();
            this.f7893k = parcel.readInt();
            this.j += readInt;
        }
        return this.f7893k == i2;
    }

    @Override // t0.AbstractC0902a
    public final void h(int i2) {
        int i5 = this.f7892i;
        SparseIntArray sparseIntArray = this.f7887d;
        Parcel parcel = this.f7888e;
        if (i5 >= 0) {
            int i7 = sparseIntArray.get(i5);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i7);
            parcel.writeInt(dataPosition - i7);
            parcel.setDataPosition(dataPosition);
        }
        this.f7892i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public C0903b(Parcel parcel, int i2, int i5, String str, C0934e c0934e, C0934e c0934e2, C0934e c0934e3) {
        super(c0934e, c0934e2, c0934e3);
        this.f7887d = new SparseIntArray();
        this.f7892i = -1;
        this.f7893k = -1;
        this.f7888e = parcel;
        this.f7889f = i2;
        this.f7890g = i5;
        this.j = i2;
        this.f7891h = str;
    }
}
