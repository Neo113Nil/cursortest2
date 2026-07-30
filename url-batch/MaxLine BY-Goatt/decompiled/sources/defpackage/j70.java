package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j70 {
    public final vo2 a;

    public j70() {
        this.a = zm3.f(u13.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ot otVar, r30 r30Var) {
        vt1 vt1Var;
        int i;
        if (r30Var instanceof vt1) {
            vt1Var = (vt1) r30Var;
            int i2 = vt1Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vt1Var.o = i2 - Integer.MIN_VALUE;
                Object obj = vt1Var.m;
                b50 b50Var = b50.m;
                i = vt1Var.o;
                if (i != 0) {
                    ca2.b(obj);
                    vt1Var.o = 1;
                    this.a.a(otVar, vt1Var);
                    return;
                } else if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    ca2.b(obj);
                    throw new k81();
                }
            }
        }
        vt1Var = new vt1(this, r30Var);
        Object obj2 = vt1Var.m;
        b50 b50Var2 = b50.m;
        i = vt1Var.o;
        if (i != 0) {
        }
    }

    public qo2 b() {
        return (qo2) this.a.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r6.a > r2.a) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Type inference failed for: r3v4, types: [ng0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(qo2 qo2Var) {
        vo2 vo2Var;
        Object value;
        qo2 qo2Var2;
        qo2Var.getClass();
        do {
            vo2Var = this.a;
            value = vo2Var.getValue();
            qo2Var2 = (qo2) value;
            if (!(qo2Var2 instanceof g62 ? true : Intrinsics.b(qo2Var2, u13.b))) {
                if (!(qo2Var2 instanceof h60)) {
                    if (!(qo2Var2 instanceof zl0)) {
                        a.b();
                        return;
                    }
                }
                ?? r3 = yj1.k;
                if (value == null) {
                    value = r3;
                }
                if (qo2Var2 == null) {
                    qo2Var2 = r3;
                }
            }
            qo2Var2 = qo2Var;
            ?? r32 = yj1.k;
            if (value == null) {
            }
            if (qo2Var2 == null) {
            }
        } while (!vo2Var.j(value, qo2Var2));
    }

    public j70(int i) {
        this.a = zm3.f(new int[i]);
    }
}
