package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class cg1 implements ae0, Serializable {
    public Function0 d;
    public volatile Object e;
    public final Object g;

    public cg1(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        function0.getClass();
        this.d = function0;
        this.e = lk1.a;
        this.g = obj == null ? this : obj;
    }

    @Override // defpackage.ae0
    public final Object getValue() {
        Object obj;
        Object obj2 = this.e;
        lk1 lk1Var = lk1.a;
        if (obj2 != lk1Var) {
            return obj2;
        }
        synchronized (this.g) {
            obj = this.e;
            if (obj == lk1Var) {
                Function0 function0 = this.d;
                function0.getClass();
                obj = function0.invoke();
                this.e = obj;
                this.d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.e != lk1.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
