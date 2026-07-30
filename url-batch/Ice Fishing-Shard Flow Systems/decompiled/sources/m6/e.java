package m6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class e {
    public static final long a(long j, d sourceUnit, d targetUnit) {
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.f6597d.convert(j, sourceUnit.f6597d);
    }
}
