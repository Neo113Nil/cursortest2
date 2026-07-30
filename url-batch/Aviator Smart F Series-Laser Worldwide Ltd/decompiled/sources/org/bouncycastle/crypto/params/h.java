package org.bouncycastle.crypto.params;

/* loaded from: classes5.dex */
public class h extends a {
    private final f parameters;

    protected h(boolean z7, f fVar) {
        super(z7);
        if (fVar == null) {
            throw new NullPointerException("'parameters' cannot be null");
        }
        this.parameters = fVar;
    }

    public f getParameters() {
        return this.parameters;
    }
}
