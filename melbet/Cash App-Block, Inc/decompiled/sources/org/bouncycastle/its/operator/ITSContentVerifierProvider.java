package org.bouncycastle.its.operator;

import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.operator.ContentVerifier;

/* loaded from: classes8.dex */
public interface ITSContentVerifierProvider {
    ContentVerifier get(int i);

    ITSCertificate getAssociatedCertificate();

    boolean hasAssociatedCertificate();
}
