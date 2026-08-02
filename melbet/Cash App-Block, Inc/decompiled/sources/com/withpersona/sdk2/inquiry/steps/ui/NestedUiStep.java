package com.withpersona.sdk2.inquiry.steps.ui;

import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.List;

/* loaded from: classes9.dex */
public interface NestedUiStep extends Parcelable {
    List getComponentConfigs();

    List getComponents();

    StepStyles.UiStepStyle getStyles();
}
