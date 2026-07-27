package a3;

import A.a0;
import G.V;
import M2.C;
import M2.E;
import W2.B;
import W2.EnumC0303z;
import W2.InterfaceC0280c0;
import W2.InterfaceC0302y;
import Z2.InterfaceC0331g;
import kotlin.Unit;
import m.C0826B;
import p.C0928d;
import p.C0929e;
import p.C0931g;
import p.C0932h;
import p.C0936l;
import p.C0937m;
import p.C0938n;
import p.InterfaceC0933i;
import r0.AbstractC1065f;
import w.M;
import w.P;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class m implements InterfaceC0331g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4972e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4973i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f4974j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f4975k;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f4971d = i2;
        this.f4972e = obj;
        this.f4973i = obj2;
        this.f4974j = obj3;
        this.f4975k = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f6  */
    @Override // Z2.InterfaceC0331g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, C2.a aVar) {
        l lVar;
        int i2;
        m mVar;
        switch (this.f4971d) {
            case 0:
                if (aVar instanceof l) {
                    lVar = (l) aVar;
                    int i4 = lVar.f4970n;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        lVar.f4970n = i4 - Integer.MIN_VALUE;
                        Object obj2 = lVar.f4968l;
                        D2.a aVar2 = D2.a.f2163d;
                        i2 = lVar.f4970n;
                        if (i2 != 0) {
                            AbstractC1343r.b(obj2);
                            InterfaceC0280c0 interfaceC0280c0 = (InterfaceC0280c0) ((E) this.f4972e).f3580d;
                            if (interfaceC0280c0 != null) {
                                interfaceC0280c0.a(new V("Child of the scoped flow was cancelled", 2));
                                lVar.f4966j = this;
                                lVar.f4967k = obj;
                                lVar.f4970n = 1;
                                if (interfaceC0280c0.x(lVar) == aVar2) {
                                    return aVar2;
                                }
                            }
                            mVar = this;
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = lVar.f4967k;
                            mVar = lVar.f4966j;
                            AbstractC1343r.b(obj2);
                        }
                        ((E) mVar.f4972e).f3580d = B.m((InterfaceC0302y) mVar.f4973i, null, EnumC0303z.f4307j, new C0433k((o) mVar.f4974j, (InterfaceC0331g) mVar.f4975k, obj, null), 1);
                        return Unit.f7487a;
                    }
                }
                lVar = new l(this, aVar);
                Object obj22 = lVar.f4968l;
                D2.a aVar22 = D2.a.f2163d;
                i2 = lVar.f4970n;
                if (i2 != 0) {
                }
                ((E) mVar.f4972e).f3580d = B.m((InterfaceC0302y) mVar.f4973i, null, EnumC0303z.f4307j, new C0433k((o) mVar.f4974j, (InterfaceC0331g) mVar.f4975k, obj, null), 1);
                return Unit.f7487a;
            case 1:
                InterfaceC0933i interfaceC0933i = (InterfaceC0933i) obj;
                boolean z4 = interfaceC0933i instanceof C0937m;
                C c4 = (C) this.f4974j;
                C c5 = (C) this.f4973i;
                C c6 = (C) this.f4972e;
                boolean z5 = true;
                if (z4) {
                    c6.f3578d++;
                } else if (interfaceC0933i instanceof C0938n) {
                    c6.f3578d--;
                } else if (interfaceC0933i instanceof C0936l) {
                    c6.f3578d--;
                } else if (interfaceC0933i instanceof C0931g) {
                    c5.f3578d++;
                } else if (interfaceC0933i instanceof C0932h) {
                    c5.f3578d--;
                } else if (interfaceC0933i instanceof C0928d) {
                    c4.f3578d++;
                } else if (interfaceC0933i instanceof C0929e) {
                    c4.f3578d--;
                }
                boolean z6 = false;
                boolean z7 = c6.f3578d > 0;
                boolean z8 = c5.f3578d > 0;
                boolean z9 = c4.f3578d > 0;
                C0826B c0826b = (C0826B) this.f4975k;
                if (c0826b.f7997u != z7) {
                    c0826b.f7997u = z7;
                    z6 = true;
                }
                if (c0826b.f7998v != z8) {
                    c0826b.f7998v = z8;
                    z6 = true;
                }
                if (c0826b.f7999w != z9) {
                    c0826b.f7999w = z9;
                } else {
                    z5 = z6;
                }
                if (z5) {
                    AbstractC1065f.n(c0826b);
                }
                return Unit.f7487a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                P p4 = (P) this.f4972e;
                if (booleanValue && p4.b()) {
                    a0 a0Var = (a0) this.f4974j;
                    M.j((G0.z) this.f4973i, p4, a0Var.j(), (G0.m) this.f4975k, a0Var.f85b);
                } else {
                    M.g(p4);
                }
                return Unit.f7487a;
        }
    }
}
