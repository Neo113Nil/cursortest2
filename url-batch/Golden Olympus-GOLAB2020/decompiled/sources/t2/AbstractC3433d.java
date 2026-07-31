package t2;

import kotlin.jvm.functions.Function2;

/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3433d {

    /* renamed from: a, reason: collision with root package name */
    private static final G f46225a = new G("CLOSED");

    public static final AbstractC3434e b(AbstractC3434e abstractC3434e) {
        while (true) {
            Object g4 = abstractC3434e.g();
            if (g4 == f46225a) {
                return abstractC3434e;
            }
            AbstractC3434e abstractC3434e2 = (AbstractC3434e) g4;
            if (abstractC3434e2 != null) {
                abstractC3434e = abstractC3434e2;
            } else if (abstractC3434e.m()) {
                return abstractC3434e;
            }
        }
    }

    public static final Object c(AbstractC3429D abstractC3429D, long j4, Function2 function2) {
        while (true) {
            if (abstractC3429D.f46203d >= j4 && !abstractC3429D.k()) {
                return E.a(abstractC3429D);
            }
            Object g4 = abstractC3429D.g();
            if (g4 == f46225a) {
                return E.a(f46225a);
            }
            AbstractC3429D abstractC3429D2 = (AbstractC3429D) ((AbstractC3434e) g4);
            if (abstractC3429D2 == null) {
                abstractC3429D2 = (AbstractC3429D) function2.invoke(Long.valueOf(abstractC3429D.f46203d + 1), abstractC3429D);
                if (abstractC3429D.o(abstractC3429D2)) {
                    if (abstractC3429D.k()) {
                        abstractC3429D.n();
                    }
                }
            }
            abstractC3429D = abstractC3429D2;
        }
    }
}
