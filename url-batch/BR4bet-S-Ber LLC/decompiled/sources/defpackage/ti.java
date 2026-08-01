package defpackage;

import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ti extends b9 {
    public final /* synthetic */ int x;

    public /* synthetic */ ti(int i) {
        this.x = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b9
    public final void R(q50 q50Var, float f) {
        switch (this.x) {
            case 0:
                ((View) q50Var).setAlpha(f);
                break;
            case 1:
                ((View) q50Var).setScaleX(f);
                break;
            case 2:
                ((View) q50Var).setScaleY(f);
                break;
            case 3:
                ((View) q50Var).setRotation(f);
                break;
            case 4:
                ((View) q50Var).setRotationX(f);
                break;
            default:
                ((View) q50Var).setRotationY(f);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b9
    public final float s(q50 q50Var) {
        switch (this.x) {
            case 0:
                return ((View) q50Var).getAlpha();
            case 1:
                return ((View) q50Var).getScaleX();
            case 2:
                return ((View) q50Var).getScaleY();
            case 3:
                return ((View) q50Var).getRotation();
            case 4:
                return ((View) q50Var).getRotationX();
            default:
                return ((View) q50Var).getRotationY();
        }
    }
}
