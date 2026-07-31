package U;

import e2.InterfaceC0426e;

/* loaded from: classes.dex */
public final class j extends f2.k implements InterfaceC0426e {

    /* renamed from: e, reason: collision with root package name */
    public static final j f4483e = new j(2);

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        String str = (String) obj;
        o oVar = (o) obj2;
        if (str.length() == 0) {
            return oVar.toString();
        }
        return str + ", " + oVar;
    }
}
