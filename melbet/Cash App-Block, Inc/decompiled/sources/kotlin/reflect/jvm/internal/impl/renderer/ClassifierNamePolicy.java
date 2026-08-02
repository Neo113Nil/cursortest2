package kotlin.reflect.jvm.internal.impl.renderer;

import java.util.ArrayList;
import kotlin.collections.ReversedList;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* loaded from: classes9.dex */
public interface ClassifierNamePolicy {

    public static final class FULLY_QUALIFIED implements ClassifierNamePolicy {
        public static final FULLY_QUALIFIED INSTANCE = new FULLY_QUALIFIED();

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public String renderClassifier(ClassifierDescriptor classifierDescriptor, DescriptorRenderer descriptorRenderer) {
            classifierDescriptor.getClass();
            descriptorRenderer.getClass();
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                name.getClass();
                return descriptorRenderer.renderName(name, false);
            }
            FqNameUnsafe fqName = DescriptorUtils.getFqName(classifierDescriptor);
            fqName.getClass();
            return descriptorRenderer.renderFqName(fqName);
        }
    }

    public static final class SHORT implements ClassifierNamePolicy {
        public static final SHORT INSTANCE = new SHORT();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Named] */
        /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public String renderClassifier(ClassifierDescriptor classifierDescriptor, DescriptorRenderer descriptorRenderer) {
            classifierDescriptor.getClass();
            descriptorRenderer.getClass();
            if (classifierDescriptor instanceof TypeParameterDescriptor) {
                Name name = ((TypeParameterDescriptor) classifierDescriptor).getName();
                name.getClass();
                return descriptorRenderer.renderName(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifierDescriptor.getName());
                classifierDescriptor = classifierDescriptor.getContainingDeclaration();
            } while (classifierDescriptor instanceof ClassDescriptor);
            return RenderingUtilsKt.renderFqName(new ReversedList(arrayList));
        }
    }

    public static final class SOURCE_CODE_QUALIFIED implements ClassifierNamePolicy {
        public static final SOURCE_CODE_QUALIFIED INSTANCE = new SOURCE_CODE_QUALIFIED();

        public static String qualifiedNameForSourceCode(ClassifierDescriptor classifierDescriptor) {
            Name name = classifierDescriptor.getName();
            name.getClass();
            String str = null;
            String render$default = RenderingUtilsKt.render$default(name, false, 1, null);
            if (!(classifierDescriptor instanceof TypeParameterDescriptor)) {
                DeclarationDescriptor containingDeclaration = classifierDescriptor.getContainingDeclaration();
                containingDeclaration.getClass();
                if (containingDeclaration instanceof ClassDescriptor) {
                    str = qualifiedNameForSourceCode((ClassifierDescriptor) containingDeclaration);
                } else if (containingDeclaration instanceof PackageFragmentDescriptor) {
                    str = RenderingUtilsKt.render(((PackageFragmentDescriptor) containingDeclaration).getFqName().toUnsafe());
                }
                if (str != null && !str.equals("")) {
                    return str + '.' + render$default;
                }
            }
            return render$default;
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy
        public String renderClassifier(ClassifierDescriptor classifierDescriptor, DescriptorRenderer descriptorRenderer) {
            classifierDescriptor.getClass();
            descriptorRenderer.getClass();
            return qualifiedNameForSourceCode(classifierDescriptor);
        }
    }

    String renderClassifier(ClassifierDescriptor classifierDescriptor, DescriptorRenderer descriptorRenderer);
}
