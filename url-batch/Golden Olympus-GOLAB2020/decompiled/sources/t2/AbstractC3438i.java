package t2;

import W1.AbstractC1233c;
import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import o2.AbstractC3315I;
import o2.InterfaceC3314H;

/* renamed from: t2.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3438i {
    public static final void a(CoroutineContext coroutineContext, Throwable th) {
        Iterator it = AbstractC3437h.a().iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC3314H) it.next()).handleException(coroutineContext, th);
            } catch (Throwable th2) {
                AbstractC3437h.b(AbstractC3315I.b(th, th2));
            }
        }
        try {
            AbstractC1233c.a(th, new C3439j(coroutineContext));
        } catch (Throwable unused) {
        }
        AbstractC3437h.b(th);
    }
}
