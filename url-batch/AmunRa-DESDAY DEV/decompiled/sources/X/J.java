package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class J implements Parcelable {
    public static final Parcelable.Creator<J> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f877a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f878b;

    /* renamed from: c, reason: collision with root package name */
    public C0033b[] f879c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f880e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f881f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f882g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f877a);
        parcel.writeStringList(this.f878b);
        parcel.writeTypedArray(this.f879c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.f880e);
        parcel.writeStringList(this.f881f);
        parcel.writeTypedList(this.f882g);
        parcel.writeTypedList(this.h);
    }
}
