package kotlin.reflect.jvm.internal;

import androidx.room.Room;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KType;
import kotlin.reflect.KVariance;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.types.DescriptorKType;

/* loaded from: classes3.dex */
public abstract class DescriptorKCallable extends ReflectKCallableImpl {
    public final ReflectProperties$LazySoftVal _allParameters;
    public final ReflectProperties$LazySoftVal _annotations;
    public final ReflectProperties$LazySoftVal _parameters;
    public final ReflectProperties$LazySoftVal _returnType;
    public final ReflectProperties$LazySoftVal _typeParameters;
    public final KCallableOverriddenStorage overriddenStorage;

    public DescriptorKCallable(KCallableOverriddenStorage kCallableOverriddenStorage) {
        kCallableOverriddenStorage.getClass();
        this.overriddenStorage = kCallableOverriddenStorage;
        final int i = 0;
        this._annotations = TuplesKt.lazySoft(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$0
            public final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DescriptorKCallable descriptorKCallable = this.arg$0;
                switch (i2) {
                    case 0:
                        return UtilKt.computeAnnotations(descriptorKCallable.getDescriptor());
                    case 1:
                        return descriptorKCallable.computeParameters(true);
                    case 2:
                        return Room.isBound(descriptorKCallable) ? descriptorKCallable.computeParameters(false) : descriptorKCallable.getAllParameters();
                    case 3:
                        KType f1521type = descriptorKCallable.overriddenStorage.typeSubstitutor.substitute(descriptorKCallable.computeReturnType(), KVariance.INVARIANT).getF1521type();
                        if (f1521type != null) {
                            return f1521type;
                        }
                        FakeOverridesKt.starProjectionInTopLevelTypeIsNotPossible(descriptorKCallable.getName());
                        throw null;
                    default:
                        List<TypeParameterDescriptor> typeParameters = descriptorKCallable.getDescriptor().getTypeParameters();
                        typeParameters.getClass();
                        List<TypeParameterDescriptor> list = typeParameters;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor : list) {
                            typeParameterDescriptor.getClass();
                            arrayList.add(new KTypeParameterImpl(descriptorKCallable, typeParameterDescriptor, descriptorKCallable.overriddenStorage.typeSubstitutor));
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        this._allParameters = TuplesKt.lazySoft(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$0
            public final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DescriptorKCallable descriptorKCallable = this.arg$0;
                switch (i22) {
                    case 0:
                        return UtilKt.computeAnnotations(descriptorKCallable.getDescriptor());
                    case 1:
                        return descriptorKCallable.computeParameters(true);
                    case 2:
                        return Room.isBound(descriptorKCallable) ? descriptorKCallable.computeParameters(false) : descriptorKCallable.getAllParameters();
                    case 3:
                        KType f1521type = descriptorKCallable.overriddenStorage.typeSubstitutor.substitute(descriptorKCallable.computeReturnType(), KVariance.INVARIANT).getF1521type();
                        if (f1521type != null) {
                            return f1521type;
                        }
                        FakeOverridesKt.starProjectionInTopLevelTypeIsNotPossible(descriptorKCallable.getName());
                        throw null;
                    default:
                        List<TypeParameterDescriptor> typeParameters = descriptorKCallable.getDescriptor().getTypeParameters();
                        typeParameters.getClass();
                        List<TypeParameterDescriptor> list = typeParameters;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor : list) {
                            typeParameterDescriptor.getClass();
                            arrayList.add(new KTypeParameterImpl(descriptorKCallable, typeParameterDescriptor, descriptorKCallable.overriddenStorage.typeSubstitutor));
                        }
                        return arrayList;
                }
            }
        });
        final int i3 = 2;
        this._parameters = TuplesKt.lazySoft(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$0
            public final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DescriptorKCallable descriptorKCallable = this.arg$0;
                switch (i22) {
                    case 0:
                        return UtilKt.computeAnnotations(descriptorKCallable.getDescriptor());
                    case 1:
                        return descriptorKCallable.computeParameters(true);
                    case 2:
                        return Room.isBound(descriptorKCallable) ? descriptorKCallable.computeParameters(false) : descriptorKCallable.getAllParameters();
                    case 3:
                        KType f1521type = descriptorKCallable.overriddenStorage.typeSubstitutor.substitute(descriptorKCallable.computeReturnType(), KVariance.INVARIANT).getF1521type();
                        if (f1521type != null) {
                            return f1521type;
                        }
                        FakeOverridesKt.starProjectionInTopLevelTypeIsNotPossible(descriptorKCallable.getName());
                        throw null;
                    default:
                        List<TypeParameterDescriptor> typeParameters = descriptorKCallable.getDescriptor().getTypeParameters();
                        typeParameters.getClass();
                        List<TypeParameterDescriptor> list = typeParameters;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor : list) {
                            typeParameterDescriptor.getClass();
                            arrayList.add(new KTypeParameterImpl(descriptorKCallable, typeParameterDescriptor, descriptorKCallable.overriddenStorage.typeSubstitutor));
                        }
                        return arrayList;
                }
            }
        });
        final int i4 = 3;
        this._returnType = TuplesKt.lazySoft(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$0
            public final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                DescriptorKCallable descriptorKCallable = this.arg$0;
                switch (i22) {
                    case 0:
                        return UtilKt.computeAnnotations(descriptorKCallable.getDescriptor());
                    case 1:
                        return descriptorKCallable.computeParameters(true);
                    case 2:
                        return Room.isBound(descriptorKCallable) ? descriptorKCallable.computeParameters(false) : descriptorKCallable.getAllParameters();
                    case 3:
                        KType f1521type = descriptorKCallable.overriddenStorage.typeSubstitutor.substitute(descriptorKCallable.computeReturnType(), KVariance.INVARIANT).getF1521type();
                        if (f1521type != null) {
                            return f1521type;
                        }
                        FakeOverridesKt.starProjectionInTopLevelTypeIsNotPossible(descriptorKCallable.getName());
                        throw null;
                    default:
                        List<TypeParameterDescriptor> typeParameters = descriptorKCallable.getDescriptor().getTypeParameters();
                        typeParameters.getClass();
                        List<TypeParameterDescriptor> list = typeParameters;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor : list) {
                            typeParameterDescriptor.getClass();
                            arrayList.add(new KTypeParameterImpl(descriptorKCallable, typeParameterDescriptor, descriptorKCallable.overriddenStorage.typeSubstitutor));
                        }
                        return arrayList;
                }
            }
        });
        final int i5 = 4;
        this._typeParameters = TuplesKt.lazySoft(null, new Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$0
            public final DescriptorKCallable arg$0;

            {
                this.arg$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DescriptorKCallable descriptorKCallable = this.arg$0;
                switch (i22) {
                    case 0:
                        return UtilKt.computeAnnotations(descriptorKCallable.getDescriptor());
                    case 1:
                        return descriptorKCallable.computeParameters(true);
                    case 2:
                        return Room.isBound(descriptorKCallable) ? descriptorKCallable.computeParameters(false) : descriptorKCallable.getAllParameters();
                    case 3:
                        KType f1521type = descriptorKCallable.overriddenStorage.typeSubstitutor.substitute(descriptorKCallable.computeReturnType(), KVariance.INVARIANT).getF1521type();
                        if (f1521type != null) {
                            return f1521type;
                        }
                        FakeOverridesKt.starProjectionInTopLevelTypeIsNotPossible(descriptorKCallable.getName());
                        throw null;
                    default:
                        List<TypeParameterDescriptor> typeParameters = descriptorKCallable.getDescriptor().getTypeParameters();
                        typeParameters.getClass();
                        List<TypeParameterDescriptor> list = typeParameters;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        for (TypeParameterDescriptor typeParameterDescriptor : list) {
                            typeParameterDescriptor.getClass();
                            arrayList.add(new KTypeParameterImpl(descriptorKCallable, typeParameterDescriptor, descriptorKCallable.overriddenStorage.typeSubstitutor));
                        }
                        return arrayList;
                }
            }
        });
    }

    public final ArrayList computeParameters(boolean z) {
        Pair pair;
        Collection collection;
        CallableMemberDescriptor descriptor = getDescriptor();
        ArrayList arrayList = new ArrayList();
        final int i = 0;
        if (z) {
            final ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(this);
            if (instanceReceiverParameter != null) {
                arrayList.add(new DescriptorKParameter(this, arrayList.size(), KParameter$Kind.INSTANCE, new Function0(instanceReceiverParameter, i) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$5
                    public final /* synthetic */ int $r8$classId;
                    public final ReceiverParameterDescriptor arg$0;

                    {
                        this.$r8$classId = i;
                        this.arg$0 = instanceReceiverParameter;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2 = this.$r8$classId;
                        return this.arg$0;
                    }
                }));
            }
            if (descriptor instanceof DeserializedSimpleFunctionDescriptor) {
                DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = (DeserializedSimpleFunctionDescriptor) descriptor;
                pair = new Pair(deserializedSimpleFunctionDescriptor.getNameResolver(), deserializedSimpleFunctionDescriptor.getProto().getContextParameterList());
            } else if (descriptor instanceof DeserializedPropertyDescriptor) {
                DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) descriptor;
                pair = new Pair(deserializedPropertyDescriptor.getNameResolver(), deserializedPropertyDescriptor.getProto().getContextParameterList());
            } else {
                if (descriptor instanceof PropertyAccessorDescriptor) {
                    PropertyDescriptor correspondingProperty = ((PropertyAccessorDescriptor) descriptor).getCorrespondingProperty();
                    DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = correspondingProperty instanceof DeserializedPropertyDescriptor ? (DeserializedPropertyDescriptor) correspondingProperty : null;
                    if (deserializedPropertyDescriptor2 != null) {
                        pair = new Pair(deserializedPropertyDescriptor2.getNameResolver(), deserializedPropertyDescriptor2.getProto().getContextParameterList());
                    }
                }
                pair = null;
            }
            if (pair == null) {
                collection = EmptyList.INSTANCE;
            } else {
                NameResolver nameResolver = (NameResolver) pair.first;
                List list = (List) pair.second;
                List<ReceiverParameterDescriptor> contextReceiverParameters = descriptor.getContextReceiverParameters();
                contextReceiverParameters.getClass();
                List<ReceiverParameterDescriptor> list2 = contextReceiverParameters;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                int i2 = 0;
                for (Object obj : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) obj;
                    ArrayList arrayList3 = arrayList2;
                    Annotations annotations = receiverParameterDescriptor.getAnnotations();
                    Name guessByFirstCharacter = Name.guessByFirstCharacter(nameResolver.getString(((ProtoBuf.ValueParameter) list.get(i2)).getName()));
                    guessByFirstCharacter.getClass();
                    KotlinType type2 = receiverParameterDescriptor.getType();
                    type2.getClass();
                    SourceElement source = receiverParameterDescriptor.getSource();
                    source.getClass();
                    arrayList3.add(new ValueParameterDescriptorImpl(descriptor, null, i2, annotations, guessByFirstCharacter, type2, false, false, false, null, source));
                    arrayList2 = arrayList3;
                    i2 = i3;
                    list = list;
                    nameResolver = nameResolver;
                }
                collection = arrayList2;
            }
            int size = collection.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new DescriptorKParameter(this, arrayList.size(), KParameter$Kind.CONTEXT, new DescriptorKCallable$$Lambda$6(collection, i4, i)));
            }
            final ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                final int i5 = 1;
                arrayList.add(new DescriptorKParameter(this, arrayList.size(), KParameter$Kind.EXTENSION_RECEIVER, new Function0(extensionReceiverParameter, i5) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$5
                    public final /* synthetic */ int $r8$classId;
                    public final ReceiverParameterDescriptor arg$0;

                    {
                        this.$r8$classId = i5;
                        this.arg$0 = extensionReceiverParameter;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i22 = this.$r8$classId;
                        return this.arg$0;
                    }
                }));
            }
        }
        int size2 = descriptor.getValueParameters().size();
        while (i < size2) {
            arrayList.add(new DescriptorKParameter(this, arrayList.size(), KParameter$Kind.VALUE, new DescriptorKCallable$$Lambda$6(descriptor, i, 4)));
            i++;
        }
        if (Room.isAnnotationConstructor(this) && (descriptor instanceof JavaCallableMemberDescriptor)) {
            int i6 = 1;
            if (arrayList.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new CovariantOverrideComparator(i6));
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public abstract DescriptorKType computeReturnType();

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final List getAllParameters() {
        Object invoke = this._allParameters.invoke();
        invoke.getClass();
        return (List) invoke;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final List getAnnotations() {
        Object invoke = this._annotations.invoke();
        invoke.getClass();
        return (List) invoke;
    }

    public abstract CallableMemberDescriptor getDescriptor();

    public final Modality getModality$kotlin_reflection() {
        Modality modality = this.overriddenStorage.modality;
        if (modality != null) {
            return modality;
        }
        Modality modality2 = getDescriptor().getModality();
        modality2.getClass();
        return modality2;
    }

    @Override // kotlin.reflect.KCallable
    public final List getParameters() {
        Object invoke = this._parameters.invoke();
        invoke.getClass();
        return (List) invoke;
    }

    @Override // kotlin.reflect.KCallable
    public final KType getReturnType() {
        Object invoke = this._returnType.invoke();
        invoke.getClass();
        return (KType) invoke;
    }

    @Override // kotlin.reflect.KCallable
    public final List getTypeParameters() {
        Object invoke = this._typeParameters.invoke();
        invoke.getClass();
        return (List) invoke;
    }

    @Override // kotlin.reflect.KCallable
    public final KVisibility getVisibility() {
        DescriptorVisibility visibility = getDescriptor().getVisibility();
        visibility.getClass();
        return UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isAbstract() {
        return getModality$kotlin_reflection() == Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isFinal() {
        return getModality$kotlin_reflection() == Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isOpen() {
        return getModality$kotlin_reflection() == Modality.OPEN;
    }

    public abstract DescriptorKCallable shallowCopy$kotlin_reflection(KCallableOverriddenStorage kCallableOverriddenStorage);
}
