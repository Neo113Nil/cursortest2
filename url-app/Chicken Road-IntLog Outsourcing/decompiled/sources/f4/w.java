package f4;

import java.io.Serializable;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class w implements InterfaceC0428e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1430a f5690a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5691b;

    @Override // f4.InterfaceC0428e
    public final Object getValue() {
        if (this.f5691b == C0442s.f5686a) {
            InterfaceC1430a interfaceC1430a = this.f5690a;
            kotlin.jvm.internal.i.b(interfaceC1430a);
            this.f5691b = interfaceC1430a.invoke();
            this.f5690a = null;
        }
        return this.f5691b;
    }

    public final String toString() {
        return this.f5691b != C0442s.f5686a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
