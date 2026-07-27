package x0;

import a.AbstractC0345a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n.AbstractC0864b;
import y0.q;
import y2.AbstractC1343r;

/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1303e extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public boolean f11422k;

    /* renamed from: l, reason: collision with root package name */
    public int f11423l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ float f11424m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureCallbackC1304f f11425n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303e(ScrollCaptureCallbackC1304f scrollCaptureCallbackC1304f, C2.a aVar) {
        super(2, aVar);
        this.f11425n = scrollCaptureCallbackC1304f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1303e) j((C2.a) obj2, Float.valueOf(((Number) obj).floatValue()))).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C1303e c1303e = new C1303e(this.f11425n, aVar);
        c1303e.f11424m = ((Number) obj).floatValue();
        return c1303e;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        boolean z4;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11423l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            float f4 = this.f11424m;
            ScrollCaptureCallbackC1304f scrollCaptureCallbackC1304f = this.f11425n;
            Object obj2 = scrollCaptureCallbackC1304f.f11426a.f11587d.f11576d.get(y0.h.f11554e);
            if (obj2 == null) {
                obj2 = null;
            }
            Function2 function2 = (Function2) obj2;
            if (function2 == null) {
                AbstractC0864b.E("Required value was null.");
                throw null;
            }
            boolean z5 = ((y0.g) scrollCaptureCallbackC1304f.f11426a.f11587d.h(q.f11627p)).f11548c;
            if (z5) {
                f4 = -f4;
            }
            Y.c cVar = new Y.c(AbstractC0345a.c(0.0f, f4));
            this.f11422k = z5;
            this.f11423l = 1;
            obj = function2.h(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
            z4 = z5;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = this.f11422k;
            AbstractC1343r.b(obj);
        }
        float e4 = Y.c.e(((Y.c) obj).f4372a);
        if (z4) {
            e4 = -e4;
        }
        return new Float(e4);
    }
}
