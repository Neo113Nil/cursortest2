package defpackage;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qo implements TypeEvaluator {
    public final FloatEvaluator a = new FloatEvaluator();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        float floatValue = this.a.evaluate(f, (Number) obj, (Number) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
