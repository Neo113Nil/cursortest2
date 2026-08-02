package v2;

import b2.C0195i;
import e2.EnumC0317a;
import f2.AbstractC0326c;
import t2.C1196f;
import t2.C1209t;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f10609a = new i();

    public static c a(int i3, a aVar, int i4) {
        int i5 = i4 & 2;
        a aVar2 = a.f10571a;
        if (i5 != 0) {
            aVar = aVar2;
        }
        if (i3 == -2) {
            if (aVar != aVar2) {
                return new m(1, aVar);
            }
            g.f10607x0.getClass();
            return new c(f.f10606b);
        }
        if (i3 != -1) {
            return i3 != 0 ? i3 != Integer.MAX_VALUE ? aVar == aVar2 ? new c(i3) : new m(i3, aVar) : new c(Integer.MAX_VALUE) : aVar == aVar2 ? new c(0) : new m(1, aVar);
        }
        if (aVar == aVar2) {
            return new m(1, a.f10572b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [l2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p pVar, M.b bVar, AbstractC0326c abstractC0326c) {
        n nVar;
        int i3;
        try {
            if (abstractC0326c instanceof n) {
                nVar = (n) abstractC0326c;
                int i4 = nVar.f;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    nVar.f = i4 - Integer.MIN_VALUE;
                    Object obj = nVar.f10613e;
                    EnumC0317a enumC0317a = EnumC0317a.f4969a;
                    i3 = nVar.f;
                    if (i3 != 0) {
                        android.support.v4.media.session.a.T(obj);
                        d2.h hVar = nVar.f4981b;
                        kotlin.jvm.internal.j.b(hVar);
                        if (hVar.h(C1209t.f10441b) != pVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        nVar.f10612d = bVar;
                        nVar.f = 1;
                        C1196f c1196f = new C1196f(1, C2.b.x(nVar));
                        c1196f.t();
                        ((o) pVar).W(new B2.g(2, c1196f));
                        bVar = bVar;
                        if (c1196f.s() == enumC0317a) {
                            return enumC0317a;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = nVar.f10612d;
                        android.support.v4.media.session.a.T(obj);
                        bVar = r5;
                    }
                    bVar.invoke();
                    return C0195i.f2555a;
                }
            }
            if (i3 != 0) {
            }
            bVar.invoke();
            return C0195i.f2555a;
        } catch (Throwable th) {
            bVar.invoke();
            throw th;
        }
        nVar = new n(abstractC0326c);
        Object obj2 = nVar.f10613e;
        EnumC0317a enumC0317a2 = EnumC0317a.f4969a;
        i3 = nVar.f;
    }
}
