package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class KmEffectExpression {
    public int flags;
    public final ArrayList andArguments = new ArrayList(0);
    public final ArrayList orArguments = new ArrayList(0);

    public final List<KmEffectExpression> getAndArguments() {
        return this.andArguments;
    }

    public final int getFlags$kotlin_metadata() {
        return this.flags;
    }

    public final List<KmEffectExpression> getOrArguments() {
        return this.orArguments;
    }

    public final void setConstantValue(KmConstantValue kmConstantValue) {
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setInstanceType(KmType kmType) {
    }

    public final void setParameterIndex(Integer num) {
    }
}
