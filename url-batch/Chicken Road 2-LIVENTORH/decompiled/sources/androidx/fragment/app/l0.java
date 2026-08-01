package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new b(3);

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f469f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f470g;

    /* renamed from: h, reason: collision with root package name */
    public c[] f471h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public String f472j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f473k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f474l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f475m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f469f);
        parcel.writeStringList(this.f470g);
        parcel.writeTypedArray(this.f471h, i);
        parcel.writeInt(this.i);
        parcel.writeString(this.f472j);
        parcel.writeStringList(this.f473k);
        parcel.writeTypedList(this.f474l);
        parcel.writeTypedList(this.f475m);
    }
}
