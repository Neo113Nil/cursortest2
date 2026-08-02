package com.squareup.scannerview;

import androidx.camera.video.Recorder;
import androidx.media3.common.util.WakeLockManager;
import bo.app.b$$ExternalSyntheticLambda0;
import com.squareup.scannerview.ScannerView;

/* loaded from: classes8.dex */
public final /* synthetic */ class ScannerView$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ ScannerView$$ExternalSyntheticLambda5(int i, Object obj, boolean z, boolean z2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        boolean z = this.f$2;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ScannerView scannerView = (ScannerView) obj;
                OverlayView.setOverlayType$default(scannerView.overlayView, null, null, this.f$1, new b$$ExternalSyntheticLambda0(scannerView, z, 8), 2, null);
                scannerView.flashView.setVisibility(8);
                ScannerView.Callback callback = scannerView.callback;
                callback.getClass();
                callback.onComplete(scannerView.results);
                break;
            default:
                Recorder.AnonymousClass1.access$100((Recorder.AnonymousClass1) ((WakeLockManager) obj).wakeLockManagerInternal, this.f$1, z);
                break;
        }
    }
}
