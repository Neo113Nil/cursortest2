package androidx.compose.ui.input.pointer.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VelocityTracker.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/input/pointer/util/Vector;", "", "", "length", "<init>", "(I)V", "i", "", "get", "(I)F", "value", "", "set", "(IF)V", "a", "times", "(Landroidx/compose/ui/input/pointer/util/Vector;)F", "norm", "()F", "I", "getLength", "()I", "", "elements", "[Ljava/lang/Float;", "getElements", "()[Ljava/lang/Float;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Vector {
    private final Float[] elements;
    private final int length;

    public Vector(int i) {
        this.length = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.elements = fArr;
    }

    public final float get(int i) {
        return this.elements[i].floatValue();
    }

    public final void set(int i, float value) {
        this.elements[i] = Float.valueOf(value);
    }

    public final float times(Vector a) {
        Intrinsics.checkNotNullParameter(a, "a");
        int i = this.length;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += get(i2) * a.get(i2);
        }
        return f;
    }

    public final float norm() {
        return (float) Math.sqrt(times(this));
    }
}
