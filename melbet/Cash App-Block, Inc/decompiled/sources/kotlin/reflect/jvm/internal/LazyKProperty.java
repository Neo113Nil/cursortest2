package kotlin.reflect.jvm.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;

/* loaded from: classes3.dex */
public abstract class LazyKProperty implements KProperty {
    public final Lazy delegate$delegate;

    public LazyKProperty(Function0 function0) {
        this.delegate$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, function0);
    }

    @Override // kotlin.reflect.KCallable
    public final Object call(Object... objArr) {
        objArr.getClass();
        return getDelegate().call(Arrays.copyOf(objArr, objArr.length));
    }

    @Override // kotlin.reflect.KCallable
    public final Object callBy(Map map) {
        map.getClass();
        return getDelegate().callBy(map);
    }

    public final boolean equals(Object obj) {
        return Intrinsics.areEqual(getDelegate(), obj);
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return getDelegate().getAnnotations();
    }

    public final KProperty getDelegate() {
        return (KProperty) this.delegate$delegate.getValue();
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        return getDelegate().getName();
    }

    @Override // kotlin.reflect.KCallable
    public final List getParameters() {
        return getDelegate().getParameters();
    }

    @Override // kotlin.reflect.KCallable
    public final KType getReturnType() {
        return getDelegate().getReturnType();
    }

    @Override // kotlin.reflect.KCallable
    public final List getTypeParameters() {
        return getDelegate().getTypeParameters();
    }

    @Override // kotlin.reflect.KCallable
    public final KVisibility getVisibility() {
        return getDelegate().getVisibility();
    }

    public final int hashCode() {
        return getDelegate().hashCode();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isAbstract() {
        return getDelegate().isAbstract();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isFinal() {
        return getDelegate().isFinal();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isOpen() {
        return getDelegate().isOpen();
    }

    public final String toString() {
        return getDelegate().toString();
    }
}
