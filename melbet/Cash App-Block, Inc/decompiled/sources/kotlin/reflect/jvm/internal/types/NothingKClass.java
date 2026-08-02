package kotlin.reflect.jvm.internal.types;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* loaded from: classes9.dex */
public final class NothingKClass implements KClass, KTypeParameterOwnerImpl, TypeConstructorMarker {
    public static final NothingKClass INSTANCE = new NothingKClass();
    public final /* synthetic */ KClass $$delegate_0 = Reflection.factory.getOrCreateKotlinClass(Void.class);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.$$delegate_0.getAnnotations();
    }

    @Override // kotlin.reflect.KClass
    public final Collection getConstructors() {
        return this.$$delegate_0.getConstructors();
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        return "kotlin.Nothing";
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        return "Nothing";
    }

    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        return this.$$delegate_0.getSupertypes();
    }

    @Override // kotlin.reflect.KClass
    public final List getTypeParameters() {
        return this.$$delegate_0.getTypeParameters();
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        return this.$$delegate_0.isInner();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object obj) {
        return this.$$delegate_0.isInstance(obj);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        return this.$$delegate_0.isValue();
    }

    public final String toString() {
        return "NothingKClass";
    }
}
