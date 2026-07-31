package coil.util;

import coil.size.Size;

/* compiled from: HardwareBitmaps.kt */
/* loaded from: classes15.dex */
final class ImmutableHardwareBitmapService extends HardwareBitmapService {
    private final boolean allowHardware;

    public ImmutableHardwareBitmapService(boolean z) {
        super(null);
        this.allowHardware = z;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareMainThread(Size size) {
        return this.allowHardware;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareWorkerThread() {
        return this.allowHardware;
    }
}
