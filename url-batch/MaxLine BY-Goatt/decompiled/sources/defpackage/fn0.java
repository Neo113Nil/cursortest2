package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fn0 implements xm0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ fn0(int i, Object obj, Object obj2) {
        this.m = i;
        this.o = obj;
        this.n = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0139, code lost:
    
        if (r10.a(r11, r0) != r2) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    @Override // defpackage.xm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ym0 ym0Var, o30 o30Var) {
        en0 en0Var;
        int i;
        vc2 vc2Var;
        fn0 fn0Var;
        hn0 hn0Var;
        int i2;
        kc0 kc0Var;
        p e;
        int i3 = this.m;
        int i4 = 2;
        int i5 = 4;
        int i6 = 1;
        o30 o30Var2 = null;
        Object obj = this.n;
        Object obj2 = this.o;
        switch (i3) {
            case 0:
                if (o30Var instanceof en0) {
                    en0Var = (en0) o30Var;
                    int i7 = en0Var.n;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        en0Var.n = i7 - Integer.MIN_VALUE;
                        Object obj3 = en0Var.m;
                        b50 b50Var = b50.m;
                        i = en0Var.n;
                        if (i != 0) {
                            ca2.b(obj3);
                            vc2 vc2Var2 = new vc2(ym0Var, en0Var.getContext());
                            try {
                                en0Var.p = this;
                                en0Var.q = ym0Var;
                                en0Var.r = vc2Var2;
                                en0Var.n = 1;
                                if (((t60) obj2).invoke(vc2Var2, en0Var) != b50Var) {
                                    fn0Var = this;
                                    vc2Var = vc2Var2;
                                }
                                return b50Var;
                            } catch (Throwable th) {
                                th = th;
                                vc2Var = vc2Var2;
                                vc2Var.releaseIntercepted();
                                throw th;
                            }
                        }
                        if (i != 1) {
                            if (i == 2) {
                                ca2.b(obj3);
                                return Unit.a;
                            }
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vc2Var = en0Var.r;
                        ym0Var = en0Var.q;
                        fn0Var = en0Var.p;
                        try {
                            ca2.b(obj3);
                        } catch (Throwable th2) {
                            th = th2;
                            vc2Var.releaseIntercepted();
                            throw th;
                        }
                        vc2Var.releaseIntercepted();
                        xm0 xm0Var = (xm0) fn0Var.n;
                        en0Var.p = null;
                        en0Var.q = null;
                        en0Var.r = null;
                        en0Var.n = 2;
                        break;
                    }
                }
                en0Var = new en0(this, o30Var);
                Object obj32 = en0Var.m;
                b50 b50Var2 = b50.m;
                i = en0Var.n;
                if (i != 0) {
                }
                vc2Var.releaseIntercepted();
                xm0 xm0Var2 = (xm0) fn0Var.n;
                en0Var.p = null;
                en0Var.q = null;
                en0Var.r = null;
                en0Var.n = 2;
            case 1:
                Object a = ((xm0) obj).a(new dd(new y72(), ym0Var, (Function2) obj2, 1), o30Var);
                return a == b50.m ? a : Unit.a;
            case 2:
                if (o30Var instanceof hn0) {
                    hn0Var = (hn0) o30Var;
                    int i8 = hn0Var.n;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        hn0Var.n = i8 - Integer.MIN_VALUE;
                        Object obj4 = hn0Var.m;
                        b50 b50Var3 = b50.m;
                        i2 = hn0Var.n;
                        if (i2 != 0) {
                            ca2.b(obj4);
                            fn0 fn0Var2 = (fn0) obj2;
                            kc0 kc0Var2 = new kc0(i6, (u60) obj, ym0Var);
                            try {
                                hn0Var.p = kc0Var2;
                                hn0Var.n = 1;
                                if (fn0Var2.a(kc0Var2, hn0Var) == b50Var3) {
                                    return b50Var3;
                                }
                            } catch (p e2) {
                                kc0Var = kc0Var2;
                                e = e2;
                                if (e.m != kc0Var) {
                                    throw e;
                                }
                                return Unit.a;
                            }
                        } else {
                            if (i2 != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kc0Var = hn0Var.p;
                            try {
                                ca2.b(obj4);
                            } catch (p e3) {
                                e = e3;
                                if (e.m != kc0Var) {
                                }
                                return Unit.a;
                            }
                        }
                        return Unit.a;
                    }
                }
                hn0Var = new hn0(this, o30Var);
                Object obj42 = hn0Var.m;
                b50 b50Var32 = b50.m;
                i2 = hn0Var.n;
                if (i2 != 0) {
                }
                return Unit.a;
            case 3:
                Object j = z71.j(o30Var, ym0Var, new xk(i4, o30Var2, (hg2) obj), (xm0[]) obj2);
                return j == b50.m ? j : Unit.a;
            case 4:
                Object j2 = z71.j(o30Var, ym0Var, new xk(3, o30Var2, (e61) obj), (xm0[]) obj2);
                return j2 == b50.m ? j2 : Unit.a;
            case 5:
                Object j3 = z71.j(o30Var, ym0Var, new xk(i5, o30Var2, (yk) obj), (xm0[]) obj2);
                return j3 == b50.m ? j3 : Unit.a;
            default:
                Object a2 = ((xm0) obj).a(new kc0(i5, ym0Var, (ii1) obj2, false), o30Var);
                return a2 == b50.m ? a2 : Unit.a;
        }
    }

    public /* synthetic */ fn0(xm0 xm0Var, Object obj, int i) {
        this.m = i;
        this.n = xm0Var;
        this.o = obj;
    }
}
