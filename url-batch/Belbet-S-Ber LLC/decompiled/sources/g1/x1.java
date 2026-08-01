package g1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class x1 implements Parcelable {
    public static final Parcelable.Creator<x1> CREATOR = new androidx.fragment.app.b(12);

    /* renamed from: f, reason: collision with root package name */
    public int f1843f;

    /* renamed from: g, reason: collision with root package name */
    public int f1844g;
    public int h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int f1845j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f1846k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f1847l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1848m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1849n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1850o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1843f);
        parcel.writeInt(this.f1844g);
        parcel.writeInt(this.h);
        if (this.h > 0) {
            parcel.writeIntArray(this.i);
        }
        parcel.writeInt(this.f1845j);
        if (this.f1845j > 0) {
            parcel.writeIntArray(this.f1846k);
        }
        parcel.writeInt(this.f1848m ? 1 : 0);
        parcel.writeInt(this.f1849n ? 1 : 0);
        parcel.writeInt(this.f1850o ? 1 : 0);
        parcel.writeList(this.f1847l);
    }
}
