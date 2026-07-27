package Z1;

import u2.InterfaceC1229b;

/* loaded from: classes.dex */
public final class o implements InterfaceC1229b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4590c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f4591a = f4590c;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC1229b f4592b;

    public o(InterfaceC1229b interfaceC1229b) {
        this.f4592b = interfaceC1229b;
    }

    @Override // u2.InterfaceC1229b
    public final Object get() {
        Object obj = this.f4591a;
        Object obj2 = f4590c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f4591a;
                    if (obj == obj2) {
                        obj = this.f4592b.get();
                        this.f4591a = obj;
                        this.f4592b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
