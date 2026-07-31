package androidx.lifecycle;

import androidx.lifecycle.AbstractC1346l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L implements InterfaceC1351q {

    /* renamed from: b, reason: collision with root package name */
    private final O f12585b;

    public L(O provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f12585b = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1351q
    public void onStateChanged(InterfaceC1354u source, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1346l.a.ON_CREATE) {
            source.getLifecycle().removeObserver(this);
            this.f12585b.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
