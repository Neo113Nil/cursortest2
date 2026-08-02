package com.withpersona.sdk2.inquiry.steps.ui.components;

/* loaded from: classes9.dex */
public interface ButtonComponent extends AutoSubmitableComponent, DisableableComponent, HideableComponent, LoadingIndicatorComponent {
    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.AutoSubmitableComponent
    String getAutoSubmitCountdownText();

    Integer getAutoSubmitIntervalSeconds();

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    String getName();

    boolean getWasTapped();

    void setWasTapped(boolean z);
}
