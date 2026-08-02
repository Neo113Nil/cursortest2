package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;

/* loaded from: classes9.dex */
public final class LazyScopeAdapter$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Function0 arg$0;

    public /* synthetic */ LazyScopeAdapter$$Lambda$0(int i, Function0 function0) {
        this.$r8$classId = i;
        this.arg$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function0 function0 = this.arg$0;
        switch (i) {
            case 0:
                MemberScope memberScope = (MemberScope) function0.invoke();
                return memberScope instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScope).getActualScope() : memberScope;
            default:
                KProperty[] kPropertyArr = DeserializedMemberScope.$$delegatedProperties;
                return CollectionsKt.toSet((Iterable) function0.invoke());
        }
    }
}
