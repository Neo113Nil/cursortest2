package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dz2 implements cz2 {
    public final Object a;
    public final Object b;

    public dz2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.cz2
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.cz2
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cz2)) {
            return false;
        }
        cz2 cz2Var = (cz2) obj;
        return Intrinsics.b(this.a, cz2Var.b()) && Intrinsics.b(this.b, cz2Var.c());
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
