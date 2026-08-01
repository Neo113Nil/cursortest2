package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new B0.b(13);

    /* renamed from: a, reason: collision with root package name */
    public int f2997a;

    /* renamed from: b, reason: collision with root package name */
    public int f2998b;

    /* renamed from: c, reason: collision with root package name */
    public int f2999c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f3000d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3001f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3002g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3003h;
    public boolean i;
    public boolean j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2997a);
        parcel.writeInt(this.f2998b);
        parcel.writeInt(this.f2999c);
        if (this.f2999c > 0) {
            parcel.writeIntArray(this.f3000d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f3001f);
        }
        parcel.writeInt(this.f3003h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeList(this.f3002g);
    }
}
