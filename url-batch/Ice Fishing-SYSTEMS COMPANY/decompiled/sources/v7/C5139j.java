package v7;

import E7.p;
import java.io.Serializable;

/* renamed from: v7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5139j implements InterfaceC5138i, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final C5139j f41372n = new C5139j();

    @Override // v7.InterfaceC5138i
    public final InterfaceC5138i g(InterfaceC5137h key) {
        kotlin.jvm.internal.h.e(key, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5136g i(InterfaceC5137h key) {
        kotlin.jvm.internal.h.e(key, "key");
        return null;
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5138i n(InterfaceC5138i context) {
        kotlin.jvm.internal.h.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // v7.InterfaceC5138i
    public final Object m(Object obj, p pVar) {
        return obj;
    }
}
