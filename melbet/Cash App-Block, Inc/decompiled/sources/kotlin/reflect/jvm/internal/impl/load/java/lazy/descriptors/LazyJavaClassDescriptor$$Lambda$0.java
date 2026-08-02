package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class LazyJavaClassDescriptor$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final LazyJavaClassDescriptor arg$0;

    public /* synthetic */ LazyJavaClassDescriptor$$Lambda$0(LazyJavaClassDescriptor lazyJavaClassDescriptor, int i) {
        this.$r8$classId = i;
        this.arg$0 = lazyJavaClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.arg$0;
        switch (i) {
            case 0:
                LazyJavaClassDescriptor.Companion companion = LazyJavaClassDescriptor.Companion;
                ClassId classId = DescriptorUtilsKt.getClassId(lazyJavaClassDescriptor);
                if (classId != null) {
                    return lazyJavaClassDescriptor.outerContext.getComponents().getJavaModuleResolver().getAnnotationsForModuleOwnerOfClass(classId);
                }
                return null;
            case 1:
                JavaClass javaClass = lazyJavaClassDescriptor.jClass;
                List<JavaTypeParameter> typeParameters = javaClass.getTypeParameters();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(typeParameters, 10));
                for (JavaTypeParameter javaTypeParameter : typeParameters) {
                    TypeParameterDescriptor resolveTypeParameter = lazyJavaClassDescriptor.c.getTypeParameterResolver().resolveTypeParameter(javaTypeParameter);
                    if (resolveTypeParameter == null) {
                        f$$ExternalSyntheticLambda0.m(javaTypeParameter, " surely belongs to class ", javaClass, ", so it must be resolved", "Parameter ");
                        return null;
                    }
                    arrayList.add(resolveTypeParameter);
                }
                return arrayList;
            default:
                return TypeParameterUtilsKt.computeConstructorTypeParameters(lazyJavaClassDescriptor);
        }
    }
}
