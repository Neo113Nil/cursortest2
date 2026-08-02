package nl.dionsegijn.konfetti.emitters;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import nl.dionsegijn.konfetti.Confetti;

/* loaded from: classes9.dex */
public final class RenderSystem$render$1 extends Lambda implements Function1 {
    public static final RenderSystem$render$1 INSTANCE = new RenderSystem$render$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Confetti confetti = (Confetti) obj;
        confetti.getClass();
        return Boolean.valueOf(confetti.alpha <= 0);
    }
}
