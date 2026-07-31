package kotlin.time;

import kotlin.jvm.internal.Intrinsics;
import n2.EnumC3267b;

/* loaded from: classes3.dex */
class c {
    public static final double a(double d4, EnumC3267b sourceUnit, EnumC3267b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        long convert = targetUnit.d().convert(1L, sourceUnit.d());
        return convert > 0 ? d4 * convert : d4 / sourceUnit.d().convert(1L, targetUnit.d());
    }

    public static final long b(long j4, EnumC3267b sourceUnit, EnumC3267b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.d().convert(j4, sourceUnit.d());
    }

    public static final long c(long j4, EnumC3267b sourceUnit, EnumC3267b targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.d().convert(j4, sourceUnit.d());
    }
}
