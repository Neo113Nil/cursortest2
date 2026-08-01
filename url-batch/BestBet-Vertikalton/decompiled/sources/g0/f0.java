package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new F0.b(13);

    /* renamed from: a, reason: collision with root package name */
    public int f2830a;

    /* renamed from: b, reason: collision with root package name */
    public int f2831b;

    /* renamed from: c, reason: collision with root package name */
    public int f2832c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2833e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2834f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2835g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2836j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2830a);
        parcel.writeInt(this.f2831b);
        parcel.writeInt(this.f2832c);
        if (this.f2832c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2833e);
        if (this.f2833e > 0) {
            parcel.writeIntArray(this.f2834f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2836j ? 1 : 0);
        parcel.writeList(this.f2835g);
    }
}
