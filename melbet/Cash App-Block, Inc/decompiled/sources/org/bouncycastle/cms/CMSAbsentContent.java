package org.bouncycastle.cms;

import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;

/* loaded from: classes9.dex */
public class CMSAbsentContent implements CMSTypedData, CMSReadable {

    /* renamed from: type, reason: collision with root package name */
    private final ASN1ObjectIdentifier f1573type;

    public CMSAbsentContent() {
        this(CMSObjectIdentifiers.data);
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public Object getContent() {
        return null;
    }

    @Override // org.bouncycastle.cms.CMSTypedData
    public ASN1ObjectIdentifier getContentType() {
        return this.f1573type;
    }

    @Override // org.bouncycastle.cms.CMSReadable
    public InputStream getInputStream() {
        return null;
    }

    @Override // org.bouncycastle.cms.CMSProcessable
    public void write(OutputStream outputStream) {
    }

    public CMSAbsentContent(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f1573type = aSN1ObjectIdentifier;
    }
}
