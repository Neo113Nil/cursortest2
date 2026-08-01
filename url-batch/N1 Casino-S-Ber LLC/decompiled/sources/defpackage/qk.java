package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qk implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public qk(rk rkVar, a aVar) {
        this.h = rkVar;
        this.g = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                mk mkVar = aVar.c;
                aVar.k();
                ze.f((ViewGroup) mkVar.J.getParent(), ((rk) obj).f.E()).e();
                break;
            default:
                ((ViewGroup) obj2).addView((y40) obj, 0);
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
                ((ViewGroup) this.g).addView((y40) this.h, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public qk(ViewGroup viewGroup, y40 y40Var) {
        this.g = viewGroup;
        this.h = y40Var;
    }

    private final void a(View view) {
    }
}
