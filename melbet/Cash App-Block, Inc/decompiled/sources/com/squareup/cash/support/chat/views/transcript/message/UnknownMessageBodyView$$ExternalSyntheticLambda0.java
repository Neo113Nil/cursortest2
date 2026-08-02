package com.squareup.cash.support.chat.views.transcript.message;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class UnknownMessageBodyView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ UnknownMessageBodyView f$0;

    public /* synthetic */ UnknownMessageBodyView$$ExternalSyntheticLambda0(UnknownMessageBodyView unknownMessageBodyView) {
        this.f$0 = unknownMessageBodyView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        UnknownMessageBodyView unknownMessageBodyView = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Function0 function0 = unknownMessageBodyView.onUpdateClick;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(Modifier.Companion.$$INSTANCE, 1.0f, colors.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                    Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    ActionBodyViewKt.UnknownMessageBody(0, gapComposer, ImageKt.m177backgroundbw27NRU(m178borderxT4_qwU, colors2.semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), function0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                unknownMessageBodyView.Content(composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ UnknownMessageBodyView$$ExternalSyntheticLambda0(UnknownMessageBodyView unknownMessageBodyView, int i) {
        this.f$0 = unknownMessageBodyView;
    }
}
