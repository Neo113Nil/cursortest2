package R5;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class H implements InterfaceC0168h, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public Function0 f2407d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2408e;

    @Override // R5.InterfaceC0168h
    public final Object getValue() {
        if (this.f2408e == C.f2403a) {
            Function0 function0 = this.f2407d;
            Intrinsics.b(function0);
            this.f2408e = function0.invoke();
            this.f2407d = null;
        }
        return this.f2408e;
    }

    public final String toString() {
        return this.f2408e != C.f2403a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
