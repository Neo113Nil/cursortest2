package org.bouncycastle.jce.provider;

import java.security.Permission;
import java.security.spec.DSAParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.d;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.jce.spec.d;
import w6.b;

/* loaded from: classes5.dex */
class a implements b {
    private volatile Object dhDefaultParams;
    private volatile d ecImplicitCaParams;
    private static Permission BC_EC_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, w6.a.THREAD_LOCAL_EC_IMPLICITLY_CA);
    private static Permission BC_EC_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, w6.a.EC_IMPLICITLY_CA);
    private static Permission BC_DH_LOCAL_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, w6.a.THREAD_LOCAL_DH_DEFAULT_PARAMS);
    private static Permission BC_DH_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, w6.a.DH_DEFAULT_PARAMS);
    private static Permission BC_EC_CURVE_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, w6.a.ACCEPTABLE_EC_CURVES);
    private static Permission BC_ADDITIONAL_EC_CURVE_PERMISSION = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, w6.a.ADDITIONAL_EC_PARAMETERS);
    private ThreadLocal ecThreadSpec = new ThreadLocal();
    private ThreadLocal dhThreadSpec = new ThreadLocal();
    private volatile Set acceptableNamedCurves = new HashSet();
    private volatile Map additionalECParameters = new HashMap();

    a() {
    }

    @Override // w6.b
    public Set getAcceptableNamedCurves() {
        return Collections.unmodifiableSet(this.acceptableNamedCurves);
    }

    @Override // w6.b
    public Map getAdditionalECParameters() {
        return Collections.unmodifiableMap(this.additionalECParameters);
    }

    @Override // w6.b
    public DHParameterSpec getDHDefaultParameters(int i8) {
        Object obj = this.dhThreadSpec.get();
        if (obj == null) {
            obj = this.dhDefaultParams;
        }
        if (obj instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) obj;
            if (dHParameterSpec.getP().bitLength() == i8) {
                return dHParameterSpec;
            }
        } else if (obj instanceof DHParameterSpec[]) {
            DHParameterSpec[] dHParameterSpecArr = (DHParameterSpec[]) obj;
            for (int i9 = 0; i9 != dHParameterSpecArr.length; i9++) {
                if (dHParameterSpecArr[i9].getP().bitLength() == i8) {
                    return dHParameterSpecArr[i9];
                }
            }
        }
        org.bouncycastle.crypto.params.b bVar = (org.bouncycastle.crypto.params.b) org.bouncycastle.crypto.d.getSizedProperty(d.b.DH_DEFAULT_PARAMS, i8);
        if (bVar != null) {
            return new y6.a(bVar);
        }
        return null;
    }

    @Override // w6.b
    public DSAParameterSpec getDSADefaultParameters(int i8) {
        org.bouncycastle.crypto.params.d dVar = (org.bouncycastle.crypto.params.d) org.bouncycastle.crypto.d.getSizedProperty(d.b.DSA_DEFAULT_PARAMS, i8);
        if (dVar != null) {
            return new DSAParameterSpec(dVar.getP(), dVar.getQ(), dVar.getG());
        }
        return null;
    }

    @Override // w6.b
    public org.bouncycastle.jce.spec.d getEcImplicitlyCa() {
        org.bouncycastle.jce.spec.d dVar = (org.bouncycastle.jce.spec.d) this.ecThreadSpec.get();
        return dVar != null ? dVar : this.ecImplicitCaParams;
    }

    void setParameter(String str, Object obj) {
        ThreadLocal threadLocal;
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals(w6.a.THREAD_LOCAL_EC_IMPLICITLY_CA)) {
            if (securityManager != null) {
                securityManager.checkPermission(BC_EC_LOCAL_PERMISSION);
            }
            org.bouncycastle.jce.spec.d convertSpec = ((obj instanceof org.bouncycastle.jce.spec.d) || obj == null) ? (org.bouncycastle.jce.spec.d) obj : org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec((ECParameterSpec) obj);
            if (convertSpec != null) {
                this.ecThreadSpec.set(convertSpec);
                return;
            }
            threadLocal = this.ecThreadSpec;
        } else {
            if (str.equals(w6.a.EC_IMPLICITLY_CA)) {
                if (securityManager != null) {
                    securityManager.checkPermission(BC_EC_PERMISSION);
                }
                if ((obj instanceof org.bouncycastle.jce.spec.d) || obj == null) {
                    this.ecImplicitCaParams = (org.bouncycastle.jce.spec.d) obj;
                    return;
                } else {
                    this.ecImplicitCaParams = org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec((ECParameterSpec) obj);
                    return;
                }
            }
            if (!str.equals(w6.a.THREAD_LOCAL_DH_DEFAULT_PARAMS)) {
                if (str.equals(w6.a.DH_DEFAULT_PARAMS)) {
                    if (securityManager != null) {
                        securityManager.checkPermission(BC_DH_PERMISSION);
                    }
                    if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                        throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
                    }
                    this.dhDefaultParams = obj;
                    return;
                }
                if (str.equals(w6.a.ACCEPTABLE_EC_CURVES)) {
                    if (securityManager != null) {
                        securityManager.checkPermission(BC_EC_CURVE_PERMISSION);
                    }
                    this.acceptableNamedCurves = (Set) obj;
                    return;
                } else {
                    if (str.equals(w6.a.ADDITIONAL_EC_PARAMETERS)) {
                        if (securityManager != null) {
                            securityManager.checkPermission(BC_ADDITIONAL_EC_CURVE_PERMISSION);
                        }
                        this.additionalECParameters = (Map) obj;
                        return;
                    }
                    return;
                }
            }
            if (securityManager != null) {
                securityManager.checkPermission(BC_DH_LOCAL_PERMISSION);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
            threadLocal = this.dhThreadSpec;
            if (obj != null) {
                threadLocal.set(obj);
                return;
            }
        }
        threadLocal.remove();
    }
}
