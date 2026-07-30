package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class hk {
    public final lb2 a;
    public final u30 c = new u30(0);
    public final fk b = new fk(this);
    public final fk d = new fk(1);
    public final fk e = new fk(2);

    public hk(lb2 lb2Var) {
        this.a = lb2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r7.a(r10, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object c(hk hkVar, String str, boolean z, r30 r30Var) {
        xj xjVar;
        Object obj;
        int i;
        Object U;
        if (r30Var instanceof xj) {
            xjVar = (xj) r30Var;
            int i2 = xjVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xjVar.r = i2 - Integer.MIN_VALUE;
                Object obj2 = xjVar.p;
                obj = b50.m;
                i = xjVar.r;
                if (i != 0) {
                    ca2.b(obj2);
                    kk kkVar = new kk(str, false, false, false);
                    xjVar.m = hkVar;
                    xjVar.n = str;
                    xjVar.o = z;
                    xjVar.r = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ca2.b(obj2);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = xjVar.o;
                    str = xjVar.n;
                    hkVar = xjVar.m;
                    ca2.b(obj2);
                }
                xjVar.m = null;
                xjVar.n = null;
                xjVar.o = z;
                xjVar.r = 2;
                U = l41.U(xjVar, hkVar.a, new bk(str, 1, z), false, true);
                if (U != obj) {
                    U = Unit.a;
                }
            }
        }
        xjVar = new xj(hkVar, r30Var);
        Object obj22 = xjVar.p;
        obj = b50.m;
        i = xjVar.r;
        if (i != 0) {
        }
        xjVar.m = null;
        xjVar.n = null;
        xjVar.o = z;
        xjVar.r = 2;
        U = l41.U(xjVar, hkVar.a, new bk(str, 1, z), false, true);
        if (U != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r7.a(r10, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object d(hk hkVar, String str, boolean z, r30 r30Var) {
        yj yjVar;
        Object obj;
        int i;
        Object U;
        if (r30Var instanceof yj) {
            yjVar = (yj) r30Var;
            int i2 = yjVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yjVar.r = i2 - Integer.MIN_VALUE;
                Object obj2 = yjVar.p;
                obj = b50.m;
                i = yjVar.r;
                if (i != 0) {
                    ca2.b(obj2);
                    kk kkVar = new kk(str, false, false, false);
                    yjVar.m = hkVar;
                    yjVar.n = str;
                    yjVar.o = z;
                    yjVar.r = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ca2.b(obj2);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = yjVar.o;
                    str = yjVar.n;
                    hkVar = yjVar.m;
                    ca2.b(obj2);
                }
                yjVar.m = null;
                yjVar.n = null;
                yjVar.o = z;
                yjVar.r = 2;
                U = l41.U(yjVar, hkVar.a, new bk(str, 0, z), false, true);
                if (U != obj) {
                    U = Unit.a;
                }
            }
        }
        yjVar = new yj(hkVar, r30Var);
        Object obj22 = yjVar.p;
        obj = b50.m;
        i = yjVar.r;
        if (i != 0) {
        }
        yjVar.m = null;
        yjVar.n = null;
        yjVar.o = z;
        yjVar.r = 2;
        U = l41.U(yjVar, hkVar.a, new bk(str, 0, z), false, true);
        if (U != obj) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r7 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r7.a(r10, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object e(hk hkVar, String str, boolean z, r30 r30Var) {
        zj zjVar;
        Object obj;
        int i;
        Object U;
        if (r30Var instanceof zj) {
            zjVar = (zj) r30Var;
            int i2 = zjVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zjVar.r = i2 - Integer.MIN_VALUE;
                Object obj2 = zjVar.p;
                obj = b50.m;
                i = zjVar.r;
                if (i != 0) {
                    ca2.b(obj2);
                    kk kkVar = new kk(str, false, false, false);
                    zjVar.m = hkVar;
                    zjVar.n = str;
                    zjVar.o = z;
                    zjVar.r = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ca2.b(obj2);
                            return Unit.a;
                        }
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = zjVar.o;
                    str = zjVar.n;
                    hkVar = zjVar.m;
                    ca2.b(obj2);
                }
                zjVar.m = null;
                zjVar.n = null;
                zjVar.o = z;
                zjVar.r = 2;
                U = l41.U(zjVar, hkVar.a, new bk(str, 2, z), false, true);
                if (U != obj) {
                    U = Unit.a;
                }
            }
        }
        zjVar = new zj(hkVar, r30Var);
        Object obj22 = zjVar.p;
        obj = b50.m;
        i = zjVar.r;
        if (i != 0) {
        }
        zjVar.m = null;
        zjVar.n = null;
        zjVar.o = z;
        zjVar.r = 2;
        U = l41.U(zjVar, hkVar.a, new bk(str, 2, z), false, true);
        if (U != obj) {
        }
    }

    public final Object a(kk kkVar, r30 r30Var) {
        Object U = l41.U(r30Var, this.a, new ek(1, this, kkVar), false, true);
        return U == b50.m ? U : Unit.a;
    }

    public final qn0 b() {
        zd zdVar = new zd(7, this);
        return bd3.p(this.a, new String[]{"atlas_entry"}, zdVar);
    }
}
