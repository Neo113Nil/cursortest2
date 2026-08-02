package kotlin.reflect.jvm.internal;

import androidx.room.Room;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public final class KotlinKParameter extends ReflectKParameter {
    public final KotlinKCallable callable;
    public final int index;
    public final KParameter$Kind kind;
    public final KmValueParameter kmParameter;
    public final String name;
    public final Lazy type$delegate;

    public KotlinKParameter(KotlinKCallable kotlinKCallable, KmValueParameter kmValueParameter, int i, KParameter$Kind kParameter$Kind, TypeParameterTable typeParameterTable) {
        kotlinKCallable.getClass();
        kmValueParameter.getClass();
        typeParameterTable.getClass();
        this.callable = kotlinKCallable;
        this.kmParameter = kmValueParameter;
        this.index = i;
        this.kind = kParameter$Kind;
        String name = kmValueParameter.getName();
        this.name = StringsKt__StringsJVMKt.startsWith(name, "<", false) ? null : name;
        this.type$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KClassImpl$Data$$Lambda$22(11, this, typeParameterTable));
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final ReflectKCallable getCallable() {
        return this.callable;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final boolean getDeclaresDefaultValue() {
        return Attributes.getDeclaresDefaultValue(this.kmParameter);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final KParameter$Kind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final String getName() {
        return this.name;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final KType getType() {
        return (KType) this.type$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final boolean isOptional() {
        KotlinKCallable kotlinKCallable = this.callable;
        if ((kotlinKCallable instanceof KotlinKProperty) || (kotlinKCallable.getContainer() instanceof KPackageImpl) || Room.isConstructor(kotlinKCallable)) {
            return Attributes.getDeclaresDefaultValue(this.kmParameter);
        }
        Path$$ExternalSyntheticBUOutline0.m$3(kotlinKCallable, "Only constructors and top-level callables are supported for now: ");
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final boolean isVararg() {
        return this.kmParameter.getVarargElementType() != null;
    }
}
