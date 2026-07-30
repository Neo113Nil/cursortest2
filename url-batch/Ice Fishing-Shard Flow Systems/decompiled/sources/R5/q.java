package R5;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements InterfaceC0168h, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Function0 f2426d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2427e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f2428i;

    public q(Function0 initializer, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        obj = (i2 & 2) != 0 ? null : obj;
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f2426d = initializer;
        this.f2427e = C.f2403a;
        this.f2428i = obj == null ? this : obj;
    }

    @Override // R5.InterfaceC0168h
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f2427e;
        C c7 = C.f2403a;
        if (obj2 != c7) {
            return obj2;
        }
        synchronized (this.f2428i) {
            obj = this.f2427e;
            if (obj == c7) {
                Function0 function0 = this.f2426d;
                Intrinsics.b(function0);
                obj = function0.invoke();
                this.f2427e = obj;
                this.f2426d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f2427e != C.f2403a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
