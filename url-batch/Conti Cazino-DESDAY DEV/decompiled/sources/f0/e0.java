package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2056a;

    /* renamed from: b, reason: collision with root package name */
    public int f2057b;

    /* renamed from: c, reason: collision with root package name */
    public int f2058c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2059e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2060f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2061g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2062j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2056a);
        parcel.writeInt(this.f2057b);
        parcel.writeInt(this.f2058c);
        if (this.f2058c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2059e);
        if (this.f2059e > 0) {
            parcel.writeIntArray(this.f2060f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2062j ? 1 : 0);
        parcel.writeList(this.f2061g);
    }
}
