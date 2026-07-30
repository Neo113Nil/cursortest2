package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TabRowDefaults$tabIndicatorOffset$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TabPosition $currentTabPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        super(3);
        this.$currentTabPosition = tabPosition;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    public final Modifier invoke(Modifier modifier, Composer composer, int i) {
        AnimationSpec animationSpec;
        AnimationSpec animationSpec2;
        composer.startReplaceGroup(-1541271084);
        ComposerKt.sourceInformation(composer, "C1266@53909L151,1271@54112L150,1277@54370L53:TabRow.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1541271084, i, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1265)");
        }
        float width = this.$currentTabPosition.getWidth();
        animationSpec = TabRowKt.TabRowIndicatorSpec;
        State<Dp> m121animateDpAsStateAjpBEmI = AnimateAsStateKt.m121animateDpAsStateAjpBEmI(width, animationSpec, null, null, composer, 0, 12);
        float left = this.$currentTabPosition.getLeft();
        animationSpec2 = TabRowKt.TabRowIndicatorSpec;
        final State<Dp> m121animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m121animateDpAsStateAjpBEmI(left, animationSpec2, null, null, composer, 0, 12);
        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null);
        ComposerKt.sourceInformationMarkerStart(composer, -1825077707, "CC(remember):TabRow.kt#9igjgp");
        boolean changed = composer.changed(m121animateDpAsStateAjpBEmI2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function1) new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                    return IntOffset.m6384boximpl(m2254invokeBjo55l4(density));
                }

                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                public final long m2254invokeBjo55l4(Density density) {
                    float invoke$lambda$1;
                    invoke$lambda$1 = TabRowDefaults$tabIndicatorOffset$2.invoke$lambda$1(m121animateDpAsStateAjpBEmI2);
                    return IntOffsetKt.IntOffset(density.mo359roundToPx0680j_4(invoke$lambda$1), 0);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier m723width3ABfNKs = SizeKt.m723width3ABfNKs(OffsetKt.offset(wrapContentSize$default, (Function1) rememberedValue), invoke$lambda$0(m121animateDpAsStateAjpBEmI));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m723width3ABfNKs;
    }

    private static final float invoke$lambda$0(State<Dp> state) {
        return state.getValue().m6279unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(State<Dp> state) {
        return state.getValue().m6279unboximpl();
    }
}
