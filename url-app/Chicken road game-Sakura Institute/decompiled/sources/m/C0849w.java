package m;

import kotlin.Unit;
import p.C0935k;
import y2.AbstractC1343r;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849w extends E2.j implements L2.c {

    /* renamed from: k, reason: collision with root package name */
    public int f8209k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ o.Q f8210l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f8211m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0850x f8212n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0849w(C0850x c0850x, C2.a aVar) {
        super(3, aVar);
        this.f8212n = c0850x;
    }

    @Override // L2.c
    public final Object g(Object obj, Object obj2, Object obj3) {
        long j4 = ((Y.c) obj2).f4372a;
        C0849w c0849w = new C0849w(this.f8212n, (C2.a) obj3);
        c0849w.f8210l = (o.Q) obj;
        c0849w.f8211m = j4;
        return c0849w.l(Unit.f7487a);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        Object obj2;
        Object obj3 = D2.a.f2163d;
        int i2 = this.f8209k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            o.Q q2 = this.f8210l;
            long j4 = this.f8211m;
            C0850x c0850x = this.f8212n;
            if (c0850x.f8229z) {
                this.f8209k = 1;
                C0935k c0935k = c0850x.f8225v;
                if (c0935k == null || (obj2 = W2.B.d(new C0831d(q2, j4, c0935k, c0850x, null), this)) != obj3) {
                    obj2 = Unit.f7487a;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return Unit.f7487a;
    }
}
