package b1;

import W0.AbstractC0078s;
import W0.AbstractC0081v;
import android.graphics.Typeface;
import androidx.appcompat.widget.ActionMenuView;
import i.C0159f;
import i.C0162i;
import i.C0172t;
import i.C0173u;
import java.lang.ref.WeakReference;
import o0.C0211b;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1753e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1754f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1755g;

    public /* synthetic */ i(int i2, Object obj, Object obj2) {
        this.f1753e = i2;
        this.f1755g = obj;
        this.f1754f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1753e) {
            case 0:
                j jVar = (j) this.f1755g;
                AbstractC0078s abstractC0078s = jVar.f1757g;
                int i2 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f1754f).run();
                    } catch (Throwable th) {
                        AbstractC0081v.d(G0.j.f500e, th);
                    }
                    Runnable e2 = jVar.e();
                    if (e2 != null) {
                        this.f1754f = e2;
                        i2++;
                        if (i2 >= 16 && abstractC0078s.d()) {
                            abstractC0078s.c(jVar, this);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            case 1:
                C0159f c0159f = (C0159f) this.f1754f;
                C0162i c0162i = (C0162i) this.f1755g;
                ActionMenuView actionMenuView = c0162i.f2233k;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    if (!c0159f.b()) {
                        if (c0159f.f2061e != null) {
                            c0159f.d(0, 0, false, false);
                        }
                    }
                    c0162i.f2243v = c0159f;
                }
                c0162i.f2245x = null;
                break;
            case H.k.FLOAT_FIELD_NUMBER /* 2 */:
                C0173u c0173u = (C0173u) ((WeakReference) this.f1754f).get();
                if (c0173u != null) {
                    Typeface typeface = (Typeface) this.f1755g;
                    if (c0173u.f2332m) {
                        c0173u.f2320a.setTypeface(typeface);
                        c0173u.f2331l = typeface;
                        break;
                    }
                }
                break;
            case H.k.INTEGER_FIELD_NUMBER /* 3 */:
                C0211b c0211b = (C0211b) this.f1754f;
                Typeface typeface2 = (Typeface) this.f1755g;
                C0172t c0172t = (C0172t) c0211b.f2915f;
                if (c0172t != null) {
                    c0172t.b(typeface2);
                    break;
                }
                break;
            default:
                ((v.d) this.f1754f).accept(this.f1755g);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i2, boolean z2) {
        this.f1753e = i2;
        this.f1754f = obj;
        this.f1755g = obj2;
    }
}
