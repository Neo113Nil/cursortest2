package s7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e extends d7.a {
    public static final Parcelable.Creator<e> CREATOR = new c7.p(13);

    /* renamed from: d, reason: collision with root package name */
    public String f8594d;

    /* renamed from: e, reason: collision with root package name */
    public String f8595e;

    /* renamed from: i, reason: collision with root package name */
    public m4 f8596i;

    /* renamed from: r, reason: collision with root package name */
    public long f8597r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8598s;

    /* renamed from: t, reason: collision with root package name */
    public String f8599t;

    /* renamed from: u, reason: collision with root package name */
    public final u f8600u;

    /* renamed from: v, reason: collision with root package name */
    public long f8601v;

    /* renamed from: w, reason: collision with root package name */
    public u f8602w;

    /* renamed from: x, reason: collision with root package name */
    public final long f8603x;

    /* renamed from: y, reason: collision with root package name */
    public final u f8604y;

    public e(e eVar) {
        c7.c0.g(eVar);
        this.f8594d = eVar.f8594d;
        this.f8595e = eVar.f8595e;
        this.f8596i = eVar.f8596i;
        this.f8597r = eVar.f8597r;
        this.f8598s = eVar.f8598s;
        this.f8599t = eVar.f8599t;
        this.f8600u = eVar.f8600u;
        this.f8601v = eVar.f8601v;
        this.f8602w = eVar.f8602w;
        this.f8603x = eVar.f8603x;
        this.f8604y = eVar.f8604y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Z = cf.c.Z(parcel, 20293);
        cf.c.V(parcel, 2, this.f8594d);
        cf.c.V(parcel, 3, this.f8595e);
        cf.c.U(parcel, 4, this.f8596i, i3);
        long j = this.f8597r;
        cf.c.Y(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z10 = this.f8598s;
        cf.c.Y(parcel, 6, 4);
        parcel.writeInt(z10 ? 1 : 0);
        cf.c.V(parcel, 7, this.f8599t);
        cf.c.U(parcel, 8, this.f8600u, i3);
        long j3 = this.f8601v;
        cf.c.Y(parcel, 9, 8);
        parcel.writeLong(j3);
        cf.c.U(parcel, 10, this.f8602w, i3);
        cf.c.Y(parcel, 11, 8);
        parcel.writeLong(this.f8603x);
        cf.c.U(parcel, 12, this.f8604y, i3);
        cf.c.a0(parcel, Z);
    }

    public e(String str, String str2, m4 m4Var, long j, boolean z10, String str3, u uVar, long j3, u uVar2, long j10, u uVar3) {
        this.f8594d = str;
        this.f8595e = str2;
        this.f8596i = m4Var;
        this.f8597r = j;
        this.f8598s = z10;
        this.f8599t = str3;
        this.f8600u = uVar;
        this.f8601v = j3;
        this.f8602w = uVar2;
        this.f8603x = j10;
        this.f8604y = uVar3;
    }
}
