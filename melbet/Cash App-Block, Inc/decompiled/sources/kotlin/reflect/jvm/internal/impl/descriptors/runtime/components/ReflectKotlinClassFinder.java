package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;

/* loaded from: classes9.dex */
public final class ReflectKotlinClassFinder implements KotlinClassFinder {
    public final BuiltInsResourceLoader builtInsResourceLoader;
    public final ClassLoader classLoader;

    public ReflectKotlinClassFinder(ClassLoader classLoader) {
        classLoader.getClass();
        this.classLoader = classLoader;
        this.builtInsResourceLoader = new BuiltInsResourceLoader();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder
    public InputStream findBuiltInsData(FqName fqName) {
        fqName.getClass();
        if (!fqName.startsWith(StandardNames.BUILT_INS_PACKAGE_NAME)) {
            return null;
        }
        return this.builtInsResourceLoader.loadResource(BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public KotlinClassFinder.Result findKotlinClassOrContent(JavaClass javaClass, MetadataVersion metadataVersion) {
        String asString;
        Class<?> tryLoadClass;
        ReflectKotlinClass create;
        javaClass.getClass();
        metadataVersion.getClass();
        FqName fqName = javaClass.getFqName();
        if (fqName == null || (asString = fqName.asString()) == null || (tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.classLoader, asString)) == null || (create = ReflectKotlinClass.Factory.create(tryLoadClass)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(create, null, 2, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public KotlinClassFinder.Result findKotlinClassOrContent(ClassId classId, MetadataVersion metadataVersion) {
        ReflectKotlinClass create;
        classId.getClass();
        metadataVersion.getClass();
        Class<?> tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.classLoader, ReflectKotlinClassFinderKt.access$toRuntimeFqName(classId));
        if (tryLoadClass == null || (create = ReflectKotlinClass.Factory.create(tryLoadClass)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(create, null, 2, null);
    }
}
