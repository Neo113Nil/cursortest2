package W1;

import K.C0051o;
import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* renamed from: W1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102n implements w2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.e f1685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1686c;

    public /* synthetic */ C0102n(w2.e eVar, N.d dVar, int i3) {
        this.f1684a = i3;
        this.f1685b = eVar;
        this.f1686c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    @Override // w2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC0300c interfaceC0300c) {
        C0101m c0101m;
        int i3;
        t tVar;
        int i4;
        x xVar;
        int i5;
        z zVar;
        int i6;
        w2.m mVar;
        int i7;
        boolean z;
        Object obj2;
        Object obj3;
        C0102n c0102n;
        switch (this.f1684a) {
            case 0:
                if (interfaceC0300c instanceof C0101m) {
                    c0101m = (C0101m) interfaceC0300c;
                    int i8 = c0101m.f1683e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0101m.f1683e = i8 - Integer.MIN_VALUE;
                        Object obj4 = c0101m.f1682d;
                        EnumC0317a enumC0317a = EnumC0317a.f4969a;
                        i3 = c0101m.f1683e;
                        if (i3 != 0) {
                            android.support.v4.media.session.a.T(obj4);
                            Object c3 = ((N.b) obj).c((N.d) this.f1686c);
                            c0101m.f1683e = 1;
                            if (this.f1685b.a(c3, c0101m) == enumC0317a) {
                                return enumC0317a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            android.support.v4.media.session.a.T(obj4);
                        }
                        return C0195i.f2555a;
                    }
                }
                c0101m = new C0101m(this, interfaceC0300c);
                Object obj42 = c0101m.f1682d;
                EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
                i3 = c0101m.f1683e;
                if (i3 != 0) {
                }
                return C0195i.f2555a;
            case 1:
                if (interfaceC0300c instanceof t) {
                    tVar = (t) interfaceC0300c;
                    int i9 = tVar.f1705e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        tVar.f1705e = i9 - Integer.MIN_VALUE;
                        Object obj5 = tVar.f1704d;
                        EnumC0317a enumC0317a3 = EnumC0317a.f4969a;
                        i4 = tVar.f1705e;
                        if (i4 != 0) {
                            android.support.v4.media.session.a.T(obj5);
                            Object c4 = ((N.b) obj).c((N.d) this.f1686c);
                            tVar.f1705e = 1;
                            if (this.f1685b.a(c4, tVar) == enumC0317a3) {
                                return enumC0317a3;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            android.support.v4.media.session.a.T(obj5);
                        }
                        return C0195i.f2555a;
                    }
                }
                tVar = new t(this, interfaceC0300c);
                Object obj52 = tVar.f1704d;
                EnumC0317a enumC0317a32 = EnumC0317a.f4969a;
                i4 = tVar.f1705e;
                if (i4 != 0) {
                }
                return C0195i.f2555a;
            case 2:
                if (interfaceC0300c instanceof x) {
                    xVar = (x) interfaceC0300c;
                    int i10 = xVar.f1720e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        xVar.f1720e = i10 - Integer.MIN_VALUE;
                        Object obj6 = xVar.f1719d;
                        EnumC0317a enumC0317a4 = EnumC0317a.f4969a;
                        i5 = xVar.f1720e;
                        if (i5 != 0) {
                            android.support.v4.media.session.a.T(obj6);
                            Object c5 = ((N.b) obj).c((N.d) this.f1686c);
                            xVar.f1720e = 1;
                            if (this.f1685b.a(c5, xVar) == enumC0317a4) {
                                return enumC0317a4;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            android.support.v4.media.session.a.T(obj6);
                        }
                        return C0195i.f2555a;
                    }
                }
                xVar = new x(this, interfaceC0300c);
                Object obj62 = xVar.f1719d;
                EnumC0317a enumC0317a42 = EnumC0317a.f4969a;
                i5 = xVar.f1720e;
                if (i5 != 0) {
                }
                return C0195i.f2555a;
            case 3:
                if (interfaceC0300c instanceof z) {
                    zVar = (z) interfaceC0300c;
                    int i11 = zVar.f1726e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        zVar.f1726e = i11 - Integer.MIN_VALUE;
                        Object obj7 = zVar.f1725d;
                        EnumC0317a enumC0317a5 = EnumC0317a.f4969a;
                        i6 = zVar.f1726e;
                        if (i6 != 0) {
                            android.support.v4.media.session.a.T(obj7);
                            Object c6 = ((N.b) obj).c((N.d) this.f1686c);
                            zVar.f1726e = 1;
                            if (this.f1685b.a(c6, zVar) == enumC0317a5) {
                                return enumC0317a5;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            android.support.v4.media.session.a.T(obj7);
                        }
                        return C0195i.f2555a;
                    }
                }
                zVar = new z(this, interfaceC0300c);
                Object obj72 = zVar.f1725d;
                EnumC0317a enumC0317a52 = EnumC0317a.f4969a;
                i6 = zVar.f1726e;
                if (i6 != 0) {
                }
                return C0195i.f2555a;
            default:
                if (interfaceC0300c instanceof w2.m) {
                    mVar = (w2.m) interfaceC0300c;
                    int i12 = mVar.f;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        mVar.f = i12 - Integer.MIN_VALUE;
                        Object obj8 = mVar.f10673e;
                        EnumC0317a enumC0317a6 = EnumC0317a.f4969a;
                        i7 = mVar.f;
                        z = true;
                        if (i7 != 0) {
                            android.support.v4.media.session.a.T(obj8);
                            mVar.f10672d = this;
                            mVar.f10675h = obj;
                            mVar.f = 1;
                            Object invoke = ((C0051o) this.f1686c).invoke(obj, mVar);
                            if (invoke == enumC0317a6) {
                                return enumC0317a6;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            c0102n = this;
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0102n = mVar.f10672d;
                                android.support.v4.media.session.a.T(obj8);
                                if (z) {
                                    return C0195i.f2555a;
                                }
                                throw new x2.a(c0102n);
                            }
                            Object obj9 = mVar.f10675h;
                            C0102n c0102n2 = mVar.f10672d;
                            android.support.v4.media.session.a.T(obj8);
                            obj3 = obj9;
                            c0102n = c0102n2;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z = false;
                        } else {
                            w2.e eVar = c0102n.f1685b;
                            mVar.f10672d = c0102n;
                            mVar.f10675h = null;
                            mVar.f = 2;
                            if (eVar.a(obj3, mVar) == enumC0317a6) {
                                return enumC0317a6;
                            }
                        }
                        if (z) {
                        }
                    }
                }
                mVar = new w2.m(this, interfaceC0300c);
                Object obj82 = mVar.f10673e;
                EnumC0317a enumC0317a62 = EnumC0317a.f4969a;
                i7 = mVar.f;
                z = true;
                if (i7 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
        }
    }

    public C0102n(C0051o c0051o, w2.e eVar) {
        this.f1684a = 4;
        this.f1686c = c0051o;
        this.f1685b = eVar;
    }
}
