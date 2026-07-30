package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class w extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public final /* synthetic */ long o;
    public Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, long j, Object obj2, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.q = obj;
        this.o = j;
        this.r = obj2;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.r;
        Object obj3 = this.q;
        switch (i) {
            case 0:
                return new w((nu) obj3, this.o, (bn1) obj2, o30Var, 0);
            case 1:
                w wVar = new w((cg2) obj3, this.o, (z72) obj2, o30Var, 1);
                wVar.p = obj;
                return wVar;
            default:
                return new w((zn1) obj3, this.o, (bn1) obj2, o30Var, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((w) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((w) create((ag2) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                return ((w) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        if (r8.b(r10, r18) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b6, code lost:
    
        if (defpackage.n90.a(r9, r18) != r0) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0190  */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [ul1] */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fs1 fs1Var;
        int i;
        u42 u42Var;
        zn1 zn1Var;
        u42 u42Var2;
        u42 u42Var3;
        int i2 = this.m;
        long j = this.o;
        Object obj2 = this.q;
        Object obj3 = this.r;
        eo1 eo1Var = null;
        switch (i2) {
            case 0:
                nu nuVar = (nu) obj2;
                b50 b50Var = b50.m;
                int i3 = this.n;
                if (i3 == 0) {
                    ca2.b(obj);
                    y72 y72Var = new y72();
                    lu luVar = new lu(y72Var, 0);
                    if (!nuVar.m.z) {
                        h21.b("visitAncestors called on an unattached node");
                    }
                    ul1 ul1Var = nuVar.m.q;
                    i91 J = s03.J(nuVar);
                    while (J != null) {
                        int i4 = 262144;
                        if ((J.P.f.p & 262144) != 0) {
                            while (ul1Var != null) {
                                if ((ul1Var.o & i4) != 0) {
                                    eo1 eo1Var2 = eo1Var;
                                    p90 p90Var = ul1Var;
                                    while (p90Var != 0) {
                                        if (p90Var instanceof rz2) {
                                            rz2 rz2Var = (rz2) p90Var;
                                            if (!(kf2.B != rz2Var.r() ? true : ((Boolean) luVar.invoke(rz2Var)).booleanValue())) {
                                                if (!y72Var.m) {
                                                    int i5 = ou.b;
                                                    ViewParent parent = s93.Q(nuVar).getParent();
                                                    while (parent != null && (parent instanceof ViewGroup)) {
                                                        ViewGroup viewGroup = (ViewGroup) parent;
                                                        if (!viewGroup.shouldDelayChildPressedState()) {
                                                            parent = viewGroup.getParent();
                                                        }
                                                    }
                                                }
                                                long j2 = ou.a;
                                                this.n = 1;
                                                break;
                                            }
                                        } else if ((p90Var.o & i4) != 0 && (p90Var instanceof p90)) {
                                            ul1 ul1Var2 = p90Var.B;
                                            int i6 = 0;
                                            ul1 ul1Var3 = p90Var;
                                            while (ul1Var2 != null) {
                                                int i7 = i4;
                                                if ((ul1Var2.o & i7) != 0) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        ul1Var3 = ul1Var2;
                                                    } else {
                                                        eo1 eo1Var3 = eo1Var2 == null ? new eo1(new ul1[16]) : eo1Var2;
                                                        if (ul1Var3 != null) {
                                                            eo1Var3.b(ul1Var3);
                                                            ul1Var3 = null;
                                                        }
                                                        eo1Var3.b(ul1Var2);
                                                        eo1Var2 = eo1Var3;
                                                    }
                                                }
                                                ul1Var2 = ul1Var2.r;
                                                i4 = i7;
                                                ul1Var3 = ul1Var3;
                                            }
                                            i = i4;
                                            if (i6 == 1) {
                                                i4 = i;
                                                p90Var = ul1Var3;
                                            }
                                            ul1Var3 = s03.c(eo1Var2);
                                            i4 = i;
                                            p90Var = ul1Var3;
                                        }
                                        i = i4;
                                        ul1Var3 = s03.c(eo1Var2);
                                        i4 = i;
                                        p90Var = ul1Var3;
                                    }
                                }
                                ul1Var = ul1Var.q;
                                i4 = i4;
                                eo1Var = null;
                            }
                        }
                        J = J.u();
                        ul1Var = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
                        eo1Var = null;
                    }
                    if (!y72Var.m) {
                    }
                    long j22 = ou.a;
                    this.n = 1;
                } else if (i3 == 1) {
                    ca2.b(obj);
                } else if (i3 != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    u42Var = (u42) this.p;
                    ca2.b(obj);
                    nuVar.M = u42Var;
                    break;
                }
                u42 u42Var4 = new u42(j);
                this.p = u42Var4;
                this.n = 2;
                if (((bn1) obj3).b(u42Var4, this) != b50Var) {
                    u42Var = u42Var4;
                    nuVar.M = u42Var;
                }
                break;
            case 1:
                cg2 cg2Var = (cg2) obj2;
                b50 b50Var2 = b50.m;
                int i8 = this.n;
                if (i8 == 0) {
                    ca2.b(obj);
                    ag2 ag2Var = (ag2) this.p;
                    float f = cg2Var.f(j);
                    m8 m8Var = new m8((z72) obj3, cg2Var, ag2Var, 6);
                    this.n = 1;
                    if (nk2.d(0.0f, f, null, m8Var, this, 12) == b50Var2) {
                        break;
                    }
                } else if (i8 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    ca2.b(obj);
                }
                break;
            default:
                bn1 bn1Var = (bn1) obj3;
                zn1 zn1Var2 = (zn1) obj2;
                b50 b50Var3 = b50.m;
                int i9 = this.n;
                if (i9 == 0) {
                    ca2.b(obj);
                    u42 u42Var5 = (u42) zn1Var2.getValue();
                    if (u42Var5 != null) {
                        t42 t42Var = new t42(u42Var5);
                        if (bn1Var != null) {
                            this.p = zn1Var2;
                            this.n = 1;
                            break;
                        }
                        zn1Var = zn1Var2;
                    }
                    u42Var2 = new u42(j);
                    if (bn1Var != null) {
                        this.p = u42Var2;
                        this.n = 2;
                        if (bn1Var.b(u42Var2, this) != b50Var3) {
                            u42Var3 = u42Var2;
                            u42Var2 = u42Var3;
                        }
                        break;
                    }
                    zn1Var2.setValue(u42Var2);
                } else if (i9 == 1) {
                    zn1Var = (zn1) this.p;
                    ca2.b(obj);
                } else if (i9 != 2) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    u42Var3 = (u42) this.p;
                    ca2.b(obj);
                    u42Var2 = u42Var3;
                    zn1Var2.setValue(u42Var2);
                    break;
                }
                zn1Var.setValue(null);
                u42Var2 = new u42(j);
                if (bn1Var != null) {
                }
                zn1Var2.setValue(u42Var2);
        }
        return Unit.a;
    }
}
