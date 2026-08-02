package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public interface AdditionalClassPartsProvider {

    public static final class None implements AdditionalClassPartsProvider {
        public static final None INSTANCE = new None();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<ClassConstructorDescriptor> getConstructors(ClassDescriptor classDescriptor) {
            classDescriptor.getClass();
            return EmptyList.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<SimpleFunctionDescriptor> getFunctions(Name name, ClassDescriptor classDescriptor) {
            name.getClass();
            classDescriptor.getClass();
            return EmptyList.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<Name> getFunctionsNames(ClassDescriptor classDescriptor) {
            classDescriptor.getClass();
            return EmptyList.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        public Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor) {
            classDescriptor.getClass();
            return EmptyList.INSTANCE;
        }
    }

    Collection<ClassConstructorDescriptor> getConstructors(ClassDescriptor classDescriptor);

    Collection<SimpleFunctionDescriptor> getFunctions(Name name, ClassDescriptor classDescriptor);

    Collection<Name> getFunctionsNames(ClassDescriptor classDescriptor);

    Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor);
}
