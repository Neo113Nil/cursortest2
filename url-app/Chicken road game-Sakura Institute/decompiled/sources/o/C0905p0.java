package o;

import B1.C0097d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905p0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public long f8850k;

    /* renamed from: l, reason: collision with root package name */
    public int f8851l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f8852m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0908r0 f8853n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0905p0(C0908r0 c0908r0, C2.a aVar) {
        super(2, aVar);
        this.f8853n = c0908r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        long j4 = ((M0.o) obj).f3563a;
        C0905p0 c0905p0 = new C0905p0(this.f8853n, (C2.a) obj2);
        c0905p0.f8852m = j4;
        return c0905p0.l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0905p0 c0905p0 = new C0905p0(this.f8853n, aVar);
        c0905p0.f8852m = ((M0.o) obj).f3563a;
        return c0905p0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        long j4;
        Object g4;
        Object b4;
        long j5;
        long j6;
        Object f4;
        long j7;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8851l;
        C0908r0 c0908r0 = this.f8853n;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            j4 = this.f8852m;
            C0097d c0097d = c0908r0.f8870f;
            this.f8852m = j4;
            this.f8851l = 1;
            g4 = c0097d.g(j4, this);
            if (g4 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j8 = this.f8850k;
                    j7 = this.f8852m;
                    AbstractC1343r.b(obj);
                    j6 = j8;
                    f4 = obj;
                    return new M0.o(M0.o.d(j7, M0.o.d(j6, ((M0.o) f4).f3563a)));
                }
                j5 = this.f8850k;
                j4 = this.f8852m;
                AbstractC1343r.b(obj);
                b4 = obj;
                j6 = ((M0.o) b4).f3563a;
                C0097d c0097d2 = c0908r0.f8870f;
                long d4 = M0.o.d(j5, j6);
                this.f8852m = j4;
                this.f8850k = j6;
                this.f8851l = 3;
                f4 = c0097d2.f(d4, j6, this);
                if (f4 != aVar) {
                    return aVar;
                }
                j7 = j4;
                return new M0.o(M0.o.d(j7, M0.o.d(j6, ((M0.o) f4).f3563a)));
            }
            j4 = this.f8852m;
            AbstractC1343r.b(obj);
            g4 = obj;
        }
        long d5 = M0.o.d(j4, ((M0.o) g4).f3563a);
        this.f8852m = j4;
        this.f8850k = d5;
        this.f8851l = 2;
        b4 = c0908r0.b(d5, this);
        if (b4 == aVar) {
            return aVar;
        }
        j5 = d5;
        j6 = ((M0.o) b4).f3563a;
        C0097d c0097d22 = c0908r0.f8870f;
        long d42 = M0.o.d(j5, j6);
        this.f8852m = j4;
        this.f8850k = j6;
        this.f8851l = 3;
        f4 = c0097d22.f(d42, j6, this);
        if (f4 != aVar) {
        }
    }
}
