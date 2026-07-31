package r2;

import a2.AbstractC1241b;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: r2.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC3400j {

    /* renamed from: r2.j$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: l, reason: collision with root package name */
        Object f43555l;

        /* renamed from: m, reason: collision with root package name */
        Object f43556m;

        /* renamed from: n, reason: collision with root package name */
        Object f43557n;

        /* renamed from: o, reason: collision with root package name */
        boolean f43558o;

        /* renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f43559p;

        /* renamed from: q, reason: collision with root package name */
        int f43560q;

        a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f43559p = obj;
            this.f43560q |= Integer.MIN_VALUE;
            return AbstractC3400j.c(null, null, false, this);
        }
    }

    public static final Object b(InterfaceC3397g interfaceC3397g, q2.t tVar, kotlin.coroutines.d dVar) {
        Object c4 = c(interfaceC3397g, tVar, true, dVar);
        return c4 == AbstractC1241b.f() ? c4 : Unit.f41027a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:20:0x0077, B:22:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(InterfaceC3397g interfaceC3397g, q2.t tVar, boolean z4, kotlin.coroutines.d dVar) {
        a aVar;
        int i4;
        q2.f it;
        q2.f fVar;
        InterfaceC3397g interfaceC3397g2;
        Object a4;
        try {
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i5 = aVar.f43560q;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    aVar.f43560q = i5 - Integer.MIN_VALUE;
                    Object obj = aVar.f43559p;
                    Object f4 = AbstractC1241b.f();
                    i4 = aVar.f43560q;
                    if (i4 != 0) {
                        ResultKt.a(obj);
                        AbstractC3398h.l(interfaceC3397g);
                        it = tVar.iterator();
                        aVar.f43555l = interfaceC3397g;
                        aVar.f43556m = tVar;
                        aVar.f43557n = it;
                        aVar.f43558o = z4;
                        aVar.f43560q = 1;
                        a4 = it.a(aVar);
                        if (a4 != f4) {
                        }
                    } else if (i4 == 1) {
                        z4 = aVar.f43558o;
                        fVar = (q2.f) aVar.f43557n;
                        tVar = (q2.t) aVar.f43556m;
                        interfaceC3397g2 = (InterfaceC3397g) aVar.f43555l;
                        ResultKt.a(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z4 = aVar.f43558o;
                        fVar = (q2.f) aVar.f43557n;
                        tVar = (q2.t) aVar.f43556m;
                        interfaceC3397g2 = (InterfaceC3397g) aVar.f43555l;
                        ResultKt.a(obj);
                        it = fVar;
                        interfaceC3397g = interfaceC3397g2;
                        aVar.f43555l = interfaceC3397g;
                        aVar.f43556m = tVar;
                        aVar.f43557n = it;
                        aVar.f43558o = z4;
                        aVar.f43560q = 1;
                        a4 = it.a(aVar);
                        if (a4 != f4) {
                            return f4;
                        }
                        interfaceC3397g2 = interfaceC3397g;
                        fVar = it;
                        obj = a4;
                        if (((Boolean) obj).booleanValue()) {
                            if (z4) {
                                q2.k.a(tVar, null);
                            }
                            return Unit.f41027a;
                        }
                        Object next = fVar.next();
                        aVar.f43555l = interfaceC3397g2;
                        aVar.f43556m = tVar;
                        aVar.f43557n = fVar;
                        aVar.f43558o = z4;
                        aVar.f43560q = 2;
                    }
                }
            }
            if (i4 != 0) {
            }
        } finally {
        }
        aVar = new a(dVar);
        Object obj2 = aVar.f43559p;
        Object f42 = AbstractC1241b.f();
        i4 = aVar.f43560q;
    }

    public static final InterfaceC3396f d(q2.t tVar) {
        return new C3393c(tVar, false, null, 0, null, 28, null);
    }
}
