package com.stripe.android.stripe3ds2.transaction;

import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.security.DefaultMessageTransformer;
import com.stripe.android.stripe3ds2.security.StripeDiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor$Config;
import java.io.Serializable;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes8.dex */
public final class StripeChallengeRequestExecutor$Factory implements Serializable {
    public final ChallengeRequestExecutor$Config config;

    public StripeChallengeRequestExecutor$Factory(ChallengeRequestExecutor$Config challengeRequestExecutor$Config) {
        challengeRequestExecutor$Config.getClass();
        this.config = challengeRequestExecutor$Config;
    }

    public final StripeTransaction create(DefaultErrorReporter defaultErrorReporter, CoroutineContext coroutineContext) {
        Object failure;
        Object failure2;
        Object failure3;
        defaultErrorReporter.getClass();
        coroutineContext.getClass();
        defaultErrorReporter.getClass();
        ToolbarTuckTargets toolbarTuckTargets = new ToolbarTuckTargets();
        toolbarTuckTargets.startCornerCenterX$delegate = defaultErrorReporter;
        try {
            Result.Companion companion = Result.Companion;
            failure = KeyFactory.getInstance("EC");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            ((DefaultErrorReporter) toolbarTuckTargets.startCornerCenterX$delegate).reportError(m4120exceptionOrNullimpl);
        }
        Throwable m4120exceptionOrNullimpl2 = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl2 != null) {
            throw new SDKRuntimeException(m4120exceptionOrNullimpl2);
        }
        failure.getClass();
        toolbarTuckTargets.endCornerCenterX$delegate = (KeyFactory) failure;
        KeyFactory keyFactory = (KeyFactory) toolbarTuckTargets.endCornerCenterX$delegate;
        ChallengeRequestExecutor$Config challengeRequestExecutor$Config = this.config;
        DefaultMessageTransformer defaultMessageTransformer = challengeRequestExecutor$Config.messageTransformer;
        String str = challengeRequestExecutor$Config.sdkReferenceId;
        ChallengeRequestExecutor$Config.Keys keys = challengeRequestExecutor$Config.keys;
        byte[] bArr = keys.sdkPrivateKeyEncoded;
        bArr.getClass();
        try {
            Result.Companion companion3 = Result.Companion;
            PrivateKey generatePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr));
            generatePrivate.getClass();
            failure2 = (ECPrivateKey) generatePrivate;
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            failure2 = new Result.Failure(th2);
        }
        Throwable m4120exceptionOrNullimpl3 = Result.m4120exceptionOrNullimpl(failure2);
        if (m4120exceptionOrNullimpl3 != null) {
            throw new SDKRuntimeException(m4120exceptionOrNullimpl3);
        }
        ECPrivateKey eCPrivateKey = (ECPrivateKey) failure2;
        byte[] bArr2 = keys.acsPublicKeyEncoded;
        bArr2.getClass();
        try {
            PublicKey generatePublic = keyFactory.generatePublic(new X509EncodedKeySpec(bArr2));
            generatePublic.getClass();
            failure3 = (ECPublicKey) generatePublic;
        } catch (Throwable th3) {
            Result.Companion companion5 = Result.Companion;
            failure3 = new Result.Failure(th3);
        }
        Throwable m4120exceptionOrNullimpl4 = Result.m4120exceptionOrNullimpl(failure3);
        if (m4120exceptionOrNullimpl4 != null) {
            ((DefaultErrorReporter) toolbarTuckTargets.startCornerCenterX$delegate).reportError(m4120exceptionOrNullimpl4);
        }
        Throwable m4120exceptionOrNullimpl5 = Result.m4120exceptionOrNullimpl(failure3);
        if (m4120exceptionOrNullimpl5 == null) {
            return new StripeTransaction(defaultMessageTransformer, str, eCPrivateKey, (ECPublicKey) failure3, challengeRequestExecutor$Config.acsUrl, defaultErrorReporter, new StripeDiffieHellmanKeyGenerator(defaultErrorReporter), coroutineContext, this.config);
        }
        throw new SDKRuntimeException(m4120exceptionOrNullimpl5);
    }
}
