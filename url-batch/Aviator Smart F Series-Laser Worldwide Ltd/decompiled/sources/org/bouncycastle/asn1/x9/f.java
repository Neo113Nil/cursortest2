package org.bouncycastle.asn1.x9;

/* loaded from: classes5.dex */
public abstract class f {
    private e params;

    protected abstract e createParameters();

    public synchronized e getParameters() {
        try {
            if (this.params == null) {
                this.params = createParameters();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.params;
    }
}
