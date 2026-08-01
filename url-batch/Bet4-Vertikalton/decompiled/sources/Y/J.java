package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f966a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f967b;

    /* renamed from: c, reason: collision with root package name */
    public C0036b[] f968c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f969e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f970f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f971g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f966a);
        parcel.writeStringList(this.f967b);
        parcel.writeTypedArray(this.f968c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f969e);
        parcel.writeStringList(this.f970f);
        parcel.writeTypedList(this.f971g);
        parcel.writeTypedList(this.h);
    }
}
