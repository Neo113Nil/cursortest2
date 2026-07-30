package org.bouncycastle.asn1;

import java.io.IOException;

/* loaded from: classes5.dex */
public class v1 implements w {
    private z _parser;

    v1(z zVar) {
        this._parser = zVar;
    }

    @Override // org.bouncycastle.asn1.w, org.bouncycastle.asn1.b2
    public s getLoadedObject() {
        return new u1(this._parser.readVector());
    }

    @Override // org.bouncycastle.asn1.w
    public f readObject() {
        return this._parser.readObject();
    }

    @Override // org.bouncycastle.asn1.w, org.bouncycastle.asn1.f
    public s toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e8) {
            throw new IllegalStateException(e8.getMessage());
        }
    }
}
