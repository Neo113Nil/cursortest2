package kotlin.jvm.internal;

import java.util.List;

/* loaded from: classes3.dex */
public class I {
    public m2.c b(Class cls) {
        return new C3243i(cls);
    }

    public m2.e c(Class cls, String str) {
        return new x(cls, str);
    }

    public String g(InterfaceC3248n interfaceC3248n) {
        String obj = interfaceC3248n.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String h(s sVar) {
        return g(sVar);
    }

    public m2.k i(m2.d dVar, List list, boolean z4) {
        return new N(dVar, list, z4);
    }

    public m2.f a(o oVar) {
        return oVar;
    }

    public m2.g d(u uVar) {
        return uVar;
    }

    public m2.i e(y yVar) {
        return yVar;
    }

    public m2.j f(A a4) {
        return a4;
    }
}
