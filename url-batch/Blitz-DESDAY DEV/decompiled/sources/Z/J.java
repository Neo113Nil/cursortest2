package Z;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new S.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1055a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1056b;

    /* renamed from: c, reason: collision with root package name */
    public C0032b[] f1057c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f1058e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1059f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1060g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1055a);
        parcel.writeStringList(this.f1056b);
        parcel.writeTypedArray(this.f1057c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f1058e);
        parcel.writeStringList(this.f1059f);
        parcel.writeTypedList(this.f1060g);
        parcel.writeTypedList(this.h);
    }
}
