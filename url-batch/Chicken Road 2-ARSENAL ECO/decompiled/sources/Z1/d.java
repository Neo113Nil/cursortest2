package Z1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.IMMEDIATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.APP_STARTUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[b.values().length];
        try {
            iArr2[b.SDK_IDENTITY_VERIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
