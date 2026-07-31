package u0;

import j.C0475A;
import java.util.concurrent.CancellationException;
import k2.InterfaceC0550w;
import m2.C0628c;

/* renamed from: u0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975h0 extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public m2.s f8330e;

    /* renamed from: f, reason: collision with root package name */
    public C0628c f8331f;

    /* renamed from: g, reason: collision with root package name */
    public int f8332g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m2.e f8333h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0975h0(m2.e eVar, P1.d dVar) {
        super(2, dVar);
        this.f8333h = eVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        return new C0975h0(this.f8333h, dVar);
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0975h0) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x0061, B:19:0x0027, B:23:0x0064, B:26:0x0068, B:27:0x0069, B:34:0x0021, B:12:0x004b, B:14:0x0057), top: B:2:0x0006, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [m2.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m2.e eVar;
        C0628c c0628c;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f8332g;
        try {
            if (i3 == 0) {
                I2.l.Q(obj);
                eVar = this.f8333h;
                c0628c = new C0628c(eVar);
                this.f8330e = eVar;
                this.f8331f = c0628c;
                this.f8332g = 1;
                obj = c0628c.b(this);
                eVar = eVar;
                if (obj == aVar) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0628c = this.f8331f;
                ?? r4 = this.f8330e;
                I2.l.Q(obj);
                eVar = r4;
                if (((Boolean) obj).booleanValue()) {
                    boolean z3 = false;
                    AbstractC0977i0.f8336b.set(false);
                    synchronized (S.q.f3235b) {
                        C0475A c0475a = ((S.d) S.q.f3242i.get()).f3197h;
                        if (c0475a != null && c0475a.h()) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        S.q.a();
                    }
                    this.f8330e = eVar;
                    this.f8331f = c0628c;
                    this.f8332g = 1;
                    obj = c0628c.b(this);
                    eVar = eVar;
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        eVar.a(null);
                        return L1.z.f2729a;
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
