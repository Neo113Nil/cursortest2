package defpackage;

import com.trembin.nirefon.betfury.data.Priority;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class l2 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Priority.values().length];
        try {
            iArr[Priority.LOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Priority.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Priority.HIGH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Priority.URGENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
