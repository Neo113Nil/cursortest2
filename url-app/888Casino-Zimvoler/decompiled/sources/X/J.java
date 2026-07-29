package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f829a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f830b;

    /* renamed from: c, reason: collision with root package name */
    public C0033b[] f831c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f832e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f833f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f834g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f829a);
        parcel.writeStringList(this.f830b);
        parcel.writeTypedArray(this.f831c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f832e);
        parcel.writeStringList(this.f833f);
        parcel.writeTypedList(this.f834g);
        parcel.writeTypedList(this.h);
    }
}
