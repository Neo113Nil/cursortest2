package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import com.stripe.android.uicore.elements.TextFieldUIKt$TextField$4$1;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import radiography.Radiography$renderScannableViewTree$1$2;

/* loaded from: classes9.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final NotNullLazyValue constructors;
    public final NotNullLazyValue enumEntryIndex;
    public final NotNullLazyValue generatedNestedClassNames;
    public final JavaClass jClass;
    public final NotNullLazyValue nestedClassIndex;
    public final MemoizedFunctionToNullable nestedClasses;
    public final ClassDescriptor ownerDescriptor;
    public final boolean skipRefinement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(lazyJavaResolverContext, lazyJavaClassMemberScope);
        lazyJavaResolverContext.getClass();
        classDescriptor.getClass();
        javaClass.getClass();
        this.ownerDescriptor = classDescriptor;
        this.jClass = javaClass;
        this.skipRefinement = z;
        this.constructors = lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$$Lambda$0(this, lazyJavaResolverContext));
        this.nestedClassIndex = lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$$Lambda$1(this, 0));
        this.generatedNestedClassNames = lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$$Lambda$0(lazyJavaResolverContext, this));
        this.enumEntryIndex = lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$$Lambda$1(this, 1));
        this.nestedClasses = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new OverridingUtil.AnonymousClass7(17, this, lazyJavaResolverContext));
    }

    public static SimpleFunctionDescriptor createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (!simpleFunctionDescriptor.equals(simpleFunctionDescriptor2) && simpleFunctionDescriptor2.getInitialSignatureDescriptor() == null && doesOverride(simpleFunctionDescriptor2, functionDescriptor)) {
                SimpleFunctionDescriptor build = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
                build.getClass();
                return build;
            }
        }
        return simpleFunctionDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SimpleFunctionDescriptor createSuspendView(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        FqName fqName;
        FqNameUnsafe fqNameUnsafe;
        List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor.getValueParameters();
        valueParameters.getClass();
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.lastOrNull((List) valueParameters);
        if (valueParameterDescriptor != null) {
            ClassifierDescriptor mo4153getDeclarationDescriptor = valueParameterDescriptor.getType().getConstructor().mo4153getDeclarationDescriptor();
            if (mo4153getDeclarationDescriptor != null && (fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(mo4153getDeclarationDescriptor)) != null) {
                if (!fqNameUnsafe.isSafe()) {
                    fqNameUnsafe = null;
                }
                if (fqNameUnsafe != null) {
                    fqName = fqNameUnsafe.toSafe();
                    if (!Intrinsics.areEqual(fqName, StandardNames.CONTINUATION_INTERFACE_FQ_NAME)) {
                        valueParameterDescriptor = null;
                    }
                    if (valueParameterDescriptor != null) {
                        FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
                        List<ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor.getValueParameters();
                        valueParameters2.getClass();
                        SimpleFunctionDescriptor build = newCopyBuilder.setValueParameters(CollectionsKt.dropLast(1, valueParameters2)).setReturnType(valueParameterDescriptor.getType().getArguments().get(0).getType()).build();
                        SimpleFunctionDescriptorImpl simpleFunctionDescriptorImpl = (SimpleFunctionDescriptorImpl) build;
                        if (simpleFunctionDescriptorImpl != null) {
                            simpleFunctionDescriptorImpl.setSuspend(true);
                        }
                        return build;
                    }
                }
            }
            fqName = null;
            if (!Intrinsics.areEqual(fqName, StandardNames.CONTINUATION_INTERFACE_FQ_NAME)) {
            }
            if (valueParameterDescriptor != null) {
            }
        }
        return null;
    }

    public static boolean doesOverride(FunctionDescriptor functionDescriptor, FunctionDescriptor functionDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(functionDescriptor2, functionDescriptor, true).getResult();
        result.getClass();
        return result == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(functionDescriptor2, functionDescriptor);
    }

    public static SimpleFunctionDescriptor findGetterByName(PropertyDescriptor propertyDescriptor, String str, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name identifier = Name.identifier(str);
        identifier.getClass();
        Iterator it = ((Iterable) function1.invoke(identifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null ? false : kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    public static SimpleFunctionDescriptor findSetterOverride(PropertyDescriptor propertyDescriptor, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String asString = propertyDescriptor.getName().asString();
        asString.getClass();
        Name identifier = Name.identifier(JvmAbi.setterName(asString));
        identifier.getClass();
        Iterator it = ((Iterable) function1.invoke(identifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.isUnit(returnType)) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor2.getValueParameters();
                valueParameters.getClass();
                if (kotlinTypeChecker.equalTypes(((ValueParameterDescriptor) CollectionsKt.single((List) valueParameters)).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    public static boolean hasSameJvmDescriptorButDoesNotOverride(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor original = functionDescriptor.getOriginal();
        original.getClass();
        return Intrinsics.areEqual(computeJvmDescriptor$default, MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null)) && !doesOverride(simpleFunctionDescriptor, functionDescriptor);
    }

    public final void addAnnotationValueParameter(ArrayList arrayList, JavaClassConstructorDescriptor javaClassConstructorDescriptor, int i, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = javaMethod.getName();
        KotlinType makeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        makeNotNullable.getClass();
        arrayList.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptor, null, i, empty, name, makeNotNullable, javaMethod.getHasAnnotationParameterDefaultValue(), false, false, kotlinType2 != null ? TypeUtils.makeNotNullable(kotlinType2) : null, this.c.getComponents().getSourceElementFactory().source(javaMethod)));
    }

    public final void addFunctionFromSupertypes(LinkedHashSet linkedHashSet, Name name, ArrayList arrayList, boolean z) {
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        Collection resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, arrayList, linkedHashSet, this.ownerDescriptor, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
        resolveOverridesForNonStaticMembers.getClass();
        if (!z) {
            linkedHashSet.addAll(resolveOverridesForNonStaticMembers);
            return;
        }
        Collection<SimpleFunctionDescriptor> collection = resolveOverridesForNonStaticMembers;
        ArrayList plus = CollectionsKt.plus((Iterable) collection, (Collection) linkedHashSet);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptor : collection) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenSpecialBuiltin(simpleFunctionDescriptor);
            if (simpleFunctionDescriptor2 == null) {
                simpleFunctionDescriptor.getClass();
            } else {
                simpleFunctionDescriptor.getClass();
                simpleFunctionDescriptor = createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(simpleFunctionDescriptor, simpleFunctionDescriptor2, plus);
            }
            arrayList2.add(simpleFunctionDescriptor);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0143 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void addOverriddenSpecialMethods(Name name, LinkedHashSet linkedHashSet, Collection collection, AbstractSet abstractSet, Function1 function1) {
        SimpleFunctionDescriptor createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden;
        Object obj;
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        SimpleFunctionDescriptor createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden2;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it.next();
            SimpleFunctionDescriptor simpleFunctionDescriptor3 = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(simpleFunctionDescriptor2);
            SimpleFunctionDescriptor simpleFunctionDescriptor4 = null;
            if (simpleFunctionDescriptor3 != null) {
                String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(simpleFunctionDescriptor3);
                jvmMethodNameIfSpecial.getClass();
                Name identifier = Name.identifier(jvmMethodNameIfSpecial);
                identifier.getClass();
                Iterator it2 = ((Collection) function1.invoke(identifier)).iterator();
                while (it2.hasNext()) {
                    FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = ((SimpleFunctionDescriptor) it2.next()).newCopyBuilder();
                    newCopyBuilder.setName(name);
                    newCopyBuilder.setSignatureChange();
                    newCopyBuilder.setPreserveSourceElement();
                    SimpleFunctionDescriptor build = newCopyBuilder.build();
                    build.getClass();
                    SimpleFunctionDescriptor simpleFunctionDescriptor5 = build;
                    FunctionDescriptor original = BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor3) ? simpleFunctionDescriptor5.getOriginal() : simpleFunctionDescriptor5;
                    original.getClass();
                    if (doesOverride(original, simpleFunctionDescriptor3)) {
                        createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden = createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(simpleFunctionDescriptor5, simpleFunctionDescriptor3, linkedHashSet);
                        break;
                    }
                }
            }
            createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden = null;
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(abstractSet, createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden);
            FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor2);
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                Name name2 = overriddenBuiltinFunctionWithErasedValueParametersInJava.getName();
                name2.getClass();
                Iterator it3 = ((Iterable) function1.invoke(name2)).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it3.next();
                        if (hasSameJvmDescriptorButDoesNotOverride((SimpleFunctionDescriptor) obj, overriddenBuiltinFunctionWithErasedValueParametersInJava)) {
                            break;
                        }
                    }
                }
                SimpleFunctionDescriptor simpleFunctionDescriptor6 = (SimpleFunctionDescriptor) obj;
                if (simpleFunctionDescriptor6 != null) {
                    FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder2 = simpleFunctionDescriptor6.newCopyBuilder();
                    List<ValueParameterDescriptor> valueParameters = overriddenBuiltinFunctionWithErasedValueParametersInJava.getValueParameters();
                    valueParameters.getClass();
                    List<ValueParameterDescriptor> list = valueParameters;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((ValueParameterDescriptor) it4.next()).getType());
                    }
                    List<ValueParameterDescriptor> valueParameters2 = simpleFunctionDescriptor6.getValueParameters();
                    valueParameters2.getClass();
                    newCopyBuilder2.setValueParameters(UtilKt.copyValueParameters(arrayList, valueParameters2, overriddenBuiltinFunctionWithErasedValueParametersInJava));
                    newCopyBuilder2.setSignatureChange();
                    newCopyBuilder2.setPreserveSourceElement();
                    newCopyBuilder2.putUserData(JavaMethodDescriptor.HAS_ERASED_VALUE_PARAMETERS, Boolean.TRUE);
                    simpleFunctionDescriptor = newCopyBuilder2.build();
                } else {
                    simpleFunctionDescriptor = null;
                }
                if (simpleFunctionDescriptor != null) {
                    if (!isVisibleAsFunctionInCurrentClass(simpleFunctionDescriptor)) {
                        simpleFunctionDescriptor = null;
                    }
                    if (simpleFunctionDescriptor != null) {
                        createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden2 = createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(simpleFunctionDescriptor, overriddenBuiltinFunctionWithErasedValueParametersInJava, linkedHashSet);
                        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(abstractSet, createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden2);
                        if (!simpleFunctionDescriptor2.isSuspend()) {
                            Name name3 = simpleFunctionDescriptor2.getName();
                            name3.getClass();
                            Iterator it5 = ((Iterable) function1.invoke(name3)).iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    break;
                                }
                                SimpleFunctionDescriptor createSuspendView = createSuspendView((SimpleFunctionDescriptor) it5.next());
                                if (createSuspendView == null || !doesOverride(createSuspendView, simpleFunctionDescriptor2)) {
                                    createSuspendView = null;
                                }
                                if (createSuspendView != null) {
                                    simpleFunctionDescriptor4 = createSuspendView;
                                    break;
                                }
                            }
                        }
                        kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(abstractSet, simpleFunctionDescriptor4);
                    }
                }
            }
            createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden2 = null;
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(abstractSet, createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden2);
            if (!simpleFunctionDescriptor2.isSuspend()) {
            }
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(abstractSet, simpleFunctionDescriptor4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor] */
    public final void addPropertyOverrideByMethod(Set set, AbstractCollection abstractCollection, SmartSet smartSet, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) it.next();
            PropertySetterDescriptorImpl propertySetterDescriptorImpl = null;
            if (doesClassOverridesProperty(propertyDescriptor, function1)) {
                SimpleFunctionDescriptor findGetterOverride = findGetterOverride(propertyDescriptor, function1);
                findGetterOverride.getClass();
                if (propertyDescriptor.isVar()) {
                    simpleFunctionDescriptor = findSetterOverride(propertyDescriptor, function1);
                    simpleFunctionDescriptor.getClass();
                } else {
                    simpleFunctionDescriptor = null;
                }
                if (simpleFunctionDescriptor != null) {
                    simpleFunctionDescriptor.getModality();
                    findGetterOverride.getModality();
                }
                ClassDescriptor classDescriptor = this.ownerDescriptor;
                ?? javaForKotlinOverridePropertyDescriptor = new JavaForKotlinOverridePropertyDescriptor(classDescriptor, findGetterOverride, simpleFunctionDescriptor, propertyDescriptor);
                KotlinType returnType = findGetterOverride.getReturnType();
                returnType.getClass();
                EmptyList emptyList = EmptyList.INSTANCE;
                javaForKotlinOverridePropertyDescriptor.setType(returnType, emptyList, DescriptorUtils.getDispatchReceiverParameterIfNeeded(classDescriptor), null, emptyList);
                PropertyGetterDescriptorImpl createGetter = DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor, findGetterOverride.getAnnotations(), false, false, false, findGetterOverride.getSource());
                createGetter.setInitialSignatureDescriptor(findGetterOverride);
                createGetter.initialize(javaForKotlinOverridePropertyDescriptor.getType());
                if (simpleFunctionDescriptor != null) {
                    List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor.getValueParameters();
                    valueParameters.getClass();
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.firstOrNull((List) valueParameters);
                    if (valueParameterDescriptor == null) {
                        ZslControlImpl$$ExternalSyntheticLambda1.m(simpleFunctionDescriptor, "No parameter found for ");
                        return;
                    } else {
                        propertyGetterDescriptorImpl = createGetter;
                        propertySetterDescriptorImpl = DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor, simpleFunctionDescriptor.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptor.getVisibility(), simpleFunctionDescriptor.getSource());
                        propertySetterDescriptorImpl.setInitialSignatureDescriptor(simpleFunctionDescriptor);
                    }
                } else {
                    propertyGetterDescriptorImpl = createGetter;
                }
                javaForKotlinOverridePropertyDescriptor.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImpl);
                propertySetterDescriptorImpl = javaForKotlinOverridePropertyDescriptor;
            }
            if (propertySetterDescriptorImpl != null) {
                abstractCollection.add(propertySetterDescriptorImpl);
                if (smartSet != null) {
                    smartSet.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        descriptorKindFilter.getClass();
        return SetsKt___SetsKt.plus((Set) this.nestedClassIndex.invoke(), (Iterable) ((Map) this.enumEntryIndex.invoke()).keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1 function1) {
        descriptorKindFilter.getClass();
        ClassDescriptor classDescriptor = this.ownerDescriptor;
        Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        supertypes.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((KotlinType) it.next()).getMemberScope().getFunctionNames(), linkedHashSet);
        }
        NotNullLazyValue notNullLazyValue = this.declaredMemberIndex;
        linkedHashSet.addAll(((DeclaredMemberIndex) notNullLazyValue.invoke()).getMethodNames());
        linkedHashSet.addAll(((DeclaredMemberIndex) notNullLazyValue.invoke()).getRecordComponentNames());
        linkedHashSet.addAll(computeClassNames(descriptorKindFilter, function1));
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        linkedHashSet.addAll(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getMethodNames(classDescriptor, lazyJavaResolverContext));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void computeImplicitlyDeclaredFunctions(Name name, ArrayList arrayList) {
        name.getClass();
        boolean isRecord = this.jClass.isRecord();
        ClassDescriptor classDescriptor = this.ownerDescriptor;
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        if (isRecord) {
            NotNullLazyValue notNullLazyValue = this.declaredMemberIndex;
            if (((DeclaredMemberIndex) notNullLazyValue.invoke()).findRecordComponentByName(name) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((SimpleFunctionDescriptor) it.next()).getValueParameters().isEmpty()) {
                            break;
                        }
                    }
                }
                JavaRecordComponent findRecordComponentByName = ((DeclaredMemberIndex) notNullLazyValue.invoke()).findRecordComponentByName(name);
                findRecordComponentByName.getClass();
                JavaMethodDescriptor createJavaMethod = JavaMethodDescriptor.createJavaMethod(classDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, findRecordComponentByName), findRecordComponentByName.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(findRecordComponentByName), true);
                createJavaMethod.getClass();
                KotlinType transformJavaType = lazyJavaResolverContext.getTypeResolver().transformJavaType(findRecordComponentByName.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null));
                ReceiverParameterDescriptor dispatchReceiverParameterIfNeeded = DescriptorUtils.getDispatchReceiverParameterIfNeeded(classDescriptor);
                EmptyList emptyList = EmptyList.INSTANCE;
                createJavaMethod.initialize(null, dispatchReceiverParameterIfNeeded, emptyList, emptyList, emptyList, transformJavaType, Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
                createJavaMethod.setParameterNamesStatus(false, false);
                lazyJavaResolverContext.getComponents().getJavaResolverCache().recordMethod(findRecordComponentByName, createJavaMethod);
                arrayList.add(createJavaMethod);
            }
        }
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateMethods(classDescriptor, name, arrayList, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, LazyJavaScope$$Lambda$9.INSTANCE$1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void computeNonDeclaredFunctions(LinkedHashSet linkedHashSet, Name name) {
        name.getClass();
        LinkedHashSet functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if (!SpecialGenericSignatures.Companion.getSameAsRenamedInJvmBuiltin(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            if (!functionsFromSupertypes.isEmpty()) {
                Iterator it = functionsFromSupertypes.iterator();
                while (it.hasNext()) {
                    if (((FunctionDescriptor) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : functionsFromSupertypes) {
                if (isVisibleAsFunctionInCurrentClass((SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            addFunctionFromSupertypes(linkedHashSet, name, arrayList, false);
            return;
        }
        SmartSet create = SmartSet.Companion.create();
        Collection resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, functionsFromSupertypes, EmptyList.INSTANCE, this.ownerDescriptor, ErrorReporter.DO_NOTHING, this.c.getComponents().getKotlinTypeChecker().getOverridingUtil());
        resolveOverridesForNonStaticMembers.getClass();
        int i = 0;
        addOverriddenSpecialMethods(name, linkedHashSet, resolveOverridesForNonStaticMembers, linkedHashSet, new TextFieldUIKt$TextField$4$1(1, this, LazyJavaClassMemberScope.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", i, 29));
        addOverriddenSpecialMethods(name, linkedHashSet, resolveOverridesForNonStaticMembers, create, new Radiography$renderScannableViewTree$1$2(1, this, LazyJavaClassMemberScope.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", i, 1));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : functionsFromSupertypes) {
            if (isVisibleAsFunctionInCurrentClass((SimpleFunctionDescriptor) obj2)) {
                arrayList2.add(obj2);
            }
        }
        addFunctionFromSupertypes(linkedHashSet, name, CollectionsKt.plus((Iterable) create, (Collection) arrayList2), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void computeNonDeclaredProperties(Name name, ArrayList arrayList) {
        Name name2;
        name.getClass();
        boolean isAnnotationType = this.jClass.isAnnotationType();
        LazyJavaResolverContext lazyJavaResolverContext = this.c;
        if (isAnnotationType) {
            name2 = name;
            JavaMethod javaMethod = (JavaMethod) CollectionsKt.singleOrNull(((DeclaredMemberIndex) this.declaredMemberIndex.invoke()).findMethodsByName(name2));
            if (javaMethod != null) {
                Modality modality = Modality.FINAL;
                JavaPropertyDescriptor create = JavaPropertyDescriptor.create(this.ownerDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaMethod), modality, UtilsKt.toDescriptorVisibility(javaMethod.getVisibility()), false, javaMethod.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaMethod), false);
                create.getClass();
                PropertyGetterDescriptorImpl createDefaultGetter = DescriptorFactory.createDefaultGetter(create, Annotations.Companion.getEMPTY());
                createDefaultGetter.getClass();
                create.initialize(createDefaultGetter, null);
                KotlinType computeMethodReturnType = LazyJavaScope.computeMethodReturnType(javaMethod, ContextKt.childForMethod$default(this.c, create, javaMethod, 0, 4, null));
                EmptyList emptyList = EmptyList.INSTANCE;
                create.setType(computeMethodReturnType, emptyList, DescriptorUtils.getDispatchReceiverParameterIfNeeded(this.ownerDescriptor), null, emptyList);
                createDefaultGetter.initialize(computeMethodReturnType);
                arrayList.add(create);
            }
        } else {
            name2 = name;
        }
        Set propertiesFromSupertypes = getPropertiesFromSupertypes(name);
        if (propertiesFromSupertypes.isEmpty()) {
            return;
        }
        SmartSet.Companion companion = SmartSet.Companion;
        SmartSet create2 = companion.create();
        SmartSet create3 = companion.create();
        final int i = 0;
        addPropertyOverrideByMethod(propertiesFromSupertypes, arrayList, create2, new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$7
            public final LazyJavaClassMemberScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                LazyJavaClassMemberScope lazyJavaClassMemberScope = this.arg$0;
                Name name3 = (Name) obj;
                switch (i2) {
                    case 0:
                        int i3 = LazyJavaClassMemberScope.$r8$clinit;
                        name3.getClass();
                        return lazyJavaClassMemberScope.searchMethodsByNameWithoutBuiltinMagic(name3);
                    default:
                        int i4 = LazyJavaClassMemberScope.$r8$clinit;
                        name3.getClass();
                        return lazyJavaClassMemberScope.searchMethodsInSupertypesWithoutBuiltinMagic(name3);
                }
            }
        });
        final int i2 = 1;
        addPropertyOverrideByMethod(SetsKt___SetsKt.minus(propertiesFromSupertypes, (Iterable) create2), create3, null, new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$7
            public final LazyJavaClassMemberScope arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                LazyJavaClassMemberScope lazyJavaClassMemberScope = this.arg$0;
                Name name3 = (Name) obj;
                switch (i22) {
                    case 0:
                        int i3 = LazyJavaClassMemberScope.$r8$clinit;
                        name3.getClass();
                        return lazyJavaClassMemberScope.searchMethodsByNameWithoutBuiltinMagic(name3);
                    default:
                        int i4 = LazyJavaClassMemberScope.$r8$clinit;
                        name3.getClass();
                        return lazyJavaClassMemberScope.searchMethodsInSupertypesWithoutBuiltinMagic(name3);
                }
            }
        });
        Name name3 = name2;
        Collection resolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name3, SetsKt___SetsKt.plus(propertiesFromSupertypes, (Iterable) create3), arrayList, this.ownerDescriptor, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
        resolveOverridesForNonStaticMembers.getClass();
        arrayList.addAll(resolveOverridesForNonStaticMembers);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computePropertyNames(DescriptorKindFilter descriptorKindFilter) {
        descriptorKindFilter.getClass();
        if (this.jClass.isAnnotationType()) {
            return getFunctionNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((DeclaredMemberIndex) this.declaredMemberIndex.invoke()).getFieldNames());
        Collection<KotlinType> supertypes = this.ownerDescriptor.getTypeConstructor().getSupertypes();
        supertypes.getClass();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((KotlinType) it.next()).getMemberScope().getVariableNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Collection computeSupertypes() {
        boolean z = this.skipRefinement;
        ClassDescriptor classDescriptor = this.ownerDescriptor;
        if (!z) {
            return this.c.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(classDescriptor);
        }
        Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        supertypes.getClass();
        return supertypes;
    }

    public final boolean doesClassOverridesProperty(PropertyDescriptor propertyDescriptor, Function1 function1) {
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor findGetterOverride = findGetterOverride(propertyDescriptor, function1);
        SimpleFunctionDescriptor findSetterOverride = findSetterOverride(propertyDescriptor, function1);
        if (findGetterOverride == null) {
            return false;
        }
        if (propertyDescriptor.isVar()) {
            return findSetterOverride != null && findSetterOverride.getModality() == findGetterOverride.getModality();
        }
        return true;
    }

    public final SimpleFunctionDescriptor findGetterOverride(PropertyDescriptor propertyDescriptor, Function1 function1) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter) : null;
        String builtinSpecialPropertyGetterName = propertyGetterDescriptor != null ? ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor) : null;
        if (builtinSpecialPropertyGetterName != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(this.ownerDescriptor, propertyGetterDescriptor)) {
            return findGetterByName(propertyDescriptor, builtinSpecialPropertyGetterName, function1);
        }
        String asString = propertyDescriptor.getName().asString();
        asString.getClass();
        return findGetterByName(propertyDescriptor, JvmAbi.getterName(asString), function1);
    }

    public final NotNullLazyValue<List<ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.constructors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public ClassifierDescriptor mo4154getContributedClassifier(Name name, LookupLocation lookupLocation) {
        MemoizedFunctionToNullable memoizedFunctionToNullable;
        ClassDescriptor classDescriptor;
        name.getClass();
        lookupLocation.getClass();
        mo4157recordLookup(name, lookupLocation);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) this.mainScope;
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.nestedClasses) == null || (classDescriptor = (ClassDescriptor) memoizedFunctionToNullable.invoke(name)) == null) ? (ClassifierDescriptor) this.nestedClasses.invoke(name) : classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        mo4157recordLookup(name, lookupLocation);
        return super.getContributedFunctions(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        mo4157recordLookup(name, lookupLocation);
        return super.getContributedVariables(name, lookupLocation);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(this.ownerDescriptor);
    }

    public final LinkedHashSet getFunctionsFromSupertypes(Name name) {
        Collection computeSupertypes = computeSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = computeSupertypes.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((KotlinType) it.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    public final Set getPropertiesFromSupertypes(Name name) {
        Collection computeSupertypes = computeSupertypes();
        ArrayList arrayList = new ArrayList();
        Iterator it = computeSupertypes.iterator();
        while (it.hasNext()) {
            Collection<? extends PropertyDescriptor> contributedVariables = ((KotlinType) it.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(contributedVariables, 10));
            Iterator<T> it2 = contributedVariables.iterator();
            while (it2.hasNext()) {
                arrayList2.add((PropertyDescriptor) it2.next());
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList);
        }
        return CollectionsKt.toSet(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final boolean isVisibleAsFunction(JavaMethodDescriptor javaMethodDescriptor) {
        if (this.jClass.isAnnotationType()) {
            return false;
        }
        return isVisibleAsFunctionInCurrentClass(javaMethodDescriptor);
    }

    public final boolean isVisibleAsFunctionInCurrentClass(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Name name = simpleFunctionDescriptor.getName();
        name.getClass();
        List<Name> propertyNamesCandidatesByAccessorName = PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(name);
        if (!(propertyNamesCandidatesByAccessorName instanceof Collection) || !propertyNamesCandidatesByAccessorName.isEmpty()) {
            Iterator<T> it = propertyNamesCandidatesByAccessorName.iterator();
            while (it.hasNext()) {
                Set<PropertyDescriptor> propertiesFromSupertypes = getPropertiesFromSupertypes((Name) it.next());
                if (!(propertiesFromSupertypes instanceof Collection) || !propertiesFromSupertypes.isEmpty()) {
                    for (PropertyDescriptor propertyDescriptor : propertiesFromSupertypes) {
                        if (doesClassOverridesProperty(propertyDescriptor, new OverridingUtil.AnonymousClass7(18, simpleFunctionDescriptor, this))) {
                            if (propertyDescriptor.isVar()) {
                                return false;
                            }
                            String asString = simpleFunctionDescriptor.getName().asString();
                            asString.getClass();
                            if (!JvmAbi.isSetterName(asString)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        Name name2 = simpleFunctionDescriptor.getName();
        name2.getClass();
        Name builtinFunctionNamesByJvmName = companion.getBuiltinFunctionNamesByJvmName(name2);
        if (builtinFunctionNamesByJvmName != null) {
            LinkedHashSet functionsFromSupertypes = getFunctionsFromSupertypes(builtinFunctionNamesByJvmName);
            ArrayList arrayList = new ArrayList();
            for (Object obj : functionsFromSupertypes) {
                if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((SimpleFunctionDescriptor) obj)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
                newCopyBuilder.setName(builtinFunctionNamesByJvmName);
                newCopyBuilder.setSignatureChange();
                newCopyBuilder.setPreserveSourceElement();
                SimpleFunctionDescriptor build = newCopyBuilder.build();
                build.getClass();
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = build;
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        SimpleFunctionDescriptor simpleFunctionDescriptor3 = (SimpleFunctionDescriptor) it2.next();
                        FunctionDescriptor original = BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor3) ? simpleFunctionDescriptor2.getOriginal() : simpleFunctionDescriptor2;
                        original.getClass();
                        if (doesOverride(original, simpleFunctionDescriptor3)) {
                            return false;
                        }
                    }
                }
            }
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name3 = simpleFunctionDescriptor.getName();
        name3.getClass();
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name3)) {
            Name name4 = simpleFunctionDescriptor.getName();
            name4.getClass();
            LinkedHashSet functionsFromSupertypes2 = getFunctionsFromSupertypes(name4);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = functionsFromSupertypes2.iterator();
            while (it3.hasNext()) {
                FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((SimpleFunctionDescriptor) it3.next());
                if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                    arrayList2.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    if (hasSameJvmDescriptorButDoesNotOverride(simpleFunctionDescriptor, (FunctionDescriptor) it4.next())) {
                        return false;
                    }
                }
            }
        }
        SimpleFunctionDescriptor createSuspendView = createSuspendView(simpleFunctionDescriptor);
        if (createSuspendView == null) {
            return true;
        }
        Name name5 = simpleFunctionDescriptor.getName();
        name5.getClass();
        LinkedHashSet<SimpleFunctionDescriptor> functionsFromSupertypes3 = getFunctionsFromSupertypes(name5);
        if (functionsFromSupertypes3.isEmpty()) {
            return true;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor4 : functionsFromSupertypes3) {
            if (simpleFunctionDescriptor4.isSuspend() && doesOverride(createSuspendView, simpleFunctionDescriptor4)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: recordLookup */
    public void mo4157recordLookup(Name name, LookupLocation lookupLocation) {
        name.getClass();
        lookupLocation.getClass();
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(this.c.getComponents().getLookupTracker(), lookupLocation, this.ownerDescriptor, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final LazyJavaScope.MethodSignatureData resolveMethodSignature(JavaMethod javaMethod, ArrayList arrayList, KotlinType kotlinType, List list) {
        javaMethod.getClass();
        kotlinType.getClass();
        list.getClass();
        SignaturePropagator.PropagatedSignature resolvePropagatedSignature = this.c.getComponents().getSignaturePropagator().resolvePropagatedSignature(javaMethod, this.ownerDescriptor, kotlinType, null, list, arrayList);
        resolvePropagatedSignature.getClass();
        KotlinType returnType = resolvePropagatedSignature.getReturnType();
        returnType.getClass();
        KotlinType receiverType = resolvePropagatedSignature.getReceiverType();
        List<ValueParameterDescriptor> valueParameters = resolvePropagatedSignature.getValueParameters();
        valueParameters.getClass();
        List<TypeParameterDescriptor> typeParameters = resolvePropagatedSignature.getTypeParameters();
        typeParameters.getClass();
        boolean hasStableParameterNames = resolvePropagatedSignature.hasStableParameterNames();
        List<String> errors = resolvePropagatedSignature.getErrors();
        errors.getClass();
        return new LazyJavaScope.MethodSignatureData(returnType, receiverType, valueParameters, typeParameters, hasStableParameterNames, errors);
    }

    public final ArrayList searchMethodsByNameWithoutBuiltinMagic(Name name) {
        Collection<JavaMethod> findMethodsByName = ((DeclaredMemberIndex) this.declaredMemberIndex.invoke()).findMethodsByName(name);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(findMethodsByName, 10));
        Iterator<T> it = findMethodsByName.iterator();
        while (it.hasNext()) {
            arrayList.add(resolveMethodToFunctionDescriptor((JavaMethod) it.next()));
        }
        return arrayList;
    }

    public final ArrayList searchMethodsInSupertypesWithoutBuiltinMagic(Name name) {
        LinkedHashSet functionsFromSupertypes = getFunctionsFromSupertypes(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj : functionsFromSupertypes) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
            if (!SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public String toString() {
        return "Lazy Java member scope for " + this.jClass.getFqName();
    }

    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z, (i & 16) != 0 ? null : lazyJavaClassMemberScope);
    }
}
