package com.squareup.cash.wallet.views;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.RealToastIconScope;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.StyledCardViewKt;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.work.views.pay.PayCellViewKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class Hero3DCardViewKt$$ExternalSyntheticLambda11 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Hero3DCardViewKt$$ExternalSyntheticLambda11(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object tween$default;
        int i = this.$r8$classId;
        Object obj4 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 16;
        switch (i) {
            case 0:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                Constraints constraints = (Constraints) obj3;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(constraints.value);
                long j = constraints.value;
                int m1025getMaxWidthimpl = (int) (Constraints.m1025getMaxWidthimpl(j) * 1.31f);
                int i3 = mo833measureBRTryo0.width;
                int i4 = m1025getMaxWidthimpl < i3 ? i3 : m1025getMaxWidthimpl;
                return MeasureScope.layout$default(measureScope, Constraints.m1025getMaxWidthimpl(j), mo833measureBRTryo0.height, new Hero3DCardViewKt$$ExternalSyntheticLambda13(i4, constraints, measureScope, measurable.mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(constraints.value, i4, i4, 0, 0, 12))));
            case 1:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, UtilsKt.f749lambda$617451479, (Composer) obj2, 3072, 6);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, UtilsKt.f746lambda$159782257, (Composer) obj2, 3072, 6);
                return Unit.INSTANCE;
            case 3:
                CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) obj;
                ((Integer) obj3).getClass();
                heroCardDetails.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                CardRegistry cardRegistry = (CardRegistry) gapComposer.consume(CardTransitionKt.LocalCardRegistry);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == obj4) {
                    String str = heroCardDetails.cashtag;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    CardSchemeViewModel.Module.CustomizationImage customizationImage = heroCardDetails.customizationImage;
                    rememberedValue = new StyledCardViewModel(str2, customizationImage == null, heroCardDetails.cardTheme, false, null, customizationImage != null ? customizationImage.bytes : null, false, null, null, null, null, null, null, 64984);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                StyledCardViewModel styledCardViewModel = (StyledCardViewModel) rememberedValue;
                boolean changedInstance = gapComposer.changedInstance(cardRegistry);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == obj4) {
                    rememberedValue2 = new CardAppletTileKt$$ExternalSyntheticLambda31(cardRegistry, 6);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                StyledCardViewKt.m3439StyledCardnSlTg7c(styledCardViewModel, null, (Function1) rememberedValue2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false, gapComposer, 0, 58);
                return Unit.INSTANCE;
            case 4:
                String str3 = (String) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(str3) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(intValue & 14, 30, gapComposer2, str3);
                    BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
                    Modifier m687graphicsLayer_6ThJ44$default = ColorKt.m687graphicsLayer_6ThJ44$default(SizeKt.fillMaxSize(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, 458751);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == obj4) {
                        rememberedValue3 = new CardAppletTile$$ExternalSyntheticLambda0(i2);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    ImageKt.Image(m1446rememberAsyncImagePainter19ie5dc, null, ClipKt.drawWithContent(m687graphicsLayer_6ThJ44$default, (Function1) rememberedValue3), biasAlignment, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer2, 27696, 96);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Transition.Segment segment = (Transition.Segment) obj;
                ((Integer) obj3).getClass();
                segment.getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                gapComposer3.startReplaceGroup(-182716955);
                if (segment.isTransitioningTo(EnterExitState.Visible, EnterExitState.PostExit)) {
                    gapComposer3.startReplaceGroup(502669455);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (rememberedValue4 == obj4) {
                        rememberedValue4 = new CardAppletTile$$ExternalSyntheticLambda0(22);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    tween$default = AnimatableKt.keyframes((Function1) rememberedValue4);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(502678462);
                    gapComposer3.end(false);
                    tween$default = AnimatableKt.tween$default(0, 0, null, 6);
                }
                gapComposer3.end(false);
                return tween$default;
            case 6:
                MeasureScope measureScope2 = (MeasureScope) obj;
                Measurable measurable2 = (Measurable) obj2;
                measureScope2.getClass();
                measurable2.getClass();
                Placeable mo833measureBRTryo02 = measurable2.mo833measureBRTryo0(((Constraints) obj3).value);
                return MeasureScope.layout$default(measureScope2, mo833measureBRTryo02.width, 0, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo02, 20));
            case 7:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue2 = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer4 = (GapComposer) ((Composer) obj2);
                gapComposer4.startReplaceGroup(-1160537996);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, null, gapComposer4, intValue2 & 14, 1);
                gapComposer4.end(false);
                return rememberAsyncImagePainter;
            case 8:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue3 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj2);
                gapComposer5.startReplaceGroup(946370478);
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, null, gapComposer5, intValue3 & 14, 1);
                gapComposer5.end(false);
                return rememberAsyncImagePainter2;
            case 9:
                Composer composer2 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer2;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.work_views_merchant_picker_update), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer3 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer3;
                if (gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.work_views_save), (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer4 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer4;
                if (gapComposer8.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.work_views_save), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer5 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer5;
                if (!gapComposer9.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer6 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer6;
                if (!gapComposer10.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer7 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer7;
                if (gapComposer11.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.work_views_auto_clock_out_dialog_ok), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer8 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer8;
                if (gapComposer12.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer12, null);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                RealToastIconScope realToastIconScope = (RealToastIconScope) obj;
                Composer composer9 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                realToastIconScope.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer9).changed(realToastIconScope) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer9;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    realToastIconScope.Icon(Icons.CheckFill24, null, gapComposer13, ((intValue11 << 9) & 7168) | 390);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer10 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((ScrollingScaffoldContentScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer10;
                if (gapComposer14.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer14, R.string.work_views_clock_out_confirmation_title), (Modifier) null, (String) null, (Function0) null, Room.stringResource(gapComposer14, R.string.work_views_clock_out_confirmation_body), gapComposer14, 0, 14);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer11 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer11;
                if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.work_views_clock_out_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer12 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer12;
                if (gapComposer16.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.work_views_take_break_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer13 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer13;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.work_shift_not_started_got_it), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer14 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer14;
                if (gapComposer18.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.work_views_cancel), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer15 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer15;
                if (gapComposer19.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer19, null);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer16 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer16;
                if (gapComposer20.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ((DefaultSizes) gapComposer20.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 32.0f, 1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer20.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer20.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer20, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer20.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer20.startReusableNode();
                    if (gapComposer20.inserting) {
                        gapComposer20.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer20.useNode();
                    }
                    Updater.m576setimpl(gapComposer20, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer20, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer20, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer20, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer20, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer20, null);
                    gapComposer20.end(true);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer17 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer17;
                if (gapComposer21.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer21, null);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer18 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer18;
                if (gapComposer22.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer22, R.string.work_pay_home_error_retry);
                    Colors colors = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                    } else {
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.component.button.standard.text.f165default, (Composer) gapComposer22, (Modifier) null, ((Typography) gapComposer22.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer19 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer19;
                if (gapComposer23.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    String stringResource2 = Room.stringResource(gapComposer23, R.string.work_pay_home_error_retry);
                    Colors colors2 = (Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.component.button.standard.text.f165default, (Composer) gapComposer23, (Modifier) null, ((Typography) gapComposer23.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer20 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer20;
                if (gapComposer24.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer24, 0);
                    int hashCode2 = Long.hashCode(gapComposer24.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer24.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer24, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer24.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer24.startReusableNode();
                    if (gapComposer24.inserting) {
                        gapComposer24.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer24.useNode();
                    }
                    Updater.m576setimpl(gapComposer24, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer24, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer24, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer24, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer24, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    PayCellViewKt.m3809SkeletonBlocki1RSzL4(88.0f, 28.0f, gapComposer24, 54);
                    SpacerKt.Spacer(gapComposer24, SizeKt.m277height3ABfNKs(companion, 24.0f));
                    PayCellViewKt.m3809SkeletonBlocki1RSzL4(150.0f, 40.0f, gapComposer24, 54);
                    ((DefaultSizes) gapComposer24.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 4.0f, gapComposer24);
                    PayCellViewKt.m3809SkeletonBlocki1RSzL4(115.0f, 20.0f, gapComposer24, 54);
                    gapComposer24.end(true);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer21 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer21;
                if (!gapComposer25.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer22 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer22;
                if (gapComposer26.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer26.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer26.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer26, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer26.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer26.startReusableNode();
                    if (gapComposer26.inserting) {
                        gapComposer26.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer26.useNode();
                    }
                    Updater.m576setimpl(gapComposer26, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer26, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer26, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer26, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer26, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer26, null);
                    gapComposer26.end(true);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
