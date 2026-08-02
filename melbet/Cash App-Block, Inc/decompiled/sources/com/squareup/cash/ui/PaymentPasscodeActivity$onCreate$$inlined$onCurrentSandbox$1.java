package com.squareup.cash.ui;

import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.util.android.ShareResultReceiver$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.SetupTeardown;
import com.squareup.util.coroutines.Teardown;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes7.dex */
public final class PaymentPasscodeActivity$onCreate$$inlined$onCurrentSandbox$1 implements SetupTeardown {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoroutineScope $scope;
    public final /* synthetic */ SetupTeardown $setupTeardown;

    public /* synthetic */ PaymentPasscodeActivity$onCreate$$inlined$onCurrentSandbox$1(SetupTeardown setupTeardown, ContextScope contextScope, int i) {
        this.$r8$classId = i;
        this.$setupTeardown = setupTeardown;
        this.$scope = contextScope;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        int i = this.$r8$classId;
        CoroutineScope coroutineScope2 = this.$scope;
        SetupTeardown setupTeardown = this.$setupTeardown;
        switch (i) {
            case 0:
                VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) obj;
                coroutineScope.getClass();
                variantSandboxedComponent.getClass();
                coroutineScope2.getClass();
                return ((PaymentPasscodeActivity$$ExternalSyntheticLambda0) setupTeardown).setup(coroutineScope2, variantSandboxedComponent);
            case 1:
                VariantSandboxedComponent variantSandboxedComponent2 = (VariantSandboxedComponent) obj;
                coroutineScope.getClass();
                variantSandboxedComponent2.getClass();
                return ((ShareResultReceiver$$ExternalSyntheticLambda0) setupTeardown).setup((ContextScope) coroutineScope2, variantSandboxedComponent2);
            default:
                VariantSandboxedComponent variantSandboxedComponent3 = (VariantSandboxedComponent) obj;
                coroutineScope.getClass();
                variantSandboxedComponent3.getClass();
                return ((ShareResultReceiver$$ExternalSyntheticLambda0) setupTeardown).setup((ContextScope) coroutineScope2, variantSandboxedComponent3);
        }
    }
}
