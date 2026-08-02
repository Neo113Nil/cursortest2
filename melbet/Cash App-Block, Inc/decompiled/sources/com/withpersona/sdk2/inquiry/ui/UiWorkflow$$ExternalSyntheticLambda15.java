package com.withpersona.sdk2.inquiry.ui;

import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.ui.UiState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiWorkflow$$ExternalSyntheticLambda15 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UiState.Displaying.NfcScan f$0;

    public /* synthetic */ UiWorkflow$$ExternalSyntheticLambda15(UiState.Displaying.NfcScan nfcScan, int i) {
        this.$r8$classId = i;
        this.f$0 = nfcScan;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean areEqual;
        int i = this.$r8$classId;
        UiState.Displaying.NfcScan nfcScan = this.f$0;
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) obj;
        switch (i) {
            case 0:
                governmentIdNfcScanComponent.getClass();
                areEqual = Intrinsics.areEqual(governmentIdNfcScanComponent.name, nfcScan.component.name);
                break;
            default:
                governmentIdNfcScanComponent.getClass();
                areEqual = Intrinsics.areEqual(governmentIdNfcScanComponent.name, nfcScan.component.name);
                break;
        }
        return Boolean.valueOf(areEqual);
    }
}
