package kotlin.reflect.jvm.internal;

import com.google.crypto.tink.subtle.Bytes;
import java.lang.reflect.Constructor;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes9.dex */
public final class JvmFunctionSignature$JavaConstructor extends Bytes {
    public final Constructor constructor;

    public JvmFunctionSignature$JavaConstructor(Constructor constructor) {
        constructor.getClass();
        this.constructor = constructor;
    }

    @Override // com.google.crypto.tink.subtle.Bytes
    public final String asString() {
        Class<?>[] parameterTypes = this.constructor.getParameterTypes();
        parameterTypes.getClass();
        return ArraysKt___ArraysKt.joinToString$default(parameterTypes, "", "<init>(", ")V", UtilKt$$Lambda$0.INSTANCE$11, 24);
    }
}
