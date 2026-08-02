package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class KmEffect {
    public final ArrayList constructorArguments;

    public KmEffect(KmEffectType kmEffectType, KmEffectInvocationKind kmEffectInvocationKind) {
        kmEffectType.getClass();
        this.constructorArguments = new ArrayList(1);
    }

    public final List<KmEffectExpression> getConstructorArguments() {
        return this.constructorArguments;
    }

    public final void setConclusion(KmEffectExpression kmEffectExpression) {
    }
}
