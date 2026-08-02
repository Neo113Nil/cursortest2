package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new H.h(8);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f4876a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4877b;

    /* renamed from: c, reason: collision with root package name */
    public C0195b[] f4878c;

    /* renamed from: d, reason: collision with root package name */
    public int f4879d;

    /* renamed from: e, reason: collision with root package name */
    public String f4880e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f4881f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f4882g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4883h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f4876a);
        parcel.writeStringList(this.f4877b);
        parcel.writeTypedArray(this.f4878c, i4);
        parcel.writeInt(this.f4879d);
        parcel.writeString(this.f4880e);
        parcel.writeStringList(this.f4881f);
        parcel.writeTypedList(this.f4882g);
        parcel.writeTypedList(this.f4883h);
    }
}
