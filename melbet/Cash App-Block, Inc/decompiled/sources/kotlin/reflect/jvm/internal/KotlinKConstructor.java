package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.KmConstructor;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class KotlinKConstructor extends KotlinKFunction {
    public final KmConstructor kmConstructor;
    public final Lazy returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotlinKConstructor(KDeclarationContainerImpl kDeclarationContainerImpl, String str, Object obj, KmConstructor kmConstructor) {
        super(kDeclarationContainerImpl, str, obj);
        kmConstructor.getClass();
        this.kmConstructor = kmConstructor;
        this.returnType$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConvertFromJavaKt$$Lambda$4(kDeclarationContainerImpl, 24));
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKFunction
    public final List getContextParameters() {
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKFunction
    public final KmType getExtensionReceiverType() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKFunction
    public final JvmMethodSignature getJvmSignature() {
        JvmMethodSignature signature = JvmExtensionsKt.getSignature(this.kmConstructor);
        if (signature != null) {
            return signature;
        }
        f$$ExternalSyntheticLambda0.m$1(this, "No signature for constructor: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKCallable
    public final Modality getModality() {
        return Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.reflect.KCallable
    public final KType getReturnType() {
        return (KType) this.returnType$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKFunction
    public final TypeParameterTable getTypeParameterTable() {
        KDeclarationContainerImpl kDeclarationContainerImpl = this.container;
        kDeclarationContainerImpl.getClass();
        return ((KClassImpl.Data) ((KClassImpl) kDeclarationContainerImpl).data.getValue()).getTypeParameterTable$kotlin_reflection();
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKFunction
    public final List getValueParameters() {
        return this.kmConstructor.getValueParameters();
    }

    @Override // kotlin.reflect.KCallable
    public final KVisibility getVisibility() {
        return ConvertFromMetadataKt.toKVisibility(Attributes.getVisibility(this.kmConstructor));
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInfix() {
        return false;
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isOperator() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKFunction
    public final boolean isPrimaryConstructor() {
        return !Attributes.isSecondary(this.kmConstructor);
    }

    @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
    public final boolean isSuspend() {
        return false;
    }
}
