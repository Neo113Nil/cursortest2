package coil.util;

import coil.size.Dimension;
import coil.size.Size;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: HardwareBitmaps.kt */
/* loaded from: classes14.dex */
final class LimitedFileDescriptorHardwareBitmapService extends HardwareBitmapService {
    public static final Companion Companion = new Companion(null);

    public LimitedFileDescriptorHardwareBitmapService(Logger logger) {
        super(null);
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareMainThread(Size size) {
        Dimension width = size.getWidth();
        if ((width instanceof Dimension.Pixels ? ((Dimension.Pixels) width).px : Integer.MAX_VALUE) > 100) {
            Dimension height = size.getHeight();
            if ((height instanceof Dimension.Pixels ? ((Dimension.Pixels) height).px : Integer.MAX_VALUE) > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.util.HardwareBitmapService
    public boolean allowHardwareWorkerThread() {
        return FileDescriptorCounter.INSTANCE.hasAvailableFileDescriptors(null);
    }

    /* compiled from: HardwareBitmaps.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
