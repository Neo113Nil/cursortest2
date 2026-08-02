package kotlin.reflect.jvm.internal;

import kotlin.reflect.KMutableProperty1;

/* loaded from: classes9.dex */
public final class LazyKMutableProperty1 extends LazyKProperty1 implements KMutableProperty1 {
    public LazyKMutableProperty1(KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$23) {
        super(kClassImpl$Data$$Lambda$23);
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty1.Setter getSetter() {
        return ((KMutableProperty1) getDelegate()).getSetter();
    }

    @Override // kotlin.reflect.KMutableProperty1
    public final void set(Object obj, Object obj2) {
        ((KMutableProperty1) getDelegate()).set(obj, obj2);
    }
}
