package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

/* loaded from: classes9.dex */
public final class MemberScope$Companion$$Lambda$0 implements Function1 {
    public static final MemberScope$Companion$$Lambda$0 INSTANCE = new MemberScope$Companion$$Lambda$0(0);
    public static final MemberScope$Companion$$Lambda$0 INSTANCE$1 = new MemberScope$Companion$$Lambda$0(1);
    public static final MemberScope$Companion$$Lambda$0 INSTANCE$2 = new MemberScope$Companion$$Lambda$0(2);
    public static final MemberScope$Companion$$Lambda$0 INSTANCE$3 = new MemberScope$Companion$$Lambda$0(3);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MemberScope$Companion$$Lambda$0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Name) obj).getClass();
                return Boolean.TRUE;
            case 1:
                SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj;
                TypeIntersectionScope.Companion companion = TypeIntersectionScope.Companion;
                simpleFunctionDescriptor.getClass();
                return simpleFunctionDescriptor;
            case 2:
                PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
                TypeIntersectionScope.Companion companion2 = TypeIntersectionScope.Companion;
                propertyDescriptor.getClass();
                return propertyDescriptor;
            default:
                CallableDescriptor callableDescriptor = (CallableDescriptor) obj;
                TypeIntersectionScope.Companion companion3 = TypeIntersectionScope.Companion;
                callableDescriptor.getClass();
                return callableDescriptor;
        }
    }
}
