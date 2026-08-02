package j$.desugar.sun.nio.fs;

import java.nio.channels.FileLock;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class b extends FileLock {
    public final FileLock a;

    public b(FileLock fileLock, a aVar) {
        super(aVar, fileLock.position(), fileLock.size(), fileLock.isShared());
        this.a = fileLock;
    }

    @Override // java.nio.channels.FileLock
    public final boolean isValid() {
        return this.a.isValid();
    }

    @Override // java.nio.channels.FileLock
    public final void release() {
        this.a.release();
    }
}
