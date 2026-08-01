package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f837a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f838b;

    /* renamed from: c, reason: collision with root package name */
    public C0034b[] f839c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f840e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f841f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f842g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f837a);
        parcel.writeStringList(this.f838b);
        parcel.writeTypedArray(this.f839c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f840e);
        parcel.writeStringList(this.f841f);
        parcel.writeTypedList(this.f842g);
        parcel.writeTypedList(this.h);
    }
}
