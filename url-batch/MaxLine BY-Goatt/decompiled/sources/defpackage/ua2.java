package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ua2 {
    public au1 a;
    public final float b;
    public final boolean c;
    public Float d;
    public au1 e;
    public final jc f = yj1.a(0.0f);
    public final jc g = yj1.a(0.0f);
    public final jc h = yj1.a(0.0f);
    public final dx i;
    public final lz1 j;
    public final lz1 k;

    public ua2(au1 au1Var, float f, boolean z) {
        this.a = au1Var;
        this.b = f;
        this.c = z;
        dx dxVar = new dx(true);
        dxVar.R(null);
        this.i = dxVar;
        Boolean bool = Boolean.FALSE;
        this.j = ij2.j(bool);
        this.k = ij2.j(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r8.t(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r30 r30Var) {
        ra2 ra2Var;
        int i;
        if (r30Var instanceof ra2) {
            ra2Var = (ra2) r30Var;
            int i2 = ra2Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ra2Var.p = i2 - Integer.MIN_VALUE;
                Object obj = ra2Var.n;
                Object obj2 = b50.m;
                i = ra2Var.p;
                int i3 = 1;
                o30 o30Var = null;
                if (i != 0) {
                    ca2.b(obj);
                    ra2Var.m = this;
                    ra2Var.p = 1;
                    Object t = j8.t(new ta2(this, o30Var, 0), ra2Var);
                    if (t != obj2) {
                        t = Unit.a;
                    }
                } else if (i == 1) {
                    this = ra2Var.m;
                    ca2.b(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            ca2.b(obj);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = ra2Var.m;
                    ca2.b(obj);
                    ra2Var.m = null;
                    ra2Var.p = 3;
                    this.getClass();
                    Object t2 = j8.t(new ta2(this, o30Var, i3), ra2Var);
                    if (t2 != obj2) {
                        t2 = Unit.a;
                    }
                }
                this.j.setValue(Boolean.TRUE);
                dx dxVar = this.i;
                ra2Var.m = this;
                ra2Var.p = 2;
            }
        }
        ra2Var = new ra2(this, r30Var);
        Object obj3 = ra2Var.n;
        Object obj22 = b50.m;
        i = ra2Var.p;
        int i32 = 1;
        o30 o30Var2 = null;
        if (i != 0) {
        }
        this.j.setValue(Boolean.TRUE);
        dx dxVar2 = this.i;
        ra2Var.m = this;
        ra2Var.p = 2;
    }
}
