package y2;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.gb;

/* loaded from: classes.dex */
final class n implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ s f23423f;

    n(s sVar) {
        this.f23423f = sVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        gb gbVar;
        gb gbVar2;
        gbVar = this.f23423f.f23439m;
        if (gbVar == null) {
            return false;
        }
        gbVar2 = this.f23423f.f23439m;
        gbVar2.d(motionEvent);
        return false;
    }
}
