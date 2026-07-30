package r;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1134d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1135e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1136f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1137g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1138h;

    /* renamed from: i, reason: collision with root package name */
    public int f1139i;

    /* renamed from: j, reason: collision with root package name */
    public int f1140j;

    /* renamed from: k, reason: collision with root package name */
    public int f1141k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e.a(), new e.a(), new e.a());
    }

    @Override // r.b
    public final c a() {
        Parcel parcel = this.f1135e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1140j;
        if (i2 == this.f1136f) {
            i2 = this.f1137g;
        }
        return new c(parcel, dataPosition, i2, this.f1138h + "  ", this.f1131a, this.f1132b, this.f1133c);
    }

    @Override // r.b
    public final boolean e(int i2) {
        while (true) {
            int i3 = this.f1140j;
            int i4 = this.f1141k;
            if (i3 >= this.f1137g) {
                return i4 == i2;
            }
            if (i4 == i2) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i5 = this.f1140j;
            Parcel parcel = this.f1135e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f1141k = parcel.readInt();
            this.f1140j += readInt;
        }
    }

    @Override // r.b
    public final void h(int i2) {
        int i3 = this.f1139i;
        SparseIntArray sparseIntArray = this.f1134d;
        Parcel parcel = this.f1135e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f1139i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public c(Parcel parcel, int i2, int i3, String str, e.a aVar, e.a aVar2, e.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f1134d = new SparseIntArray();
        this.f1139i = -1;
        this.f1141k = -1;
        this.f1135e = parcel;
        this.f1136f = i2;
        this.f1137g = i3;
        this.f1140j = i2;
        this.f1138h = str;
    }
}
