package g0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: g0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416I implements Parcelable {
    public static final Parcelable.Creator<C0416I> CREATOR = new I1.c(15);

    /* renamed from: d, reason: collision with root package name */
    public int f4873d;

    /* renamed from: e, reason: collision with root package name */
    public int f4874e;

    /* renamed from: i, reason: collision with root package name */
    public int f4875i;

    /* renamed from: l, reason: collision with root package name */
    public int[] f4876l;

    /* renamed from: m, reason: collision with root package name */
    public int f4877m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f4878n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4879o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4880p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4881q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4882r;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f4873d);
        parcel.writeInt(this.f4874e);
        parcel.writeInt(this.f4875i);
        if (this.f4875i > 0) {
            parcel.writeIntArray(this.f4876l);
        }
        parcel.writeInt(this.f4877m);
        if (this.f4877m > 0) {
            parcel.writeIntArray(this.f4878n);
        }
        parcel.writeInt(this.f4880p ? 1 : 0);
        parcel.writeInt(this.f4881q ? 1 : 0);
        parcel.writeInt(this.f4882r ? 1 : 0);
        parcel.writeList(this.f4879o);
    }
}
