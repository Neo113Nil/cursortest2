package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new B0.b(5);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1468a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1469b;

    /* renamed from: c, reason: collision with root package name */
    public C0038b[] f1470c;

    /* renamed from: d, reason: collision with root package name */
    public int f1471d;
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1472f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1473g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1474h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1468a);
        parcel.writeStringList(this.f1469b);
        parcel.writeTypedArray(this.f1470c, i);
        parcel.writeInt(this.f1471d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f1472f);
        parcel.writeTypedList(this.f1473g);
        parcel.writeTypedList(this.f1474h);
    }
}
