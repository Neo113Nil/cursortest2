package O7;

import v7.InterfaceC5136g;
import v7.InterfaceC5137h;
import v7.InterfaceC5138i;

/* loaded from: classes2.dex */
public final class x0 implements InterfaceC5136g, InterfaceC5137h {

    /* renamed from: n, reason: collision with root package name */
    public static final x0 f2642n = new x0();

    @Override // v7.InterfaceC5138i
    public final InterfaceC5138i g(InterfaceC5137h interfaceC5137h) {
        return com.bumptech.glide.e.s(this, interfaceC5137h);
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5136g i(InterfaceC5137h key) {
        kotlin.jvm.internal.h.e(key, "key");
        if (kotlin.jvm.internal.h.a(this, key)) {
            return this;
        }
        return null;
    }

    @Override // v7.InterfaceC5138i
    public final Object m(Object obj, E7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // v7.InterfaceC5138i
    public final InterfaceC5138i n(InterfaceC5138i interfaceC5138i) {
        return com.bumptech.glide.e.w(this, interfaceC5138i);
    }

    @Override // v7.InterfaceC5136g
    public final InterfaceC5137h getKey() {
        return this;
    }
}
