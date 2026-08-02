package U;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class K implements Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new H.h(17);

    /* renamed from: a, reason: collision with root package name */
    public int f1369a;

    /* renamed from: b, reason: collision with root package name */
    public int f1370b;

    /* renamed from: c, reason: collision with root package name */
    public int f1371c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1372d;

    /* renamed from: e, reason: collision with root package name */
    public int f1373e;
    public int[] f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1374g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1375h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1376i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1377j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1369a);
        parcel.writeInt(this.f1370b);
        parcel.writeInt(this.f1371c);
        if (this.f1371c > 0) {
            parcel.writeIntArray(this.f1372d);
        }
        parcel.writeInt(this.f1373e);
        if (this.f1373e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt(this.f1375h ? 1 : 0);
        parcel.writeInt(this.f1376i ? 1 : 0);
        parcel.writeInt(this.f1377j ? 1 : 0);
        parcel.writeList(this.f1374g);
    }
}
