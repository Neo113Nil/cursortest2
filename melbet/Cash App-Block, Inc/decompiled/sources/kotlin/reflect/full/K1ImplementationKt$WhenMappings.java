package kotlin.reflect.full;

import kotlin.reflect.KVariance;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class K1ImplementationKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[KVariance.values().length];
        try {
            KVariance kVariance = KVariance.INVARIANT;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            KVariance kVariance2 = KVariance.INVARIANT;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            KVariance kVariance3 = KVariance.INVARIANT;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
