package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxx implements View.OnLayoutChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dxx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.b;
        if (i9 == 0) {
            view.getClass();
            view.removeOnLayoutChangeListener(this);
            ((ViewGroup) this.a).setLayoutTransition(dya.c());
            return;
        }
        if (i9 == 1) {
            view.getClass();
            view.removeOnLayoutChangeListener(this);
            ((ar) this.a).d();
        } else {
            if (i9 == 2) {
                view.getClass();
                view.removeOnLayoutChangeListener(this);
                ((ViewGroup) this.a).setLayoutTransition(dya.c());
                return;
            }
            if (i9 != 3) {
                ((View) this.a).getVisibility();
                return;
            }
            view.getClass();
            view.removeOnLayoutChangeListener(this);
            ((ViewGroup) this.a).setLayoutTransition(new LayoutTransition());
        }
    }
}
