package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class J implements j0.c {

    /* renamed from: a, reason: collision with root package name */
    public final j0.d f1550a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1551b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1552c;
    public final W0.d d;

    public J(j0.d dVar, P p2) {
        g1.d.e(dVar, "savedStateRegistry");
        this.f1550a = dVar;
        this.d = new W0.d(new I(0, p2));
    }

    @Override // j0.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1552c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((K) this.d.a()).f1553b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1551b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((E) entry.getValue()).getClass();
        throw null;
    }
}
