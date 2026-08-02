package kotlin.reflect;

import kotlin.jvm.functions.Function2;
import kotlin.reflect.KMutableProperty;

/* loaded from: classes3.dex */
public interface KMutableProperty1 extends KProperty1, KMutableProperty {

    /* loaded from: classes9.dex */
    public interface Setter extends KMutableProperty.Setter, Function2 {
    }

    @Override // kotlin.reflect.KMutableProperty
    Setter getSetter();

    void set(Object obj, Object obj2);
}
