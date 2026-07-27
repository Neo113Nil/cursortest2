package o;

import A.C0028y;
import D.Q1;
import G.C0192d;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.C0789o;
import l.InterfaceC0787m;
import m.C0842o;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: f, reason: collision with root package name */
    public static final C0789o f8722f = new C0789o(0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final l.x0 f8723a;

    /* renamed from: b, reason: collision with root package name */
    public long f8724b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public C0789o f8725c = f8722f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8726d;

    /* renamed from: e, reason: collision with root package name */
    public float f8727e;

    public U0(InterfaceC0787m interfaceC0787m) {
        this.f8723a = interfaceC0787m.a(l.w0.f7856a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r12v4, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r13v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [E2.c, o.T0] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [o.U0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b5 -> B:24:0x00b8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(P.h hVar, C0842o c0842o, E2.c cVar) {
        ?? r2;
        int i2;
        float f4;
        U0 u02;
        T0 t0;
        P.h hVar2;
        C0842o c0842o2;
        Function0 function0;
        U0 u03;
        try {
            if (cVar instanceof T0) {
                T0 t02 = (T0) cVar;
                int i4 = t02.f8721p;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    t02.f8721p = i4 - Integer.MIN_VALUE;
                    r2 = t02;
                    Object obj = r2.f8719n;
                    D2.a aVar = D2.a.f2163d;
                    i2 = r2.f8721p;
                    C0789o c0789o = f8722f;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj);
                        if (this.f8726d) {
                            throw new IllegalStateException("animateToZero called while previous animation is running");
                        }
                        CoroutineContext coroutineContext = r2.f2311e;
                        Intrinsics.c(coroutineContext);
                        S.p pVar = (S.p) coroutineContext.k(S.b.f3966u);
                        float v4 = pVar != null ? pVar.v() : 1.0f;
                        this.f8726d = true;
                        f4 = v4;
                        u02 = this;
                        t0 = r2;
                        hVar2 = hVar;
                        c0842o2 = c0842o;
                        if (Math.abs(u02.f8727e) >= 0.01f) {
                            Q1 q12 = new Q1(u02, f4, hVar2);
                            t0.f8715j = u02;
                            t0.f8716k = hVar2;
                            t0.f8717l = c0842o2;
                            t0.f8718m = f4;
                            t0.f8721p = 1;
                            CoroutineContext coroutineContext2 = t0.f2311e;
                            Intrinsics.c(coroutineContext2);
                            if (C0192d.F(coroutineContext2).f(q12, t0) == aVar) {
                                return aVar;
                            }
                            c0842o2.invoke();
                        }
                        U0 u04 = u02;
                        C0842o c0842o3 = c0842o2;
                        U0 u05 = u04;
                        if (Math.abs(u05.f8727e) == 0.0f) {
                            u03 = u05;
                            u03.f8724b = Long.MIN_VALUE;
                            u03.f8725c = c0789o;
                            u03.f8726d = false;
                            return Unit.f7487a;
                        }
                        C0028y c0028y = new C0028y(u05, 29, hVar2);
                        t0.f8715j = u05;
                        t0.f8716k = c0842o3;
                        t0.f8717l = null;
                        t0.f8721p = 2;
                        CoroutineContext coroutineContext3 = t0.f2311e;
                        Intrinsics.c(coroutineContext3);
                        if (C0192d.F(coroutineContext3).f(c0028y, t0) == aVar) {
                            return aVar;
                        }
                        function0 = c0842o3;
                        r2 = u05;
                        function0.invoke();
                        u03 = r2;
                        u03.f8724b = Long.MIN_VALUE;
                        u03.f8725c = c0789o;
                        u03.f8726d = false;
                        return Unit.f7487a;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (Function0) r2.f8716k;
                        U0 u06 = r2.f8715j;
                        AbstractC1343r.b(obj);
                        r2 = u06;
                        function0.invoke();
                        u03 = r2;
                        u03.f8724b = Long.MIN_VALUE;
                        u03.f8725c = c0789o;
                        u03.f8726d = false;
                        return Unit.f7487a;
                    }
                    float f5 = r2.f8718m;
                    ?? r12 = r2.f8717l;
                    ?? r13 = (Function1) r2.f8716k;
                    U0 u07 = r2.f8715j;
                    try {
                        AbstractC1343r.b(obj);
                        hVar2 = r13;
                        f4 = f5;
                        u02 = u07;
                        t0 = r2;
                        c0842o2 = r12;
                        try {
                            c0842o2.invoke();
                        } catch (Throwable th) {
                            th = th;
                            r2 = u02;
                            r2.f8724b = Long.MIN_VALUE;
                            r2.f8725c = c0789o;
                            r2.f8726d = false;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r2 = u07;
                        r2.f8724b = Long.MIN_VALUE;
                        r2.f8725c = c0789o;
                        r2.f8726d = false;
                        throw th;
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        r2 = new T0(this, cVar);
        Object obj2 = r2.f8719n;
        D2.a aVar2 = D2.a.f2163d;
        i2 = r2.f8721p;
        C0789o c0789o2 = f8722f;
    }
}
