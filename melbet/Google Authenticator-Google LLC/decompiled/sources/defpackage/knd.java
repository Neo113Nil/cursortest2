package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class knd extends kra implements krx {
    Object a;
    int b;
    final /* synthetic */ AtomicBoolean c;
    final /* synthetic */ kbg d;
    final /* synthetic */ kys e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public knd(AtomicBoolean atomicBoolean, kbg kbgVar, kys kysVar, kqj kqjVar) {
        super(2, kqjVar);
        this.c = atomicBoolean;
        this.d = kbgVar;
        this.e = kysVar;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((knd) c((kzr) obj, (kqj) obj2)).b(kow.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[Catch: Exception -> 0x006d, TryCatch #0 {Exception -> 0x006d, blocks: (B:7:0x000f, B:9:0x0067, B:10:0x0038, B:13:0x004a, B:15:0x0052, B:24:0x0018, B:28:0x0031), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0064 -> B:8:0x0012). Please report as a decompilation issue!!! */
    @Override // defpackage.kqu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj) {
        kzr kzrVar;
        Object A;
        kzr kzrVar2;
        Object a;
        kqp kqpVar = kqp.a;
        int i = this.b;
        try {
            if (i == 0) {
                ixc.Y(obj);
                kzrVar = (kzr) this.f;
                if (!this.c.compareAndSet(false, true)) {
                    throw new IllegalStateException("requests flow can only be collected once");
                }
                this.d.f();
                A = this.e.A();
                this.f = kzrVar;
                this.a = A;
                this.b = 1;
                a = ((kyk) A).a(this);
                if (a != kqpVar) {
                }
                return kqpVar;
            }
            A = this.a;
            if (i != 1) {
                kzrVar2 = (kzr) this.f;
                ixc.Y(obj);
                kzrVar = kzrVar2;
                this.d.f();
                this.f = kzrVar;
                this.a = A;
                this.b = 1;
                a = ((kyk) A).a(this);
                if (a != kqpVar) {
                    kzrVar2 = kzrVar;
                    obj = a;
                    if (((Boolean) obj).booleanValue()) {
                        return kow.a;
                    }
                    Object b = ((kyk) A).b();
                    this.f = kzrVar2;
                    this.a = A;
                    this.b = 2;
                    if (kzrVar2.cg(b, this) == kqpVar) {
                    }
                    kzrVar = kzrVar2;
                    this.d.f();
                    this.f = kzrVar;
                    this.a = A;
                    this.b = 1;
                    a = ((kyk) A).a(this);
                    if (a != kqpVar) {
                    }
                }
                return kqpVar;
            }
            kzrVar2 = (kzr) this.f;
            ixc.Y(obj);
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (Exception e) {
            this.e.s(ixh.c("Exception thrown while collecting requests", e));
            this.d.f();
            throw e;
        }
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        knd kndVar = new knd(this.c, this.d, this.e, kqjVar);
        kndVar.f = obj;
        return kndVar;
    }
}
