package org.bouncycastle.jcajce.provider.asymmetric.ec;

import a7.b;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.c1;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.x9.c;
import org.bouncycastle.asn1.x9.g;
import org.bouncycastle.asn1.x9.j;
import org.bouncycastle.crypto.params.f;
import org.bouncycastle.crypto.params.k;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.d;
import org.bouncycastle.math.ec.e;
import org.bouncycastle.math.ec.i;

/* loaded from: classes5.dex */
public class BCECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, b {
    static final long serialVersionUID = 2422789860422731812L;
    private String algorithm;
    private transient w6.b configuration;
    private transient k ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, w6.b bVar) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new k(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(params, eCPublicKeySpec.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.a.getDomainParameters(bVar, eCPublicKeySpec.getParams()));
        this.configuration = bVar;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, f fVar) {
        return new ECParameterSpec(ellipticCurve, org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(fVar.getG()), fVar.getN(), fVar.getH().intValue());
    }

    private void populateFromPubKeyInfo(v6.b bVar) {
        byte b8;
        c cVar = c.getInstance(bVar.getAlgorithm().getParameters());
        e curve = org.bouncycastle.jcajce.provider.asymmetric.util.a.getCurve(this.configuration, cVar);
        this.ecSpec = org.bouncycastle.jcajce.provider.asymmetric.util.a.convertToSpec(cVar, curve);
        byte[] bytes = bVar.getPublicKeyData().getBytes();
        p c1Var = new c1(bytes);
        if (bytes[0] == 4 && bytes[1] == bytes.length - 2 && (((b8 = bytes[2]) == 2 || b8 == 3) && new j().getByteLength(curve) >= bytes.length - 3)) {
            try {
                c1Var = (p) s.fromByteArray(bytes);
            } catch (IOException unused) {
                throw new IllegalArgumentException("error recovering public key");
            }
        }
        this.ecPublicKey = new k(new g(curve, c1Var).getPoint(), org.bouncycastle.jcajce.provider.asymmetric.util.b.getDomainParameters(this.configuration, cVar));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPubKeyInfo(v6.b.getInstance(s.fromByteArray(bArr)));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    k engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    d engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec(eCParameterSpec) : this.configuration.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        return this.ecPublicKey.getQ().equals(bCECPublicKey.ecPublicKey.getQ()) && engineGetSpec().equals(bCECPublicKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        boolean z7 = this.withCompression || org.bouncycastle.util.j.isOverrideSet("org.bouncycastle.ec.enable_pc");
        return org.bouncycastle.jcajce.provider.asymmetric.util.c.getEncodedSubjectPublicKeyInfo(new v6.a(org.bouncycastle.asn1.x9.k.id_ecPublicKey, a.getDomainParametersFromName(this.ecSpec, z7)), this.ecPublicKey.getQ().getEncoded(z7));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey, a7.a
    public d getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec(eCParameterSpec);
    }

    @Override // java.security.interfaces.ECKey
    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    @Override // org.bouncycastle.jce.interfaces.ECPublicKey
    public i getQ() {
        i q8 = this.ecPublicKey.getQ();
        return this.ecSpec == null ? q8.getDetachedPoint() : q8;
    }

    @Override // java.security.interfaces.ECPublicKey
    public ECPoint getW() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(this.ecPublicKey.getQ());
    }

    public int hashCode() {
        return this.ecPublicKey.getQ().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // a7.b
    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.b.publicKeyToString("EC", this.ecPublicKey.getQ(), engineGetSpec());
    }

    public BCECPublicKey(String str, k kVar, ECParameterSpec eCParameterSpec, w6.b bVar) {
        this.algorithm = "EC";
        f parameters = kVar.getParameters();
        this.algorithm = str;
        this.ecPublicKey = kVar;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertCurve(parameters.getCurve(), parameters.getSeed()), parameters);
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.configuration = bVar;
    }

    public BCECPublicKey(String str, k kVar, d dVar, w6.b bVar) {
        this.algorithm = "EC";
        f parameters = kVar.getParameters();
        this.algorithm = str;
        this.ecSpec = dVar == null ? createSpec(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertCurve(parameters.getCurve(), parameters.getSeed()), parameters) : org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertCurve(dVar.getCurve(), dVar.getSeed()), dVar);
        this.ecPublicKey = kVar;
        this.configuration = bVar;
    }

    public BCECPublicKey(String str, k kVar, w6.b bVar) {
        this.algorithm = str;
        this.ecPublicKey = kVar;
        this.ecSpec = null;
        this.configuration = bVar;
    }

    public BCECPublicKey(String str, BCECPublicKey bCECPublicKey) {
        this.algorithm = str;
        this.ecPublicKey = bCECPublicKey.ecPublicKey;
        this.ecSpec = bCECPublicKey.ecSpec;
        this.withCompression = bCECPublicKey.withCompression;
        this.configuration = bCECPublicKey.configuration;
    }

    public BCECPublicKey(String str, org.bouncycastle.jce.spec.f fVar, w6.b bVar) {
        this.algorithm = str;
        if (fVar.getParams() != null) {
            EllipticCurve convertCurve = org.bouncycastle.jcajce.provider.asymmetric.util.a.convertCurve(fVar.getParams().getCurve(), fVar.getParams().getSeed());
            this.ecPublicKey = new k(fVar.getQ(), org.bouncycastle.jcajce.provider.asymmetric.util.b.getDomainParameters(bVar, fVar.getParams()));
            this.ecSpec = org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec(convertCurve, fVar.getParams());
        } else {
            this.ecPublicKey = new k(bVar.getEcImplicitlyCa().getCurve().createPoint(fVar.getQ().getAffineXCoord().toBigInteger(), fVar.getQ().getAffineYCoord().toBigInteger()), org.bouncycastle.jcajce.provider.asymmetric.util.a.getDomainParameters(bVar, null));
            this.ecSpec = null;
        }
        this.configuration = bVar;
    }

    BCECPublicKey(String str, v6.b bVar, w6.b bVar2) {
        this.algorithm = str;
        this.configuration = bVar2;
        populateFromPubKeyInfo(bVar);
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, w6.b bVar) {
        this.algorithm = "EC";
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new k(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(params, eCPublicKey.getW()), org.bouncycastle.jcajce.provider.asymmetric.util.a.getDomainParameters(bVar, eCPublicKey.getParams()));
        this.configuration = bVar;
    }
}
