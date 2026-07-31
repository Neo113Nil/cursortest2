package u1;

import Z1.i;
import android.os.Bundle;
import androidx.lifecycle.C0226k;
import i.C0457b;
import i.C0458c;
import i.C0461f;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f8513b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f8514c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8515d;

    /* renamed from: e, reason: collision with root package name */
    public C1011a f8516e;

    /* renamed from: a, reason: collision with root package name */
    public final C0461f f8512a = new C0461f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f8517f = true;

    public final Bundle a(String str) {
        i.f(str, "key");
        if (!this.f8515d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f8514c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f8514c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f8514c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f8514c = null;
        }
        return bundle2;
    }

    public final d b() {
        String str;
        d dVar;
        Iterator it = this.f8512a.iterator();
        do {
            C0457b c0457b = (C0457b) it;
            if (!c0457b.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c0457b.next();
            i.e(entry, "components");
            str = (String) entry.getKey();
            dVar = (d) entry.getValue();
        } while (!i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public final void c(String str, d dVar) {
        Object obj;
        i.f(dVar, "provider");
        C0461f c0461f = this.f8512a;
        C0458c b2 = c0461f.b(str);
        if (b2 != null) {
            obj = b2.f5087e;
        } else {
            C0458c c0458c = new C0458c(str, dVar);
            c0461f.f5096g++;
            C0458c c0458c2 = c0461f.f5094e;
            if (c0458c2 == null) {
                c0461f.f5093d = c0458c;
                c0461f.f5094e = c0458c;
            } else {
                c0458c2.f5088f = c0458c;
                c0458c.f5089g = c0458c2;
                c0461f.f5094e = c0458c;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f8517f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C1011a c1011a = this.f8516e;
        if (c1011a == null) {
            c1011a = new C1011a(this);
        }
        this.f8516e = c1011a;
        try {
            C0226k.class.getDeclaredConstructor(null);
            C1011a c1011a2 = this.f8516e;
            if (c1011a2 != null) {
                c1011a2.f8509a.add(C0226k.class.getName());
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + C0226k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
