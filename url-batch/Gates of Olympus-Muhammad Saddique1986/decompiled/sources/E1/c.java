package E1;

import android.os.Parcel;
import android.util.SparseIntArray;
import j.C0531e;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1036d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1037e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1038f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1039g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1040h;

    /* renamed from: i, reason: collision with root package name */
    public int f1041i;

    /* renamed from: j, reason: collision with root package name */
    public int f1042j;

    /* renamed from: k, reason: collision with root package name */
    public int f1043k;

    public c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0531e(), new C0531e(), new C0531e());
    }

    @Override // E1.b
    public final c a() {
        Parcel parcel = this.f1037e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f1042j;
        if (i3 == this.f1038f) {
            i3 = this.f1039g;
        }
        return new c(parcel, dataPosition, i3, this.f1040h + "  ", this.f1033a, this.f1034b, this.f1035c);
    }

    @Override // E1.b
    public final boolean e(int i3) {
        while (this.f1042j < this.f1039g) {
            int i4 = this.f1043k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f1042j;
            Parcel parcel = this.f1037e;
            parcel.setDataPosition(i5);
            int readInt = parcel.readInt();
            this.f1043k = parcel.readInt();
            this.f1042j += readInt;
        }
        return this.f1043k == i3;
    }

    @Override // E1.b
    public final void h(int i3) {
        int i4 = this.f1041i;
        SparseIntArray sparseIntArray = this.f1036d;
        Parcel parcel = this.f1037e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(dataPosition - i5);
            parcel.setDataPosition(dataPosition);
        }
        this.f1041i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public c(Parcel parcel, int i3, int i4, String str, C0531e c0531e, C0531e c0531e2, C0531e c0531e3) {
        super(c0531e, c0531e2, c0531e3);
        this.f1036d = new SparseIntArray();
        this.f1041i = -1;
        this.f1043k = -1;
        this.f1037e = parcel;
        this.f1038f = i3;
        this.f1039g = i4;
        this.f1042j = i3;
        this.f1040h = str;
    }
}
