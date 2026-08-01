package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f993a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f994b;

    /* renamed from: c, reason: collision with root package name */
    public C0036b[] f995c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f996e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f997f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f998g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f993a);
        parcel.writeStringList(this.f994b);
        parcel.writeTypedArray(this.f995c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f996e);
        parcel.writeStringList(this.f997f);
        parcel.writeTypedList(this.f998g);
        parcel.writeTypedList(this.h);
    }
}
