package A;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: c, reason: collision with root package name */
    private final Object f9c;

    public g(int i4) {
        super(i4);
        this.f9c = new Object();
    }

    @Override // A.f, A.e
    public boolean a(Object instance) {
        boolean a4;
        Intrinsics.checkNotNullParameter(instance, "instance");
        synchronized (this.f9c) {
            a4 = super.a(instance);
        }
        return a4;
    }

    @Override // A.f, A.e
    public Object b() {
        Object b4;
        synchronized (this.f9c) {
            b4 = super.b();
        }
        return b4;
    }
}
