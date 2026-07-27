package w;

import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p.C0935k;
import p.C0936l;
import p.C0937m;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class e0 extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public Object f11175k;

    /* renamed from: l, reason: collision with root package name */
    public int f11176l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0191c0 f11177m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f11178n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0935k f11179o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(InterfaceC0191c0 interfaceC0191c0, long j4, C0935k c0935k, C2.a aVar) {
        super(2, aVar);
        this.f11177m = interfaceC0191c0;
        this.f11178n = j4;
        this.f11179o = c0935k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((e0) j((C2.a) obj2, (InterfaceC0302y) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        return new e0(this.f11177m, this.f11178n, this.f11179o, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        InterfaceC0191c0 interfaceC0191c0;
        C0937m c0937m;
        C0937m c0937m2;
        D2.a aVar = D2.a.f2163d;
        int i2 = this.f11176l;
        C0935k c0935k = this.f11179o;
        InterfaceC0191c0 interfaceC0191c02 = this.f11177m;
        if (i2 == 0) {
            AbstractC1343r.b(obj);
            C0937m c0937m3 = (C0937m) interfaceC0191c02.getValue();
            if (c0937m3 != null) {
                C0936l c0936l = new C0936l(c0937m3);
                if (c0935k != null) {
                    this.f11175k = interfaceC0191c02;
                    this.f11176l = 1;
                    if (c0935k.b(c0936l, this) == aVar) {
                        return aVar;
                    }
                }
                interfaceC0191c0 = interfaceC0191c02;
            }
            c0937m = new C0937m(this.f11178n);
            if (c0935k != null) {
                this.f11175k = c0937m;
                this.f11176l = 2;
                if (c0935k.b(c0937m, this) == aVar) {
                    return aVar;
                }
                c0937m2 = c0937m;
                c0937m = c0937m2;
            }
            interfaceC0191c02.setValue(c0937m);
            return Unit.f7487a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0937m2 = (C0937m) this.f11175k;
            AbstractC1343r.b(obj);
            c0937m = c0937m2;
            interfaceC0191c02.setValue(c0937m);
            return Unit.f7487a;
        }
        interfaceC0191c0 = (InterfaceC0191c0) this.f11175k;
        AbstractC1343r.b(obj);
        interfaceC0191c0.setValue(null);
        c0937m = new C0937m(this.f11178n);
        if (c0935k != null) {
        }
        interfaceC0191c02.setValue(c0937m);
        return Unit.f7487a;
    }
}
