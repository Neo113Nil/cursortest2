package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class tm implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public tm(um umVar, ln lnVar) {
        this.h = umVar;
        this.g = lnVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ln lnVar = (ln) obj2;
                pm pmVar = lnVar.c;
                lnVar.k();
                ug.f((ViewGroup) pmVar.J.getParent(), ((um) obj).f.E()).e();
                break;
            default:
                ((ViewGroup) obj2).addView((b80) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f) {
            case 0:
                break;
            default:
                ((ViewGroup) this.g).addView((b80) this.h, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public tm(ViewGroup viewGroup, b80 b80Var) {
        this.g = viewGroup;
        this.h = b80Var;
    }

    private final void a(View view) {
    }
}
