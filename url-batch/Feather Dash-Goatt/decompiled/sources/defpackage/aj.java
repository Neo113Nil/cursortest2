package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class aj implements am0 {
    public final am0 a;
    public final am0 b;

    public aj(am0 am0Var, am0 am0Var2) {
        this.a = am0Var;
        this.b = am0Var2;
    }

    @Override // defpackage.am0
    public final boolean a(Function1 function1) {
        return this.a.a(function1) && this.b.a(function1);
    }

    @Override // defpackage.am0
    public final Object b(Object obj, Function2 function2) {
        return this.b.b(this.a.b(obj, function2), function2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aj)) {
            return false;
        }
        aj ajVar = (aj) obj;
        return this.a.equals(ajVar.a) && Intrinsics.a(this.b, ajVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "[" + ((String) b("", e7.m)) + ']';
    }
}
