package U0;

import f1.InterfaceC0090a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0090a f900a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f901b = f.f903b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f902c = this;

    public e(InterfaceC0090a interfaceC0090a) {
        this.f900a = interfaceC0090a;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f901b;
        f fVar = f.f903b;
        if (obj2 != fVar) {
            return obj2;
        }
        synchronized (this.f902c) {
            obj = this.f901b;
            if (obj == fVar) {
                InterfaceC0090a interfaceC0090a = this.f900a;
                g1.d.b(interfaceC0090a);
                obj = interfaceC0090a.b();
                this.f901b = obj;
                this.f900a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f901b != f.f903b ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
