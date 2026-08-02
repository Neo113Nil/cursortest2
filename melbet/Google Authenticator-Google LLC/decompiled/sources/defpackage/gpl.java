package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpl {
    public String a;
    public gpk b;
    public Executor c;
    public byte d;
    private final gzp e;
    private jll f;
    private heg g;
    private hel h;
    private gzp i;
    private final gzp j;

    public gpl() {
        gyf gyfVar = gyf.a;
        this.e = gyfVar;
        this.i = gyfVar;
        this.j = gyfVar;
    }

    public final gpm a() {
        String str;
        jll jllVar;
        gpk gpkVar;
        heg hegVar = this.g;
        if (hegVar != null) {
            this.h = hegVar.g();
        } else if (this.h == null) {
            int i = hel.d;
            this.h = his.a;
        }
        if (this.d == 1 && (str = this.a) != null && (jllVar = this.f) != null && (gpkVar = this.b) != null) {
            return new gpm(str, this.e, jllVar, gpkVar, this.h, this.i, this.j, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" blockingSafeReads");
        }
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.f == null) {
            sb.append(" schema");
        }
        if (this.b == null) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(fwv fwvVar) {
        heg hegVar = this.g;
        if (hegVar == null) {
            int i = hel.d;
            hegVar = new heg(4);
            this.g = hegVar;
        }
        hegVar.h(fwvVar);
    }

    public final void c(fby fbyVar) {
        this.i = gzp.h(fbyVar);
    }

    public final void d(jll jllVar) {
        if (jllVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.f = jllVar;
    }
}
