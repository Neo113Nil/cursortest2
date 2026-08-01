package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class sg extends jw {
    public final /* synthetic */ int o;

    public /* synthetic */ sg(int i) {
        this.o = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jw
    public final float C(o20 o20Var) {
        switch (this.o) {
            case 0:
                return ((View) o20Var).getAlpha();
            case 1:
                return ((View) o20Var).getScaleX();
            case 2:
                return ((View) o20Var).getScaleY();
            case 3:
                return ((View) o20Var).getRotation();
            case 4:
                return ((View) o20Var).getRotationX();
            default:
                return ((View) o20Var).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jw
    public final void d0(o20 o20Var, float f) {
        switch (this.o) {
            case 0:
                ((View) o20Var).setAlpha(f);
                break;
            case 1:
                ((View) o20Var).setScaleX(f);
                break;
            case 2:
                ((View) o20Var).setScaleY(f);
                break;
            case 3:
                ((View) o20Var).setRotation(f);
                break;
            case 4:
                ((View) o20Var).setRotationX(f);
                break;
            default:
                ((View) o20Var).setRotationY(f);
                break;
        }
    }
}
