package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes9.dex */
public final class LazyJavaScope$$Lambda$9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final LazyJavaScope$$Lambda$9 INSTANCE$1 = new LazyJavaScope$$Lambda$9(1);
    public static final LazyJavaScope$$Lambda$9 INSTANCE = new LazyJavaScope$$Lambda$9(0);
    public static final LazyJavaScope$$Lambda$9 INSTANCE$2 = new LazyJavaScope$$Lambda$9(2);
    public static final LazyJavaScope$$Lambda$9 INSTANCE$3 = new LazyJavaScope$$Lambda$9(3);
    public static final LazyJavaScope$$Lambda$9 INSTANCE$4 = new LazyJavaScope$$Lambda$9(4);

    public /* synthetic */ LazyJavaScope$$Lambda$9(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
                KProperty[] kPropertyArr = LazyJavaScope.$$delegatedProperties;
                simpleFunctionDescriptor.getClass();
                return simpleFunctionDescriptor;
            case 1:
                int i = LazyJavaClassMemberScope.$r8$clinit;
                ((JavaMember) obj).getClass();
                return Boolean.valueOf(!r1.isStatic());
            case 2:
                JavaMember javaMember = (JavaMember) obj;
                int i2 = LazyJavaStaticClassScope.$r8$clinit;
                javaMember.getClass();
                return Boolean.valueOf(javaMember.isStatic());
            case 3:
                MemberScope memberScope = (MemberScope) obj;
                int i3 = LazyJavaStaticClassScope.$r8$clinit;
                memberScope.getClass();
                return memberScope.getVariableNames();
            default:
                int i4 = LazyJavaStaticClassScope.$r8$clinit;
                ClassifierDescriptor mo4153getDeclarationDescriptor = ((KotlinType) obj).getConstructor().mo4153getDeclarationDescriptor();
                if (mo4153getDeclarationDescriptor instanceof ClassDescriptor) {
                    return (ClassDescriptor) mo4153getDeclarationDescriptor;
                }
                return null;
        }
    }
}
