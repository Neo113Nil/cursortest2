package c3;

import java.io.Serializable;
import o3.InterfaceC1328a;

/* renamed from: c3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295g implements InterfaceC0291c, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1328a f5728a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f5729b = C0296h.f5731a;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5730c = this;

    public C0295g(InterfaceC1328a interfaceC1328a) {
        this.f5728a = interfaceC1328a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f5729b;
        C0296h c0296h = C0296h.f5731a;
        if (obj2 != c0296h) {
            return obj2;
        }
        synchronized (this.f5730c) {
            obj = this.f5729b;
            if (obj == c0296h) {
                InterfaceC1328a interfaceC1328a = this.f5728a;
                kotlin.jvm.internal.i.b(interfaceC1328a);
                obj = interfaceC1328a.invoke();
                this.f5729b = obj;
                this.f5728a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f5729b != C0296h.f5731a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
