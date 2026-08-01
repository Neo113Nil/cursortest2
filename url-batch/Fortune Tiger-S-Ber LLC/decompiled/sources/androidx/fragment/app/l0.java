package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f462f;
    public ArrayList g;
    public c[] h;

    /* renamed from: i, reason: collision with root package name */
    public int f463i;

    /* renamed from: j, reason: collision with root package name */
    public String f464j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f465k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f466l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f467m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f462f);
        parcel.writeStringList(this.g);
        parcel.writeTypedArray(this.h, i4);
        parcel.writeInt(this.f463i);
        parcel.writeString(this.f464j);
        parcel.writeStringList(this.f465k);
        parcel.writeTypedList(this.f466l);
        parcel.writeTypedList(this.f467m);
    }
}
