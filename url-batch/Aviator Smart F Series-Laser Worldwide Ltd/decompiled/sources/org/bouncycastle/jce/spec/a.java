package org.bouncycastle.jce.spec;

import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class a implements KeySpec {
    private d spec;

    protected a(d dVar) {
        this.spec = dVar;
    }

    public d getParams() {
        return this.spec;
    }
}
