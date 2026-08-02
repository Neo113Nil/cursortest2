package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* loaded from: classes9.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String format2;
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 3 || i == 4) ? 2 : 3];
        if (i != 1) {
            if (i == 2) {
                objArr[0] = "classifier";
            } else if (i != 3 && i != 4) {
                objArr[0] = "storageManager";
            }
            if (i != 1) {
                objArr[1] = "getBuiltIns";
            } else if (i == 3 || i == 4) {
                objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "isSameClassifier";
                } else if (i != 3 && i != 4) {
                    objArr[2] = "<init>";
                }
            }
            format2 = String.format(str, objArr);
            if (i == 1 && i != 3 && i != 4) {
                throw new IllegalArgumentException(format2);
            }
            throw new IllegalStateException(format2);
        }
        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i != 1) {
        }
        if (i != 1) {
        }
        format2 = String.format(str, objArr);
        if (i == 1) {
        }
        throw new IllegalStateException(format2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(StorageManager storageManager) {
        super(storageManager);
        if (storageManager != null) {
        } else {
            $$$reportNull$$$0(0);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final KotlinType defaultSupertypeIfEmpty() {
        if (KotlinBuiltIns.isSpecialClassWithNoSupertypes(mo4153getDeclarationDescriptor())) {
            return null;
        }
        return getBuiltIns().getAnyType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    public final Collection getAdditionalNeighboursInSupertypeGraph(boolean z) {
        DeclarationDescriptor containingDeclaration = mo4153getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            List list = Collections.EMPTY_LIST;
            if (list != null) {
                return list;
            }
            $$$reportNull$$$0(3);
            throw null;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        smartList.add(classDescriptor.getDefaultType());
        ClassDescriptor mo4141getCompanionObjectDescriptor = classDescriptor.mo4141getCompanionObjectDescriptor();
        if (z && mo4141getCompanionObjectDescriptor != null) {
            smartList.add(mo4141getCompanionObjectDescriptor.getDefaultType());
        }
        return smartList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(mo4153getDeclarationDescriptor());
        if (builtIns != null) {
            return builtIns;
        }
        $$$reportNull$$$0(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public abstract ClassDescriptor mo4153getDeclarationDescriptor();

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r4).getFqName(), ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r5).getFqName()) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070 A[RETURN] */
    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isSameClassifier(ClassifierDescriptor classifierDescriptor) {
        boolean z;
        if (classifierDescriptor instanceof ClassDescriptor) {
            ClassDescriptor mo4153getDeclarationDescriptor = mo4153getDeclarationDescriptor();
            mo4153getDeclarationDescriptor.getClass();
            if (Intrinsics.areEqual(mo4153getDeclarationDescriptor.getName(), classifierDescriptor.getName())) {
                DeclarationDescriptor containingDeclaration = mo4153getDeclarationDescriptor.getContainingDeclaration();
                DeclarationDescriptor containingDeclaration2 = classifierDescriptor.getContainingDeclaration();
                while (true) {
                    if (containingDeclaration != null && containingDeclaration2 != null) {
                        if (!(containingDeclaration instanceof ModuleDescriptor)) {
                            if (!(containingDeclaration2 instanceof ModuleDescriptor)) {
                                if (!(containingDeclaration instanceof PackageFragmentDescriptor)) {
                                    if ((containingDeclaration2 instanceof PackageFragmentDescriptor) || !Intrinsics.areEqual(containingDeclaration.getName(), containingDeclaration2.getName())) {
                                        break;
                                    }
                                    containingDeclaration = containingDeclaration.getContainingDeclaration();
                                    containingDeclaration2 = containingDeclaration2.getContainingDeclaration();
                                } else if (containingDeclaration2 instanceof PackageFragmentDescriptor) {
                                }
                            } else {
                                break;
                            }
                        } else {
                            z = containingDeclaration2 instanceof ModuleDescriptor;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = true;
                if (!z) {
                    return true;
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }
}
