package nl.dionsegijn.konfetti;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.emitters.RenderSystem;
import nl.dionsegijn.konfetti.emitters.StreamEmitter;
import nl.dionsegijn.konfetti.models.ConfettiConfig;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

/* loaded from: classes6.dex */
public final class ParticleSystem {
    public int[] colors;
    public ConfettiConfig confettiConfig;
    public RenderSystem renderSystem;
    public Shape[] shapes;
    public Size[] sizes;

    public final boolean doneEmitting() {
        RenderSystem renderSystem = this.renderSystem;
        if (renderSystem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("renderSystem");
            throw null;
        }
        ArrayList arrayList = renderSystem.particles;
        StreamEmitter streamEmitter = renderSystem.emitter;
        streamEmitter.getClass();
        if (streamEmitter.elapsedTime < 2000.0f || arrayList.size() != 0) {
            return !renderSystem.enabled && arrayList.size() == 0;
        }
        return true;
    }

    public final long getDelay() {
        this.confettiConfig.getClass();
        return 0L;
    }

    public final RenderSystem getRenderSystem$konfetti_release() {
        RenderSystem renderSystem = this.renderSystem;
        if (renderSystem != null) {
            return renderSystem;
        }
        Intrinsics.throwUninitializedPropertyAccessException("renderSystem");
        throw null;
    }
}
