package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes10.dex */
public interface LMSContextBasedSigner {
    LMSContext generateLMSContext();

    byte[] generateSignature(LMSContext lMSContext);

    long getUsagesRemaining();
}
