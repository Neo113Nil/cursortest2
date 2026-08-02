package org.bouncycastle.tsp.ers;

import org.bouncycastle.operator.DigestCalculator;

/* loaded from: classes10.dex */
public interface ERSData {
    byte[] getHash(DigestCalculator digestCalculator, byte[] bArr);
}
