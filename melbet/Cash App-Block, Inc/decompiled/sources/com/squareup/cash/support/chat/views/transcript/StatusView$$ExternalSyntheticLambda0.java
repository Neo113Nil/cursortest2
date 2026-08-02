package com.squareup.cash.support.chat.views.transcript;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class StatusView$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatusView f$0;

    public /* synthetic */ StatusView$$ExternalSyntheticLambda0(StatusView statusView) {
        this.$r8$classId = 1;
        this.f$0 = statusView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        StatusView statusView = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = StatusView.$r8$clinit;
                statusView.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = StatusView.$r8$clinit;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    String str = statusView.text;
                    str.getClass();
                    TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, colors.semantic.text.disabled, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int i4 = StatusView.$r8$clinit;
                statusView.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ StatusView$$ExternalSyntheticLambda0(StatusView statusView, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = statusView;
    }
}
