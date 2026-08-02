package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;
import java.util.Set;

/* renamed from: K.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054s implements w2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f810a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.e f811b;

    public /* synthetic */ C0054s(w2.e eVar, int i3) {
        this.f810a = i3;
        this.f811b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    @Override // w2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC0300c interfaceC0300c) {
        r rVar;
        int i3;
        W1.A a3;
        int i4;
        switch (this.f810a) {
            case 0:
                if (interfaceC0300c instanceof r) {
                    rVar = (r) interfaceC0300c;
                    int i5 = rVar.f809e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rVar.f809e = i5 - Integer.MIN_VALUE;
                        Object obj2 = rVar.f808d;
                        EnumC0317a enumC0317a = EnumC0317a.f4969a;
                        i3 = rVar.f809e;
                        if (i3 != 0) {
                            android.support.v4.media.session.a.T(obj2);
                            i0 i0Var = (i0) obj;
                            if (i0Var instanceof b0) {
                                throw ((b0) i0Var).f743b;
                            }
                            if (!(i0Var instanceof C0039c)) {
                                if (i0Var instanceof Z ? true : i0Var instanceof j0) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new O0.b();
                            }
                            Object obj3 = ((C0039c) i0Var).f744b;
                            rVar.f809e = 1;
                            if (this.f811b.a(obj3, rVar) == enumC0317a) {
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
                rVar = new r(this, interfaceC0300c);
                Object obj22 = rVar.f808d;
                EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
                i3 = rVar.f809e;
                if (i3 != 0) {
                }
                return C0195i.f2555a;
            default:
                if (interfaceC0300c instanceof W1.A) {
                    a3 = (W1.A) interfaceC0300c;
                    int i6 = a3.f1624e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        a3.f1624e = i6 - Integer.MIN_VALUE;
                        Object obj4 = a3.f1623d;
                        EnumC0317a enumC0317a3 = EnumC0317a.f4969a;
                        i4 = a3.f1624e;
                        if (i4 != 0) {
                            android.support.v4.media.session.a.T(obj4);
                            Set keySet = ((N.b) obj).a().keySet();
                            a3.f1624e = 1;
                            if (this.f811b.a(keySet, a3) == enumC0317a3) {
                                return enumC0317a3;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            android.support.v4.media.session.a.T(obj4);
                        }
                        return C0195i.f2555a;
                    }
                }
                a3 = new W1.A(this, interfaceC0300c);
                Object obj42 = a3.f1623d;
                EnumC0317a enumC0317a32 = EnumC0317a.f4969a;
                i4 = a3.f1624e;
                if (i4 != 0) {
                }
                return C0195i.f2555a;
        }
    }
}
