package com.realsil.sdk.core.d;

import com.realsil.sdk.core.bluetooth.scanner.ScannerCallback;
import com.realsil.sdk.core.logger.ZLogger;

/* loaded from: classes4.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f15651a;

    public e(f fVar) {
        this.f15651a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f15651a;
        ScannerCallback scannerCallback = fVar.f15658f;
        if (scannerCallback != null) {
            scannerCallback.onAutoScanTrigger();
        } else {
            ZLogger.v(fVar.f15654b, "no callback registered");
        }
        this.f15651a.startScan();
    }
}
