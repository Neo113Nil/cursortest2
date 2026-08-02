package kotlin.reflect.jvm.internal;

import kotlin.reflect.KMutableProperty0;

/* loaded from: classes9.dex */
public final class LazyKMutableProperty0 extends LazyKProperty0 implements KMutableProperty0 {
    public LazyKMutableProperty0(KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$23) {
        super(kClassImpl$Data$$Lambda$23);
    }

    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty0.Setter getSetter() {
        return ((KMutableProperty0) getDelegate()).getSetter();
    }
}
