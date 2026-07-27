package f1;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import y2.AbstractC1343r;

/* renamed from: f1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0600A extends E2.j implements Function1 {

    /* renamed from: k, reason: collision with root package name */
    public Throwable f6465k;

    /* renamed from: l, reason: collision with root package name */
    public int f6466l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f6467m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0600A(N n2, C2.a aVar) {
        super(1, aVar);
        this.f6467m = n2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C0600A(this.f6467m, (C2.a) obj).l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Throwable th;
        Y y4;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f6466l;
        N n2 = this.f6467m;
        try {
        } catch (Throwable th2) {
            X e4 = n2.e();
            this.f6465k = th2;
            this.f6466l = 2;
            Integer a4 = e4.a();
            if (a4 == aVar) {
                return aVar;
            }
            th = th2;
            obj = a4;
        }
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f6466l = 1;
            obj = N.c(n2, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.f6465k;
                AbstractC1343r.b(obj);
                y4 = new Q(th, ((Number) obj).intValue());
                return new Pair(y4, Boolean.TRUE);
            }
            AbstractC1343r.b(obj);
        }
        y4 = (Y) obj;
        return new Pair(y4, Boolean.TRUE);
    }
}
