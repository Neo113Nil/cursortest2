package nl.dionsegijn.konfetti;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import nl.dionsegijn.konfetti.listeners.OnParticleSystemUpdateListener;
import okhttp3.ConnectionPool;

/* loaded from: classes3.dex */
public class KonfettiView extends View {
    public OnParticleSystemUpdateListener onParticleSystemUpdateListener;
    public final ArrayList systems;
    public final TimerIntegration timer;

    public final class TimerIntegration {
        public long previousTime = -1;
    }

    public KonfettiView(Context context) {
        super(context);
        this.systems = new ArrayList();
        this.timer = new TimerIntegration();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        TimerIntegration timerIntegration = this.timer;
        if (timerIntegration.previousTime == -1) {
            timerIntegration.previousTime = System.nanoTime();
        }
        timerIntegration.previousTime = System.nanoTime();
        float f = ((r1 - timerIntegration.previousTime) / 1000000.0f) / 1000.0f;
        ArrayList arrayList = this.systems;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ParticleSystem particleSystem = (ParticleSystem) arrayList.get(size);
            long currentTimeMillis = System.currentTimeMillis() - particleSystem.getRenderSystem$konfetti_release().getCreatedAt();
            particleSystem.getDelay();
            if (currentTimeMillis >= 0) {
                particleSystem.getRenderSystem$konfetti_release().render(canvas, f);
            }
            if (particleSystem.doneEmitting()) {
                arrayList.remove(size);
                OnParticleSystemUpdateListener onParticleSystemUpdateListener = this.onParticleSystemUpdateListener;
                if (onParticleSystemUpdateListener != null) {
                    ((KonfettiView) ((ConnectionPool) onParticleSystemUpdateListener).delegate).setVisibility(arrayList.size() == 0 ? 4 : 0);
                }
            }
        }
        if (arrayList.size() != 0) {
            invalidate();
        } else {
            timerIntegration.previousTime = -1L;
        }
    }

    public final void setOnParticleSystemUpdateListener(OnParticleSystemUpdateListener onParticleSystemUpdateListener) {
        this.onParticleSystemUpdateListener = onParticleSystemUpdateListener;
    }

    public KonfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.systems = new ArrayList();
        this.timer = new TimerIntegration();
    }

    public KonfettiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.systems = new ArrayList();
        this.timer = new TimerIntegration();
    }
}
