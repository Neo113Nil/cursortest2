package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class L implements j0.c {

    /* renamed from: a, reason: collision with root package name */
    public final j0.d f1915a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1916b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1917c;

    /* renamed from: d, reason: collision with root package name */
    public final W0.g f1918d;

    public L(j0.d dVar, S s2) {
        j1.h.e(dVar, "savedStateRegistry");
        this.f1915a = dVar;
        this.f1918d = new W0.g(new K(0, s2));
    }

    @Override // j0.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1917c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((M) this.f1918d.a()).f1919b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1916b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((G) entry.getValue()).getClass();
        throw null;
    }
}
