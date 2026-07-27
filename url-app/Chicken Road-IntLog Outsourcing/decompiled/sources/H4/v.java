package H4;

import D4.AbstractC0024y;
import f4.AbstractC0432i;
import k4.C1224j;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class v extends AbstractC1295c implements G4.e {

    /* renamed from: a, reason: collision with root package name */
    public final G4.e f1203a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1223i f1204b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1205c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1223i f1206d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1218d f1207e;

    public v(G4.e eVar, InterfaceC1223i interfaceC1223i) {
        super(r.f1199a, C1224j.f10720a);
        this.f1203a = eVar;
        this.f1204b = interfaceC1223i;
        this.f1205c = ((Number) interfaceC1223i.q(0, u.f1202e)).intValue();
    }

    public final Object a(InterfaceC1218d interfaceC1218d, Object obj) {
        InterfaceC1223i context = interfaceC1218d.getContext();
        AbstractC0024y.e(context);
        InterfaceC1223i interfaceC1223i = this.f1206d;
        if (interfaceC1223i != context) {
            if (interfaceC1223i instanceof p) {
                throw new IllegalStateException(B4.l.E("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p) interfaceC1223i).f1197a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.q(0, new y(this))).intValue() != this.f1205c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f1204b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f1206d = context;
        }
        this.f1207e = interfaceC1218d;
        w wVar = x.f1209a;
        G4.e eVar = this.f1203a;
        kotlin.jvm.internal.i.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        wVar.getClass();
        Object b6 = eVar.b(obj, this);
        if (!kotlin.jvm.internal.i.a(b6, EnumC1260a.f11058a)) {
            this.f1207e = null;
        }
        return b6;
    }

    @Override // G4.e
    public final Object b(Object obj, InterfaceC1218d interfaceC1218d) {
        try {
            Object a6 = a(interfaceC1218d, obj);
            return a6 == EnumC1260a.f11058a ? a6 : f4.v.f5689a;
        } catch (Throwable th) {
            this.f1206d = new p(th, interfaceC1218d.getContext());
            throw th;
        }
    }

    @Override // m4.AbstractC1293a, m4.d
    public final m4.d getCallerFrame() {
        InterfaceC1218d interfaceC1218d = this.f1207e;
        if (interfaceC1218d instanceof m4.d) {
            return (m4.d) interfaceC1218d;
        }
        return null;
    }

    @Override // m4.AbstractC1295c, k4.InterfaceC1218d
    public final InterfaceC1223i getContext() {
        InterfaceC1223i interfaceC1223i = this.f1206d;
        return interfaceC1223i == null ? C1224j.f10720a : interfaceC1223i;
    }

    @Override // m4.AbstractC1293a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Throwable a6 = AbstractC0432i.a(obj);
        if (a6 != null) {
            this.f1206d = new p(a6, getContext());
        }
        InterfaceC1218d interfaceC1218d = this.f1207e;
        if (interfaceC1218d != null) {
            interfaceC1218d.resumeWith(obj);
        }
        return EnumC1260a.f11058a;
    }
}
