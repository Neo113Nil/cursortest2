package androidx.lifecycle;

import android.os.Bundle;
import h0.C0132d;
import h0.InterfaceC0131c;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class J implements InterfaceC0131c {

    /* renamed from: a, reason: collision with root package name */
    public final C0132d f1343a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1344b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1345c;
    public final P0.c d;

    public J(C0132d c0132d, P p2) {
        X0.d.e(c0132d, "savedStateRegistry");
        this.f1343a = c0132d;
        this.d = new P0.c(new I(0, p2));
    }

    @Override // h0.InterfaceC0131c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1345c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((K) this.d.a()).f1346b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1344b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((E) entry.getValue()).getClass();
        throw null;
    }
}
