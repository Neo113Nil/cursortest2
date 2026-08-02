package com.squareup.encryption;

import com.google.crypto.tink.hybrid.HybridConfig;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final /* synthetic */ class EllipticCurveEncryptionEngine$$ExternalSyntheticLambda0 implements UnaryOperator {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        HybridConfig.register();
        return Boolean.TRUE;
    }
}
