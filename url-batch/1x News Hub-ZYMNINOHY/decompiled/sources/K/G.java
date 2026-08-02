package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.io.Serializable;
import t2.AbstractC1212w;

/* loaded from: classes.dex */
public final class G extends f2.i implements l2.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f673e = 1;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f674g;

    /* renamed from: h, reason: collision with root package name */
    public Object f675h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f676i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Serializable f677j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G(N n3, d2.h hVar, l2.p pVar, InterfaceC0300c interfaceC0300c) {
        super(1, interfaceC0300c);
        this.f674g = n3;
        this.f676i = hVar;
        this.f677j = (f2.i) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r6v2, types: [f2.i, l2.p] */
    @Override // f2.AbstractC0324a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        kotlin.jvm.internal.q qVar;
        kotlin.jvm.internal.p pVar;
        C0039c c0039c;
        Object obj2;
        switch (this.f673e) {
            case 0:
                EnumC0317a enumC0317a = EnumC0317a.f4969a;
                int i3 = this.f;
                kotlin.jvm.internal.p pVar2 = (kotlin.jvm.internal.p) this.f677j;
                kotlin.jvm.internal.q qVar2 = (kotlin.jvm.internal.q) this.f676i;
                N n3 = this.f674g;
                try {
                } catch (C0038b unused) {
                    Object obj3 = qVar2.f9692a;
                    this.f675h = pVar2;
                    this.f = 3;
                    obj = n3.j(obj3, true, this);
                    if (obj == enumC0317a) {
                        return enumC0317a;
                    }
                }
                if (i3 == 0) {
                    android.support.v4.media.session.a.T(obj);
                    this.f675h = qVar2;
                    this.f = 1;
                    obj = n3.i(this);
                    if (obj == enumC0317a) {
                        return enumC0317a;
                    }
                    qVar = qVar2;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            pVar = (kotlin.jvm.internal.p) ((Serializable) this.f675h);
                            android.support.v4.media.session.a.T(obj);
                            pVar.f9691a = ((Number) obj).intValue();
                            return C0195i.f2555a;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pVar2 = (kotlin.jvm.internal.p) ((Serializable) this.f675h);
                        android.support.v4.media.session.a.T(obj);
                        pVar2.f9691a = ((Number) obj).intValue();
                        return C0195i.f2555a;
                    }
                    qVar = (kotlin.jvm.internal.q) ((Serializable) this.f675h);
                    android.support.v4.media.session.a.T(obj);
                }
                qVar.f9692a = obj;
                h0 g3 = n3.g();
                this.f675h = pVar2;
                this.f = 2;
                obj = g3.a();
                if (obj == enumC0317a) {
                    return enumC0317a;
                }
                pVar = pVar2;
                pVar.f9691a = ((Number) obj).intValue();
                return C0195i.f2555a;
            default:
                EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
                int i4 = this.f;
                N n4 = this.f674g;
                if (i4 == 0) {
                    android.support.v4.media.session.a.T(obj);
                    this.f = 1;
                    obj = N.f(n4, true, this);
                    if (obj == enumC0317a2) {
                        return enumC0317a2;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f675h;
                            android.support.v4.media.session.a.T(obj);
                            return obj4;
                        }
                        c0039c = (C0039c) this.f675h;
                        android.support.v4.media.session.a.T(obj);
                        obj2 = c0039c.f744b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0039c.f745c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!kotlin.jvm.internal.j.a(c0039c.f744b, obj)) {
                            this.f675h = obj;
                            this.f = 3;
                            if (n4.j(obj, true, this) == enumC0317a2) {
                                return enumC0317a2;
                            }
                        }
                        return obj;
                    }
                    android.support.v4.media.session.a.T(obj);
                }
                c0039c = (C0039c) obj;
                I i5 = new I((f2.i) this.f677j, c0039c, null);
                this.f675h = c0039c;
                this.f = 2;
                obj = AbstractC1212w.o((d2.h) this.f676i, i5, this);
                if (obj == enumC0317a2) {
                    return enumC0317a2;
                }
                obj2 = c0039c.f744b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0039c.f745c) {
                }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [f2.i, l2.p] */
    @Override // l2.l
    public final Object invoke(Object obj) {
        InterfaceC0300c interfaceC0300c = (InterfaceC0300c) obj;
        switch (this.f673e) {
            case 0:
                return new G((kotlin.jvm.internal.q) this.f676i, this.f674g, (kotlin.jvm.internal.p) this.f677j, interfaceC0300c).g(C0195i.f2555a);
            default:
                return new G(this.f674g, (d2.h) this.f676i, (l2.p) this.f677j, interfaceC0300c).g(C0195i.f2555a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(kotlin.jvm.internal.q qVar, N n3, kotlin.jvm.internal.p pVar, InterfaceC0300c interfaceC0300c) {
        super(1, interfaceC0300c);
        this.f676i = qVar;
        this.f674g = n3;
        this.f677j = pVar;
    }
}
