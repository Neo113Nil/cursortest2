package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

/* loaded from: classes3.dex */
public abstract class PropertyReference1 extends PropertyReference implements KProperty1 {
    @Override // kotlin.jvm.internal.CallableReference
    public final KCallable computeReflected() {
        return Reflection.factory.property1(this);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty1.Getter getGetter() {
        return ((KProperty1) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
