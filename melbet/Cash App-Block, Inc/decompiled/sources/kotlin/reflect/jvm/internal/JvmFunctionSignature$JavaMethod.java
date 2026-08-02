package kotlin.reflect.jvm.internal;

import com.google.crypto.tink.subtle.Bytes;
import com.squareup.cash.integration.analytics.UtilsKt;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class JvmFunctionSignature$JavaMethod extends Bytes {
    public final Method method;

    public JvmFunctionSignature$JavaMethod(Method method) {
        this.method = method;
    }

    @Override // com.google.crypto.tink.subtle.Bytes
    public final String asString() {
        return UtilsKt.access$getSignature(this.method);
    }
}
