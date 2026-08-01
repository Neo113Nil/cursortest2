package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2424a;

    /* renamed from: b, reason: collision with root package name */
    public int f2425b;

    /* renamed from: c, reason: collision with root package name */
    public int f2426c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2427e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2428f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2429g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2430j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2424a);
        parcel.writeInt(this.f2425b);
        parcel.writeInt(this.f2426c);
        if (this.f2426c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2427e);
        if (this.f2427e > 0) {
            parcel.writeIntArray(this.f2428f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2430j ? 1 : 0);
        parcel.writeList(this.f2429g);
    }
}
