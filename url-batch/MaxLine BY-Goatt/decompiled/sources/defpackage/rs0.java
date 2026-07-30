package defpackage;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rs0 extends Transition.EpicenterCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ rs0(int i, Rect rect) {
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
