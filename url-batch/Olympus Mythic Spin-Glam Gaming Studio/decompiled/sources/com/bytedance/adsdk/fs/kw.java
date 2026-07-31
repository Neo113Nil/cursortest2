package com.bytedance.adsdk.fs;

/* loaded from: classes13.dex */
public enum kw {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* renamed from: com.bytedance.adsdk.fs.kw$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zmn;

        static {
            int[] iArr = new int[kw.values().length];
            zmn = iArr;
            try {
                iArr[kw.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zmn[kw.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zmn[kw.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean zmn(int i, boolean z, int i2) {
        int i3 = AnonymousClass1.zmn[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
