package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public abstract class i extends s {
    protected s dataValueDescriptor;
    protected o directReference;
    protected int encoding;
    protected s externalContent;
    protected l indirectReference;

    public i(g gVar) {
        int i8 = 0;
        s objFromVector = getObjFromVector(gVar, 0);
        if (objFromVector instanceof o) {
            this.directReference = (o) objFromVector;
            objFromVector = getObjFromVector(gVar, 1);
            i8 = 1;
        }
        if (objFromVector instanceof l) {
            this.indirectReference = (l) objFromVector;
            i8++;
            objFromVector = getObjFromVector(gVar, i8);
        }
        if (!(objFromVector instanceof b0)) {
            this.dataValueDescriptor = objFromVector;
            i8++;
            objFromVector = getObjFromVector(gVar, i8);
        }
        if (gVar.size() != i8 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(objFromVector instanceof b0)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        b0 b0Var = (b0) objFromVector;
        setEncoding(b0Var.getTagNo());
        this.externalContent = b0Var.getObject();
    }

    private s getObjFromVector(g gVar, int i8) {
        if (gVar.size() > i8) {
            return gVar.get(i8).toASN1Primitive();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    private void setDataValueDescriptor(s sVar) {
        this.dataValueDescriptor = sVar;
    }

    private void setDirectReference(o oVar) {
        this.directReference = oVar;
    }

    private void setEncoding(int i8) {
        if (i8 >= 0 && i8 <= 2) {
            this.encoding = i8;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i8);
    }

    private void setExternalContent(s sVar) {
        this.externalContent = sVar;
    }

    private void setIndirectReference(l lVar) {
        this.indirectReference = lVar;
    }

    @Override // org.bouncycastle.asn1.s
    boolean asn1Equals(s sVar) {
        s sVar2;
        l lVar;
        o oVar;
        if (!(sVar instanceof i)) {
            return false;
        }
        if (this == sVar) {
            return true;
        }
        i iVar = (i) sVar;
        o oVar2 = this.directReference;
        if (oVar2 != null && ((oVar = iVar.directReference) == null || !oVar.equals((s) oVar2))) {
            return false;
        }
        l lVar2 = this.indirectReference;
        if (lVar2 != null && ((lVar = iVar.indirectReference) == null || !lVar.equals((s) lVar2))) {
            return false;
        }
        s sVar3 = this.dataValueDescriptor;
        if (sVar3 == null || ((sVar2 = iVar.dataValueDescriptor) != null && sVar2.equals(sVar3))) {
            return this.externalContent.equals(iVar.externalContent);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.s
    int encodedLength() {
        return getEncoded().length;
    }

    public s getDataValueDescriptor() {
        return this.dataValueDescriptor;
    }

    public o getDirectReference() {
        return this.directReference;
    }

    public int getEncoding() {
        return this.encoding;
    }

    public s getExternalContent() {
        return this.externalContent;
    }

    public l getIndirectReference() {
        return this.indirectReference;
    }

    @Override // org.bouncycastle.asn1.s, org.bouncycastle.asn1.n
    public int hashCode() {
        o oVar = this.directReference;
        int hashCode = oVar != null ? oVar.hashCode() : 0;
        l lVar = this.indirectReference;
        if (lVar != null) {
            hashCode ^= lVar.hashCode();
        }
        s sVar = this.dataValueDescriptor;
        if (sVar != null) {
            hashCode ^= sVar.hashCode();
        }
        return hashCode ^ this.externalContent.hashCode();
    }

    @Override // org.bouncycastle.asn1.s
    boolean isConstructed() {
        return true;
    }

    @Override // org.bouncycastle.asn1.s
    s toDERObject() {
        return new u0(this.directReference, this.indirectReference, this.dataValueDescriptor, this.encoding, this.externalContent);
    }

    @Override // org.bouncycastle.asn1.s
    s toDLObject() {
        return new q1(this.directReference, this.indirectReference, this.dataValueDescriptor, this.encoding, this.externalContent);
    }

    public i(o oVar, l lVar, s sVar, int i8, s sVar2) {
        setDirectReference(oVar);
        setIndirectReference(lVar);
        setDataValueDescriptor(sVar);
        setEncoding(i8);
        setExternalContent(sVar2.toASN1Primitive());
    }

    public i(o oVar, l lVar, s sVar, j1 j1Var) {
        this(oVar, lVar, sVar, j1Var.getTagNo(), j1Var.toASN1Primitive());
    }
}
