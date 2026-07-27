package M0;

import kotlin.jvm.internal.i;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public final class f implements D2.b, E2.a {

    /* renamed from: a, reason: collision with root package name */
    public e f1789a;

    @Override // E2.a
    public final void onAttachedToActivity(E2.b binding) {
        i.e(binding, "binding");
        e eVar = this.f1789a;
        if (eVar == null) {
            return;
        }
        eVar.n((AbstractActivityC1515c) ((e) binding).f1788h);
    }

    @Override // D2.b
    public final void onAttachedToEngine(D2.a binding) {
        i.e(binding, "binding");
        this.f1789a = new e(0);
        c cVar = d.f1781a;
        H2.f fVar = binding.f435c;
        i.d(fVar, "getBinaryMessenger(...)");
        c.a(cVar, fVar, this.f1789a);
    }

    @Override // E2.a
    public final void onDetachedFromActivity() {
        e eVar = this.f1789a;
        if (eVar == null) {
            return;
        }
        eVar.n(null);
    }

    @Override // E2.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // D2.b
    public final void onDetachedFromEngine(D2.a binding) {
        i.e(binding, "binding");
        if (this.f1789a == null) {
            return;
        }
        c cVar = d.f1781a;
        H2.f fVar = binding.f435c;
        i.d(fVar, "getBinaryMessenger(...)");
        c.a(cVar, fVar, null);
        this.f1789a = null;
    }

    @Override // E2.a
    public final void onReattachedToActivityForConfigChanges(E2.b binding) {
        i.e(binding, "binding");
        onAttachedToActivity(binding);
    }
}
