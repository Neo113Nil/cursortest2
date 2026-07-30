package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ws implements d00 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public ws(xs xsVar, z11 z11Var, d00 d00Var) {
        this.d = 0;
        this.g = z11Var;
        this.e = d00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e1, code lost:
    
        if (r11.e(r10, r0) == r2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c8, code lost:
    
        if (r11 == r2) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a3  */
    @Override // defpackage.d00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Object obj, dn dnVar) {
        vs vsVar;
        int i;
        m00 m00Var;
        Object obj2;
        int i2;
        p00 p00Var;
        Object obj3;
        int i3;
        int i4 = this.d;
        boolean z = true;
        Object obj4 = this.e;
        Object obj5 = this.g;
        dn dnVar2 = null;
        switch (i4) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                z11 z11Var = (z11) obj5;
                if (dnVar instanceof vs) {
                    vsVar = (vs) dnVar;
                    int i5 = vsVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        vsVar.j = i5 - Integer.MIN_VALUE;
                        Object obj6 = vsVar.h;
                        tn tnVar = tn.d;
                        i = vsVar.j;
                        if (i != 0) {
                            ca0.v(obj6);
                            Object obj7 = z11Var.d;
                            if (obj7 == op.l || !Intrinsics.a(obj7, obj)) {
                                z11Var.d = obj;
                                vsVar.j = 1;
                                if (((d00) obj4).e(obj, vsVar) == tnVar) {
                                    return tnVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca0.v(obj6);
                        }
                        return Unit.a;
                    }
                }
                vsVar = new vs(this, dnVar);
                Object obj62 = vsVar.h;
                tn tnVar2 = tn.d;
                i = vsVar.j;
                if (i != 0) {
                }
                return Unit.a;
            case 1:
                if (dnVar instanceof m00) {
                    m00Var = (m00) dnVar;
                    int i6 = m00Var.j;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        m00Var.j = i6 - Integer.MIN_VALUE;
                        obj2 = m00Var.i;
                        tn tnVar3 = tn.d;
                        i2 = m00Var.j;
                        if (i2 != 0) {
                            ca0.v(obj2);
                            m00Var.h = this;
                            m00Var.l = obj;
                            m00Var.j = 1;
                            obj2 = ((yo) obj5).b(obj, m00Var);
                            break;
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    dd0.j("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                this = m00Var.h;
                                ca0.v(obj2);
                                if (z) {
                                    return Unit.a;
                                }
                                throw new a(this);
                            }
                            obj = m00Var.l;
                            this = m00Var.h;
                            ca0.v(obj2);
                        }
                        if (!((Boolean) obj2).booleanValue()) {
                            d00 d00Var = (d00) this.e;
                            m00Var.h = this;
                            m00Var.l = null;
                            m00Var.j = 2;
                            break;
                        } else {
                            z = false;
                        }
                        if (z) {
                        }
                    }
                }
                m00Var = new m00(this, dnVar);
                obj2 = m00Var.i;
                tn tnVar32 = tn.d;
                i2 = m00Var.j;
                if (i2 != 0) {
                }
                if (!((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
            case 2:
                if (dnVar instanceof p00) {
                    p00Var = (p00) dnVar;
                    int i7 = p00Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        p00Var.j = i7 - Integer.MIN_VALUE;
                        obj3 = p00Var.i;
                        tn tnVar4 = tn.d;
                        i3 = p00Var.j;
                        if (i3 != 0) {
                            ca0.v(obj3);
                            p00Var.h = this;
                            p00Var.l = obj;
                            p00Var.j = 1;
                            obj3 = ((Function2) obj4).b(obj, p00Var);
                            if (obj3 == tnVar4) {
                                return tnVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                dd0.j("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = p00Var.l;
                            this = p00Var.h;
                            ca0.v(obj3);
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return Unit.a;
                        }
                        ((z11) this.g).d = obj;
                        throw new a(this);
                    }
                }
                p00Var = new p00(this, dnVar);
                obj3 = p00Var.i;
                tn tnVar42 = tn.d;
                i3 = p00Var.j;
                if (i3 != 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
            default:
                ga0 ga0Var = (ga0) obj;
                j6 j6Var = (j6) obj5;
                if (!(ga0Var instanceof bz0)) {
                    sn snVar = (sn) obj4;
                    vg vgVar = j6Var.x;
                    float f = 0.0f;
                    if (vgVar == null) {
                        boolean z2 = j6Var.t;
                        ir irVar = j6Var.w;
                        vgVar = new vg();
                        vgVar.a = z2;
                        vgVar.b = irVar;
                        vgVar.c = new l7(Float.valueOf(0.0f), p4.o, Float.valueOf(0.01f), 8);
                        vgVar.d = new ArrayList();
                        yr1.O(j6Var);
                        j6Var.x = vgVar;
                    }
                    ArrayList arrayList = (ArrayList) vgVar.d;
                    if (ga0Var instanceof q60) {
                        arrayList.add(ga0Var);
                    } else if (ga0Var instanceof r60) {
                        arrayList.remove(((r60) ga0Var).a);
                    } else if (ga0Var instanceof w00) {
                        arrayList.add(ga0Var);
                    } else if (ga0Var instanceof x00) {
                        arrayList.remove(((x00) ga0Var).a);
                    } else if (ga0Var instanceof yt) {
                        arrayList.add(ga0Var);
                    } else if (ga0Var instanceof zt) {
                        arrayList.remove(((zt) ga0Var).a);
                    } else if (ga0Var instanceof xt) {
                        arrayList.remove(((xt) ga0Var).a);
                    }
                    ga0 ga0Var2 = (ga0) CollectionsKt.t(arrayList);
                    if (!Intrinsics.a((ga0) vgVar.e, ga0Var2)) {
                        if (ga0Var2 != null) {
                            ((ir) vgVar.b).invoke();
                            boolean z3 = ga0Var2 instanceof q60;
                            if (z3) {
                                f = 0.08f;
                            } else if (ga0Var2 instanceof w00) {
                                f = 0.1f;
                            } else if (ga0Var2 instanceof yt) {
                                f = 0.16f;
                            }
                            sj1 sj1Var = c41.a;
                            if (!z3) {
                                if (ga0Var2 instanceof w00) {
                                    sj1Var = new sj1(45, qu.a);
                                } else if (ga0Var2 instanceof yt) {
                                    sj1Var = new sj1(45, qu.a);
                                }
                            }
                            uq1.N(snVar, null, new de1(vgVar, f, sj1Var, null), 3);
                        } else {
                            ga0 ga0Var3 = (ga0) vgVar.e;
                            sj1 sj1Var2 = c41.a;
                            if (!(ga0Var3 instanceof q60) && !(ga0Var3 instanceof w00) && (ga0Var3 instanceof yt)) {
                                sj1Var2 = new sj1(150, qu.a);
                            }
                            uq1.N(snVar, null, new d(vgVar, sj1Var2, dnVar2, 21), 3);
                        }
                        vgVar.e = ga0Var2;
                    }
                } else if (j6Var.A) {
                    j6Var.z0((bz0) ga0Var);
                } else {
                    j6Var.B.a(ga0Var);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ ws(Object obj, int i, Object obj2) {
        this.d = i;
        this.g = obj;
        this.e = obj2;
    }

    public ws(Function2 function2, z11 z11Var) {
        this.d = 2;
        this.e = function2;
        this.g = z11Var;
    }
}
