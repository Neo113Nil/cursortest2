package kotlin.ranges;

import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class h {
    public static final void a(boolean z4, Number step) {
        Intrinsics.checkNotNullParameter(step, "step");
        if (z4) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + JwtParser.SEPARATOR_CHAR);
    }

    public static l2.b b(float f4, float f5) {
        return new c(f4, f5);
    }
}
