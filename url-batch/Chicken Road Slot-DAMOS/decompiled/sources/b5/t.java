package b5;

import android.net.Uri;
import android.view.InputEvent;
import androidx.work.CoroutineWorker;
import com.appsflyer.attribution.RequestError;
import com.google.android.gms.internal.measurement.lf;
import d2.h1;
import ge.c1;
import ge.m0;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.f1;
import n0.l2;
import n0.o1;
import n0.s0;
import n0.w1;
import n0.y1;
import n0.z0;
import v.h0;
import x3.l0;
import x3.o0;
import x3.t0;
import x3.u0;
import z4.e0;
import z4.n0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1183d;

    /* renamed from: e, reason: collision with root package name */
    public int f1184e;

    /* renamed from: i, reason: collision with root package name */
    public Object f1185i;

    /* renamed from: r, reason: collision with root package name */
    public Object f1186r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1187s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(x3.z zVar, Function2 function2, ld.a aVar) {
        super(2, aVar);
        this.f1183d = 17;
        this.f1186r = zVar;
        this.f1187s = (nd.i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function2, nd.i] */
    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        switch (this.f1183d) {
            case 0:
                return new t((wd.b0) this.f1186r, (u) this.f1187s, aVar, 0);
            case 1:
                t tVar = new t((ge.n) this.f1186r, (Function2) this.f1187s, aVar);
                tVar.f1185i = obj;
                return tVar;
            case 2:
                return new t((ie.c) this.f1187s, aVar, 2);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return new t((CoroutineContext) this.f1185i, (z4.u) this.f1186r, (a1.d) this.f1187s, aVar, 3);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                t tVar2 = new t((je.f) this.f1186r, (ke.e) this.f1187s, aVar, 4);
                tVar2.f1185i = obj;
                return tVar2;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                t tVar3 = new t((y1) this.f1186r, (s0) this.f1187s, aVar, 5);
                tVar3.f1185i = obj;
                return tVar3;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                t tVar4 = new t((CoroutineContext) this.f1186r, (je.e) this.f1187s, aVar, 6);
                tVar4.f1185i = obj;
                return tVar4;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new t((n8.c) this.f1185i, (b4.c) this.f1186r, (Long) this.f1187s, aVar, 7);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new t((h0) this.f1185i, (z0) this.f1186r, (f1) this.f1187s, aVar, 8);
            case 9:
                return new t((t5.i) this.f1186r, (CoroutineWorker) this.f1187s, aVar, 9);
            case 10:
                return new t((t9.c) this.f1185i, (Function0) this.f1186r, (Function0) this.f1187s, aVar, 10);
            case RequestError.STOP_TRACKING /* 11 */:
                t tVar5 = new t((v.z0) this.f1186r, (z0) this.f1187s, aVar, 11);
                tVar5.f1185i = obj;
                return tVar5;
            case 12:
                return new t((h0) this.f1187s, aVar, 12);
            case 13:
                return new t((w4.a) this.f1185i, (Uri) this.f1186r, (InputEvent) this.f1187s, aVar, 13);
            case 14:
                return new t((z.f) this.f1185i, (z.g) this.f1186r, (m0) this.f1187s, aVar, 14);
            case 15:
                return new t((z.f) this.f1185i, (z.e) this.f1186r, (m0) this.f1187s, aVar, 15);
            case 16:
                t tVar6 = new t((x3.z) this.f1187s, aVar, 16);
                tVar6.f1186r = obj;
                return tVar6;
            case 17:
                t tVar7 = new t((x3.z) this.f1186r, (Function2) this.f1187s, aVar);
                tVar7.f1185i = obj;
                return tVar7;
            default:
                t tVar8 = new t((n0) this.f1187s, aVar, 18);
                tVar8.f1186r = obj;
                return tVar8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1183d) {
            case 0:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 1:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 2:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((t) create((o1) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 9:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 10:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case RequestError.STOP_TRACKING /* 11 */:
                return ((t) create((o1) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 12:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 13:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 14:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 15:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 16:
                return ((t) create((je.f) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            case 17:
                return ((t) create((ge.x) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
            default:
                return ((t) create((e0) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x022d, code lost:
    
        if (r0 == r5) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01ca, code lost:
    
        if (r8 == r5) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x04e2, code lost:
    
        if (r0.c(r2, r21) == r3) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x04f2, code lost:
    
        if (ge.a0.B(r2, r7, r21) == r3) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a2, code lost:
    
        if (r14 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0048, code lost:
    
        if (r7 == r0) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05db A[Catch: all -> 0x05ae, TryCatch #8 {all -> 0x05ae, blocks: (B:353:0x05a8, B:355:0x05d3, B:357:0x05db, B:358:0x05e9, B:366:0x05fa, B:368:0x05c4, B:372:0x05fd, B:376:0x0602, B:377:0x0603, B:384:0x05bf, B:360:0x05ea, B:362:0x05f0), top: B:349:0x059c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x067b  */
    /* JADX WARN: Type inference failed for: r3v22, types: [ie.g] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Type inference failed for: r9v7, types: [kotlin.jvm.functions.Function2, nd.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:326:0x05cf -> B:312:0x05d3). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a9;
        wd.b0 b0Var;
        c1 c1Var;
        Object invoke;
        c1 c1Var2;
        Throwable th;
        Throwable a10;
        ie.b bVar;
        Object b10;
        boolean z10;
        Object foregroundInfo;
        t5.i iVar;
        oe.c cVar;
        je.f fVar;
        Object B;
        t0 t0Var;
        e0 e0Var;
        Object a11;
        z4.j jVar;
        ReentrantLock reentrantLock;
        z4.i[] iVarArr;
        z4.i iVar2;
        z4.j jVar2;
        ReentrantLock reentrantLock2;
        ie.c cVar2 = null;
        boolean z11 = false;
        int i3 = 2;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        switch (this.f1183d) {
            case 0:
                md.a aVar = md.a.f6622d;
                int i10 = this.f1184e;
                if (i10 == 0) {
                    cf.c.M(obj);
                    wd.b0 b0Var2 = (wd.b0) this.f1186r;
                    u uVar = (u) this.f1187s;
                    this.f1185i = b0Var2;
                    this.f1184e = 1;
                    a9 = uVar.a(this);
                    if (a9 == aVar) {
                        return aVar;
                    }
                    b0Var = b0Var2;
                } else {
                    if (i10 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b0Var = (wd.b0) this.f1185i;
                    cf.c.M(obj);
                    a9 = obj;
                }
                b0Var.f10141d = a9;
                return Unit.f5554a;
            case 1:
                md.a aVar2 = md.a.f6622d;
                int i11 = this.f1184e;
                if (i11 == 0) {
                    cf.c.M(obj);
                    ge.x xVar = (ge.x) this.f1185i;
                    c1Var = (ge.n) this.f1186r;
                    ?? r42 = (nd.i) this.f1187s;
                    try {
                        hd.l lVar = hd.n.f4511e;
                        this.f1185i = c1Var;
                        this.f1184e = 1;
                        invoke = r42.invoke(xVar, this);
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c1Var2 = c1Var;
                        hd.l lVar2 = hd.n.f4511e;
                        c1Var = c1Var2;
                        invoke = new hd.m(th);
                        a10 = hd.n.a(invoke);
                        ge.n nVar = (ge.n) c1Var;
                        if (a10 == null) {
                        }
                        return Unit.f5554a;
                    }
                } else {
                    if (i11 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c1Var2 = (ge.m) this.f1185i;
                    try {
                        cf.c.M(obj);
                        c1Var = c1Var2;
                        invoke = obj;
                    } catch (Throwable th3) {
                        th = th3;
                        hd.l lVar22 = hd.n.f4511e;
                        c1Var = c1Var2;
                        invoke = new hd.m(th);
                        a10 = hd.n.a(invoke);
                        ge.n nVar2 = (ge.n) c1Var;
                        if (a10 == null) {
                        }
                        return Unit.f5554a;
                    }
                }
                hd.l lVar3 = hd.n.f4511e;
                a10 = hd.n.a(invoke);
                ge.n nVar22 = (ge.n) c1Var;
                if (a10 == null) {
                    nVar22.S(invoke);
                } else {
                    nVar22.getClass();
                    nVar22.S(new ge.q(a10, false));
                }
                return Unit.f5554a;
            case 2:
                md.a aVar3 = md.a.f6622d;
                int i12 = this.f1184e;
                try {
                    if (i12 == 0) {
                        cf.c.M(obj);
                        cVar2 = (ie.c) this.f1187s;
                        bVar = new ie.b(cVar2);
                        this.f1185i = cVar2;
                        this.f1186r = bVar;
                        this.f1184e = 1;
                        b10 = bVar.b(this);
                        cVar2 = cVar2;
                        if (b10 == aVar3) {
                        }
                        if (((Boolean) b10).booleanValue()) {
                        }
                    } else {
                        if (i12 != 1) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        bVar = (ie.b) this.f1186r;
                        ?? r32 = (ie.g) this.f1185i;
                        cf.c.M(obj);
                        b10 = obj;
                        cVar2 = r32;
                        if (((Boolean) b10).booleanValue()) {
                            h1.f3418b.set(false);
                            synchronized (b1.r.f1030c) {
                                s.i0 i0Var = b1.r.j.f959h;
                                z10 = i0Var != null && i0Var.h();
                            }
                            if (z10) {
                                b1.r.a();
                            }
                            this.f1185i = cVar2;
                            this.f1186r = bVar;
                            this.f1184e = 1;
                            b10 = bVar.b(this);
                            cVar2 = cVar2;
                            if (b10 == aVar3) {
                                return aVar3;
                            }
                            if (((Boolean) b10).booleanValue()) {
                                cVar2.a(null);
                                return Unit.f5554a;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        CancellationException cancellationException = th4 instanceof CancellationException ? th4 : null;
                        if (cancellationException == null) {
                            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException.initCause(th4);
                        }
                        cVar2.a(cancellationException);
                        throw th5;
                    }
                }
                break;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                md.a aVar4 = md.a.f6622d;
                int i13 = this.f1184e;
                if (i13 != 0) {
                    if (i13 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                CoroutineContext coroutineContext = (CoroutineContext) this.f1185i;
                a3.t tVar = new a3.t((z4.u) this.f1186r, (a1.d) this.f1187s, z13 ? 1 : 0, 7);
                this.f1184e = 1;
                Object B2 = ge.a0.B(coroutineContext, tVar, this);
                return B2 == aVar4 ? aVar4 : B2;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                ge.x xVar2 = (ge.x) this.f1185i;
                Object obj2 = md.a.f6622d;
                int i14 = this.f1184e;
                if (i14 == 0) {
                    cf.c.M(obj);
                    je.f fVar2 = (je.f) this.f1186r;
                    ie.g g = ((ke.e) this.f1187s).g(xVar2);
                    this.f1185i = null;
                    this.f1184e = 1;
                    Object h10 = je.b0.h(fVar2, g, true, this);
                    Object obj3 = h10;
                    if (h10 != obj2) {
                        obj3 = Unit.f5554a;
                    }
                    if (obj3 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i14 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                md.a aVar5 = md.a.f6622d;
                int i15 = this.f1184e;
                if (i15 != 0) {
                    if (i15 == 1) {
                        cf.c.M(obj);
                        return Unit.f5554a;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                ge.x xVar3 = (ge.x) this.f1185i;
                y1 y1Var = (y1) this.f1186r;
                s0 s0Var = (s0) this.f1187s;
                this.f1184e = 1;
                y1Var.a(xVar3, s0Var, this);
                return aVar5;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                je.e eVar = (je.e) this.f1187s;
                CoroutineContext coroutineContext2 = (CoroutineContext) this.f1186r;
                md.a aVar6 = md.a.f6622d;
                int i16 = this.f1184e;
                if (i16 == 0) {
                    cf.c.M(obj);
                    o1 o1Var = (o1) this.f1185i;
                    if (!Intrinsics.a(coroutineContext2, kotlin.coroutines.g.f5592d)) {
                        a3.t tVar2 = new a3.t(eVar, o1Var, z14 ? 1 : 0, 14);
                        this.f1184e = 2;
                        break;
                    } else {
                        l2 l2Var = new l2(o1Var, 0);
                        this.f1184e = 1;
                        break;
                    }
                } else {
                    if (i16 != 1 && i16 != 2) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                md.a aVar7 = md.a.f6622d;
                int i17 = this.f1184e;
                if (i17 != 0) {
                    if (i17 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                d9.c cVar3 = ((n8.c) this.f1185i).f7185c;
                n8.b bVar2 = new n8.b((b4.c) this.f1186r, (Long) this.f1187s, null);
                this.f1184e = 1;
                Object c10 = cVar3.c(new b4.b(bVar2, null, 1), this);
                return c10 == aVar7 ? aVar7 : c10;
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                z0 z0Var = (z0) this.f1186r;
                md.a aVar8 = md.a.f6622d;
                int i18 = this.f1184e;
                if (i18 == 0) {
                    cf.c.M(obj);
                    if (((List) z0Var.getValue()).size() > 1) {
                        n4.h hVar = (n4.h) ((List) z0Var.getValue()).get(((List) z0Var.getValue()).size() - 2);
                        h0 h0Var = (h0) this.f1185i;
                        float h11 = ((f1) this.f1187s).h();
                        this.f1184e = 1;
                        if (h0Var.A(h11, hVar, this) == aVar8) {
                            return aVar8;
                        }
                    }
                } else {
                    if (i18 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 9:
                md.a aVar9 = md.a.f6622d;
                int i19 = this.f1184e;
                if (i19 == 0) {
                    cf.c.M(obj);
                    t5.i iVar3 = (t5.i) this.f1186r;
                    CoroutineWorker coroutineWorker = (CoroutineWorker) this.f1187s;
                    this.f1185i = iVar3;
                    this.f1184e = 1;
                    foregroundInfo = coroutineWorker.getForegroundInfo(this);
                    if (foregroundInfo == aVar9) {
                        return aVar9;
                    }
                    iVar = iVar3;
                } else {
                    if (i19 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iVar = (t5.i) this.f1185i;
                    cf.c.M(obj);
                    foregroundInfo = obj;
                }
                iVar.f9309d.i(foregroundInfo);
                return Unit.f5554a;
            case 10:
                md.a aVar10 = md.a.f6622d;
                int i20 = this.f1184e;
                if (i20 == 0) {
                    cf.c.M(obj);
                    je.b bVar3 = ((t9.c) this.f1185i).f9329e;
                    i0.g gVar = new i0.g(5, (Function0) this.f1186r, (Function0) this.f1187s);
                    this.f1184e = 1;
                    if (bVar3.c(gVar, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i20 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case RequestError.STOP_TRACKING /* 11 */:
                v.z0 z0Var2 = (v.z0) this.f1186r;
                md.a aVar11 = md.a.f6622d;
                int i21 = this.f1184e;
                if (i21 == 0) {
                    cf.c.M(obj);
                    o1 o1Var2 = (o1) this.f1185i;
                    je.x xVar4 = new je.x(new w1(new a2.a0(12, z0Var2), null));
                    je.n nVar3 = new je.n(o1Var2, z0Var2, (z0) this.f1187s);
                    this.f1184e = 1;
                    if (xVar4.c(nVar3, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i21 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 12:
                h0 h0Var2 = (h0) this.f1187s;
                md.a aVar12 = md.a.f6622d;
                int i22 = this.f1184e;
                if (i22 == 0) {
                    cf.c.M(obj);
                    b1.b0 b0Var3 = h0Var2.f9814v;
                    if (b0Var3 != null) {
                        b0Var3.c(h0Var2, v.c.j, h0Var2.f9813u);
                    }
                    oe.c cVar4 = h0Var2.f9817y;
                    this.f1185i = cVar4;
                    this.f1186r = h0Var2;
                    this.f1184e = 1;
                    if (cVar4.a(this) == aVar12) {
                        return aVar12;
                    }
                    cVar = cVar4;
                } else {
                    if (i22 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    h0Var2 = (h0) this.f1186r;
                    cVar = (oe.c) this.f1185i;
                    cf.c.M(obj);
                }
                try {
                    h0Var2.f9810r = h0Var2.f9808e.getValue();
                    ge.h hVar2 = h0Var2.f9816x;
                    if (hVar2 != null) {
                        hd.l lVar4 = hd.n.f4511e;
                        hVar2.resumeWith(h0Var2.f9808e.getValue());
                    }
                    h0Var2.f9816x = null;
                    cVar.d(null);
                    return Unit.f5554a;
                } catch (Throwable th6) {
                    cVar.d(null);
                    throw th6;
                }
            case 13:
                md.a aVar13 = md.a.f6622d;
                int i23 = this.f1184e;
                if (i23 == 0) {
                    cf.c.M(obj);
                    x4.c cVar5 = ((w4.a) this.f1185i).f10080a;
                    Uri uri = (Uri) this.f1186r;
                    InputEvent inputEvent = (InputEvent) this.f1187s;
                    this.f1184e = 1;
                    if (cVar5.e(uri, inputEvent, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i23 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                return Unit.f5554a;
            case 14:
                md.a aVar14 = md.a.f6622d;
                int i24 = this.f1184e;
                if (i24 == 0) {
                    cf.c.M(obj);
                    z.f fVar3 = (z.f) this.f1185i;
                    z.g gVar2 = (z.g) this.f1186r;
                    this.f1184e = 1;
                    if (fVar3.a(gVar2, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i24 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                m0 m0Var = (m0) this.f1187s;
                if (m0Var != null) {
                    m0Var.a();
                }
                return Unit.f5554a;
            case 15:
                md.a aVar15 = md.a.f6622d;
                int i25 = this.f1184e;
                if (i25 == 0) {
                    cf.c.M(obj);
                    z.f fVar4 = (z.f) this.f1185i;
                    z.e eVar2 = (z.e) this.f1186r;
                    this.f1184e = 1;
                    if (fVar4.a(eVar2, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i25 != 1) {
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf.c.M(obj);
                }
                m0 m0Var2 = (m0) this.f1187s;
                if (m0Var2 != null) {
                    m0Var2.a();
                }
                return Unit.f5554a;
            case 16:
                x3.z zVar = (x3.z) this.f1187s;
                md.a aVar16 = md.a.f6622d;
                int i26 = this.f1184e;
                if (i26 == 0) {
                    cf.c.M(obj);
                    fVar = (je.f) this.f1186r;
                    this.f1186r = fVar;
                    this.f1184e = 1;
                    B = ge.a0.B(zVar.f10497i.h(), new x3.l(zVar, z15 ? 1 : 0, i3), this);
                    break;
                } else if (i26 == 1) {
                    fVar = (je.f) this.f1186r;
                    cf.c.M(obj);
                    B = obj;
                } else {
                    if (i26 != 2) {
                        if (i26 == 3) {
                            cf.c.M(obj);
                            return Unit.f5554a;
                        }
                        i0.l("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t0Var = (x3.c) this.f1185i;
                    fVar = (je.f) this.f1186r;
                    cf.c.M(obj);
                    int i27 = 0;
                    je.j jVar3 = new je.j(new je.x(new je.j(new je.l(1, new je.l(i27, new x3.l(zVar, z18 ? 1 : 0, i27), zVar.f10502v.f10339a), new je.h0(i3, i3, z17 ? 1 : 0)), new a4.l((Object) t0Var, (ld.a) (z16 ? 1 : 0), 4))), new x3.m(zVar, (ld.a) null));
                    this.f1186r = null;
                    this.f1185i = null;
                    this.f1184e = 3;
                    if (!(fVar instanceof je.n0)) {
                        throw ((je.n0) fVar).f5209d;
                    }
                    Object c11 = jVar3.c(fVar, this);
                    if (c11 != aVar16) {
                        c11 = Unit.f5554a;
                        break;
                    }
                }
                t0 t0Var2 = (t0) B;
                if (!(t0Var2 instanceof x3.c)) {
                    if (t0Var2 instanceof u0) {
                        i0.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    if (t0Var2 instanceof o0) {
                        throw ((o0) t0Var2).f10419b;
                    }
                    if (t0Var2 instanceof l0) {
                        return Unit.f5554a;
                    }
                    if (t0Var2 instanceof x3.n0) {
                        i0.l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    a2.r.p();
                    return null;
                }
                x3.c cVar6 = (x3.c) t0Var2;
                Object obj4 = cVar6.f10341b;
                this.f1186r = fVar;
                this.f1185i = cVar6;
                this.f1184e = 2;
                if (fVar.b(obj4, this) != aVar16) {
                    t0Var = t0Var2;
                    int i272 = 0;
                    je.j jVar32 = new je.j(new je.x(new je.j(new je.l(1, new je.l(i272, new x3.l(zVar, z18 ? 1 : 0, i272), zVar.f10502v.f10339a), new je.h0(i3, i3, z17 ? 1 : 0)), new a4.l((Object) t0Var, (ld.a) (z16 ? 1 : 0), 4))), new x3.m(zVar, (ld.a) null));
                    this.f1186r = null;
                    this.f1185i = null;
                    this.f1184e = 3;
                    if (!(fVar instanceof je.n0)) {
                    }
                }
                return aVar16;
            case 17:
                x3.z zVar2 = (x3.z) this.f1186r;
                md.a aVar17 = md.a.f6622d;
                int i28 = this.f1184e;
                if (i28 != 0) {
                    if (i28 == 1) {
                        cf.c.M(obj);
                        return obj;
                    }
                    i0.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cf.c.M(obj);
                ge.x xVar5 = (ge.x) this.f1185i;
                ge.n a12 = ge.a0.a();
                t0 a13 = zVar2.f10502v.a();
                if (a13 instanceof x3.c) {
                    a13 = new x3.n0(((x3.c) a13).f10458a);
                }
                x3.m0 m0Var3 = new x3.m0((nd.i) this.f1187s, a12, a13, xVar5.h());
                com.google.firebase.messaging.v vVar = zVar2.f10506z;
                Object b11 = ((ie.c) vVar.f3177i).b(m0Var3);
                if (b11 instanceof ie.h) {
                    Throwable th7 = ((ie.h) b11).f4750a;
                    if (th7 == null) {
                        throw new lf("Channel was closed normally");
                    }
                    throw th7;
                }
                if (b11 instanceof ie.i) {
                    i0.l("Check failed.");
                    return null;
                }
                if (((AtomicInteger) ((v.c1) vVar.f3178r).f9767e).getAndIncrement() == 0) {
                    ge.a0.s((ge.x) vVar.f3175d, null, new a3.t((Object) vVar, (ld.a) (z19 ? 1 : 0), 26), 3);
                }
                this.f1184e = 1;
                Object f02 = a12.f0(this);
                return f02 == aVar17 ? aVar17 : f02;
            default:
                md.a aVar18 = md.a.f6622d;
                int i29 = this.f1184e;
                if (i29 == 0) {
                    cf.c.M(obj);
                    e0Var = (e0) this.f1186r;
                    this.f1186r = e0Var;
                    this.f1184e = 1;
                    a11 = e0Var.a(this);
                    break;
                } else {
                    if (i29 != 1) {
                        if (i29 != 2) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        reentrantLock2 = (ReentrantLock) this.f1185i;
                        jVar2 = (z4.j) this.f1186r;
                        try {
                            cf.c.M(obj);
                            reentrantLock = reentrantLock2;
                            jVar = jVar2;
                            jVar.getClass();
                            reentrantLock.unlock();
                            return Unit.f5554a;
                        } catch (Throwable th8) {
                            th = th8;
                            try {
                                jVar2.getClass();
                                throw th;
                            } catch (Throwable th9) {
                                th = th9;
                                reentrantLock = reentrantLock2;
                                reentrantLock.unlock();
                                throw th;
                            }
                        }
                    }
                    e0Var = (e0) this.f1186r;
                    cf.c.M(obj);
                    a11 = obj;
                }
                if (((Boolean) a11).booleanValue()) {
                    return Unit.f5554a;
                }
                n0 n0Var = (n0) this.f1187s;
                jVar = n0Var.g;
                reentrantLock = jVar.f10764e;
                reentrantLock.lock();
                try {
                    ReentrantLock reentrantLock3 = jVar.f10760a;
                    reentrantLock3.lock();
                    try {
                        if (jVar.f10763d) {
                            jVar.f10763d = false;
                            int length = jVar.f10761b.length;
                            iVarArr = new z4.i[length];
                            int i30 = 0;
                            boolean z20 = false;
                            while (i30 < length) {
                                boolean z21 = jVar.f10761b[i30] > 0 ? z12 : z11;
                                boolean[] zArr = jVar.f10762c;
                                if (z21 != zArr[i30]) {
                                    zArr[i30] = z21;
                                    iVar2 = z21 ? z4.i.f10753e : z4.i.f10754i;
                                    z20 = true;
                                } else {
                                    iVar2 = z4.i.f10752d;
                                }
                                iVarArr[i30] = iVar2;
                                i30++;
                                z11 = false;
                                z12 = true;
                            }
                            break;
                        }
                        iVarArr = null;
                        if (iVarArr != null) {
                            try {
                                if (iVarArr.length != 0) {
                                    z4.d0 d0Var = z4.d0.f10733e;
                                    z4.m0 m0Var4 = new z4.m0(iVarArr, n0Var, e0Var, null);
                                    this.f1186r = jVar;
                                    this.f1185i = reentrantLock;
                                    this.f1184e = 2;
                                    if (e0Var.d(d0Var, m0Var4, this) != aVar18) {
                                        jVar2 = jVar;
                                        reentrantLock2 = reentrantLock;
                                        reentrantLock = reentrantLock2;
                                        jVar = jVar2;
                                    }
                                    return aVar18;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                jVar2 = jVar;
                                reentrantLock2 = reentrantLock;
                                jVar2.getClass();
                                throw th;
                            }
                        }
                        jVar.getClass();
                        reentrantLock.unlock();
                        return Unit.f5554a;
                    } finally {
                        reentrantLock3.unlock();
                    }
                } catch (Throwable th11) {
                    th = th11;
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, Object obj3, ld.a aVar, int i3) {
        super(2, aVar);
        this.f1183d = i3;
        this.f1185i = obj;
        this.f1186r = obj2;
        this.f1187s = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, ld.a aVar, int i3) {
        super(2, aVar);
        this.f1183d = i3;
        this.f1186r = obj;
        this.f1187s = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, ld.a aVar, int i3) {
        super(2, aVar);
        this.f1183d = i3;
        this.f1187s = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(ge.n nVar, Function2 function2, ld.a aVar) {
        super(2, aVar);
        this.f1183d = 1;
        this.f1186r = nVar;
        this.f1187s = (nd.i) function2;
    }
}
