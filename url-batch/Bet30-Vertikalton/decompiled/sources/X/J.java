package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f835a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f836b;

    /* renamed from: c, reason: collision with root package name */
    public C0033b[] f837c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f838e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f839f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f840g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f835a);
        parcel.writeStringList(this.f836b);
        parcel.writeTypedArray(this.f837c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f838e);
        parcel.writeStringList(this.f839f);
        parcel.writeTypedList(this.f840g);
        parcel.writeTypedList(this.h);
    }
}
