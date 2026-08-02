package net.idrnd.face.iad.capture.checker.nativelib;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J$\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002H\u0087 ¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnet/idrnd/face/iad/capture/checker/nativelib/NativeInterface;", "", "", "arguments", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "iad-2.5.1_misnap"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class NativeInterface {
    public static final boolean a;

    static {
        try {
            System.loadLibrary("FaceToolChecker");
            a = true;
        } catch (Throwable unused) {
            a = false;
        }
    }

    public static final native Object call(Object[] arguments);
}
