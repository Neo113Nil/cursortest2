package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class J implements i0.c {

    /* renamed from: a, reason: collision with root package name */
    public final i0.d f1493a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1494b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1495c;
    public final U0.e d;

    public J(i0.d dVar, P p2) {
        g1.d.e(dVar, "savedStateRegistry");
        this.f1493a = dVar;
        this.d = new U0.e(new I(0, p2));
    }

    @Override // i0.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1495c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((K) this.d.a()).f1496b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1494b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((E) entry.getValue()).getClass();
        throw null;
    }
}
