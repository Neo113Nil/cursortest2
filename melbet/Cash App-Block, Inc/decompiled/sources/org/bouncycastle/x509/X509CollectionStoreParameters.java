package org.bouncycastle.x509;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes9.dex */
public class X509CollectionStoreParameters implements X509StoreParameters {
    private Collection collection;

    public X509CollectionStoreParameters(Collection collection) {
        if (collection != null) {
            this.collection = collection;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("collection cannot be null");
            throw null;
        }
    }

    public Object clone() {
        return new X509CollectionStoreParameters(this.collection);
    }

    public Collection getCollection() {
        return new ArrayList(this.collection);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("X509CollectionStoreParameters: [\n");
        stringBuffer.append("  collection: " + this.collection + "\n");
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
