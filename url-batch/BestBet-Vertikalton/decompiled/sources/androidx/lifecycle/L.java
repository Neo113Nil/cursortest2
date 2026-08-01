package androidx.lifecycle;

import android.os.Bundle;
import j0.InterfaceC0169c;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class L implements InterfaceC0169c {

    /* renamed from: a, reason: collision with root package name */
    public final j0.d f1866a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1867b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1868c;
    public final X0.f d;

    public L(j0.d dVar, S s2) {
        k1.e.e(dVar, "savedStateRegistry");
        this.f1866a = dVar;
        this.d = new X0.f(new K(0, s2));
    }

    @Override // j0.InterfaceC0169c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1868c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((M) this.d.a()).f1869b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1867b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((G) entry.getValue()).getClass();
        throw null;
    }
}
