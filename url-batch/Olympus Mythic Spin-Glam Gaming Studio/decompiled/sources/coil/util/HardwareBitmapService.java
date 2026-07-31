package coil.util;

import coil.size.Size;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HardwareBitmaps.kt */
/* loaded from: classes14.dex */
public abstract class HardwareBitmapService {
    public /* synthetic */ HardwareBitmapService(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean allowHardwareMainThread(Size size);

    public abstract boolean allowHardwareWorkerThread();

    private HardwareBitmapService() {
    }
}
