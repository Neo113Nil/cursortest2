package r1;

import E.AbstractC0005f;
import android.os.Parcel;
import android.util.SparseIntArray;
import p.e;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401b extends AbstractC1400a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f15191d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f15192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15193f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15194g;

    /* renamed from: h, reason: collision with root package name */
    public final String f15195h;

    /* renamed from: i, reason: collision with root package name */
    public int f15196i;

    /* renamed from: j, reason: collision with root package name */
    public int f15197j;

    /* renamed from: k, reason: collision with root package name */
    public int f15198k;

    public C1401b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e(0), new e(0), new e(0));
    }

    @Override // r1.AbstractC1400a
    public final C1401b a() {
        Parcel parcel = this.f15192e;
        int dataPosition = parcel.dataPosition();
        int i4 = this.f15197j;
        if (i4 == this.f15193f) {
            i4 = this.f15194g;
        }
        return new C1401b(parcel, dataPosition, i4, AbstractC0005f.q(new StringBuilder(), this.f15195h, "  "), this.f15188a, this.f15189b, this.f15190c);
    }

    @Override // r1.AbstractC1400a
    public final boolean e(int i4) {
        while (this.f15197j < this.f15194g) {
            int i5 = this.f15198k;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            int i6 = this.f15197j;
            Parcel parcel = this.f15192e;
            parcel.setDataPosition(i6);
            int readInt = parcel.readInt();
            this.f15198k = parcel.readInt();
            this.f15197j += readInt;
        }
        return this.f15198k == i4;
    }

    @Override // r1.AbstractC1400a
    public final void h(int i4) {
        int i5 = this.f15196i;
        SparseIntArray sparseIntArray = this.f15191d;
        Parcel parcel = this.f15192e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(dataPosition - i6);
            parcel.setDataPosition(dataPosition);
        }
        this.f15196i = i4;
        sparseIntArray.put(i4, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i4);
    }

    public C1401b(Parcel parcel, int i4, int i5, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f15191d = new SparseIntArray();
        this.f15196i = -1;
        this.f15198k = -1;
        this.f15192e = parcel;
        this.f15193f = i4;
        this.f15194g = i5;
        this.f15197j = i4;
        this.f15195h = str;
    }
}
