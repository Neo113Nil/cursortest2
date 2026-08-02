package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.internal.DescriptorKProperty2;

/* loaded from: classes3.dex */
public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    @Override // kotlin.jvm.internal.CallableReference
    public final KCallable computeReflected() {
        return Reflection.factory.property2(this);
    }

    @Override // kotlin.reflect.KProperty
    public final DescriptorKProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PropertyReference2Impl) this).getGetter().call(obj, obj2);
    }
}
