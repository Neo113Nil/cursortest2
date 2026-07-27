package P0;

import G.C0192d;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s0.C1165r0;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class k extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f3740k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3741l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B f3742m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(B b4, C2.a aVar) {
        super(2, aVar);
        this.f3742m = b4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((k) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        k kVar = new k(this.f3742m, aVar);
        kVar.f3741l = obj;
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0045 -> B:5:0x0048). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        InterfaceC0302y interfaceC0302y;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f3740k;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            interfaceC0302y = (InterfaceC0302y) this.f3741l;
            if (W2.B.k(interfaceC0302y)) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0302y = (InterfaceC0302y) this.f3741l;
            AbstractC1343r.b(obj);
            B b4 = this.f3742m;
            int[] iArr = b4.f3686G;
            int i4 = iArr[0];
            int i5 = iArr[1];
            b4.f3690r.getLocationOnScreen(iArr);
            if (i4 == iArr[0] || i5 != iArr[1]) {
                b4.j();
            }
            if (W2.B.k(interfaceC0302y)) {
                C0262d c0262d = C0262d.f3714i;
                this.f3741l = interfaceC0302y;
                this.f3740k = 1;
                CoroutineContext coroutineContext = this.f2311e;
                Intrinsics.c(coroutineContext);
                if (coroutineContext.k(C1165r0.f10311d) != null) {
                    throw new ClassCastException();
                }
                Intrinsics.c(coroutineContext);
                if (C0192d.F(coroutineContext).f(c0262d, this) == aVar) {
                    return aVar;
                }
                B b42 = this.f3742m;
                int[] iArr2 = b42.f3686G;
                int i42 = iArr2[0];
                int i52 = iArr2[1];
                b42.f3690r.getLocationOnScreen(iArr2);
                if (i42 == iArr2[0]) {
                }
                b42.j();
                if (W2.B.k(interfaceC0302y)) {
                    return Unit.f7487a;
                }
            }
        }
    }
}
