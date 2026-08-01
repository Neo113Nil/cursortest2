package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class i0 implements g1.b {

    /* renamed from: a, reason: collision with root package name */
    public final g1.c f610a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f611b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f612c;
    public final z2.b d;

    public i0(g1.c cVar, p0 p0Var) {
        f3.d.e(cVar, "savedStateRegistry");
        this.f610a = cVar;
        this.d = new z2.b(new h0(p0Var));
    }

    @Override // g1.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f612c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((j0) this.d.a()).f613c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f611b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((f0) entry.getValue()).getClass();
        throw null;
    }
}
