package kotlin.reflect.jvm.internal.types;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.text.StringsKt;

/* loaded from: classes9.dex */
public final class MutableCollectionKClass implements KClass, KTypeParameterOwnerImpl, TypeConstructorMarker {
    public final KClass klass;
    public final String qualifiedName;
    public final List supertypes;
    public final List typeParameters;

    public MutableCollectionKClass(KClass kClass, String str, Function1 function1, Function1 function12) {
        kClass.getClass();
        str.getClass();
        this.klass = kClass;
        this.qualifiedName = str;
        this.typeParameters = (List) function1.invoke(this);
        this.supertypes = (List) function12.invoke(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MutableCollectionKClass) {
            return Intrinsics.areEqual(this.klass, ((MutableCollectionKClass) obj).klass);
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return this.klass.getAnnotations();
    }

    @Override // kotlin.reflect.KClass
    public final Collection getConstructors() {
        return this.klass.getConstructors();
    }

    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        return this.qualifiedName;
    }

    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        return StringsKt.substringAfterLast$default(this.qualifiedName, ".");
    }

    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        return this.supertypes;
    }

    @Override // kotlin.reflect.KClass
    public final List getTypeParameters() {
        return this.typeParameters;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return this.klass.hashCode();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        return this.klass.isInner();
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object obj) {
        return this.klass.isInstance(obj);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        return this.klass.isValue();
    }

    public final String toString() {
        return "MutableCollectionKClass(" + this.klass + ')';
    }
}
