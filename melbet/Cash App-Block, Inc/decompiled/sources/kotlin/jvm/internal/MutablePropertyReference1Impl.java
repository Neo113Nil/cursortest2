package kotlin.jvm.internal;

import kotlin.reflect.jvm.internal.ReflectKCallableImpl;

/* loaded from: classes.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((ReflectKCallableImpl) getGetter()).call(obj);
    }

    @Override // kotlin.reflect.KMutableProperty1
    public void set(Object obj, Object obj2) {
        ((ReflectKCallableImpl) getSetter()).call(obj, obj2);
    }
}
