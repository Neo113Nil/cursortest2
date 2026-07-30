package defpackage;

import android.net.Uri;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class pf2 implements hr1 {
    public boolean m;
    public final Object n;

    public pf2(Uri uri, boolean z, boolean z2) {
        this.n = uri;
        this.m = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.hr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object N(long j, long j2, o30 o30Var) {
        of2 of2Var;
        int i;
        long j3;
        if (o30Var instanceof of2) {
            of2Var = (of2) o30Var;
            int i2 = of2Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                of2Var.p = i2 - Integer.MIN_VALUE;
                Object obj = of2Var.n;
                b50 b50Var = b50.m;
                i = of2Var.p;
                if (i != 0) {
                    ca2.b(obj);
                    if (!this.m) {
                        j3 = 0;
                        return new f43(j3);
                    }
                    cg2 cg2Var = (cg2) this.n;
                    of2Var.m = j2;
                    of2Var.p = 1;
                    obj = cg2Var.b(j2, of2Var);
                    if (obj == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2 = of2Var.m;
                    ca2.b(obj);
                }
                j3 = f43.d(j2, ((f43) obj).a);
                return new f43(j3);
            }
        }
        of2Var = new of2(this, (r30) o30Var);
        Object obj2 = of2Var.n;
        b50 b50Var2 = b50.m;
        i = of2Var.p;
        if (i != 0) {
        }
        j3 = f43.d(j2, ((f43) obj2).a);
        return new f43(j3);
    }

    public tl3 a(long j, String str) {
        Long valueOf = Long.valueOf(j);
        Object obj = tl3.g;
        return new tl3(this, str, valueOf, 0);
    }

    public tl3 b(String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Object obj = tl3.g;
        return new tl3(this, str, valueOf, 1);
    }

    public tl3 c(String str, String str2) {
        Object obj = tl3.g;
        return new tl3(this, str, str2, 3);
    }

    @Override // defpackage.hr1
    public long d0(long j, long j2, int i) {
        if (!this.m) {
            return 0L;
        }
        cg2 cg2Var = (cg2) this.n;
        if (cg2Var.a.b()) {
            return 0L;
        }
        return cg2Var.g(cg2Var.c(cg2Var.a.e(cg2Var.c(cg2Var.f(j2)))));
    }

    public pf2(cg2 cg2Var, boolean z) {
        this.n = cg2Var;
        this.m = z;
    }
}
