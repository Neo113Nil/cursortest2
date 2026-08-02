package l1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: l1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1252I implements Parcelable {
    public static final Parcelable.Creator<C1252I> CREATOR = new H.h(24);

    /* renamed from: a, reason: collision with root package name */
    public int f14183a;

    /* renamed from: b, reason: collision with root package name */
    public int f14184b;

    /* renamed from: c, reason: collision with root package name */
    public int f14185c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f14186d;

    /* renamed from: e, reason: collision with root package name */
    public int f14187e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f14188f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f14189g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14190h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14191i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14192j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f14183a);
        parcel.writeInt(this.f14184b);
        parcel.writeInt(this.f14185c);
        if (this.f14185c > 0) {
            parcel.writeIntArray(this.f14186d);
        }
        parcel.writeInt(this.f14187e);
        if (this.f14187e > 0) {
            parcel.writeIntArray(this.f14188f);
        }
        parcel.writeInt(this.f14190h ? 1 : 0);
        parcel.writeInt(this.f14191i ? 1 : 0);
        parcel.writeInt(this.f14192j ? 1 : 0);
        parcel.writeList(this.f14189g);
    }
}
