package W1;

import K.C0052p;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* loaded from: classes.dex */
public final class r implements w2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1696a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1697b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1698c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1699d;

    public r(kotlin.jvm.internal.o oVar, w2.e eVar, C0052p c0052p) {
        this.f1698c = oVar;
        this.f1697b = eVar;
        this.f1699d = c0052p;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    @Override // w2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC0300c interfaceC0300c) {
        q qVar;
        int i3;
        w2.k kVar;
        int i4;
        r rVar;
        switch (this.f1696a) {
            case 0:
                if (interfaceC0300c instanceof q) {
                    qVar = (q) interfaceC0300c;
                    int i5 = qVar.f1695e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qVar.f1695e = i5 - Integer.MIN_VALUE;
                        Object obj2 = qVar.f1694d;
                        EnumC0317a enumC0317a = EnumC0317a.f4969a;
                        i3 = qVar.f1695e;
                        if (i3 != 0) {
                            android.support.v4.media.session.a.T(obj2);
                            Double d3 = (Double) L.c(((N.b) obj).c((N.d) this.f1698c), ((K) this.f1699d).f1651c);
                            qVar.f1695e = 1;
                            if (((w2.e) this.f1697b).a(d3, qVar) == enumC0317a) {
                                return enumC0317a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            android.support.v4.media.session.a.T(obj2);
                        }
                        return C0195i.f2555a;
                    }
                }
                qVar = new q(this, interfaceC0300c);
                Object obj22 = qVar.f1694d;
                EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
                i3 = qVar.f1695e;
                if (i3 != 0) {
                }
                return C0195i.f2555a;
            case 1:
                if (interfaceC0300c instanceof w2.k) {
                    kVar = (w2.k) interfaceC0300c;
                    int i6 = kVar.f10668h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        kVar.f10668h = i6 - Integer.MIN_VALUE;
                        Object obj3 = kVar.f;
                        EnumC0317a enumC0317a3 = EnumC0317a.f4969a;
                        i4 = kVar.f10668h;
                        C0195i c0195i = C0195i.f2555a;
                        if (i4 != 0) {
                            android.support.v4.media.session.a.T(obj3);
                            if (((kotlin.jvm.internal.o) this.f1698c).f9690a) {
                                kVar.f10668h = 1;
                                if (((w2.e) this.f1697b).a(obj, kVar) == enumC0317a3) {
                                    return enumC0317a3;
                                }
                                return c0195i;
                            }
                            kVar.f10665d = this;
                            kVar.f10666e = obj;
                            kVar.f10668h = 2;
                            obj3 = ((C0052p) this.f1699d).invoke(obj, kVar);
                            if (obj3 == enumC0317a3) {
                                return enumC0317a3;
                            }
                            rVar = this;
                            if (!((Boolean) obj3).booleanValue()) {
                            }
                            return c0195i;
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                obj = kVar.f10666e;
                                rVar = kVar.f10665d;
                                android.support.v4.media.session.a.T(obj3);
                                if (!((Boolean) obj3).booleanValue()) {
                                    ((kotlin.jvm.internal.o) rVar.f1698c).f9690a = true;
                                    kVar.f10665d = null;
                                    kVar.f10666e = null;
                                    kVar.f10668h = 3;
                                    if (((w2.e) rVar.f1697b).a(obj, kVar) == enumC0317a3) {
                                        return enumC0317a3;
                                    }
                                }
                                return c0195i;
                            }
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        android.support.v4.media.session.a.T(obj3);
                        return c0195i;
                    }
                }
                kVar = new w2.k(this, interfaceC0300c);
                Object obj32 = kVar.f;
                EnumC0317a enumC0317a32 = EnumC0317a.f4969a;
                i4 = kVar.f10668h;
                C0195i c0195i2 = C0195i.f2555a;
                if (i4 != 0) {
                }
            default:
                Object b3 = x2.k.b((d2.h) this.f1697b, obj, this.f1698c, (x2.s) this.f1699d, interfaceC0300c);
                return b3 == EnumC0317a.f4969a ? b3 : C0195i.f2555a;
        }
    }

    public r(w2.e eVar, N.d dVar, K k3) {
        this.f1697b = eVar;
        this.f1698c = dVar;
        this.f1699d = k3;
    }

    public r(w2.e eVar, d2.h hVar) {
        this.f1697b = hVar;
        this.f1698c = y2.a.k(hVar);
        this.f1699d = new x2.s(eVar, null);
    }
}
