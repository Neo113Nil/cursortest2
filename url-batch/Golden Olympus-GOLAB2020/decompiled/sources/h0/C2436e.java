package h0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1346l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2436e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f36696d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2437f f36697a;

    /* renamed from: b, reason: collision with root package name */
    private final C2435d f36698b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36699c;

    /* renamed from: h0.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2436e a(InterfaceC2437f owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new C2436e(owner, null);
        }

        private a() {
        }
    }

    public /* synthetic */ C2436e(InterfaceC2437f interfaceC2437f, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2437f);
    }

    public static final C2436e a(InterfaceC2437f interfaceC2437f) {
        return f36696d.a(interfaceC2437f);
    }

    public final C2435d b() {
        return this.f36698b;
    }

    public final void c() {
        AbstractC1346l lifecycle = this.f36697a.getLifecycle();
        if (lifecycle.getCurrentState() != AbstractC1346l.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.addObserver(new C2433b(this.f36697a));
        this.f36698b.e(lifecycle);
        this.f36699c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f36699c) {
            c();
        }
        AbstractC1346l lifecycle = this.f36697a.getLifecycle();
        if (!lifecycle.getCurrentState().d(AbstractC1346l.b.STARTED)) {
            this.f36698b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getCurrentState()).toString());
    }

    public final void e(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.f36698b.g(outBundle);
    }

    private C2436e(InterfaceC2437f interfaceC2437f) {
        this.f36697a = interfaceC2437f;
        this.f36698b = new C2435d();
    }
}
