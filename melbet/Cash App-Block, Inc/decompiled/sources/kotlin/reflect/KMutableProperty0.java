package kotlin.reflect;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KMutableProperty;

/* loaded from: classes9.dex */
public interface KMutableProperty0 extends KProperty0, KMutableProperty {

    public interface Setter extends KMutableProperty.Setter, Function1 {
    }

    @Override // kotlin.reflect.KMutableProperty
    Setter getSetter();
}
