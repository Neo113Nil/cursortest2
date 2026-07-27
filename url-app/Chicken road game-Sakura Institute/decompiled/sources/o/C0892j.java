package o;

import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892j extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f8802k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f8803l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0894k f8804m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U0 f8805n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0880d f8806o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0892j(C0894k c0894k, U0 u02, InterfaceC0880d interfaceC0880d, C2.a aVar) {
        super(2, aVar);
        this.f8804m = c0894k;
        this.f8805n = u02;
        this.f8806o = interfaceC0880d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((C0892j) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0892j c0892j = new C0892j(this.f8804m, this.f8805n, this.f8806o, aVar);
        c0892j.f8803l = obj;
        return c0892j;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f8802k;
        C0894k c0894k = this.f8804m;
        try {
            try {
                if (i2 == 0) {
                    AbstractC1343r.b(obj);
                    InterfaceC0280c0 g4 = W2.B.g(((InterfaceC0302y) this.f8803l).q());
                    c0894k.f8808C = true;
                    C0908r0 c0908r0 = c0894k.f8810u;
                    m.b0 b0Var = m.b0.f8079d;
                    C0890i c0890i = new C0890i(this.f8805n, c0894k, this.f8806o, g4, null);
                    this.f8802k = 1;
                    if (c0908r0.e(b0Var, c0890i, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1343r.b(obj);
                }
                c0894k.f8813x.e();
                c0894k.f8808C = false;
                c0894k.f8813x.b(null);
                c0894k.f8807A = false;
                return Unit.f7487a;
            } catch (CancellationException e4) {
                throw e4;
            }
        } catch (Throwable th) {
            c0894k.f8808C = false;
            c0894k.f8813x.b(null);
            c0894k.f8807A = false;
            throw th;
        }
    }
}
