package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fem {
    public Object a;
    public Object b;

    /* JADX WARN: Type inference failed for: r1v2, types: [fbf, java.lang.Object] */
    public final void a() {
        if (this.a == null) {
            throw new fbg("Cannot sync underlying stream");
        }
        ((OutputStream) this.b).flush();
        this.a.b();
    }

    public final void b(eej eejVar) {
        if (eejVar == null) {
            throw new NullPointerException("Null features");
        }
        this.b = eejVar;
    }
}
