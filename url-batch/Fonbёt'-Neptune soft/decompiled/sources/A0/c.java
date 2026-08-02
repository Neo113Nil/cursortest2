package A0;

import java.nio.ByteBuffer;
import w0.n;
import w0.o;

/* loaded from: classes.dex */
public final class c extends o {

    /* renamed from: d, reason: collision with root package name */
    public static final c f62d = new c();

    @Override // w0.o
    public final Object f(byte b2, ByteBuffer byteBuffer) {
        if (b2 != -127) {
            return super.f(b2, byteBuffer);
        }
        Object e2 = e(byteBuffer);
        if (e2 == null) {
            return null;
        }
        return d.values()[((Long) e2).intValue()];
    }

    @Override // w0.o
    public final void k(n nVar, Object obj) {
        if (!(obj instanceof d)) {
            super.k(nVar, obj);
        } else {
            nVar.write(129);
            k(nVar, obj == null ? null : Integer.valueOf(((d) obj).f64e));
        }
    }
}
