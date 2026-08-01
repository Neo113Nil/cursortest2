package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new C0.b(13);

    /* renamed from: a, reason: collision with root package name */
    public int f2234a;

    /* renamed from: b, reason: collision with root package name */
    public int f2235b;

    /* renamed from: c, reason: collision with root package name */
    public int f2236c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2237e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2238f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2239g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2240j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2234a);
        parcel.writeInt(this.f2235b);
        parcel.writeInt(this.f2236c);
        if (this.f2236c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2237e);
        if (this.f2237e > 0) {
            parcel.writeIntArray(this.f2238f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2240j ? 1 : 0);
        parcel.writeList(this.f2239g);
    }
}
