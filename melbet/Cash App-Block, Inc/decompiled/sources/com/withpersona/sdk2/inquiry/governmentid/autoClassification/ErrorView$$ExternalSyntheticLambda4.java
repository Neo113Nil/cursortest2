package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2ErrorBinding;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ImageStylingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class ErrorView$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Pi2ErrorBinding f$0;
    public final /* synthetic */ LocalImageComponentStyle f$1;

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda4(Pi2ErrorBinding pi2ErrorBinding, LocalImageComponentStyle localImageComponentStyle, int i) {
        this.$r8$classId = i;
        this.f$0 = pi2ErrorBinding;
        this.f$1 = localImageComponentStyle;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Pi2ErrorBinding pi2ErrorBinding = this.f$0;
        switch (i) {
            case 0:
                LocalImageComponentStyle localImageComponentStyle = this.f$1;
                ImageStylingKt.applyStyle(localImageComponentStyle, pi2ErrorBinding.illustration, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                break;
            default:
                LocalImageComponentStyle localImageComponentStyle2 = this.f$1;
                ImageStylingKt.applyStyle(localImageComponentStyle2, pi2ErrorBinding.illustration, new String[]{"#190051"}, new String[]{"#AA84FF"}, new String[0], new String[0]);
                break;
        }
        return Unit.INSTANCE;
    }
}
