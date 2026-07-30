package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: TabRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final class TabRowDefaults$tabIndicatorOffset$2 implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TabPosition $currentTabPosition;

    TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        this.$currentTabPosition = tabPosition;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-1541271084);
        ComposerKt.sourceInformation(composer, "C1111@47460L7,1109@47309L177,1116@47688L7,1114@47538L176,1120@47822L53:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1541271084, i, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1108)");
        }
        State<Dp> m163animateDpAsStateAjpBEmI = AnimateAsStateKt.m163animateDpAsStateAjpBEmI(this.$currentTabPosition.getWidth(), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6), null, null, composer, 0, 12);
        final State<Dp> m163animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m163animateDpAsStateAjpBEmI(this.$currentTabPosition.getLeft(), MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6), null, null, composer, 0, 12);
        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer, 602226121, "CC(remember):TabRow.kt#9igjgp");
        boolean changed = composer.changed(m163animateDpAsStateAjpBEmI2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    IntOffset m7641boximpl;
                    State state = State.this;
                    Density density = (Density) obj;
                    m7641boximpl = IntOffset.m7641boximpl(IntOffset.m7644constructorimpl(density.mo401roundToPx0680j_4(TabRowDefaults$tabIndicatorOffset$2.invoke$lambda$1(state)) << 32));
                    return m7641boximpl;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier m871width3ABfNKs = SizeKt.m871width3ABfNKs(OffsetKt.offset(wrapContentSize$default, (Function1) rememberedValue), invoke$lambda$0(m163animateDpAsStateAjpBEmI));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m871width3ABfNKs;
    }

    private static final float invoke$lambda$0(State<Dp> state) {
        return state.getValue().m7536unboximpl();
    }

    private static final float invoke$lambda$1(State<Dp> state) {
        return state.getValue().m7536unboximpl();
    }
}
