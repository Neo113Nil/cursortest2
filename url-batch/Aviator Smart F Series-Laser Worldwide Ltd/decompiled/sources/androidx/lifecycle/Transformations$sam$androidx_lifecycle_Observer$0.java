package androidx.lifecycle;

import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, p {
    private final /* synthetic */ f6.l function;

    Transformations$sam$androidx_lifecycle_Observer$0(f6.l function) {
        s.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof p)) {
            return s.areEqual(getFunctionDelegate(), ((p) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.p
    public final y5.c getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
