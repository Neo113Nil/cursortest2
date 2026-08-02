package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* loaded from: classes9.dex */
public abstract class FunctionDescriptorImpl extends DeclarationDescriptorNonRootImpl implements FunctionDescriptor {
    public List contextReceiverParameters;
    public ReceiverParameterDescriptor dispatchReceiverParameter;
    public ReceiverParameterDescriptor extensionReceiverParameter;
    public boolean hasStableParameterNames;
    public boolean hasSynthesizedParameterNames;
    public FunctionDescriptor initialSignatureDescriptor;
    public boolean isActual;
    public boolean isExpect;
    public boolean isExternal;
    public boolean isHiddenForResolutionEverywhereBesideSupercalls;
    public boolean isHiddenToOvercomeSignatureClash;
    public boolean isInfix;
    public boolean isInline;
    public boolean isOperator;
    public boolean isSuspend;
    public boolean isTailrec;
    public final CallableMemberDescriptor.Kind kind;
    public volatile AnonymousClass1 lazyOverriddenFunctionsTask;
    public Modality modality;
    public final FunctionDescriptor original;
    public Collection overriddenFunctions;
    public List typeParameters;
    public KotlinType unsubstitutedReturnType;
    public List unsubstitutedValueParameters;
    public Map userDataMap;
    public DescriptorVisibility visibility;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$1, reason: invalid class name */
    public final class AnonymousClass1 implements Function0 {
        public final /* synthetic */ TypeSubstitutor val$substitutor;

        public AnonymousClass1(TypeSubstitutor typeSubstitutor) {
            this.val$substitutor = typeSubstitutor;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            SmartList smartList = new SmartList();
            Iterator<? extends FunctionDescriptor> it = FunctionDescriptorImpl.this.getOverriddenDescriptors().iterator();
            while (it.hasNext()) {
                smartList.add(it.next().substitute(this.val$substitutor));
            }
            return smartList;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$2, reason: invalid class name */
    public final class AnonymousClass2 implements Function0 {
        public final /* synthetic */ int $r8$classId;
        public final List val$destructuringVariables;

        public /* synthetic */ AnonymousClass2(List list, int i) {
            this.$r8$classId = i;
            this.val$destructuringVariables = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
            }
            return this.val$destructuringVariables;
        }
    }

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = BreadcrumbHelper.Category.CONFIGURATION;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(format2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(format2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionDescriptorImpl(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        if (name == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        if (kind == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        this.visibility = DescriptorVisibilities.UNKNOWN;
        this.isOperator = false;
        this.isInfix = false;
        this.isExternal = false;
        this.isInline = false;
        this.isTailrec = false;
        this.isExpect = false;
        this.isActual = false;
        this.isHiddenToOvercomeSignatureClash = false;
        this.isHiddenForResolutionEverywhereBesideSupercalls = false;
        this.isSuspend = false;
        this.hasStableParameterNames = true;
        this.hasSynthesizedParameterNames = false;
        this.overriddenFunctions = null;
        this.lazyOverriddenFunctionsTask = null;
        this.initialSignatureDescriptor = null;
        this.userDataMap = null;
        this.original = functionDescriptor == null ? this : functionDescriptor;
        this.kind = kind;
    }

    public static List<ValueParameterDescriptor> getSubstitutedValueParameters(FunctionDescriptor functionDescriptor, List<ValueParameterDescriptor> list, TypeSubstitutor typeSubstitutor, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            $$$reportNull$$$0(30);
            throw null;
        }
        if (typeSubstitutor == null) {
            $$$reportNull$$$0(31);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            KotlinType type2 = valueParameterDescriptor.getType();
            Variance variance = Variance.IN_VARIANCE;
            KotlinType substitute = typeSubstitutor.substitute(type2, variance);
            KotlinType varargElementType = valueParameterDescriptor.getVarargElementType();
            KotlinType substitute2 = varargElementType == null ? null : typeSubstitutor.substitute(varargElementType, variance);
            if (substitute == null) {
                return null;
            }
            int i = 0;
            if ((substitute != valueParameterDescriptor.getType() || varargElementType != substitute2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(ValueParameterDescriptorImpl.createWithDestructuringDeclarations(functionDescriptor, z ? null : valueParameterDescriptor, valueParameterDescriptor.getIndex(), valueParameterDescriptor.getAnnotations(), valueParameterDescriptor.getName(), substitute, valueParameterDescriptor.declaresDefaultValue(), valueParameterDescriptor.isCrossinline(), valueParameterDescriptor.isNoinline(), substitute2, z2 ? valueParameterDescriptor.getSource() : SourceElement.NO_SOURCE, valueParameterDescriptor instanceof ValueParameterDescriptorImpl.WithDestructuringDeclaration ? new AnonymousClass2(((ValueParameterDescriptorImpl.WithDestructuringDeclaration) valueParameterDescriptor).getDestructuringVariables(), i) : null));
        }
        return arrayList;
    }

    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d) {
        return declarationDescriptorVisitor.visitFunctionDescriptor(this, d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public FunctionDescriptor copy(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z) {
        FunctionDescriptor build = newCopyBuilder().setOwner(declarationDescriptor).setModality(modality).setVisibility(descriptorVisibility).setKind(kind).setCopyOverrides(z).build();
        if (build != null) {
            return build;
        }
        $$$reportNull$$$0(26);
        throw null;
    }

    public abstract FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public FunctionDescriptorImpl doSubstitute(CopyConfiguration copyConfiguration) {
        ?? r13;
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
        ?? r16;
        ReceiverParameterDescriptor receiverParameterDescriptor;
        KotlinType substitute;
        if (copyConfiguration == null) {
            $$$reportNull$$$0(25);
            throw null;
        }
        boolean[] zArr = new boolean[1];
        Annotations composeAnnotations = copyConfiguration.additionalAnnotations != null ? AnnotationsKt.composeAnnotations(getAnnotations(), copyConfiguration.additionalAnnotations) : getAnnotations();
        DeclarationDescriptor declarationDescriptor = copyConfiguration.newOwner;
        FunctionDescriptor functionDescriptor = copyConfiguration.original;
        CallableMemberDescriptor.Kind kind = copyConfiguration.kind;
        Name name = copyConfiguration.name;
        SourceElement source = copyConfiguration.preserveSourceElement ? (functionDescriptor != null ? functionDescriptor : getOriginal()).getSource() : SourceElement.NO_SOURCE;
        if (source == null) {
            $$$reportNull$$$0(27);
            throw null;
        }
        FunctionDescriptorImpl createSubstitutedCopy = createSubstitutedCopy(declarationDescriptor, functionDescriptor, kind, name, composeAnnotations, source);
        List<TypeParameterDescriptor> list = copyConfiguration.newTypeParameters;
        if (list == null) {
            list = getTypeParameters();
        }
        zArr[0] = zArr[0] | (!list.isEmpty());
        ArrayList arrayList = new ArrayList(list.size());
        TypeSubstitutor substituteTypeParameters = DescriptorSubstitutor.substituteTypeParameters(list, copyConfiguration.substitution, createSubstitutedCopy, arrayList, zArr);
        if (substituteTypeParameters != null) {
            ArrayList arrayList2 = new ArrayList();
            if (!copyConfiguration.newContextReceiverParameters.isEmpty()) {
                int i = 0;
                for (ReceiverParameterDescriptor receiverParameterDescriptor2 : copyConfiguration.newContextReceiverParameters) {
                    KotlinType substitute2 = substituteTypeParameters.substitute(receiverParameterDescriptor2.getType(), Variance.IN_VARIANCE);
                    if (substitute2 == null) {
                        break;
                    }
                    int i2 = i + 1;
                    arrayList2.add(DescriptorFactory.createContextReceiverParameterForCallable(createSubstitutedCopy, substitute2, ((ImplicitContextReceiver) receiverParameterDescriptor2.getValue()).getCustomLabelName(), receiverParameterDescriptor2.getAnnotations(), i));
                    zArr[0] = zArr[0] | (substitute2 != receiverParameterDescriptor2.getType());
                    i = i2;
                }
            }
            ReceiverParameterDescriptor receiverParameterDescriptor3 = copyConfiguration.newExtensionReceiverParameter;
            if (receiverParameterDescriptor3 != null) {
                KotlinType substitute3 = substituteTypeParameters.substitute(receiverParameterDescriptor3.getType(), Variance.IN_VARIANCE);
                if (substitute3 != null) {
                    ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2 = new ReceiverParameterDescriptorImpl(createSubstitutedCopy, new ExtensionReceiver(createSubstitutedCopy, substitute3, copyConfiguration.newExtensionReceiverParameter.getValue()), copyConfiguration.newExtensionReceiverParameter.getAnnotations());
                    zArr[0] = (substitute3 != copyConfiguration.newExtensionReceiverParameter.getType()) | zArr[0];
                    r13 = 0;
                    receiverParameterDescriptorImpl = receiverParameterDescriptorImpl2;
                }
            } else {
                r13 = 0;
                receiverParameterDescriptorImpl = null;
            }
            ReceiverParameterDescriptor receiverParameterDescriptor4 = copyConfiguration.dispatchReceiverParameter;
            if (receiverParameterDescriptor4 != null) {
                ReceiverParameterDescriptor substitute4 = receiverParameterDescriptor4.substitute(substituteTypeParameters);
                if (substitute4 != null) {
                    zArr[r13] = zArr[r13] | (substitute4 != copyConfiguration.dispatchReceiverParameter ? true : r13);
                    r16 = r13;
                    receiverParameterDescriptor = substitute4;
                }
            } else {
                r16 = r13;
                receiverParameterDescriptor = null;
            }
            List<ValueParameterDescriptor> substitutedValueParameters = getSubstitutedValueParameters(createSubstitutedCopy, copyConfiguration.newValueParameterDescriptors, substituteTypeParameters, copyConfiguration.dropOriginalInContainingParts, copyConfiguration.preserveSourceElement, zArr);
            if (substitutedValueParameters != null && (substitute = substituteTypeParameters.substitute(copyConfiguration.newReturnType, Variance.OUT_VARIANCE)) != null) {
                boolean z = zArr[r16] | (substitute != copyConfiguration.newReturnType ? true : r16);
                zArr[r16] = z;
                if (!z && copyConfiguration.justForTypeSubstitution) {
                    return this;
                }
                createSubstitutedCopy.initialize(receiverParameterDescriptorImpl, receiverParameterDescriptor, arrayList2, arrayList, substitutedValueParameters, substitute, copyConfiguration.newModality, copyConfiguration.newVisibility);
                createSubstitutedCopy.setOperator(this.isOperator);
                createSubstitutedCopy.setInfix(this.isInfix);
                createSubstitutedCopy.setExternal(this.isExternal);
                createSubstitutedCopy.setInline(this.isInline);
                createSubstitutedCopy.setTailrec(this.isTailrec);
                createSubstitutedCopy.setSuspend(this.isSuspend);
                createSubstitutedCopy.setExpect(this.isExpect);
                createSubstitutedCopy.setActual(this.isActual);
                createSubstitutedCopy.setHasStableParameterNames(this.hasStableParameterNames);
                createSubstitutedCopy.isHiddenToOvercomeSignatureClash = copyConfiguration.isHiddenToOvercomeSignatureClash;
                createSubstitutedCopy.isHiddenForResolutionEverywhereBesideSupercalls = copyConfiguration.isHiddenForResolutionEverywhereBesideSupercalls;
                Boolean bool = copyConfiguration.newHasSynthesizedParameterNames;
                createSubstitutedCopy.setHasSynthesizedParameterNames(bool != null ? bool.booleanValue() : this.hasSynthesizedParameterNames);
                if (!copyConfiguration.userDataMap.isEmpty() || this.userDataMap != null) {
                    LinkedHashMap linkedHashMap = copyConfiguration.userDataMap;
                    Map map = this.userDataMap;
                    if (map != null) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!linkedHashMap.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    if (linkedHashMap.size() == 1) {
                        createSubstitutedCopy.userDataMap = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                    } else {
                        createSubstitutedCopy.userDataMap = linkedHashMap;
                    }
                }
                if (copyConfiguration.signatureChange || getInitialSignatureDescriptor() != null) {
                    createSubstitutedCopy.initialSignatureDescriptor = (getInitialSignatureDescriptor() != null ? getInitialSignatureDescriptor() : this).substitute(substituteTypeParameters);
                }
                if (copyConfiguration.copyOverrides && !getOriginal().getOverriddenDescriptors().isEmpty()) {
                    if (copyConfiguration.substitution.isEmpty()) {
                        AnonymousClass1 anonymousClass1 = this.lazyOverriddenFunctionsTask;
                        if (anonymousClass1 != null) {
                            createSubstitutedCopy.lazyOverriddenFunctionsTask = anonymousClass1;
                            return createSubstitutedCopy;
                        }
                        createSubstitutedCopy.setOverriddenDescriptors(getOverriddenDescriptors());
                        return createSubstitutedCopy;
                    }
                    createSubstitutedCopy.lazyOverriddenFunctionsTask = new AnonymousClass1(substituteTypeParameters);
                }
                return createSubstitutedCopy;
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ReceiverParameterDescriptor> getContextReceiverParameters() {
        List<ReceiverParameterDescriptor> list = this.contextReceiverParameters;
        if (list != null) {
            return list;
        }
        $$$reportNull$$$0(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return this.dispatchReceiverParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor getExtensionReceiverParameter() {
        return this.extensionReceiverParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor getInitialSignatureDescriptor() {
        return this.initialSignatureDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.kind;
        if (kind != null) {
            return kind;
        }
        $$$reportNull$$$0(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = this.modality;
        if (modality != null) {
            return modality;
        }
        $$$reportNull$$$0(15);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public FunctionDescriptor getOriginal() {
        FunctionDescriptor functionDescriptor = this.original;
        ?? r1 = this;
        if (functionDescriptor != this) {
            r1 = functionDescriptor.getOriginal();
        }
        if (r1 != 0) {
            return r1;
        }
        $$$reportNull$$$0(20);
        throw null;
    }

    public Collection<? extends FunctionDescriptor> getOverriddenDescriptors() {
        AnonymousClass1 anonymousClass1 = this.lazyOverriddenFunctionsTask;
        if (anonymousClass1 != null) {
            this.overriddenFunctions = (Collection) anonymousClass1.invoke();
            this.lazyOverriddenFunctionsTask = null;
        }
        Collection<? extends FunctionDescriptor> collection = this.overriddenFunctions;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        $$$reportNull$$$0(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.unsubstitutedReturnType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.typeParameters;
        if (list != null) {
            return list;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1(this, "typeParameters == null for ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V getUserData(CallableDescriptor.UserDataKey<V> userDataKey) {
        Map map = this.userDataMap;
        if (map == null) {
            return null;
        }
        return (V) map.get(userDataKey);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ValueParameterDescriptor> getValueParameters() {
        List<ValueParameterDescriptor> list = this.unsubstitutedValueParameters;
        if (list != null) {
            return list;
        }
        $$$reportNull$$$0(19);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.visibility;
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        $$$reportNull$$$0(16);
        throw null;
    }

    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames;
    }

    public FunctionDescriptorImpl initialize(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            $$$reportNull$$$0(5);
            throw null;
        }
        if (list2 == null) {
            $$$reportNull$$$0(6);
            throw null;
        }
        if (list3 == null) {
            $$$reportNull$$$0(7);
            throw null;
        }
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
        this.typeParameters = CollectionsKt.toList(list2);
        this.unsubstitutedValueParameters = CollectionsKt.toList(list3);
        this.unsubstitutedReturnType = kotlinType;
        this.modality = modality;
        this.visibility = descriptorVisibility;
        this.extensionReceiverParameter = receiverParameterDescriptor;
        this.dispatchReceiverParameter = receiverParameterDescriptor2;
        this.contextReceiverParameters = list;
        for (int i = 0; i < list2.size(); i++) {
            TypeParameterDescriptor typeParameterDescriptor = list2.get(i);
            if (typeParameterDescriptor.getIndex() != i) {
                StringBuilder sb = new StringBuilder();
                sb.append(typeParameterDescriptor);
                int index = typeParameterDescriptor.getIndex();
                sb.append(" index is ");
                sb.append(index);
                sb.append(" but position is ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            ValueParameterDescriptor valueParameterDescriptor = list3.get(i2);
            if (valueParameterDescriptor.getIndex() != i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(valueParameterDescriptor);
                int index2 = valueParameterDescriptor.getIndex();
                sb2.append("index is ");
                sb2.append(index2);
                sb2.append(" but position is ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
            }
        }
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.isActual;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.isExpect;
    }

    public boolean isExternal() {
        return this.isExternal;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return this.isHiddenForResolutionEverywhereBesideSupercalls;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isHiddenToOvercomeSignatureClash() {
        return this.isHiddenToOvercomeSignatureClash;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        if (this.isInfix) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            if (it.next().isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.isInline;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        if (this.isOperator) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            if (it.next().isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return this.isSuspend;
    }

    public boolean isTailrec() {
        return this.isTailrec;
    }

    public final CopyConfiguration newCopyBuilder(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return new CopyConfiguration(this, typeSubstitutor.getSubstitution(), getContainingDeclaration(), getModality(), getVisibility(), getKind(), getValueParameters(), getContextReceiverParameters(), getExtensionReceiverParameter(), getReturnType(), null);
        }
        $$$reportNull$$$0(24);
        throw null;
    }

    public <V> void putInUserDataMap(CallableDescriptor.UserDataKey<V> userDataKey, Object obj) {
        if (this.userDataMap == null) {
            this.userDataMap = new LinkedHashMap();
        }
        this.userDataMap.put(userDataKey, obj);
    }

    public void setActual(boolean z) {
        this.isActual = z;
    }

    public void setExpect(boolean z) {
        this.isExpect = z;
    }

    public void setExternal(boolean z) {
        this.isExternal = z;
    }

    public void setHasStableParameterNames(boolean z) {
        this.hasStableParameterNames = z;
    }

    public void setHasSynthesizedParameterNames(boolean z) {
        this.hasSynthesizedParameterNames = z;
    }

    public void setInfix(boolean z) {
        this.isInfix = z;
    }

    public void setInline(boolean z) {
        this.isInline = z;
    }

    public void setOperator(boolean z) {
        this.isOperator = z;
    }

    public void setOverriddenDescriptors(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            $$$reportNull$$$0(17);
            throw null;
        }
        this.overriddenFunctions = collection;
        Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
        while (it.hasNext()) {
            if (((FunctionDescriptor) it.next()).isHiddenForResolutionEverywhereBesideSupercalls()) {
                this.isHiddenForResolutionEverywhereBesideSupercalls = true;
                return;
            }
        }
    }

    public void setReturnType(KotlinType kotlinType) {
        if (kotlinType != null) {
            this.unsubstitutedReturnType = kotlinType;
        } else {
            $$$reportNull$$$0(11);
            throw null;
        }
    }

    public void setSuspend(boolean z) {
        this.isSuspend = z;
    }

    public void setTailrec(boolean z) {
        this.isTailrec = z;
    }

    public void setVisibility(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            this.visibility = descriptorVisibility;
        } else {
            $$$reportNull$$$0(10);
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$CopyConfiguration] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public FunctionDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.isEmpty() ? this : newCopyBuilder(typeSubstitutor).setOriginal((CallableMemberDescriptor) getOriginal()).setPreserveSourceElement().setJustForTypeSubstitution(true).build();
        }
        $$$reportNull$$$0(22);
        throw null;
    }

    public class CopyConfiguration implements FunctionDescriptor.CopyBuilder<FunctionDescriptor> {
        public Annotations additionalAnnotations;
        public boolean copyOverrides;
        public ReceiverParameterDescriptor dispatchReceiverParameter;
        public boolean dropOriginalInContainingParts;
        public boolean isHiddenForResolutionEverywhereBesideSupercalls;
        public boolean isHiddenToOvercomeSignatureClash;
        public boolean justForTypeSubstitution;
        public CallableMemberDescriptor.Kind kind;
        public Name name;
        public final List newContextReceiverParameters;
        public ReceiverParameterDescriptor newExtensionReceiverParameter;
        public Boolean newHasSynthesizedParameterNames;
        public Modality newModality;
        public DeclarationDescriptor newOwner;
        public KotlinType newReturnType;
        public List newTypeParameters;
        public List newValueParameterDescriptors;
        public DescriptorVisibility newVisibility;
        public FunctionDescriptor original;
        public boolean preserveSourceElement;
        public boolean signatureChange;
        public TypeSubstitution substitution;
        public final /* synthetic */ FunctionDescriptorImpl this$0;
        public final LinkedHashMap userDataMap;

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String str;
            int i2;
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i2 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i2 = 3;
                    break;
            }
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format2 = String.format(str, objArr);
            switch (i) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(format2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(format2);
            }
        }

        public CopyConfiguration(FunctionDescriptorImpl functionDescriptorImpl, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, List<ValueParameterDescriptor> list, List<ReceiverParameterDescriptor> list2, ReceiverParameterDescriptor receiverParameterDescriptor, KotlinType kotlinType, Name name) {
            if (typeSubstitution == null) {
                $$$reportNull$$$0(0);
                throw null;
            }
            if (declarationDescriptor == null) {
                $$$reportNull$$$0(1);
                throw null;
            }
            if (modality == null) {
                $$$reportNull$$$0(2);
                throw null;
            }
            if (descriptorVisibility == null) {
                $$$reportNull$$$0(3);
                throw null;
            }
            if (kind == null) {
                $$$reportNull$$$0(4);
                throw null;
            }
            if (list == null) {
                $$$reportNull$$$0(5);
                throw null;
            }
            if (list2 == null) {
                $$$reportNull$$$0(6);
                throw null;
            }
            if (kotlinType == null) {
                $$$reportNull$$$0(7);
                throw null;
            }
            this.this$0 = functionDescriptorImpl;
            this.original = null;
            this.dispatchReceiverParameter = functionDescriptorImpl.dispatchReceiverParameter;
            this.copyOverrides = true;
            this.signatureChange = false;
            this.preserveSourceElement = false;
            this.dropOriginalInContainingParts = false;
            this.isHiddenToOvercomeSignatureClash = functionDescriptorImpl.isHiddenToOvercomeSignatureClash();
            this.newTypeParameters = null;
            this.additionalAnnotations = null;
            this.isHiddenForResolutionEverywhereBesideSupercalls = functionDescriptorImpl.isHiddenForResolutionEverywhereBesideSupercalls();
            this.userDataMap = new LinkedHashMap();
            this.newHasSynthesizedParameterNames = null;
            this.justForTypeSubstitution = false;
            this.substitution = typeSubstitution;
            this.newOwner = declarationDescriptor;
            this.newModality = modality;
            this.newVisibility = descriptorVisibility;
            this.kind = kind;
            this.newValueParameterDescriptors = list;
            this.newContextReceiverParameters = list2;
            this.newExtensionReceiverParameter = receiverParameterDescriptor;
            this.newReturnType = kotlinType;
            this.name = name;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor build() {
            return this.this$0.doSubstitute(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public <V> FunctionDescriptor.CopyBuilder<FunctionDescriptor> putUserData(CallableDescriptor.UserDataKey<V> userDataKey, V v) {
            if (userDataKey != null) {
                this.userDataMap.put(userDataKey, v);
                return this;
            }
            $$$reportNull$$$0(39);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setAdditionalAnnotations(Annotations annotations) {
            if (annotations != null) {
                this.additionalAnnotations = annotations;
                return this;
            }
            $$$reportNull$$$0(35);
            throw null;
        }

        public CopyConfiguration setHasSynthesizedParameterNames(boolean z) {
            this.newHasSynthesizedParameterNames = Boolean.valueOf(z);
            return this;
        }

        public CopyConfiguration setJustForTypeSubstitution(boolean z) {
            this.justForTypeSubstitution = z;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setKind(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.kind = kind;
                return this;
            }
            $$$reportNull$$$0(14);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setModality(Modality modality) {
            if (modality != null) {
                this.newModality = modality;
                return this;
            }
            $$$reportNull$$$0(10);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setName(Name name) {
            if (name != null) {
                this.name = name;
                return this;
            }
            $$$reportNull$$$0(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setOwner(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor != null) {
                this.newOwner = declarationDescriptor;
                return this;
            }
            $$$reportNull$$$0(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setReturnType(KotlinType kotlinType) {
            if (kotlinType != null) {
                this.newReturnType = kotlinType;
                return this;
            }
            $$$reportNull$$$0(23);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setSubstitution(TypeSubstitution typeSubstitution) {
            if (typeSubstitution != null) {
                this.substitution = typeSubstitution;
                return this;
            }
            $$$reportNull$$$0(37);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: setTypeParameters, reason: avoid collision after fix types in other method */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setTypeParameters2(List<TypeParameterDescriptor> list) {
            if (list != null) {
                this.newTypeParameters = list;
                return this;
            }
            $$$reportNull$$$0(21);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: setValueParameters, reason: avoid collision after fix types in other method */
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setValueParameters2(List<ValueParameterDescriptor> list) {
            if (list != null) {
                this.newValueParameterDescriptors = list;
                return this;
            }
            $$$reportNull$$$0(19);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setVisibility(DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility != null) {
                this.newVisibility = descriptorVisibility;
                return this;
            }
            $$$reportNull$$$0(12);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setCopyOverrides(boolean z) {
            this.copyOverrides = z;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setDispatchReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.dispatchReceiverParameter = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setDropOriginalInContainingParts() {
            this.dropOriginalInContainingParts = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setExtensionReceiverParameter(ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.newExtensionReceiverParameter = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setHiddenForResolutionEverywhereBesideSupercalls() {
            this.isHiddenForResolutionEverywhereBesideSupercalls = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setHiddenToOvercomeSignatureClash() {
            this.isHiddenToOvercomeSignatureClash = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setOriginal(CallableMemberDescriptor callableMemberDescriptor) {
            this.original = (FunctionDescriptor) callableMemberDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setPreserveSourceElement() {
            this.preserveSourceElement = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor.CopyBuilder<FunctionDescriptor> setSignatureChange() {
            this.signatureChange = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public /* bridge */ /* synthetic */ FunctionDescriptor.CopyBuilder<FunctionDescriptor> setTypeParameters(List list) {
            return setTypeParameters2((List<TypeParameterDescriptor>) list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public /* bridge */ /* synthetic */ FunctionDescriptor.CopyBuilder<FunctionDescriptor> setValueParameters(List list) {
            return setValueParameters2((List<ValueParameterDescriptor>) list);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> newCopyBuilder() {
        return newCopyBuilder(TypeSubstitutor.EMPTY);
    }

    public static List<ValueParameterDescriptor> getSubstitutedValueParameters(FunctionDescriptor functionDescriptor, List<ValueParameterDescriptor> list, TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            $$$reportNull$$$0(28);
            throw null;
        }
        if (typeSubstitutor != null) {
            return getSubstitutedValueParameters(functionDescriptor, list, typeSubstitutor, false, false, null);
        }
        $$$reportNull$$$0(29);
        throw null;
    }
}
