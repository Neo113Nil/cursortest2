package kotlinx.coroutines.internal;

import kotlin.Result;

/* loaded from: classes5.dex */
public abstract class n {
    private static final boolean ANDROID_DETECTED = false;

    static {
        Object m348constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(y5.g.createFailure(th));
        }
        Result.m355isSuccessimpl(m348constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }
}
