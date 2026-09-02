package q;

import android.os.Parcel;
import android.util.SparseIntArray;
import e.C0024a;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1182d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1183e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1184f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1185g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1186h;

    /* renamed from: i, reason: collision with root package name */
    public int f1187i;

    /* renamed from: j, reason: collision with root package name */
    public int f1188j;

    /* renamed from: k, reason: collision with root package name */
    public int f1189k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0024a(), new C0024a(), new C0024a());
    }

    @Override // q.b
    public final c a() {
        Parcel parcel = this.f1183e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f1188j;
        if (i2 == this.f1184f) {
            i2 = this.f1185g;
        }
        return new c(parcel, dataPosition, i2, this.f1186h + "  ", this.f1179a, this.f1180b, this.f1181c);
    }

    @Override // q.b
    public final boolean e(int i2) {
        while (this.f1188j < this.f1185g) {
            int i3 = this.f1189k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f1188j;
            Parcel parcel = this.f1183e;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.f1189k = parcel.readInt();
            this.f1188j += readInt;
        }
        return this.f1189k == i2;
    }

    @Override // q.b
    public final void h(int i2) {
        int i3 = this.f1187i;
        SparseIntArray sparseIntArray = this.f1182d;
        Parcel parcel = this.f1183e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.f1187i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public c(Parcel parcel, int i2, int i3, String str, C0024a c0024a, C0024a c0024a2, C0024a c0024a3) {
        super(c0024a, c0024a2, c0024a3);
        this.f1182d = new SparseIntArray();
        this.f1187i = -1;
        this.f1189k = -1;
        this.f1183e = parcel;
        this.f1184f = i2;
        this.f1185g = i3;
        this.f1188j = i2;
        this.f1186h = str;
    }
}
