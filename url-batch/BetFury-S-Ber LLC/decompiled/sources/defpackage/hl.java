package defpackage;

import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class hl extends mv {
    public final /* synthetic */ int o;

    public /* synthetic */ hl(int i) {
        this.o = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mv
    public final void N(rd0 rd0Var, float f) {
        switch (this.o) {
            case 0:
                ((View) rd0Var).setAlpha(f);
                break;
            case 1:
                ((View) rd0Var).setScaleX(f);
                break;
            case 2:
                ((View) rd0Var).setScaleY(f);
                break;
            case 3:
                ((View) rd0Var).setRotation(f);
                break;
            case 4:
                ((View) rd0Var).setRotationX(f);
                break;
            default:
                ((View) rd0Var).setRotationY(f);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mv
    public final float y(rd0 rd0Var) {
        switch (this.o) {
            case 0:
                return ((View) rd0Var).getAlpha();
            case 1:
                return ((View) rd0Var).getScaleX();
            case 2:
                return ((View) rd0Var).getScaleY();
            case 3:
                return ((View) rd0Var).getRotation();
            case 4:
                return ((View) rd0Var).getRotationX();
            default:
                return ((View) rd0Var).getRotationY();
        }
    }
}
