package m;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0935k;
import p.C0937m;
import y2.AbstractC1343r;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0832e extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8106k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0850x f8107l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0937m f8108m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0832e(C0850x c0850x, C0937m c0937m, C2.a aVar) {
        super(2, aVar);
        this.f8107l = c0850x;
        this.f8108m = c0937m;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0832e) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new C0832e(this.f8107l, this.f8108m, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8106k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0935k c0935k = this.f8107l.f8225v;
            if (c0935k != null) {
                this.f8106k = 1;
                if (c0935k.b(this.f8108m, this) == aVar) {
                    return aVar;
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
