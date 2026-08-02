package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check;

/* loaded from: classes9.dex */
public abstract class MemberKindCheck implements Check {
    public final String description;

    public static final class Member extends MemberKindCheck {
        public static final Member INSTANCE = new Member("must be a member function", null);

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return functionDescriptor.getDispatchReceiverParameter() != null;
        }
    }

    public static final class MemberOrExtension extends MemberKindCheck {
        public static final MemberOrExtension INSTANCE = new MemberOrExtension("must be a member or an extension function", null);

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public boolean check(FunctionDescriptor functionDescriptor) {
            functionDescriptor.getClass();
            return (functionDescriptor.getDispatchReceiverParameter() == null && functionDescriptor.getExtensionReceiverParameter() == null) ? false : true;
        }
    }

    public MemberKindCheck(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.description = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public String getDescription() {
        return this.description;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public /* bridge */ String invoke(FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
