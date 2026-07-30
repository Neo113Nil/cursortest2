package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yx0 {
    public int a;
    public float b;
    public final Object c;

    public yx0(zv2 zv2Var) {
        this.c = zv2Var;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        zv2 zv2Var = (zv2) this.c;
        int i3 = 1;
        if (z) {
            int P = tk3.P(zv2Var.f, i, z);
            int lineStart = zv2Var.f.getLineStart(P);
            int f = zv2Var.f(P);
            if (i == lineStart || i == f) {
                z4 = true;
                int i4 = i * 4;
                if (z3) {
                    i3 = z4 ? 2 : 3;
                } else if (z4) {
                    i3 = 0;
                }
                i2 = i4 + i3;
                if (this.a != i2) {
                    return this.b;
                }
                float h = z3 ? zv2Var.h(i, z) : zv2Var.i(i, z);
                if (z2) {
                    this.a = i2;
                    this.b = h;
                }
                return h;
            }
        }
        z4 = false;
        int i42 = i * 4;
        if (z3) {
        }
        i2 = i42 + i3;
        if (this.a != i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f, r30 r30Var) {
        p82 p82Var;
        int i;
        if (r30Var instanceof p82) {
            p82Var = (p82) r30Var;
            int i2 = p82Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p82Var.o = i2 - Integer.MIN_VALUE;
                Object obj = p82Var.m;
                b50 b50Var = b50.m;
                i = p82Var.o;
                if (i != 0) {
                    ca2.b(obj);
                    lx2 lx2Var = (lx2) this.c;
                    Float f2 = new Float(f);
                    p82Var.o = 1;
                    obj = lx2Var.invoke(f2, p82Var);
                    if (obj == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                this.b += ((Number) obj).floatValue();
                return Unit.a;
            }
        }
        p82Var = new p82(this, r30Var);
        Object obj2 = p82Var.m;
        b50 b50Var2 = b50.m;
        i = p82Var.o;
        if (i != 0) {
        }
        this.b += ((Number) obj2).floatValue();
        return Unit.a;
    }

    public yx0(int i, lx2 lx2Var) {
        this.a = i;
        this.c = lx2Var;
    }
}
