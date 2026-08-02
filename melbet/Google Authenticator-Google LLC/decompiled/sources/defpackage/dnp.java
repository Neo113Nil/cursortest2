package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.material.speeddial.FloatingSpeedDialView;
import com.google.android.libraries.material.speeddial.expandable.ExpandableFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dnp implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ Animator a;
    final /* synthetic */ View b;
    private final /* synthetic */ int c;

    public dnp(View view, Animator animator, int i) {
        this.c = i;
        this.b = view;
        this.a = animator;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.c;
        if (i == 0) {
            ((FloatingSpeedDialView) this.b).getViewTreeObserver().removeOnPreDrawListener(this);
            this.a.start();
            return false;
        }
        View view = this.b;
        if (i != 1) {
            ((ExpandableFloatingActionButton) view).getViewTreeObserver().removeOnPreDrawListener(this);
            this.a.start();
            return false;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.start();
        return false;
    }

    public dnp(View view, Animator animator, int i, byte[] bArr) {
        this.c = i;
        this.a = animator;
        this.b = view;
    }
}
