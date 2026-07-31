package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1346l;
import h0.C2435d;
import h0.InterfaceC2437f;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1344j {

    /* renamed from: a, reason: collision with root package name */
    public static final C1344j f12654a = new C1344j();

    /* renamed from: androidx.lifecycle.j$a */
    public static final class a implements C2435d.a {
        @Override // h0.C2435d.a
        public void a(InterfaceC2437f owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof c0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            b0 viewModelStore = ((c0) owner).getViewModelStore();
            C2435d savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                V b4 = viewModelStore.b((String) it.next());
                Intrinsics.checkNotNull(b4);
                C1344j.a(b4, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    /* renamed from: androidx.lifecycle.j$b */
    public static final class b implements InterfaceC1351q {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1346l f12655b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2435d f12656c;

        b(AbstractC1346l abstractC1346l, C2435d c2435d) {
            this.f12655b = abstractC1346l;
            this.f12656c = c2435d;
        }

        @Override // androidx.lifecycle.InterfaceC1351q
        public void onStateChanged(InterfaceC1354u source, AbstractC1346l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC1346l.a.ON_START) {
                this.f12655b.removeObserver(this);
                this.f12656c.i(a.class);
            }
        }
    }

    private C1344j() {
    }

    public static final void a(V viewModel, C2435d registry, AbstractC1346l lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        M m4 = (M) viewModel.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (m4 == null || m4.c()) {
            return;
        }
        m4.a(registry, lifecycle);
        f12654a.c(registry, lifecycle);
    }

    public static final M b(C2435d registry, AbstractC1346l lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        M m4 = new M(str, K.f12578f.a(registry.b(str), bundle));
        m4.a(registry, lifecycle);
        f12654a.c(registry, lifecycle);
        return m4;
    }

    private final void c(C2435d c2435d, AbstractC1346l abstractC1346l) {
        AbstractC1346l.b currentState = abstractC1346l.getCurrentState();
        if (currentState == AbstractC1346l.b.INITIALIZED || currentState.d(AbstractC1346l.b.STARTED)) {
            c2435d.i(a.class);
        } else {
            abstractC1346l.addObserver(new b(abstractC1346l, c2435d));
        }
    }
}
