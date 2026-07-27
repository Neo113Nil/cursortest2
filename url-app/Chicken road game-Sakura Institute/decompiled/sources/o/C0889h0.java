package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889h0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8775k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ long f8776l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0891i0 f8777m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0889h0(C0891i0 c0891i0, C2.a aVar) {
        super(2, aVar);
        this.f8777m = c0891i0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        long j4 = ((Y.c) obj).f4372a;
        C0889h0 c0889h0 = new C0889h0(this.f8777m, (C2.a) obj2);
        c0889h0.f8776l = j4;
        return c0889h0.l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0889h0 c0889h0 = new C0889h0(this.f8777m, aVar);
        c0889h0.f8776l = ((Y.c) obj).f4372a;
        return c0889h0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8775k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            long j4 = this.f8776l;
            C0908r0 c0908r0 = this.f8777m.f8791I;
            this.f8775k = 1;
            obj = androidx.compose.foundation.gestures.a.a(c0908r0, j4, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        return obj;
    }
}
