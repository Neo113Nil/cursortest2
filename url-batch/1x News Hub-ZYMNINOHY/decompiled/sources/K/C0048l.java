package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048l extends f2.i implements l2.l {

    /* renamed from: e, reason: collision with root package name */
    public Object f791e;
    public Serializable f;

    /* renamed from: g, reason: collision with root package name */
    public Object f792g;

    /* renamed from: h, reason: collision with root package name */
    public Object f793h;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f794i;

    /* renamed from: j, reason: collision with root package name */
    public int f795j;

    /* renamed from: k, reason: collision with root package name */
    public int f796k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f797l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B0.p f798m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0048l(N n3, B0.p pVar, InterfaceC0300c interfaceC0300c) {
        super(1, interfaceC0300c);
        this.f797l = n3;
        this.f798m = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    @Override // f2.AbstractC0324a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        B2.a dVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.q qVar;
        kotlin.jvm.internal.q qVar2;
        Iterator it;
        B2.a aVar;
        kotlin.jvm.internal.o oVar2;
        kotlin.jvm.internal.q qVar3;
        C0047k c0047k;
        B2.d dVar2;
        kotlin.jvm.internal.q qVar4;
        kotlin.jvm.internal.o oVar3;
        Object obj2;
        Object obj3;
        Integer a3;
        int i3;
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i4 = this.f796k;
        B0.p pVar = this.f798m;
        N n3 = this.f797l;
        if (i4 == 0) {
            android.support.v4.media.session.a.T(obj);
            dVar = new B2.d();
            oVar = new kotlin.jvm.internal.o();
            qVar = new kotlin.jvm.internal.q();
            this.f791e = dVar;
            this.f = oVar;
            this.f792g = qVar;
            this.f793h = qVar;
            this.f796k = 1;
            obj = N.f(n3, true, this);
            if (obj != enumC0317a) {
                qVar2 = qVar;
            }
            return enumC0317a;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.f795j;
                    obj3 = this.f791e;
                    android.support.v4.media.session.a.T(obj);
                    return new C0039c(i3, ((Number) obj).intValue(), obj3);
                }
                Object obj4 = (B2.a) this.f792g;
                qVar4 = (kotlin.jvm.internal.q) this.f;
                oVar3 = (kotlin.jvm.internal.o) this.f791e;
                android.support.v4.media.session.a.T(obj);
                obj2 = obj4;
                try {
                    oVar3.f9690a = true;
                    ((B2.d) obj2).e(null);
                    obj3 = qVar4.f9692a;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    h0 g3 = n3.g();
                    this.f791e = obj3;
                    this.f = null;
                    this.f792g = null;
                    this.f795j = hashCode;
                    this.f796k = 4;
                    a3 = g3.a();
                    if (a3 != enumC0317a) {
                        i3 = hashCode;
                        obj = a3;
                        return new C0039c(i3, ((Number) obj).intValue(), obj3);
                    }
                    return enumC0317a;
                } catch (Throwable th) {
                    ((B2.d) obj2).e(null);
                    throw th;
                }
            }
            it = this.f794i;
            c0047k = (C0047k) this.f793h;
            qVar3 = (kotlin.jvm.internal.q) this.f792g;
            oVar2 = (kotlin.jvm.internal.o) this.f;
            aVar = (B2.a) this.f791e;
            android.support.v4.media.session.a.T(obj);
            while (it.hasNext()) {
                l2.p pVar2 = (l2.p) it.next();
                this.f791e = aVar;
                this.f = oVar2;
                this.f792g = qVar3;
                this.f793h = c0047k;
                this.f794i = it;
                this.f796k = 2;
                if (pVar2.invoke(c0047k, this) == enumC0317a) {
                    break;
                }
            }
            qVar2 = qVar3;
            oVar = oVar2;
            dVar = aVar;
            pVar.f164c = null;
            this.f791e = oVar;
            this.f = qVar2;
            this.f792g = dVar;
            this.f793h = null;
            this.f794i = null;
            this.f796k = 3;
            dVar2 = (B2.d) dVar;
            if (dVar2.c(this) != enumC0317a) {
                qVar4 = qVar2;
                oVar3 = oVar;
                obj2 = dVar2;
                oVar3.f9690a = true;
                ((B2.d) obj2).e(null);
                obj3 = qVar4.f9692a;
                if (obj3 == null) {
                }
                h0 g32 = n3.g();
                this.f791e = obj3;
                this.f = null;
                this.f792g = null;
                this.f795j = hashCode;
                this.f796k = 4;
                a3 = g32.a();
                if (a3 != enumC0317a) {
                }
            }
            return enumC0317a;
        }
        qVar = (kotlin.jvm.internal.q) this.f793h;
        qVar2 = (kotlin.jvm.internal.q) this.f792g;
        oVar = (kotlin.jvm.internal.o) this.f;
        dVar = (B2.a) this.f791e;
        android.support.v4.media.session.a.T(obj);
        qVar.f9692a = ((C0039c) obj).f744b;
        C0047k c0047k2 = new C0047k(dVar, oVar, qVar2, n3);
        List list = (List) pVar.f164c;
        if (list != null) {
            it = list.iterator();
            aVar = dVar;
            oVar2 = oVar;
            qVar3 = qVar2;
            c0047k = c0047k2;
            while (it.hasNext()) {
            }
            qVar2 = qVar3;
            oVar = oVar2;
            dVar = aVar;
        }
        pVar.f164c = null;
        this.f791e = oVar;
        this.f = qVar2;
        this.f792g = dVar;
        this.f793h = null;
        this.f794i = null;
        this.f796k = 3;
        dVar2 = (B2.d) dVar;
        if (dVar2.c(this) != enumC0317a) {
        }
        return enumC0317a;
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        return new C0048l(this.f797l, this.f798m, (InterfaceC0300c) obj).g(C0195i.f2555a);
    }
}
