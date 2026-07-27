package k4;

import java.io.Serializable;
import t4.InterfaceC1445p;

/* renamed from: k4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1224j implements InterfaceC1223i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C1224j f10720a = new C1224j();

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i A(InterfaceC1223i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context;
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1223i c(InterfaceC1222h key) {
        kotlin.jvm.internal.i.e(key, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // k4.InterfaceC1223i
    public final InterfaceC1221g o(InterfaceC1222h key) {
        kotlin.jvm.internal.i.e(key, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // k4.InterfaceC1223i
    public final Object q(Object obj, InterfaceC1445p interfaceC1445p) {
        return obj;
    }
}
