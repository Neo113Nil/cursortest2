package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T implements Parcelable {
    public static final Parcelable.Creator<T> CREATOR = new I1.c(7);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f3638d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3639e;

    /* renamed from: i, reason: collision with root package name */
    public C0211b[] f3640i;

    /* renamed from: l, reason: collision with root package name */
    public int f3641l;

    /* renamed from: m, reason: collision with root package name */
    public String f3642m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f3643n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f3644o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f3645p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f3638d);
        parcel.writeStringList(this.f3639e);
        parcel.writeTypedArray(this.f3640i, i2);
        parcel.writeInt(this.f3641l);
        parcel.writeString(this.f3642m);
        parcel.writeStringList(this.f3643n);
        parcel.writeTypedList(this.f3644o);
        parcel.writeTypedList(this.f3645p);
    }
}
