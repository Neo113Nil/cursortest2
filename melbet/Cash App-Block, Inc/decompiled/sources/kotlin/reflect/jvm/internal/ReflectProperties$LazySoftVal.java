package kotlin.reflect.jvm.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ReflectProperties$LazySoftVal implements Function0 {
    public static final ReflectProperties$Val$1 NULL_VALUE = new ReflectProperties$Val$1();
    public final Function0 initializer;
    public volatile SoftReference value;

    public ReflectProperties$LazySoftVal(Object obj, Function0 function0) {
        if (function0 == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.value = null;
        this.initializer = function0;
        if (obj != null) {
            this.value = new SoftReference(obj);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        Object obj2 = NULL_VALUE;
        SoftReference softReference = this.value;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object invoke = this.initializer.invoke();
        if (invoke != null) {
            obj2 = invoke;
        }
        this.value = new SoftReference(obj2);
        return invoke;
    }
}
