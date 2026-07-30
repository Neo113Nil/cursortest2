package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class q implements y53 {
    public int a;
    public boolean b;
    public final Object c;

    public q() {
        this.a = -1;
        this.c = new eo1(new wb1[16]);
    }

    @Override // defpackage.y53
    public void a() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.r = null;
        super/*android.view.View*/.setVisibility(this.a);
    }

    @Override // defpackage.y53
    public void b() {
        this.b = true;
    }

    @Override // defpackage.y53
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.b = false;
    }

    public q(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
        this.b = false;
    }
}
