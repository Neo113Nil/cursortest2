package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class J implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final h0.d f1420a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1421b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1422c;
    public final S0.c d;

    public J(h0.d dVar, P p2) {
        b1.d.e(dVar, "savedStateRegistry");
        this.f1420a = dVar;
        this.d = new S0.c(new I(0, p2));
    }

    @Override // h0.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1422c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((K) this.d.a()).f1423b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1421b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((E) entry.getValue()).getClass();
        throw null;
    }
}
