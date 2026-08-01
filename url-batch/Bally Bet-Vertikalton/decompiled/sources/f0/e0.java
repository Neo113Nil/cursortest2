package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2059a;

    /* renamed from: b, reason: collision with root package name */
    public int f2060b;

    /* renamed from: c, reason: collision with root package name */
    public int f2061c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2062e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2063f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2064g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2065j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2059a);
        parcel.writeInt(this.f2060b);
        parcel.writeInt(this.f2061c);
        if (this.f2061c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2062e);
        if (this.f2062e > 0) {
            parcel.writeIntArray(this.f2063f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2065j ? 1 : 0);
        parcel.writeList(this.f2064g);
    }
}
