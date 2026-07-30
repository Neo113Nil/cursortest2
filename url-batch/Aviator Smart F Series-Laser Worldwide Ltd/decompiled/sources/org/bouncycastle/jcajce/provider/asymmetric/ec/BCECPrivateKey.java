package org.bouncycastle.jcajce.provider.asymmetric.ec;

import a7.b;
import a7.c;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.o;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.t0;
import org.bouncycastle.asn1.x9.k;
import org.bouncycastle.crypto.params.j;
import org.bouncycastle.jcajce.provider.asymmetric.util.d;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.e;

/* loaded from: classes5.dex */
public class BCECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, c, b {
    static final long serialVersionUID = 994553197664784084L;
    private String algorithm;
    private transient d attrCarrier;
    private transient w6.b configuration;

    /* renamed from: d, reason: collision with root package name */
    private transient BigInteger f17134d;
    private transient ECParameterSpec ecSpec;
    private transient t0 publicKey;
    private boolean withCompression;

    protected BCECPrivateKey() {
        this.algorithm = "EC";
        this.attrCarrier = new d();
    }

    private t0 getPublicKeyDetails(BCECPublicKey bCECPublicKey) {
        try {
            return v6.b.getInstance(s.fromByteArray(bCECPublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(t6.b bVar) {
        org.bouncycastle.asn1.x9.c cVar = org.bouncycastle.asn1.x9.c.getInstance(bVar.getPrivateKeyAlgorithm().getParameters());
        this.ecSpec = org.bouncycastle.jcajce.provider.asymmetric.util.a.convertToSpec(cVar, org.bouncycastle.jcajce.provider.asymmetric.util.a.getCurve(this.configuration, cVar));
        f parsePrivateKey = bVar.parsePrivateKey();
        if (parsePrivateKey instanceof l) {
            this.f17134d = l.getInstance(parsePrivateKey).getValue();
            return;
        }
        org.bouncycastle.asn1.sec.a aVar = org.bouncycastle.asn1.sec.a.getInstance(parsePrivateKey);
        this.f17134d = aVar.getKey();
        this.publicKey = aVar.getPublicKey();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPrivKeyInfo(t6.b.getInstance(s.fromByteArray(bArr)));
        this.attrCarrier = new d();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    org.bouncycastle.jce.spec.d engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec(eCParameterSpec) : this.configuration.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return getD().equals(bCECPrivateKey.getD()) && engineGetSpec().equals(bCECPrivateKey.engineGetSpec());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // a7.c
    public f getBagAttribute(o oVar) {
        return this.attrCarrier.getBagAttribute(oVar);
    }

    @Override // a7.c
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey
    public BigInteger getD() {
        return this.f17134d;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        org.bouncycastle.asn1.x9.c domainParametersFromName = a.getDomainParametersFromName(this.ecSpec, this.withCompression);
        ECParameterSpec eCParameterSpec = this.ecSpec;
        int orderBitLength = eCParameterSpec == null ? org.bouncycastle.jcajce.provider.asymmetric.util.b.getOrderBitLength(this.configuration, null, getS()) : org.bouncycastle.jcajce.provider.asymmetric.util.b.getOrderBitLength(this.configuration, eCParameterSpec.getOrder(), getS());
        try {
            return new t6.b(new v6.a(k.id_ecPublicKey, domainParametersFromName), this.publicKey != null ? new org.bouncycastle.asn1.sec.a(orderBitLength, getS(), this.publicKey, domainParametersFromName) : new org.bouncycastle.asn1.sec.a(orderBitLength, getS(), domainParametersFromName)).getEncoded("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    @Override // org.bouncycastle.jce.interfaces.ECPrivateKey, a7.a
    public org.bouncycastle.jce.spec.d getParameters() {
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

    @Override // java.security.interfaces.ECPrivateKey
    public BigInteger getS() {
        return this.f17134d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    @Override // a7.c
    public void setBagAttribute(o oVar, f fVar) {
        this.attrCarrier.setBagAttribute(oVar, fVar);
    }

    @Override // a7.b
    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.util.b.privateKeyToString("EC", this.f17134d, engineGetSpec());
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, w6.b bVar) {
        this.algorithm = "EC";
        this.attrCarrier = new d();
        this.algorithm = str;
        this.f17134d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
        this.configuration = bVar;
    }

    public BCECPrivateKey(String str, j jVar, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, w6.b bVar) {
        this.algorithm = "EC";
        this.attrCarrier = new d();
        this.algorithm = str;
        this.f17134d = jVar.getD();
        this.configuration = bVar;
        if (eCParameterSpec == null) {
            org.bouncycastle.crypto.params.f parameters = jVar.getParameters();
            eCParameterSpec = new ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(bCECPublicKey);
    }

    public BCECPrivateKey(String str, j jVar, BCECPublicKey bCECPublicKey, org.bouncycastle.jce.spec.d dVar, w6.b bVar) {
        this.algorithm = "EC";
        this.attrCarrier = new d();
        this.algorithm = str;
        this.f17134d = jVar.getD();
        this.configuration = bVar;
        if (dVar == null) {
            org.bouncycastle.crypto.params.f parameters = jVar.getParameters();
            this.ecSpec = new ECParameterSpec(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertCurve(parameters.getCurve(), parameters.getSeed()), org.bouncycastle.jcajce.provider.asymmetric.util.a.convertPoint(parameters.getG()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.ecSpec = org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertCurve(dVar.getCurve(), dVar.getSeed()), dVar);
        }
        try {
            this.publicKey = getPublicKeyDetails(bCECPublicKey);
        } catch (Exception unused) {
            this.publicKey = null;
        }
    }

    public BCECPrivateKey(String str, j jVar, w6.b bVar) {
        this.algorithm = "EC";
        this.attrCarrier = new d();
        this.algorithm = str;
        this.f17134d = jVar.getD();
        this.ecSpec = null;
        this.configuration = bVar;
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) {
        this.algorithm = "EC";
        this.attrCarrier = new d();
        this.algorithm = str;
        this.f17134d = bCECPrivateKey.f17134d;
        this.ecSpec = bCECPrivateKey.ecSpec;
        this.withCompression = bCECPrivateKey.withCompression;
        this.attrCarrier = bCECPrivateKey.attrCarrier;
        this.publicKey = bCECPrivateKey.publicKey;
        this.configuration = bCECPrivateKey.configuration;
    }

    public BCECPrivateKey(String str, e eVar, w6.b bVar) {
        this.algorithm = "EC";
        this.attrCarrier = new d();
        this.algorithm = str;
        this.f17134d = eVar.getD();
        this.ecSpec = eVar.getParams() != null ? org.bouncycastle.jcajce.provider.asymmetric.util.a.convertSpec(org.bouncycastle.jcajce.provider.asymmetric.util.a.convertCurve(eVar.getParams().getCurve(), eVar.getParams().getSeed()), eVar.getParams()) : null;
        this.configuration = bVar;
    }

    BCECPrivateKey(String str, t6.b bVar, w6.b bVar2) {
        this.algorithm = "EC";
        this.attrCarrier = new d();
        this.algorithm = str;
        this.configuration = bVar2;
        populateFromPrivKeyInfo(bVar);
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, w6.b bVar) {
        this.algorithm = "EC";
        this.attrCarrier = new d();
        this.f17134d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
        this.configuration = bVar;
    }
}
