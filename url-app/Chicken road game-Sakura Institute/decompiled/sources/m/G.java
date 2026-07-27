package m;

import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0935k;
import p.InterfaceC0933i;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class G extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8016k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0935k f8017l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0933i f8018m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W2.L f8019n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0935k c0935k, InterfaceC0933i interfaceC0933i, W2.L l4, C2.a aVar) {
        super(2, aVar);
        this.f8017l = c0935k;
        this.f8018m = interfaceC0933i;
        this.f8019n = l4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((G) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new G(this.f8017l, this.f8018m, this.f8019n, aVar);
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8016k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            this.f8016k = 1;
            if (this.f8017l.b(this.f8018m, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1343r.b(obj);
        }
        W2.L l4 = this.f8019n;
        if (l4 != null) {
            l4.a();
        }
        return Unit.f7487a;
    }
}
