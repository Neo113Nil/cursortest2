package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new Q.k(4);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1248a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1249b;

    /* renamed from: c, reason: collision with root package name */
    public C0045b[] f1250c;

    /* renamed from: d, reason: collision with root package name */
    public int f1251d;

    /* renamed from: e, reason: collision with root package name */
    public String f1252e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1253f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1254g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1248a);
        parcel.writeStringList(this.f1249b);
        parcel.writeTypedArray(this.f1250c, i);
        parcel.writeInt(this.f1251d);
        parcel.writeString(this.f1252e);
        parcel.writeStringList(this.f1253f);
        parcel.writeTypedList(this.f1254g);
        parcel.writeTypedList(this.h);
    }
}
