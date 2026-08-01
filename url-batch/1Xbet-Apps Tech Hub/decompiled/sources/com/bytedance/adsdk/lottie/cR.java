package com.bytedance.adsdk.lottie;

/* compiled from: RenderMode.java */
/* loaded from: classes.dex */
public enum cR {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: RenderMode.java */
    /* renamed from: com.bytedance.adsdk.lottie.cR$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pvs;

        static {
            int[] iArr = new int[cR.values().length];
            pvs = iArr;
            try {
                iArr[cR.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pvs[cR.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pvs[cR.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean pvs(int i, boolean z, int i2) {
        int i3 = AnonymousClass1.pvs[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
