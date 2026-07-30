package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jl1 implements ae0, Serializable {
    public Function0 d;
    public Object e;

    @Override // defpackage.ae0
    public final Object getValue() {
        if (this.e == lk1.a) {
            Function0 function0 = this.d;
            function0.getClass();
            this.e = function0.invoke();
            this.d = null;
        }
        return this.e;
    }

    public final String toString() {
        return this.e != lk1.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
