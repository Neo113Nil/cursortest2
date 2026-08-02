package kotlin.reflect.jvm.internal;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class KTypeParameterImplKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Variance.values().length];
        try {
            iArr[Variance.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
