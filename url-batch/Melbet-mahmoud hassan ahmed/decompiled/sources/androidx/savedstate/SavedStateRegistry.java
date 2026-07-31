package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b, reason: collision with root package name */
    private Bundle f1358b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1359c;

    /* renamed from: a, reason: collision with root package name */
    private d.b<String, b> f1357a = new d.b<>();

    /* renamed from: d, reason: collision with root package name */
    boolean f1360d = true;

    public interface a {
        void a(androidx.savedstate.b bVar);
    }

    public interface b {
        Bundle a();
    }

    SavedStateRegistry() {
    }

    public Bundle a(String str) {
        if (!this.f1359c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f1358b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f1358b.remove(str);
        if (this.f1358b.isEmpty()) {
            this.f1358b = null;
        }
        return bundle2;
    }

    void b(e eVar, Bundle bundle) {
        if (this.f1359c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f1358b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        eVar.a(new g() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.g
            public void d(i iVar, e.b bVar) {
                SavedStateRegistry savedStateRegistry;
                boolean z6;
                if (bVar == e.b.ON_START) {
                    savedStateRegistry = SavedStateRegistry.this;
                    z6 = true;
                } else {
                    if (bVar != e.b.ON_STOP) {
                        return;
                    }
                    savedStateRegistry = SavedStateRegistry.this;
                    z6 = false;
                }
                savedStateRegistry.f1360d = z6;
            }
        });
        this.f1359c = true;
    }

    void c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f1358b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        d.b<String, b>.d k7 = this.f1357a.k();
        while (k7.hasNext()) {
            Map.Entry next = k7.next();
            bundle2.putBundle((String) next.getKey(), ((b) next.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
