package u0;

import android.view.View;
import l2.y;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends t0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3321a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t0.d
    public final float h(y yVar) {
        switch (this.f3321a) {
            case 0:
                return ((View) yVar).getAlpha();
            case 1:
                return ((View) yVar).getScaleX();
            case 2:
                return ((View) yVar).getScaleY();
            case 3:
                return ((View) yVar).getRotation();
            case 4:
                return ((View) yVar).getRotationX();
            default:
                return ((View) yVar).getRotationY();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t0.d
    public final void t(y yVar, float f2) {
        switch (this.f3321a) {
            case 0:
                ((View) yVar).setAlpha(f2);
                break;
            case 1:
                ((View) yVar).setScaleX(f2);
                break;
            case 2:
                ((View) yVar).setScaleY(f2);
                break;
            case 3:
                ((View) yVar).setRotation(f2);
                break;
            case 4:
                ((View) yVar).setRotationX(f2);
                break;
            default:
                ((View) yVar).setRotationY(f2);
                break;
        }
    }
}
