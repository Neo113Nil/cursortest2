package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes9.dex */
public final class FunctionClassScope extends GivenFunctionsMemberScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassScope(StorageManager storageManager, FunctionClassDescriptor functionClassDescriptor) {
        super(storageManager, functionClassDescriptor);
        storageManager.getClass();
        functionClassDescriptor.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final List computeDeclaredFunctions() {
        ClassDescriptor classDescriptor = this.containingClass;
        classDescriptor.getClass();
        FunctionTypeKind functionTypeKind = ((FunctionClassDescriptor) classDescriptor).getFunctionTypeKind();
        return Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.Function.INSTANCE) ? CollectionsKt__CollectionsJVMKt.listOf(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) classDescriptor, false)) : Intrinsics.areEqual(functionTypeKind, FunctionTypeKind.SuspendFunction.INSTANCE) ? CollectionsKt__CollectionsJVMKt.listOf(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) classDescriptor, true)) : EmptyList.INSTANCE;
    }
}
