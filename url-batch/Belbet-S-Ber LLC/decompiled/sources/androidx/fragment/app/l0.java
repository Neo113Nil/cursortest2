package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f581f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f582g;
    public c[] h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public String f583j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f584k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f585l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f586m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f581f);
        parcel.writeStringList(this.f582g);
        parcel.writeTypedArray(this.h, i);
        parcel.writeInt(this.i);
        parcel.writeString(this.f583j);
        parcel.writeStringList(this.f584k);
        parcel.writeTypedList(this.f585l);
        parcel.writeTypedList(this.f586m);
    }
}
