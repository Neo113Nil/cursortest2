package R0;

import M0.AbstractC0063v;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import h.C0153f;
import h.C0156i;
import h.C0165s;
import h.C0166t;
import java.lang.ref.WeakReference;
import m0.C0193c;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f911e;

    /* renamed from: f, reason: collision with root package name */
    public Object f912f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f913g;

    public /* synthetic */ i(int i2, Object obj, Object obj2) {
        this.f911e = i2;
        this.f913g = obj;
        this.f912f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        A.j jVar2;
        switch (this.f911e) {
            case 0:
                int i2 = 0;
                do {
                    try {
                        ((Runnable) this.f912f).run();
                    } catch (Throwable th) {
                        AbstractC0063v.d(th, w0.j.f3082e);
                    }
                    jVar = (j) this.f913g;
                    Runnable e2 = jVar.e();
                    if (e2 == null) {
                        break;
                    } else {
                        this.f912f = e2;
                        i2++;
                    }
                } while (i2 < 16);
                T0.l lVar = jVar.f915g;
                lVar.getClass();
                lVar.c(jVar, this);
                break;
            case 1:
                C0156i c0156i = (C0156i) this.f913g;
                g.j jVar3 = c0156i.f2201g;
                if (jVar3 != null && (jVar2 = jVar3.f1980e) != null) {
                    ((ActionMenuView) jVar2.f30f).getClass();
                }
                ActionMenuView actionMenuView = c0156i.f2205k;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C0153f c0153f = (C0153f) this.f912f;
                    if (!c0153f.b()) {
                        if (c0153f.f2028e != null) {
                            c0153f.d(0, 0, false, false);
                        }
                    }
                    c0156i.f2215v = c0153f;
                }
                c0156i.f2217x = null;
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                C0166t c0166t = (C0166t) ((WeakReference) this.f912f).get();
                if (c0166t != null && c0166t.f2297m) {
                    TextView textView = c0166t.f2285a;
                    Typeface typeface = (Typeface) this.f913g;
                    textView.setTypeface(typeface);
                    c0166t.f2296l = typeface;
                    break;
                }
                break;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                C0165s c0165s = (C0165s) ((C0193c) this.f912f).f2706f;
                if (c0165s != null) {
                    c0165s.b((Typeface) this.f913g);
                    break;
                }
                break;
            default:
                ((t.e) this.f912f).accept(this.f913g);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i2, boolean z2) {
        this.f911e = i2;
        this.f912f = obj;
        this.f913g = obj2;
    }
}
