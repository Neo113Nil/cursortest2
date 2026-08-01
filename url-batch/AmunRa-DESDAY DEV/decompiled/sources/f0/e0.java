package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2122a;

    /* renamed from: b, reason: collision with root package name */
    public int f2123b;

    /* renamed from: c, reason: collision with root package name */
    public int f2124c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2125e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2126f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2127g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2128j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2122a);
        parcel.writeInt(this.f2123b);
        parcel.writeInt(this.f2124c);
        if (this.f2124c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2125e);
        if (this.f2125e > 0) {
            parcel.writeIntArray(this.f2126f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2128j ? 1 : 0);
        parcel.writeList(this.f2127g);
    }
}
