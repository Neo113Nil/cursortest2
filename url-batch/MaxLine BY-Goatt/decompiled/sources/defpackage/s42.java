package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s42 implements ca0 {
    public final /* synthetic */ ca0 m;
    public boolean n;
    public boolean o;
    public final qo1 p = new qo1();

    public s42(ca0 ca0Var) {
        this.m = ca0Var;
    }

    @Override // defpackage.ca0
    public final long A(float f) {
        return this.m.A(f);
    }

    @Override // defpackage.ca0
    public final long C(long j) {
        return this.m.C(j);
    }

    @Override // defpackage.ca0
    public final float D(float f) {
        return this.m.D(f);
    }

    @Override // defpackage.ca0
    public final float K(long j) {
        return this.m.K(j);
    }

    @Override // defpackage.ca0
    public final int R(float f) {
        return this.m.R(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r30 r30Var) {
        q42 q42Var;
        int i;
        if (r30Var instanceof q42) {
            q42Var = (q42) r30Var;
            int i2 = q42Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q42Var.p = i2 - Integer.MIN_VALUE;
                Object obj = q42Var.n;
                b50 b50Var = b50.m;
                i = q42Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    q42Var.m = this;
                    q42Var.p = 1;
                    if (this.p.f(q42Var) == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = q42Var.m;
                    ca2.b(obj);
                }
                this.n = false;
                this.o = false;
                return Unit.a;
            }
        }
        q42Var = new q42(this, r30Var);
        Object obj2 = q42Var.n;
        b50 b50Var2 = b50.m;
        i = q42Var.p;
        if (i != 0) {
        }
        this.n = false;
        this.o = false;
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(r30 r30Var) {
        r42 r42Var;
        int i;
        if (r30Var instanceof r42) {
            r42Var = (r42) r30Var;
            int i2 = r42Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r42Var.p = i2 - Integer.MIN_VALUE;
                Object obj = r42Var.n;
                b50 b50Var = b50.m;
                i = r42Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    if (!this.n && !this.o) {
                        r42Var.m = this;
                        r42Var.p = 1;
                        if (this.p.f(r42Var) == b50Var) {
                            return b50Var;
                        }
                    }
                    return Boolean.valueOf(this.n);
                }
                if (i != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = r42Var.m;
                ca2.b(obj);
                this.p.b(null);
                return Boolean.valueOf(this.n);
            }
        }
        r42Var = new r42(this, r30Var);
        Object obj2 = r42Var.n;
        b50 b50Var2 = b50.m;
        i = r42Var.p;
        if (i != 0) {
        }
        this.p.b(null);
        return Boolean.valueOf(this.n);
    }

    @Override // defpackage.ca0
    public final long c0(long j) {
        return this.m.c0(j);
    }

    @Override // defpackage.ca0
    public final float d() {
        return this.m.d();
    }

    @Override // defpackage.ca0
    public final float g0(long j) {
        return this.m.g0(j);
    }

    @Override // defpackage.ca0
    public final long l0(float f) {
        return this.m.l0(f);
    }

    @Override // defpackage.ca0
    public final float p() {
        return this.m.p();
    }

    @Override // defpackage.ca0
    public final float p0(int i) {
        return this.m.p0(i);
    }

    @Override // defpackage.ca0
    public final float r0(float f) {
        return this.m.r0(f);
    }
}
