package defpackage;

import android.content.Context;
import android.view.View;
import com.ice.fishing.grenza.R;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class t3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ t3(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                v3 v3Var = (v3) this.OPXfSBeufaJ8;
                Context context = view.getContext();
                if (!v3Var.Y1f8riQaR6yg) {
                    context.getApplicationContext().registerComponentCallbacks(v3Var.e9gEMXR7LXtO);
                    v3Var.Y1f8riQaR6yg = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                v3 v3Var = (v3) obj;
                Context context = view.getContext();
                if (v3Var.Y1f8riQaR6yg) {
                    context.getApplicationContext().unregisterComponentCallbacks(v3Var.e9gEMXR7LXtO);
                    v3Var.Y1f8riQaR6yg = false;
                    break;
                }
                break;
            case 1:
                RfyTYNmI9Srp rfyTYNmI9Srp = (RfyTYNmI9Srp) obj;
                for (Object obj2 : z32.ngxnMNrpiKat(rfyTYNmI9Srp.getParent(), xq2.QrzZRwfaDlRX)) {
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
                rfyTYNmI9Srp.a92UlCVFR9N8();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((z82) obj).a92UlCVFR9N8(null);
                break;
        }
    }

    private final void PxuCJdSBwIXG(View view) {
    }

    private final void lS5Rgt96tfkO(View view) {
    }
}
