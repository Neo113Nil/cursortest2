package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes8.dex */
public final /* synthetic */ class ManualEntryViewModel$form$6 extends AdaptedFunctionReference implements Function4 {
    public static final ManualEntryViewModel$form$6 INSTANCE = new ManualEntryViewModel$form$6(4, ManualEntryFormState.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 4);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        FinancialConnectionsSessionManifest.Pane pane = ManualEntryViewModel.PANE;
        return new ManualEntryFormState((String) obj, (String) obj2, (String) obj3);
    }
}
