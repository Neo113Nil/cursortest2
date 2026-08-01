package androidx.lifecycle;

import android.os.Bundle;
import h0.C0132d;
import h0.InterfaceC0131c;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class J implements InterfaceC0131c {

    /* renamed from: a, reason: collision with root package name */
    public final C0132d f1342a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1343b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1344c;
    public final P0.c d;

    public J(C0132d c0132d, P p2) {
        X0.d.e(c0132d, "savedStateRegistry");
        this.f1342a = c0132d;
        this.d = new P0.c(new I(0, p2));
    }

    @Override // h0.InterfaceC0131c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1344c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((K) this.d.a()).f1345b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1343b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((E) entry.getValue()).getClass();
        throw null;
    }
}
