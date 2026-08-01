package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class L implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final h0.d f1485a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1486b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1487c;
    public final U0.g d;

    public L(h0.d dVar, S s2) {
        g1.f.e(dVar, "savedStateRegistry");
        this.f1485a = dVar;
        this.d = new U0.g(new K(0, s2));
    }

    @Override // h0.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1487c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((M) this.d.a()).f1488b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1486b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((G) entry.getValue()).getClass();
        throw null;
    }
}
