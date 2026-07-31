package K5;

import H5.AbstractC0165z;
import H5.C0158s;
import J5.p;
import J5.q;
import M5.s;
import com.onesignal.inAppMessages.internal.display.impl.a;
import k5.v;
import o5.C0565e;
import o5.InterfaceC0564d;
import o5.InterfaceC0569i;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public final class b extends L5.a {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1389j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1390k;

    /* renamed from: l, reason: collision with root package name */
    public final q5.g f1391l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, c cVar, InterfaceC0569i interfaceC0569i, int i7, int i8) {
        super(interfaceC0569i, i7, i8);
        this.f1389j = 1;
        this.f1389j = 1;
        this.f1390k = cVar;
        this.f1391l = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    @Override // L5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q qVar, InterfaceC0564d interfaceC0564d) {
        a aVar;
        int i7;
        switch (this.f1389j) {
            case 0:
                if (interfaceC0564d instanceof a) {
                    aVar = (a) interfaceC0564d;
                    int i8 = aVar.f1388i;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        aVar.f1388i = i8 - Integer.MIN_VALUE;
                        Object obj = aVar.f1386g;
                        EnumC0580a enumC0580a = EnumC0580a.f5697f;
                        i7 = aVar.f1388i;
                        v vVar = v.f5219a;
                        if (i7 != 0) {
                            AbstractC0676f.w(obj);
                            aVar.f1385f = qVar;
                            aVar.f1388i = 1;
                            Object invoke = ((f0.i) this.f1390k).invoke(qVar, aVar);
                            if (invoke != enumC0580a) {
                                invoke = vVar;
                            }
                            if (invoke == enumC0580a) {
                                return enumC0580a;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            qVar = aVar.f1385f;
                            AbstractC0676f.w(obj);
                        }
                        if (((p) qVar).f1338i.t()) {
                            throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                        }
                        return vVar;
                    }
                }
                aVar = new a(this, (AbstractC0607c) interfaceC0564d);
                Object obj2 = aVar.f1386g;
                EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
                i7 = aVar.f1388i;
                v vVar2 = v.f5219a;
                if (i7 != 0) {
                }
                if (((p) qVar).f1338i.t()) {
                }
            default:
                Object e4 = e(new L5.m(qVar), (q5.g) interfaceC0564d);
                return e4 == EnumC0580a.f5697f ? e4 : v.f5219a;
        }
    }

    @Override // L5.a, K5.c
    public Object c(d dVar, InterfaceC0564d interfaceC0564d) {
        Object c7;
        switch (this.f1389j) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                int i7 = this.f1484g;
                v vVar = v.f5219a;
                if (i7 == -3) {
                    InterfaceC0569i context = interfaceC0564d.getContext();
                    InterfaceC0569i interfaceC0569i = (InterfaceC0569i) this.f1486i;
                    InterfaceC0569i v5 = !((Boolean) interfaceC0569i.h(Boolean.FALSE, C0158s.f1097h)).booleanValue() ? context.v(interfaceC0569i) : AbstractC0165z.e(context, interfaceC0569i, false);
                    if (kotlin.jvm.internal.i.a(v5, context)) {
                        c7 = e(dVar, (q5.g) interfaceC0564d);
                        if (c7 != EnumC0580a.f5697f) {
                            return vVar;
                        }
                    } else {
                        C0565e c0565e = C0565e.f5619f;
                        if (kotlin.jvm.internal.i.a(v5.m(c0565e), context.m(c0565e))) {
                            InterfaceC0569i context2 = interfaceC0564d.getContext();
                            if (!(dVar instanceof L5.m ? true : dVar instanceof L5.k)) {
                                dVar = new L5.p(dVar, context2);
                            }
                            c7 = L5.l.b(v5, dVar, M5.a.l(v5), new L5.e(this, null), (AbstractC0607c) interfaceC0564d);
                            EnumC0580a enumC0580a = EnumC0580a.f5697f;
                            if (c7 != enumC0580a) {
                                c7 = vVar;
                            }
                            if (c7 != enumC0580a) {
                                return vVar;
                            }
                        }
                    }
                    return c7;
                }
                c7 = super.c(dVar, interfaceC0564d);
                if (c7 != EnumC0580a.f5697f) {
                    return vVar;
                }
                return c7;
            default:
                return super.c(dVar, interfaceC0564d);
        }
    }

    @Override // L5.a
    public final L5.a d(InterfaceC0569i interfaceC0569i, int i7, int i8) {
        switch (this.f1389j) {
            case 0:
                return new b((f0.i) this.f1391l, interfaceC0569i, i7, i8);
            default:
                return new b((f) this.f1391l, (c) this.f1390k, interfaceC0569i, i7, i8);
        }
    }

    public Object e(d dVar, q5.g gVar) {
        L5.i iVar = new L5.i(this, dVar, null);
        s sVar = new s(gVar.getContext(), gVar);
        Object i02 = A3.c.i0(sVar, sVar, iVar);
        return i02 == EnumC0580a.f5697f ? i02 : v.f5219a;
    }

    @Override // L5.a
    public final String toString() {
        switch (this.f1389j) {
            case 0:
                return "block[" + ((f0.i) this.f1390k) + "] -> " + super.toString();
            default:
                return ((c) this.f1390k) + " -> " + super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f0.i iVar, InterfaceC0569i interfaceC0569i, int i7, int i8) {
        super(interfaceC0569i, i7, i8);
        this.f1389j = 0;
        this.f1390k = iVar;
        this.f1391l = iVar;
    }
}
