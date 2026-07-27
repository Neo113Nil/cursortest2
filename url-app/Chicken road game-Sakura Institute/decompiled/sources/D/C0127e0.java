package D;

import G.C0215o0;
import G.InterfaceC0191c0;
import W2.InterfaceC0302y;
import Z2.C0328d;
import Z2.C0329e;
import Z2.C0337m;
import Z2.InterfaceC0331g;
import a3.AbstractC0425c;
import a3.C0422A;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p.C0928d;
import p.C0929e;
import p.C0931g;
import p.C0932h;
import p.C0936l;
import p.C0937m;
import p.C0938n;
import p.InterfaceC0933i;
import y2.AbstractC1343r;
import z2.C1403G;

/* renamed from: D.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127e0 implements InterfaceC0331g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1763d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1764e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1765i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f1766j;

    /* JADX WARN: Multi-variable type inference failed */
    public C0127e0(M2.A a4, InterfaceC0331g interfaceC0331g, Function2 function2) {
        this.f1763d = 2;
        this.f1764e = a4;
        this.f1765i = interfaceC0331g;
        this.f1766j = (E2.j) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Type inference failed for: r8v22, types: [E2.j, kotlin.jvm.functions.Function2] */
    @Override // Z2.InterfaceC0331g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, C2.a aVar) {
        C0328d c0328d;
        int i2;
        C0337m c0337m;
        int i4;
        C0127e0 c0127e0;
        boolean z4;
        switch (this.f1763d) {
            case 0:
                InterfaceC0933i interfaceC0933i = (InterfaceC0933i) obj;
                boolean z5 = interfaceC0933i instanceof C0931g;
                ArrayList arrayList = (ArrayList) this.f1764e;
                if (z5) {
                    arrayList.add(interfaceC0933i);
                } else if (interfaceC0933i instanceof C0932h) {
                    arrayList.remove(((C0932h) interfaceC0933i).f8971a);
                } else if (interfaceC0933i instanceof C0928d) {
                    arrayList.add(interfaceC0933i);
                } else if (interfaceC0933i instanceof C0929e) {
                    arrayList.remove(((C0929e) interfaceC0933i).f8967a);
                } else if (interfaceC0933i instanceof C0937m) {
                    arrayList.add(interfaceC0933i);
                } else if (interfaceC0933i instanceof C0938n) {
                    arrayList.remove(((C0938n) interfaceC0933i).f8975a);
                } else if (interfaceC0933i instanceof C0936l) {
                    arrayList.remove(((C0936l) interfaceC0933i).f8973a);
                }
                W2.B.m((InterfaceC0302y) this.f1765i, null, null, new C0124d0((C0142j0) this.f1766j, (InterfaceC0933i) C1403G.y(arrayList), null), 3);
                return Unit.f7487a;
            case 1:
                if (aVar instanceof C0328d) {
                    c0328d = (C0328d) aVar;
                    int i5 = c0328d.f4673l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0328d.f4673l = i5 - Integer.MIN_VALUE;
                        Object obj2 = c0328d.f4671j;
                        D2.a aVar2 = D2.a.f2163d;
                        i2 = c0328d.f4673l;
                        if (i2 != 0) {
                            AbstractC1343r.b(obj2);
                            ((C0329e) this.f1764e).getClass();
                            M2.E e4 = (M2.E) this.f1765i;
                            Object obj3 = e4.f3580d;
                            if (obj3 == AbstractC0425c.f4947b || !Intrinsics.a(obj3, obj)) {
                                e4.f3580d = obj;
                                c0328d.f4673l = 1;
                                if (((InterfaceC0331g) this.f1766j).d(obj, c0328d) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1343r.b(obj2);
                        }
                        return Unit.f7487a;
                    }
                }
                c0328d = new C0328d(this, aVar);
                Object obj22 = c0328d.f4671j;
                D2.a aVar22 = D2.a.f2163d;
                i2 = c0328d.f4673l;
                if (i2 != 0) {
                }
                return Unit.f7487a;
            case 2:
                if (aVar instanceof C0337m) {
                    c0337m = (C0337m) aVar;
                    int i6 = c0337m.f4701n;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c0337m.f4701n = i6 - Integer.MIN_VALUE;
                        Object obj4 = c0337m.f4699l;
                        D2.a aVar3 = D2.a.f2163d;
                        i4 = c0337m.f4701n;
                        if (i4 != 0) {
                            AbstractC1343r.b(obj4);
                            if (((M2.A) this.f1764e).f3576d) {
                                c0337m.f4701n = 1;
                                if (((InterfaceC0331g) this.f1765i).d(obj, c0337m) == aVar3) {
                                    return aVar3;
                                }
                                return Unit.f7487a;
                            }
                            c0337m.f4697j = this;
                            c0337m.f4698k = obj;
                            c0337m.f4701n = 2;
                            obj4 = ((E2.j) this.f1766j).h(obj, c0337m);
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            c0127e0 = this;
                            if (!((Boolean) obj4).booleanValue()) {
                            }
                            return Unit.f7487a;
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                obj = c0337m.f4698k;
                                c0127e0 = c0337m.f4697j;
                                AbstractC1343r.b(obj4);
                                if (!((Boolean) obj4).booleanValue()) {
                                    ((M2.A) c0127e0.f1764e).f3576d = true;
                                    c0337m.f4697j = null;
                                    c0337m.f4698k = null;
                                    c0337m.f4701n = 3;
                                    if (((InterfaceC0331g) c0127e0.f1765i).d(obj, c0337m) == aVar3) {
                                        return aVar3;
                                    }
                                }
                                return Unit.f7487a;
                            }
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        AbstractC1343r.b(obj4);
                        return Unit.f7487a;
                    }
                }
                c0337m = new C0337m(this, aVar);
                Object obj42 = c0337m.f4699l;
                D2.a aVar32 = D2.a.f2163d;
                i4 = c0337m.f4701n;
                if (i4 != 0) {
                }
            case 3:
                Object a4 = AbstractC0425c.a((CoroutineContext) this.f1764e, obj, this.f1765i, (C0422A) this.f1766j, aVar);
                return a4 == D2.a.f2163d ? a4 : Unit.f7487a;
            default:
                if (((Boolean) obj).booleanValue()) {
                    Function2 function2 = (Function2) ((InterfaceC0191c0) this.f1766j).getValue();
                    l.m0 m0Var = (l.m0) this.f1765i;
                    z4 = ((Boolean) function2.h(m0Var.f7800a.l(), m0Var.f7803d.getValue())).booleanValue();
                } else {
                    z4 = false;
                }
                ((C0215o0) this.f1764e).setValue(Boolean.valueOf(z4));
                return Unit.f7487a;
        }
    }

    public /* synthetic */ C0127e0(Object obj, Object obj2, Object obj3, int i2) {
        this.f1763d = i2;
        this.f1764e = obj;
        this.f1765i = obj2;
        this.f1766j = obj3;
    }

    public C0127e0(InterfaceC0331g interfaceC0331g, CoroutineContext coroutineContext) {
        this.f1763d = 3;
        this.f1764e = coroutineContext;
        this.f1765i = b3.v.b(coroutineContext);
        this.f1766j = new C0422A(interfaceC0331g, null);
    }
}
