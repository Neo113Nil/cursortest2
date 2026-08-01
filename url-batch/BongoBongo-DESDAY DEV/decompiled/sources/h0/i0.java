package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new R.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2521a;

    /* renamed from: b, reason: collision with root package name */
    public int f2522b;

    /* renamed from: c, reason: collision with root package name */
    public int f2523c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2524e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2525f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2526g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2527h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2528j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2521a);
        parcel.writeInt(this.f2522b);
        parcel.writeInt(this.f2523c);
        if (this.f2523c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2524e);
        if (this.f2524e > 0) {
            parcel.writeIntArray(this.f2525f);
        }
        parcel.writeInt(this.f2527h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2528j ? 1 : 0);
        parcel.writeList(this.f2526g);
    }
}
