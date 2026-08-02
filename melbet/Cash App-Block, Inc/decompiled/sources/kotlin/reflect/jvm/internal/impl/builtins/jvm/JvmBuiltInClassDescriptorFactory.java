package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes9.dex */
public final class JvmBuiltInClassDescriptorFactory implements ClassDescriptorFactory {
    public static final ClassId CLONEABLE_CLASS_ID;
    public static final Name CLONEABLE_NAME;
    public final NotNullLazyValue cloneable$delegate;
    public final Function1 computeContainingDeclaration;
    public final ModuleDescriptor moduleDescriptor;
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {new PropertyReference1Impl(JvmBuiltInClassDescriptorFactory.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};
    public static final Companion Companion = new Companion(null);
    public static final FqName KOTLIN_FQ_NAME = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ClassId getCLONEABLE_CLASS_ID() {
            return JvmBuiltInClassDescriptorFactory.CLONEABLE_CLASS_ID;
        }
    }

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames.cloneable;
        CLONEABLE_NAME = fqNameUnsafe.shortName();
        CLONEABLE_CLASS_ID = ClassId.Companion.topLevel(fqNameUnsafe.toSafe());
    }

    public JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1<? super ModuleDescriptor, ? extends DeclarationDescriptor> function1) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        function1.getClass();
        this.moduleDescriptor = moduleDescriptor;
        this.computeContainingDeclaration = function1;
        this.cloneable$delegate = storageManager.createLazyValue(new KClassImpl$Data$$Lambda$22(14, this, storageManager));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public ClassDescriptor createClass(ClassId classId) {
        classId.getClass();
        if (!classId.equals(CLONEABLE_CLASS_ID)) {
            return null;
        }
        return (ClassDescriptorImpl) StorageKt.getValue(this.cloneable$delegate, this, $$delegatedProperties[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName fqName) {
        fqName.getClass();
        if (!fqName.equals(KOTLIN_FQ_NAME)) {
            return EmptySet.INSTANCE;
        }
        return SetsKt__SetsJVMKt.setOf((ClassDescriptorImpl) StorageKt.getValue(this.cloneable$delegate, this, $$delegatedProperties[0]));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public boolean shouldCreateClass(FqName fqName, Name name) {
        fqName.getClass();
        name.getClass();
        return Intrinsics.areEqual(name, CLONEABLE_NAME) && Intrinsics.areEqual(fqName, KOTLIN_FQ_NAME);
    }

    public /* synthetic */ JvmBuiltInClassDescriptorFactory(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, (i & 4) != 0 ? JvmBuiltInClassDescriptorFactory$$Lambda$1.INSTANCE : function1);
    }
}
