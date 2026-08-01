package f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2054a;

    /* renamed from: b, reason: collision with root package name */
    public int f2055b;

    /* renamed from: c, reason: collision with root package name */
    public int f2056c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2057e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2058f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2059g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2060j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2054a);
        parcel.writeInt(this.f2055b);
        parcel.writeInt(this.f2056c);
        if (this.f2056c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2057e);
        if (this.f2057e > 0) {
            parcel.writeIntArray(this.f2058f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2060j ? 1 : 0);
        parcel.writeList(this.f2059g);
    }
}
