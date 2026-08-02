package d1;

import Y0.AbstractC0127v;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import i.MenuC0211i;
import j.C0230f;
import j.C0233i;
import j.C0243t;
import j.C0244u;
import java.lang.ref.WeakReference;
import x.C0326e;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2080e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2081f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2082g;

    public /* synthetic */ i(int i2, Object obj, Object obj2) {
        this.f2080e = i2;
        this.f2082g = obj;
        this.f2081f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        B.m mVar;
        switch (this.f2080e) {
            case 0:
                int i2 = 0;
                do {
                    try {
                        ((Runnable) this.f2081f).run();
                    } catch (Throwable th) {
                        AbstractC0127v.d(H0.j.f503e, th);
                    }
                    jVar = (j) this.f2082g;
                    Runnable f2 = jVar.f();
                    if (f2 == null) {
                        break;
                    } else {
                        this.f2081f = f2;
                        i2++;
                    }
                } while (i2 < 16);
                f1.l lVar = jVar.f2084g;
                lVar.getClass();
                lVar.c(jVar, this);
                break;
            case 1:
                C0233i c0233i = (C0233i) this.f2082g;
                MenuC0211i menuC0211i = c0233i.f2967g;
                if (menuC0211i != null && (mVar = menuC0211i.f2412e) != null) {
                    ((ActionMenuView) mVar.f78f).getClass();
                }
                ActionMenuView actionMenuView = c0233i.f2971k;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0230f c0230f = (C0230f) this.f2081f;
                    if (!c0230f.b()) {
                        if (c0230f.f2461e != null) {
                            c0230f.d(0, 0, false, false);
                        }
                    }
                    c0233i.v = c0230f;
                }
                c0233i.f2983x = null;
                break;
            case 2:
                C0244u c0244u = (C0244u) ((WeakReference) this.f2081f).get();
                if (c0244u != null && c0244u.f3065m) {
                    TextView textView = c0244u.f3053a;
                    Typeface typeface = (Typeface) this.f2082g;
                    textView.setTypeface(typeface);
                    c0244u.f3064l = typeface;
                    break;
                }
                break;
            case 3:
                C0243t c0243t = (C0243t) ((n0.d) this.f2081f).f3284f;
                if (c0243t != null) {
                    c0243t.b((Typeface) this.f2082g);
                    break;
                }
                break;
            default:
                ((C0326e) this.f2081f).accept(this.f2082g);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i2, boolean z2) {
        this.f2080e = i2;
        this.f2081f = obj;
        this.f2082g = obj2;
    }
}
