package kotlin.reflect.jvm.internal;

import com.google.crypto.tink.subtle.Bytes;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;

/* loaded from: classes9.dex */
public final class JvmFunctionSignature$FakeJavaAnnotationConstructor extends Bytes {
    public final List methods;

    public JvmFunctionSignature$FakeJavaAnnotationConstructor(Class cls) {
        cls.getClass();
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        this.methods = ArraysKt___ArraysKt.sortedWith(declaredMethods, new CovariantOverrideComparator(2));
    }

    @Override // com.google.crypto.tink.subtle.Bytes
    public final String asString() {
        return CollectionsKt.joinToString$default(this.methods, "", "<init>(", ")V", 0, null, UtilKt$$Lambda$0.INSTANCE$10, 24);
    }
}
