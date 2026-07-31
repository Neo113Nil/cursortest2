package m;

import I.InterfaceC0088c0;
import k2.AbstractC0552y;
import k2.InterfaceC0550w;
import m2.C0628c;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597g extends R1.i implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public C0628c f5735e;

    /* renamed from: f, reason: collision with root package name */
    public int f5736f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5737g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m2.i f5738h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0593d f5739i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f5740j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0088c0 f5741k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0597g(m2.i iVar, C0593d c0593d, InterfaceC0088c0 interfaceC0088c0, InterfaceC0088c0 interfaceC0088c02, P1.d dVar) {
        super(2, dVar);
        this.f5738h = iVar;
        this.f5739i = c0593d;
        this.f5740j = interfaceC0088c0;
        this.f5741k = interfaceC0088c02;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        C0597g c0597g = new C0597g(this.f5738h, this.f5739i, this.f5740j, this.f5741k, dVar);
        c0597g.f5737g = obj;
        return c0597g;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((C0597g) create((InterfaceC0550w) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:5:0x0036). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0628c it;
        InterfaceC0550w interfaceC0550w;
        Q1.a aVar = Q1.a.f3113d;
        int i3 = this.f5736f;
        m2.i iVar = this.f5738h;
        if (i3 == 0) {
            I2.l.Q(obj);
            InterfaceC0550w interfaceC0550w2 = (InterfaceC0550w) this.f5737g;
            it = iVar.iterator();
            interfaceC0550w = interfaceC0550w2;
            this.f5737g = interfaceC0550w;
            this.f5735e = it;
            this.f5736f = 1;
            obj = it.b(this);
            if (obj == aVar) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f5735e;
            interfaceC0550w = (InterfaceC0550w) this.f5737g;
            I2.l.Q(obj);
            if (((Boolean) obj).booleanValue()) {
                Object c3 = it.c();
                Object f3 = iVar.f();
                if (f3 instanceof m2.k) {
                    f3 = null;
                }
                AbstractC0552y.q(interfaceC0550w, null, null, new C0596f(f3 == null ? c3 : f3, this.f5739i, this.f5740j, this.f5741k, null), 3);
                this.f5737g = interfaceC0550w;
                this.f5735e = it;
                this.f5736f = 1;
                obj = it.b(this);
                if (obj == aVar) {
                    return aVar;
                }
                if (((Boolean) obj).booleanValue()) {
                    return L1.z.f2729a;
                }
            }
        }
    }
}
