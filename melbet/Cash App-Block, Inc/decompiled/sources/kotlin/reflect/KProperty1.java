package kotlin.reflect;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public interface KProperty1 extends KProperty, Function1 {

    /* loaded from: classes9.dex */
    public interface Getter extends KProperty.Getter, Function1 {
    }

    Object get(Object obj);

    @Override // kotlin.reflect.KProperty
    Getter getGetter();
}
