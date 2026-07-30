package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o61 {
    public final Integer a;
    public final Object b;

    public o61(Integer num, Object obj) {
        this.a = num;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o61)) {
            return false;
        }
        o61 o61Var = (o61) obj;
        return this.a.equals(o61Var.a) && Intrinsics.b(this.b, o61Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
