package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class J implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final h0.d f1448a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1449b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1450c;
    public final V0.d d;

    public J(h0.d dVar, P p2) {
        e1.d.e(dVar, "savedStateRegistry");
        this.f1448a = dVar;
        this.d = new V0.d(new I(0, p2));
    }

    @Override // h0.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1450c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((K) this.d.a()).f1451b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1449b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((E) entry.getValue()).getClass();
        throw null;
    }
}
