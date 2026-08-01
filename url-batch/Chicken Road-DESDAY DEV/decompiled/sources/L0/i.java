package L0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.playgen.securelock.GeneratorActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f519b;

    public /* synthetic */ i(int i, Object obj) {
        this.f518a = i;
        this.f519b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object obj = this.f519b;
        switch (this.f518a) {
            case 0:
                l lVar = (l) obj;
                lVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - lVar.f530o;
                    if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                        lVar.f528m = false;
                    }
                    lVar.u();
                    lVar.f528m = true;
                    lVar.f530o = System.currentTimeMillis();
                }
                return false;
            default:
                int i = GeneratorActivity.f1928D;
                ((GestureDetector) obj).onTouchEvent(motionEvent);
                return true;
        }
    }
}
