package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class gl extends Transition.EpicenterCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ gl(int i, Rect rect) {
        this.a = i;
        this.b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i = this.a;
        Rect rect = this.b;
        switch (i) {
            case 0:
                break;
            default:
                if (rect.isEmpty()) {
                }
                break;
        }
        return rect;
    }
}
