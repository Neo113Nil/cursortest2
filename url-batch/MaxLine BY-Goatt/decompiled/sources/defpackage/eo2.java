package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eo2 implements bm0 {
    public final float a;
    public final float b;
    public final Object c;

    public eo2(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.md
    public final c43 a(k03 k03Var) {
        Object obj = this.c;
        return new ot2(this.a, this.b, obj == null ? null : (sd) k03Var.a.invoke(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eo2) {
            eo2 eo2Var = (eo2) obj;
            if (eo2Var.a == this.a && eo2Var.b == this.b && Intrinsics.b(eo2Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + q40.d(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public /* synthetic */ eo2(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
