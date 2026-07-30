package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
class NativeLibHelper implements a {
    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e) {
            Log.e("NativeLibHelper", "Signer Library could not be loaded: " + e.getMessage());
        }
    }

    private native void nOnResume();

    private native byte[] nSign(Context context, Object obj, byte[] bArr, int i);

    public final byte[] PolarVoyageMotionLayoutTransitionHeroVision4068(Context context, Map map, byte[] bArr, int i) {
        return nSign(context, map, bArr, i);
    }

    public final void PolarVoyageZipVortexCelestial6185() {
        nOnResume();
    }
}
