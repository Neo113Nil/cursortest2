package com.withpersona.sdk2.inquiry.ui;

import com.withpersona.sdk2.inquiry.steps.ui.components.LoadingIndicatorComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiWorkflow$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ UiComponent f$1;

    public /* synthetic */ UiWorkflow$$ExternalSyntheticLambda9(boolean z, UiComponent uiComponent, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = uiComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        UiComponent uiComponent = this.f$1;
        boolean z = this.f$0;
        UiComponent uiComponent2 = (UiComponent) obj;
        switch (i) {
            case 0:
                uiComponent2.getClass();
                if (uiComponent2 instanceof LoadingIndicatorComponent) {
                    ((LoadingIndicatorComponent) uiComponent2).setWasTapped(z ? Intrinsics.areEqual(uiComponent2.getName(), uiComponent.getName()) : true);
                }
                break;
            default:
                uiComponent2.getClass();
                if (uiComponent2 instanceof LoadingIndicatorComponent) {
                    ((LoadingIndicatorComponent) uiComponent2).setWasTapped(z ? Intrinsics.areEqual(uiComponent2.getName(), uiComponent.getName()) : true);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
