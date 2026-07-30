package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes5.dex */
public class p {
    private final LMOtsParameters lmOTSParam;
    private final LMSigParameters lmSigParam;

    public p(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters) {
        this.lmSigParam = lMSigParameters;
        this.lmOTSParam = lMOtsParameters;
    }

    public LMOtsParameters getLMOTSParam() {
        return this.lmOTSParam;
    }

    public LMSigParameters getLMSigParam() {
        return this.lmSigParam;
    }
}
