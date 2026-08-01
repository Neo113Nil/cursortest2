package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new C0.b(5);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f972a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f973b;

    /* renamed from: c, reason: collision with root package name */
    public C0033b[] f974c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f975e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f976f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f977g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f972a);
        parcel.writeStringList(this.f973b);
        parcel.writeTypedArray(this.f974c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f975e);
        parcel.writeStringList(this.f976f);
        parcel.writeTypedList(this.f977g);
        parcel.writeTypedList(this.h);
    }
}
