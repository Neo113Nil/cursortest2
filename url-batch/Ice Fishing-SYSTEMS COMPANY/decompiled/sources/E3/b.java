package E3;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class b implements View.OnTouchListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f812n;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f812n) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
