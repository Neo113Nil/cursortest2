package j1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class h implements c {
    @Override // j1.c
    public final a a(e eVar) {
        ByteBuffer byteBuffer = (ByteBuffer) o2.a.e(eVar.f22411h);
        o2.a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.l()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    protected abstract a b(e eVar, ByteBuffer byteBuffer);
}
