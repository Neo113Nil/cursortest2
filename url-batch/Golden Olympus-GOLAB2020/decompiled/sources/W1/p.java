package W1;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class p implements h, Serializable {

    /* renamed from: b, reason: collision with root package name */
    private Function0 f9616b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f9617c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f9618d;

    public p(Function0 initializer, Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f9616b = initializer;
        this.f9617c = x.f9637a;
        this.f9618d = obj == null ? this : obj;
    }

    public boolean c() {
        return this.f9617c != x.f9637a;
    }

    @Override // W1.h
    public Object getValue() {
        Object obj;
        Object obj2 = this.f9617c;
        x xVar = x.f9637a;
        if (obj2 != xVar) {
            return obj2;
        }
        synchronized (this.f9618d) {
            obj = this.f9617c;
            if (obj == xVar) {
                Function0 function0 = this.f9616b;
                Intrinsics.checkNotNull(function0);
                obj = function0.invoke();
                this.f9617c = obj;
                this.f9616b = null;
            }
        }
        return obj;
    }

    public String toString() {
        return c() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ p(Function0 function0, Object obj, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i4 & 2) != 0 ? null : obj);
    }
}
