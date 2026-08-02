package kotlin.reflect.jvm.internal;

import com.google.crypto.tink.subtle.Hkdf;
import com.squareup.cash.integration.analytics.UtilsKt;
import java.lang.reflect.Method;

/* loaded from: classes9.dex */
public final class JvmPropertySignature$JavaMethodProperty extends Hkdf {
    public final Method getterMethod;
    public final Method setterMethod;

    public JvmPropertySignature$JavaMethodProperty(Method method, Method method2) {
        method.getClass();
        this.getterMethod = method;
        this.setterMethod = method2;
    }

    @Override // com.google.crypto.tink.subtle.Hkdf
    public final String asString() {
        return UtilsKt.access$getSignature(this.getterMethod);
    }
}
