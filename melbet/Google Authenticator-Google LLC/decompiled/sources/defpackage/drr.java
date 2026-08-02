package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class drr extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ dru a;

    public drr(dru druVar) {
        this.a = druVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.c = false;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r11.e.o != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AnimatorSet animatorSet;
        dru druVar = this.a;
        if (druVar.c) {
            return false;
        }
        int i = Math.abs(f2) < Math.abs(f) ? f < 0.0f ? 4 : 5 : Math.abs(f2) > Math.abs(f) ? f2 < 0.0f ? 3 : 2 : 1;
        if (i == 1) {
            return false;
        }
        dsf dsfVar = druVar.a;
        dsg dsgVar = dsfVar.b;
        Object a = dsgVar.a();
        if (dru.e(i)) {
            hel g = dsgVar.g();
            gzp gzpVar = dsfVar.h;
            if (g.isEmpty() || a == null) {
                return false;
            }
        }
        if (dru.d(i)) {
            if (!dsgVar.g().isEmpty()) {
                gzp gzpVar2 = dsfVar.h;
            }
            return false;
        }
        SelectedAccountDisc selectedAccountDisc = druVar.b;
        selectedAccountDisc.setEnabled(false);
        if (motionEvent != null) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(1);
            selectedAccountDisc.dispatchTouchEvent(obtain);
        }
        druVar.c = true;
        drq drqVar = new drq(this);
        if (dru.e(i)) {
            hel g2 = dsgVar.g();
            ebv ebvVar = dsfVar.e;
            gzp gzpVar3 = ebvVar.a;
            if (druVar.a(dru.f(g2, a, i), a)) {
                ObjectAnimator g3 = dru.g(selectedAccountDisc.b, i);
                g3.setRepeatMode(2);
                g3.setRepeatCount(1);
                g3.setDuration(100L);
                g3.addListener(drqVar);
                animatorSet = g3;
            } else {
                gzp gzpVar4 = ebvVar.l;
                animatorSet = druVar.b(i, drqVar, new mr(druVar, a, i, 6));
            }
        } else {
            if (dru.d(i)) {
                Context context = selectedAccountDisc.getContext();
                ebr ebrVar = dsfVar.g;
                String str = dsk.a;
                ebp a2 = ebrVar.a ? dsk.a(dsfVar.n, context, gyf.a) : null;
                if (a2 != null) {
                    int i2 = i;
                    animatorSet = druVar.b(i2, drqVar, new mr(druVar, i2, a2, 7, null));
                }
            }
            animatorSet = null;
        }
        if (animatorSet != null) {
            animatorSet.start();
        } else {
            selectedAccountDisc.setEnabled(true);
        }
        return true;
    }
}
