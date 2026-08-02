package com.withpersona.sdk2.inquiry.steps.ui.components;

import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import java.util.List;

/* loaded from: classes9.dex */
public interface InputSelectBoxComponent {
    boolean getCanSelectMultipleValues();

    String getLabel();

    List getOptions();

    List getSelectedOptions();

    InputSelectBoxComponentStyle getStyles();
}
