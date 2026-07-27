package f1;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1343r;

/* renamed from: f1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e3.a f6594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M2.A f6595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2.E f6596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f6597d;

    public C0618l(e3.a aVar, M2.A a4, M2.E e4, N n2) {
        this.f6594a = aVar;
        this.f6595b = a4;
        this.f6596c = e4;
        this.f6597d = n2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [e3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0614h c0614h, E2.c cVar) {
        C0617k c0617k;
        int i2;
        N n2;
        e3.c cVar2;
        M2.A a4;
        M2.E e4;
        Function2 function2;
        e3.a aVar;
        e3.a aVar2;
        N n4;
        Object obj;
        M2.E e5;
        try {
            if (cVar instanceof C0617k) {
                c0617k = (C0617k) cVar;
                int i4 = c0617k.f6593q;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0617k.f6593q = i4 - Integer.MIN_VALUE;
                    Object obj2 = c0617k.f6591o;
                    D2.a aVar3 = D2.a.f2163d;
                    i2 = c0617k.f6593q;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj2);
                        c0617k.f6586j = c0614h;
                        e3.a aVar4 = this.f6594a;
                        c0617k.f6587k = aVar4;
                        M2.A a5 = this.f6595b;
                        c0617k.f6588l = a5;
                        M2.E e6 = this.f6596c;
                        c0617k.f6589m = e6;
                        n2 = this.f6597d;
                        c0617k.f6590n = n2;
                        c0617k.f6593q = 1;
                        cVar2 = (e3.c) aVar4;
                        if (cVar2.c(null, c0617k) == aVar3) {
                            return aVar3;
                        }
                        a4 = a5;
                        e4 = e6;
                        function2 = c0614h;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0617k.f6588l;
                                e5 = (M2.E) c0617k.f6587k;
                                aVar = (e3.a) c0617k.f6586j;
                                try {
                                    AbstractC1343r.b(obj2);
                                    e5.f3580d = obj;
                                    e4 = e5;
                                    Object obj3 = e4.f3580d;
                                    ((e3.c) aVar).e(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((e3.c) aVar).e(null);
                                    throw th;
                                }
                            }
                            n4 = (N) c0617k.f6588l;
                            e4 = (M2.E) c0617k.f6587k;
                            aVar2 = (e3.a) c0617k.f6586j;
                            try {
                                AbstractC1343r.b(obj2);
                                if (!Intrinsics.a(obj2, e4.f3580d)) {
                                    aVar = aVar2;
                                    Object obj32 = e4.f3580d;
                                    ((e3.c) aVar).e(null);
                                    return obj32;
                                }
                                c0617k.f6586j = aVar2;
                                c0617k.f6587k = e4;
                                c0617k.f6588l = obj2;
                                c0617k.f6593q = 3;
                                if (n4.h(obj2, false, c0617k) == aVar3) {
                                    return aVar3;
                                }
                                obj = obj2;
                                e5 = e4;
                                aVar = aVar2;
                                e5.f3580d = obj;
                                e4 = e5;
                                Object obj322 = e4.f3580d;
                                ((e3.c) aVar).e(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar = aVar2;
                                ((e3.c) aVar).e(null);
                                throw th;
                            }
                        }
                        N n5 = c0617k.f6590n;
                        e4 = c0617k.f6589m;
                        a4 = (M2.A) c0617k.f6588l;
                        ?? r7 = (e3.a) c0617k.f6587k;
                        Function2 function22 = (Function2) c0617k.f6586j;
                        AbstractC1343r.b(obj2);
                        cVar2 = r7;
                        n2 = n5;
                        function2 = function22;
                    }
                    if (!a4.f3576d) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = e4.f3580d;
                    c0617k.f6586j = cVar2;
                    c0617k.f6587k = e4;
                    c0617k.f6588l = n2;
                    c0617k.f6589m = null;
                    c0617k.f6590n = null;
                    c0617k.f6593q = 2;
                    Object h4 = function2.h(obj4, c0617k);
                    if (h4 == aVar3) {
                        return aVar3;
                    }
                    aVar2 = cVar2;
                    obj2 = h4;
                    n4 = n2;
                    if (!Intrinsics.a(obj2, e4.f3580d)) {
                    }
                }
            }
            if (!a4.f3576d) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = cVar2;
            ((e3.c) aVar).e(null);
            throw th;
        }
        c0617k = new C0617k(this, cVar);
        Object obj22 = c0617k.f6591o;
        D2.a aVar32 = D2.a.f2163d;
        i2 = c0617k.f6593q;
        if (i2 != 0) {
        }
    }
}
