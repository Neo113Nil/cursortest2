package h1;

import android.os.Parcel;
import android.util.SparseIntArray;
import n.f;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f2003d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f2004e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2005f;
    public final int g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public int f2006i;

    /* renamed from: j, reason: collision with root package name */
    public int f2007j;

    /* renamed from: k, reason: collision with root package name */
    public int f2008k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override // h1.a
    public final b a() {
        Parcel parcel = this.f2004e;
        int dataPosition = parcel.dataPosition();
        int i4 = this.f2007j;
        if (i4 == this.f2005f) {
            i4 = this.g;
        }
        return new b(parcel, dataPosition, i4, this.h + "  ", this.f2001a, this.f2002b, this.c);
    }

    @Override // h1.a
    public final boolean e(int i4) {
        while (this.f2007j < this.g) {
            int i5 = this.f2008k;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            int i6 = this.f2007j;
            Parcel parcel = this.f2004e;
            parcel.setDataPosition(i6);
            int readInt = parcel.readInt();
            this.f2008k = parcel.readInt();
            this.f2007j += readInt;
        }
        return this.f2008k == i4;
    }

    @Override // h1.a
    public final void h(int i4) {
        int i5 = this.f2006i;
        SparseIntArray sparseIntArray = this.f2003d;
        Parcel parcel = this.f2004e;
        if (i5 >= 0) {
            int i6 = sparseIntArray.get(i5);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i6);
            parcel.writeInt(dataPosition - i6);
            parcel.setDataPosition(dataPosition);
        }
        this.f2006i = i4;
        sparseIntArray.put(i4, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i4);
    }

    public b(Parcel parcel, int i4, int i5, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f2003d = new SparseIntArray();
        this.f2006i = -1;
        this.f2008k = -1;
        this.f2004e = parcel;
        this.f2005f = i4;
        this.g = i5;
        this.f2007j = i4;
        this.h = str;
    }
}
