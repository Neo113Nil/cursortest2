package S0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.winworm.neongrid.game.SnakeGameView;

/* loaded from: classes.dex */
public final class h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SnakeGameView f785a;

    public h(SnakeGameView snakeGameView) {
        this.f785a = snakeGameView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        g1.d.e(motionEvent, "event");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        f fVar;
        f fVar2;
        g1.d.e(motionEvent2, "e2");
        if (motionEvent == null) {
            return false;
        }
        float x2 = motionEvent2.getX() - motionEvent.getX();
        float y2 = motionEvent2.getY() - motionEvent.getY();
        float abs = Math.abs(x2);
        float abs2 = Math.abs(y2);
        SnakeGameView snakeGameView = this.f785a;
        if (abs > abs2) {
            if (Math.abs(x2) <= 40.0f || (fVar2 = snakeGameView.i) == null) {
                return true;
            }
            fVar2.d(x2 > RecyclerView.f1559A0 ? a.d : a.f765c);
            return true;
        }
        if (Math.abs(y2) <= 40.0f || (fVar = snakeGameView.i) == null) {
            return true;
        }
        fVar.d(y2 > RecyclerView.f1559A0 ? a.f764b : a.f763a);
        return true;
    }
}
