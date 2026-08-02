package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes9.dex */
public class DescriptorVisibilities {
    public static final ReceiverValue ALWAYS_SUITABLE_RECEIVER;
    public static final DescriptorVisibility DEFAULT_VISIBILITY;

    @Deprecated
    public static final ReceiverValue FALSE_IF_PROTECTED;
    public static final DescriptorVisibility INHERITED;
    public static final DescriptorVisibility INTERNAL;
    public static final DescriptorVisibility INVISIBLE_FAKE;
    public static final Set<DescriptorVisibility> INVISIBLE_FROM_OTHER_MODULES;
    public static final SourceFile.AnonymousClass1 IRRELEVANT_RECEIVER;
    public static final DescriptorVisibility LOCAL;
    public static final ModuleVisibilityHelper MODULE_VISIBILITY_HELPER;
    public static final DescriptorVisibility PRIVATE;
    public static final DescriptorVisibility PRIVATE_TO_THIS;
    public static final DescriptorVisibility PROTECTED;
    public static final DescriptorVisibility PUBLIC;
    public static final DescriptorVisibility UNKNOWN;
    public static final HashMap visibilitiesMapping;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities$1, reason: invalid class name */
    public final class AnonymousClass1 extends DelegatedDescriptorVisibility {
        public final /* synthetic */ int $r8$classId;

        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "what";
            } else if (i != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i == 1 || i == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$1(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$10(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$11(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$2(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i == 2 || i == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$3(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$4(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$5(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$6(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$7(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$8(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public static /* synthetic */ void $$$reportNull$$$0$9(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "from";
            } else if (i == 2) {
                objArr[0] = "fromPackage";
            } else if (i != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i == 2 || i == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Visibility visibility, int i) {
            super(visibility);
            this.$r8$classId = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:111:0x0124, code lost:
        
            if (kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(r0) == false) goto L122;
         */
        /* JADX WARN: Code restructure failed: missing block: B:171:0x01c2, code lost:
        
            if (kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.inSameFile(r9, r10) != false) goto L172;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:182:0x01dd A[ADDED_TO_REGION, LOOP:1: B:182:0x01dd->B:186:0x0205, LOOP_START, PHI: r10
          0x01dd: PHI (r10v1 kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) = 
          (r10v0 kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor)
          (r10v2 kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor)
         binds: [B:181:0x01da, B:186:0x0205] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
        /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r9v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        /* JADX WARN: Type inference failed for: r9v3, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
            DeclarationDescriptor parentOfType;
            ClassDescriptor classDescriptor;
            switch (this.$r8$classId) {
                case 0:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0(1);
                        throw null;
                    }
                    if (declarationDescriptor == null) {
                        $$$reportNull$$$0(2);
                        throw null;
                    }
                    if (DescriptorUtils.isTopLevelDeclaration(declarationDescriptorWithVisibility)) {
                        if (declarationDescriptor == null) {
                            $$$reportNull$$$0(0);
                            throw null;
                        }
                        if (DescriptorUtils.getContainingSourceFile(declarationDescriptor) != SourceFile.NO_SOURCE_FILE) {
                            return DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor);
                        }
                    }
                    if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                        ClassifierDescriptorWithTypeParameters containingDeclaration = ((ConstructorDescriptor) declarationDescriptorWithVisibility).getContainingDeclaration();
                        if (z) {
                            if (DescriptorUtils.isSealedClass(containingDeclaration)) {
                                if (DescriptorUtils.isTopLevelDeclaration(containingDeclaration)) {
                                    if (declarationDescriptor instanceof ConstructorDescriptor) {
                                        if (DescriptorUtils.isTopLevelDeclaration(declarationDescriptor.getContainingDeclaration())) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (declarationDescriptorWithVisibility != 0) {
                        declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.getContainingDeclaration();
                        if ((!(declarationDescriptorWithVisibility instanceof ClassDescriptor) || DescriptorUtils.isCompanionObject(declarationDescriptorWithVisibility)) && !(declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor)) {
                        }
                        if (declarationDescriptorWithVisibility != 0) {
                            return false;
                        }
                        while (declarationDescriptor != null) {
                            if (declarationDescriptorWithVisibility != declarationDescriptor) {
                                if (!(declarationDescriptor instanceof PackageFragmentDescriptor)) {
                                    declarationDescriptor = declarationDescriptor.getContainingDeclaration();
                                } else if (!(declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) || !declarationDescriptorWithVisibility.getFqName().equals(((PackageFragmentDescriptor) declarationDescriptor).getFqName()) || !DescriptorUtils.areInSameModule(declarationDescriptor, declarationDescriptorWithVisibility)) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        return false;
                    }
                    if (declarationDescriptorWithVisibility != 0) {
                    }
                    break;
                case 1:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$1(0);
                        throw null;
                    }
                    if (declarationDescriptor == null) {
                        $$$reportNull$$$0$1(1);
                        throw null;
                    }
                    if (!DescriptorVisibilities.PRIVATE.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, z)) {
                        return false;
                    }
                    if (receiverValue == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                        return true;
                    }
                    if (receiverValue == DescriptorVisibilities.IRRELEVANT_RECEIVER || (parentOfType = DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class)) == null || !(receiverValue instanceof ThisClassReceiver)) {
                        return false;
                    }
                    return ((ThisClassReceiver) receiverValue).getClassDescriptor().getOriginal().equals(parentOfType.getOriginal());
                case 2:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$2(0);
                        throw null;
                    }
                    if (declarationDescriptor == null) {
                        $$$reportNull$$$0$2(1);
                        throw null;
                    }
                    ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class);
                    ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, ClassDescriptor.class, false);
                    if (classDescriptor3 == null) {
                        return false;
                    }
                    if (classDescriptor2 == null || !DescriptorUtils.isCompanionObject(classDescriptor2) || (classDescriptor = (ClassDescriptor) DescriptorUtils.getParentOfType(classDescriptor2, ClassDescriptor.class)) == null || !DescriptorUtils.isSubclass(classDescriptor3, classDescriptor)) {
                        DeclarationDescriptorWithVisibility unwrapFakeOverrideToAnyDeclaration = DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility);
                        ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.getParentOfType(unwrapFakeOverrideToAnyDeclaration, ClassDescriptor.class);
                        if (classDescriptor4 == null) {
                            return false;
                        }
                        if (DescriptorUtils.isSubclass(classDescriptor3, classDescriptor4)) {
                            if (unwrapFakeOverrideToAnyDeclaration == null) {
                                $$$reportNull$$$0$2(2);
                                throw null;
                            }
                            if (receiverValue != DescriptorVisibilities.FALSE_IF_PROTECTED) {
                                if ((unwrapFakeOverrideToAnyDeclaration instanceof CallableMemberDescriptor) && !(unwrapFakeOverrideToAnyDeclaration instanceof ConstructorDescriptor) && receiverValue != DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                                    if (receiverValue != DescriptorVisibilities.IRRELEVANT_RECEIVER && receiverValue != null) {
                                        KotlinType thisType = receiverValue instanceof SuperCallReceiverValue ? ((SuperCallReceiverValue) receiverValue).getThisType() : receiverValue.getType();
                                        if (!DescriptorUtils.isSubtypeOfClass(thisType, classDescriptor3)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        return isVisible(receiverValue, declarationDescriptorWithVisibility, classDescriptor3.getContainingDeclaration(), z);
                    }
                    return true;
                case 3:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$3(0);
                        throw null;
                    }
                    if (declarationDescriptor == null) {
                        $$$reportNull$$$0$3(1);
                        throw null;
                    }
                    if (DescriptorUtils.getContainingModule(declarationDescriptor).shouldSeeInternalsOf(DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility))) {
                        return DescriptorVisibilities.MODULE_VISIBILITY_HELPER.isInFriendModule(declarationDescriptorWithVisibility, declarationDescriptor);
                    }
                    return false;
                case 4:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$4(0);
                        throw null;
                    }
                    if (declarationDescriptor != null) {
                        return true;
                    }
                    $$$reportNull$$$0$4(1);
                    throw null;
                case 5:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$5(0);
                        throw null;
                    }
                    if (declarationDescriptor != null) {
                        throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
                    }
                    $$$reportNull$$$0$5(1);
                    throw null;
                case 6:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$6(0);
                        throw null;
                    }
                    if (declarationDescriptor != null) {
                        throw new IllegalStateException("Visibility is unknown yet");
                    }
                    $$$reportNull$$$0$6(1);
                    throw null;
                case 7:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$7(0);
                        throw null;
                    }
                    if (declarationDescriptor != null) {
                        return false;
                    }
                    $$$reportNull$$$0$7(1);
                    throw null;
                case 8:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$8(0);
                        throw null;
                    }
                    if (declarationDescriptor != null) {
                        return false;
                    }
                    $$$reportNull$$$0$8(1);
                    throw null;
                case 9:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$9(0);
                        throw null;
                    }
                    if (declarationDescriptor != null) {
                        return JavaDescriptorVisibilities.areInSamePackage(declarationDescriptorWithVisibility, declarationDescriptor);
                    }
                    $$$reportNull$$$0$9(1);
                    throw null;
                case 10:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$10(0);
                        throw null;
                    }
                    if (declarationDescriptor != null) {
                        return JavaDescriptorVisibilities.access$100(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
                    }
                    $$$reportNull$$$0$10(1);
                    throw null;
                default:
                    if (declarationDescriptorWithVisibility == 0) {
                        $$$reportNull$$$0$11(0);
                        throw null;
                    }
                    if (declarationDescriptor != null) {
                        return JavaDescriptorVisibilities.access$100(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
                    }
                    $$$reportNull$$$0$11(1);
                    throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 16 ? 3 : 2];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i) {
                case 2:
                case 3:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case 4:
                case 5:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case 6:
                case 7:
                    objArr[2] = "inSameFile";
                    break;
                case 8:
                case 9:
                    objArr[2] = "findInvisibleMember";
                    break;
                case 10:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case 14:
                    objArr[2] = "isPrivate";
                    break;
                case 15:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case 16:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            String format2 = String.format(str, objArr);
            if (i != 16) {
                throw new IllegalStateException(format2);
            }
            throw new IllegalArgumentException(format2);
        }
        objArr[0] = "from";
        if (i == 16) {
        }
        switch (i) {
        }
        String format22 = String.format(str, objArr);
        if (i != 16) {
        }
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(Visibilities.Private.INSTANCE, 0);
        PRIVATE = anonymousClass1;
        AnonymousClass1 anonymousClass12 = new AnonymousClass1(Visibilities.PrivateToThis.INSTANCE, 1);
        PRIVATE_TO_THIS = anonymousClass12;
        AnonymousClass1 anonymousClass13 = new AnonymousClass1(Visibilities.Protected.INSTANCE, 2);
        PROTECTED = anonymousClass13;
        AnonymousClass1 anonymousClass14 = new AnonymousClass1(Visibilities.Internal.INSTANCE, 3);
        INTERNAL = anonymousClass14;
        AnonymousClass1 anonymousClass15 = new AnonymousClass1(Visibilities.Public.INSTANCE, 4);
        PUBLIC = anonymousClass15;
        AnonymousClass1 anonymousClass16 = new AnonymousClass1(Visibilities.Local.INSTANCE, 5);
        LOCAL = anonymousClass16;
        AnonymousClass1 anonymousClass17 = new AnonymousClass1(Visibilities.Inherited.INSTANCE, 6);
        INHERITED = anonymousClass17;
        AnonymousClass1 anonymousClass18 = new AnonymousClass1(Visibilities.InvisibleFake.INSTANCE, 7);
        INVISIBLE_FAKE = anonymousClass18;
        AnonymousClass1 anonymousClass19 = new AnonymousClass1(Visibilities.Unknown.INSTANCE, 8);
        UNKNOWN = anonymousClass19;
        INVISIBLE_FROM_OTHER_MODULES = Collections.unmodifiableSet(ArraysKt___ArraysKt.toSet(new DescriptorVisibility[]{anonymousClass1, anonymousClass12, anonymousClass14, anonymousClass16}));
        HashMap newHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(4);
        newHashMapWithExpectedSize.put(anonymousClass12, 0);
        newHashMapWithExpectedSize.put(anonymousClass1, 0);
        newHashMapWithExpectedSize.put(anonymousClass14, 1);
        newHashMapWithExpectedSize.put(anonymousClass13, 1);
        newHashMapWithExpectedSize.put(anonymousClass15, 2);
        Collections.unmodifiableMap(newHashMapWithExpectedSize);
        DEFAULT_VISIBILITY = anonymousClass15;
        IRRELEVANT_RECEIVER = new SourceFile.AnonymousClass1(1);
        ALWAYS_SUITABLE_RECEIVER = new SourceFile.AnonymousClass1(2);
        FALSE_IF_PROTECTED = new SourceFile.AnonymousClass1(3);
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        MODULE_VISIBILITY_HELPER = it.hasNext() ? (ModuleVisibilityHelper) it.next() : ModuleVisibilityHelper.EMPTY.INSTANCE;
        visibilitiesMapping = new HashMap();
        recordVisibilityMapping(anonymousClass1);
        recordVisibilityMapping(anonymousClass12);
        recordVisibilityMapping(anonymousClass13);
        recordVisibilityMapping(anonymousClass14);
        recordVisibilityMapping(anonymousClass15);
        recordVisibilityMapping(anonymousClass16);
        recordVisibilityMapping(anonymousClass17);
        recordVisibilityMapping(anonymousClass18);
        recordVisibilityMapping(anonymousClass19);
    }

    public static Integer compare(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(12);
            throw null;
        }
        if (descriptorVisibility2 == null) {
            $$$reportNull$$$0(13);
            throw null;
        }
        Integer compareTo = descriptorVisibility.compareTo(descriptorVisibility2);
        if (compareTo != null) {
            return compareTo;
        }
        Integer compareTo2 = descriptorVisibility2.compareTo(descriptorVisibility);
        if (compareTo2 != null) {
            return Integer.valueOf(-compareTo2.intValue());
        }
        return null;
    }

    public static DeclarationDescriptorWithVisibility findInvisibleMember(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
        DeclarationDescriptorWithVisibility findInvisibleMember;
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(8);
            throw null;
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(9);
            throw null;
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != LOCAL; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().isVisible(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) || (findInvisibleMember = findInvisibleMember(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor, z)) == null) {
            return null;
        }
        return findInvisibleMember;
    }

    public static boolean inSameFile(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(6);
            throw null;
        }
        if (declarationDescriptor2 == null) {
            $$$reportNull$$$0(7);
            throw null;
        }
        SourceFile containingSourceFile = DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        if (containingSourceFile != SourceFile.NO_SOURCE_FILE) {
            return containingSourceFile.equals(DescriptorUtils.getContainingSourceFile(declarationDescriptor));
        }
        return false;
    }

    public static boolean isPrivate(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility != null) {
            return descriptorVisibility == PRIVATE || descriptorVisibility == PRIVATE_TO_THIS;
        }
        $$$reportNull$$$0(14);
        throw null;
    }

    public static boolean isVisibleIgnoringReceiver(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(2);
            throw null;
        }
        if (declarationDescriptor != null) {
            return findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor, z) == null;
        }
        $$$reportNull$$$0(3);
        throw null;
    }

    public static void recordVisibilityMapping(DelegatedDescriptorVisibility delegatedDescriptorVisibility) {
        visibilitiesMapping.put(delegatedDescriptorVisibility.getDelegate(), delegatedDescriptorVisibility);
    }

    public static DescriptorVisibility toDescriptorVisibility(Visibility visibility) {
        if (visibility == null) {
            $$$reportNull$$$0(15);
            throw null;
        }
        DescriptorVisibility descriptorVisibility = (DescriptorVisibility) visibilitiesMapping.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) visibility, "Inapplicable visibility: ");
        return null;
    }
}
