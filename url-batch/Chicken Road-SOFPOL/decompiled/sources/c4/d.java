package c4;

import a4.i;
import android.view.View;
import w5.y;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d extends s6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1623g;

    public /* synthetic */ d(int i) {
        this.f1623g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s6.a
    public final void G(y yVar, float f6) {
        switch (this.f1623g) {
            case 0:
                ((View) yVar).setAlpha(f6);
                break;
            case 1:
                ((View) yVar).setScaleX(f6);
                break;
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                ((View) yVar).setScaleY(f6);
                break;
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                ((View) yVar).setRotation(f6);
                break;
            case i.LONG_FIELD_NUMBER /* 4 */:
                ((View) yVar).setRotationX(f6);
                break;
            default:
                ((View) yVar).setRotationY(f6);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s6.a
    public final float v(y yVar) {
        switch (this.f1623g) {
            case 0:
                return ((View) yVar).getAlpha();
            case 1:
                return ((View) yVar).getScaleX();
            case i.FLOAT_FIELD_NUMBER /* 2 */:
                return ((View) yVar).getScaleY();
            case i.INTEGER_FIELD_NUMBER /* 3 */:
                return ((View) yVar).getRotation();
            case i.LONG_FIELD_NUMBER /* 4 */:
                return ((View) yVar).getRotationX();
            default:
                return ((View) yVar).getRotationY();
        }
    }
}
