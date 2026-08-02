package kotlin.reflect.jvm.internal;

import com.google.crypto.tink.subtle.Bytes;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;

/* loaded from: classes9.dex */
public final class JvmFunctionSignature$KotlinFunction extends Bytes {
    public final String _signature;
    public final JvmMemberSignature.Method signature;

    public JvmFunctionSignature$KotlinFunction(JvmMemberSignature.Method method) {
        this.signature = method;
        this._signature = method.asString();
    }

    @Override // com.google.crypto.tink.subtle.Bytes
    public final String asString() {
        return this._signature;
    }
}
