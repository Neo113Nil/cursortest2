package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class am implements gm1 {
    public final Function1 a;

    public am(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.gm1
    public final Object a(kw0 kw0Var) {
        return this.a.invoke(kw0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof am) && this.a.equals(((am) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
