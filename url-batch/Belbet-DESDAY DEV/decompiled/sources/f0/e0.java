package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2057a;

    /* renamed from: b, reason: collision with root package name */
    public int f2058b;

    /* renamed from: c, reason: collision with root package name */
    public int f2059c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2060e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2061f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2062g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2063j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2057a);
        parcel.writeInt(this.f2058b);
        parcel.writeInt(this.f2059c);
        if (this.f2059c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2060e);
        if (this.f2060e > 0) {
            parcel.writeIntArray(this.f2061f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2063j ? 1 : 0);
        parcel.writeList(this.f2062g);
    }
}
