package androidx.lifecycle;

import K.S;
import android.os.Bundle;
import b2.C0193g;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class A implements V.d {

    /* renamed from: a, reason: collision with root package name */
    public final O1.k f2366a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2367b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2368c;

    /* renamed from: d, reason: collision with root package name */
    public final C0193g f2369d;

    public A(O1.k savedStateRegistry, G g3) {
        kotlin.jvm.internal.j.e(savedStateRegistry, "savedStateRegistry");
        this.f2366a = savedStateRegistry;
        this.f2369d = new C0193g(new S(2, g3));
    }

    @Override // V.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2368c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((B) this.f2369d.a()).f2372c.entrySet().iterator();
        if (!it.hasNext()) {
            this.f2367b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((x) entry.getValue()).getClass();
        throw null;
    }
}
