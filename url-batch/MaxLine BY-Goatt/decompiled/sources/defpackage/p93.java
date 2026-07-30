package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class p93 extends gl0 {
    public static final qz1 e;
    public final qz1 b;
    public final gl0 c;
    public final LinkedHashMap d;

    static {
        String str = qz1.n;
        e = nm1.r("/");
    }

    public p93(qz1 qz1Var, gl0 gl0Var, LinkedHashMap linkedHashMap) {
        this.b = qz1Var;
        this.c = gl0Var;
        this.d = linkedHashMap;
    }

    @Override // defpackage.gl0
    public final ol2 a(qz1 qz1Var) {
        qz1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.gl0
    public final void b(qz1 qz1Var, qz1 qz1Var2) {
        qz1Var.getClass();
        qz1Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.gl0
    public final void c(qz1 qz1Var) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.gl0
    public final void d(qz1 qz1Var) {
        qz1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.gl0
    public final List g(qz1 qz1Var) {
        qz1 qz1Var2 = e;
        qz1Var2.getClass();
        o93 o93Var = (o93) this.d.get(j.b(qz1Var2, qz1Var, true));
        if (o93Var == null) {
            ch2.j(qz1Var, "not a directory: ");
            return null;
        }
        List M = zv.M(o93Var.q);
        M.getClass();
        return M;
    }

    @Override // defpackage.gl0
    public final yk0 i(qz1 qz1Var) {
        boolean z;
        Long l;
        Long l2;
        Long l3;
        Long valueOf;
        Throwable th;
        Throwable th2;
        qz1Var.getClass();
        qz1 qz1Var2 = e;
        qz1Var2.getClass();
        o93 o93Var = (o93) this.d.get(j.b(qz1Var2, qz1Var, true));
        if (o93Var == null) {
            return null;
        }
        long j = o93Var.h;
        if (j != -1) {
            d71 j2 = this.c.j(this.b);
            try {
                p62 p62Var = new p62(j2.b(j));
                try {
                    o93Var = yh2.q(p62Var, o93Var);
                    o93Var.getClass();
                    try {
                        p62Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        p62Var.close();
                    } catch (Throwable th5) {
                        wi0.a(th4, th5);
                    }
                    th2 = th4;
                    o93Var = null;
                }
            } catch (Throwable th6) {
                if (j2 != null) {
                    try {
                        j2.close();
                    } catch (Throwable th7) {
                        wi0.a(th6, th7);
                    }
                }
                th = th6;
                o93Var = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                j2.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z2 = o93Var.b;
        boolean z3 = !z2;
        Long valueOf2 = z2 ? null : Long.valueOf(o93Var.f);
        Long l4 = o93Var.m;
        if (l4 != null) {
            l = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
            z = true;
        } else {
            if (o93Var.p != null) {
                z = true;
                l = Long.valueOf(r0.intValue() * 1000);
            } else {
                z = true;
                l = null;
            }
        }
        Long l5 = o93Var.k;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            if (o93Var.n != null) {
                l2 = Long.valueOf(r2.intValue() * 1000);
            } else {
                int i = o93Var.j;
                if (i != -1) {
                    int i2 = o93Var.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        l2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l2 = null;
            }
        }
        Long l6 = o93Var.l;
        if (l6 != null) {
            valueOf = Long.valueOf((l6.longValue() / 10000) - 11644473600000L);
        } else {
            if (o93Var.o == null) {
                l3 = null;
                return new yk0(z3, z2, null, valueOf2, l, l2, l3);
            }
            valueOf = Long.valueOf(r1.intValue() * 1000);
        }
        l3 = valueOf;
        return new yk0(z3, z2, null, valueOf2, l, l2, l3);
    }

    @Override // defpackage.gl0
    public final d71 j(qz1 qz1Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.gl0
    public final ol2 k(qz1 qz1Var) {
        qz1Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.gl0
    public final pn2 l(qz1 qz1Var) {
        Throwable th;
        p62 p62Var;
        qz1Var.getClass();
        qz1 qz1Var2 = e;
        qz1Var2.getClass();
        o93 o93Var = (o93) this.d.get(j.b(qz1Var2, qz1Var, true));
        if (o93Var == null) {
            ey.n(qz1Var, "no such file: ");
            return null;
        }
        long j = o93Var.f;
        d71 j2 = this.c.j(this.b);
        try {
            p62Var = new p62(j2.b(o93Var.h));
            try {
                j2.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (j2 != null) {
                try {
                    j2.close();
                } catch (Throwable th4) {
                    wi0.a(th3, th4);
                }
            }
            th = th3;
            p62Var = null;
        }
        if (th != null) {
            throw th;
        }
        p62Var.getClass();
        yh2.q(p62Var, null);
        if (o93Var.g == 0) {
            return new km0(p62Var, j, true);
        }
        return new km0(new e21(new p62(new km0(p62Var, o93Var.e, true)), new Inflater(true)), j, false);
    }
}
