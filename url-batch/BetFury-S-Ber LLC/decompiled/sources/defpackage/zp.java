package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zp implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public zp(aq aqVar, e eVar) {
        this.h = aqVar;
        this.g = eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                e eVar = (e) obj2;
                a aVar = eVar.c;
                eVar.k();
                zi.f((ViewGroup) aVar.J.getParent(), ((aq) obj).f.E()).e();
                break;
            default:
                ((ViewGroup) obj2).addView((xg0) obj, 0);
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
                ((ViewGroup) this.g).addView((xg0) this.h, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public zp(ViewGroup viewGroup, xg0 xg0Var) {
        this.g = viewGroup;
        this.h = xg0Var;
    }

    private final void a(View view) {
    }
}
