package defpackage;

import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cb2 implements d21 {
    public final boolean a;
    public final float b;
    public final long c;

    public cb2(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.d21
    public final o90 a(b41 b41Var) {
        return new u90(b41Var, this.a, this.b, new s90(1, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb2)) {
            return false;
        }
        cb2 cb2Var = (cb2) obj;
        if (this.a == cb2Var.a && pc0.a(this.b, cb2Var.b)) {
            return aw.c(this.c, cb2Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int d = q40.d(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = aw.h;
        q13.a aVar = q13.m;
        return Long.hashCode(this.c) + d;
    }
}
