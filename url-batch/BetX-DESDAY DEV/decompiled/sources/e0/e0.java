package e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(13);

    /* renamed from: a, reason: collision with root package name */
    public int f2226a;

    /* renamed from: b, reason: collision with root package name */
    public int f2227b;

    /* renamed from: c, reason: collision with root package name */
    public int f2228c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f2229d;

    /* renamed from: e, reason: collision with root package name */
    public int f2230e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2231f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2232g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2233j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2226a);
        parcel.writeInt(this.f2227b);
        parcel.writeInt(this.f2228c);
        if (this.f2228c > 0) {
            parcel.writeIntArray(this.f2229d);
        }
        parcel.writeInt(this.f2230e);
        if (this.f2230e > 0) {
            parcel.writeIntArray(this.f2231f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2233j ? 1 : 0);
        parcel.writeList(this.f2232g);
    }
}
