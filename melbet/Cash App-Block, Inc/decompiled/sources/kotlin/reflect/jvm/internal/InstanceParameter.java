package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.KClass;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KType;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.types.AbstractKType;

/* loaded from: classes9.dex */
public final class InstanceParameter extends ReflectKParameter {
    public final ReflectKCallable callable;

    /* renamed from: type, reason: collision with root package name */
    public final AbstractKType f1522type;

    public InstanceParameter(KotlinKCallable kotlinKCallable, KClass kClass) {
        kotlinKCallable.getClass();
        kClass.getClass();
        this.callable = kotlinKCallable;
        this.f1522type = KClasses.createDefaultType(kClass);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter, kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final ReflectKCallable getCallable() {
        return this.callable;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final boolean getDeclaresDefaultValue() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final int getIndex() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final KParameter$Kind getKind() {
        return KParameter$Kind.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final String getName() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final KType getType() {
        return this.f1522type;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final boolean isOptional() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final boolean isVararg() {
        return false;
    }
}
