package i;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import u.C0939j;

/* renamed from: i.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0538y {

    /* renamed from: a, reason: collision with root package name */
    public Object f5493a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5494b;

    public AbstractC0538y(Context context) {
        this.f5493a = context;
    }

    public void c() {
        N0.d dVar = (N0.d) this.f5493a;
        if (dVar != null) {
            try {
                ((LayoutInflaterFactory2C0500B) this.f5494b).f5346s.unregisterReceiver(dVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f5493a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof D.a)) {
            return menuItem;
        }
        D.a aVar = (D.a) menuItem;
        if (((C0939j) this.f5494b) == null) {
            this.f5494b = new C0939j(0);
        }
        MenuItem menuItem2 = (MenuItem) ((C0939j) this.f5494b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        m.t tVar = new m.t((Context) this.f5493a, aVar);
        ((C0939j) this.f5494b).put(aVar, tVar);
        return tVar;
    }

    public abstract void g();

    public void h() {
        c();
        IntentFilter d7 = d();
        if (d7.countActions() == 0) {
            return;
        }
        if (((N0.d) this.f5493a) == null) {
            this.f5493a = new N0.d(1, this);
        }
        ((LayoutInflaterFactory2C0500B) this.f5494b).f5346s.registerReceiver((N0.d) this.f5493a, d7);
    }

    public AbstractC0538y(LayoutInflaterFactory2C0500B layoutInflaterFactory2C0500B) {
        this.f5494b = layoutInflaterFactory2C0500B;
    }
}
