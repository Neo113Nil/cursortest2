package kotlin.jvm.internal;

import kotlin.reflect.jvm.internal.ReflectKCallableImpl;

/* loaded from: classes9.dex */
public class MutablePropertyReference0Impl extends MutablePropertyReference0 {
    public Object get() {
        return ((ReflectKCallableImpl) getGetter()).call(new Object[0]);
    }
}
