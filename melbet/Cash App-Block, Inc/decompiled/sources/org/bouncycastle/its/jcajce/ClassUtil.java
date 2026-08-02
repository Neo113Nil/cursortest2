package org.bouncycastle.its.jcajce;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.util.Integers;

/* loaded from: classes9.dex */
class ClassUtil {
    private static final Class gcmSpecClass = loadClass(ClassUtil.class, "javax.crypto.spec.GCMParameterSpec");

    public static AlgorithmParameterSpec getGCMSpec(final byte[] bArr, final int i) {
        if (gcmSpecClass != null) {
            try {
                return (AlgorithmParameterSpec) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.its.jcajce.ClassUtil.1
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            return ClassUtil.gcmSpecClass.getConstructor(Integer.TYPE, byte[].class).newInstance(Integers.valueOf(i), bArr);
                        } catch (NoSuchMethodException e) {
                            a$$ExternalSyntheticBUOutline0.m$2(e.getMessage(), "no matching constructor: ");
                            return null;
                        } catch (Exception e2) {
                            a$$ExternalSyntheticBUOutline0.m$1(Fragment$5$$ExternalSyntheticOutline0.m(e2, new StringBuilder("constructor failed")));
                            return null;
                        }
                    }
                });
            } catch (IllegalStateException unused) {
            }
        }
        return new AEADParameterSpec(bArr, i);
    }

    public static Class loadClass(Class cls, final String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.its.jcajce.ClassUtil.2
                @Override // java.security.PrivilegedAction
                public Object run() {
                    try {
                        return Class.forName(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
