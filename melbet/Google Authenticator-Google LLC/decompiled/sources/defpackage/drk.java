package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class drk implements View.OnTouchListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ drk(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.b;
        if (i == 0) {
            SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) this.a;
            View.OnTouchListener onTouchListener = selectedAccountDisc.c;
            boolean z = onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
            View.OnTouchListener onTouchListener2 = selectedAccountDisc.d;
            boolean z2 = onTouchListener2 != null && onTouchListener2.onTouch(view, motionEvent);
            if (selectedAccountDisc.d == null || !z) {
                return z2 || z;
            }
            throw new RuntimeException("customOnTouchListener may not consume the event");
        }
        if (i == 1) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                ki kiVar = (ki) this.a;
                PopupWindow popupWindow = kiVar.p;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < popupWindow.getWidth() && y >= 0 && y < popupWindow.getHeight()) {
                    kiVar.n.postDelayed(kiVar.q, 250L);
                }
            } else if (action == 1) {
                ki kiVar2 = (ki) this.a;
                kiVar2.n.removeCallbacks(kiVar2.q);
            }
            return false;
        }
        if (i == 2) {
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                ?? r4 = this.a;
                if (i2 >= ((his) r4).c) {
                    break;
                }
                z3 |= ((View.OnTouchListener) r4.get(i2)).onTouch(view, motionEvent);
                i2++;
            }
            if (z3) {
                hoq.I(motionEvent.getAction() != 0, "Internal onTouchListeners may not consume ACTION_DOWN.");
            }
            return z3;
        }
        if (i == 3) {
            fng fngVar = (fng) this.a;
            if (fngVar.i()) {
                fngVar.k.clearFocus();
            }
            return false;
        }
        if (motionEvent.getAction() == 1) {
            fqo fqoVar = (fqo) this.a;
            if (fqoVar.p()) {
                fqoVar.c = false;
            }
            fqoVar.m();
            fqoVar.n();
        }
        return false;
    }

    public drk(ki kiVar, int i) {
        this.b = i;
        this.a = kiVar;
    }
}
