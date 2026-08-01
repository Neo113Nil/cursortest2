package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1247a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1248b;

    /* renamed from: c, reason: collision with root package name */
    public C0045b[] f1249c;

    /* renamed from: d, reason: collision with root package name */
    public int f1250d;

    /* renamed from: e, reason: collision with root package name */
    public String f1251e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1252f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1253g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1247a);
        parcel.writeStringList(this.f1248b);
        parcel.writeTypedArray(this.f1249c, i);
        parcel.writeInt(this.f1250d);
        parcel.writeString(this.f1251e);
        parcel.writeStringList(this.f1252f);
        parcel.writeTypedList(this.f1253g);
        parcel.writeTypedList(this.h);
    }
}
