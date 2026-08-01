package Y;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new F0.b(5);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1325a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1326b;

    /* renamed from: c, reason: collision with root package name */
    public C0035b[] f1327c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f1328e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1329f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1330g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1325a);
        parcel.writeStringList(this.f1326b);
        parcel.writeTypedArray(this.f1327c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f1328e);
        parcel.writeStringList(this.f1329f);
        parcel.writeTypedList(this.f1330g);
        parcel.writeTypedList(this.h);
    }
}
