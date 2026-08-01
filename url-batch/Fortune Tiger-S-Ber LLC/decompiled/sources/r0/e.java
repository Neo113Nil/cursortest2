package r0;

import android.view.View;
import g2.z;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e extends m0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3149a;

    public /* synthetic */ e(int i4) {
        this.f3149a = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m0.a
    public final void A(z zVar, float f4) {
        switch (this.f3149a) {
            case 0:
                ((View) zVar).setAlpha(f4);
                break;
            case 1:
                ((View) zVar).setScaleX(f4);
                break;
            case 2:
                ((View) zVar).setScaleY(f4);
                break;
            case 3:
                ((View) zVar).setRotation(f4);
                break;
            case 4:
                ((View) zVar).setRotationX(f4);
                break;
            default:
                ((View) zVar).setRotationY(f4);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m0.a
    public final float m(z zVar) {
        switch (this.f3149a) {
            case 0:
                return ((View) zVar).getAlpha();
            case 1:
                return ((View) zVar).getScaleX();
            case 2:
                return ((View) zVar).getScaleY();
            case 3:
                return ((View) zVar).getRotation();
            case 4:
                return ((View) zVar).getRotationX();
            default:
                return ((View) zVar).getRotationY();
        }
    }
}
