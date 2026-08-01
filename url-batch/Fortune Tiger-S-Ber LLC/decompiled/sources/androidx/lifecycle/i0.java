package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i0 implements c1.c {

    /* renamed from: a, reason: collision with root package name */
    public final c1.d f584a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f585b;
    public Bundle c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.b f586d;

    public i0(c1.d dVar, p0 p0Var) {
        u2.c.e(dVar, "savedStateRegistry");
        this.f584a = dVar;
        this.f586d = new m2.b(new h0(0, p0Var));
    }

    @Override // c1.c
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((j0) this.f586d.a()).c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f585b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((f0) entry.getValue()).getClass();
        throw null;
    }
}
