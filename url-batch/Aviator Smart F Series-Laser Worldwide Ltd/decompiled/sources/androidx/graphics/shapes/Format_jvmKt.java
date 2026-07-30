package androidx.graphics.shapes;

import java.util.Arrays;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class Format_jvmKt {
    public static final String toStringWithLessPrecision(float f8) {
        String format = String.format("%.3f", Arrays.copyOf(new Object[]{Float.valueOf(f8)}, 1));
        s.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }
}
