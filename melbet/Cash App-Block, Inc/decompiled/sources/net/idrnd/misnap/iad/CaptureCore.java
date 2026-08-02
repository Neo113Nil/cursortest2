package net.idrnd.misnap.iad;

import android.content.Context;
import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.Pool;
import net.idrnd.face.iad.capture.internal.a3;
import net.idrnd.face.iad.capture.internal.h;
import net.idrnd.face.iad.capture.internal.s2;
import net.idrnd.face.iad.capture.internal.t2;
import net.idrnd.face.iad.capture.internal.u3;
import net.idrnd.face.iad.capture.internal.y2;

/* loaded from: classes9.dex */
public final class CaptureCore implements AutoCloseable {
    public final Object a = new Object();
    public final h b;

    public CaptureCore(Context context, byte[] bArr, Pool pool) {
        s2.a = bArr;
        Size size = a3.f;
        u3 u3Var = u3.a;
        y2 y2Var = (y2) pool.pool;
        if (y2Var != null && t2.a[y2Var.ordinal()] == 1) {
            a$$ExternalSyntheticBUOutline0.m$1("Impossible situation. Create a payload size with data collecting payload size.");
            throw null;
        }
        this.b = new h(context, new a3(a3.f, y2Var));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            this.b.close();
        }
    }
}
