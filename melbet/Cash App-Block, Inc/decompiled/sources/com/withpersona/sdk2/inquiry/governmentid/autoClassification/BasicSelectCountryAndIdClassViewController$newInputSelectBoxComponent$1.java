package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class BasicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1 implements InputSelectBoxComponent {
    public final /* synthetic */ ArrayList $options;
    public final /* synthetic */ List $selectedOptions;
    public final /* synthetic */ InputSelectComponentStyle $style;

    public BasicSelectCountryAndIdClassViewController$newInputSelectBoxComponent$1(InputSelectComponentStyle inputSelectComponentStyle, ArrayList arrayList, List list) {
        this.$style = inputSelectComponentStyle;
        this.$options = arrayList;
        this.$selectedOptions = list;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
    public final boolean getCanSelectMultipleValues() {
        return false;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
    public final String getLabel() {
        return null;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
    public final List getOptions() {
        return this.$options;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
    public final List getSelectedOptions() {
        return this.$selectedOptions;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
    public final InputSelectBoxComponentStyle getStyles() {
        return this.$style;
    }
}
