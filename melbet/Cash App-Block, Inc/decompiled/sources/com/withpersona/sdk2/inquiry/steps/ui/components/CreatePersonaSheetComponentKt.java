package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class CreatePersonaSheetComponentKt {
    public static final CreatePersonaSheetComponent updateComponent(CreatePersonaSheetComponent createPersonaSheetComponent, UiComponent uiComponent, UiComponent uiComponent2) {
        createPersonaSheetComponent.getClass();
        uiComponent.getClass();
        uiComponent2.getClass();
        UiComponentScreen uiComponentScreen = createPersonaSheetComponent.screen;
        List list = uiComponentScreen.components;
        ArrayList updateComponent = list != null ? UiComponentKt.updateComponent(list, uiComponent, uiComponent2) : null;
        List list2 = uiComponentScreen.componentConfigs;
        StepStyles.UiStepStyle uiStepStyle = uiComponentScreen.styles;
        list2.getClass();
        return CreatePersonaSheetComponent.copy$default(createPersonaSheetComponent, new UiComponentScreen(updateComponent, list2, uiStepStyle), 127);
    }
}
