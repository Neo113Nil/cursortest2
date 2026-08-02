package kotlin.reflect.jvm.internal;

import kotlin.reflect.KProperty1;

/* loaded from: classes3.dex */
public class LazyKProperty1 extends LazyKProperty implements KProperty1 {
    @Override // kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((KProperty1) getDelegate()).get(obj);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty1.Getter getGetter() {
        return ((KProperty1) getDelegate()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((KProperty1) getDelegate()).invoke(obj);
    }
}
