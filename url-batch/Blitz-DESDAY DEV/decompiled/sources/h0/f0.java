package h0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new S.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2485a;

    /* renamed from: b, reason: collision with root package name */
    public int f2486b;

    /* renamed from: c, reason: collision with root package name */
    public int f2487c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2488e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2489f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2490g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2491j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2485a);
        parcel.writeInt(this.f2486b);
        parcel.writeInt(this.f2487c);
        if (this.f2487c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2488e);
        if (this.f2488e > 0) {
            parcel.writeIntArray(this.f2489f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2491j ? 1 : 0);
        parcel.writeList(this.f2490g);
    }
}
