package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class edm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public edm(anr anrVar, anq anqVar, int i) {
        this.c = i;
        this.b = anrVar;
        this.a = anqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.c;
        if (i == 0) {
            String str = eea.a;
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((fob) this.a).N(floatValue);
            ((fob) this.b).N(floatValue);
            return;
        }
        if (i == 1) {
            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            anq anqVar = (anq) this.a;
            anr.e(floatValue2, anqVar);
            anr anrVar = (anr) this.b;
            anrVar.a(floatValue2, anqVar, false);
            anrVar.invalidateSelf();
            return;
        }
        if (i == 2) {
            float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ((fob) this.b).L(floatValue3);
            AppBarLayout appBarLayout = (AppBarLayout) this.a;
            Drawable drawable = appBarLayout.i;
            if (drawable instanceof fob) {
                ((fob) drawable).L(floatValue3);
            }
            Iterator it = appBarLayout.f.iterator();
            while (it.hasNext()) {
                ((ffc) it.next()).a();
            }
            Iterator it2 = appBarLayout.g.iterator();
            while (it2.hasNext()) {
                ((kee) it2.next()).m(floatValue3 / appBarLayout.k);
            }
            return;
        }
        if (i != 3) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            Rect rect = (Rect) this.a;
            rect.right = intValue;
            ((fnq) this.b).a.j.setClipBounds(rect);
            return;
        }
        flb flbVar = (flb) this.a;
        if (!flbVar.c(true) || flbVar.m == 0) {
            return;
        }
        flp flpVar = (flp) this.b;
        if (flpVar.isVisible()) {
            flpVar.invalidateSelf();
        }
    }

    public /* synthetic */ edm(Object obj, fob fobVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = fobVar;
    }

    public /* synthetic */ edm(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
