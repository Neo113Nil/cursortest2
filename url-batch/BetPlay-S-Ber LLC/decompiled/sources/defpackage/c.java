package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class c implements v90 {
    public boolean a;
    public int b;
    public final View c;

    public c(FloatingActionButton floatingActionButton) {
        this.a = false;
        this.b = 0;
        this.c = floatingActionButton;
    }

    @Override // defpackage.v90
    public void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.k = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.v90
    public void b() {
        this.a = true;
    }

    @Override // defpackage.v90
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    public c(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.a = false;
    }
}
