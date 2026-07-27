package x0;

import B0.p;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1299a extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f11402k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ScrollCaptureCallbackC1304f f11403l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Runnable f11404m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1299a(ScrollCaptureCallbackC1304f scrollCaptureCallbackC1304f, Runnable runnable, C2.a aVar) {
        super(2, aVar);
        this.f11403l = scrollCaptureCallbackC1304f;
        this.f11404m = runnable;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C1299a) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C1299a(this.f11403l, this.f11404m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11402k;
        ScrollCaptureCallbackC1304f scrollCaptureCallbackC1304f = this.f11403l;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            p pVar = scrollCaptureCallbackC1304f.f11430e;
            this.f11402k = 1;
            Object b4 = pVar.b(0.0f - pVar.f930b, this);
            if (b4 != aVar) {
                b4 = Unit.f7487a;
            }
            if (b4 == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        k kVar = scrollCaptureCallbackC1304f.f11428c;
        kVar.f11439a.setValue(Boolean.FALSE);
        this.f11404m.run();
        return Unit.f7487a;
    }
}
