package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes9.dex */
public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {
    public final FqName fqName;

    public ReflectJavaPackage(FqName fqName) {
        fqName.getClass();
        this.fqName = fqName;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaPackage) && Intrinsics.areEqual(getFqName(), ((ReflectJavaPackage) obj).getFqName());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public JavaAnnotation findAnnotation(FqName fqName) {
        fqName.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public Collection<JavaClass> getClasses(Function1<? super Name, Boolean> function1) {
        function1.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public FqName getFqName() {
        return this.fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public Collection<JavaPackage> getSubPackages() {
        return EmptyList.INSTANCE;
    }

    public int hashCode() {
        return getFqName().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public String toString() {
        return ReflectJavaPackage.class.getName() + ": " + getFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<JavaAnnotation> getAnnotations() {
        return EmptyList.INSTANCE;
    }
}
