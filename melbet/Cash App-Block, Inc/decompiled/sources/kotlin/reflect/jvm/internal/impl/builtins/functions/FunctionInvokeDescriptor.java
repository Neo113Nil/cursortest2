package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;

/* loaded from: classes9.dex */
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {
    public static final Factory Factory = new Factory(null);

    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final FunctionInvokeDescriptor create(FunctionClassDescriptor functionClassDescriptor, boolean z) {
            String lowerCase;
            functionClassDescriptor.getClass();
            List<TypeParameterDescriptor> declaredTypeParameters = functionClassDescriptor.getDeclaredTypeParameters();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClassDescriptor, null, CallableMemberDescriptor.Kind.DECLARATION, z, null);
            ReceiverParameterDescriptor thisAsReceiverParameter = functionClassDescriptor.getThisAsReceiverParameter();
            EmptyList emptyList = EmptyList.INSTANCE;
            ArrayList arrayList = new ArrayList();
            for (Object obj : declaredTypeParameters) {
                if (((TypeParameterDescriptor) obj).getVariance() != Variance.IN_VARIANCE) {
                    break;
                }
                arrayList.add(obj);
            }
            IndexingIterable withIndex = CollectionsKt.withIndex(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(withIndex, 10));
            Iterator it = withIndex.iterator();
            while (true) {
                ArrayIterator arrayIterator = (ArrayIterator) it;
                if (!((Iterator) arrayIterator.f1520array).hasNext()) {
                    functionInvokeDescriptor.initialize((ReceiverParameterDescriptor) null, thisAsReceiverParameter, (List<ReceiverParameterDescriptor>) emptyList, (List<? extends TypeParameterDescriptor>) emptyList, (List<ValueParameterDescriptor>) arrayList2, (KotlinType) ((TypeParameterDescriptor) CollectionsKt.last((List) declaredTypeParameters)).getDefaultType(), Modality.ABSTRACT, DescriptorVisibilities.PUBLIC);
                    functionInvokeDescriptor.setHasSynthesizedParameterNames(true);
                    return functionInvokeDescriptor;
                }
                IndexedValue indexedValue = (IndexedValue) arrayIterator.next();
                Factory factory = FunctionInvokeDescriptor.Factory;
                int i = indexedValue.index;
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) indexedValue.value;
                factory.getClass();
                String asString = typeParameterDescriptor.getName().asString();
                asString.getClass();
                if (asString.equals("T")) {
                    lowerCase = "instance";
                } else if (asString.equals("E")) {
                    lowerCase = "receiver";
                } else {
                    lowerCase = asString.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                }
                FunctionInvokeDescriptor functionInvokeDescriptor2 = functionInvokeDescriptor;
                Annotations empty = Annotations.Companion.getEMPTY();
                Name identifier = Name.identifier(lowerCase);
                identifier.getClass();
                SimpleType defaultType = typeParameterDescriptor.getDefaultType();
                defaultType.getClass();
                SourceElement sourceElement = SourceElement.NO_SOURCE;
                sourceElement.getClass();
                functionInvokeDescriptor = functionInvokeDescriptor2;
                arrayList2.add(new ValueParameterDescriptorImpl(functionInvokeDescriptor2, null, i, empty, identifier, defaultType, false, false, false, null, sourceElement));
            }
        }
    }

    public FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.Companion.getEMPTY(), OperatorNameConventions.INVOKE, kind, SourceElement.NO_SOURCE);
        setOperator(true);
        setSuspend(z);
        setHasStableParameterNames(false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        declarationDescriptor.getClass();
        kind.getClass();
        annotations.getClass();
        return new FunctionInvokeDescriptor(declarationDescriptor, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl$CopyConfiguration] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public final FunctionDescriptorImpl doSubstitute(FunctionDescriptorImpl.CopyConfiguration copyConfiguration) {
        Name name;
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.doSubstitute(copyConfiguration);
        if (functionInvokeDescriptor == 0) {
            return null;
        }
        List<ValueParameterDescriptor> valueParameters = functionInvokeDescriptor.getValueParameters();
        valueParameters.getClass();
        List<ValueParameterDescriptor> list = valueParameters;
        if ((list instanceof Collection) && list.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type2 = ((ValueParameterDescriptor) it.next()).getType();
            type2.getClass();
            if (FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type2) != null) {
                List<ValueParameterDescriptor> valueParameters2 = functionInvokeDescriptor.getValueParameters();
                valueParameters2.getClass();
                List<ValueParameterDescriptor> list2 = valueParameters2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    KotlinType type3 = ((ValueParameterDescriptor) it2.next()).getType();
                    type3.getClass();
                    arrayList.add(FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(type3));
                }
                int size = functionInvokeDescriptor.getValueParameters().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List<ValueParameterDescriptor> valueParameters3 = functionInvokeDescriptor.getValueParameters();
                    valueParameters3.getClass();
                    ArrayList zip = CollectionsKt.zip(arrayList, valueParameters3);
                    if (zip.isEmpty()) {
                        return functionInvokeDescriptor;
                    }
                    Iterator it3 = zip.iterator();
                    while (it3.hasNext()) {
                        Pair pair = (Pair) it3.next();
                        if (!Intrinsics.areEqual((Name) pair.first, ((ValueParameterDescriptor) pair.second).getName())) {
                        }
                    }
                    return functionInvokeDescriptor;
                }
                List<ValueParameterDescriptor> valueParameters4 = functionInvokeDescriptor.getValueParameters();
                valueParameters4.getClass();
                List<ValueParameterDescriptor> list3 = valueParameters4;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (ValueParameterDescriptor valueParameterDescriptor : list3) {
                    Name name2 = valueParameterDescriptor.getName();
                    name2.getClass();
                    int index = valueParameterDescriptor.getIndex();
                    int i = index - size;
                    if (i >= 0 && (name = (Name) arrayList.get(i)) != null) {
                        name2 = name;
                    }
                    arrayList2.add(valueParameterDescriptor.copy(functionInvokeDescriptor, name2, index));
                }
                FunctionDescriptorImpl.CopyConfiguration newCopyBuilder = functionInvokeDescriptor.newCopyBuilder(TypeSubstitutor.EMPTY);
                if (!arrayList.isEmpty()) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((Name) it4.next()) == null) {
                            break;
                        }
                    }
                }
                z = false;
                ?? original = newCopyBuilder.setHasSynthesizedParameterNames(z).setValueParameters2((List<ValueParameterDescriptor>) arrayList2).setOriginal((CallableMemberDescriptor) functionInvokeDescriptor.getOriginal());
                original.getClass();
                FunctionDescriptorImpl doSubstitute = super.doSubstitute(original);
                doSubstitute.getClass();
                return doSubstitute;
            }
        }
        return functionInvokeDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isTailrec() {
        return false;
    }

    public /* synthetic */ FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z);
    }
}
