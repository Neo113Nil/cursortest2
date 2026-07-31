package u0;

import S.C0220d;
import e2.InterfaceC0426e;
import j.C0519A;
import java.util.concurrent.CancellationException;
import q2.InterfaceC0835w;
import s2.C0969c;

/* renamed from: u0.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115n0 extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public s2.v f9409h;

    /* renamed from: i, reason: collision with root package name */
    public C0969c f9410i;

    /* renamed from: j, reason: collision with root package name */
    public int f9411j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s2.g f9412k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1115n0(s2.g gVar, V1.d dVar) {
        super(2, dVar);
        this.f9412k = gVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((C1115n0) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new C1115n0(this.f9412k, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x0061, B:19:0x0027, B:23:0x0064, B:26:0x0068, B:27:0x0069, B:34:0x0021, B:12:0x004b, B:14:0x0057), top: B:2:0x0006, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [s2.v] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        s2.g gVar;
        C0969c c0969c;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f9411j;
        try {
            if (i3 == 0) {
                R1.a.e(obj);
                gVar = this.f9412k;
                c0969c = new C0969c(gVar);
                this.f9409h = gVar;
                this.f9410i = c0969c;
                this.f9411j = 1;
                obj = c0969c.b(this);
                gVar = gVar;
                if (obj == aVar) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0969c = this.f9410i;
                ?? r4 = this.f9409h;
                R1.a.e(obj);
                gVar = r4;
                if (((Boolean) obj).booleanValue()) {
                    boolean z3 = false;
                    AbstractC1117o0.f9416b.set(false);
                    synchronized (S.p.f4241b) {
                        C0519A c0519a = ((C0220d) S.p.f4248i.get()).f4204h;
                        if (c0519a != null && c0519a.h()) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        S.p.a();
                    }
                    this.f9409h = gVar;
                    this.f9410i = c0969c;
                    this.f9411j = 1;
                    obj = c0969c.b(this);
                    gVar = gVar;
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        gVar.a(null);
                        return R1.y.f4171a;
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
                gVar.a(cancellationException);
                throw th2;
            }
        }
    }
}
