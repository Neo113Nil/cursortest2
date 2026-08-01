package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class c implements xm0 {
    public boolean a;
    public int b;
    public final View c;

    public c(FloatingActionButton floatingActionButton) {
        this.a = false;
        this.b = 0;
        this.c = floatingActionButton;
    }

    @Override // defpackage.xm0
    public void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.k = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.xm0
    public void b() {
        this.a = true;
    }

    @Override // defpackage.xm0
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    public c(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.a = false;
    }
}
