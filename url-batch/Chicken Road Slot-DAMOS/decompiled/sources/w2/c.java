package w2;

import hd.a0;
import hd.z;
import k1.v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final long f10026a;

    public c(long j) {
        this.f10026a = j;
        if (j != 16) {
            return;
        }
        r2.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // w2.o
    public final float a() {
        return k1.p.d(this.f10026a);
    }

    @Override // w2.o
    public final long b() {
        return this.f10026a;
    }

    @Override // w2.o
    public final v c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k1.p.c(this.f10026a, ((c) obj).f10026a);
    }

    public final int hashCode() {
        int i3 = k1.p.f5341h;
        z zVar = a0.f4495e;
        return Long.hashCode(this.f10026a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) k1.p.h(this.f10026a)) + ')';
    }
}
