package U2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class c {
    public static final double a(double d4, b sourceUnit, b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long convert = targetUnit.f4137d.convert(1L, sourceUnit.f4137d);
        return convert > 0 ? d4 * convert : d4 / r9.convert(1L, targetUnit.f4137d);
    }
}
