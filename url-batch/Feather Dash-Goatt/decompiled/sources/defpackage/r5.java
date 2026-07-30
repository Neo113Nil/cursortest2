package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.android.installreferrer.api.InstallReferrerClient;
import com.feathherdashh.dashgame.R;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class r5 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r5(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                s5 s5Var = (s5) this.e;
                Context context = view.getContext();
                if (!s5Var.c) {
                    context.getApplicationContext().registerComponentCallbacks(s5Var.d);
                    s5Var.c = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                s5 s5Var = (s5) obj;
                Context context = view.getContext();
                if (s5Var.c) {
                    context.getApplicationContext().unregisterComponentCallbacks(s5Var.d);
                    s5Var.c = false;
                    break;
                }
                break;
            case 1:
                o oVar = (o) obj;
                ViewParent parent = oVar.getParent();
                for (Object obj2 : parent == null ? qv.a : new yy(new i6(10, parent), qn1.m, 1)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                kq1 kq1Var = oVar.g;
                if (kq1Var != null) {
                    kq1Var.d();
                }
                oVar.g = null;
                oVar.requestLayout();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((rc1) obj).a(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
