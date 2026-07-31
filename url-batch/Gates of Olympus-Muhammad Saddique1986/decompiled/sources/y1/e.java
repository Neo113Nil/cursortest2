package y1;

import android.os.Bundle;
import androidx.lifecycle.C0282k;
import f2.j;
import i.C0510b;
import i.C0511c;
import i.C0514f;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f10388b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f10389c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10390d;

    /* renamed from: e, reason: collision with root package name */
    public C1232a f10391e;

    /* renamed from: a, reason: collision with root package name */
    public final C0514f f10387a = new C0514f();

    /* renamed from: f, reason: collision with root package name */
    public boolean f10392f = true;

    public final Bundle a(String str) {
        j.f(str, "key");
        if (!this.f10390d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f10389c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f10389c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f10389c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f10389c = null;
        }
        return bundle2;
    }

    public final d b() {
        String str;
        d dVar;
        Iterator it = this.f10387a.iterator();
        do {
            C0510b c0510b = (C0510b) it;
            if (!c0510b.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c0510b.next();
            j.e(entry, "components");
            str = (String) entry.getKey();
            dVar = (d) entry.getValue();
        } while (!j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public final void c(String str, d dVar) {
        Object obj;
        j.f(dVar, "provider");
        C0514f c0514f = this.f10387a;
        C0511c b3 = c0514f.b(str);
        if (b3 != null) {
            obj = b3.f6227e;
        } else {
            C0511c c0511c = new C0511c(str, dVar);
            c0514f.f6236g++;
            C0511c c0511c2 = c0514f.f6234e;
            if (c0511c2 == null) {
                c0514f.f6233d = c0511c;
                c0514f.f6234e = c0511c;
            } else {
                c0511c2.f6228f = c0511c;
                c0511c.f6229g = c0511c2;
                c0514f.f6234e = c0511c;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f10392f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C1232a c1232a = this.f10391e;
        if (c1232a == null) {
            c1232a = new C1232a(this);
        }
        this.f10391e = c1232a;
        try {
            C0282k.class.getDeclaredConstructor(null);
            C1232a c1232a2 = this.f10391e;
            if (c1232a2 != null) {
                c1232a2.f10384a.add(C0282k.class.getName());
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + C0282k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
