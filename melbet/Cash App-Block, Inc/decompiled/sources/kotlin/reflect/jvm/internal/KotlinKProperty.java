package kotlin.reflect.jvm.internal;

import com.google.maps.android.compose.InputHandlerKt;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.KotlinKProperty;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.km.Modality;
import kotlin.reflect.jvm.internal.impl.km.Visibility;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmExtensionsKt;
import kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public abstract class KotlinKProperty extends KotlinKCallable implements ReflectKProperty {
    public final Lazy allParameters$delegate;
    public final KDeclarationContainerImpl container;
    public final Lazy javaField$delegate;
    public final KmProperty kmProperty;
    public final Lazy parameters$delegate;
    public final Object rawBoundReceiver;
    public final Lazy returnType$delegate;
    public final String signature;
    public final Lazy typeParameterTable;

    public abstract class Accessor extends KotlinKCallable implements KFunction, KProperty.Accessor {
        public abstract KmPropertyAccessorAttributes getAccessor();

        @Override // kotlin.reflect.KAnnotatedElement
        public final List getAnnotations() {
            Annotation[] annotations;
            if (InputHandlerKt.isLocalDelegated(getProperty())) {
                return EmptyList.INSTANCE;
            }
            Member member = getCaller().getMember();
            List list = null;
            Method method = member instanceof Method ? (Method) member : null;
            if (method != null && (annotations = method.getAnnotations()) != null) {
                list = ArraysKt___ArraysKt.toList(annotations);
            }
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            return UtilKt.unwrapKotlinRepeatableAnnotations(list);
        }

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final KDeclarationContainerImpl getContainer() {
            return getProperty().container;
        }

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final Caller getDefaultCaller() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.KotlinKCallable
        public final Modality getModality() {
            Modality modality;
            KmPropertyAccessorAttributes accessor = getAccessor();
            return (accessor == null || (modality = Attributes.getModality(accessor)) == null) ? Attributes.getModality(getProperty().kmProperty) : modality;
        }

        public abstract KotlinKProperty getProperty();

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final Object getRawBoundReceiver() {
            return getProperty().rawBoundReceiver;
        }

        @Override // kotlin.reflect.KCallable
        public final List getTypeParameters() {
            return getProperty().getTypeParameters();
        }

        @Override // kotlin.reflect.KCallable
        public final KVisibility getVisibility() {
            Visibility visibility;
            KVisibility kVisibility;
            KmPropertyAccessorAttributes accessor = getAccessor();
            return (accessor == null || (visibility = Attributes.getVisibility(accessor)) == null || (kVisibility = ConvertFromMetadataKt.toKVisibility(visibility)) == null) ? getProperty().getVisibility() : kVisibility;
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isExternal() {
            KmPropertyAccessorAttributes accessor = getAccessor();
            return accessor != null && Attributes.isExternal(accessor);
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isInfix() {
            return false;
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isInline() {
            KmPropertyAccessorAttributes accessor = getAccessor();
            return accessor != null && Attributes.isInline(accessor);
        }

        @Override // kotlin.reflect.KFunction
        public final boolean isOperator() {
            return false;
        }

        @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
        public final boolean isSuspend() {
            return false;
        }
    }

    public abstract class Getter extends Accessor implements KProperty.Getter {
        public final Lazy caller$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new KotlinKPropertyN$$Lambda$0(this, 1));

        public final boolean equals(Object obj) {
            return (obj instanceof Getter) && Intrinsics.areEqual(getProperty(), ((Getter) obj).getProperty());
        }

        @Override // kotlin.reflect.jvm.internal.KotlinKProperty.Accessor
        public final KmPropertyAccessorAttributes getAccessor() {
            return getProperty().kmProperty.getGetter();
        }

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final List getAllParameters() {
            return getProperty().getAllParameters();
        }

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final Caller getCaller() {
            return (Caller) this.caller$delegate.getValue();
        }

        @Override // kotlin.reflect.KCallable
        public final String getName() {
            return "<get-" + getProperty().kmProperty.getName() + '>';
        }

        @Override // kotlin.reflect.KCallable
        public final List getParameters() {
            return getProperty().getParameters();
        }

        @Override // kotlin.reflect.KCallable
        public final KType getReturnType() {
            return getProperty().getReturnType();
        }

        public final int hashCode() {
            return getProperty().hashCode();
        }

        public final String toString() {
            return "getter of " + getProperty();
        }
    }

    public abstract class Setter extends Accessor implements KMutableProperty.Setter {
        public final Lazy caller$delegate;
        public final Lazy setterParameter;

        public final class DefaultSetterValueParameter extends ReflectKParameter {
            public final KotlinKProperty callable;

            public DefaultSetterValueParameter(KotlinKProperty kotlinKProperty) {
                kotlinKProperty.getClass();
                this.callable = kotlinKProperty;
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
                return KParameter$Kind.VALUE;
            }

            @Override // kotlin.reflect.jvm.internal.ReflectKParameter
            public final String getName() {
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.ReflectKParameter
            public final KType getType() {
                return this.callable.getReturnType();
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

        public Setter() {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            final int i = 0;
            this.setterParameter = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KotlinKProperty$Setter$$Lambda$0
                public final KotlinKProperty.Setter arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            KotlinKProperty.Setter setter = this.arg$0;
                            KmValueParameter setterParameter = setter.getProperty().kmProperty.getSetterParameter();
                            return setterParameter != null ? new KotlinKParameter(setter, setterParameter, setter.getProperty().getAllParameters().size(), KParameter$Kind.VALUE, (TypeParameterTable) setter.getProperty().typeParameterTable.getValue()) : new KotlinKProperty.Setter.DefaultSetterValueParameter(setter.getProperty());
                        default:
                            return KotlinKPropertyKt.computeCallerForAccessor(this.arg$0, false);
                    }
                }
            });
            final int i2 = 1;
            this.caller$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KotlinKProperty$Setter$$Lambda$0
                public final KotlinKProperty.Setter arg$0;

                {
                    this.arg$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            KotlinKProperty.Setter setter = this.arg$0;
                            KmValueParameter setterParameter = setter.getProperty().kmProperty.getSetterParameter();
                            return setterParameter != null ? new KotlinKParameter(setter, setterParameter, setter.getProperty().getAllParameters().size(), KParameter$Kind.VALUE, (TypeParameterTable) setter.getProperty().typeParameterTable.getValue()) : new KotlinKProperty.Setter.DefaultSetterValueParameter(setter.getProperty());
                        default:
                            return KotlinKPropertyKt.computeCallerForAccessor(this.arg$0, false);
                    }
                }
            });
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Setter) && Intrinsics.areEqual(getProperty(), ((Setter) obj).getProperty());
        }

        @Override // kotlin.reflect.jvm.internal.KotlinKProperty.Accessor
        public final KmPropertyAccessorAttributes getAccessor() {
            return getProperty().kmProperty.getSetter();
        }

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final List getAllParameters() {
            return CollectionsKt.plus((Collection) getProperty().getAllParameters(), this.setterParameter.getValue());
        }

        @Override // kotlin.reflect.jvm.internal.ReflectKCallable
        public final Caller getCaller() {
            return (Caller) this.caller$delegate.getValue();
        }

        @Override // kotlin.reflect.KCallable
        public final String getName() {
            return "<set-" + getProperty().kmProperty.getName() + '>';
        }

        @Override // kotlin.reflect.KCallable
        public final List getParameters() {
            return CollectionsKt.plus((Collection) getProperty().getParameters(), this.setterParameter.getValue());
        }

        @Override // kotlin.reflect.KCallable
        public final KType getReturnType() {
            return StandardKTypes.UNIT_RETURN_TYPE;
        }

        public final int hashCode() {
            return getProperty().hashCode();
        }

        public final String toString() {
            return "setter of " + getProperty();
        }
    }

    public KotlinKProperty(KDeclarationContainerImpl kDeclarationContainerImpl, String str, Object obj, KmProperty kmProperty) {
        kDeclarationContainerImpl.getClass();
        str.getClass();
        kmProperty.getClass();
        this.container = kDeclarationContainerImpl;
        this.signature = str;
        this.rawBoundReceiver = obj;
        this.kmProperty = kmProperty;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.allParameters$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KotlinKProperty$$Lambda$0(this, 0));
        this.parameters$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KotlinKProperty$$Lambda$0(this, 1));
        this.returnType$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KotlinKProperty$$Lambda$0(this, 2));
        this.typeParameterTable = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KotlinKProperty$$Lambda$0(this, 3));
        this.javaField$delegate = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new KotlinKProperty$$Lambda$0(this, 4));
    }

    public final Member computeDelegateSource() {
        KmProperty kmProperty = this.kmProperty;
        if (!Attributes.isDelegated(kmProperty)) {
            return null;
        }
        JvmMethodSignature syntheticMethodForDelegate = JvmExtensionsKt.getSyntheticMethodForDelegate(kmProperty);
        if (syntheticMethodForDelegate == null) {
            return getJavaField();
        }
        return this.container.findMethodBySignature(syntheticMethodForDelegate.getName(), syntheticMethodForDelegate.getDescriptor());
    }

    public final boolean equals(Object obj) {
        ReflectKProperty asReflectProperty = UtilKt.asReflectProperty(obj);
        return asReflectProperty != null && Intrinsics.areEqual(this.container, asReflectProperty.getContainer()) && Intrinsics.areEqual(this.kmProperty.getName(), asReflectProperty.getName()) && Intrinsics.areEqual(this.signature, asReflectProperty.getSignature()) && Intrinsics.areEqual(this.rawBoundReceiver, asReflectProperty.getRawBoundReceiver());
    }

    @Override // kotlin.jvm.internal.KotlinGenericDeclaration
    public final GenericDeclaration findJavaDeclaration() {
        return KotlinGenericDeclarationKt.findMethodBySignature(this.container, this.signature);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final List getAllParameters() {
        return (List) this.allParameters$delegate.getValue();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        Annotation[] annotations;
        List list;
        boolean isLocalDelegated = InputHandlerKt.isLocalDelegated(this);
        KmProperty kmProperty = this.kmProperty;
        KDeclarationContainerImpl kDeclarationContainerImpl = this.container;
        if (isLocalDelegated) {
            List<KmAnnotation> annotations2 = kmProperty.getAnnotations();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(annotations2, 10));
            for (KmAnnotation kmAnnotation : annotations2) {
                ClassLoader classLoader = kDeclarationContainerImpl.getJClass().getClassLoader();
                classLoader.getClass();
                arrayList.add(ConvertFromMetadataKt.toAnnotation(kmAnnotation, classLoader));
            }
            return arrayList;
        }
        if (!(kDeclarationContainerImpl instanceof KPackageImpl)) {
            Path$$ExternalSyntheticBUOutline0.m$3(this, "Annotations are only supported for top-level properties for now: ");
            return null;
        }
        JvmMethodSignature syntheticMethodForAnnotations = JvmExtensionsKt.getSyntheticMethodForAnnotations(kmProperty);
        if (syntheticMethodForAnnotations == null) {
            return EmptyList.INSTANCE;
        }
        Method findMethodBySignature = kDeclarationContainerImpl.findMethodBySignature(syntheticMethodForAnnotations.getName(), syntheticMethodForAnnotations.getDescriptor());
        if (findMethodBySignature != null && (annotations = findMethodBySignature.getAnnotations()) != null && (list = ArraysKt___ArraysKt.toList(annotations)) != null) {
            return UtilKt.unwrapKotlinRepeatableAnnotations(list);
        }
        f$$ExternalSyntheticLambda0.m$1(this, "No synthetic method found: ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Caller getCaller() {
        return getGetter().getCaller();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Caller getDefaultCaller() {
        getGetter().getClass();
        return null;
    }

    @Override // kotlin.reflect.KProperty
    public abstract Getter getGetter();

    @Override // kotlin.reflect.jvm.internal.ReflectKProperty
    public final Field getJavaField() {
        return (Field) this.javaField$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.KotlinKCallable
    public final Modality getModality() {
        return Attributes.getModality(this.kmProperty);
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        return this.kmProperty.getName();
    }

    @Override // kotlin.reflect.KCallable
    public final List getParameters() {
        return (List) this.parameters$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final Object getRawBoundReceiver() {
        return this.rawBoundReceiver;
    }

    @Override // kotlin.reflect.KCallable
    public final KType getReturnType() {
        return (KType) this.returnType$delegate.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKProperty
    public final String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.KCallable
    public final List getTypeParameters() {
        return ((TypeParameterTable) this.typeParameterTable.getValue()).ownTypeParameters;
    }

    @Override // kotlin.reflect.KCallable
    public final KVisibility getVisibility() {
        return ConvertFromMetadataKt.toKVisibility(Attributes.getVisibility(this.kmProperty));
    }

    public final int hashCode() {
        return this.signature.hashCode() + ((this.kmProperty.getName().hashCode() + (this.container.hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KCallable, kotlin.reflect.KFunction
    public final boolean isSuspend() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer.appendContexts(sb, this);
        sb.append(this instanceof KMutableProperty ? "var " : "val ");
        ReflectionObjectRenderer.appendReceivers(sb, this);
        ReflectionObjectRenderer.appendName(sb, this.kmProperty.getName());
        sb.append(": ");
        sb.append(ReflectionObjectRenderer.renderType(getReturnType(), false));
        return sb.toString();
    }
}
