package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class c implements n90 {
    public boolean a;
    public int b;
    public final View c;

    public c(FloatingActionButton floatingActionButton) {
        this.a = false;
        this.b = 0;
        this.c = floatingActionButton;
    }

    @Override // defpackage.n90
    public void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.k = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.n90
    public void b() {
        this.a = true;
    }

    @Override // defpackage.n90
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    public c(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.a = false;
    }
}
