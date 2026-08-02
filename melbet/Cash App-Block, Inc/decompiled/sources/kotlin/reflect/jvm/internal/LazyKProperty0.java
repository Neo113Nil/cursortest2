package kotlin.reflect.jvm.internal;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty0;

/* loaded from: classes9.dex */
public class LazyKProperty0 extends LazyKProperty implements KProperty0 {
    public LazyKProperty0(Function0 function0) {
        super(function0);
    }

    @Override // kotlin.reflect.KProperty
    public final KProperty0.Getter getGetter() {
        return ((KProperty0) getDelegate()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((KProperty0) getDelegate()).invoke();
    }
}
