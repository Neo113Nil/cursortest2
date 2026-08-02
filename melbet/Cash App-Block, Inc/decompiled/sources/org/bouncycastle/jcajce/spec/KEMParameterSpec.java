package org.bouncycastle.jcajce.spec;

/* loaded from: classes9.dex */
public class KEMParameterSpec extends KTSParameterSpec {
    public KEMParameterSpec(String str, int i) {
        super(str, i, null, null, null);
    }

    public int getKeySizeInBits() {
        return getKeySize();
    }

    public KEMParameterSpec(String str) {
        this(str, 256);
    }
}
