package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.database.sqlite.SQLiteDatabase;
import android.os.Process;
import android.os.StrictMode;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.libraries.material.productlockup.AnimatableProductLockupView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class evp implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ evp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v24, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r13v9, types: [hac, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        fob a;
        byte[] bArr = null;
        int i = 0;
        try {
            switch (this.b) {
                case 0:
                    throw new RuntimeException(((ExecutionException) this.a).getCause());
                case 1:
                    try {
                        hnu.aR(this.a);
                        return;
                    } catch (ExecutionException e) {
                        fao.e(new evp(e, i));
                        return;
                    }
                case 2:
                    hnu.aR(this.a);
                    return;
                case 3:
                    if (((Boolean) ((evt) this.a).c.bB()).booleanValue()) {
                        Process.killProcess(Process.myPid());
                        System.exit(0);
                        return;
                    }
                    return;
                case 4:
                    hnu.aR(this.a);
                    return;
                case 5:
                    Object obj = this.a;
                    exk.a.add(obj);
                    int i2 = exk.b;
                    if (i2 != -1) {
                        ((exj) obj).b(i2);
                        return;
                    }
                    return;
                case 6:
                    Object obj2 = this.a;
                    Object obj3 = ((fcn) obj2).g;
                    synchronized (obj3) {
                        ((fcn) obj2).i = null;
                        ((fcn) obj2).j = true;
                        synchronized (obj3) {
                        }
                        return;
                    }
                    return;
                case 7:
                    Object obj4 = this.a;
                    synchronized (((fdl) obj4).h) {
                        if (((fdl) obj4).k == 0) {
                            ((fdl) obj4).d();
                        }
                    }
                    return;
                case 8:
                    ?? r13 = this.a;
                    fdl fdlVar = (fdl) r13;
                    synchronized (fdlVar.h) {
                        hvi hviVar = ((fdl) r13).j;
                        if (((fdl) r13).k == 0 && hviVar != null) {
                            ((fdl) r13).j = null;
                            if (!hviVar.cancel(true)) {
                                try {
                                    ((SQLiteDatabase) hnu.aR(hviVar)).close();
                                } catch (ExecutionException unused) {
                                }
                            }
                            fdlVar.b.unregisterComponentCallbacks(r13);
                            Iterator it = fdlVar.g.iterator();
                            while (it.hasNext()) {
                                if (((WeakReference) it.next()).get() == null) {
                                    it.remove();
                                }
                            }
                            return;
                        }
                        return;
                    }
                case 9:
                    ((feg) this.a).b();
                    return;
                case 10:
                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy) this.a);
                    return;
                case 11:
                    fgd fgdVar = (fgd) this.a;
                    fgdVar.b = false;
                    BottomSheetBehavior bottomSheetBehavior = fgdVar.c;
                    abs absVar = bottomSheetBehavior.y;
                    if (absVar != null && absVar.l()) {
                        fgdVar.a(fgdVar.a);
                        return;
                    } else {
                        if (bottomSheetBehavior.x == 2) {
                            bottomSheetBehavior.S(fgdVar.a);
                            return;
                        }
                        return;
                    }
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    MaterialButton materialButton = (MaterialButton) this.a;
                    if (materialButton.g && materialButton.i && (a = materialButton.b.a(false)) != null) {
                        i = (int) (a.t() * 0.11f);
                    }
                    materialButton.h = i;
                    materialButton.i();
                    materialButton.invalidate();
                    return;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    ((iyi) this.a).p(true);
                    return;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    ((fla) this.a).e();
                    return;
                case 15:
                    fla flaVar = (fla) this.a;
                    ((flt) flaVar.getCurrentDrawable()).l(false, false, true);
                    if (flaVar.getProgressDrawable() == null || !flaVar.getProgressDrawable().isVisible()) {
                        if (flaVar.getIndeterminateDrawable() == null || !flaVar.getIndeterminateDrawable().isVisible()) {
                            flaVar.setVisibility(4);
                            return;
                        }
                        return;
                    }
                    return;
                case 16:
                    fmu fmuVar = new fmu(1);
                    Object obj5 = this.a;
                    fmt fmtVar = (fmt) obj5;
                    fmy fmyVar = fmtVar.D;
                    fmyVar.a(fmuVar);
                    View view = fmtVar.E;
                    ActionMenuView a2 = fjx.a((Toolbar) obj5);
                    View childAt = (a2 == null || a2.getChildCount() <= 1) ? null : a2.getChildAt(0);
                    TextView textView = fmtVar.z;
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setStartDelay(250L);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(fiy.a(textView));
                    TimeInterpolator timeInterpolator = fes.a;
                    ofFloat.setInterpolator(timeInterpolator);
                    ofFloat.setDuration(250L);
                    animatorSet.play(ofFloat);
                    if (childAt != null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat2.addUpdateListener(fiy.a(childAt));
                        ofFloat2.setInterpolator(timeInterpolator);
                        ofFloat2.setDuration(250L);
                        animatorSet.play(ofFloat2);
                    }
                    animatorSet.addListener(new fmv(fmyVar));
                    fmyVar.a = animatorSet;
                    textView.setAlpha(0.0f);
                    if (childAt != null) {
                        childAt.setAlpha(0.0f);
                    }
                    if (view instanceof AnimatableProductLockupView) {
                        AnimatableProductLockupView animatableProductLockupView = (AnimatableProductLockupView) view;
                        kee keeVar = new kee(animatorSet, bArr);
                        animatableProductLockupView.c.setAlpha(1.0f);
                        dne dneVar = animatableProductLockupView.a;
                        dneVar.n = keeVar;
                        dneVar.c();
                        return;
                    }
                    if (view == null) {
                        animatorSet.start();
                        return;
                    }
                    view.setAlpha(0.0f);
                    view.setVisibility(0);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat3.addUpdateListener(fiy.a(view));
                    ofFloat3.setInterpolator(timeInterpolator);
                    boolean z = fmyVar.c;
                    ofFloat3.setDuration(250L);
                    ofFloat3.setStartDelay(500L);
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ofFloat4.addUpdateListener(fiy.a(view));
                    ofFloat4.setInterpolator(timeInterpolator);
                    ofFloat4.setDuration(250L);
                    ofFloat4.setStartDelay(750L);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playSequentially(ofFloat3, ofFloat4);
                    fmyVar.b = animatorSet2;
                    animatorSet2.addListener(new fmw(view, animatorSet));
                    animatorSet2.start();
                    return;
                case 17:
                    ((fnr) this.a).h();
                    return;
                case 18:
                    EditText editText = ((fng) this.a).k;
                    if (editText.requestFocus()) {
                        editText.sendAccessibilityEvent(8);
                    }
                    fik.e(editText).showSoftInput(editText, 1);
                    return;
                case 19:
                    ((fng) this.a).h();
                    return;
                default:
                    EditText editText2 = ((fng) this.a).k;
                    if (editText2.requestFocus()) {
                        editText2.sendAccessibilityEvent(8);
                        return;
                    }
                    return;
            }
        } catch (Exception unused2) {
        }
    }

    public evp(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
