package y6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends d7.a {
    public static final Parcelable.Creator<b> CREATOR = new m(0);

    /* renamed from: d, reason: collision with root package name */
    public final String f10625d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10626e;

    /* renamed from: i, reason: collision with root package name */
    public final String f10627i;

    /* renamed from: r, reason: collision with root package name */
    public final String f10628r;

    /* renamed from: s, reason: collision with root package name */
    public final String f10629s;

    /* renamed from: t, reason: collision with root package name */
    public int f10630t;

    /* renamed from: u, reason: collision with root package name */
    public final String f10631u;

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f10625d = str;
        this.f10626e = str2;
        this.f10627i = str3;
        this.f10628r = str4;
        this.f10629s = str5;
        this.f10631u = "22.0.1";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.V(parcel, 1, this.f10625d);
        cf.c.V(parcel, 2, this.f10626e);
        cf.c.V(parcel, 3, this.f10627i);
        cf.c.V(parcel, 4, this.f10628r);
        cf.c.V(parcel, 5, this.f10629s);
        int i10 = this.f10630t;
        cf.c.Y(parcel, 6, 4);
        parcel.writeInt(i10);
        cf.c.V(parcel, 7, this.f10631u);
        cf.c.a0(parcel, Z);
    }

    public b(String str, String str2, String str3, String str4, String str5, int i3, String str6) {
        this.f10625d = str;
        this.f10626e = str2;
        this.f10627i = str3;
        this.f10628r = str4;
        this.f10629s = str5;
        this.f10630t = i3;
        this.f10631u = str6;
    }
}
