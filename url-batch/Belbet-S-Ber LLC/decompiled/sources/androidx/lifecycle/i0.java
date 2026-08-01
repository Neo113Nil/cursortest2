package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class i0 implements h1.b {

    /* renamed from: a, reason: collision with root package name */
    public final h1.c f715a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f716b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f717c;
    public final w2.c d;

    public i0(h1.c cVar, p0 p0Var) {
        i3.d.e(cVar, "savedStateRegistry");
        this.f715a = cVar;
        this.d = new w2.c(new h0(0, p0Var));
    }

    @Override // h1.b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f717c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((j0) this.d.a()).f718c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f716b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((f0) entry.getValue()).getClass();
        throw null;
    }
}
