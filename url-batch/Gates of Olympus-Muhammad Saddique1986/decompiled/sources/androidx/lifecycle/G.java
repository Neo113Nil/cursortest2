package androidx.lifecycle;

import e2.InterfaceC0426e;
import p1.C0803b;
import q2.C0821h;
import q2.InterfaceC0835w;

/* loaded from: classes.dex */
public final class G extends X1.i implements InterfaceC0426e {

    /* renamed from: h, reason: collision with root package name */
    public f2.u f5162h;

    /* renamed from: i, reason: collision with root package name */
    public f2.u f5163i;

    /* renamed from: j, reason: collision with root package name */
    public int f5164j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0294x f5165k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EnumC0286o f5166l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0835w f5167m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0803b f5168n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C0294x c0294x, EnumC0286o enumC0286o, InterfaceC0835w interfaceC0835w, C0803b c0803b, V1.d dVar) {
        super(2, dVar);
        this.f5165k = c0294x;
        this.f5166l = enumC0286o;
        this.f5167m = interfaceC0835w;
        this.f5168n = c0803b;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((G) o((V1.d) obj2, (InterfaceC0835w) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        return new G(this.f5165k, this.f5166l, this.f5167m, this.f5168n, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        f2.u uVar;
        f2.u uVar2;
        EnumC0285n enumC0285n;
        EnumC0285n enumC0285n2;
        q2.X x3;
        InterfaceC0290t interfaceC0290t;
        W1.a aVar = W1.a.f4608d;
        int i3 = this.f5164j;
        R1.y yVar = R1.y.f4171a;
        C0294x c0294x = this.f5165k;
        if (i3 == 0) {
            R1.a.e(obj);
            if (c0294x.f5242d == EnumC0286o.f5226d) {
                return yVar;
            }
            f2.u uVar3 = new f2.u();
            f2.u uVar4 = new f2.u();
            try {
                EnumC0286o enumC0286o = this.f5166l;
                InterfaceC0835w interfaceC0835w = this.f5167m;
                C0803b c0803b = this.f5168n;
                this.f5162h = uVar3;
                this.f5163i = uVar4;
                this.f5164j = 1;
                C0821h c0821h = new C0821h(1, l0.c.B(this));
                c0821h.r();
                EnumC0285n.Companion.getClass();
                f2.j.f(enumC0286o, "state");
                int ordinal = enumC0286o.ordinal();
                if (ordinal == 2) {
                    enumC0285n = EnumC0285n.ON_CREATE;
                } else if (ordinal == 3) {
                    enumC0285n = EnumC0285n.ON_START;
                } else if (ordinal != 4) {
                    enumC0285n2 = null;
                    F f3 = new F(enumC0285n2, uVar3, interfaceC0835w, C0283l.a(enumC0286o), c0821h, y2.d.a(), c0803b);
                    uVar4.f5832d = f3;
                    c0294x.a(f3);
                    if (c0821h.q() != aVar) {
                        return aVar;
                    }
                    uVar = uVar3;
                    uVar2 = uVar4;
                } else {
                    enumC0285n = EnumC0285n.ON_RESUME;
                }
                enumC0285n2 = enumC0285n;
                F f32 = new F(enumC0285n2, uVar3, interfaceC0835w, C0283l.a(enumC0286o), c0821h, y2.d.a(), c0803b);
                uVar4.f5832d = f32;
                c0294x.a(f32);
                if (c0821h.q() != aVar) {
                }
            } catch (Throwable th) {
                th = th;
                uVar = uVar3;
                uVar2 = uVar4;
                x3 = (q2.X) uVar.f5832d;
                if (x3 != null) {
                    x3.a(null);
                }
                interfaceC0290t = (InterfaceC0290t) uVar2.f5832d;
                if (interfaceC0290t != null) {
                    c0294x.f(interfaceC0290t);
                }
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar2 = this.f5163i;
            uVar = this.f5162h;
            try {
                R1.a.e(obj);
            } catch (Throwable th2) {
                th = th2;
                x3 = (q2.X) uVar.f5832d;
                if (x3 != null) {
                }
                interfaceC0290t = (InterfaceC0290t) uVar2.f5832d;
                if (interfaceC0290t != null) {
                }
                throw th;
            }
        }
        q2.X x4 = (q2.X) uVar.f5832d;
        if (x4 != null) {
            x4.a(null);
        }
        InterfaceC0290t interfaceC0290t2 = (InterfaceC0290t) uVar2.f5832d;
        if (interfaceC0290t2 != null) {
            c0294x.f(interfaceC0290t2);
        }
        return yVar;
    }
}
