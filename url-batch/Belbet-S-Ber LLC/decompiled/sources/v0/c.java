package v0;

import android.view.View;
import o2.z;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends r1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3699a;

    public /* synthetic */ c(int i) {
        this.f3699a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r1.b
    public final void B(z zVar, float f5) {
        switch (this.f3699a) {
            case 0:
                ((View) zVar).setAlpha(f5);
                break;
            case 1:
                ((View) zVar).setScaleX(f5);
                break;
            case 2:
                ((View) zVar).setScaleY(f5);
                break;
            case 3:
                ((View) zVar).setRotation(f5);
                break;
            case 4:
                ((View) zVar).setRotationX(f5);
                break;
            default:
                ((View) zVar).setRotationY(f5);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r1.b
    public final float m(z zVar) {
        switch (this.f3699a) {
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
