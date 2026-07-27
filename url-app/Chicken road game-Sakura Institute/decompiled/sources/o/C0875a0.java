package o;

import A.C0028y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0875a0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8742k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8743l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J f8744m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0908r0 f8745n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0875a0(J j4, C0908r0 c0908r0, C2.a aVar) {
        super(2, aVar);
        this.f8744m = j4;
        this.f8745n = c0908r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0875a0) j((C2.a) obj2, (C0903o0) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0875a0 c0875a0 = new C0875a0(this.f8744m, this.f8745n, aVar);
        c0875a0.f8743l = obj;
        return c0875a0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8742k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0028y c0028y = new C0028y((C0903o0) this.f8743l, 28, this.f8745n);
            this.f8742k = 1;
            if (this.f8744m.h(c0028y, this) == aVar) {
                return aVar;
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
