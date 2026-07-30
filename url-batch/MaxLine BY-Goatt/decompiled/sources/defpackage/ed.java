package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import android.widget.Toast;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.majelw.libystne.R;
import defpackage.aa2;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ed extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(tg2 tg2Var, zn1 zn1Var, hz1 hz1Var, o30 o30Var) {
        super(2, o30Var);
        this.m = 13;
        this.o = tg2Var;
        this.q = zn1Var;
        this.p = hz1Var;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                ed edVar = new ed((fz2) this.p, (zn1) obj2, o30Var, 0);
                edVar.o = obj;
                return edVar;
            case 1:
                return new ed((sp) this.o, (ks1) this.p, (Function0) obj2, o30Var, 1);
            case 2:
                ed edVar2 = new ed((ym0) this.p, (jt) obj2, o30Var, 2);
                edVar2.o = obj;
                return edVar2;
            case 3:
                return new ed((ua2) this.o, (zw) this.p, (u42) obj2, o30Var, 3);
            case 4:
                return new ed((c82) this.p, (a32) obj2, o30Var, 4);
            case 5:
                ed edVar3 = new ed((bu2) this.p, (gv2) obj2, o30Var, 5);
                edVar3.o = obj;
                return edVar3;
            case 6:
                ed edVar4 = new ed(6, o30Var, (i70) obj2);
                edVar4.o = obj;
                return edVar4;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ed edVar5 = new ed((i70) this.p, (Function2) obj2, o30Var, 7);
                edVar5.o = obj;
                return edVar5;
            case 8:
                ed edVar6 = new ed((w80) this.p, (Function2) obj2, o30Var, 8);
                edVar6.o = obj;
                return edVar6;
            case 9:
                return new ed((w80) this.o, (ho1) this.p, (Function2) obj2, o30Var, 9);
            case 10:
                return new ed((bn1) this.o, (a41) this.p, (ec0) obj2, o30Var, 10);
            case 11:
                return new ed(11, o30Var, (lq) obj2);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return new ed((uj1) this.o, (Uri) this.p, (InputEvent) obj2, o30Var, 12);
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return new ed((tg2) this.o, (zn1) obj2, (hz1) this.p, o30Var);
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                ed edVar7 = new ed((q72) this.p, (em1) obj2, o30Var, 14);
                edVar7.o = obj;
                return edVar7;
            case 15:
                ed edVar8 = new ed((b41) this.p, (fb) obj2, o30Var, 15);
                edVar8.o = obj;
                return edVar8;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                ed edVar9 = new ed((md0) this.p, (cg2) obj2, o30Var, 16);
                edVar9.o = obj;
                return edVar9;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                ed edVar10 = new ed((cg2) this.p, (Function2) obj2, o30Var, 17);
                edVar10.o = obj;
                return edVar10;
            case 18:
                ed edVar11 = new ed((ot2) this.p, (bu2) obj2, o30Var, 18);
                edVar11.o = obj;
                return edVar11;
            case 19:
                ed edVar12 = new ed((so2) this.p, (jc) obj2, o30Var, 19);
                edVar12.o = obj;
                return edVar12;
            case 20:
                return new ed((ij1) this.o, (Context) this.p, (Uri) obj2, o30Var, 20);
            case 21:
                ed edVar13 = new ed((CoroutineContext) this.p, (xm0) obj2, o30Var, 21);
                edVar13.o = obj;
                return edVar13;
            default:
                return new ed(22, o30Var, (rp3) obj2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((ed) create((d52) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((ed) create((x22) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((ed) create((ym0) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((ed) create((ff2) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return ((ed) create((ag2) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return ((ed) create((ff2) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((ed) create((x22) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((ed) create((d52) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ed) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x057d, code lost:
    
        if (defpackage.iv1.v(r8, r0, r14) != r1) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0530, code lost:
    
        if (r8.d(r9, r14) == r1) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (r0.a(r1, r14) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c6, code lost:
    
        if (defpackage.z71.V(r1, r4, r14) == r2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
    
        if (r15 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ff, code lost:
    
        if (r15 == r1) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0343 A[Catch: all -> 0x0316, TryCatch #2 {all -> 0x0316, blocks: (B:164:0x0312, B:165:0x033b, B:167:0x0343, B:168:0x0350, B:175:0x0360, B:177:0x032d, B:181:0x0363, B:186:0x0369, B:187:0x036a, B:188:0x036b, B:194:0x0327, B:170:0x0351, B:172:0x0357), top: B:160:0x0306, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x036b A[Catch: all -> 0x0316, TRY_LEAVE, TryCatch #2 {all -> 0x0316, blocks: (B:164:0x0312, B:165:0x033b, B:167:0x0343, B:168:0x0350, B:175:0x0360, B:177:0x032d, B:181:0x0363, B:186:0x0369, B:187:0x036a, B:188:0x036b, B:194:0x0327, B:170:0x0351, B:172:0x0357), top: B:160:0x0306, inners: #3 }] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v22, types: [gt] */
    /* JADX WARN: Type inference failed for: r2v24, types: [lq] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [gt] */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0337 -> B:143:0x033b). Please report as a decompilation issue!!! */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        c82 c82Var;
        ym0 ym0Var;
        Object obj3;
        iq iqVar;
        boolean z;
        int i;
        qo1 qo1Var;
        int i2 = 8;
        ?? r2 = 3;
        char c = 3;
        char c2 = 3;
        int i3 = 2;
        int i4 = 0;
        int i5 = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        switch (this.m) {
            case 0:
                fz2 fz2Var = (fz2) this.p;
                b50 b50Var = b50.m;
                int i6 = this.n;
                if (i6 == 0) {
                    ca2.b(obj);
                    d52 d52Var = (d52) this.o;
                    x60 x60Var = new x60(i3, new oh0(new cd(fz2Var, i4), null));
                    dd ddVar = new dd(d52Var, fz2Var, (zn1) this.q, i4);
                    this.n = 1;
                    if (x60Var.a(ddVar, this) == b50Var) {
                        return b50Var;
                    }
                } else {
                    if (i6 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 1:
                sp spVar = (sp) this.o;
                b50 b50Var2 = b50.m;
                int i7 = this.n;
                if (i7 == 0) {
                    ca2.b(obj);
                    h20 h20Var = spVar.A;
                    qp qpVar = new qp(spVar, (ks1) this.p, (Function0) this.q);
                    this.n = 1;
                    h20Var.getClass();
                    w72 w72Var = (w72) qpVar.invoke();
                    if (w72Var == null || h20Var.I0(w72Var, h20Var.I)) {
                        obj2 = Unit.a;
                    } else {
                        fs fsVar = new fs(1, q41.b(this));
                        fsVar.u();
                        g20 g20Var = new g20(qpVar, fsVar);
                        mp mpVar = h20Var.E;
                        eo1 eo1Var = mpVar.a;
                        w72 w72Var2 = (w72) qpVar.invoke();
                        if (w72Var2 == null) {
                            aa2.a aVar = aa2.m;
                            fsVar.resumeWith(Unit.a);
                        } else {
                            fsVar.w(new p8(13, mpVar, g20Var));
                            int i8 = new IntRange(0, eo1Var.o - 1, 1).n;
                            if (i8 >= 0) {
                                while (true) {
                                    w72 w72Var3 = (w72) ((g20) eo1Var.m[i8]).a.invoke();
                                    if (w72Var3 != null) {
                                        w72 c3 = w72Var2.c(w72Var3);
                                        if (c3.equals(w72Var2)) {
                                            eo1Var.a(i8 + 1, g20Var);
                                        } else if (!c3.equals(w72Var3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i9 = eo1Var.o - 1;
                                            if (i9 <= i8) {
                                                while (true) {
                                                    ((g20) eo1Var.m[i8]).b.g(cancellationException);
                                                    if (i9 != i8) {
                                                        i9++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i8 != 0) {
                                        i8--;
                                    }
                                }
                            }
                            eo1Var.a(0, g20Var);
                            if (!h20Var.J) {
                                h20Var.J0();
                            }
                        }
                        obj2 = fsVar.s();
                        if (obj2 != b50.m) {
                            obj2 = Unit.a;
                        }
                    }
                    if (obj2 == b50Var2) {
                        return b50Var2;
                    }
                } else {
                    if (i7 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 2:
                Object obj4 = b50.m;
                int i10 = this.n;
                if (i10 == 0) {
                    ca2.b(obj);
                    a50 a50Var = (a50) this.o;
                    ym0 ym0Var2 = (ym0) this.p;
                    gt g = ((jt) this.q).g(a50Var);
                    this.n = 1;
                    Object k = s03.k(ym0Var2, g, true, this);
                    Object obj5 = k;
                    if (k != obj4) {
                        obj5 = Unit.a;
                    }
                    if (obj5 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i10 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 3:
                u42 u42Var = (u42) this.q;
                zw zwVar = (zw) this.p;
                tn1 tn1Var = zwVar.K;
                b50 b50Var3 = b50.m;
                int i11 = this.n;
                try {
                    if (i11 == 0) {
                        ca2.b(obj);
                        ua2 ua2Var = (ua2) this.o;
                        this.n = 1;
                        if (ua2Var.a(this) == b50Var3) {
                            return b50Var3;
                        }
                    } else {
                        if (i11 != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                    }
                    tn1Var.k(u42Var);
                    z71.F(zwVar);
                    return Unit.a;
                } catch (Throwable th) {
                    tn1Var.k(u42Var);
                    z71.F(zwVar);
                    throw th;
                }
            case 4:
                b50 b50Var4 = b50.m;
                int i12 = this.n;
                if (i12 == 0) {
                    ca2.b(obj);
                    c82 c82Var2 = (c82) this.p;
                    a32 a32Var = (a32) this.q;
                    this.o = c82Var2;
                    this.n = 1;
                    Object a = a32Var.a(this);
                    if (a == b50Var4) {
                        return b50Var4;
                    }
                    obj = a;
                    c82Var = c82Var2;
                } else {
                    if (i12 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c82Var = (c82) this.o;
                    ca2.b(obj);
                }
                c82Var.m = obj;
                return Unit.a;
            case 5:
                b50 b50Var5 = b50.m;
                int i13 = this.n;
                if (i13 == 0) {
                    ca2.b(obj);
                    o40 o40Var = new o40((x22) this.o, (bu2) this.p, (gv2) this.q, null);
                    this.n = 1;
                    if (j8.t(o40Var, this) == b50Var5) {
                        return b50Var5;
                    }
                } else {
                    if (i13 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 6:
                i70 i70Var = (i70) this.q;
                b50 b50Var6 = b50.m;
                int i14 = this.n;
                if (i14 == 0) {
                    ca2.b(obj);
                    ym0 ym0Var3 = (ym0) this.o;
                    this.o = ym0Var3;
                    this.n = 1;
                    Object V = z71.V(i70Var.o.n(), new t60(i70Var, z2 ? 1 : 0, i3), this);
                    if (V != b50Var6) {
                        ym0Var = ym0Var3;
                        obj = V;
                    }
                    return b50Var6;
                }
                if (i14 == 1) {
                    ym0 ym0Var4 = (ym0) this.o;
                    ca2.b(obj);
                    ym0Var = ym0Var4;
                } else if (i14 == 2) {
                    obj3 = (h60) this.p;
                    ym0Var = (ym0) this.o;
                    ca2.b(obj);
                    dn0 dn0Var = new dn0(new x60(i4, new fn0(new fn0(i3, new fn0(i4, new t60(i70Var, z4 ? 1 : 0, i4), i70Var.t.a), new u60(2, null, 0)), new p50(i3, z3 ? 1 : 0, obj3), i5)), new v60(i70Var, (o30) null));
                    this.o = null;
                    this.p = null;
                    this.n = 3;
                    break;
                } else {
                    if (i14 == 3) {
                        ca2.b(obj);
                        return Unit.a;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj3 = (qo2) obj;
                if (obj3 instanceof h60) {
                    h60 h60Var = (h60) obj3;
                    Object obj6 = h60Var.b;
                    this.o = ym0Var;
                    this.p = h60Var;
                    this.n = 2;
                    break;
                } else {
                    if (obj3 instanceof u13) {
                        lh.g("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    if (obj3 instanceof g62) {
                        throw ((g62) obj3).b;
                    }
                    if (obj3 instanceof zl0) {
                        return Unit.a;
                    }
                }
                dn0 dn0Var2 = new dn0(new x60(i4, new fn0(new fn0(i3, new fn0(i4, new t60(i70Var, z4 ? 1 : 0, i4), i70Var.t.a), new u60(2, null, 0)), new p50(i3, z3 ? 1 : 0, obj3), i5)), new v60(i70Var, (o30) null));
                this.o = null;
                this.p = null;
                this.n = 3;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                i70 i70Var2 = (i70) this.p;
                b50 b50Var7 = b50.m;
                int i15 = this.n;
                if (i15 == 0) {
                    ca2.b(obj);
                    a50 a50Var2 = (a50) this.o;
                    dx dxVar = new dx(true);
                    dxVar.R(null);
                    el1 el1Var = new el1((Function2) this.q, dxVar, i70Var2.t.b(), a50Var2.n());
                    js0 js0Var = i70Var2.x;
                    Object d = ((lq) js0Var.o).d(el1Var);
                    if (d instanceof qt) {
                        Throwable th2 = ((qt) d).a;
                        if (th2 == null) {
                            throw new bv("Channel was closed normally");
                        }
                        throw th2;
                    }
                    if (!(d instanceof rt)) {
                        if (((AtomicInteger) ((ar0) js0Var.p).n).getAndIncrement() == 0) {
                            z71.H((a50) js0Var.m, null, new z62(4, z5 ? 1 : 0, js0Var), 3);
                        }
                        this.n = 1;
                        Object t = dxVar.t(this);
                        return t == b50Var7 ? b50Var7 : t;
                    }
                    lh.g("Check failed.");
                } else {
                    if (i15 == 1) {
                        ca2.b(obj);
                        return obj;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 8:
                lz1 lz1Var = ((w80) this.p).d;
                b50 b50Var8 = b50.m;
                int i16 = this.n;
                try {
                    if (i16 == 0) {
                        ca2.b(obj);
                        ff2 ff2Var = (ff2) this.o;
                        lz1Var.setValue(Boolean.TRUE);
                        Function2 function2 = (Function2) this.q;
                        this.n = 1;
                        if (function2.invoke(ff2Var, this) == b50Var8) {
                            return b50Var8;
                        }
                    } else {
                        if (i16 != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                    }
                    lz1Var.setValue(Boolean.FALSE);
                    return Unit.a;
                } catch (Throwable th3) {
                    lz1Var.setValue(Boolean.FALSE);
                    throw th3;
                }
            case 9:
                b50 b50Var9 = b50.m;
                int i17 = this.n;
                if (i17 == 0) {
                    ca2.b(obj);
                    w80 w80Var = (w80) this.o;
                    mo1 mo1Var = w80Var.c;
                    v80 v80Var = w80Var.b;
                    ho1 ho1Var = (ho1) this.p;
                    ed edVar = new ed((Object) w80Var, this.q, (o30) (z6 ? 1 : 0), i2);
                    this.n = 1;
                    mo1Var.getClass();
                    if (j8.t(new lo1(ho1Var, mo1Var, edVar, v80Var, null), this) == b50Var9) {
                        return b50Var9;
                    }
                } else {
                    if (i17 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 10:
                b50 b50Var10 = b50.m;
                int i18 = this.n;
                if (i18 == 0) {
                    ca2.b(obj);
                    bn1 bn1Var = (bn1) this.o;
                    a41 a41Var = (a41) this.p;
                    this.n = 1;
                    if (bn1Var.b(a41Var, this) == b50Var10) {
                        return b50Var10;
                    }
                } else {
                    if (i18 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                ec0 ec0Var = (ec0) this.q;
                if (ec0Var != null) {
                    ec0Var.a();
                }
                return Unit.a;
            case 11:
                b50 b50Var11 = b50.m;
                int i19 = this.n;
                try {
                    if (i19 == 0) {
                        ca2.b(obj);
                        r2 = (lq) this.q;
                        iqVar = new iq(r2);
                        this.o = r2;
                        this.p = iqVar;
                        this.n = 1;
                        obj = iqVar.b(this);
                        r2 = r2;
                        if (obj == b50Var11) {
                        }
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i19 != 1) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iqVar = (iq) this.p;
                        gt gtVar = (gt) this.o;
                        ca2.b(obj);
                        r2 = gtVar;
                        if (((Boolean) obj).booleanValue()) {
                            nv0.b.set(false);
                            synchronized (tm2.c) {
                                un1 un1Var = tm2.j.h;
                                z = un1Var != null && un1Var.h();
                            }
                            if (z) {
                                tm2.a();
                            }
                            this.o = r2;
                            this.p = iqVar;
                            this.n = 1;
                            obj = iqVar.b(this);
                            r2 = r2;
                            if (obj == b50Var11) {
                                return b50Var11;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                Unit unit = Unit.a;
                                r2.f(null);
                                return Unit.a;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CancellationException cancellationException2 = th4 instanceof CancellationException ? th4 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th4);
                        }
                        r2.f(cancellationException2);
                        throw th5;
                    }
                }
                break;
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                b50 b50Var12 = b50.m;
                int i20 = this.n;
                if (i20 == 0) {
                    ca2.b(obj);
                    j8 j8Var = ((uj1) this.o).a;
                    Uri uri = (Uri) this.p;
                    InputEvent inputEvent = (InputEvent) this.q;
                    this.n = 1;
                    if (j8Var.R(uri, inputEvent, this) == b50Var12) {
                        return b50Var12;
                    }
                } else {
                    if (i20 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                zn1 zn1Var = (zn1) this.q;
                b50 b50Var13 = b50.m;
                int i21 = this.n;
                if (i21 == 0) {
                    ca2.b(obj);
                    cp1 cp1Var = (cp1) ((List) zn1Var.getValue()).get(((List) zn1Var.getValue()).size() - 2);
                    tg2 tg2Var = (tg2) this.o;
                    float h = ((hz1) this.p).h();
                    this.n = 1;
                    if (tg2Var.E(h, cp1Var, this) == b50Var13) {
                        return b50Var13;
                    }
                } else {
                    if (i21 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                b50 b50Var14 = b50.m;
                int i22 = this.n;
                if (i22 != 0) {
                    if (i22 == 1) {
                        ca2.b(obj);
                        return Unit.a;
                    }
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                a50 a50Var3 = (a50) this.o;
                q72 q72Var = (q72) this.p;
                em1 em1Var = (em1) this.q;
                this.n = 1;
                q72Var.a(a50Var3, em1Var, this);
                return b50Var14;
            case 15:
                b50 b50Var15 = b50.m;
                int i23 = this.n;
                if (i23 == 0) {
                    ca2.b(obj);
                    a50 a50Var4 = (a50) this.o;
                    xm0 a2 = ((b41) this.p).a();
                    kc0 kc0Var = new kc0(6, (fb) this.q, a50Var4);
                    this.n = 1;
                    if (a2.a(kc0Var, this) == b50Var15) {
                        return b50Var15;
                    }
                } else {
                    if (i23 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                b50 b50Var16 = b50.m;
                int i24 = this.n;
                if (i24 == 0) {
                    ca2.b(obj);
                    ag2 ag2Var = (ag2) this.o;
                    md0 md0Var = (md0) this.p;
                    p8 p8Var = new p8(29, ag2Var, (cg2) this.q);
                    this.n = 1;
                    if (md0Var.invoke(p8Var, this) == b50Var16) {
                        return b50Var16;
                    }
                } else {
                    if (i24 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                b50 b50Var17 = b50.m;
                int i25 = this.n;
                if (i25 == 0) {
                    ca2.b(obj);
                    ff2 ff2Var2 = (ff2) this.o;
                    cg2 cg2Var = (cg2) this.p;
                    cg2Var.h = ff2Var2;
                    Function2 function22 = (Function2) this.q;
                    ag2 ag2Var2 = cg2Var.i;
                    this.n = 1;
                    if (function22.invoke(ag2Var2, this) == b50Var17) {
                        return b50Var17;
                    }
                } else {
                    if (i25 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 18:
                b50 b50Var18 = b50.m;
                int i26 = this.n;
                if (i26 == 0) {
                    ca2.b(obj);
                    x22 x22Var = (x22) this.o;
                    vr2 vr2Var = (vr2) x22Var;
                    vr2Var.getClass();
                    sb1 sb1Var = new sb1((ot2) this.p, new yf(s03.J(vr2Var).K), (bu2) this.q, null);
                    this.n = 1;
                    if (yj1.j(x22Var, sb1Var, this) == b50Var18) {
                        return b50Var18;
                    }
                } else {
                    if (i26 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 19:
                b50 b50Var19 = b50.m;
                int i27 = this.n;
                if (i27 == 0) {
                    ca2.b(obj);
                    a50 a50Var5 = (a50) this.o;
                    x60 x60Var2 = new x60(i3, new oh0(new bq1((so2) this.p, c), null));
                    kc0 kc0Var2 = new kc0(i2, (jc) this.q, a50Var5);
                    this.n = 1;
                    if (x60Var2.a(kc0Var2, this) == b50Var19) {
                        return b50Var19;
                    }
                } else {
                    if (i27 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 20:
                Context context = (Context) this.p;
                b50 b50Var20 = b50.m;
                int i28 = this.n;
                if (i28 == 0) {
                    ca2.b(obj);
                    t80 t80Var = vb0.a;
                    j80 j80Var = j80.o;
                    va0 va0Var = new va0((Object) context, this.q, (o30) (z7 ? 1 : 0), (int) c2);
                    this.n = 1;
                    obj = z71.V(j80Var, va0Var, this);
                    break;
                } else {
                    if (i28 != 1) {
                        if (i28 != 2) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ca2.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            i = R.string.import_ok;
                            Toast.makeText(context, context.getString(i), 0).show();
                            return Unit.a;
                        }
                        i = R.string.import_fail;
                        Toast.makeText(context, context.getString(i), 0).show();
                        return Unit.a;
                    }
                    ca2.b(obj);
                }
                String str = (String) obj;
                if (str != null) {
                    ij1 ij1Var = (ij1) this.o;
                    this.n = 2;
                    t80 t80Var2 = vb0.a;
                    obj = z71.V(j80.o, new gj1(str, ij1Var, null), this);
                    break;
                }
                i = R.string.import_fail;
                Toast.makeText(context, context.getString(i), 0).show();
                return Unit.a;
            case 21:
                xm0 xm0Var = (xm0) this.q;
                CoroutineContext coroutineContext = (CoroutineContext) this.p;
                b50 b50Var21 = b50.m;
                int i29 = this.n;
                if (i29 == 0) {
                    ca2.b(obj);
                    d52 d52Var2 = (d52) this.o;
                    if (!Intrinsics.b(coroutineContext, h.m)) {
                        z62 z62Var = new z62(xm0Var, d52Var2, z8 ? 1 : 0, 5);
                        this.n = 2;
                        break;
                    } else {
                        cn2 cn2Var = new cn2(d52Var2, 0);
                        this.n = 1;
                        break;
                    }
                } else {
                    if (i29 != 1 && i29 != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            default:
                rp3 rp3Var = (rp3) this.q;
                b50 b50Var22 = b50.m;
                int i30 = this.n;
                if (i30 == 0) {
                    ca2.b(obj);
                    tg2 tg2Var2 = (tg2) rp3Var;
                    tg2Var2.getClass();
                    ((hn2) jz2.a.getValue()).c(tg2Var2, cv2.u, tg2Var2.s);
                    qo1 qo1Var2 = tg2Var2.v;
                    this.o = qo1Var2;
                    this.p = rp3Var;
                    this.n = 1;
                    if (qo1Var2.f(this) == b50Var22) {
                        return b50Var22;
                    }
                    qo1Var = qo1Var2;
                } else {
                    if (i30 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rp3Var = (rp3) this.p;
                    qo1Var = (qo1) this.o;
                    ca2.b(obj);
                }
                try {
                    ((tg2) rp3Var).p = rp3Var.k();
                    fs fsVar2 = ((tg2) rp3Var).u;
                    if (fsVar2 != null) {
                        aa2.a aVar2 = aa2.m;
                        fsVar2.resumeWith(rp3Var.k());
                    }
                    ((tg2) rp3Var).u = null;
                    Unit unit2 = Unit.a;
                    qo1Var.b(null);
                    return Unit.a;
                } catch (Throwable th6) {
                    qo1Var.b(null);
                    throw th6;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed(int i, o30 o30Var, Object obj) {
        super(2, o30Var);
        this.m = i;
        this.q = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed(Object obj, Object obj2, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.p = obj;
        this.q = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed(Object obj, Object obj2, Object obj3, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }
}
