package com.realtek.sdk.media.opus;

import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class OpusCodec {
    public static final a Companion = new a(null);

    public static final class a {
        public a(o oVar) {
        }
    }

    static {
        System.loadLibrary("RtkMediaCodec");
    }

    public static /* synthetic */ byte[] decode$default(OpusCodec opusCodec, byte[] bArr, int i8, boolean z7, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 96000;
        }
        if ((i9 & 4) != 0) {
            z7 = false;
        }
        return opusCodec.decode(bArr, i8, z7);
    }

    public final native int createDecoder(int i8, int i9);

    public final native byte[] decode(byte[] bArr, int i8, boolean z7);

    public final native void destroyDecoder();

    public final native String stringFromJNI();
}
