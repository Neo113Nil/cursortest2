package A0;

import java.nio.ByteBuffer;
import v0.m;
import v0.n;

/* loaded from: classes.dex */
public final class b extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final b f2d = new b();

    @Override // v0.n
    public final Object f(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            return super.f(b2, byteBuffer);
        }
        Object e2 = e(byteBuffer);
        if (e2 == null) {
            return null;
        }
        return c.values()[((Long) e2).intValue()];
    }

    @Override // v0.n
    public final void k(m mVar, Object obj) {
        if (!(obj instanceof c)) {
            super.k(mVar, obj);
        } else {
            mVar.write(129);
            k(mVar, obj == null ? null : Integer.valueOf(((c) obj).f4e));
        }
    }
}
