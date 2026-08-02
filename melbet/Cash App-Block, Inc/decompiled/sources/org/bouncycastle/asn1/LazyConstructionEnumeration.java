package org.bouncycastle.asn1;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Enumeration;

/* loaded from: classes9.dex */
class LazyConstructionEnumeration implements Enumeration {
    private ASN1InputStream aIn;
    private Object nextObj = readObject();

    public LazyConstructionEnumeration(byte[] bArr) {
        this.aIn = new ASN1InputStream(bArr, true);
    }

    private Object readObject() {
        try {
            return this.aIn.readObject();
        } catch (IOException e) {
            throw new ASN1ParsingException(BalanceFeedKt$$ExternalSyntheticOutline0.m("malformed ASN.1: ", e), e);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.nextObj != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.nextObj;
        if (obj != null) {
            this.nextObj = readObject();
            return obj;
        }
        a$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
