package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes9.dex */
public final /* synthetic */ class ReflectJavaClass$fields$1 extends FunctionReferenceImpl implements Function1 {
    public static final ReflectJavaClass$fields$1 INSTANCE = new ReflectJavaClass$fields$1(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        member.getClass();
        return Boolean.valueOf(member.isSynthetic());
    }
}
