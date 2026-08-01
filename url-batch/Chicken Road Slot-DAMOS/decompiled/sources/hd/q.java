package hd;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q implements g, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Function0 f4517d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f4518e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f4519i;

    public q(Function0 function0, Object obj, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i3 & 2) != 0 ? null : obj;
        function0.getClass();
        this.f4517d = function0;
        this.f4518e = c0.f4498a;
        this.f4519i = obj == null ? this : obj;
    }

    @Override // hd.g
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f4518e;
        c0 c0Var = c0.f4498a;
        if (obj2 != c0Var) {
            return obj2;
        }
        synchronized (this.f4519i) {
            obj = this.f4518e;
            if (obj == c0Var) {
                Function0 function0 = this.f4517d;
                function0.getClass();
                obj = function0.invoke();
                this.f4518e = obj;
                this.f4517d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f4518e != c0.f4498a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
