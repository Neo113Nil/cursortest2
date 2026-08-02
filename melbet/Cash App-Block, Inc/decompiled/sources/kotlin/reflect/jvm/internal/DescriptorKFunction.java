package kotlin.reflect.jvm.internal;

import androidx.room.Room;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.types.DescriptorKType;

/* loaded from: classes9.dex */
public final class DescriptorKFunction extends DescriptorKCallable implements FunctionBase, Function0, Function1, Function10, Function11, Function12, Function13, Function14, Function15, Function16, Function17, Function18, Function19, Function2, Function20, Function21, Function22, Function3, Function4, Function5, Function6, Function7, Function8, Function9, KCallable, ReflectKFunction {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(DescriptorKFunction.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};
    public final Lazy caller$delegate;
    public final KDeclarationContainerImpl container;
    public final Lazy defaultCaller$delegate;
    public final ReflectProperties$LazySoftVal descriptor$delegate;
    public final Object rawBoundReceiver;
    public final String signature;

    public DescriptorKFunction(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, FunctionDescriptor functionDescriptor, Object obj, KCallableOverriddenStorage kCallableOverriddenStorage) {
        super(kCallableOverriddenStorage);
        this.container = kDeclarationContainerImpl;
        this.signature = str2;
        this.rawBoundReceiver = obj;
        this.descriptor$delegate = TuplesKt.lazySoft(functionDescriptor, new KClassImpl$Data$$Lambda$22(10, this, str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.caller$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new DescriptorKFunction$$Lambda$1(this, 0));
        this.defaultCaller$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new DescriptorKFunction$$Lambda$1(this, 1));
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
    public final DescriptorKType computeReturnType() {
        KotlinType returnType = getDescriptor().getReturnType();
        returnType.getClass();
        return new DescriptorKType(returnType, new DescriptorKFunction$$Lambda$1(this, 2), false);
    }

    public final CallerImpl createConstructorCaller(Constructor constructor, FunctionDescriptor functionDescriptor, boolean z) {
        return (z || !InlineClassManglingRulesKt.shouldHideConstructorDueToValueClassTypeValueParameters(functionDescriptor)) ? Room.isBound(this) ? new CallerImpl.BoundConstructor(constructor, Room.getBoundReceiver(this), 0) : new CallerImpl.Constructor(constructor, 0) : Room.isBound(this) ? new CallerImpl.BoundConstructor(constructor, Room.getBoundReceiver(this), 1) : new CallerImpl.Constructor(constructor, 1);
    }

    public final CallerImpl.Method createStaticMethodCaller(Method method, boolean z) {
        Object boundReceiver;
        KotlinType type2;
        if (!Room.isBound(this)) {
            return new CallerImpl.Method.Static(6, 0, method, false);
        }
        ReceiverParameterDescriptor dispatchReceiverParameter = getDescriptor().getDispatchReceiverParameter();
        if (dispatchReceiverParameter != null && (type2 = dispatchReceiverParameter.getType()) != null && InlineClassesUtilsKt.isInlineClassType(type2)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            Class cls = (Class) ArraysKt___ArraysKt.firstOrNull(parameterTypes);
            if (cls != null && cls.isInterface()) {
                boundReceiver = this.rawBoundReceiver;
                return new CallerImpl.Method.BoundStatic(method, z, boundReceiver);
            }
        }
        boundReceiver = Room.getBoundReceiver(this);
        return new CallerImpl.Method.BoundStatic(method, z, boundReceiver);
    }

    public final boolean equals(Object obj) {
        ReflectKFunction reflectKFunction;
        FqName fqName = UtilKt.JVM_STATIC;
        if (obj instanceof ReflectKFunction) {
            reflectKFunction = (ReflectKFunction) obj;
        } else {
            if (obj instanceof FunctionReference) {
                KCallable compute = ((FunctionReference) obj).compute();
                if (compute instanceof ReflectKFunction) {
                    reflectKFunction = (ReflectKFunction) compute;
                }
            }
            reflectKFunction = null;
        }
        return reflectKFunction != null && Intrinsics.areEqual(this.container, reflectKFunction.getContainer()) && getName().equals(reflectKFunction.getName()) && Intrinsics.areEqual(this.signature, reflectKFunction.getSignature()) && Intrinsics.areEqual(this.rawBoundReceiver, reflectKFunction.getRawBoundReceiver());
    }

    @Override // kotlin.jvm.internal.KotlinGenericDeclaration
    public final GenericDeclaration findJavaDeclaration() {
        return KotlinGenericDeclarationKt.findMethodBySignature(this.container, this.signature);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        Caller caller = getCaller();
        caller.getClass();
        return caller.getParameterTypes().size();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Caller getCaller() {
        return (Caller) this.caller$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Caller getDefaultCaller() {
        return (Caller) this.defaultCaller$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
    public final FunctionDescriptor getDescriptor() {
        KProperty kProperty = $$delegatedProperties[0];
        Object invoke = this.descriptor$delegate.invoke();
        invoke.getClass();
        return (FunctionDescriptor) invoke;
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        String asString = getDescriptor().getName().asString();
        asString.getClass();
        return asString;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKFunction
    public final String getSignature() {
        return this.signature;
    }

    public final int hashCode() {
        return this.signature.hashCode() + ((getName().hashCode() + (this.container.hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isExternal() {
        return this.overriddenStorage.forceIsExternal || getDescriptor().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInfix() {
        return this.overriddenStorage.forceIsInfix || getDescriptor().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInline() {
        return this.overriddenStorage.forceIsInline || getDescriptor().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isOperator() {
        return this.overriddenStorage.forceIsOperator || getDescriptor().isOperator();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKFunction
    public final boolean isPrimaryConstructor() {
        FunctionDescriptor descriptor = getDescriptor();
        ConstructorDescriptor constructorDescriptor = descriptor instanceof ConstructorDescriptor ? (ConstructorDescriptor) descriptor : null;
        return constructorDescriptor != null && constructorDescriptor.isPrimary();
    }

    @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
    public final boolean isSuspend() {
        return getDescriptor().isSuspend();
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
    public final DescriptorKCallable shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage) {
        return new DescriptorKFunction(this.container, getDescriptor(), kCallableOverriddenStorage);
    }

    public final String toString() {
        return ReflectionObjectRenderer.renderFunction(this);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.jvm.functions.Function7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, serializable);
    }

    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, serializable);
    }

    @Override // kotlin.jvm.functions.Function15
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Serializable serializable) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, serializable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DescriptorKFunction(KDeclarationContainerImpl kDeclarationContainerImpl, FunctionDescriptor functionDescriptor, KCallableOverriddenStorage kCallableOverriddenStorage) {
        this(kDeclarationContainerImpl, r3, RuntimeTypeMapper.mapSignature(functionDescriptor).asString(), functionDescriptor, CallableReference.NO_RECEIVER, kCallableOverriddenStorage);
        kDeclarationContainerImpl.getClass();
        functionDescriptor.getClass();
        kCallableOverriddenStorage.getClass();
        String asString = functionDescriptor.getName().asString();
        asString.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DescriptorKFunction(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj, KCallableOverriddenStorage.EMPTY);
        str.getClass();
        str2.getClass();
    }

    public DescriptorKFunction(KDeclarationContainerImpl kDeclarationContainerImpl, FunctionDescriptor functionDescriptor) {
        this(kDeclarationContainerImpl, functionDescriptor, KCallableOverriddenStorage.EMPTY);
    }
}
