package f2;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import n0.u0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b implements u0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f1436f;

    /* renamed from: g, reason: collision with root package name */
    public int f1437g;
    public final View h;

    public b(FloatingActionButton floatingActionButton) {
        this.f1436f = false;
        this.f1437g = 0;
        this.h = floatingActionButton;
    }

    @Override // n0.u0
    public void b() {
        if (this.f1436f) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.h;
        actionBarContextView.f293k = null;
        super/*android.view.View*/.setVisibility(this.f1437g);
    }

    @Override // n0.u0
    public void c() {
        this.f1436f = true;
    }

    @Override // n0.u0
    public void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f1436f = false;
    }

    public b(ActionBarContextView actionBarContextView) {
        this.h = actionBarContextView;
        this.f1436f = false;
    }
}
