package com.stripe.android.stripe3ds2.transaction;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObject;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.KeyTypeException;
import com.nimbusds.jose.crypto.ECDSAVerifier;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jose.crypto.RSASSAVerifier;
import com.nimbusds.jose.crypto.factories.DefaultJWSVerifierFactory;
import com.nimbusds.jose.crypto.impl.ECDSAProvider;
import com.nimbusds.jose.crypto.impl.MACProvider;
import com.nimbusds.jose.crypto.impl.RSASSAProvider;
import com.nimbusds.jose.jca.JCAContext;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.StandardCharset;
import com.nimbusds.jose.util.X509CertUtils;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import java.io.ByteArrayInputStream;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.SecretKey;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.full.KClasses$$Lambda$1;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class DefaultJwsValidator {
    public final DefaultErrorReporter errorReporter;
    public final boolean isLiveMode;
    public final ArrayList rootCerts;

    public DefaultJwsValidator(boolean z, ArrayList arrayList, DefaultErrorReporter defaultErrorReporter) {
        this.isLiveMode = z;
        this.rootCerts = arrayList;
        this.errorReporter = defaultErrorReporter;
    }

    public final JSONObject getPayload(String str) {
        str.getClass();
        Base64URL[] split = JOSEObject.split(str);
        if (split.length != 3) {
            JWK$$ExternalSyntheticBUOutline0.m$1("Unexpected number of Base64URL parts, must be three");
            return null;
        }
        JWSObject jWSObject = new JWSObject(split[0], split[1], split[2]);
        if (this.isLiveMode) {
            if (isValid(jWSObject, this.rootCerts)) {
                return new JSONObject(jWSObject.payload.toString());
            }
            a$$ExternalSyntheticBUOutline0.m$1("Could not validate JWS");
            return null;
        }
        JWSHeader jWSHeader = jWSObject.header;
        List list = jWSHeader.x5c;
        if (list == null || list.isEmpty()) {
            return new JSONObject(jWSObject.payload.toString());
        }
        List list2 = jWSHeader.x5c;
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str2 = ((Base64) it.next()).value;
            str2.getClass();
            Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(kotlin.io.encoding.Base64.decode$default(kotlin.io.encoding.Base64.Default, str2, 0, 6)));
            X509Certificate x509Certificate = generateCertificate instanceof X509Certificate ? (X509Certificate) generateCertificate : null;
            if (x509Certificate != null) {
                arrayList.add(x509Certificate);
            }
        }
        if (!arrayList.isEmpty() && isValid(jWSObject, arrayList)) {
            return new JSONObject(jWSObject.payload.toString());
        }
        a$$ExternalSyntheticBUOutline0.m$1("Could not validate JWS");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.nimbusds.jose.crypto.RSASSAVerifier] */
    /* JADX WARN: Type inference failed for: r3v23, types: [com.nimbusds.jose.crypto.MACVerifier] */
    public final boolean isValid(JWSObject jWSObject, ArrayList arrayList) {
        Object failure;
        ECDSAVerifier eCDSAVerifier;
        boolean verify;
        List list;
        JWSHeader jWSHeader = jWSObject.header;
        if (jWSHeader.jwk != null) {
            this.errorReporter.reportError(new IllegalArgumentException("Encountered a JWK in " + jWSHeader));
        }
        JWSHeader jWSHeader2 = jWSObject.header;
        jWSHeader2.getClass();
        JWSAlgorithm jWSAlgorithm = (JWSAlgorithm) jWSHeader2.alg;
        if (jWSAlgorithm.name.equals(Algorithm.NONE.name)) {
            a$$ExternalSyntheticBUOutline0.m$3("The JWS algorithm \"alg\" cannot be \"none\"");
            return false;
        }
        JWSHeader jWSHeader3 = new JWSHeader(jWSAlgorithm, jWSHeader2.typ, jWSHeader2.cty, jWSHeader2.crit, jWSHeader2.jku, null, jWSHeader2.x5u, jWSHeader2.x5t, jWSHeader2.x5t256, jWSHeader2.x5c, jWSHeader2.kid, jWSHeader2.b64, jWSHeader2.customParams, null);
        List list2 = jWSHeader3.x5c;
        try {
            Result.Companion companion = Result.Companion;
            list = list2;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("JWSHeader's X.509 certificate chain is null or empty");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Root certificates are empty");
        }
        KClasses$$Lambda$1.access$validateChain(arrayList, list2);
        failure = Unit.INSTANCE;
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
        if (m4120exceptionOrNullimpl != null) {
            this.errorReporter.reportError(m4120exceptionOrNullimpl);
        }
        if (failure instanceof Result.Failure) {
            return false;
        }
        JCAContext jCAContext = new DefaultJWSVerifierFactory().jcaContext;
        jCAContext.provider = Signature.getInstance(Intrinsics.areEqual((JWSAlgorithm) jWSHeader3.alg, JWSAlgorithm.ES256) ? "SHA256withECDSA" : "SHA256withRSA").getProvider();
        List list3 = jWSHeader3.x5c;
        list3.getClass();
        PublicKey publicKey = X509CertUtils.parseWithException(((Base64) CollectionsKt.first(list3)).decode()).getPublicKey();
        publicKey.getClass();
        Set set = MACProvider.SUPPORTED_ALGORITHMS;
        JWSAlgorithm jWSAlgorithm2 = (JWSAlgorithm) jWSHeader3.alg;
        if (set.contains(jWSAlgorithm2)) {
            if (!(publicKey instanceof SecretKey)) {
                throw new KeyTypeException(SecretKey.class);
            }
            eCDSAVerifier = new MACVerifier((SecretKey) publicKey);
        } else if (RSASSAProvider.SUPPORTED_ALGORITHMS.contains(jWSAlgorithm2)) {
            if (!(publicKey instanceof RSAPublicKey)) {
                throw new KeyTypeException(RSAPublicKey.class);
            }
            eCDSAVerifier = new RSASSAVerifier((RSAPublicKey) publicKey);
        } else {
            if (!ECDSAProvider.SUPPORTED_ALGORITHMS.contains(jWSAlgorithm2)) {
                JWK$$ExternalSyntheticBUOutline0.m$2(jWSAlgorithm2, "Unsupported JWS algorithm: ");
                return false;
            }
            if (!(publicKey instanceof ECPublicKey)) {
                throw new KeyTypeException(ECPublicKey.class);
            }
            eCDSAVerifier = new ECDSAVerifier((ECPublicKey) publicKey);
        }
        ((JCAContext) eCDSAVerifier.zzd).provider = (Provider) jCAContext.provider;
        synchronized (jWSObject) {
            AtomicReference atomicReference = jWSObject.state;
            if (atomicReference.get() != JWSObject.State.SIGNED && atomicReference.get() != JWSObject.State.VERIFIED) {
                throw new IllegalStateException("The JWS object must be in a signed or verified state");
            }
            try {
                verify = eCDSAVerifier.verify(jWSObject.header, jWSObject.signingInputString.getBytes(StandardCharset.UTF_8), jWSObject.signature);
                if (verify) {
                    jWSObject.state.set(JWSObject.State.VERIFIED);
                }
            } catch (JOSEException e) {
                throw e;
            } catch (Exception e2) {
                throw new JOSEException(e2.getMessage(), e2);
            }
        }
        return verify;
    }
}
