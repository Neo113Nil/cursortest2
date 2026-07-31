package h0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1346l;
import androidx.lifecycle.InterfaceC1351q;
import androidx.lifecycle.InterfaceC1354u;
import h0.C2433b;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.C3250b;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2435d {

    /* renamed from: g, reason: collision with root package name */
    private static final b f36689g = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private boolean f36691b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f36692c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36693d;

    /* renamed from: e, reason: collision with root package name */
    private C2433b.C0218b f36694e;

    /* renamed from: a, reason: collision with root package name */
    private final C3250b f36690a = new C3250b();

    /* renamed from: f, reason: collision with root package name */
    private boolean f36695f = true;

    /* renamed from: h0.d$a */
    public interface a {
        void a(InterfaceC2437f interfaceC2437f);
    }

    /* renamed from: h0.d$b */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: h0.d$c */
    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C2435d this$0, InterfaceC1354u interfaceC1354u, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC1354u, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC1346l.a.ON_START) {
            this$0.f36695f = true;
        } else if (event == AbstractC1346l.a.ON_STOP) {
            this$0.f36695f = false;
        }
    }

    public final Bundle b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f36693d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f36692c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f36692c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f36692c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f36692c = null;
        return bundle2;
    }

    public final c c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator it = this.f36690a.iterator();
        while (it.hasNext()) {
            Map.Entry components = (Map.Entry) it.next();
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String str = (String) components.getKey();
            c cVar = (c) components.getValue();
            if (Intrinsics.areEqual(str, key)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC1346l lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f36691b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.addObserver(new InterfaceC1351q() { // from class: h0.c
            @Override // androidx.lifecycle.InterfaceC1351q
            public final void onStateChanged(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
                C2435d.d(C2435d.this, interfaceC1354u, aVar);
            }
        });
        this.f36691b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f36691b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f36693d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f36692c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f36693d = true;
    }

    public final void g(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f36692c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C3250b.d e4 = this.f36690a.e();
        Intrinsics.checkNotNullExpressionValue(e4, "this.components.iteratorWithAdditions()");
        while (e4.hasNext()) {
            Map.Entry entry = (Map.Entry) e4.next();
            bundle.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((c) this.f36690a.h(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f36695f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C2433b.C0218b c0218b = this.f36694e;
        if (c0218b == null) {
            c0218b = new C2433b.C0218b(this);
        }
        this.f36694e = c0218b;
        try {
            clazz.getDeclaredConstructor(null);
            C2433b.C0218b c0218b2 = this.f36694e;
            if (c0218b2 != null) {
                String name = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
                c0218b2.b(name);
            }
        } catch (NoSuchMethodException e4) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
        }
    }
}
