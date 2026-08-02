package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

/* loaded from: classes9.dex */
public abstract class PropertyReference0 extends PropertyReference implements KProperty0 {
    @Override // kotlin.jvm.internal.CallableReference
    public final KCallable computeReflected() {
        return Reflection.factory.property0(this);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty0.Getter getGetter() {
        return ((KProperty0) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }
}
