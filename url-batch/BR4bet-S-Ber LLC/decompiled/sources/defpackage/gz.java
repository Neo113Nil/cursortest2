package defpackage;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class gz {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[gs.values().length];
        try {
            iArr[gs.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gs.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gs.ON_DESTROY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
