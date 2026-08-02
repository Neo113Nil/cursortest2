package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes9.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {
    public final ClassLoader classLoader;

    public ReflectJavaClassFinder(ClassLoader classLoader) {
        classLoader.getClass();
        this.classLoader = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public JavaClass findClass(JavaClassFinder.Request request) {
        request.getClass();
        ClassId classId = request.getClassId();
        FqName packageFqName = classId.getPackageFqName();
        String replace = StringsKt__StringsJVMKt.replace(classId.getRelativeClassName().asString(), '.', '$', false);
        if (!packageFqName.isRoot()) {
            replace = packageFqName.asString() + '.' + replace;
        }
        Class<?> tryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(this.classLoader, replace);
        if (tryLoadClass != null) {
            return new ReflectJavaClass(tryLoadClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public JavaPackage findPackage(FqName fqName, boolean z) {
        fqName.getClass();
        return new ReflectJavaPackage(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    public Set<String> knownClassNamesInPackage(FqName fqName) {
        fqName.getClass();
        return null;
    }
}
