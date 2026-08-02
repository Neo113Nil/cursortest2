package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class coo {
    public Bundle b;
    private final Map c = DesugarCollections.synchronizedMap(new qi());
    public int a = 0;

    final void a(int i, int i2, Intent intent) {
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((col) it.next()).c(i, i2, intent);
        }
    }

    final void b(Bundle bundle) {
        this.a = 1;
        this.b = bundle;
        for (Map.Entry entry : this.c.entrySet()) {
            ((col) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    final void c() {
        this.a = 5;
        for (col colVar : this.c.values()) {
        }
    }

    final void d() {
        this.a = 3;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((col) it.next()).h();
        }
    }

    final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.c.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((col) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    final void f() {
        this.a = 2;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((col) it.next()).i();
        }
    }

    final void g() {
        this.a = 4;
        Iterator it = this.c.values().iterator();
        while (it.hasNext()) {
            ((col) it.next()).j();
        }
    }

    final void h(col colVar) {
        Map map = this.c;
        if (map.containsKey("ConnectionlessLifecycleHelper")) {
            throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
        }
        map.put("ConnectionlessLifecycleHelper", colVar);
        if (this.a > 0) {
            new gbg(Looper.getMainLooper(), (byte[]) null).post(new ajx(this, colVar, 10));
        }
    }

    final void i() {
        for (col colVar : this.c.values()) {
        }
    }

    final col j(Class cls) {
        return (col) cls.cast(this.c.get("ConnectionlessLifecycleHelper"));
    }
}
