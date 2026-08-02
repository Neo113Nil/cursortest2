package org.bouncycastle.jcajce.provider.symmetric.util;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Integers;

/* loaded from: classes9.dex */
public class GcmSpecUtil {
    private static final Constructor constructor;
    static final Class gcmSpecClass;
    private static final Method iv;
    private static final Method tLen;

    static {
        Method method;
        Class loadClass = ClassUtil.loadClass(GcmSpecUtil.class, "javax.crypto.spec.GCMParameterSpec");
        gcmSpecClass = loadClass;
        if (loadClass != null) {
            constructor = extractConstructor();
            tLen = extractMethod("getTLen");
            method = extractMethod("getIV");
        } else {
            method = null;
            constructor = null;
            tLen = null;
        }
        iv = method;
    }

    public static AEADParameters extractAeadParameters(final KeyParameter keyParameter, final AlgorithmParameterSpec algorithmParameterSpec) {
        try {
            return (AEADParameters) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.3
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return new AEADParameters(KeyParameter.this, ((Integer) GcmSpecUtil.tLen.invoke(algorithmParameterSpec, null)).intValue(), (byte[]) GcmSpecUtil.iv.invoke(algorithmParameterSpec, null));
                }
            });
        } catch (Exception unused) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("Cannot process GCMParameterSpec.");
            return null;
        }
    }

    private static Constructor extractConstructor() {
        try {
            return (Constructor) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return GcmSpecUtil.gcmSpecClass.getConstructor(Integer.TYPE, byte[].class);
                }
            });
        } catch (PrivilegedActionException unused) {
            return null;
        }
    }

    public static GCMParameters extractGcmParameters(final AlgorithmParameterSpec algorithmParameterSpec) {
        try {
            return (GCMParameters) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.4
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return new GCMParameters((byte[]) GcmSpecUtil.iv.invoke(algorithmParameterSpec, null), ((Integer) GcmSpecUtil.tLen.invoke(algorithmParameterSpec, null)).intValue() / 8);
                }
            });
        } catch (Exception unused) {
            Mod$$ExternalSyntheticBUOutline0.m("Cannot process GCMParameterSpec");
            return null;
        }
    }

    public static AlgorithmParameterSpec extractGcmSpec(ASN1Primitive aSN1Primitive) {
        try {
            GCMParameters gCMParameters = GCMParameters.getInstance(aSN1Primitive);
            return (AlgorithmParameterSpec) constructor.newInstance(Integers.valueOf(gCMParameters.getIcvLen() * 8), gCMParameters.getNonce());
        } catch (Exception e) {
            throw new InvalidParameterSpecException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("Construction failed: ")));
        }
    }

    private static Method extractMethod(final String str) {
        try {
            return (Method) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.2
                @Override // java.security.PrivilegedExceptionAction
                public Object run() {
                    return GcmSpecUtil.gcmSpecClass.getDeclaredMethod(str, null);
                }
            });
        } catch (PrivilegedActionException unused) {
            return null;
        }
    }

    public static boolean gcmSpecExists() {
        return gcmSpecClass != null;
    }

    public static boolean gcmSpecExtractable() {
        return constructor != null;
    }

    public static boolean isGcmSpec(AlgorithmParameterSpec algorithmParameterSpec) {
        Class cls = gcmSpecClass;
        return cls != null && cls.isInstance(algorithmParameterSpec);
    }

    public static boolean isGcmSpec(Class cls) {
        return gcmSpecClass == cls;
    }
}
