package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new Q.k(12);

    /* renamed from: a, reason: collision with root package name */
    public int f2398a;

    /* renamed from: b, reason: collision with root package name */
    public int f2399b;

    /* renamed from: c, reason: collision with root package name */
    public int f2400c;
    public int[] d;

    /* renamed from: e, reason: collision with root package name */
    public int f2401e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f2402f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2403g;
    public boolean h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2404j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2398a);
        parcel.writeInt(this.f2399b);
        parcel.writeInt(this.f2400c);
        if (this.f2400c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.f2401e);
        if (this.f2401e > 0) {
            parcel.writeIntArray(this.f2402f);
        }
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.f2404j ? 1 : 0);
        parcel.writeList(this.f2403g);
    }
}
