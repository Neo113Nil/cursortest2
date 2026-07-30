package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes5.dex */
public interface m {
    l generateLMSContext();

    byte[] generateSignature(l lVar);

    long getUsagesRemaining();
}
