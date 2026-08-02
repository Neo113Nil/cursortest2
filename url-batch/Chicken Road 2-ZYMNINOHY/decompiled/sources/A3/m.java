package A3;

import K.C0067p;
import c3.C0297i;
import f3.InterfaceC0425c;
import f3.InterfaceC0430h;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class m implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f109b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f110c;

    /* renamed from: d, reason: collision with root package name */
    public final h3.g f111d;

    public m(kotlin.jvm.internal.n nVar, e eVar, C0067p c0067p) {
        this.f109b = nVar;
        this.f110c = eVar;
        this.f111d = c0067p;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    @Override // A3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC0425c interfaceC0425c) {
        l lVar;
        int i4;
        m mVar;
        switch (this.f108a) {
            case 0:
                if (interfaceC0425c instanceof l) {
                    lVar = (l) interfaceC0425c;
                    int i5 = lVar.f107e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lVar.f107e = i5 - Integer.MIN_VALUE;
                        Object obj2 = lVar.f105c;
                        EnumC0441a enumC0441a = EnumC0441a.f9038a;
                        i4 = lVar.f107e;
                        C0297i c0297i = C0297i.f5732a;
                        if (i4 != 0) {
                            O3.l.w(obj2);
                            if (((kotlin.jvm.internal.n) this.f109b).f14157a) {
                                e eVar = (e) this.f110c;
                                lVar.f107e = 1;
                                if (eVar.emit(obj, lVar) == enumC0441a) {
                                    return enumC0441a;
                                }
                                return c0297i;
                            }
                            C0067p c0067p = (C0067p) this.f111d;
                            lVar.f103a = this;
                            lVar.f104b = obj;
                            lVar.f107e = 2;
                            obj2 = c0067p.invoke(obj, lVar);
                            if (obj2 == enumC0441a) {
                                return enumC0441a;
                            }
                            mVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return c0297i;
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                obj = lVar.f104b;
                                mVar = lVar.f103a;
                                O3.l.w(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((kotlin.jvm.internal.n) mVar.f109b).f14157a = true;
                                    e eVar2 = (e) mVar.f110c;
                                    lVar.f103a = null;
                                    lVar.f104b = null;
                                    lVar.f107e = 3;
                                    if (eVar2.emit(obj, lVar) == enumC0441a) {
                                        return enumC0441a;
                                    }
                                }
                                return c0297i;
                            }
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        O3.l.w(obj2);
                        return c0297i;
                    }
                }
                lVar = new l(this, (h3.c) interfaceC0425c);
                Object obj22 = lVar.f105c;
                EnumC0441a enumC0441a2 = EnumC0441a.f9038a;
                i4 = lVar.f107e;
                C0297i c0297i2 = C0297i.f5732a;
                if (i4 != 0) {
                }
            default:
                Object b4 = B3.k.b((InterfaceC0430h) this.f109b, obj, this.f110c, (B3.s) this.f111d, interfaceC0425c);
                return b4 == EnumC0441a.f9038a ? b4 : C0297i.f5732a;
        }
    }

    public m(e eVar, InterfaceC0430h interfaceC0430h) {
        this.f109b = interfaceC0430h;
        this.f110c = C3.a.k(interfaceC0430h);
        this.f111d = new B3.s(eVar, null);
    }
}
