package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s00 implements r33 {
    public final Function1 a;

    public s00(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.r33
    public final Object a(v02 v02Var) {
        return this.a.invoke(v02Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s00) && this.a.equals(((s00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
