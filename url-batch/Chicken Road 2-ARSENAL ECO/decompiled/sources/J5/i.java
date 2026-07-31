package J5;

import H5.C0147g;
import H5.C0162w;
import k5.v;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import u0.AbstractC0676f;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1328a = new h();

    public static b a(int i7, int i8, int i9) {
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if (i7 == -2) {
            if (i8 != 1) {
                return new m(1, i8);
            }
            f.f1326b.getClass();
            return new b(e.f1325b);
        }
        if (i7 != -1) {
            return i7 != 0 ? i7 != Integer.MAX_VALUE ? i8 == 1 ? new b(i7) : new m(i7, i8) : new b(Integer.MAX_VALUE) : i8 == 1 ? new b(0) : new m(1, i8);
        }
        if (i8 == 1) {
            return new m(1, 2);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(q qVar, V5.m mVar, AbstractC0607c abstractC0607c) {
        n nVar;
        int i7;
        try {
            if (abstractC0607c instanceof n) {
                nVar = (n) abstractC0607c;
                int i8 = nVar.f1335h;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    nVar.f1335h = i8 - Integer.MIN_VALUE;
                    Object obj = nVar.f1334g;
                    EnumC0580a enumC0580a = EnumC0580a.f5697f;
                    i7 = nVar.f1335h;
                    if (i7 != 0) {
                        AbstractC0676f.w(obj);
                        if (nVar.getContext().m(C0162w.f1110g) != qVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        nVar.f1333f = mVar;
                        nVar.f1335h = 1;
                        C0147g c0147g = new C0147g(1, AbstractC0676f.m(nVar));
                        c0147g.r();
                        ((p) qVar).W(new o(0, c0147g));
                        if (c0147g.q() == enumC0580a) {
                            return enumC0580a;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mVar = nVar.f1333f;
                        AbstractC0676f.w(obj);
                    }
                    mVar.invoke();
                    return v.f5219a;
                }
            }
            if (i7 != 0) {
            }
            mVar.invoke();
            return v.f5219a;
        } catch (Throwable th) {
            mVar.invoke();
            throw th;
        }
        nVar = new n(abstractC0607c);
        Object obj2 = nVar.f1334g;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = nVar.f1335h;
    }
}
