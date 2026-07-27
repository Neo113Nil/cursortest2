package m;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0931g;
import p.C0932h;
import p.C0935k;
import y2.AbstractC1343r;

/* renamed from: m.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835h extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0850x f8120k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0835h(C0850x c0850x, C2.a aVar) {
        super(2, aVar);
        this.f8120k = c0850x;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0835h) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0835h(this.f8120k, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        AbstractC1343r.b(obj);
        C0850x c0850x = this.f8120k;
        C0931g c0931g = c0850x.f8219G;
        if (c0931g != null) {
            C0932h c0932h = new C0932h(c0931g);
            C0935k c0935k = c0850x.f8225v;
            if (c0935k != null) {
                W2.B.m(c0850x.p0(), null, null, new C0829b(c0935k, c0932h, null), 3);
            }
            c0850x.f8219G = null;
        }
        return Unit.f7487a;
    }
}
