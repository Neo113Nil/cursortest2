package org.bouncycastle.est;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.HashMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.est.AttrOrOID;
import org.bouncycastle.asn1.est.CsrAttrs;
import org.bouncycastle.util.Encodable;

/* loaded from: classes9.dex */
public class CSRAttributesResponse implements Encodable {
    private final CsrAttrs csrAttrs;
    private final HashMap<ASN1ObjectIdentifier, AttrOrOID> index;

    public CSRAttributesResponse(CsrAttrs csrAttrs) {
        this.csrAttrs = csrAttrs;
        this.index = new HashMap<>(csrAttrs.size());
        AttrOrOID[] attrOrOIDs = csrAttrs.getAttrOrOIDs();
        for (int i = 0; i != attrOrOIDs.length; i++) {
            AttrOrOID attrOrOID = attrOrOIDs[i];
            this.index.put(attrOrOID.isOid() ? attrOrOID.getOid() : attrOrOID.getAttribute().getAttrType(), attrOrOID);
        }
    }

    private static CsrAttrs parseBytes(byte[] bArr) {
        try {
            return CsrAttrs.getInstance(ASN1Primitive.fromByteArray(bArr));
        } catch (Exception e) {
            throw new ESTException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("malformed data: ")), e);
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        return this.csrAttrs.getEncoded();
    }

    public Collection<ASN1ObjectIdentifier> getRequirements() {
        return this.index.keySet();
    }

    public boolean hasRequirement(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.index.containsKey(aSN1ObjectIdentifier);
    }

    public boolean isAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (this.index.containsKey(aSN1ObjectIdentifier)) {
            return !this.index.get(aSN1ObjectIdentifier).isOid();
        }
        return false;
    }

    public boolean isEmpty() {
        return this.csrAttrs.size() == 0;
    }

    public CSRAttributesResponse(byte[] bArr) {
        this(parseBytes(bArr));
    }
}
