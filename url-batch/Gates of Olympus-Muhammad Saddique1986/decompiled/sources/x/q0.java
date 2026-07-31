package x;

import C0.C0031g;
import z.C1256t;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10235a = 100000;

    /* renamed from: b, reason: collision with root package name */
    public C1256t f10236b;

    /* renamed from: c, reason: collision with root package name */
    public C1256t f10237c;

    /* renamed from: d, reason: collision with root package name */
    public int f10238d;

    /* renamed from: e, reason: collision with root package name */
    public Long f10239e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10240f;

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[LOOP:0: B:24:0x005e->B:29:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[EDGE_INSN: B:30:0x0073->B:31:0x0073 BREAK  A[LOOP:0: B:24:0x005e->B:29:0x006e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(I0.z zVar) {
        C1256t c1256t;
        this.f10240f = false;
        C1256t c1256t2 = this.f10236b;
        if (zVar.equals(c1256t2 != null ? (I0.z) c1256t2.f10467f : null)) {
            return;
        }
        C0031g c0031g = zVar.f3097a;
        String str = c0031g.f596a;
        C1256t c1256t3 = this.f10236b;
        if (f2.j.a(str, c1256t3 != null ? ((I0.z) c1256t3.f10467f).f3097a.f596a : null)) {
            C1256t c1256t4 = this.f10236b;
            if (c1256t4 == null) {
                return;
            }
            c1256t4.f10467f = zVar;
            return;
        }
        this.f10236b = new C1256t(this.f10236b, 20, zVar);
        this.f10237c = null;
        int length = c0031g.f596a.length() + this.f10238d;
        this.f10238d = length;
        if (length > this.f10235a) {
            C1256t c1256t5 = this.f10236b;
            if ((c1256t5 != null ? (C1256t) c1256t5.f10466e : null) == null) {
                return;
            }
            while (true) {
                if (c1256t5 != null) {
                    C1256t c1256t6 = (C1256t) c1256t5.f10466e;
                    if (c1256t6 != null) {
                        c1256t = (C1256t) c1256t6.f10466e;
                        if (c1256t != null) {
                            break;
                        } else {
                            c1256t5 = (C1256t) c1256t5.f10466e;
                        }
                    }
                }
                c1256t = null;
                if (c1256t != null) {
                }
            }
            if (c1256t5 == null) {
                return;
            }
            c1256t5.f10466e = null;
        }
    }
}
