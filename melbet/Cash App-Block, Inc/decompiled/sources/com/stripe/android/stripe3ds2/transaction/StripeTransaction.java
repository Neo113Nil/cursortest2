package com.stripe.android.stripe3ds2.transaction;

import androidx.emoji2.text.MetadataRepo;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.maps.zzai;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.security.DefaultMessageTransformer;
import com.stripe.android.stripe3ds2.security.StripeDiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.security.TransactionEncrypter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import java.io.Serializable;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import net.idrnd.face.iad.capture.internal.y0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class StripeTransaction {
    public final Object areqParamsFactory;
    public final Serializable directoryServerId;
    public final Object directoryServerKeyId;
    public final Object directoryServerPublicKey;
    public final Object sdkKeyPair;
    public final Serializable sdkTransactionId;

    public StripeTransaction(DefaultMessageTransformer defaultMessageTransformer, String str, ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey, String str2, DefaultErrorReporter defaultErrorReporter, StripeDiffieHellmanKeyGenerator stripeDiffieHellmanKeyGenerator, CoroutineContext coroutineContext, ChallengeRequestExecutor$Config challengeRequestExecutor$Config) {
        TextSetter textSetter = new TextSetter(str2, defaultErrorReporter, coroutineContext);
        defaultMessageTransformer.getClass();
        defaultErrorReporter.getClass();
        challengeRequestExecutor$Config.getClass();
        str.getClass();
        str2.getClass();
        coroutineContext.getClass();
        this.areqParamsFactory = defaultMessageTransformer;
        this.directoryServerId = defaultErrorReporter;
        this.directoryServerKeyId = coroutineContext;
        this.directoryServerPublicKey = textSetter;
        SecretKey generate = stripeDiffieHellmanKeyGenerator.generate(eCPublicKey, eCPrivateKey, str);
        this.sdkTransactionId = generate;
        defaultMessageTransformer.getClass();
        defaultErrorReporter.getClass();
        challengeRequestExecutor$Config.getClass();
        MetadataRepo metadataRepo = new MetadataRepo();
        metadataRepo.mMetadataList = defaultMessageTransformer;
        metadataRepo.mEmojiCharArray = generate;
        metadataRepo.mRootNode = defaultErrorReporter;
        metadataRepo.mTypeface = challengeRequestExecutor$Config;
        this.sdkKeyPair = metadataRepo;
    }

    public static final String access$getRequestBody(StripeTransaction stripeTransaction, JSONObject jSONObject) {
        DefaultMessageTransformer defaultMessageTransformer = (DefaultMessageTransformer) stripeTransaction.areqParamsFactory;
        SecretKey secretKey = (SecretKey) stripeTransaction.sdkTransactionId;
        defaultMessageTransformer.getClass();
        secretKey.getClass();
        String string2 = jSONObject.getString("acsTransID");
        string2.getClass();
        JWEAlgorithm jWEAlgorithm = JWEAlgorithm.DIR;
        EncryptionMethod encryptionMethod = DefaultMessageTransformer.ENCRYPTION_METHOD;
        if (jWEAlgorithm.name.equals(Algorithm.NONE.name)) {
            a$$ExternalSyntheticBUOutline0.m$3("The JWE algorithm \"alg\" cannot be \"none\"");
            return null;
        }
        Objects.requireNonNull(encryptionMethod);
        JWEHeader jWEHeader = new JWEHeader(jWEAlgorithm, encryptionMethod, null, null, null, null, null, null, null, null, null, string2, null, null, null, null, null, 0, null, null, null, null, null, null, null, null);
        jSONObject.put("sdkCounterStoA", String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(defaultMessageTransformer.counterSdkToAcs)}, 1)));
        JWEObject jWEObject = new JWEObject(jWEHeader, new Payload(jSONObject.toString()));
        EncryptionMethod encryptionMethod2 = jWEHeader.enc;
        encryptionMethod2.getClass();
        byte[] encoded = secretKey.getEncoded();
        EncryptionMethod encryptionMethod3 = EncryptionMethod.A128GCM;
        if (encryptionMethod3 == encryptionMethod2) {
            encoded = Arrays.copyOfRange(encoded, 0, encryptionMethod3.cekBitLength / 8);
            encoded.getClass();
        } else {
            encoded.getClass();
        }
        jWEObject.encrypt(new TransactionEncrypter(new SecretKeySpec(encoded, "AES")));
        byte b = (byte) (defaultMessageTransformer.counterSdkToAcs + 1);
        defaultMessageTransformer.counterSdkToAcs = b;
        if (b != 0) {
            return jWEObject.serialize();
        }
        a$$ExternalSyntheticBUOutline0.m$3("SDK to ACS counter is zero");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(ChallengeRequestData challengeRequestData, ContinuationImpl continuationImpl) {
        StripeChallengeRequestExecutor$execute$1 stripeChallengeRequestExecutor$execute$1;
        int i;
        ChallengeRequestResult challengeRequestResult;
        if (continuationImpl instanceof StripeChallengeRequestExecutor$execute$1) {
            stripeChallengeRequestExecutor$execute$1 = (StripeChallengeRequestExecutor$execute$1) continuationImpl;
            int i2 = stripeChallengeRequestExecutor$execute$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeChallengeRequestExecutor$execute$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeChallengeRequestExecutor$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeChallengeRequestExecutor$execute$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Logger$log$1 logger$log$1 = new Logger$log$1(this, challengeRequestData, continuation, 8);
                    stripeChallengeRequestExecutor$execute$1.L$0 = challengeRequestData;
                    stripeChallengeRequestExecutor$execute$1.label = 1;
                    obj = JobKt.withTimeoutOrNull(10000L, logger$log$1, stripeChallengeRequestExecutor$execute$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    challengeRequestData = stripeChallengeRequestExecutor$execute$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                challengeRequestResult = (ChallengeRequestResult) obj;
                if (challengeRequestResult == null) {
                    return challengeRequestResult;
                }
                SdkTransactionId sdkTransactionId = challengeRequestData.sdkTransId;
                String str = challengeRequestData.messageVersion;
                String str2 = challengeRequestData.acsTransId;
                String str3 = challengeRequestData.threeDsServerTransId;
                ProtocolError[] protocolErrorArr = ProtocolError.$VALUES;
                String valueOf = String.valueOf(402);
                y0 y0Var = ErrorData.ErrorComponent.Companion;
                return new ChallengeRequestResult.Timeout(new ErrorData(str3, str2, valueOf, "Transaction timed-out.", "Challenge request timed-out", "CReq", str, sdkTransactionId, 4));
            }
        }
        stripeChallengeRequestExecutor$execute$1 = new StripeChallengeRequestExecutor$execute$1(this, continuationImpl);
        Object obj2 = stripeChallengeRequestExecutor$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeChallengeRequestExecutor$execute$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        challengeRequestResult = (ChallengeRequestResult) obj2;
        if (challengeRequestResult == null) {
        }
    }

    public StripeTransaction(zzai zzaiVar, String str, PublicKey publicKey, String str2, SdkTransactionId sdkTransactionId, KeyPair keyPair) {
        str.getClass();
        publicKey.getClass();
        sdkTransactionId.getClass();
        keyPair.getClass();
        this.areqParamsFactory = zzaiVar;
        this.directoryServerId = str;
        this.directoryServerPublicKey = publicKey;
        this.directoryServerKeyId = str2;
        this.sdkTransactionId = sdkTransactionId;
        this.sdkKeyPair = keyPair;
    }
}
