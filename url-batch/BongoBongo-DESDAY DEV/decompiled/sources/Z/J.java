package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new R.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1037a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1038b;

    /* renamed from: c, reason: collision with root package name */
    public C0035b[] f1039c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f1040e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1041f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1042g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f1043h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1037a);
        parcel.writeStringList(this.f1038b);
        parcel.writeTypedArray(this.f1039c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f1040e);
        parcel.writeStringList(this.f1041f);
        parcel.writeTypedList(this.f1042g);
        parcel.writeTypedList(this.f1043h);
    }
}
