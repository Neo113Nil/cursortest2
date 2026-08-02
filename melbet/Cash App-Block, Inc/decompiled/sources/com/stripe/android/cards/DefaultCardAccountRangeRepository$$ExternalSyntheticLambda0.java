package com.stripe.android.cards;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.work.viewmodels.FilterSelectionMode;
import com.squareup.cash.work.viewmodels.ShiftFilterType;
import com.squareup.cash.work.viewmodels.ShiftFilterViewModel;
import com.squareup.cash.work.views.ClockedInStatusDotKt;
import com.squareup.cash.work.views.shift.ShiftListViewKt;
import com.squareup.util.Strings;
import com.squareup.util.cash.Luhn$$ExternalSyntheticLambda0;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.features.common.IconSize;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(IconSize iconSize, String str) {
        this.$r8$classId = 29;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TextStyle m994copyp1EtxEg$default;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 18;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Boolean) obj).booleanValue() || ((Boolean) obj2).booleanValue() || ((Boolean) obj3).booleanValue());
            case 1:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer2, R.string.work_tax_forms_error_retry);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.component.button.standard.text.f165default, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.work_views_clock_in_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.work_views_shift_list_filter_apply), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    ShiftFilterType shiftFilterType = ShiftFilterType.LOCATION;
                    FilterSelectionMode filterSelectionMode = FilterSelectionMode.MULTI;
                    ShiftFilterViewModel shiftFilterViewModel = new ShiftFilterViewModel(CollectionsKt__CollectionsJVMKt.listOf(new ShiftFilterViewModel.Section("Location", CollectionsKt__CollectionsKt.listOf((Object[]) new ShiftFilterViewModel.Option[]{new ShiftFilterViewModel.Option("loc_mission", "Mission St", false), new ShiftFilterViewModel.Option("loc_market", "Market St", false)}))));
                    Object rememberedValue = gapComposer5.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new StripePaymentController$$ExternalSyntheticLambda1(i2);
                        gapComposer5.updateRememberedValue(rememberedValue);
                    }
                    ShiftListViewKt.ShiftListFilterSheet(shiftFilterViewModel, (Function1) rememberedValue, SpacerKt.padding(companion, paddingValues), gapComposer5, 48);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.work_views_shift_note_delete_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.work_views_cancel), (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer8, 0);
                    int hashCode = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer8, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Strings.getSizes(gapComposer8).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), 88.0f, 28.0f);
                    long j = Strings.getColors(gapComposer8).semantic.background.subtle;
                    Strings.getSizes(gapComposer8).getClass();
                    Object obj4 = DefaultSizes.border.entries;
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN4, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), gapComposer8, 0);
                    Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(companion, 12.0f, gapComposer8, companion, 1.0f);
                    Strings.getSizes(gapComposer8).getClass();
                    Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.m300paddingVpY3zN4$default(m, 16.0f, RecyclerView.DECELERATION_RATE, 2), 450.0f, RecyclerView.DECELERATION_RATE, 2);
                    long j2 = Strings.getColors(gapComposer8).semantic.background.subtle;
                    Strings.getSizes(gapComposer8).getClass();
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(m279heightInVpY3zN4$default, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), gapComposer8, 0);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, R.string.work_views_shift_section_find_shifts), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.Add16, (String) null, (Modifier) null, 0L, gapComposer10, 54, 12);
                    String stringResource2 = Room.stringResource(gapComposer10, R.string.work_views_shift_section_clock_in_unscheduled);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                    TextStyle textStyle = (TextStyle) gapComposer10.consume(dynamicProvidableCompositionLocal);
                    m994copyp1EtxEg$default = textStyle != null ? TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.None, null, null, 0, 0L, null, null, 0, 16773119) : null;
                    if (m994copyp1EtxEg$default == null) {
                        gapComposer10.startReplaceGroup(-145922619);
                        TextStyle textStyle2 = (TextStyle) gapComposer10.consume(dynamicProvidableCompositionLocal);
                        if (textStyle2 == null) {
                            gapComposer10.startReplaceGroup(-1100573765);
                            textStyle2 = ((Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        } else {
                            gapComposer10.startReplaceGroup(-1100574912);
                        }
                        gapComposer10.end(false);
                        m994copyp1EtxEg$default = textStyle2;
                    } else {
                        gapComposer10.startReplaceGroup(-145925595);
                    }
                    gapComposer10.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer10, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.Add16, (String) null, (Modifier) null, 0L, gapComposer11, 54, 12);
                    String stringResource3 = Room.stringResource(gapComposer11, R.string.work_views_shift_section_clock_in_unscheduled);
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ArcadeThemeKt.LocalTextStyle;
                    TextStyle textStyle3 = (TextStyle) gapComposer11.consume(dynamicProvidableCompositionLocal2);
                    m994copyp1EtxEg$default = textStyle3 != null ? TextStyle.m994copyp1EtxEg$default(textStyle3, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.None, null, null, 0, 0L, null, null, 0, 16773119) : null;
                    if (m994copyp1EtxEg$default == null) {
                        gapComposer11.startReplaceGroup(-422673791);
                        TextStyle textStyle4 = (TextStyle) gapComposer11.consume(dynamicProvidableCompositionLocal2);
                        if (textStyle4 == null) {
                            gapComposer11.startReplaceGroup(-1100573765);
                            textStyle4 = ((Typography) gapComposer11.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        } else {
                            gapComposer11.startReplaceGroup(-1100574912);
                        }
                        gapComposer11.end(false);
                        m994copyp1EtxEg$default = textStyle4;
                    } else {
                        gapComposer11.startReplaceGroup(-422676767);
                    }
                    gapComposer11.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer11, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, stringResource3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    ClockedInStatusDotKt.ClockedInStatusDot(null, gapComposer12, 0);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.work_views_shift_section_clocked_in_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ClockedInStatusDotKt.OnBreakStatusDot(48, 1, gapComposer13, null, true);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.work_views_clock_in_overlay_status_on_break), (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.work_views_shift_section_details_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.work_webview_button_try_again), (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.work_webview_button_back_to_work), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.work_webview_button_back_to_work), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Brush brush = (Brush) obj;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                brush.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer18).changed(brush) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(1 & intValue18, (intValue18 & 19) != 18)) {
                    BoxKt.Box(ImageKt.background$default(ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 72.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), brush, null, 6), gapComposer18, 0);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((PaddingValues) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    AccountLoadError accountLoadError = new AccountLoadError(true, true, new FinancialConnectionsInstitution(false, "3", false, "Random Institution", null, null, null, "Random Institution url"), new APIException(0, 31, null, null, null, null));
                    Object rememberedValue2 = gapComposer19.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new Luhn$$ExternalSyntheticLambda0(20);
                        gapComposer19.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function0 = (Function0) rememberedValue2;
                    Object rememberedValue3 = gapComposer19.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new Luhn$$ExternalSyntheticLambda0(21);
                        gapComposer19.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function02 = (Function0) rememberedValue3;
                    Object rememberedValue4 = gapComposer19.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new Luhn$$ExternalSyntheticLambda0(22);
                        gapComposer19.updateRememberedValue(rememberedValue4);
                    }
                    ListItemKt.NoAccountsAvailableErrorContent(accountLoadError, function0, function02, (Function0) rememberedValue4, gapComposer19, 3504);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer20 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, composer20, 48);
                GapComposer gapComposer20 = (GapComposer) composer20;
                int hashCode2 = Long.hashCode(gapComposer20.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer20.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer20, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer21.startReusableNode();
                if (gapComposer21.inserting) {
                    gapComposer21.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer21.useNode();
                }
                Updater.m576setimpl(composer20, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer20, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m574initimpl(composer20, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer20, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer20, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                ListItemKt.LoadingPill(null, composer20, 0);
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                SpacerKt.Spacer(composer20, OffsetKt.windowInsetsBottomHeight(Arrangement$End$1.current(composer20).navigationBars));
                gapComposer21.end(true);
                return Unit.INSTANCE;
            case 21:
                Brush brush2 = (Brush) obj;
                Composer composer21 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                brush2.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer21).changed(brush2) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(1 & intValue20, (intValue20 & 19) != 18)) {
                    BoxKt.Box(ImageKt.background$default(ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 72.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), brush2, null, 6), gapComposer22, 0);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Brush brush3 = (Brush) obj;
                Composer composer22 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                brush3.getClass();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((GapComposer) composer22).changed(brush3) ? 4 : 2;
                }
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(1 & intValue21, (intValue21 & 19) != 18)) {
                    BoxKt.Box(ImageKt.background$default(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 100.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), brush3, null, 6), gapComposer23, 0);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer23 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((PaddingValues) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer23;
                if (gapComposer24.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer24, 6);
                    int hashCode3 = Long.hashCode(gapComposer24.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer24.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer24, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer24.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer24.startReusableNode();
                    if (gapComposer24.inserting) {
                        gapComposer24.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer24.useNode();
                    }
                    Updater.m576setimpl(gapComposer24, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer24, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer24, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer24, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer24, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    ListItemKt.LoadingShimmerEffect(ListItemKt.f798lambda$1477221777, gapComposer24, 6);
                    ListItemKt.LoadingShimmerEffect(ListItemKt.lambda$347978968, gapComposer24, 6);
                    SpacerKt.Spacer(gapComposer24, new LayoutWeightElement(1.0f, true));
                    ListItemKt.LoadingPillContainer(6, 2, gapComposer24, null, true);
                    gapComposer24.end(true);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer24 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((PaddingValues) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer24;
                if (gapComposer25.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    ListItemKt.FullScreenGenericLoading(gapComposer25, 0);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Brush brush4 = (Brush) obj;
                Composer composer25 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                brush4.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer25).changed(brush4) ? 4 : 2;
                }
                GapComposer gapComposer26 = (GapComposer) composer25;
                if (gapComposer26.shouldExecute(1 & intValue24, (intValue24 & 19) != 18)) {
                    BoxKt.Box(ImageKt.background$default(ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 72.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), brush4, null, 6), gapComposer26, 0);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Brush brush5 = (Brush) obj;
                Composer composer26 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                brush5.getClass();
                if ((intValue25 & 6) == 0) {
                    intValue25 |= ((GapComposer) composer26).changed(brush5) ? 4 : 2;
                }
                GapComposer gapComposer27 = (GapComposer) composer26;
                if (gapComposer27.shouldExecute(1 & intValue25, (intValue25 & 19) != 18)) {
                    BoxKt.Box(ImageKt.background$default(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 100.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), brush5, null, 6), gapComposer27, 0);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer27 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((PaddingValues) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer27;
                if (gapComposer28.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer28, 6);
                    int hashCode4 = Long.hashCode(gapComposer28.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer28.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer28, m298padding3ABfNKs2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer28.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer28.startReusableNode();
                    if (gapComposer28.inserting) {
                        gapComposer28.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer28.useNode();
                    }
                    Updater.m576setimpl(gapComposer28, columnMeasurePolicy4, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer28, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer28, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer28, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer28, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    ListItemKt.LoadingShimmerEffect(ListItemKt.f802lambda$983776976, gapComposer28, 6);
                    ListItemKt.LoadingShimmerEffect(ListItemKt.lambda$1704498329, gapComposer28, 6);
                    gapComposer28.end(true);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer28 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer28;
                if (!gapComposer29.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer29 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((BoxWithConstraintsScopeImpl) obj).getClass();
                GapComposer gapComposer30 = (GapComposer) composer29;
                if (gapComposer30.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    gapComposer30.startReplaceGroup(977493074);
                    gapComposer30.end(false);
                } else {
                    gapComposer30.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }
}
