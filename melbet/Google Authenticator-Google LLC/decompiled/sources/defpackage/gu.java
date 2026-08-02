package defpackage;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.authenticator2.editotp.AccountView;
import com.google.android.material.navigation.NavigationView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gu implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gu(eea eeaVar, int i) {
        this.b = i;
        this.a = eeaVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.b;
        if (i == 0) {
            gv gvVar = (gv) this.a;
            if (gvVar.x()) {
                kl klVar = gvVar.a;
                if (klVar.o) {
                    return;
                }
                View view = gvVar.c;
                if (view == null || !view.isShown()) {
                    gvVar.m();
                    return;
                } else {
                    klVar.v();
                    return;
                }
            }
            return;
        }
        boolean z = true;
        if (i == 1) {
            fx fxVar = (fx) this.a;
            if (fxVar.x()) {
                List list = fxVar.b;
                if (list.size() <= 0 || ((ki) ((evt) list.get(0)).b).o) {
                    return;
                }
                View view2 = fxVar.d;
                if (view2 == null || !view2.isShown()) {
                    fxVar.m();
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((ki) ((evt) it.next()).b).v();
                }
                return;
            }
            return;
        }
        if (i == 2) {
            io ioVar = (io) this.a;
            if (!ioVar.b.x()) {
                ioVar.b();
            }
            ViewTreeObserver viewTreeObserver = ioVar.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
            }
            return;
        }
        if (i == 3) {
            Object obj = this.a;
            il ilVar = (il) obj;
            io ioVar2 = ilVar.d;
            if (!ioVar2.isAttachedToWindow() || !ioVar2.getGlobalVisibleRect(ilVar.c)) {
                ((ki) obj).m();
                return;
            } else {
                ilVar.n();
                super/*ki*/.v();
                return;
            }
        }
        if (i == 4) {
            bqw bqwVar = (bqw) ((buz) this.a).a;
            bqs bqsVar = bqwVar.c;
            bqwVar.s = (AccountView) bqw.a(bqsVar).getChildAt(bqwVar.r);
            bqw.a(bqsVar).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            return;
        }
        Object obj2 = this.a;
        if (i == 5) {
            ((eea) obj2).n();
            return;
        }
        NavigationView navigationView = (NavigationView) obj2;
        int[] iArr = navigationView.i;
        navigationView.getLocationOnScreen(iArr);
        boolean z2 = iArr[1] == 0;
        fjj fjjVar = navigationView.g;
        if (fjjVar.x != z2) {
            fjjVar.x = z2;
            fjjVar.q();
        }
        fjp fjpVar = (fjp) obj2;
        fjpVar.c = z2 && navigationView.j;
        boolean z3 = navigationView.getLayoutDirection() == 1;
        int i2 = iArr[0];
        fjpVar.e = (i2 == 0 || i2 + navigationView.getWidth() == 0) && (!z3 ? !navigationView.l : !navigationView.m);
        Activity a = fik.a(navigationView.getContext());
        if (a != null) {
            Rect b = fik.b(a);
            fjpVar.d = b.height() - navigationView.getHeight() == iArr[1] && Color.alpha(a.getWindow().getNavigationBarColor()) != 0 && navigationView.k;
            if ((b.width() != iArr[0] && b.width() - navigationView.getWidth() != iArr[0]) || (!z3 ? !navigationView.m : !navigationView.l)) {
                z = false;
            }
            fjpVar.f = z;
        }
    }

    public gu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
