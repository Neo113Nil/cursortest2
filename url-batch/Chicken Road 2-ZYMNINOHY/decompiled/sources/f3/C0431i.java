package f3;

import java.io.Serializable;
import o3.p;

/* renamed from: f3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0431i implements InterfaceC0430h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final C0431i f8817a = new C0431i();

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h f(InterfaceC0430h context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0430h k(InterfaceC0429g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return this;
    }

    @Override // f3.InterfaceC0430h
    public final InterfaceC0428f n(InterfaceC0429g key) {
        kotlin.jvm.internal.i.e(key, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // f3.InterfaceC0430h
    public final Object e(Object obj, p pVar) {
        return obj;
    }
}
