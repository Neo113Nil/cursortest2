package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2053a;

    /* renamed from: b, reason: collision with root package name */
    public int f2054b;

    /* renamed from: c, reason: collision with root package name */
    public int f2055c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2056e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2057f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2058g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2059j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2053a);
        parcel.writeInt(this.f2054b);
        parcel.writeInt(this.f2055c);
        if (this.f2055c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2056e);
        if (this.f2056e > 0) {
            parcel.writeIntArray(this.f2057f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2059j ? 1 : 0);
        parcel.writeList(this.f2058g);
    }
}
