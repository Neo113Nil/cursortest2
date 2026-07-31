package r3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import r3.i;

/* loaded from: classes.dex */
public final class h0 extends s3.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: f, reason: collision with root package name */
    final int f21287f;

    /* renamed from: g, reason: collision with root package name */
    final IBinder f21288g;

    /* renamed from: h, reason: collision with root package name */
    private final o3.b f21289h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f21290i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f21291j;

    h0(int i7, IBinder iBinder, o3.b bVar, boolean z6, boolean z7) {
        this.f21287f = i7;
        this.f21288g = iBinder;
        this.f21289h = bVar;
        this.f21290i = z6;
        this.f21291j = z7;
    }

    public final i c() {
        IBinder iBinder = this.f21288g;
        if (iBinder == null) {
            return null;
        }
        return i.a.q0(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f21289h.equals(h0Var.f21289h) && n.a(c(), h0Var.c());
    }

    public final o3.b g() {
        return this.f21289h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = s3.c.a(parcel);
        s3.c.h(parcel, 1, this.f21287f);
        s3.c.g(parcel, 2, this.f21288g, false);
        s3.c.l(parcel, 3, this.f21289h, i7, false);
        s3.c.c(parcel, 4, this.f21290i);
        s3.c.c(parcel, 5, this.f21291j);
        s3.c.b(parcel, a7);
    }
}
