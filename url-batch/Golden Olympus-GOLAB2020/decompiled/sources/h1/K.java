package h1;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class K {
    public static /* synthetic */ SessionConfiguration a(int i4, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        return new SessionConfiguration(i4, list, executor, stateCallback);
    }
}
