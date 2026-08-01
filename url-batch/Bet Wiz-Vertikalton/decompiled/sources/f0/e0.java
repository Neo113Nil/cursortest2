package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2190a;

    /* renamed from: b, reason: collision with root package name */
    public int f2191b;

    /* renamed from: c, reason: collision with root package name */
    public int f2192c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2193e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2194f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2195g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2196j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2190a);
        parcel.writeInt(this.f2191b);
        parcel.writeInt(this.f2192c);
        if (this.f2192c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2193e);
        if (this.f2193e > 0) {
            parcel.writeIntArray(this.f2194f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2196j ? 1 : 0);
        parcel.writeList(this.f2195g);
    }
}
