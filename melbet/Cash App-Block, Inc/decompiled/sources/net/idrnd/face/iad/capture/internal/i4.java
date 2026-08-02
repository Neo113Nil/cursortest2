package net.idrnd.face.iad.capture.internal;

import net.idrnd.misnap.iad.PayloadSize;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class i4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PayloadSize.values().length];
        try {
            PayloadSize[] payloadSizeArr = PayloadSize.a;
            iArr[1] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            PayloadSize[] payloadSizeArr2 = PayloadSize.a;
            iArr[0] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
