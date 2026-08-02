package org.bouncycastle.math.raw;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SignatureException;
import java.security.cert.CertPath;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.x509.NameConstraintValidatorException;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.pkcs.PKCSIOException;
import org.bouncycastle.tsp.TSPException;

/* loaded from: classes9.dex */
public final /* synthetic */ class Mod$$ExternalSyntheticBUOutline0 {
    public static /* synthetic */ void m(AlgorithmParameters algorithmParameters) {
        throw new InvalidAlgorithmParameterException("can't handle parameter " + ((Object) algorithmParameters.toString()));
    }

    public static /* synthetic */ void m$1(Object obj) {
        throw new IOException("Error encoding certificate: " + ((Object) obj.toString()));
    }

    public static /* synthetic */ void m$2(Object obj) {
        throw new InvalidKeySpecException(obj.toString());
    }

    public static /* synthetic */ void m$3(Object obj) {
        throw new RuntimeException(obj.toString());
    }

    public static /* synthetic */ void m$4(String str) {
        throw new InvalidParameterException(str);
    }

    public static /* synthetic */ void m$2(String str) {
        throw new ArithmeticException(str);
    }

    public static /* synthetic */ void m$3(String str) {
        throw new NameConstraintValidatorException(str);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new InvalidKeySpecException(str + obj + ((Object) "."));
    }

    public static /* synthetic */ void m$1(String str) {
        throw new AnnotatedException(str);
    }

    public static /* synthetic */ void m(String str) {
        throw new InvalidParameterSpecException(str);
    }

    public static /* synthetic */ void m$1(String str, Throwable th) {
        throw new AnnotatedException(str, th);
    }

    public static /* synthetic */ void m(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    public static /* synthetic */ void m(String str, Object obj, Throwable th) {
        throw new PKCSIOException(str + obj, th);
    }

    public static /* synthetic */ void m(String str, Throwable th) {
        throw new TSPException(str + th, th);
    }

    public static /* synthetic */ void m(String str, Throwable th, CertPath certPath, int i) {
        throw new ExtCertPathValidatorException(str, th, certPath, i);
    }

    public static /* synthetic */ void m(Object obj) {
        throw new SignatureException(obj.toString());
    }
}
