package kotlin.reflect.jvm.internal.impl.renderer;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.Pool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import radiography.Radiography$renderScannableViewTree$1$2;

/* loaded from: classes9.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy functionTypeAnnotationsRenderer$delegate;
    public final DescriptorRendererOptionsImpl options;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        descriptorRendererOptionsImpl.getClass();
        this.options = descriptorRendererOptionsImpl;
        descriptorRendererOptionsImpl.isLocked();
        this.functionTypeAnnotationsRenderer$delegate = LazyKt.lazy(new KotlinKPropertyN$$Lambda$0(this, 17));
    }

    public static final void access$renderClass(DescriptorRendererImpl descriptorRendererImpl, ClassDescriptor classDescriptor, StringBuilder sb) {
        StringBuilder sb2;
        ClassConstructorDescriptor mo4142getUnsubstitutedPrimaryConstructor;
        descriptorRendererImpl.getClass();
        int i = 1;
        boolean z = classDescriptor.getKind() == ClassKind.ENUM_ENTRY;
        if (!descriptorRendererImpl.getStartFromName()) {
            List<ReceiverParameterDescriptor> contextReceivers = classDescriptor.getContextReceivers();
            contextReceivers.getClass();
            descriptorRendererImpl.renderContextReceivers(sb, contextReceivers);
            descriptorRendererImpl.renderAnnotations(sb, classDescriptor, null);
            if (!z) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                visibility.getClass();
                descriptorRendererImpl.renderVisibility(visibility, sb);
            }
            if ((classDescriptor.getKind() != ClassKind.INTERFACE || classDescriptor.getModality() != Modality.ABSTRACT) && (!classDescriptor.getKind().isSingleton() || classDescriptor.getModality() != Modality.FINAL)) {
                Modality modality = classDescriptor.getModality();
                modality.getClass();
                Modality implicitModalityWithoutExtensions = implicitModalityWithoutExtensions(classDescriptor);
                if (descriptorRendererImpl.getRenderDefaultModality() || modality != implicitModalityWithoutExtensions) {
                    descriptorRendererImpl.renderModifier(sb, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
                }
            }
            descriptorRendererImpl.renderMemberModifiers(classDescriptor, sb);
            descriptorRendererImpl.renderModifier(sb, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.INNER) && classDescriptor.isInner(), "inner");
            descriptorRendererImpl.renderModifier(sb, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.DATA) && classDescriptor.isData(), "data");
            descriptorRendererImpl.renderModifier(sb, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.INLINE) && classDescriptor.isInline(), "inline");
            descriptorRendererImpl.renderModifier(sb, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.VALUE) && classDescriptor.isValue(), "value");
            descriptorRendererImpl.renderModifier(sb, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.FUN) && classDescriptor.isFun(), "fun");
            sb.append(descriptorRendererImpl.renderKeyword(DescriptorRenderer.Companion.getClassifierKindPrefix(classDescriptor)));
        }
        if (DescriptorUtils.isCompanionObject(classDescriptor)) {
            if (descriptorRendererImpl.getRenderCompanionObjectName()) {
                if (descriptorRendererImpl.getStartFromName()) {
                    sb.append("companion object");
                }
                renderSpaceIfNeeded(sb);
                DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
                if (containingDeclaration != null) {
                    sb.append("of ");
                    Name name = containingDeclaration.getName();
                    name.getClass();
                    sb.append(descriptorRendererImpl.renderName(name, false));
                }
            }
            if (descriptorRendererImpl.getVerbose() || !Intrinsics.areEqual(classDescriptor.getName(), SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT)) {
                if (!descriptorRendererImpl.getStartFromName()) {
                    renderSpaceIfNeeded(sb);
                }
                Name name2 = classDescriptor.getName();
                name2.getClass();
                sb.append(descriptorRendererImpl.renderName(name2, true));
            }
        } else {
            if (!descriptorRendererImpl.getStartFromName()) {
                renderSpaceIfNeeded(sb);
            }
            descriptorRendererImpl.renderName(classDescriptor, sb, true);
        }
        if (z) {
            return;
        }
        List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        descriptorRendererImpl.renderTypeParameters(declaredTypeParameters, sb, false);
        descriptorRendererImpl.renderCapturedTypeParametersIfRequired(classDescriptor, sb);
        if (!classDescriptor.getKind().isSingleton() && descriptorRendererImpl.getClassWithPrimaryConstructor() && (mo4142getUnsubstitutedPrimaryConstructor = classDescriptor.mo4142getUnsubstitutedPrimaryConstructor()) != null) {
            sb.append(" ");
            descriptorRendererImpl.renderAnnotations(sb, mo4142getUnsubstitutedPrimaryConstructor, null);
            DescriptorVisibility visibility2 = mo4142getUnsubstitutedPrimaryConstructor.getVisibility();
            visibility2.getClass();
            descriptorRendererImpl.renderVisibility(visibility2, sb);
            sb.append(descriptorRendererImpl.renderKeyword("constructor"));
            List<ValueParameterDescriptor> valueParameters = mo4142getUnsubstitutedPrimaryConstructor.getValueParameters();
            valueParameters.getClass();
            descriptorRendererImpl.renderValueParameters(valueParameters, mo4142getUnsubstitutedPrimaryConstructor.hasSynthesizedParameterNames(), sb);
        }
        if (!descriptorRendererImpl.getWithoutSuperTypes() && !KotlinBuiltIns.isNothing(classDescriptor.getDefaultType())) {
            Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
            supertypes.getClass();
            if (!supertypes.isEmpty() && (supertypes.size() != 1 || !KotlinBuiltIns.isAnyOrNullableAny(supertypes.iterator().next()))) {
                renderSpaceIfNeeded(sb);
                sb.append(": ");
                sb2 = sb;
                CollectionsKt.joinTo$default(supertypes, sb2, ", ", null, null, new DescriptorRendererImpl$$Lambda$4(descriptorRendererImpl, i), 60);
                descriptorRendererImpl.renderWhereSuffix(sb2, declaredTypeParameters);
            }
        }
        sb2 = sb;
        descriptorRendererImpl.renderWhereSuffix(sb2, declaredTypeParameters);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$renderConstructor(DescriptorRendererImpl descriptorRendererImpl, ConstructorDescriptor constructorDescriptor, StringBuilder sb) {
        boolean z;
        boolean z2;
        ClassConstructorDescriptor mo4142getUnsubstitutedPrimaryConstructor;
        ArrayList arrayList;
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.renderAnnotations(sb, constructorDescriptor, null);
        if (descriptorRendererImpl.options.getRenderDefaultVisibility() || constructorDescriptor.getConstructedClass().getModality() != Modality.SEALED) {
            DescriptorVisibility visibility = constructorDescriptor.getVisibility();
            visibility.getClass();
            if (descriptorRendererImpl.renderVisibility(visibility, sb)) {
                z = true;
                descriptorRendererImpl.renderMemberKind(constructorDescriptor, sb);
                z2 = (descriptorRendererImpl.getRenderConstructorKeyword() && constructorDescriptor.isPrimary() && !z) ? false : true;
                if (z2) {
                    sb.append(descriptorRendererImpl.renderKeyword("constructor"));
                }
                ClassifierDescriptorWithTypeParameters containingDeclaration = constructorDescriptor.getContainingDeclaration();
                containingDeclaration.getClass();
                if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
                    if (z2) {
                        sb.append(" ");
                    }
                    descriptorRendererImpl.renderName(containingDeclaration, sb, true);
                    List<TypeParameterDescriptor> typeParameters = constructorDescriptor.getTypeParameters();
                    typeParameters.getClass();
                    descriptorRendererImpl.renderTypeParameters(typeParameters, sb, false);
                }
                List<ValueParameterDescriptor> valueParameters = constructorDescriptor.getValueParameters();
                valueParameters.getClass();
                descriptorRendererImpl.renderValueParameters(valueParameters, constructorDescriptor.hasSynthesizedParameterNames(), sb);
                if (descriptorRendererImpl.getRenderConstructorDelegation() && !constructorDescriptor.isPrimary() && (containingDeclaration instanceof ClassDescriptor) && (mo4142getUnsubstitutedPrimaryConstructor = ((ClassDescriptor) containingDeclaration).mo4142getUnsubstitutedPrimaryConstructor()) != null) {
                    List<ValueParameterDescriptor> valueParameters2 = mo4142getUnsubstitutedPrimaryConstructor.getValueParameters();
                    valueParameters2.getClass();
                    arrayList = new ArrayList();
                    for (Object obj : valueParameters2) {
                        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) obj;
                        if (!valueParameterDescriptor.declaresDefaultValue() && valueParameterDescriptor.getVarargElementType() == null) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        sb.append(" : ");
                        sb.append(descriptorRendererImpl.renderKeyword("this"));
                        sb.append(CollectionsKt.joinToString$default(arrayList, ", ", "(", ")", 0, null, RenderingUtilsKt$$Lambda$0.INSTANCE$13, 24));
                    }
                }
                if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
                    return;
                }
                List<TypeParameterDescriptor> typeParameters2 = constructorDescriptor.getTypeParameters();
                typeParameters2.getClass();
                descriptorRendererImpl.renderWhereSuffix(sb, typeParameters2);
                return;
            }
        }
        z = false;
        descriptorRendererImpl.renderMemberKind(constructorDescriptor, sb);
        if (descriptorRendererImpl.getRenderConstructorKeyword()) {
        }
        if (z2) {
        }
        ClassifierDescriptorWithTypeParameters containingDeclaration2 = constructorDescriptor.getContainingDeclaration();
        containingDeclaration2.getClass();
        if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
        }
        List<ValueParameterDescriptor> valueParameters3 = constructorDescriptor.getValueParameters();
        valueParameters3.getClass();
        descriptorRendererImpl.renderValueParameters(valueParameters3, constructorDescriptor.hasSynthesizedParameterNames(), sb);
        if (descriptorRendererImpl.getRenderConstructorDelegation()) {
            List<ValueParameterDescriptor> valueParameters22 = mo4142getUnsubstitutedPrimaryConstructor.getValueParameters();
            valueParameters22.getClass();
            arrayList = new ArrayList();
            while (r0.hasNext()) {
            }
            if (!arrayList.isEmpty()) {
            }
        }
        if (descriptorRendererImpl.getSecondaryConstructorsAsPrimary()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r6.getAlwaysRenderModifiers() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r6.getAlwaysRenderModifiers() != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void access$renderFunction(DescriptorRendererImpl descriptorRendererImpl, FunctionDescriptor functionDescriptor, StringBuilder sb) {
        boolean z;
        if (!descriptorRendererImpl.getStartFromName()) {
            if (!descriptorRendererImpl.getStartFromDeclarationKeyword()) {
                List<ReceiverParameterDescriptor> contextReceiverParameters = functionDescriptor.getContextReceiverParameters();
                contextReceiverParameters.getClass();
                descriptorRendererImpl.renderContextReceivers(sb, contextReceiverParameters);
                descriptorRendererImpl.renderAnnotations(sb, functionDescriptor, null);
                DescriptorVisibility visibility = functionDescriptor.getVisibility();
                visibility.getClass();
                descriptorRendererImpl.renderVisibility(visibility, sb);
                descriptorRendererImpl.renderModalityForCallable(functionDescriptor, sb);
                if (descriptorRendererImpl.getIncludeAdditionalModifiers()) {
                    descriptorRendererImpl.renderMemberModifiers(functionDescriptor, sb);
                }
                descriptorRendererImpl.renderOverride(functionDescriptor, sb);
                if (descriptorRendererImpl.getIncludeAdditionalModifiers()) {
                    boolean z2 = false;
                    if (functionDescriptor.isOperator()) {
                        Collection<? extends FunctionDescriptor> overriddenDescriptors = functionDescriptor.getOverriddenDescriptors();
                        overriddenDescriptors.getClass();
                        Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                        if (!collection.isEmpty()) {
                            Iterator<T> it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (((FunctionDescriptor) it.next()).isOperator()) {
                                }
                            }
                        }
                        z = true;
                        if (functionDescriptor.isInfix()) {
                            Collection<? extends FunctionDescriptor> overriddenDescriptors2 = functionDescriptor.getOverriddenDescriptors();
                            overriddenDescriptors2.getClass();
                            Collection<? extends FunctionDescriptor> collection2 = overriddenDescriptors2;
                            if (!collection2.isEmpty()) {
                                Iterator<T> it2 = collection2.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if (((FunctionDescriptor) it2.next()).isInfix()) {
                                    }
                                }
                            }
                            z2 = true;
                        }
                        descriptorRendererImpl.renderModifier(sb, functionDescriptor.isTailrec(), "tailrec");
                        descriptorRendererImpl.renderModifier(sb, functionDescriptor.isSuspend(), "suspend");
                        descriptorRendererImpl.renderModifier(sb, functionDescriptor.isInline(), "inline");
                        descriptorRendererImpl.renderModifier(sb, z2, "infix");
                        descriptorRendererImpl.renderModifier(sb, z, "operator");
                    }
                    z = false;
                    if (functionDescriptor.isInfix()) {
                    }
                    descriptorRendererImpl.renderModifier(sb, functionDescriptor.isTailrec(), "tailrec");
                    descriptorRendererImpl.renderModifier(sb, functionDescriptor.isSuspend(), "suspend");
                    descriptorRendererImpl.renderModifier(sb, functionDescriptor.isInline(), "inline");
                    descriptorRendererImpl.renderModifier(sb, z2, "infix");
                    descriptorRendererImpl.renderModifier(sb, z, "operator");
                } else {
                    descriptorRendererImpl.renderModifier(sb, functionDescriptor.isSuspend(), "suspend");
                }
                descriptorRendererImpl.renderMemberKind(functionDescriptor, sb);
                if (descriptorRendererImpl.getVerbose()) {
                    if (functionDescriptor.isHiddenToOvercomeSignatureClash()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor.isHiddenForResolutionEverywhereBesideSupercalls()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(descriptorRendererImpl.renderKeyword("fun"));
            sb.append(" ");
            List<TypeParameterDescriptor> typeParameters = functionDescriptor.getTypeParameters();
            typeParameters.getClass();
            descriptorRendererImpl.renderTypeParameters(typeParameters, sb, true);
            descriptorRendererImpl.renderReceiver(functionDescriptor, sb);
        }
        descriptorRendererImpl.renderName(functionDescriptor, sb, true);
        List<ValueParameterDescriptor> valueParameters = functionDescriptor.getValueParameters();
        valueParameters.getClass();
        descriptorRendererImpl.renderValueParameters(valueParameters, functionDescriptor.hasSynthesizedParameterNames(), sb);
        descriptorRendererImpl.renderReceiverAfterName(functionDescriptor, sb);
        KotlinType returnType = functionDescriptor.getReturnType();
        if (!descriptorRendererImpl.getWithoutReturnType() && (descriptorRendererImpl.getUnitReturnType() || returnType == null || !KotlinBuiltIns.isUnit(returnType))) {
            sb.append(": ");
            sb.append(returnType == null ? "[NULL]" : descriptorRendererImpl.renderType(returnType));
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor.getTypeParameters();
        typeParameters2.getClass();
        descriptorRendererImpl.renderWhereSuffix(sb, typeParameters2);
    }

    public static final void access$renderPackageFragment(DescriptorRendererImpl descriptorRendererImpl, PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb) {
        descriptorRendererImpl.getClass();
        FqName fqName = packageFragmentDescriptor.getFqName();
        sb.append(descriptorRendererImpl.renderKeyword("package-fragment"));
        String renderFqName = descriptorRendererImpl.renderFqName(fqName.toUnsafe());
        if (renderFqName.length() > 0) {
            sb.append(" ");
            sb.append(renderFqName);
        }
        if (descriptorRendererImpl.getDebugMode()) {
            sb.append(" in ");
            descriptorRendererImpl.renderName(packageFragmentDescriptor.getContainingDeclaration(), sb, false);
        }
    }

    public static final void access$renderPackageView(DescriptorRendererImpl descriptorRendererImpl, PackageViewDescriptor packageViewDescriptor, StringBuilder sb) {
        descriptorRendererImpl.getClass();
        FqName fqName = packageViewDescriptor.getFqName();
        sb.append(descriptorRendererImpl.renderKeyword("package"));
        String renderFqName = descriptorRendererImpl.renderFqName(fqName.toUnsafe());
        if (renderFqName.length() > 0) {
            sb.append(" ");
            sb.append(renderFqName);
        }
        if (descriptorRendererImpl.getDebugMode()) {
            sb.append(" in context of ");
            descriptorRendererImpl.renderName(packageViewDescriptor.getModule(), sb, false);
        }
    }

    public static final void access$renderProperty(DescriptorRendererImpl descriptorRendererImpl, PropertyDescriptor propertyDescriptor, StringBuilder sb) {
        ConstantValue<?> mo4144getCompileTimeInitializer;
        String renderConstant;
        if (!descriptorRendererImpl.getStartFromName()) {
            if (!descriptorRendererImpl.getStartFromDeclarationKeyword()) {
                List<ReceiverParameterDescriptor> contextReceiverParameters = propertyDescriptor.getContextReceiverParameters();
                contextReceiverParameters.getClass();
                descriptorRendererImpl.renderContextReceivers(sb, contextReceiverParameters);
                if (descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.renderAnnotations(sb, propertyDescriptor, null);
                    FieldDescriptor backingField = propertyDescriptor.getBackingField();
                    if (backingField != null) {
                        descriptorRendererImpl.renderAnnotations(sb, backingField, AnnotationUseSiteTarget.FIELD);
                    }
                    FieldDescriptor delegateField = propertyDescriptor.getDelegateField();
                    if (delegateField != null) {
                        descriptorRendererImpl.renderAnnotations(sb, delegateField, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    if (descriptorRendererImpl.getPropertyAccessorRenderingPolicy() == PropertyAccessorRenderingPolicy.NONE) {
                        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                        if (getter != null) {
                            descriptorRendererImpl.renderAnnotations(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                        if (setter != null) {
                            descriptorRendererImpl.renderAnnotations(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List<ValueParameterDescriptor> valueParameters = setter.getValueParameters();
                            valueParameters.getClass();
                            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.single((List) valueParameters);
                            valueParameterDescriptor.getClass();
                            descriptorRendererImpl.renderAnnotations(sb, valueParameterDescriptor, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                visibility.getClass();
                descriptorRendererImpl.renderVisibility(visibility, sb);
                descriptorRendererImpl.renderModifier(sb, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.CONST) && propertyDescriptor.isConst(), "const");
                descriptorRendererImpl.renderMemberModifiers(propertyDescriptor, sb);
                descriptorRendererImpl.renderModalityForCallable(propertyDescriptor, sb);
                descriptorRendererImpl.renderOverride(propertyDescriptor, sb);
                descriptorRendererImpl.renderModifier(sb, descriptorRendererImpl.getModifiers().contains(DescriptorRendererModifier.LATEINIT) && propertyDescriptor.isLateInit(), "lateinit");
                descriptorRendererImpl.renderMemberKind(propertyDescriptor, sb);
            }
            descriptorRendererImpl.renderValVarPrefix(propertyDescriptor, sb, false);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor.getTypeParameters();
            typeParameters.getClass();
            descriptorRendererImpl.renderTypeParameters(typeParameters, sb, true);
            descriptorRendererImpl.renderReceiver(propertyDescriptor, sb);
        }
        descriptorRendererImpl.renderName(propertyDescriptor, sb, true);
        sb.append(": ");
        KotlinType type2 = propertyDescriptor.getType();
        type2.getClass();
        sb.append(descriptorRendererImpl.renderType(type2));
        descriptorRendererImpl.renderReceiverAfterName(propertyDescriptor, sb);
        if (descriptorRendererImpl.getIncludePropertyConstant() && (mo4144getCompileTimeInitializer = propertyDescriptor.mo4144getCompileTimeInitializer()) != null && (renderConstant = descriptorRendererImpl.renderConstant(mo4144getCompileTimeInitializer)) != null) {
            sb.append(" = ");
            sb.append(descriptorRendererImpl.escape(renderConstant));
        }
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor.getTypeParameters();
        typeParameters2.getClass();
        descriptorRendererImpl.renderWhereSuffix(sb, typeParameters2);
    }

    public static final void access$renderTypeAlias(DescriptorRendererImpl descriptorRendererImpl, TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb) {
        descriptorRendererImpl.getClass();
        descriptorRendererImpl.renderAnnotations(sb, typeAliasDescriptor, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        visibility.getClass();
        descriptorRendererImpl.renderVisibility(visibility, sb);
        descriptorRendererImpl.renderMemberModifiers(typeAliasDescriptor, sb);
        sb.append(descriptorRendererImpl.renderKeyword("typealias"));
        sb.append(" ");
        descriptorRendererImpl.renderName(typeAliasDescriptor, sb, true);
        List<TypeParameterDescriptor> declaredTypeParameters = typeAliasDescriptor.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        descriptorRendererImpl.renderTypeParameters(declaredTypeParameters, sb, false);
        descriptorRendererImpl.renderCapturedTypeParametersIfRequired(typeAliasDescriptor, sb);
        sb.append(" = ");
        sb.append(descriptorRendererImpl.renderType(typeAliasDescriptor.getUnderlyingType()));
    }

    public static Modality implicitModalityWithoutExtensions(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).getKind() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        DeclarationDescriptor containingDeclaration = memberDescriptor.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor != null && (memberDescriptor instanceof CallableMemberDescriptor)) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            overriddenDescriptors.getClass();
            if (!overriddenDescriptors.isEmpty() && classDescriptor.getModality() != Modality.FINAL) {
                return Modality.OPEN;
            }
            if (classDescriptor.getKind() != ClassKind.INTERFACE || Intrinsics.areEqual(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.PRIVATE)) {
                return Modality.FINAL;
            }
            Modality modality = callableMemberDescriptor.getModality();
            Modality modality2 = Modality.ABSTRACT;
            return modality == modality2 ? modality2 : Modality.OPEN;
        }
        return Modality.FINAL;
    }

    public static void renderSpaceIfNeeded(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean shouldRenderAsPrettyFunctionType(KotlinType kotlinType) {
        if (!FunctionTypesKt.isBuiltinFunctionalType(kotlinType)) {
            return false;
        }
        List<TypeProjection> arguments = kotlinType.getArguments();
        if ((arguments instanceof Collection) && arguments.isEmpty()) {
            return true;
        }
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            if (((TypeProjection) it.next()).isStarProjection()) {
                return false;
            }
        }
        return true;
    }

    public final String escape(String str) {
        return getTextFormat().escape(str);
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return this.options.getActualPropertiesInPrimaryConstructor();
    }

    public boolean getAlwaysRenderModifiers() {
        return this.options.getAlwaysRenderModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return this.options.getAnnotationArgumentsRenderingPolicy();
    }

    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return this.options.getAnnotationFilter();
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return this.options.getBoldOnlyForNamesInHtml();
    }

    public boolean getClassWithPrimaryConstructor() {
        return this.options.getClassWithPrimaryConstructor();
    }

    public ClassifierNamePolicy getClassifierNamePolicy() {
        return this.options.getClassifierNamePolicy();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return this.options.getDebugMode();
    }

    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return this.options.getDefaultParameterValueRenderer();
    }

    public boolean getEachAnnotationOnNewLine() {
        return this.options.getEachAnnotationOnNewLine();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return this.options.getEnhancedTypes();
    }

    public Set<FqName> getExcludedAnnotationClasses() {
        return this.options.getExcludedAnnotationClasses();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return this.options.getExcludedTypeAnnotationClasses();
    }

    public boolean getIncludeAdditionalModifiers() {
        return this.options.getIncludeAdditionalModifiers();
    }

    public boolean getIncludeAnnotationArguments() {
        return this.options.getIncludeAnnotationArguments();
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return this.options.getIncludeEmptyAnnotationArguments();
    }

    public boolean getIncludePropertyConstant() {
        return this.options.getIncludePropertyConstant();
    }

    public boolean getInformativeErrorType() {
        return this.options.getInformativeErrorType();
    }

    public Set<DescriptorRendererModifier> getModifiers() {
        return this.options.getModifiers();
    }

    public boolean getNormalizedVisibilities() {
        return this.options.getNormalizedVisibilities();
    }

    public final DescriptorRendererOptionsImpl getOptions() {
        return this.options;
    }

    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return this.options.getOverrideRenderingPolicy();
    }

    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return this.options.getParameterNameRenderingPolicy();
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return this.options.getParameterNamesInFunctionalTypes();
    }

    public boolean getPresentableUnresolvedTypes() {
        return this.options.getPresentableUnresolvedTypes();
    }

    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return this.options.getPropertyAccessorRenderingPolicy();
    }

    public boolean getReceiverAfterName() {
        return this.options.getReceiverAfterName();
    }

    public boolean getRenderAbbreviatedTypeComments() {
        return this.options.getRenderAbbreviatedTypeComments();
    }

    public boolean getRenderCompanionObjectName() {
        return this.options.getRenderCompanionObjectName();
    }

    public boolean getRenderConstructorDelegation() {
        return this.options.getRenderConstructorDelegation();
    }

    public boolean getRenderConstructorKeyword() {
        return this.options.getRenderConstructorKeyword();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return this.options.getRenderDefaultAnnotationArguments();
    }

    public boolean getRenderDefaultModality() {
        return this.options.getRenderDefaultModality();
    }

    public boolean getRenderDefaultVisibility() {
        return this.options.getRenderDefaultVisibility();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return this.options.getRenderPrimaryConstructorParametersAsProperties();
    }

    public boolean getRenderTypeExpansions() {
        return this.options.getRenderTypeExpansions();
    }

    public boolean getRenderUnabbreviatedType() {
        return this.options.getRenderUnabbreviatedType();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return this.options.getSecondaryConstructorsAsPrimary();
    }

    public boolean getStartFromDeclarationKeyword() {
        return this.options.getStartFromDeclarationKeyword();
    }

    public boolean getStartFromName() {
        return this.options.getStartFromName();
    }

    public RenderingFormat getTextFormat() {
        return this.options.getTextFormat();
    }

    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return this.options.getTypeNormalizer();
    }

    public boolean getUninferredTypeParameterAsName() {
        return this.options.getUninferredTypeParameterAsName();
    }

    public boolean getUnitReturnType() {
        return this.options.getUnitReturnType();
    }

    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return this.options.getValueParametersHandler();
    }

    public boolean getVerbose() {
        return this.options.getVerbose();
    }

    public boolean getWithDefinedIn() {
        return this.options.getWithDefinedIn();
    }

    public boolean getWithSourceFileForTopLevel() {
        return this.options.getWithSourceFileForTopLevel();
    }

    public boolean getWithoutReturnType() {
        return this.options.getWithoutReturnType();
    }

    public boolean getWithoutSuperTypes() {
        return this.options.getWithoutSuperTypes();
    }

    public boolean getWithoutTypeParameters() {
        return this.options.getWithoutTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String render(DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor containingDeclaration;
        String name;
        declarationDescriptor.getClass();
        StringBuilder sb = new StringBuilder();
        declarationDescriptor.accept(new Pool(this), sb);
        if (getWithDefinedIn() && !(declarationDescriptor instanceof PackageFragmentDescriptor) && !(declarationDescriptor instanceof PackageViewDescriptor) && (containingDeclaration = declarationDescriptor.getContainingDeclaration()) != null && !(containingDeclaration instanceof ModuleDescriptor)) {
            sb.append(" ");
            sb.append(renderMessage("defined in"));
            sb.append(" ");
            FqNameUnsafe fqName = DescriptorUtils.getFqName(containingDeclaration);
            fqName.getClass();
            sb.append(fqName.isRoot() ? "root package" : renderFqName(fqName));
            if (getWithSourceFileForTopLevel() && (containingDeclaration instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).getSource().getContainingFile().getName()) != null) {
                sb.append(" ");
                sb.append(renderMessage("in file"));
                sb.append(" ");
                sb.append(name);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderAnnotation(AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget) {
        ClassConstructorDescriptor mo4142getUnsubstitutedPrimaryConstructor;
        List<ValueParameterDescriptor> valueParameters;
        annotationDescriptor.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (annotationUseSiteTarget != null) {
            sb.append(annotationUseSiteTarget.getRenderName() + ':');
        }
        KotlinType type2 = annotationDescriptor.getType();
        sb.append(renderType(type2));
        if (getIncludeAnnotationArguments()) {
            Map<Name, ConstantValue<?>> allValueArguments = annotationDescriptor.getAllValueArguments();
            EmptyList emptyList = null;
            ClassDescriptor annotationClass = getRenderDefaultAnnotationArguments() ? DescriptorUtilsKt.getAnnotationClass(annotationDescriptor) : null;
            if (annotationClass != null && (mo4142getUnsubstitutedPrimaryConstructor = annotationClass.mo4142getUnsubstitutedPrimaryConstructor()) != null && (valueParameters = mo4142getUnsubstitutedPrimaryConstructor.getValueParameters()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : valueParameters) {
                    if (((ValueParameterDescriptor) obj).declaresDefaultValue()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ValueParameterDescriptor) it.next()).getName());
                }
                emptyList = arrayList2;
            }
            if (emptyList == null) {
                emptyList = EmptyList.INSTANCE;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : emptyList) {
                if (!allValueArguments.containsKey((Name) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((Name) it2.next()).asString() + " = ...");
            }
            Set<Map.Entry<Name, ConstantValue<?>>> entrySet = allValueArguments.entrySet();
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
            Iterator<T> it3 = entrySet.iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                Name name = (Name) entry.getKey();
                ConstantValue constantValue = (ConstantValue) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name.asString());
                sb2.append(" = ");
                sb2.append(!emptyList.contains(name) ? renderConstant(constantValue) : "...");
                arrayList5.add(sb2.toString());
            }
            List sorted = CollectionsKt.sorted(CollectionsKt.plus((Iterable) arrayList5, (Collection) arrayList4));
            if (getIncludeEmptyAnnotationArguments() || !sorted.isEmpty()) {
                CollectionsKt.joinTo$default(sorted, sb, ", ", "(", ")", null, 112);
            }
        }
        if (getVerbose() && (KotlinTypeKt.isError(type2) || (type2.getConstructor().mo4153getDeclarationDescriptor() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void renderAnnotations(StringBuilder sb, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        if (getModifiers().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            Set<FqName> excludedTypeAnnotationClasses = annotated instanceof KotlinType ? getExcludedTypeAnnotationClasses() : getExcludedAnnotationClasses();
            Function1<AnnotationDescriptor, Boolean> annotationFilter = getAnnotationFilter();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt.contains(excludedTypeAnnotationClasses, annotationDescriptor.getFqName()) && !Intrinsics.areEqual(annotationDescriptor.getFqName(), StandardNames.FqNames.parameterName) && (annotationFilter == null || ((Boolean) annotationFilter.invoke(annotationDescriptor)).booleanValue())) {
                    sb.append(renderAnnotation(annotationDescriptor, annotationUseSiteTarget));
                    if (getEachAnnotationOnNewLine()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void renderCapturedTypeParametersIfRequired(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb) {
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.getTypeConstructor().getParameters();
        parameters.getClass();
        if (getVerbose() && classifierDescriptorWithTypeParameters.isInner() && parameters.size() > declaredTypeParameters.size()) {
            sb.append(" /*captured type parameters: ");
            renderTypeParameterList(sb, parameters.subList(declaredTypeParameters.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public String renderClassifierName(ClassifierDescriptor classifierDescriptor) {
        classifierDescriptor.getClass();
        return ErrorUtils.isError(classifierDescriptor) ? classifierDescriptor.getTypeConstructor().toString() : getClassifierNamePolicy().renderClassifier(classifierDescriptor, this);
    }

    public final String renderConstant(ConstantValue constantValue) {
        Function1<ConstantValue<?>, String> propertyConstantRenderer = this.options.getPropertyConstantRenderer();
        if (propertyConstantRenderer != null) {
            return (String) propertyConstantRenderer.invoke(constantValue);
        }
        if (constantValue instanceof ArrayValue) {
            List<? extends ConstantValue<?>> value = ((ArrayValue) constantValue).getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                String renderConstant = renderConstant((ConstantValue) it.next());
                if (renderConstant != null) {
                    arrayList.add(renderConstant);
                }
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "{", "}", 0, null, null, 56);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt.removePrefix("@", DescriptorRenderer.renderAnnotation$default(this, ((AnnotationValue) constantValue).getValue(), null, 2, null));
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value value2 = ((KClassValue) constantValue).getValue();
        if (value2 instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) value2).getType() + "::class";
        }
        if (!(value2 instanceof KClassValue.Value.NormalClass)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value2;
        String asString = normalClass.getClassId().asSingleFqName().asString();
        int arrayDimensions = normalClass.getArrayDimensions();
        for (int i = 0; i < arrayDimensions; i++) {
            asString = JsonLogicResult$Success$$ExternalSyntheticOutline0.m('>', "kotlin.Array<", asString);
        }
        return Recorder$$ExternalSyntheticOutline2.m$1(asString, "::class");
    }

    public final void renderContextReceivers(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            KotlinType type2 = ((ReceiverParameterDescriptor) it.next()).getType();
            type2.getClass();
            sb.append(renderForReceiver(type2, true));
            if (i == CollectionsKt__CollectionsKt.getLastIndex(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    public final void renderDefaultType(StringBuilder sb, SimpleType simpleType) {
        renderAnnotations(sb, simpleType, null);
        DefinitelyNotNullType definitelyNotNullType = simpleType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) simpleType : null;
        SimpleType original = definitelyNotNullType != null ? definitelyNotNullType.getOriginal() : null;
        if (KotlinTypeKt.isError(simpleType)) {
            if (TypeUtilsKt.isUnresolvedType(simpleType) && getPresentableUnresolvedTypes()) {
                sb.append(renderError(ErrorUtils.INSTANCE.unresolvedTypeAsItIs(simpleType)));
            } else {
                if (!(simpleType instanceof ErrorType) || getInformativeErrorType()) {
                    sb.append(simpleType.getConstructor().toString());
                } else {
                    sb.append(((ErrorType) simpleType).getDebugMessage());
                }
                sb.append(renderTypeArguments(simpleType.getArguments()));
            }
        } else if (simpleType instanceof StubTypeForBuilderInference) {
            sb.append(((StubTypeForBuilderInference) simpleType).getOriginalTypeVariable().toString());
        } else if (original instanceof StubTypeForBuilderInference) {
            sb.append(((StubTypeForBuilderInference) original).getOriginalTypeVariable().toString());
        } else {
            TypeConstructor constructor = simpleType.getConstructor();
            PossiblyInnerType buildPossiblyInnerType = TypeParameterUtilsKt.buildPossiblyInnerType(simpleType);
            if (buildPossiblyInnerType == null) {
                sb.append(renderTypeConstructor(constructor));
                sb.append(renderTypeArguments(simpleType.getArguments()));
            } else {
                renderPossiblyInnerType(sb, buildPossiblyInnerType);
            }
        }
        if (simpleType.isMarkedNullable()) {
            sb.append("?");
        }
        if (SpecialTypesKt.isDefinitelyNotNullType(simpleType)) {
            sb.append(" & Any");
        }
    }

    public final String renderError(String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("<font color=red><b>", str, "</b></font>");
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderFlexibleType(String str, String str2, final KotlinBuiltIns kotlinBuiltIns) {
        str.getClass();
        str2.getClass();
        kotlinBuiltIns.getClass();
        final int i = 0;
        if (RenderingUtilsKt.typeStringsDifferOnlyInNullability(str, str2)) {
            return StringsKt__StringsJVMKt.startsWith(str2, "(", false) ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("(", str, ")!") : str.concat("!");
        }
        final int i2 = 1;
        String renderFlexibleMutabilityOrArrayElementVarianceType = RenderingUtilsKt.renderFlexibleMutabilityOrArrayElementVarianceType(str, str2, new Function0(this, kotlinBuiltIns, i) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$1
            public final /* synthetic */ int $r8$classId;
            public final DescriptorRendererImpl arg$0;
            public final KotlinBuiltIns arg$1;

            {
                this.$r8$classId = i;
                this.arg$0 = this;
                this.arg$1 = kotlinBuiltIns;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = this.$r8$classId;
                KotlinBuiltIns kotlinBuiltIns2 = this.arg$1;
                DescriptorRendererImpl descriptorRendererImpl = this.arg$0;
                switch (i3) {
                    case 0:
                        int i4 = DescriptorRendererImpl.$r8$clinit;
                        ClassifierNamePolicy classifierNamePolicy = descriptorRendererImpl.getClassifierNamePolicy();
                        ClassDescriptor collection = kotlinBuiltIns2.getCollection();
                        collection.getClass();
                        String renderClassifier = classifierNamePolicy.renderClassifier(collection, descriptorRendererImpl);
                        return StringsKt.substringBefore(renderClassifier, "Collection", renderClassifier);
                    default:
                        int i5 = DescriptorRendererImpl.$r8$clinit;
                        ClassifierNamePolicy classifierNamePolicy2 = descriptorRendererImpl.getClassifierNamePolicy();
                        ClassDescriptor array2 = kotlinBuiltIns2.getArray();
                        array2.getClass();
                        String renderClassifier2 = classifierNamePolicy2.renderClassifier(array2, descriptorRendererImpl);
                        return StringsKt.substringBefore(renderClassifier2, "Array", renderClassifier2);
                }
            }
        }, new Function0(this, kotlinBuiltIns, i2) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$$Lambda$1
            public final /* synthetic */ int $r8$classId;
            public final DescriptorRendererImpl arg$0;
            public final KotlinBuiltIns arg$1;

            {
                this.$r8$classId = i2;
                this.arg$0 = this;
                this.arg$1 = kotlinBuiltIns;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = this.$r8$classId;
                KotlinBuiltIns kotlinBuiltIns2 = this.arg$1;
                DescriptorRendererImpl descriptorRendererImpl = this.arg$0;
                switch (i3) {
                    case 0:
                        int i4 = DescriptorRendererImpl.$r8$clinit;
                        ClassifierNamePolicy classifierNamePolicy = descriptorRendererImpl.getClassifierNamePolicy();
                        ClassDescriptor collection = kotlinBuiltIns2.getCollection();
                        collection.getClass();
                        String renderClassifier = classifierNamePolicy.renderClassifier(collection, descriptorRendererImpl);
                        return StringsKt.substringBefore(renderClassifier, "Collection", renderClassifier);
                    default:
                        int i5 = DescriptorRendererImpl.$r8$clinit;
                        ClassifierNamePolicy classifierNamePolicy2 = descriptorRendererImpl.getClassifierNamePolicy();
                        ClassDescriptor array2 = kotlinBuiltIns2.getArray();
                        array2.getClass();
                        String renderClassifier2 = classifierNamePolicy2.renderClassifier(array2, descriptorRendererImpl);
                        return StringsKt.substringBefore(renderClassifier2, "Array", renderClassifier2);
                }
            }
        }, new Radiography$renderScannableViewTree$1$2(1, this, DescriptorRendererImpl.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, 2));
        if (renderFlexibleMutabilityOrArrayElementVarianceType != null) {
            return renderFlexibleMutabilityOrArrayElementVarianceType;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String renderForReceiver(KotlinType kotlinType, boolean z) {
        String renderType = renderType(kotlinType);
        return ((!shouldRenderAsPrettyFunctionType(kotlinType) || TypeUtils.isNullableType(kotlinType)) && !(kotlinType instanceof DefinitelyNotNullType) && (!z || kotlinType.getAnnotations().isEmpty())) ? renderType : JsonLogicResult$Success$$ExternalSyntheticOutline0.m(')', "(", renderType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderFqName(FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        return escape(RenderingUtilsKt.renderFqName(fqNameUnsafe.pathSegments()));
    }

    public final String renderKeyword(String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i != 1) {
            if (i != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (!getBoldOnlyForNamesInHtml()) {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("<b>", str, "</b>");
            }
        }
        return str;
    }

    public final void renderMemberKind(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (getModifiers().contains(DescriptorRendererModifier.MEMBER_KIND) && getVerbose() && callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            sb.append(CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(callableMemberDescriptor.getKind().name()));
            sb.append("*/ ");
        }
    }

    public final void renderMemberModifiers(MemberDescriptor memberDescriptor, StringBuilder sb) {
        renderModifier(sb, memberDescriptor.isExternal(), "external");
        boolean z = false;
        renderModifier(sb, getModifiers().contains(DescriptorRendererModifier.EXPECT) && memberDescriptor.isExpect(), "expect");
        if (getModifiers().contains(DescriptorRendererModifier.ACTUAL) && memberDescriptor.isActual()) {
            z = true;
        }
        renderModifier(sb, z, "actual");
    }

    public String renderMessage(String str) {
        str.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("<i>", str, "</i>");
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public final void renderModalityForCallable(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (DescriptorUtils.isTopLevelDeclaration(callableMemberDescriptor) && callableMemberDescriptor.getModality() == Modality.FINAL) {
            return;
        }
        if (getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OVERRIDE && callableMemberDescriptor.getModality() == Modality.OPEN && !callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
            return;
        }
        Modality modality = callableMemberDescriptor.getModality();
        modality.getClass();
        Modality implicitModalityWithoutExtensions = implicitModalityWithoutExtensions(callableMemberDescriptor);
        if (getRenderDefaultModality() || modality != implicitModalityWithoutExtensions) {
            renderModifier(sb, getModifiers().contains(DescriptorRendererModifier.MODALITY), CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(modality.name()));
        }
    }

    public final void renderModifier(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(renderKeyword(str));
            sb.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderName(Name name, boolean z) {
        name.getClass();
        String escape = escape(RenderingUtilsKt.render$default(name, false, 1, null));
        return (getBoldOnlyForNamesInHtml() && getTextFormat() == RenderingFormat.HTML && z) ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("<b>", escape, "</b>") : escape;
    }

    public final void renderNormalizedType(StringBuilder sb, KotlinType kotlinType) {
        UnwrappedType unwrap2 = kotlinType.unwrap();
        AbbreviatedType abbreviatedType = unwrap2 instanceof AbbreviatedType ? (AbbreviatedType) unwrap2 : null;
        if (abbreviatedType == null) {
            renderNormalizedTypeAsIs(sb, kotlinType);
            return;
        }
        if (getRenderTypeExpansions()) {
            renderNormalizedTypeAsIs(sb, abbreviatedType.getExpandedType());
            if (getRenderAbbreviatedTypeComments()) {
                RenderingFormat textFormat = getTextFormat();
                RenderingFormat renderingFormat = RenderingFormat.HTML;
                if (textFormat == renderingFormat) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                renderNormalizedTypeAsIs(sb, abbreviatedType.getAbbreviation());
                sb.append(" */");
                if (getTextFormat() == renderingFormat) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        renderNormalizedTypeAsIs(sb, abbreviatedType.getAbbreviation());
        if (getRenderUnabbreviatedType()) {
            RenderingFormat textFormat2 = getTextFormat();
            RenderingFormat renderingFormat2 = RenderingFormat.HTML;
            if (textFormat2 == renderingFormat2) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            renderNormalizedTypeAsIs(sb, abbreviatedType.getExpandedType());
            sb.append(" */");
            if (getTextFormat() == renderingFormat2) {
                sb.append("</i></font>");
            }
        }
    }

    public final void renderNormalizedTypeAsIs(StringBuilder sb, KotlinType kotlinType) {
        Name name;
        String escape;
        if ((kotlinType instanceof WrappedType) && getDebugMode() && !((WrappedType) kotlinType).isComputed()) {
            sb.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrap2 = kotlinType.unwrap();
        if (unwrap2 instanceof FlexibleType) {
            sb.append(((FlexibleType) unwrap2).render(this, this));
            return;
        }
        if (!(unwrap2 instanceof SimpleType)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        SimpleType simpleType = (SimpleType) unwrap2;
        if (simpleType.equals(TypeUtils.CANNOT_INFER_FUNCTION_PARAM_TYPE) || TypeUtils.isDontCarePlaceholder(simpleType)) {
            sb.append("???");
            return;
        }
        if (ErrorUtils.isUninferredTypeVariable(simpleType)) {
            if (!getUninferredTypeParameterAsName()) {
                sb.append("???");
                return;
            }
            TypeConstructor constructor = simpleType.getConstructor();
            constructor.getClass();
            sb.append(renderError(((ErrorTypeConstructor) constructor).getParam(0)));
            return;
        }
        if (KotlinTypeKt.isError(simpleType)) {
            renderDefaultType(sb, simpleType);
            return;
        }
        if (!shouldRenderAsPrettyFunctionType(simpleType)) {
            renderDefaultType(sb, simpleType);
            return;
        }
        int length = sb.length();
        ((DescriptorRendererImpl) this.functionTypeAnnotationsRenderer$delegate.getValue()).renderAnnotations(sb, simpleType, null);
        boolean z = sb.length() != length;
        KotlinType receiverTypeFromFunctionType = FunctionTypesKt.getReceiverTypeFromFunctionType(simpleType);
        List<KotlinType> contextReceiverTypesFromFunctionType = FunctionTypesKt.getContextReceiverTypesFromFunctionType(simpleType);
        boolean isSuspendFunctionType = FunctionTypesKt.isSuspendFunctionType(simpleType);
        boolean isMarkedNullable = simpleType.isMarkedNullable();
        boolean z2 = isMarkedNullable || (z && receiverTypeFromFunctionType != null);
        if (z2) {
            if (isSuspendFunctionType) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    CharsKt.isWhitespace(StringsKt___StringsKt.last(sb));
                    if (sb.charAt(sb.length() - 2) != ')') {
                        sb.insert(sb.length() - 1, "()");
                    }
                }
                sb.append("(");
            }
        }
        renderModifier(sb, isSuspendFunctionType, "suspend");
        if (!contextReceiverTypesFromFunctionType.isEmpty()) {
            sb.append("context(");
            Iterator<KotlinType> it = contextReceiverTypesFromFunctionType.subList(0, CollectionsKt__CollectionsKt.getLastIndex(contextReceiverTypesFromFunctionType)).iterator();
            while (it.hasNext()) {
                renderNormalizedType(sb, it.next());
                sb.append(", ");
            }
            renderNormalizedType(sb, (KotlinType) CollectionsKt.last((List) contextReceiverTypesFromFunctionType));
            sb.append(") ");
        }
        if (receiverTypeFromFunctionType != null) {
            boolean z3 = (shouldRenderAsPrettyFunctionType(receiverTypeFromFunctionType) && !receiverTypeFromFunctionType.isMarkedNullable()) || FunctionTypesKt.isSuspendFunctionType(receiverTypeFromFunctionType) || !receiverTypeFromFunctionType.getAnnotations().isEmpty() || (receiverTypeFromFunctionType instanceof DefinitelyNotNullType);
            if (z3) {
                sb.append("(");
            }
            renderNormalizedType(sb, receiverTypeFromFunctionType);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!FunctionTypesKt.isBuiltinExtensionFunctionalType(simpleType) || simpleType.getArguments().size() > 1) {
            int i = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.getValueParameterTypesFromFunctionType(simpleType)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                if (getParameterNamesInFunctionalTypes()) {
                    KotlinType type2 = typeProjection.getType();
                    type2.getClass();
                    name = FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2);
                } else {
                    name = null;
                }
                if (name != null) {
                    sb.append(renderName(name, false));
                    sb.append(": ");
                }
                sb.append(renderTypeProjection(typeProjection));
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int i3 = WhenMappings.$EnumSwitchMapping$0[getTextFormat().ordinal()];
        if (i3 == 1) {
            escape = escape("->");
        } else {
            if (i3 != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            escape = "&rarr;";
        }
        sb.append(escape);
        sb.append(" ");
        renderNormalizedType(sb, FunctionTypesKt.getReturnTypeFromFunctionType(simpleType));
        if (z2) {
            sb.append(")");
        }
        if (isMarkedNullable) {
            sb.append("?");
        }
    }

    public final void renderOverride(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (!getModifiers().contains(DescriptorRendererModifier.OVERRIDE) || callableMemberDescriptor.getOverriddenDescriptors().isEmpty() || getOverrideRenderingPolicy() == OverrideRenderingPolicy.RENDER_OPEN) {
            return;
        }
        renderModifier(sb, true, "override");
        if (getVerbose()) {
            sb.append("/*");
            sb.append(callableMemberDescriptor.getOverriddenDescriptors().size());
            sb.append("*/ ");
        }
    }

    public final void renderPossiblyInnerType(StringBuilder sb, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType outerType = possiblyInnerType.getOuterType();
        if (outerType != null) {
            renderPossiblyInnerType(sb, outerType);
            sb.append('.');
            Name name = possiblyInnerType.getClassifierDescriptor().getName();
            name.getClass();
            sb.append(renderName(name, false));
        } else {
            TypeConstructor typeConstructor = possiblyInnerType.getClassifierDescriptor().getTypeConstructor();
            typeConstructor.getClass();
            sb.append(renderTypeConstructor(typeConstructor));
        }
        sb.append(renderTypeArguments(possiblyInnerType.getArguments()));
    }

    public final void renderReceiver(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            renderAnnotations(sb, extensionReceiverParameter, AnnotationUseSiteTarget.RECEIVER);
            KotlinType type2 = extensionReceiverParameter.getType();
            type2.getClass();
            sb.append(renderForReceiver(type2, false));
            sb.append(".");
        }
    }

    public final void renderReceiverAfterName(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        ReceiverParameterDescriptor extensionReceiverParameter;
        if (getReceiverAfterName() && (extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter()) != null) {
            sb.append(" on ");
            KotlinType type2 = extensionReceiverParameter.getType();
            type2.getClass();
            sb.append(renderType(type2));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderType(KotlinType kotlinType) {
        kotlinType.getClass();
        StringBuilder sb = new StringBuilder();
        renderNormalizedType(sb, (KotlinType) getTypeNormalizer().invoke(kotlinType));
        return sb.toString();
    }

    public String renderTypeArguments(List<? extends TypeProjection> list) {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(escape("<"));
        CollectionsKt.joinTo$default(list, sb, ", ", null, null, new DescriptorRendererImpl$$Lambda$4(this, 0), 60);
        sb.append(escape(">"));
        return sb.toString();
    }

    public String renderTypeConstructor(TypeConstructor typeConstructor) {
        typeConstructor.getClass();
        ClassifierDescriptor mo4153getDeclarationDescriptor = typeConstructor.mo4153getDeclarationDescriptor();
        if ((mo4153getDeclarationDescriptor instanceof TypeParameterDescriptor) || (mo4153getDeclarationDescriptor instanceof ClassDescriptor) || (mo4153getDeclarationDescriptor instanceof TypeAliasDescriptor)) {
            return renderClassifierName(mo4153getDeclarationDescriptor);
        }
        if (mo4153getDeclarationDescriptor == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).makeDebugNameForIntersectionType(RenderingUtilsKt$$Lambda$0.INSTANCE$12) : typeConstructor.toString();
        }
        a$$ExternalSyntheticBUOutline0.m(mo4153getDeclarationDescriptor.getClass(), "Unexpected classifier: ");
        return null;
    }

    public final void renderTypeParameter(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(escape("<"));
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(typeParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        renderModifier(sb, typeParameterDescriptor.isReified(), "reified");
        String label = typeParameterDescriptor.getVariance().getLabel();
        boolean z2 = true;
        renderModifier(sb, label.length() > 0, label);
        renderAnnotations(sb, typeParameterDescriptor, null);
        renderName(typeParameterDescriptor, sb, z);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.isDefaultBound(next)) {
                sb.append(" : ");
                next.getClass();
                sb.append(renderType(next));
            }
        } else if (z) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.isDefaultBound(kotlinType)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    kotlinType.getClass();
                    sb.append(renderType(kotlinType));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(escape(">"));
        }
    }

    public final void renderTypeParameterList(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            renderTypeParameter((TypeParameterDescriptor) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public final void renderTypeParameters(List list, StringBuilder sb, boolean z) {
        if (getWithoutTypeParameters() || list.isEmpty()) {
            return;
        }
        sb.append(escape("<"));
        renderTypeParameterList(sb, list);
        sb.append(escape(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String renderTypeProjection(TypeProjection typeProjection) {
        typeProjection.getClass();
        StringBuilder sb = new StringBuilder();
        CollectionsKt.joinTo$default(CollectionsKt__CollectionsJVMKt.listOf(typeProjection), sb, ", ", null, null, new DescriptorRendererImpl$$Lambda$4(this, 0), 60);
        return sb.toString();
    }

    public final void renderValVarPrefix(VariableDescriptor variableDescriptor, StringBuilder sb, boolean z) {
        if (z || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb.append(renderKeyword(variableDescriptor.isVar() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void renderValueParameter(ValueParameterDescriptor valueParameterDescriptor, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        KotlinType type2;
        ConstantValue<?> mo4144getCompileTimeInitializer;
        String renderConstant;
        if (z2) {
            sb.append(renderKeyword("value-parameter"));
            sb.append(" ");
        }
        if (getVerbose()) {
            sb.append("/*");
            sb.append(valueParameterDescriptor.getIndex());
            sb.append("*/ ");
        }
        renderAnnotations(sb, valueParameterDescriptor, null);
        renderModifier(sb, valueParameterDescriptor.isCrossinline(), "crossinline");
        renderModifier(sb, valueParameterDescriptor.isNoinline(), "noinline");
        if (getRenderPrimaryConstructorParametersAsProperties()) {
            CallableDescriptor containingDeclaration = valueParameterDescriptor.getContainingDeclaration();
            ClassConstructorDescriptor classConstructorDescriptor = containingDeclaration instanceof ClassConstructorDescriptor ? (ClassConstructorDescriptor) containingDeclaration : null;
            if (classConstructorDescriptor != null && classConstructorDescriptor.isPrimary()) {
                z3 = true;
                if (z3) {
                    renderModifier(sb, getActualPropertiesInPrimaryConstructor(), "actual");
                }
                type2 = valueParameterDescriptor.getType();
                type2.getClass();
                KotlinType varargElementType = valueParameterDescriptor.getVarargElementType();
                KotlinType kotlinType = varargElementType != null ? type2 : varargElementType;
                renderModifier(sb, varargElementType != null, "vararg");
                if (!z3 || (z2 && !getStartFromName())) {
                    renderValVarPrefix(valueParameterDescriptor, sb, z3);
                }
                if (z) {
                    renderName(valueParameterDescriptor, sb, z2);
                    sb.append(": ");
                }
                sb.append(renderType(kotlinType));
                if (getIncludePropertyConstant() && (mo4144getCompileTimeInitializer = valueParameterDescriptor.mo4144getCompileTimeInitializer()) != null && (renderConstant = renderConstant(mo4144getCompileTimeInitializer)) != null) {
                    sb.append(" = ");
                    sb.append(escape(renderConstant));
                }
                if (getVerbose() && varargElementType != null) {
                    sb.append(" /*");
                    sb.append(renderType(type2));
                    sb.append("*/");
                }
                if (getDefaultParameterValueRenderer() == null) {
                    if (getDebugMode() ? valueParameterDescriptor.declaresDefaultValue() : DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor)) {
                        StringBuilder sb2 = new StringBuilder(" = ");
                        Function1<ValueParameterDescriptor, String> defaultParameterValueRenderer = getDefaultParameterValueRenderer();
                        defaultParameterValueRenderer.getClass();
                        sb2.append((String) defaultParameterValueRenderer.invoke(valueParameterDescriptor));
                        sb.append(sb2.toString());
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z3 = false;
        if (z3) {
        }
        type2 = valueParameterDescriptor.getType();
        type2.getClass();
        KotlinType varargElementType2 = valueParameterDescriptor.getVarargElementType();
        if (varargElementType2 != null) {
        }
        renderModifier(sb, varargElementType2 != null, "vararg");
        if (!z3) {
        }
        renderValVarPrefix(valueParameterDescriptor, sb, z3);
        if (z) {
        }
        sb.append(renderType(kotlinType));
        if (getIncludePropertyConstant()) {
            sb.append(" = ");
            sb.append(escape(renderConstant));
        }
        if (getVerbose()) {
            sb.append(" /*");
            sb.append(renderType(type2));
            sb.append("*/");
        }
        if (getDefaultParameterValueRenderer() == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r8 == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void renderValueParameters(Collection collection, boolean z, StringBuilder sb) {
        int i = WhenMappings.$EnumSwitchMapping$1[getParameterNameRenderingPolicy().ordinal()];
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            }
            z2 = false;
        }
        int size = collection.size();
        getValueParametersHandler().appendBeforeValueParameters(size, sb);
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) it.next();
            getValueParametersHandler().appendBeforeValueParameter(valueParameterDescriptor, i2, size, sb);
            renderValueParameter(valueParameterDescriptor, z2, sb, false);
            getValueParametersHandler().appendAfterValueParameter(valueParameterDescriptor, i2, size, sb);
            i2++;
        }
        getValueParametersHandler().appendAfterValueParameters(size, sb);
    }

    public final boolean renderVisibility(DescriptorVisibility descriptorVisibility, StringBuilder sb) {
        if (!getModifiers().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        if (getNormalizedVisibilities()) {
            descriptorVisibility = descriptorVisibility.normalize();
        }
        if (!getRenderDefaultVisibility() && Intrinsics.areEqual(descriptorVisibility, DescriptorVisibilities.DEFAULT_VISIBILITY)) {
            return false;
        }
        sb.append(renderKeyword(descriptorVisibility.getInternalDisplayName()));
        sb.append(" ");
        return true;
    }

    public final void renderWhereSuffix(StringBuilder sb, List list) {
        if (getWithoutTypeParameters()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it.next();
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            upperBounds.getClass();
            for (KotlinType kotlinType : CollectionsKt.drop(upperBounds, 1)) {
                StringBuilder sb2 = new StringBuilder();
                Name name = typeParameterDescriptor.getName();
                name.getClass();
                sb2.append(renderName(name, false));
                sb2.append(" : ");
                kotlinType.getClass();
                sb2.append(renderType(kotlinType));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(renderKeyword("where"));
        sb.append(" ");
        CollectionsKt.joinTo$default(arrayList, sb, ", ", null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        annotationArgumentsRenderingPolicy.getClass();
        this.options.setAnnotationArgumentsRenderingPolicy(annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(ClassifierNamePolicy classifierNamePolicy) {
        classifierNamePolicy.getClass();
        this.options.setClassifierNamePolicy(classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z) {
        this.options.setDebugMode(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(Set<FqName> set) {
        set.getClass();
        this.options.setExcludedTypeAnnotationClasses(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(Set<? extends DescriptorRendererModifier> set) {
        set.getClass();
        this.options.setModifiers(set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        parameterNameRenderingPolicy.getClass();
        this.options.setParameterNameRenderingPolicy(parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z) {
        this.options.setReceiverAfterName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z) {
        this.options.setRenderCompanionObjectName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z) {
        this.options.setStartFromName(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(RenderingFormat renderingFormat) {
        renderingFormat.getClass();
        this.options.setTextFormat(renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z) {
        this.options.setVerbose(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z) {
        this.options.setWithDefinedIn(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z) {
        this.options.setWithoutSuperTypes(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z) {
        this.options.setWithoutTypeParameters(z);
    }

    public final void renderName(DeclarationDescriptor declarationDescriptor, StringBuilder sb, boolean z) {
        Name name = declarationDescriptor.getName();
        name.getClass();
        sb.append(renderName(name, z));
    }
}
