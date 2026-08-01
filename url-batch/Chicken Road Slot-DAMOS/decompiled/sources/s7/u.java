package s7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class u extends d7.a {
    public static final Parcelable.Creator<u> CREATOR = new c7.p(16);

    /* renamed from: d, reason: collision with root package name */
    public final String f9035d;

    /* renamed from: e, reason: collision with root package name */
    public final t f9036e;

    /* renamed from: i, reason: collision with root package name */
    public final String f9037i;

    /* renamed from: r, reason: collision with root package name */
    public final long f9038r;

    /* renamed from: s, reason: collision with root package name */
    public final long f9039s;

    public u(u uVar, long j, long j3) {
        c7.c0.g(uVar);
        this.f9035d = uVar.f9035d;
        this.f9036e = uVar.f9036e;
        this.f9037i = uVar.f9037i;
        this.f9038r = j;
        this.f9039s = j3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f9036e);
        String str = this.f9037i;
        int length = String.valueOf(str).length();
        String str2 = this.f9035d;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        n0.l.l(sb2, "origin=", str, ",name=", str2);
        return v4.a.o(sb2, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        c7.p.b(this, parcel, i3);
    }

    public u(String str, t tVar, String str2, long j, long j3) {
        this.f9035d = str;
        this.f9036e = tVar;
        this.f9037i = str2;
        this.f9038r = j;
        this.f9039s = j3;
    }
}
