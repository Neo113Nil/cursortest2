package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.KmFunction;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class KotlinKNamedFunction extends KotlinKFunction {
    public final Lazy _typeParameterTable;
    public final KmFunction kmFunction;
    public final Lazy returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinKNamedFunction(KDeclarationContainerImpl kDeclarationContainerImpl, String str, Object obj, KmFunction kmFunction) {
        super(kDeclarationContainerImpl, str, obj);
        kmFunction.getClass();
        this.kmFunction = kmFunction;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this._typeParameterTable = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KotlinKNamedFunction$$Lambda$0(kDeclarationContainerImpl, this));
        this.returnType$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KotlinKNamedFunction$$Lambda$0(this, kDeclarationContainerImpl));
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKFunction
    public final List getContextParameters() {
        return this.kmFunction.getContextParameters();
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKFunction
    public final KmType getExtensionReceiverType() {
        return this.kmFunction.getReceiverParameterType();
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKFunction
    public final JvmMethodSignature getJvmSignature() {
        JvmMethodSignature signature = JvmExtensionsKt.getSignature(this.kmFunction);
        if (signature != null) {
            return signature;
        }
        f$$ExternalSyntheticLambda0.m$1(this, "No signature for function: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKCallable
    public final Modality getModality() {
        return Attributes.getModality(this.kmFunction);
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        return this.kmFunction.getName();
    }

    @Override // kotlin.reflect.KCallable
    public final KType getReturnType() {
        return (KType) this.returnType$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKFunction
    public final TypeParameterTable getTypeParameterTable() {
        return (TypeParameterTable) this._typeParameterTable.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKFunction
    public final List getValueParameters() {
        return this.kmFunction.getValueParameters();
    }

    @Override // kotlin.reflect.KCallable
    public final KVisibility getVisibility() {
        return ConvertFromMetadataKt.toKVisibility(Attributes.getVisibility(this.kmFunction));
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isExternal() {
        return Attributes.isExternal(this.kmFunction);
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInfix() {
        return Attributes.isInfix(this.kmFunction);
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInline() {
        return Attributes.isInline(this.kmFunction);
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isOperator() {
        return Attributes.isOperator(this.kmFunction);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKFunction
    public final boolean isPrimaryConstructor() {
        return false;
    }

    @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
    public final boolean isSuspend() {
        return Attributes.isSuspend(this.kmFunction);
    }
}
