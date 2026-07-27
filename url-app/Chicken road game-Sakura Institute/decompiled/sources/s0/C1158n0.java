package s0;

import Q.C0268d;
import W2.InterfaceC0302y;
import i.C0661B;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: s0.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158n0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public Y2.r f10274k;

    /* renamed from: l, reason: collision with root package name */
    public Y2.c f10275l;

    /* renamed from: m, reason: collision with root package name */
    public int f10276m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y2.e f10277n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1158n0(Y2.e eVar, C2.a aVar) {
        super(2, aVar);
        this.f10277n = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1158n0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1158n0(this.f10277n, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x0061, B:19:0x0027, B:23:0x0064, B:26:0x0068, B:27:0x0069, B:28:0x006a, B:34:0x0021, B:12:0x004b, B:14:0x0057), top: B:2:0x0006, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x0061, B:19:0x0027, B:23:0x0064, B:26:0x0068, B:27:0x0069, B:28:0x006a, B:34:0x0021, B:12:0x004b, B:14:0x0057), top: B:2:0x0006, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [Y2.r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        Y2.e eVar;
        Y2.c cVar;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f10276m;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                eVar = this.f10277n;
                cVar = new Y2.c(eVar);
                this.f10274k = eVar;
                this.f10275l = cVar;
                this.f10276m = 1;
                obj = cVar.b(this);
                eVar = eVar;
                if (obj == aVar) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = this.f10275l;
                ?? r4 = this.f10274k;
                AbstractC1343r.b(obj);
                eVar = r4;
                if (((Boolean) obj).booleanValue()) {
                    boolean z4 = false;
                    AbstractC1162p0.f10285b.set(false);
                    synchronized (Q.q.f3878b) {
                        C0661B c0661b = ((C0268d) Q.q.f3885i.get()).f3839h;
                        if (c0661b != null && c0661b.h()) {
                            z4 = true;
                        }
                    }
                    if (z4) {
                        Q.q.a();
                    }
                    this.f10274k = eVar;
                    this.f10275l = cVar;
                    this.f10276m = 1;
                    obj = cVar.b(this);
                    eVar = eVar;
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        Unit unit = Unit.f7487a;
                        eVar.a(null);
                        return Unit.f7487a;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CancellationException cancellationException = th instanceof CancellationException ? th : null;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                    cancellationException.initCause(th);
                }
                eVar.a(cancellationException);
                throw th2;
            }
        }
    }
}
