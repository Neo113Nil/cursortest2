package defpackage;

import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class kg extends op {
    public final /* synthetic */ int o;

    public /* synthetic */ kg(int i) {
        this.o = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.op
    public final float C(y20 y20Var) {
        switch (this.o) {
            case 0:
                return ((View) y20Var).getAlpha();
            case 1:
                return ((View) y20Var).getScaleX();
            case 2:
                return ((View) y20Var).getScaleY();
            case 3:
                return ((View) y20Var).getRotation();
            case 4:
                return ((View) y20Var).getRotationX();
            default:
                return ((View) y20Var).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.op
    public final void Q(y20 y20Var, float f) {
        switch (this.o) {
            case 0:
                ((View) y20Var).setAlpha(f);
                break;
            case 1:
                ((View) y20Var).setScaleX(f);
                break;
            case 2:
                ((View) y20Var).setScaleY(f);
                break;
            case 3:
                ((View) y20Var).setRotation(f);
                break;
            case 4:
                ((View) y20Var).setRotationX(f);
                break;
            default:
                ((View) y20Var).setRotationY(f);
                break;
        }
    }
}
