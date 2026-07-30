package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z13 {
    public tt1 a;
    public tt1 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e A[LOOP:0: B:22:0x005e->B:27:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[EDGE_INSN: B:28:0x0073->B:29:0x0073 BREAK  A[LOOP:0: B:22:0x005e->B:27:0x006e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(nv2 nv2Var) {
        tt1 tt1Var;
        yd ydVar = nv2Var.a;
        this.e = false;
        tt1 tt1Var2 = this.a;
        if (nv2Var.equals(tt1Var2 != null ? (nv2) tt1Var2.o : null)) {
            return;
        }
        String str = ydVar.n;
        tt1 tt1Var3 = this.a;
        boolean b = Intrinsics.b(str, tt1Var3 != null ? ((nv2) tt1Var3.o).a.n : null);
        tt1 tt1Var4 = this.a;
        if (b) {
            if (tt1Var4 == null) {
                return;
            }
            tt1Var4.o = nv2Var;
            return;
        }
        this.a = new tt1(14, tt1Var4, nv2Var);
        this.b = null;
        int length = ydVar.n.length() + this.c;
        this.c = length;
        if (length > 100000) {
            tt1 tt1Var5 = this.a;
            if ((tt1Var5 != null ? (tt1) tt1Var5.n : null) == null) {
                return;
            }
            while (true) {
                if (tt1Var5 != null) {
                    tt1 tt1Var6 = (tt1) tt1Var5.n;
                    if (tt1Var6 != null) {
                        tt1Var = (tt1) tt1Var6.n;
                        if (tt1Var != null) {
                            break;
                        } else {
                            tt1Var5 = (tt1) tt1Var5.n;
                        }
                    }
                }
                tt1Var = null;
                if (tt1Var != null) {
                }
            }
            if (tt1Var5 == null) {
                return;
            }
            tt1Var5.n = null;
        }
    }
}
