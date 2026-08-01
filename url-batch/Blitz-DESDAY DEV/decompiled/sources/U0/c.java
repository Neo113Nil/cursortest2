package U0;

import android.view.Choreographer;
import com.winfour.neondrop.game.ConnectFourView;

/* loaded from: classes.dex */
public final class c implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectFourView f863a;

    public c(ConnectFourView connectFourView) {
        this.f863a = connectFourView;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        b bVar;
        long currentTimeMillis = System.currentTimeMillis();
        ConnectFourView connectFourView = this.f863a;
        if (connectFourView.f2096r < 1.0f) {
            float f2 = (currentTimeMillis - connectFourView.f2098t) / connectFourView.f2097s;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            connectFourView.f2096r = f2;
            if (f2 >= 1.0f && (bVar = connectFourView.f2088j) != null) {
                bVar.b();
            }
        } else if (!connectFourView.f2090l.isEmpty()) {
            connectFourView.f2099u = (connectFourView.f2099u + 0.04f) % 1.0f;
        }
        connectFourView.invalidate();
        if (connectFourView.f2096r < 1.0f || !connectFourView.f2090l.isEmpty()) {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
