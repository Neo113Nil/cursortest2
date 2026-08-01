package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f834a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f835b;

    /* renamed from: c, reason: collision with root package name */
    public C0033b[] f836c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f837e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f838f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f839g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f834a);
        parcel.writeStringList(this.f835b);
        parcel.writeTypedArray(this.f836c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f837e);
        parcel.writeStringList(this.f838f);
        parcel.writeTypedList(this.f839g);
        parcel.writeTypedList(this.h);
    }
}
