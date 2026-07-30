package org.bouncycastle.asn1;

import java.io.InputStream;

/* loaded from: classes5.dex */
abstract class f2 extends InputStream {
    protected final InputStream _in;
    private int _limit;

    f2(InputStream inputStream, int i8) {
        this._in = inputStream;
        this._limit = i8;
    }

    int getLimit() {
        return this._limit;
    }

    protected void setParentEofDetect(boolean z7) {
        InputStream inputStream = this._in;
        if (inputStream instanceof c2) {
            ((c2) inputStream).setEofOn00(z7);
        }
    }
}
