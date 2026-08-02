package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;

/* loaded from: classes9.dex */
public final class KotlinJvmBinaryPackageSourceElement implements SourceElement {
    public final LazyJavaPackageFragment packageFragment;

    public KotlinJvmBinaryPackageSourceElement(LazyJavaPackageFragment lazyJavaPackageFragment) {
        lazyJavaPackageFragment.getClass();
        this.packageFragment = lazyJavaPackageFragment;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile sourceFile = SourceFile.NO_SOURCE_FILE;
        sourceFile.getClass();
        return sourceFile;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        LazyJavaPackageFragment lazyJavaPackageFragment = this.packageFragment;
        sb.append(lazyJavaPackageFragment);
        sb.append(": ");
        sb.append(lazyJavaPackageFragment.getBinaryClasses$descriptors_jvm().keySet());
        return sb.toString();
    }
}
