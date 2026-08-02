package org.bouncycastle.cms;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: classes9.dex */
public interface KEMRecipient extends Recipient {
    RecipientOperator getRecipientOperator(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, byte[] bArr);
}
