package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new A0.b(5);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f920a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f921b;

    /* renamed from: c, reason: collision with root package name */
    public C0032b[] f922c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f923e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f924f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f925g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f920a);
        parcel.writeStringList(this.f921b);
        parcel.writeTypedArray(this.f922c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f923e);
        parcel.writeStringList(this.f924f);
        parcel.writeTypedList(this.f925g);
        parcel.writeTypedList(this.h);
    }
}
