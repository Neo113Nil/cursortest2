package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f828a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f829b;

    /* renamed from: c, reason: collision with root package name */
    public C0033b[] f830c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f831e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f832f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f833g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f828a);
        parcel.writeStringList(this.f829b);
        parcel.writeTypedArray(this.f830c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f831e);
        parcel.writeStringList(this.f832f);
        parcel.writeTypedList(this.f833g);
        parcel.writeTypedList(this.h);
    }
}
