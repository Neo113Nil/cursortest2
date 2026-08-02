package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import radiography.Radiography$renderScannableViewTree$1$2;

/* loaded from: classes9.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {
    public final BuiltInsResourceLoader resourceLoader = new BuiltInsResourceLoader();

    public final PackageFragmentProvider createBuiltInPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Set<FqName> set, Iterable<? extends ClassDescriptorFactory> iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z, Function1<? super String, ? extends InputStream> function1) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        set.getClass();
        iterable.getClass();
        platformDependentDeclarationFilter.getClass();
        additionalClassPartsProvider.getClass();
        function1.getClass();
        ArrayList arrayList = new ArrayList();
        for (FqName fqName : set) {
            InputStream inputStream = (InputStream) function1.invoke(BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName));
            BuiltInsPackageFragmentImpl create = inputStream != null ? BuiltInsPackageFragmentImpl.Companion.create(fqName, storageManager, moduleDescriptor, inputStream, z) : null;
            if (create != null) {
                arrayList.add(create);
            }
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(storageManager, moduleDescriptor);
        DeserializationConfiguration.Default r3 = DeserializationConfiguration.Default.INSTANCE;
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProviderImpl);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.INSTANCE;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, builtInSerializerProtocol);
        LocalClassifierTypeSettings.Default r7 = LocalClassifierTypeSettings.Default.INSTANCE;
        ErrorReporter errorReporter = ErrorReporter.DO_NOTHING;
        errorReporter.getClass();
        DeserializationComponents deserializationComponents = new DeserializationComponents(storageManager, moduleDescriptor, r3, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProviderImpl, r7, errorReporter, LookupTracker.DO_NOTHING.INSTANCE, FlexibleTypeDeserializer.ThrowException.INSTANCE, iterable, notFoundClasses, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.getExtensionRegistry(), null, new SamConversionResolverImpl(storageManager, EmptyList.INSTANCE), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BuiltInsPackageFragmentImpl) it.next()).initialize(deserializationComponents);
        }
        return packageFragmentProviderImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public PackageFragmentProvider createPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor moduleDescriptor, Iterable<? extends ClassDescriptorFactory> iterable, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z) {
        storageManager.getClass();
        moduleDescriptor.getClass();
        iterable.getClass();
        platformDependentDeclarationFilter.getClass();
        additionalClassPartsProvider.getClass();
        return createBuiltInPackageFragmentProvider(storageManager, moduleDescriptor, StandardNames.BUILT_INS_PACKAGE_FQ_NAMES, iterable, platformDependentDeclarationFilter, additionalClassPartsProvider, z, new Radiography$renderScannableViewTree$1$2(1, this.resourceLoader, BuiltInsResourceLoader.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, 3));
    }
}
