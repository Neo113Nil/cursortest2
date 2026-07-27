package t1;

import A.M;
import G.C0197f0;
import G.InterfaceC0191c0;
import Z2.InterfaceC0330f;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s1.C1193i;
import y2.AbstractC1343r;
import z2.C1403G;

/* loaded from: classes.dex */
public final class s extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public int f10692k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f10693l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f10694m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0197f0 f10695n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f10696o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f10697p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i iVar, C0197f0 c0197f0, InterfaceC0191c0 interfaceC0191c0, InterfaceC0191c0 interfaceC0191c02, C2.a aVar) {
        super(2, aVar);
        this.f10694m = iVar;
        this.f10695n = c0197f0;
        this.f10696o = interfaceC0191c0;
        this.f10697p = interfaceC0191c02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((s) j((C2.a) obj2, (InterfaceC0330f) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        s sVar = new s(this.f10694m, this.f10695n, this.f10696o, this.f10697p, aVar);
        sVar.f10693l = obj;
        return sVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        C1193i c1193i;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f10692k;
        i iVar = this.f10694m;
        InterfaceC0191c0 interfaceC0191c0 = this.f10697p;
        try {
            if (i2 == 0) {
                AbstractC1343r.b(obj);
                InterfaceC0330f interfaceC0330f = (InterfaceC0330f) this.f10693l;
                C0197f0 c0197f0 = this.f10695n;
                c0197f0.f(0.0f);
                InterfaceC0191c0 interfaceC0191c02 = this.f10696o;
                C1193i c1193i2 = (C1193i) C1403G.y((List) interfaceC0191c02.getValue());
                Intrinsics.c(c1193i2);
                iVar.g(c1193i2);
                iVar.g((C1193i) ((List) interfaceC0191c02.getValue()).get(((List) interfaceC0191c02.getValue()).size() - 2));
                M m4 = new M(interfaceC0191c0, 8, c0197f0);
                this.f10693l = c1193i2;
                this.f10692k = 1;
                if (interfaceC0330f.e(m4, this) == aVar) {
                    return aVar;
                }
                c1193i = c1193i2;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1193i = (C1193i) this.f10693l;
                AbstractC1343r.b(obj);
            }
            interfaceC0191c0.setValue(Boolean.FALSE);
            iVar.e(c1193i, false);
        } catch (CancellationException unused) {
            interfaceC0191c0.setValue(Boolean.FALSE);
        }
        return Unit.f7487a;
    }
}
