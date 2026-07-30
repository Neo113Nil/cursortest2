package P;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v6.InterfaceC0979a;

/* renamed from: P.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0148m extends X5.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public Object f2128d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f2129e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2130i;

    /* renamed from: l, reason: collision with root package name */
    public Object f2131l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f2132m;

    /* renamed from: n, reason: collision with root package name */
    public int f2133n;

    /* renamed from: o, reason: collision with root package name */
    public int f2134o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Q f2135p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P0.n f2136q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148m(Q q4, P0.n nVar, V5.b bVar) {
        super(1, bVar);
        this.f2135p = q4;
        this.f2136q = nVar;
    }

    @Override // X5.a
    public final V5.b create(V5.b bVar) {
        return new C0148m(this.f2135p, this.f2136q, bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0148m) create((V5.b) obj)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0979a cVar;
        kotlin.jvm.internal.B b7;
        kotlin.jvm.internal.D d7;
        kotlin.jvm.internal.D d8;
        Iterator it;
        InterfaceC0979a interfaceC0979a;
        kotlin.jvm.internal.B b8;
        kotlin.jvm.internal.D d9;
        C0147l c0147l;
        v6.c cVar2;
        kotlin.jvm.internal.D d10;
        kotlin.jvm.internal.B b9;
        Object obj2;
        Object obj3;
        Integer a7;
        int i2;
        W5.a aVar = W5.a.f2787d;
        int i5 = this.f2134o;
        P0.n nVar = this.f2136q;
        Q q4 = this.f2135p;
        if (i5 == 0) {
            V6.b.P(obj);
            cVar = new v6.c();
            b7 = new kotlin.jvm.internal.B();
            d7 = new kotlin.jvm.internal.D();
            this.f2128d = cVar;
            this.f2129e = b7;
            this.f2130i = d7;
            this.f2131l = d7;
            this.f2134o = 1;
            obj = Q.f(q4, true, this);
            if (obj != aVar) {
                d8 = d7;
            }
            return aVar;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f2133n;
                    obj3 = this.f2128d;
                    V6.b.P(obj);
                    return new C0139d(obj3, i2, ((Number) obj).intValue());
                }
                Object obj4 = (InterfaceC0979a) this.f2130i;
                d10 = (kotlin.jvm.internal.D) this.f2129e;
                b9 = (kotlin.jvm.internal.B) this.f2128d;
                V6.b.P(obj);
                obj2 = obj4;
                try {
                    b9.f6150d = true;
                    Unit unit = Unit.f6114a;
                    ((v6.c) obj2).e(null);
                    obj3 = d10.f6152d;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    l0 g7 = q4.g();
                    this.f2128d = obj3;
                    this.f2129e = null;
                    this.f2130i = null;
                    this.f2133n = hashCode;
                    this.f2134o = 4;
                    a7 = g7.a();
                    if (a7 != aVar) {
                        i2 = hashCode;
                        obj = a7;
                        return new C0139d(obj3, i2, ((Number) obj).intValue());
                    }
                    return aVar;
                } catch (Throwable th) {
                    ((v6.c) obj2).e(null);
                    throw th;
                }
            }
            it = this.f2132m;
            c0147l = (C0147l) this.f2131l;
            d9 = (kotlin.jvm.internal.D) this.f2130i;
            b8 = (kotlin.jvm.internal.B) this.f2129e;
            interfaceC0979a = (InterfaceC0979a) this.f2128d;
            V6.b.P(obj);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                this.f2128d = interfaceC0979a;
                this.f2129e = b8;
                this.f2130i = d9;
                this.f2131l = c0147l;
                this.f2132m = it;
                this.f2134o = 2;
                if (function2.invoke(c0147l, this) == aVar) {
                    break;
                }
            }
            d8 = d9;
            b7 = b8;
            cVar = interfaceC0979a;
            nVar.f2216l = null;
            this.f2128d = b7;
            this.f2129e = d8;
            this.f2130i = cVar;
            this.f2131l = null;
            this.f2132m = null;
            this.f2134o = 3;
            cVar2 = (v6.c) cVar;
            if (cVar2.c(this) != aVar) {
                d10 = d8;
                b9 = b7;
                obj2 = cVar2;
                b9.f6150d = true;
                Unit unit2 = Unit.f6114a;
                ((v6.c) obj2).e(null);
                obj3 = d10.f6152d;
                if (obj3 == null) {
                }
                l0 g72 = q4.g();
                this.f2128d = obj3;
                this.f2129e = null;
                this.f2130i = null;
                this.f2133n = hashCode;
                this.f2134o = 4;
                a7 = g72.a();
                if (a7 != aVar) {
                }
            }
            return aVar;
        }
        d7 = (kotlin.jvm.internal.D) this.f2131l;
        d8 = (kotlin.jvm.internal.D) this.f2130i;
        b7 = (kotlin.jvm.internal.B) this.f2129e;
        cVar = (InterfaceC0979a) this.f2128d;
        V6.b.P(obj);
        d7.f6152d = ((C0139d) obj).f2066b;
        C0147l c0147l2 = new C0147l(cVar, b7, d8, q4);
        List list = (List) nVar.f2216l;
        if (list != null) {
            it = list.iterator();
            interfaceC0979a = cVar;
            b8 = b7;
            d9 = d8;
            c0147l = c0147l2;
            while (it.hasNext()) {
            }
            d8 = d9;
            b7 = b8;
            cVar = interfaceC0979a;
        }
        nVar.f2216l = null;
        this.f2128d = b7;
        this.f2129e = d8;
        this.f2130i = cVar;
        this.f2131l = null;
        this.f2132m = null;
        this.f2134o = 3;
        cVar2 = (v6.c) cVar;
        if (cVar2.c(this) != aVar) {
        }
        return aVar;
    }
}
