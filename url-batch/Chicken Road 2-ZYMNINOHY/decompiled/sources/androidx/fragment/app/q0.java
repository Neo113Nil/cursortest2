package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class q0 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f4955b;

    public /* synthetic */ q0(int i4, Rect rect) {
        this.f4954a = i4;
        this.f4955b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f4954a) {
            case 0:
                return this.f4955b;
            default:
                Rect rect = this.f4955b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
