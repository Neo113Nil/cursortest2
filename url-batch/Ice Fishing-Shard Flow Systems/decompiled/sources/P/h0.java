package P;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n6.AbstractC0792z;
import n6.InterfaceC0789w;

/* loaded from: classes.dex */
public final class h0 extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public N f2096d;

    /* renamed from: e, reason: collision with root package name */
    public int f2097e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.z f2098i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.google.firebase.messaging.z zVar, V5.b bVar) {
        super(2, bVar);
        this.f2098i = zVar;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        return new h0(this.f2098i, bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((InterfaceC0789w) obj, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        if (r1.invoke(r7, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0057 -> B:6:0x005a). Please report as a decompilation issue!!! */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        N n7;
        W5.a aVar = W5.a.f2787d;
        int i2 = this.f2097e;
        com.google.firebase.messaging.z zVar = this.f2098i;
        if (i2 == 0) {
            V6.b.P(obj);
            if (((AtomicInteger) ((B.f) zVar.f4538l).f152e).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            AbstractC0792z.e(((s6.c) zVar.f4535d).f7823d);
            n7 = (N) zVar.f4536e;
            p6.c cVar = (p6.c) zVar.f4537i;
            this.f2096d = n7;
            this.f2097e = 1;
            obj = cVar.b(this);
        } else if (i2 == 1) {
            n7 = this.f2096d;
            V6.b.P(obj);
            this.f2096d = null;
            this.f2097e = 2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            V6.b.P(obj);
            if (((AtomicInteger) ((B.f) zVar.f4538l).f152e).decrementAndGet() == 0) {
                return Unit.f6114a;
            }
            AbstractC0792z.e(((s6.c) zVar.f4535d).f7823d);
            n7 = (N) zVar.f4536e;
            p6.c cVar2 = (p6.c) zVar.f4537i;
            this.f2096d = n7;
            this.f2097e = 1;
            obj = cVar2.b(this);
        }
    }
}
