package d2;

import android.os.Parcel;
import android.os.Parcelable;
import e2.AbstractC0408a;

/* renamed from: d2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0388f extends AbstractC0408a {
    public static final Parcelable.Creator<C0388f> CREATOR = new H.h(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f8254a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8255b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8256c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8257d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8258e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8259f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8260g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8261h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8262i;

    public C0388f(int i4, int i5, int i6, long j4, long j5, String str, String str2, int i7, int i8) {
        this.f8254a = i4;
        this.f8255b = i5;
        this.f8256c = i6;
        this.f8257d = j4;
        this.f8258e = j5;
        this.f8259f = str;
        this.f8260g = str2;
        this.f8261h = i7;
        this.f8262i = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int D3 = O3.l.D(parcel, 20293);
        O3.l.G(parcel, 1, 4);
        parcel.writeInt(this.f8254a);
        O3.l.G(parcel, 2, 4);
        parcel.writeInt(this.f8255b);
        O3.l.G(parcel, 3, 4);
        parcel.writeInt(this.f8256c);
        O3.l.G(parcel, 4, 8);
        parcel.writeLong(this.f8257d);
        O3.l.G(parcel, 5, 8);
        parcel.writeLong(this.f8258e);
        O3.l.A(parcel, 6, this.f8259f);
        O3.l.A(parcel, 7, this.f8260g);
        O3.l.G(parcel, 8, 4);
        parcel.writeInt(this.f8261h);
        O3.l.G(parcel, 9, 4);
        parcel.writeInt(this.f8262i);
        O3.l.F(parcel, D3);
    }
}
