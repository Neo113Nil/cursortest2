package n6;

import o6.C0809e;
import u6.C0953e;

/* renamed from: n6.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0764B {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0765C f7008a;

    static {
        String str;
        InterfaceC0765C interfaceC0765C;
        int i2 = s6.t.f7856a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            C0953e c0953e = F.f7011a;
            C0809e c0809e = s6.n.f7850a;
            C0809e c0809e2 = c0809e.f7135m;
            interfaceC0765C = c0809e;
            if (c0809e == null) {
                interfaceC0765C = RunnableC0763A.f7006r;
            }
        } else {
            interfaceC0765C = RunnableC0763A.f7006r;
        }
        f7008a = interfaceC0765C;
    }
}
