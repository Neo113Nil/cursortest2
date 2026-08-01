package O0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.playgen.securelock.GeneratorActivity;

/* loaded from: classes.dex */
public final class d extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GeneratorActivity f622a;

    public d(GeneratorActivity generatorActivity) {
        this.f622a = generatorActivity;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        b1.d.e(motionEvent2, "e2");
        if (motionEvent == null) {
            return false;
        }
        if (Math.abs(motionEvent2.getX() - motionEvent.getX()) <= 80.0f && Math.abs(motionEvent2.getY() - motionEvent.getY()) <= 80.0f) {
            return false;
        }
        int i = GeneratorActivity.f1928D;
        this.f622a.v();
        return true;
    }
}
