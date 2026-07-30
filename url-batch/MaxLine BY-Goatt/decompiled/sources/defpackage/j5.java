package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.view.ScrollCaptureSession;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.majelw.libystne.data.MaxLineDatabase_Impl;
import defpackage.aa2;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j5 extends pr2 implements Function2 {
    public final /* synthetic */ int m;
    public int n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;
    public Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(Object obj, jc jcVar, zn1 zn1Var, zn1 zn1Var2, o30 o30Var) {
        super(2, o30Var);
        this.m = 2;
        this.q = obj;
        this.r = jcVar;
        this.o = zn1Var;
        this.p = zn1Var2;
    }

    @Override // defpackage.hn
    public final o30 create(Object obj, o30 o30Var) {
        int i = this.m;
        Object obj2 = this.q;
        switch (i) {
            case 0:
                return new j5((ij1) obj2, (Uri) this.r, (zn1) this.p, o30Var);
            case 1:
                j5 j5Var = new j5((Function1) this.p, (ea) obj2, (nc1) this.r, o30Var, 1);
                j5Var.o = obj;
                return j5Var;
            case 2:
                return new j5(this.q, (jc) this.r, (zn1) this.o, (zn1) this.p, o30Var);
            case 3:
                return new j5((lz) this.o, (ScrollCaptureSession) this.p, (Rect) obj2, (Consumer) this.r, o30Var, 3);
            case 4:
                j5 j5Var2 = new j5((h20) this.p, (z23) obj2, (wp) this.r, o30Var, 4);
                j5Var2.o = obj;
                return j5Var2;
            case 5:
                j5 j5Var3 = new j5((xm0) this.p, (vo2) obj2, this.r, o30Var, 5);
                j5Var3.o = obj;
                return j5Var3;
            case 6:
                return new j5((po2) this.o, (xm0) this.p, (vo2) obj2, this.r, o30Var, 6);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return new j5((ij1) obj2, o30Var);
            case 8:
                j5 j5Var4 = new j5((tg2) this.p, (cp1) obj2, (fz2) this.r, o30Var, 8);
                j5Var4.o = obj;
                return j5Var4;
            case 9:
                j5 j5Var5 = new j5((lb2) this.p, (fs) obj2, (z62) this.r, o30Var, 9);
                j5Var5.o = obj;
                return j5Var5;
            case 10:
                j5 j5Var6 = new j5((Function1) this.p, (AtomicReference) obj2, (Function2) this.r, o30Var, 10);
                j5Var6.o = obj;
                return j5Var6;
            case 11:
                j5 j5Var7 = new j5((x22) this.p, (xt0) obj2, (y30) this.r, o30Var, 11);
                j5Var7.o = obj;
                return j5Var7;
            default:
                j5 j5Var8 = new j5((f03) this.p, (int[]) obj2, (String[]) this.r, o30Var, 12);
                j5Var8.o = obj;
                return j5Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.m) {
            case 0:
                return ((j5) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 1:
                ((j5) create((ua) obj, (o30) obj2)).invokeSuspend(Unit.a);
                return b50.m;
            case 2:
                return ((j5) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((j5) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((j5) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((j5) create((al2) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((j5) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((j5) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((j5) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 9:
                return ((j5) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((j5) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((j5) create((a50) obj, (o30) obj2)).invokeSuspend(Unit.a);
            default:
                ((j5) create((ym0) obj, (o30) obj2)).invokeSuspend(Unit.a);
                return b50.m;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ab, code lost:
    
        if (r2 == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0199, code lost:
    
        if (r1 == r0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0285, code lost:
    
        if (r0 == r7) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02bb, code lost:
    
        if (defpackage.nk2.d(r1, 0.0f, r2, r3, r24, 4) == r7) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0426, code lost:
    
        if (r3 != r10) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0320, code lost:
    
        if (r9 == r10) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04dd, code lost:
    
        if (r0.a(r7, r24) == r1) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x04bc, code lost:
    
        if (r0.a(r7, r24) == r1) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04d4, code lost:
    
        if (defpackage.iv1.A(r2, r3, r24) == r1) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0536, code lost:
    
        if (r0 == r1) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0099, code lost:
    
        if (r10 == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03eb A[LOOP:5: B:172:0x03e5->B:174:0x03eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00df A[Catch: all -> 0x00f2, TryCatch #2 {all -> 0x00f2, blocks: (B:19:0x00dc, B:21:0x00df, B:23:0x00ef), top: B:18:0x00dc }] */
    /* JADX WARN: Type inference failed for: r1v100 */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v22, types: [mp] */
    /* JADX WARN: Type inference failed for: r1v69, types: [kotlin.coroutines.e] */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    /* JADX WARN: Type inference failed for: r1v77, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o30] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v40 */
    @Override // defpackage.hn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object V;
        zn1 zn1Var;
        Object a;
        JSONArray jSONArray;
        Object U;
        JSONArray jSONArray2;
        Object U2;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        Object U3;
        Object obj2;
        Object V2;
        o30 o30Var;
        hj2 hj2Var;
        Object invoke;
        ym0 ym0Var;
        long j;
        Object D;
        ym0 ym0Var2;
        int i = this.m;
        int i2 = 2;
        Object obj3 = this.q;
        int i3 = 1;
        ?? r9 = 0;
        r9 = 0;
        switch (i) {
            case 0:
                b50 b50Var = b50.m;
                int i4 = this.n;
                if (i4 == 0) {
                    ca2.b(obj);
                    zn1 zn1Var2 = (zn1) this.p;
                    Uri uri = (Uri) this.r;
                    this.o = zn1Var2;
                    this.n = 1;
                    t80 t80Var = vb0.a;
                    V = z71.V(j80.o, new va0((ij1) obj3, uri, (o30) r9, i2), this);
                    if (V == b50Var) {
                        return b50Var;
                    }
                    zn1Var = zn1Var2;
                } else {
                    if (i4 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zn1Var = (zn1) this.o;
                    ca2.b(obj);
                    V = obj;
                }
                zn1Var.setValue((String) V);
                return Unit.a;
            case 1:
                b50 b50Var2 = b50.m;
                int i5 = this.n;
                if (i5 == 0) {
                    ca2.b(obj);
                    da daVar = new da((ua) this.o, (Function1) this.p, (ea) obj3, (nc1) this.r, null, 0);
                    this.n = 1;
                    if (j8.t(daVar, this) == b50Var2) {
                        return b50Var2;
                    }
                } else {
                    if (i5 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                throw new k81();
            case 2:
                jc jcVar = (jc) this.r;
                b50 b50Var3 = b50.m;
                int i6 = this.n;
                if (i6 == 0) {
                    ca2.b(obj);
                    if (!Intrinsics.b(obj3, jcVar.e.getValue())) {
                        jc jcVar2 = (jc) this.r;
                        zn1 zn1Var3 = (zn1) this.o;
                        eo2 eo2Var = lc.a;
                        md mdVar = (md) zn1Var3.getValue();
                        this.n = 1;
                        if (jc.c(jcVar2, this.q, mdVar, null, this, 12) == b50Var3) {
                            return b50Var3;
                        }
                    }
                    return Unit.a;
                }
                if (i6 != 1) {
                    lh.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ca2.b(obj);
                zn1 zn1Var4 = (zn1) this.p;
                eo2 eo2Var2 = lc.a;
                Function1 function1 = (Function1) zn1Var4.getValue();
                if (function1 != null) {
                    function1.invoke(jcVar.d());
                }
                return Unit.a;
            case 3:
                b50 b50Var4 = b50.m;
                int i7 = this.n;
                if (i7 == 0) {
                    ca2.b(obj);
                    lz lzVar = (lz) this.o;
                    ScrollCaptureSession scrollCaptureSession = (ScrollCaptureSession) this.p;
                    Rect rect = (Rect) obj3;
                    u31 u31Var = new u31(rect.left, rect.top, rect.right, rect.bottom);
                    this.n = 1;
                    a = lz.a(lzVar, scrollCaptureSession, u31Var, this);
                    if (a == b50Var4) {
                        return b50Var4;
                    }
                } else {
                    if (i7 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                    a = obj;
                }
                ((Consumer) this.r).accept(bd3.H((u31) a));
                return Unit.a;
            case 4:
                h20 h20Var = (h20) this.p;
                ?? r1 = h20Var.E;
                b50 b50Var5 = b50.m;
                int i8 = this.n;
                try {
                    try {
                        if (i8 == 0) {
                            ca2.b(obj);
                            g61 E = l41.E(((a50) this.o).n());
                            h20Var.J = true;
                            cg2 cg2Var = h20Var.B;
                            ho1 ho1Var = ho1.m;
                            da daVar2 = new da((z23) obj3, h20Var, (wp) this.r, E, null, 1);
                            this.n = 1;
                            if (cg2Var.e(ho1Var, daVar2, this) == b50Var5) {
                                return b50Var5;
                            }
                        } else {
                            if (i8 != 1) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ca2.b(obj);
                        }
                        r1.b();
                        h20Var.J = false;
                        r1.a(null);
                        h20Var.H = false;
                        return Unit.a;
                    } catch (CancellationException e) {
                        r9 = e;
                        throw r9;
                    }
                } catch (Throwable th) {
                    h20Var.J = false;
                    r1.a(r9);
                    h20Var.H = false;
                    throw th;
                }
            case 5:
                vo2 vo2Var = (vo2) obj3;
                b50 b50Var6 = b50.m;
                int i9 = this.n;
                if (i9 == 0) {
                    ca2.b(obj);
                    int ordinal = ((al2) this.o).ordinal();
                    if (ordinal == 0) {
                        xm0 xm0Var = (xm0) this.p;
                        this.n = 1;
                        if (xm0Var.a(vo2Var, this) == b50Var6) {
                            return b50Var6;
                        }
                    } else if (ordinal != 1) {
                        if (ordinal != 2) {
                            a.b();
                            return null;
                        }
                        Object obj4 = this.r;
                        if (obj4 == s93.m) {
                            throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                        }
                        vo2Var.i(obj4);
                    }
                } else {
                    if (i9 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 6:
                xm0 xm0Var2 = (xm0) this.p;
                vo2 vo2Var2 = (vo2) obj3;
                b50 b50Var7 = b50.m;
                int i10 = this.n;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ca2.b(obj);
                            this.n = 3;
                            break;
                        } else if (i10 != 3 && i10 != 4) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    ca2.b(obj);
                    return Unit.a;
                }
                ca2.b(obj);
                po2 po2Var = (po2) this.o;
                if (po2Var == bl2.a) {
                    this.n = 1;
                    break;
                } else {
                    o30 o30Var2 = null;
                    if (po2Var == bl2.b) {
                        kq2 h = vo2Var2.h();
                        pn0 pn0Var = new pn0(2, null);
                        this.n = 2;
                        break;
                    } else {
                        xm0 t = iv1.t(iv1.t(new fn0(iv1.X(vo2Var2.h(), new oo2(po2Var, null)), new u60(2, null, 2), i3)));
                        j5 j5Var = new j5(xm0Var2, vo2Var2, this.r, o30Var2, 5);
                        this.n = 4;
                        int i11 = jn0.a;
                        Object a2 = iv1.n(iv1.X(t, new xk(j5Var, o30Var2, i3)), 0).a(us1.m, this);
                        if (a2 != b50Var7) {
                            a2 = Unit.a;
                        }
                        if (a2 != b50Var7) {
                            a2 = Unit.a;
                            break;
                        }
                    }
                }
                return b50Var7;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                ij1 ij1Var = (ij1) obj3;
                z51 z51Var = ij1Var.c;
                b50 b50Var8 = b50.m;
                int i12 = this.n;
                if (i12 == 0) {
                    ca2.b(obj);
                    jSONArray = new JSONArray();
                    this.o = jSONArray;
                    this.n = 1;
                    U = l41.U(this, z51Var.a, new zd(18), true, false);
                    break;
                } else if (i12 == 1) {
                    jSONArray = (JSONArray) this.o;
                    ca2.b(obj);
                    U = obj;
                } else {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            lh.g("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jSONArray4 = (JSONArray) this.r;
                        jSONArray2 = (JSONArray) this.p;
                        jSONArray3 = (JSONArray) this.o;
                        ca2.b(obj);
                        U3 = obj;
                        for (kk kkVar : (Iterable) U3) {
                            jSONArray4.put(new JSONObject().put("slug", kkVar.a).put("studied", kkVar.b).put("favourite", kkVar.c).put("owned", kkVar.d));
                        }
                        return new JSONObject().put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, 1).put(FirebaseAnalytics.Param.ITEMS, jSONArray3).put("links", jSONArray2).put("progress", jSONArray4).toString();
                    }
                    JSONArray jSONArray5 = (JSONArray) this.p;
                    JSONArray jSONArray6 = (JSONArray) this.o;
                    ca2.b(obj);
                    jSONArray2 = jSONArray5;
                    jSONArray3 = jSONArray6;
                    U2 = obj;
                    for (h51 h51Var : (Iterable) U2) {
                        jSONArray2.put(new JSONObject().put("itemId", h51Var.a).put("atlasSlug", h51Var.b));
                    }
                    jSONArray4 = new JSONArray();
                    hk hkVar = ij1Var.b;
                    this.o = jSONArray3;
                    this.p = jSONArray2;
                    this.r = jSONArray4;
                    this.n = 3;
                    U3 = l41.U(this, hkVar.a, new zd(4), true, false);
                    break;
                }
                for (a61 a61Var : (Iterable) U) {
                    JSONObject put = new JSONObject().put("id", a61Var.a).put("name", a61Var.b).put("type", a61Var.c).put("metal", a61Var.d);
                    Object obj5 = a61Var.e;
                    if (obj5 == null) {
                        obj5 = JSONObject.NULL;
                    }
                    JSONObject put2 = put.put("fineness", obj5);
                    Object obj6 = a61Var.f;
                    if (obj6 == null) {
                        obj6 = JSONObject.NULL;
                    }
                    JSONObject put3 = put2.put("weightGrams", obj6);
                    Object obj7 = a61Var.g;
                    if (obj7 == null) {
                        obj7 = JSONObject.NULL;
                    }
                    JSONObject put4 = put3.put("purchaseDateEpochDay", obj7);
                    Object obj8 = a61Var.h;
                    if (obj8 == null) {
                        obj8 = JSONObject.NULL;
                    }
                    JSONObject put5 = put4.put("place", obj8);
                    Object obj9 = a61Var.i;
                    if (obj9 == null) {
                        obj9 = JSONObject.NULL;
                    }
                    JSONObject put6 = put5.put("valueEntered", obj9);
                    Object obj10 = a61Var.j;
                    if (obj10 == null) {
                        obj10 = JSONObject.NULL;
                    }
                    JSONObject put7 = put6.put("notes", obj10);
                    Object obj11 = a61Var.k;
                    if (obj11 == null) {
                        obj11 = JSONObject.NULL;
                    }
                    jSONArray.put(put7.put("photoUri", obj11).put("favourite", a61Var.l).put("createdAt", a61Var.m));
                }
                jSONArray2 = new JSONArray();
                this.o = jSONArray;
                this.p = jSONArray2;
                this.n = 2;
                U2 = l41.U(this, z51Var.a, new zd(17), true, false);
                if (U2 != b50Var8) {
                    jSONArray3 = jSONArray;
                    while (r0.hasNext()) {
                    }
                    jSONArray4 = new JSONArray();
                    hk hkVar2 = ij1Var.b;
                    this.o = jSONArray3;
                    this.p = jSONArray2;
                    this.r = jSONArray4;
                    this.n = 3;
                    U3 = l41.U(this, hkVar2.a, new zd(4), true, false);
                }
                return b50Var8;
            case 8:
                cp1 cp1Var = (cp1) obj3;
                tg2 tg2Var = (tg2) this.p;
                Object obj12 = b50.m;
                int i13 = this.n;
                if (i13 == 0) {
                    ca2.b(obj);
                    a50 a50Var = (a50) this.o;
                    lz1 lz1Var = tg2Var.o;
                    hz1 hz1Var = tg2Var.t;
                    o30 o30Var3 = null;
                    if (Intrinsics.b(lz1Var.getValue(), cp1Var)) {
                        long longValue = ((Number) ((fz2) this.r).l.getValue()).longValue() / 1000000;
                        float h2 = hz1Var.h();
                        h03 P = bd3.P((int) (hz1Var.h() * longValue), 6, null);
                        m8 m8Var = new m8(a50Var, tg2Var, cp1Var, 5);
                        this.n = 2;
                        break;
                    } else {
                        this.n = 1;
                        fz2 fz2Var = tg2Var.q;
                        if (fz2Var == null) {
                            obj2 = Unit.a;
                            break;
                        } else {
                            Object a3 = no1.a(tg2Var.w, new mg2(fz2Var, tg2Var, cp1Var, o30Var3, 0), this);
                            obj2 = a3;
                            if (a3 != obj12) {
                                obj2 = Unit.a;
                                break;
                            }
                        }
                    }
                } else {
                    if (i13 != 1 && i13 != 2) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            case 9:
                b50 b50Var9 = b50.m;
                int i14 = this.n;
                if (i14 == 0) {
                    ca2.b(obj);
                    CoroutineContext.Element m = ((a50) this.o).n().m(e.d);
                    m.getClass();
                    ?? r12 = (e) m;
                    lb2 lb2Var = (lb2) this.p;
                    sy2 sy2Var = new sy2(r12);
                    CoroutineContext p = f.c((a) r12, sy2Var).p(new ax2(Integer.valueOf(System.identityHashCode(sy2Var)), lb2Var.h));
                    fs fsVar = (fs) obj3;
                    aa2.a aVar = aa2.m;
                    z62 z62Var = (z62) this.r;
                    this.o = fsVar;
                    this.n = 1;
                    V2 = z71.V(p, z62Var, this);
                    if (V2 == b50Var9) {
                        return b50Var9;
                    }
                    o30Var = fsVar;
                } else {
                    if (i14 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o30Var = (o30) this.o;
                    ca2.b(obj);
                    V2 = obj;
                }
                aa2.a aVar2 = aa2.m;
                o30Var.resumeWith(V2);
                return Unit.a;
            case 10:
                AtomicReference atomicReference = (AtomicReference) obj3;
                b50 b50Var10 = b50.m;
                ?? r13 = this.n;
                try {
                    if (r13 == 0) {
                        ca2.b(obj);
                        a50 a50Var2 = (a50) this.o;
                        hj2 hj2Var2 = new hj2(l41.E(a50Var2.n()), ((Function1) this.p).invoke(a50Var2));
                        hj2 hj2Var3 = (hj2) atomicReference.getAndSet(hj2Var2);
                        if (hj2Var3 != null) {
                            g61 g61Var = hj2Var3.a;
                            this.o = hj2Var2;
                            this.n = 1;
                            g61Var.f(null);
                            Object J = g61Var.J(this);
                            if (J != b50Var10) {
                                J = Unit.a;
                                break;
                            }
                        }
                        hj2Var = hj2Var2;
                    } else {
                        if (r13 != 1) {
                            if (r13 != 2) {
                                lh.g("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hj2 hj2Var4 = (hj2) this.o;
                            ca2.b(obj);
                            invoke = obj;
                            r13 = hj2Var4;
                            Object obj13 = r13;
                            while (!atomicReference.compareAndSet(obj13, null) && atomicReference.get() == obj13) {
                            }
                            return invoke;
                        }
                        hj2 hj2Var5 = (hj2) this.o;
                        ca2.b(obj);
                        hj2Var = hj2Var5;
                    }
                    Function2 function2 = (Function2) this.r;
                    Object obj14 = hj2Var.b;
                    this.o = hj2Var;
                    this.n = 2;
                    invoke = function2.invoke(obj14, this);
                    r13 = hj2Var;
                    break;
                } catch (Throwable th2) {
                    while (!atomicReference.compareAndSet(r13, null) && atomicReference.get() == r13) {
                    }
                    throw th2;
                }
                break;
            case 11:
                x22 x22Var = (x22) this.p;
                b50 b50Var11 = b50.m;
                int i15 = this.n;
                if (i15 == 0) {
                    ca2.b(obj);
                    xs2 xs2Var = new xs2((a50) this.o, (xt0) obj3, (y30) this.r, new s42(x22Var), null);
                    this.n = 1;
                    if (yj1.j(x22Var, xs2Var, this) == b50Var11) {
                        return b50Var11;
                    }
                } else {
                    if (i15 != 1) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca2.b(obj);
                }
                return Unit.a;
            default:
                int[] iArr = (int[]) obj3;
                f03 f03Var = (f03) this.p;
                b50 b50Var12 = b50.m;
                int i16 = this.n;
                if (i16 == 0) {
                    ca2.b(obj);
                    ym0Var = (ym0) this.o;
                    w50 w50Var = f03Var.h;
                    w50Var.getClass();
                    iArr.getClass();
                    ((ReentrantLock) w50Var.b).lock();
                    try {
                        int length = iArr.length;
                        int i17 = 0;
                        boolean z = false;
                        while (i17 < length) {
                            int i18 = iArr[i17];
                            long[] jArr = (long[]) w50Var.c;
                            long j2 = jArr[i18];
                            jArr[i18] = j2 + 1;
                            if (j2 == 0) {
                                w50Var.a = true;
                                z = true;
                            }
                            i17++;
                            z = z;
                        }
                        j = 1;
                        if (z) {
                            MaxLineDatabase_Impl maxLineDatabase_Impl = f03Var.a;
                            this.o = ym0Var;
                            this.n = 1;
                            D = l41.D(maxLineDatabase_Impl, false, this);
                            break;
                        }
                        c82 c82Var = new c82();
                        j70 j70Var = f03Var.i;
                        ot otVar = new ot(c82Var, ym0Var, (String[]) this.r, iArr);
                        this.o = null;
                        this.n = 3;
                        j70Var.a(otVar, this);
                        return b50Var12;
                    } finally {
                    }
                }
                if (i16 != 1) {
                    if (i16 == 2) {
                        ym0Var2 = (ym0) this.o;
                        ca2.b(obj);
                        j = 1;
                        ym0Var = ym0Var2;
                        try {
                            c82 c82Var2 = new c82();
                            j70 j70Var2 = f03Var.i;
                            ot otVar2 = new ot(c82Var2, ym0Var, (String[]) this.r, iArr);
                            this.o = null;
                            this.n = 3;
                            j70Var2.a(otVar2, this);
                            return b50Var12;
                        } catch (Throwable th3) {
                            th = th3;
                            w50 w50Var2 = f03Var.h;
                            w50Var2.getClass();
                            iArr.getClass();
                            ((ReentrantLock) w50Var2.b).lock();
                            while (r3 < r4) {
                            }
                            throw th;
                        }
                    }
                    if (i16 != 3) {
                        lh.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        ca2.b(obj);
                        throw new k81();
                    } catch (Throwable th4) {
                        th = th4;
                        j = 1;
                        w50 w50Var22 = f03Var.h;
                        w50Var22.getClass();
                        iArr.getClass();
                        ((ReentrantLock) w50Var22.b).lock();
                        try {
                            for (int i19 : iArr) {
                                long[] jArr2 = (long[]) w50Var22.c;
                                long j3 = jArr2[i19];
                                jArr2[i19] = j3 - j;
                                if (j3 == j) {
                                    w50Var22.a = true;
                                }
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
                ym0Var = (ym0) this.o;
                ca2.b(obj);
                D = obj;
                j = 1;
                fj fjVar = new fj(13, (o30) r9, f03Var);
                this.o = ym0Var;
                this.n = 2;
                if (z71.V((CoroutineContext) D, fjVar, this) != b50Var12) {
                    ym0Var2 = ym0Var;
                    ym0Var = ym0Var2;
                    c82 c82Var22 = new c82();
                    j70 j70Var22 = f03Var.i;
                    ot otVar22 = new ot(c82Var22, ym0Var, (String[]) this.r, iArr);
                    this.o = null;
                    this.n = 3;
                    j70Var22.a(otVar22, this);
                }
                return b50Var12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(ij1 ij1Var, Uri uri, zn1 zn1Var, o30 o30Var) {
        super(2, o30Var);
        this.m = 0;
        this.q = ij1Var;
        this.r = uri;
        this.p = zn1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(ij1 ij1Var, o30 o30Var) {
        super(2, o30Var);
        this.m = 7;
        this.q = ij1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5(Object obj, Object obj2, Object obj3, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.p = obj;
        this.q = obj2;
        this.r = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5(Object obj, Object obj2, Object obj3, Object obj4, o30 o30Var, int i) {
        super(2, o30Var);
        this.m = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }
}
