package e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(13);

    /* renamed from: a, reason: collision with root package name */
    public int f2222a;

    /* renamed from: b, reason: collision with root package name */
    public int f2223b;

    /* renamed from: c, reason: collision with root package name */
    public int f2224c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2225d;

    /* renamed from: e, reason: collision with root package name */
    public int f2226e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2227f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2228g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2229j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2222a);
        parcel.writeInt(this.f2223b);
        parcel.writeInt(this.f2224c);
        if (this.f2224c > 0) {
            parcel.writeIntArray(this.f2225d);
        }
        parcel.writeInt(this.f2226e);
        if (this.f2226e > 0) {
            parcel.writeIntArray(this.f2227f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2229j ? 1 : 0);
        parcel.writeList(this.f2228g);
    }
}
