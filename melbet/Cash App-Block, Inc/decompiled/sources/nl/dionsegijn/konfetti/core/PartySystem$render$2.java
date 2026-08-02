package nl.dionsegijn.konfetti.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import nl.dionsegijn.konfetti.core.emitter.Confetti;

/* loaded from: classes9.dex */
public final class PartySystem$render$2 extends Lambda implements Function1 {
    public static final PartySystem$render$2 INSTANCE = new PartySystem$render$2(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Confetti confetti = (Confetti) obj;
        confetti.getClass();
        return Boolean.valueOf(confetti.alpha <= 0);
    }
}
