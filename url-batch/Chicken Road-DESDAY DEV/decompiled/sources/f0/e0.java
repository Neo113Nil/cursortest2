package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2123a;

    /* renamed from: b, reason: collision with root package name */
    public int f2124b;

    /* renamed from: c, reason: collision with root package name */
    public int f2125c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2126e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2127f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2128g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2129j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2123a);
        parcel.writeInt(this.f2124b);
        parcel.writeInt(this.f2125c);
        if (this.f2125c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2126e);
        if (this.f2126e > 0) {
            parcel.writeIntArray(this.f2127f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2129j ? 1 : 0);
        parcel.writeList(this.f2128g);
    }
}
