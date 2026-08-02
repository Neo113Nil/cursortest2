package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public final class CloneableClassScope extends GivenFunctionsMemberScope {
    public static final Name CLONE_NAME;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Name getCLONE_NAME() {
            return CloneableClassScope.CLONE_NAME;
        }
    }

    static {
        Name identifier = Name.identifier("clone");
        identifier.getClass();
        CLONE_NAME = identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloneableClassScope(StorageManager storageManager, ClassDescriptor classDescriptor) {
        super(storageManager, classDescriptor);
        storageManager.getClass();
        classDescriptor.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final List computeDeclaredFunctions() {
        Annotations empty = Annotations.Companion.getEMPTY();
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        ClassDescriptor classDescriptor = this.containingClass;
        SimpleFunctionDescriptorImpl create = SimpleFunctionDescriptorImpl.create(classDescriptor, empty, CLONE_NAME, kind, sourceElement);
        ReceiverParameterDescriptor thisAsReceiverParameter = classDescriptor.getThisAsReceiverParameter();
        EmptyList emptyList = EmptyList.INSTANCE;
        create.initialize((ReceiverParameterDescriptor) null, thisAsReceiverParameter, (List<ReceiverParameterDescriptor>) emptyList, (List<? extends TypeParameterDescriptor>) emptyList, (List<ValueParameterDescriptor>) emptyList, (KotlinType) DescriptorUtilsKt.getBuiltIns(classDescriptor).getAnyType(), Modality.OPEN, DescriptorVisibilities.PROTECTED);
        return CollectionsKt__CollectionsJVMKt.listOf(create);
    }
}
