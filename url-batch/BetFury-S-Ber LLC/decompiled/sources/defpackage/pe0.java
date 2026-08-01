package defpackage;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class pe0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[re0.values().length];
        b = iArr;
        try {
            iArr[re0.ADDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[re0.REMOVING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[re0.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[se0.values().length];
        a = iArr2;
        try {
            iArr2[se0.REMOVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[se0.VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[se0.GONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[se0.INVISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
