package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class c implements yc0 {
    public boolean a = false;
    public int b;
    public final /* synthetic */ ActionBarContextView c;

    public c(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // defpackage.yc0
    public final void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.k = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    @Override // defpackage.yc0
    public final void b() {
        this.a = true;
    }

    @Override // defpackage.yc0
    public final void c() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }
}
