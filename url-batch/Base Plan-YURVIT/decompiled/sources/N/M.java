package N;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new C.k(3);

    /* renamed from: e, reason: collision with root package name */
    public int f675e;

    /* renamed from: f, reason: collision with root package name */
    public int f676f;

    /* renamed from: g, reason: collision with root package name */
    public int f677g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f678h;

    /* renamed from: i, reason: collision with root package name */
    public int f679i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f680j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f681k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f682l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f683m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f684n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f675e);
        parcel.writeInt(this.f676f);
        parcel.writeInt(this.f677g);
        if (this.f677g > 0) {
            parcel.writeIntArray(this.f678h);
        }
        parcel.writeInt(this.f679i);
        if (this.f679i > 0) {
            parcel.writeIntArray(this.f680j);
        }
        parcel.writeInt(this.f682l ? 1 : 0);
        parcel.writeInt(this.f683m ? 1 : 0);
        parcel.writeInt(this.f684n ? 1 : 0);
        parcel.writeList(this.f681k);
    }
}
