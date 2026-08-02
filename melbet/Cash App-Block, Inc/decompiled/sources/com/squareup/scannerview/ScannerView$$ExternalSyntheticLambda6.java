package com.squareup.scannerview;

import androidx.camera.video.Recorder;
import androidx.media3.common.util.WakeLockManager;
import bo.app.g6$$ExternalSyntheticLambda11;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final /* synthetic */ class ScannerView$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ ScannerView$$ExternalSyntheticLambda6(Object obj, Object obj2, boolean z, boolean z2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
        this.f$3 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        boolean z = this.f$3;
        boolean z2 = this.f$2;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ScannerView scannerView = (ScannerView) obj2;
                Step step = (Step) obj;
                scannerView.overlayView.setOverlayType(step.overlayType, null, z2, new g6$$ExternalSyntheticLambda11(scannerView, step, z, 16));
                break;
            default:
                ((AtomicBoolean) obj).set(false);
                Recorder.AnonymousClass1.access$100((Recorder.AnonymousClass1) ((WakeLockManager) obj2).wakeLockManagerInternal, z2, z);
                break;
        }
    }
}
