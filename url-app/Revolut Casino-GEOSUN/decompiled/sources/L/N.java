package L;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class N implements Parcelable {
    public static final Parcelable.Creator<N> CREATOR = new A.l(3);

    /* renamed from: a, reason: collision with root package name */
    public int f492a;

    /* renamed from: b, reason: collision with root package name */
    public int f493b;

    /* renamed from: c, reason: collision with root package name */
    public int f494c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f495d;

    /* renamed from: e, reason: collision with root package name */
    public int f496e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f497f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f498g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f499h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f500i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f501j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f492a);
        parcel.writeInt(this.f493b);
        parcel.writeInt(this.f494c);
        if (this.f494c > 0) {
            parcel.writeIntArray(this.f495d);
        }
        parcel.writeInt(this.f496e);
        if (this.f496e > 0) {
            parcel.writeIntArray(this.f497f);
        }
        parcel.writeInt(this.f499h ? 1 : 0);
        parcel.writeInt(this.f500i ? 1 : 0);
        parcel.writeInt(this.f501j ? 1 : 0);
        parcel.writeList(this.f498g);
    }
}
