package defpackage;

import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mw implements pv2 {
    public final long a;

    public mw(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        i21.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.pv2
    public final float a() {
        return aw.d(this.a);
    }

    @Override // defpackage.pv2
    public final long b() {
        return this.a;
    }

    @Override // defpackage.pv2
    public final cq c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mw) && aw.c(this.a, ((mw) obj).a);
    }

    public final int hashCode() {
        int i = aw.h;
        q13.a aVar = q13.m;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) aw.i(this.a)) + ')';
    }
}
