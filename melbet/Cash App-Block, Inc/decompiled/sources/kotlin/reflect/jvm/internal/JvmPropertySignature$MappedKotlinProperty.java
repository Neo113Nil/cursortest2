package kotlin.reflect.jvm.internal;

import com.google.crypto.tink.subtle.Hkdf;

/* loaded from: classes9.dex */
public final class JvmPropertySignature$MappedKotlinProperty extends Hkdf {
    public final JvmFunctionSignature$KotlinFunction getterSignature;
    public final JvmFunctionSignature$KotlinFunction setterSignature;

    public JvmPropertySignature$MappedKotlinProperty(JvmFunctionSignature$KotlinFunction jvmFunctionSignature$KotlinFunction, JvmFunctionSignature$KotlinFunction jvmFunctionSignature$KotlinFunction2) {
        this.getterSignature = jvmFunctionSignature$KotlinFunction;
        this.setterSignature = jvmFunctionSignature$KotlinFunction2;
    }

    @Override // com.google.crypto.tink.subtle.Hkdf
    public final String asString() {
        return this.getterSignature._signature;
    }
}
