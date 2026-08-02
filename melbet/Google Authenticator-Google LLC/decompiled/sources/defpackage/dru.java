package defpackage;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dru implements View.OnTouchListener {
    public final dsf a;
    public final SelectedAccountDisc b;
    public boolean c;
    final GestureDetector.SimpleOnGestureListener d;
    private final xi e;
    private final efu f;

    public dru(dsf dsfVar, SelectedAccountDisc selectedAccountDisc) {
        drr drrVar = new drr(this);
        this.d = drrVar;
        this.a = dsfVar;
        this.b = selectedAccountDisc;
        xi xiVar = new xi(selectedAccountDisc.getContext(), drrVar);
        this.e = xiVar;
        ((GestureDetector) xiVar.a).setIsLongpressEnabled(true);
        this.f = dsfVar.k;
    }

    public static boolean d(int i) {
        return i == 4 || i == 5;
    }

    public static boolean e(int i) {
        return i == 3 || i == 2;
    }

    public static Object f(List list, Object obj, int i) {
        if (!list.isEmpty()) {
            int i2 = i - 1;
            int i3 = 1;
            if (i2 == 1) {
                i3 = -1;
            } else if (i2 != 2) {
                throw new RuntimeException();
            }
            int indexOf = list.indexOf(obj);
            if (indexOf != -1) {
                int i4 = ((his) list).c;
                int i5 = ((i3 + indexOf) + i4) % i4;
                if (i5 != indexOf) {
                    return list.get(i5);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ObjectAnimator g(AccountParticleDisc accountParticleDisc, int i) {
        boolean z;
        if (i != 3) {
            if (i != 4) {
                z = false;
                boolean e = e(i);
                return ObjectAnimator.ofFloat(accountParticleDisc, true == e ? "translationX" : "translationY", (!e ? accountParticleDisc.getMeasuredHeight() : accountParticleDisc.getMeasuredWidth()) * (true == z ? -0.4f : 0.4f)).setDuration(100L);
            }
            i = 4;
        }
        z = true;
        boolean e2 = e(i);
        if (!e2) {
        }
        return ObjectAnimator.ofFloat(accountParticleDisc, true == e2 ? "translationX" : "translationY", (!e2 ? accountParticleDisc.getMeasuredHeight() : accountParticleDisc.getMeasuredWidth()) * (true == z ? -0.4f : 0.4f)).setDuration(100L);
    }

    public final boolean a(Object obj, Object obj2) {
        dov dovVar = this.a.c;
        return dovVar.c(obj).equals(dovVar.c(obj2));
    }

    public final AnimatorSet b(int i, AnimatorListenerAdapter animatorListenerAdapter, Runnable runnable) {
        AccountParticleDisc accountParticleDisc = this.b.b;
        ObjectAnimator duration = ObjectAnimator.ofFloat(accountParticleDisc, "alpha", 1.0f, 0.0f).setDuration(50L);
        duration.setStartDelay(50L);
        hel r = hel.r(g(accountParticleDisc, i), duration);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(r);
        animatorSet.addListener(new drs(this, runnable, animatorListenerAdapter));
        return animatorSet;
    }

    public final void c(int i) {
        int i2;
        int i3 = i - 1;
        if (i3 != 1) {
            i2 = 2;
            if (i3 == 2) {
                i2 = 5;
            } else if (i3 != 3) {
                i2 = 3;
            }
        } else {
            i2 = 4;
        }
        efu efuVar = this.f;
        cfe cfeVar = new cfe(22);
        iwq iwqVar = dlt.a;
        jkj k = dlu.a.k();
        if (!k.b.M()) {
            k.t();
        }
        dlu dluVar = (dlu) k.b;
        dluVar.c = i2 - 1;
        dluVar.b = 1 | dluVar.b;
        cfeVar.b(new dkt(iwqVar, (dlu) k.q()));
        efuVar.f(cfeVar, this.b);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SelectedAccountDisc selectedAccountDisc = this.b;
        hoq.I(view == selectedAccountDisc, "View must be the selectedAccountDisc passed on the c'tor.");
        if (motionEvent.getAction() == 0) {
            selectedAccountDisc.requestDisallowInterceptTouchEvent(true);
        }
        return ((GestureDetector) this.e.a).onTouchEvent(motionEvent);
    }
}
