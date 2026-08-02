package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withDefinedIn", "getWithDefinedIn()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "modifiers", "getModifiers()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "startFromName", "getStartFromName()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "debugMode", "getDebugMode()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "verbose", "getVerbose()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "unitReturnType", "getUnitReturnType()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutReturnType", "getWithoutReturnType()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "enhancedTypes", "getEnhancedTypes()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "normalizedVisibilities", "getNormalizedVisibilities()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultVisibility", "getRenderDefaultVisibility()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultModality", "getRenderDefaultModality()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderConstructorDelegation", "getRenderConstructorDelegation()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "includePropertyConstant", "getIncludePropertyConstant()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "propertyConstantRenderer", "getPropertyConstantRenderer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutTypeParameters", "getWithoutTypeParameters()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "withoutSuperTypes", "getWithoutSuperTypes()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "receiverAfterName", "getReceiverAfterName()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderCompanionObjectName", "getRenderCompanionObjectName()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderConstructorKeyword", "getRenderConstructorKeyword()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderTypeExpansions", "getRenderTypeExpansions()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderAbbreviatedTypeComments", "getRenderAbbreviatedTypeComments()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "renderFunctionContracts", "getRenderFunctionContracts()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z", 0), new MutablePropertyReference1Impl(DescriptorRendererOptionsImpl.class, "informativeErrorType", "getInformativeErrorType()Z", 0)};
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 actualPropertiesInPrimaryConstructor$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 alwaysRenderModifiers$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 annotationArgumentsRenderingPolicy$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 annotationFilter$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 boldOnlyForNamesInHtml$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 classWithPrimaryConstructor$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 classifierNamePolicy$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.INSTANCE, this);
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 debugMode$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 defaultParameterValueRenderer$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 eachAnnotationOnNewLine$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 enhancedTypes$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 excludedAnnotationClasses$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 excludedTypeAnnotationClasses$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 includeAdditionalModifiers$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 includePropertyConstant$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 informativeErrorType$delegate;
    public boolean isLocked;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 modifiers$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 normalizedVisibilities$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 overrideRenderingPolicy$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 parameterNameRenderingPolicy$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 parameterNamesInFunctionalTypes$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 presentableUnresolvedTypes$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 propertyAccessorRenderingPolicy$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 propertyConstantRenderer$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 receiverAfterName$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 renderAbbreviatedTypeComments$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 renderCompanionObjectName$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 renderConstructorDelegation$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 renderConstructorKeyword$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 renderDefaultAnnotationArguments$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 renderDefaultModality$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 renderDefaultVisibility$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 renderPrimaryConstructorParametersAsProperties$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 renderTypeExpansions$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 renderUnabbreviatedType$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 secondaryConstructorsAsPrimary$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 startFromDeclarationKeyword$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 startFromName$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 textFormat$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 typeNormalizer$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 uninferredTypeParameterAsName$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 unitReturnType$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 valueParametersHandler$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 verbose$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 withDefinedIn$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 withSourceFileForTopLevel$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 withoutReturnType$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 withoutSuperTypes$delegate;
    public final DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 withoutTypeParameters$delegate;

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.withDefinedIn$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.withSourceFileForTopLevel$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.modifiers$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS, this);
        Boolean bool2 = Boolean.FALSE;
        this.startFromName$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.startFromDeclarationKeyword$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.debugMode$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.classWithPrimaryConstructor$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.verbose$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.unitReturnType$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.withoutReturnType$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.enhancedTypes$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.normalizedVisibilities$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.renderDefaultVisibility$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.renderDefaultModality$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.renderConstructorDelegation$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.renderPrimaryConstructorParametersAsProperties$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.actualPropertiesInPrimaryConstructor$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.uninferredTypeParameterAsName$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.includePropertyConstant$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.propertyConstantRenderer$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        this.withoutTypeParameters$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.withoutSuperTypes$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.typeNormalizer$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(RenderingUtilsKt$$Lambda$0.INSTANCE$15, this);
        this.defaultParameterValueRenderer$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(RenderingUtilsKt$$Lambda$0.INSTANCE$16, this);
        this.secondaryConstructorsAsPrimary$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.overrideRenderingPolicy$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(OverrideRenderingPolicy.RENDER_OPEN, this);
        this.valueParametersHandler$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(DescriptorRenderer.ValueParametersHandler.DEFAULT.INSTANCE, this);
        this.textFormat$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(RenderingFormat.PLAIN, this);
        this.parameterNameRenderingPolicy$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ParameterNameRenderingPolicy.ALL, this);
        this.receiverAfterName$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.renderCompanionObjectName$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.propertyAccessorRenderingPolicy$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(PropertyAccessorRenderingPolicy.DEBUG, this);
        this.renderDefaultAnnotationArguments$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.eachAnnotationOnNewLine$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.excludedAnnotationClasses$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(EmptySet.INSTANCE, this);
        this.excludedTypeAnnotationClasses$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve(), this);
        this.annotationFilter$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(null, this);
        this.annotationArgumentsRenderingPolicy$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS, this);
        this.alwaysRenderModifiers$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.renderConstructorKeyword$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.renderUnabbreviatedType$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.renderTypeExpansions$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.renderAbbreviatedTypeComments$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.includeAdditionalModifiers$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        this.parameterNamesInFunctionalTypes$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
        new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.presentableUnresolvedTypes$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.boldOnlyForNamesInHtml$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool2, this);
        this.informativeErrorType$delegate = new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(bool, this);
    }

    public final DescriptorRendererOptionsImpl copy() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = DescriptorRendererOptionsImpl.class.getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                ObservableProperty observableProperty = obj instanceof ObservableProperty ? (ObservableProperty) obj : null;
                if (observableProperty != null) {
                    String name = field.getName();
                    name.getClass();
                    StringsKt__StringsJVMKt.startsWith(name, "is", false);
                    KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    String name3 = field.getName();
                    name3.getClass();
                    if (name3.length() > 0) {
                        name3 = Character.toUpperCase(name3.charAt(0)) + name3.substring(1);
                    }
                    field.set(descriptorRendererOptionsImpl, new DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(observableProperty.getValue(this, new PropertyReference1Impl(CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) orCreateKotlinClass).getJClass(), name2, "get".concat(name3), 0)), descriptorRendererOptionsImpl));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return ((Boolean) this.actualPropertiesInPrimaryConstructor$delegate.getValue(this, $$delegatedProperties[17])).booleanValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return ((Boolean) this.alwaysRenderModifiers$delegate.getValue(this, $$delegatedProperties[39])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (AnnotationArgumentsRenderingPolicy) this.annotationArgumentsRenderingPolicy$delegate.getValue(this, $$delegatedProperties[38]);
    }

    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return (Function1) this.annotationFilter$delegate.getValue(this, $$delegatedProperties[37]);
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return ((Boolean) this.boldOnlyForNamesInHtml$delegate.getValue(this, $$delegatedProperties[48])).booleanValue();
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((Boolean) this.classWithPrimaryConstructor$delegate.getValue(this, $$delegatedProperties[7])).booleanValue();
    }

    public ClassifierNamePolicy getClassifierNamePolicy() {
        return (ClassifierNamePolicy) this.classifierNamePolicy$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return ((Boolean) this.debugMode$delegate.getValue(this, $$delegatedProperties[6])).booleanValue();
    }

    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return (Function1) this.defaultParameterValueRenderer$delegate.getValue(this, $$delegatedProperties[24]);
    }

    public boolean getEachAnnotationOnNewLine() {
        return ((Boolean) this.eachAnnotationOnNewLine$delegate.getValue(this, $$delegatedProperties[34])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return ((Boolean) this.enhancedTypes$delegate.getValue(this, $$delegatedProperties[11])).booleanValue();
    }

    public Set<FqName> getExcludedAnnotationClasses() {
        return (Set) this.excludedAnnotationClasses$delegate.getValue(this, $$delegatedProperties[35]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return (Set) this.excludedTypeAnnotationClasses$delegate.getValue(this, $$delegatedProperties[36]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((Boolean) this.includeAdditionalModifiers$delegate.getValue(this, $$delegatedProperties[44])).booleanValue();
    }

    public /* bridge */ boolean getIncludeAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeAnnotationArguments(this);
    }

    public /* bridge */ boolean getIncludeEmptyAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public boolean getIncludePropertyConstant() {
        return ((Boolean) this.includePropertyConstant$delegate.getValue(this, $$delegatedProperties[19])).booleanValue();
    }

    public boolean getInformativeErrorType() {
        return ((Boolean) this.informativeErrorType$delegate.getValue(this, $$delegatedProperties[49])).booleanValue();
    }

    public Set<DescriptorRendererModifier> getModifiers() {
        return (Set) this.modifiers$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((Boolean) this.normalizedVisibilities$delegate.getValue(this, $$delegatedProperties[12])).booleanValue();
    }

    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (OverrideRenderingPolicy) this.overrideRenderingPolicy$delegate.getValue(this, $$delegatedProperties[26]);
    }

    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (ParameterNameRenderingPolicy) this.parameterNameRenderingPolicy$delegate.getValue(this, $$delegatedProperties[29]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((Boolean) this.parameterNamesInFunctionalTypes$delegate.getValue(this, $$delegatedProperties[45])).booleanValue();
    }

    public boolean getPresentableUnresolvedTypes() {
        return ((Boolean) this.presentableUnresolvedTypes$delegate.getValue(this, $$delegatedProperties[47])).booleanValue();
    }

    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return (PropertyAccessorRenderingPolicy) this.propertyAccessorRenderingPolicy$delegate.getValue(this, $$delegatedProperties[32]);
    }

    public Function1<ConstantValue<?>, String> getPropertyConstantRenderer() {
        return (Function1) this.propertyConstantRenderer$delegate.getValue(this, $$delegatedProperties[20]);
    }

    public boolean getReceiverAfterName() {
        return ((Boolean) this.receiverAfterName$delegate.getValue(this, $$delegatedProperties[30])).booleanValue();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return ((Boolean) this.renderAbbreviatedTypeComments$delegate.getValue(this, $$delegatedProperties[43])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((Boolean) this.renderCompanionObjectName$delegate.getValue(this, $$delegatedProperties[31])).booleanValue();
    }

    public boolean getRenderConstructorDelegation() {
        return ((Boolean) this.renderConstructorDelegation$delegate.getValue(this, $$delegatedProperties[15])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((Boolean) this.renderConstructorKeyword$delegate.getValue(this, $$delegatedProperties[40])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((Boolean) this.renderDefaultAnnotationArguments$delegate.getValue(this, $$delegatedProperties[33])).booleanValue();
    }

    public boolean getRenderDefaultModality() {
        return ((Boolean) this.renderDefaultModality$delegate.getValue(this, $$delegatedProperties[14])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((Boolean) this.renderDefaultVisibility$delegate.getValue(this, $$delegatedProperties[13])).booleanValue();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((Boolean) this.renderPrimaryConstructorParametersAsProperties$delegate.getValue(this, $$delegatedProperties[16])).booleanValue();
    }

    public boolean getRenderTypeExpansions() {
        return ((Boolean) this.renderTypeExpansions$delegate.getValue(this, $$delegatedProperties[42])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((Boolean) this.renderUnabbreviatedType$delegate.getValue(this, $$delegatedProperties[41])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((Boolean) this.secondaryConstructorsAsPrimary$delegate.getValue(this, $$delegatedProperties[25])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((Boolean) this.startFromDeclarationKeyword$delegate.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((Boolean) this.startFromName$delegate.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public RenderingFormat getTextFormat() {
        return (RenderingFormat) this.textFormat$delegate.getValue(this, $$delegatedProperties[28]);
    }

    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return (Function1) this.typeNormalizer$delegate.getValue(this, $$delegatedProperties[23]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((Boolean) this.uninferredTypeParameterAsName$delegate.getValue(this, $$delegatedProperties[18])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((Boolean) this.unitReturnType$delegate.getValue(this, $$delegatedProperties[9])).booleanValue();
    }

    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return (DescriptorRenderer.ValueParametersHandler) this.valueParametersHandler$delegate.getValue(this, $$delegatedProperties[27]);
    }

    public boolean getVerbose() {
        return ((Boolean) this.verbose$delegate.getValue(this, $$delegatedProperties[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((Boolean) this.withDefinedIn$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((Boolean) this.withSourceFileForTopLevel$delegate.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((Boolean) this.withoutReturnType$delegate.getValue(this, $$delegatedProperties[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((Boolean) this.withoutSuperTypes$delegate.getValue(this, $$delegatedProperties[22])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((Boolean) this.withoutTypeParameters$delegate.getValue(this, $$delegatedProperties[21])).booleanValue();
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final void lock() {
        this.isLocked = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        annotationArgumentsRenderingPolicy.getClass();
        this.annotationArgumentsRenderingPolicy$delegate.setValue(this, $$delegatedProperties[38], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy) {
        classifierNamePolicy.getClass();
        this.classifierNamePolicy$delegate.setValue(this, $$delegatedProperties[0], classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z) {
        this.debugMode$delegate.setValue(this, $$delegatedProperties[6], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(Set<FqName> set) {
        set.getClass();
        this.excludedTypeAnnotationClasses$delegate.setValue(this, $$delegatedProperties[36], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(Set<? extends DescriptorRendererModifier> set) {
        set.getClass();
        this.modifiers$delegate.setValue(this, $$delegatedProperties[3], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.parameterNameRenderingPolicy$delegate.setValue(this, $$delegatedProperties[29], parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z) {
        this.receiverAfterName$delegate.setValue(this, $$delegatedProperties[30], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z) {
        this.renderCompanionObjectName$delegate.setValue(this, $$delegatedProperties[31], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z) {
        this.startFromName$delegate.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.textFormat$delegate.setValue(this, $$delegatedProperties[28], renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z) {
        this.verbose$delegate.setValue(this, $$delegatedProperties[8], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z) {
        this.withDefinedIn$delegate.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z) {
        this.withoutSuperTypes$delegate.setValue(this, $$delegatedProperties[22], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z) {
        this.withoutTypeParameters$delegate.setValue(this, $$delegatedProperties[21], Boolean.valueOf(z));
    }
}
