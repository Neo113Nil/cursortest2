package com.stripe.android.stripe3ds2.security;

import com.nimbusds.jose.crypto.impl.ECDH;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import com.squareup.scannerview.SizeMap;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import java.io.Serializable;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.SecretKey;
import kotlin.Result;
import kotlin.reflect.TypesJVMKt;

/* loaded from: classes5.dex */
public final class StripeDiffieHellmanKeyGenerator implements Serializable {
    public final DefaultErrorReporter errorReporter;

    public StripeDiffieHellmanKeyGenerator(DefaultErrorReporter defaultErrorReporter) {
        defaultErrorReporter.getClass();
        this.errorReporter = defaultErrorReporter;
    }

    public final SecretKey generate(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey, String str) {
        Object failure;
        eCPublicKey.getClass();
        str.getClass();
        try {
            Result.Companion companion = Result.Companion;
            failure = new SizeMap(11).deriveKey(ECDH.deriveSharedSecret(eCPrivateKey, eCPublicKey), SizeMap.encodeDataWithLength(null), SizeMap.encodeDataWithLength(null), SizeMap.encodeDataWithLength(Base64URL.encode(str.getBytes(StandardCharset.UTF_8)).decode()), TypesJVMKt.toBytes(256), new byte[0]);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            this.errorReporter.reportError(m4120exceptionOrNullimpl);
        }
        Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl2 == null) {
            return (SecretKey) failure;
        }
        throw new SDKRuntimeException(m4120exceptionOrNullimpl2);
    }
}
