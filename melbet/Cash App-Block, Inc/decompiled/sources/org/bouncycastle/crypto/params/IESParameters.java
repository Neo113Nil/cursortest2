package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class IESParameters implements CipherParameters {
    private byte[] derivation;

    /* renamed from: encoding, reason: collision with root package name */
    private byte[] f1583encoding;
    private int macKeySize;

    public IESParameters(byte[] bArr, byte[] bArr2, int i) {
        this.derivation = Arrays.clone(bArr);
        this.f1583encoding = Arrays.clone(bArr2);
        this.macKeySize = i;
    }

    public byte[] getDerivationV() {
        return Arrays.clone(this.derivation);
    }

    public byte[] getEncodingV() {
        return Arrays.clone(this.f1583encoding);
    }

    public int getMacKeySize() {
        return this.macKeySize;
    }
}
