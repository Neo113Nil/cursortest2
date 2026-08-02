package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayz extends kra implements krx {
    Object a;
    Object b;
    int c;
    final /* synthetic */ asp d;
    final /* synthetic */ axt e;
    final /* synthetic */ brn f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayz(asp aspVar, brn brnVar, axt axtVar, kqj kqjVar) {
        super(2, kqjVar);
        this.d = aspVar;
        this.f = brnVar;
        this.e = axtVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayz) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #0 {all -> 0x0066, blocks: (B:36:0x0057, B:37:0x0065, B:14:0x006d, B:17:0x0087, B:18:0x0090, B:20:0x0091, B:6:0x0012, B:7:0x0050, B:23:0x003f), top: B:2:0x0007, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kwu] */
    /* JADX WARN: Type inference failed for: r1v5, types: [kwu] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        hvi hviVar;
        ?? r4;
        kqp kqpVar = kqp.a;
        ?? r1 = this.c;
        try {
            try {
                if (r1 != 0) {
                    Object obj2 = this.b;
                    r4 = this.a;
                    atomicInteger = (AtomicInteger) this.g;
                    try {
                        ixc.Y(obj);
                        r1 = obj2;
                        r4 = r4;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        hviVar = r4;
                        String str = azf.a;
                        asp aspVar = this.d;
                        asq.a();
                        Objects.toString(aspVar.getClass());
                        int i = atomicInteger.get();
                        if (hviVar.isCancelled()) {
                        }
                    }
                } else {
                    ixc.Y(obj);
                    kvm kvmVar = (kvm) this.g;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    asp aspVar2 = this.d;
                    brn brnVar = this.f;
                    axt axtVar = this.e;
                    hvi b = aspVar2.b();
                    kwu i2 = ixg.i(kvmVar, null, 0, new ayy(brnVar, axtVar, atomicInteger2, b, (kqj) null, 0), 3);
                    try {
                        this.g = atomicInteger2;
                        this.a = b;
                        this.b = i2;
                        this.c = 1;
                        obj = ow.j(b, this);
                        if (obj == kqpVar) {
                            return kqpVar;
                        }
                        atomicInteger = atomicInteger2;
                        r4 = b;
                        r1 = i2;
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        atomicInteger = atomicInteger2;
                        hviVar = b;
                        String str2 = azf.a;
                        asp aspVar3 = this.d;
                        asq.a();
                        Objects.toString(aspVar3.getClass());
                        int i3 = atomicInteger.get();
                        if (hviVar.isCancelled()) {
                            throw cancellationException;
                        }
                        if (i3 != -256) {
                            throw new ayw(atomicInteger.get());
                        }
                        throw cancellationException;
                    }
                }
                yo yoVar = (yo) obj;
                r1.s(null);
                return yoVar;
            } catch (Throwable th) {
                String str3 = azf.a;
                asp aspVar4 = this.d;
                asq.a();
                Objects.toString(aspVar4.getClass());
                throw th;
            }
        } catch (Throwable th2) {
            r1.s(null);
            throw th2;
        }
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        ayz ayzVar = new ayz(this.d, this.f, this.e, kqjVar);
        ayzVar.g = obj;
        return ayzVar;
    }
}
