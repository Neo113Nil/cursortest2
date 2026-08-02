package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;

/* loaded from: classes9.dex */
public class JavaDescriptorVisibilities {
    public static final DescriptorVisibility PACKAGE_VISIBILITY;
    public static final DescriptorVisibility PROTECTED_AND_PACKAGE;
    public static final DescriptorVisibility PROTECTED_STATIC_VISIBILITY;
    public static final HashMap visibilitiesMapping;

    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(format2);
        }
        throw new IllegalStateException(format2);
    }

    static {
        DescriptorVisibilities.AnonymousClass1 anonymousClass1 = new DescriptorVisibilities.AnonymousClass1(JavaVisibilities.PackageVisibility.INSTANCE, 9);
        PACKAGE_VISIBILITY = anonymousClass1;
        DescriptorVisibilities.AnonymousClass1 anonymousClass12 = new DescriptorVisibilities.AnonymousClass1(JavaVisibilities.ProtectedStaticVisibility.INSTANCE, 10);
        PROTECTED_STATIC_VISIBILITY = anonymousClass12;
        DescriptorVisibilities.AnonymousClass1 anonymousClass13 = new DescriptorVisibilities.AnonymousClass1(JavaVisibilities.ProtectedAndPackage.INSTANCE, 11);
        PROTECTED_AND_PACKAGE = anonymousClass13;
        HashMap hashMap = new HashMap();
        visibilitiesMapping = hashMap;
        hashMap.put(anonymousClass1.getDelegate(), anonymousClass1);
        hashMap.put(anonymousClass12.getDelegate(), anonymousClass12);
        hashMap.put(anonymousClass13.getDelegate(), anonymousClass13);
    }

    public static boolean access$100(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(0);
            throw null;
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(1);
            throw null;
        }
        if (areInSamePackage(DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return DescriptorVisibilities.PROTECTED.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, false);
    }

    public static boolean areInSamePackage(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        PackageFragmentDescriptor packageFragmentDescriptor = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, PackageFragmentDescriptor.class, false);
        PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, PackageFragmentDescriptor.class, false);
        return (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.getFqName().equals(packageFragmentDescriptor2.getFqName())) ? false : true;
    }

    public static DescriptorVisibility toDescriptorVisibility(Visibility visibility) {
        if (visibility == null) {
            $$$reportNull$$$0(4);
            throw null;
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) visibilitiesMapping.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        DescriptorVisibility descriptorVisibility2 = DescriptorVisibilities.toDescriptorVisibility(visibility);
        if (descriptorVisibility2 != null) {
            return descriptorVisibility2;
        }
        $$$reportNull$$$0(5);
        throw null;
    }
}
