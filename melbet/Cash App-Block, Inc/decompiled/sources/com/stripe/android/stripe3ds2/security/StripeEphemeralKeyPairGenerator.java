package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.jwk.Curve;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;
import kotlin.Result;

/* loaded from: classes5.dex */
public final class StripeEphemeralKeyPairGenerator {
    public static final String ALGORITHM;
    public final DefaultErrorReporter errorReporter;

    static {
        Algorithm[] algorithmArr = Algorithm.$VALUES;
        ALGORITHM = "EC";
    }

    public StripeEphemeralKeyPairGenerator(DefaultErrorReporter defaultErrorReporter) {
        this.errorReporter = defaultErrorReporter;
    }

    public final KeyPair generate() {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM);
            keyPairGenerator.initialize(new ECGenParameterSpec(Curve.P_256.stdName));
            failure = keyPairGenerator.generateKeyPair();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            this.errorReporter.reportError(m4120exceptionOrNullimpl);
        }
        Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl2 != null) {
            throw new SDKRuntimeException(m4120exceptionOrNullimpl2);
        }
        failure.getClass();
        return (KeyPair) failure;
    }
}
