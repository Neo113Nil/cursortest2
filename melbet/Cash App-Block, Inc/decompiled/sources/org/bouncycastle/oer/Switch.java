package org.bouncycastle.oer;

import org.bouncycastle.asn1.ASN1Encodable;

/* loaded from: classes8.dex */
public interface Switch {
    ASN1Encodable[] keys();

    Element result(SwitchIndexer switchIndexer);
}
