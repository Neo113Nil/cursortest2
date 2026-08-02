package kotlin.reflect;

import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public interface KMutableProperty extends KProperty {

    /* loaded from: classes9.dex */
    public interface Setter extends KProperty.Accessor, KFunction {
    }

    Setter getSetter();
}
