package com.withpersona.sdk2.inquiry.steps.ui;

/* loaded from: classes9.dex */
public abstract class NestedUiStepKt {
    public static final UiComponentScreen to(NestedUiStep nestedUiStep) {
        nestedUiStep.getClass();
        return new UiComponentScreen(nestedUiStep.getComponents(), nestedUiStep.getComponentConfigs(), nestedUiStep.getStyles());
    }
}
