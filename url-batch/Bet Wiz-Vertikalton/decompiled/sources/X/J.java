package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f946a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f947b;

    /* renamed from: c, reason: collision with root package name */
    public C0033b[] f948c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f949e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f950f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f951g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f946a);
        parcel.writeStringList(this.f947b);
        parcel.writeTypedArray(this.f948c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f949e);
        parcel.writeStringList(this.f950f);
        parcel.writeTypedList(this.f951g);
        parcel.writeTypedList(this.h);
    }
}
