package com.squareup.scannerview;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final /* synthetic */ class ScannerView$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ScannerView f$0;

    public /* synthetic */ ScannerView$$ExternalSyntheticLambda3(ScannerView scannerView, int i) {
        this.$r8$classId = i;
        this.f$0 = scannerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ScannerView scannerView = this.f$0;
        switch (i) {
            case 0:
                scannerView.cameraOperator.toggleFlash();
                break;
            default:
                scannerView.cameraOperator.toggleFlash();
                break;
        }
        return Unit.INSTANCE;
    }
}
