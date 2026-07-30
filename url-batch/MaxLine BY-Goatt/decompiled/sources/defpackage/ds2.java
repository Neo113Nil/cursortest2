package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class ds2<T> implements y91, Serializable {
    public Function0 m;
    public volatile Object n;
    public final Object o;

    public ds2(Function0 function0, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i & 2) != 0 ? null : obj;
        function0.getClass();
        this.m = function0;
        this.n = r13.a;
        this.o = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new f21(getValue());
    }

    @Override // defpackage.y91
    public final boolean a() {
        return this.n != r13.a;
    }

    @Override // defpackage.y91
    public final Object getValue() {
        Object obj;
        Object obj2 = this.n;
        r13 r13Var = r13.a;
        if (obj2 != r13Var) {
            return obj2;
        }
        synchronized (this.o) {
            obj = this.n;
            if (obj == r13Var) {
                Function0 function0 = this.m;
                function0.getClass();
                obj = function0.invoke();
                this.n = obj;
                this.m = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
