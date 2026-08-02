package com.squareup.cash.tax.applet.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda11;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda38;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileModel;
import com.squareup.cash.bitcoin.applets.views.BitcoinAppletTile$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.db.RewardSlotQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.applets.viewmodels.BorrowAppletTileModel;
import com.squareup.cash.borrow.applets.views.BorrowAppletTile$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.applets.views.BorrowAppletTile$$ExternalSyntheticLambda10;
import com.squareup.cash.borrow.applets.views.BorrowAppletTile$WhenMappings;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.CircleSegment;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.applets.viewmodels.StocksAppletTileModel;
import com.squareup.cash.investing.applets.views.StocksAppletTile$$ExternalSyntheticLambda2;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.money.core.ids.AppletTileInstallationSectionId;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.InstalledServiceAppletTileContentModel;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel;
import com.squareup.cash.paychecks.applets.views.PaychecksAppletTile$$ExternalSyntheticLambda3;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.NoteRequiredViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileModel;
import com.squareup.cash.phoneplans.applets.views.PhonePlansAppletTile$$ExternalSyntheticLambda10;
import com.squareup.cash.phoneplans.applets.views.PhonePlansAppletTile$$ExternalSyntheticLambda2;
import com.squareup.cash.phoneplans.applets.views.PhonePlansAppletTile$$ExternalSyntheticLambda7;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.viewmodels.TaxesAppletTileModel;
import com.squareup.cash.tax.viewmodels.TaxesIconType;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$stateFlowOf$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final class TaxesAppletTile implements AppletTile {
    public final /* synthetic */ int $r8$classId = 5;
    public final StateFlow installationSectionId;
    public final DerivedStateFlow installationState;
    public final StateFlow models;
    public final Function onClick;

    public TaxesAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, short s) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationState = StateFlowKt.mapState(stateFlow, new OffersStyledTextKt$$ExternalSyntheticLambda0(27));
        this.installationSectionId = StateFlowKt.mapState(stateFlow, new OffersStyledTextKt$$ExternalSyntheticLambda0(28));
    }

    /* renamed from: AllocationChart-ziNgDLE, reason: not valid java name */
    public void m3763AllocationChartziNgDLE(ArrayList arrayList, float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1386059380);
        int i2 = i | (gapComposer.changedInstance(arrayList) ? 4 : 2) | (gapComposer.changed(f) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, f);
            gapComposer.startReplaceGroup(-563196957);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Color color = (Color) pair.first;
                float floatValue = ((Number) pair.second).floatValue();
                androidx.compose.ui.graphics.Color forTheme = ThemablesKt.forTheme(color, gapComposer);
                CircleSegment circleSegment = forTheme != null ? new CircleSegment(forTheme.value, floatValue) : null;
                if (circleSegment != null) {
                    arrayList2.add(circleSegment);
                }
            }
            gapComposer.end(false);
            VisibleKt.SegmentedCircle(arrayList2, new SegmentedCircleConfig(new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(4.0f, gapComposer)), null, new SegmentedCircleConfig.SizingConfig.Fixed(DensityUtilsKt.m3477toPx8Feqmps(1.0f, gapComposer)), null, 0L, 0L, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BACKGROUND_COLOR), m285size3ABfNKs, null, gapComposer, 0, 8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda38(this, arrayList, f, i, 5);
        }
    }

    /* renamed from: Graphic-rAjV9yQ, reason: not valid java name */
    public void m3764GraphicrAjV9yQ(BorrowAppletTileModel.Visual.Graphic graphic, float f, boolean z, Composer composer, int i) {
        TaxesAppletTile taxesAppletTile;
        Icons icons;
        long j;
        androidx.compose.ui.graphics.Color m;
        long j2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1522458684);
        int i2 = (gapComposer.changedInstance(graphic) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16);
        if ((i & 3072) == 0) {
            taxesAppletTile = this;
            i2 |= gapComposer.changedInstance(taxesAppletTile) ? 2048 : 1024;
        } else {
            taxesAppletTile = this;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon icon = graphic.foregroundIcon;
            boolean z2 = icon == BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.EXCLAMATION;
            if (z) {
                int i3 = icon == null ? -1 : BorrowAppletTile$WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        icons = Icons.Alert24;
                    } else if (i3 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                }
                icons = Icons.Borrow24;
            } else {
                int i4 = icon == null ? -1 : BorrowAppletTile$WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
                if (i4 != -1) {
                    if (i4 == 1) {
                        icons = Icons.Alert16;
                    } else if (i4 != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                }
                icons = Icons.Borrow16;
            }
            Icons icons2 = icons;
            if (z && z2) {
                gapComposer.startReplaceGroup(-711601508);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j3 = colors.semantic.background.warning;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j3, icons2, colors2.semantic.icon.inverse, f, gapComposer, (i2 << 6) & 7168, 0);
                gapComposer.end(false);
            } else if (!z || z2) {
                gapComposer.startReplaceGroup(-711150272);
                androidx.compose.ui.graphics.Color forTheme = ThemablesKt.forTheme(graphic.primaryColor, gapComposer);
                if (forTheme == null) {
                    gapComposer.startReplaceGroup(1501083439);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors3.semantic.icon.extraSubtle;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1501081331);
                    gapComposer.end(false);
                    j = forTheme.value;
                }
                Color color = graphic.foregroundColor;
                if (color == null) {
                    gapComposer.startReplaceGroup(-710984237);
                    gapComposer.end(false);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1501085678, color, gapComposer, false);
                }
                if (m == null) {
                    gapComposer.startReplaceGroup(1501087179);
                    Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j2 = colors4.semantic.icon.inverse;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1501084947);
                    gapComposer.end(false);
                    j2 = m.value;
                }
                SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j, icons2, j2, f, gapComposer, (i2 << 6) & 7168, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-711334660);
                Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons2, colors5.semantic.background.brand, f, gapComposer, (i2 << 3) & 896, 0);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda11(taxesAppletTile, graphic, f, z, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void InstalledUI(BorrowAppletTileModel.Installed installed, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        Pair pair;
        ComposableLambdaImpl composableLambdaImpl;
        String str;
        boolean z;
        boolean z2;
        final int i2;
        ComposableLambdaImpl composableLambdaImpl2;
        ComposableLambdaImpl composableLambdaImpl3;
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1138019888);
        int i3 = i | (gapComposer.changedInstance(installed) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        boolean z3 = false;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ComposableLambdaImpl composableLambdaImpl4 = null;
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(installed.title, null, null, 14);
            boolean z4 = appletTileAppearance.useRedesignedTiles;
            if (z4) {
                gapComposer.startReplaceGroup(-2129369728);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                pair = new Pair(new InstalledServiceAppletTileLayoutConfig(16.0f, RecyclerView.DECELERATION_RATE, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, InstalledServiceAppletTileLayoutConfig.VisualPosition.END, Alignment.Companion.Bottom), new Dp(64.0f));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2129006625);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Pair pair2 = new Pair(new InstalledServiceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 24), new Dp(28.0f));
                gapComposer.end(false);
                pair = pair2;
            }
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) pair.first;
            final float f = ((Dp) pair.second).value;
            BorrowAppletTileModel.Visual visual = installed.sharedVisual;
            ArrayList<BorrowAppletTileModel.Installed.Row> arrayList = installed.rows;
            gapComposer.startReplaceGroup(-1204897212);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (BorrowAppletTileModel.Installed.Row row : arrayList) {
                BorrowAppletTileModel.Installed.Row.Text text = row.text;
                if (text == null || (str = text.emphasis) == null) {
                    str = "";
                }
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    z = z4;
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    z = z4;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                InstalledServiceAppletTileContentModel.Emphasis emphasis = new InstalledServiceAppletTileContentModel.Emphasis(str, colors.semantic.text.standard, null);
                BorrowAppletTileModel.Installed.Row.Text text2 = row.text;
                String str3 = (text2 == null || (str2 = text2.brief) == null) ? "" : str2;
                if (z) {
                    gapComposer.startReplaceGroup(1788681535);
                    z2 = false;
                    gapComposer.end(false);
                    composableLambdaImpl3 = null;
                    i2 = 1;
                } else {
                    z2 = false;
                    Object[] objArr = 0;
                    gapComposer.startReplaceGroup(1788741210);
                    final BorrowAppletTileModel.Visual visual2 = row.visual;
                    if (visual2 instanceof BorrowAppletTileModel.Visual.Allocations) {
                        gapComposer.startReplaceGroup(1788825871);
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        composableLambdaImpl2 = Expect_jvmKt.rememberComposableLambda(566047945, new Function3(this) { // from class: com.squareup.cash.borrow.applets.views.BorrowAppletTile$$ExternalSyntheticLambda4
                            public final /* synthetic */ TaxesAppletTile f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i4 = objArr2;
                                BorrowAppletTileModel.Visual visual3 = visual2;
                                RowScope rowScope = (RowScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                switch (i4) {
                                    case 0:
                                        rowScope.getClass();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                            this.f$0.m3763AllocationChartziNgDLE(((BorrowAppletTileModel.Visual.Allocations) visual3).values, f, gapComposer2, 0);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        rowScope.getClass();
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                            this.f$0.m3764GraphicrAjV9yQ((BorrowAppletTileModel.Visual.Graphic) visual3, f, false, gapComposer3, MLKEMEngine.KyberPolyBytes);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer);
                        gapComposer.end(false);
                        i2 = 1;
                    } else if (visual2 instanceof BorrowAppletTileModel.Visual.Graphic) {
                        gapComposer.startReplaceGroup(1788960969);
                        i2 = 1;
                        composableLambdaImpl2 = Expect_jvmKt.rememberComposableLambda(910088242, new Function3(this) { // from class: com.squareup.cash.borrow.applets.views.BorrowAppletTile$$ExternalSyntheticLambda4
                            public final /* synthetic */ TaxesAppletTile f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i4 = i2;
                                BorrowAppletTileModel.Visual visual3 = visual2;
                                RowScope rowScope = (RowScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                switch (i4) {
                                    case 0:
                                        rowScope.getClass();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                            this.f$0.m3763AllocationChartziNgDLE(((BorrowAppletTileModel.Visual.Allocations) visual3).values, f, gapComposer2, 0);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        rowScope.getClass();
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                            this.f$0.m3764GraphicrAjV9yQ((BorrowAppletTileModel.Visual.Graphic) visual3, f, false, gapComposer3, MLKEMEngine.KyberPolyBytes);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer);
                        gapComposer.end(false);
                    } else {
                        i2 = 1;
                        if (visual2 != null) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1327771992, false);
                        }
                        gapComposer.startReplaceGroup(1789064632);
                        gapComposer.end(false);
                        composableLambdaImpl2 = null;
                    }
                    gapComposer.end(false);
                    composableLambdaImpl3 = composableLambdaImpl2;
                }
                arrayList2.add(new InstalledServiceAppletTileContentModel(emphasis, str3, null, composableLambdaImpl3, 4));
                z3 = z2;
                composableLambdaImpl4 = null;
                z4 = z;
            }
            boolean z5 = z4;
            boolean z6 = z3;
            ComposableLambdaImpl composableLambdaImpl5 = composableLambdaImpl4;
            gapComposer.end(z6);
            TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1 = (TaxesAppletViewsModule$$ExternalSyntheticLambda1) this.onClick;
            if (!z5 || visual == null) {
                gapComposer.startReplaceGroup(1722022616);
                gapComposer.end(z6);
                composableLambdaImpl = composableLambdaImpl5;
            } else {
                gapComposer.startReplaceGroup(1721950510);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1232658463, new BorrowAppletTile$$ExternalSyntheticLambda1(this, visual, f), gapComposer);
                gapComposer.end(z6);
                composableLambdaImpl = rememberComposableLambda;
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, arrayList2, taxesAppletViewsModule$$ExternalSyntheticLambda1, false, null, installedServiceAppletTileLayoutConfig, composableLambdaImpl, gapComposer, 0, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(this, installed, appletTileAppearance, i, 12);
        }
    }

    public void InstalledUILegacy(PhonePlansAppletTileModel.Installed installed, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1104293342);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(installed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(installed.title, null, null, 14);
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(new InstalledServiceAppletTileContentModel(null, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(installed.content), Expect_jvmKt.rememberComposableLambda(-731896173, new PoolListSectionKt$$ExternalSyntheticLambda2(installed, 14), gapComposer), 3));
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PhonePlansAppletTile$$ExternalSyntheticLambda7(this, 1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, listOf, (Function0) rememberedValue, false, null, null, null, gapComposer, 64, 120);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhonePlansAppletTile$$ExternalSyntheticLambda10(this, installed, i, 1);
        }
    }

    public void InstalledUIRedesign(PhonePlansAppletTileModel.Installed installed, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(357730758);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(installed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(installed.title, null, null, 14);
            gapComposer.startReplaceGroup(181880683);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            createListBuilder.add(new InstalledServiceAppletTileContentModel(null, null, new InstalledServiceAppletTileContentModel.BriefState.Loaded(installed.content), null, 11));
            String str = installed.detail;
            if (str == null) {
                gapComposer.startReplaceGroup(-106010224);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-106010223);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                createListBuilder.add(new InstalledServiceAppletTileContentModel(new InstalledServiceAppletTileContentModel.Emphasis(str, colors.semantic.text.warning, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall), null, null, null, 14));
                gapComposer.end(false);
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            gapComposer.end(false);
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PhonePlansAppletTile$$ExternalSyntheticLambda7(this, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, build, (Function0) rememberedValue, false, null, new InstalledServiceAppletTileLayoutConfig(16.0f, RecyclerView.DECELERATION_RATE, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, InstalledServiceAppletTileLayoutConfig.VisualPosition.END, Alignment.Companion.Bottom), Expect_jvmKt.rememberComposableLambda(818321980, new PdfPreviewViewKt$$ExternalSyntheticLambda2(installed, 12), gapComposer), gapComposer, 1572864, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PhonePlansAppletTile$$ExternalSyntheticLambda10(this, installed, i, 0);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void PromotedUI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        RecomposeScopeImpl recomposeScopeImpl;
        TaxesAppletTile$$ExternalSyntheticLambda2 taxesAppletTile$$ExternalSyntheticLambda2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        StateFlow stateFlow = this.models;
        appletTileAppearance.getClass();
        switch (i8) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(1979794363);
                if ((i & 6) == 0) {
                    i2 = i | (gapComposer.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= gapComposer.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    TaxesAppletTileModel taxesAppletTileModel = (TaxesAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer, 1).getValue();
                    TaxesAppletTileModel.Uninstalled uninstalled = taxesAppletTileModel instanceof TaxesAppletTileModel.Uninstalled ? (TaxesAppletTileModel.Uninstalled) taxesAppletTileModel : null;
                    boolean z = (uninstalled != null && uninstalled.showPromotedUI) || ((uninstalled != null ? uninstalled.promotedModel : null) != null);
                    if (uninstalled == null || !z) {
                        gapComposer.startReplaceGroup(1563325790);
                        UI(appletTileAppearance, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        gapComposer.end(false);
                        recomposeScopeImpl = gapComposer.endRestartGroup();
                        if (recomposeScopeImpl != null) {
                            taxesAppletTile$$ExternalSyntheticLambda2 = new TaxesAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 1);
                            recomposeScopeImpl.block = taxesAppletTile$$ExternalSyntheticLambda2;
                            break;
                        }
                    } else {
                        gapComposer.startReplaceGroup(1563365191);
                        gapComposer.end(false);
                        PromotedAppletTileViewModel.Loaded loaded = uninstalled.promotedModel;
                        if (loaded == null) {
                            gapComposer.startReplaceGroup(-88112838);
                            loaded = new PromotedAppletTileViewModel.Loaded(Room.stringResource(gapComposer, R.string.taxes_applet_tile_title), Room.stringResource(gapComposer, R.string.taxes_applet_tile_promoted_subtitle), 2131233368, null);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-88115008);
                            gapComposer.end(false);
                        }
                        boolean changedInstance = gapComposer.changedInstance(this);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new RealSandboxer$$ExternalSyntheticLambda0(this, 29);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        SharedUIKt.PromotedAppletTile(loaded, (Function1) rememberedValue, null, gapComposer, 0);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                recomposeScopeImpl = gapComposer.endRestartGroup();
                if (recomposeScopeImpl != null) {
                    taxesAppletTile$$ExternalSyntheticLambda2 = new TaxesAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 2);
                    recomposeScopeImpl.block = taxesAppletTile$$ExternalSyntheticLambda2;
                }
                break;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-466573861);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer2.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    MutableState collectAsState = Updater.collectAsState(stateFlow, null, gapComposer2, 1);
                    BitcoinAppletTileModel bitcoinAppletTileModel = (BitcoinAppletTileModel) collectAsState.getValue();
                    BitcoinAppletTileModel.Uninstalled uninstalled2 = bitcoinAppletTileModel instanceof BitcoinAppletTileModel.Uninstalled ? (BitcoinAppletTileModel.Uninstalled) bitcoinAppletTileModel : null;
                    PromotedAppletTileViewModel.Loaded loaded2 = uninstalled2 != null ? uninstalled2.promotedTileModel : null;
                    if (loaded2 != null) {
                        gapComposer2.startReplaceGroup(-1187520205);
                        boolean changedInstance2 = gapComposer2.changedInstance(this);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new BadgeQueries$$ExternalSyntheticLambda5(this, 10);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        SharedUIKt.PromotedAppletTile(loaded2, (Function1) rememberedValue2, null, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1187309436);
                        UI((BitcoinAppletTileModel) collectAsState.getValue(), appletTileAppearance, gapComposer2, (i3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new BitcoinAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 0);
                    break;
                }
                break;
            case 2:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(1665128760);
                if ((i & 6) == 0) {
                    i4 = i | (gapComposer3.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    BorrowAppletTileModel borrowAppletTileModel = (BorrowAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer3, 1).getValue();
                    BorrowAppletTileModel.Uninstalled uninstalled3 = borrowAppletTileModel instanceof BorrowAppletTileModel.Uninstalled ? (BorrowAppletTileModel.Uninstalled) borrowAppletTileModel : null;
                    PromotedAppletTileViewModel.Loaded loaded3 = uninstalled3 != null ? uninstalled3.promotedModel : null;
                    if (loaded3 != null) {
                        gapComposer3.startReplaceGroup(-1021166854);
                        boolean changedInstance3 = gapComposer3.changedInstance(this);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new RewardSlotQueries$$ExternalSyntheticLambda0(this, 16);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        SharedUIKt.PromotedAppletTile(loaded3, (Function1) rememberedValue3, null, gapComposer3, 0);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-1020960146);
                        UI(appletTileAppearance, gapComposer3, i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer3.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new BorrowAppletTile$$ExternalSyntheticLambda10(this, appletTileAppearance, i, 0);
                    break;
                }
                break;
            case 3:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startRestartGroup(1022864720);
                if ((i & 6) == 0) {
                    i5 = i | (gapComposer4.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= gapComposer4.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer4.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
                    StocksAppletTileModel stocksAppletTileModel = (StocksAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer4, 1).getValue();
                    StocksAppletTileModel.Uninstalled uninstalled4 = stocksAppletTileModel instanceof StocksAppletTileModel.Uninstalled ? (StocksAppletTileModel.Uninstalled) stocksAppletTileModel : null;
                    PromotedAppletTileViewModel promotedAppletTileViewModel = uninstalled4 != null ? uninstalled4.promotedTileViewModel : null;
                    if (promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded) {
                        gapComposer4.startReplaceGroup(-629803918);
                        PromotedAppletTileViewModel.Loaded loaded4 = (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel;
                        boolean changedInstance4 = gapComposer4.changedInstance(this);
                        Object rememberedValue4 = gapComposer4.rememberedValue();
                        if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new GpsConfigQueries$$ExternalSyntheticLambda2(this, 15);
                            gapComposer4.updateRememberedValue(rememberedValue4);
                        }
                        SharedUIKt.PromotedAppletTile(loaded4, (Function1) rememberedValue4, null, gapComposer4, 0);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-629581834);
                        UI(appletTileAppearance, gapComposer4, i5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer4.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new StocksAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 0);
                    break;
                }
                break;
            case 4:
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startRestartGroup(1389368880);
                if ((i & 6) == 0) {
                    i6 = i | (gapComposer5.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i6 = i;
                }
                if ((i & 48) == 0) {
                    i6 |= gapComposer5.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer5.shouldExecute(i6 & 1, (i6 & 19) != 18)) {
                    MutableState collectAsState2 = Updater.collectAsState(stateFlow, null, gapComposer5, 1);
                    PaychecksAppletTileModel paychecksAppletTileModel = (PaychecksAppletTileModel) collectAsState2.getValue();
                    PaychecksAppletTileModel.Uninstalled uninstalled5 = paychecksAppletTileModel instanceof PaychecksAppletTileModel.Uninstalled ? (PaychecksAppletTileModel.Uninstalled) paychecksAppletTileModel : null;
                    PromotedAppletTileViewModel.Loaded loaded5 = uninstalled5 != null ? uninstalled5.promotedModel : null;
                    if (loaded5 != null) {
                        gapComposer5.startReplaceGroup(88673534);
                        boolean changedInstance5 = gapComposer5.changedInstance(this);
                        Object rememberedValue5 = gapComposer5.rememberedValue();
                        if (changedInstance5 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new UtilsKt$$ExternalSyntheticLambda0(this, 2);
                            gapComposer5.updateRememberedValue(rememberedValue5);
                        }
                        SharedUIKt.PromotedAppletTile(loaded5, (Function1) rememberedValue5, null, gapComposer5, 0);
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(88884737);
                        JvmActuals_jvmKt.UI((PaychecksAppletTileModel) collectAsState2.getValue(), appletTileAppearance, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) this.onClick, gapComposer5, (i6 << 3) & 112);
                        gapComposer5.end(false);
                    }
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup4 = gapComposer5.endRestartGroup();
                if (endRestartGroup4 != null) {
                    endRestartGroup4.block = new PaychecksAppletTile$$ExternalSyntheticLambda3(this, appletTileAppearance, i, 0);
                    break;
                }
                break;
            default:
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startRestartGroup(804866481);
                if ((i & 6) == 0) {
                    i7 = i | (gapComposer6.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i7 = i;
                }
                if ((i & 48) == 0) {
                    i7 |= gapComposer6.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer6.shouldExecute(i7 & 1, (i7 & 19) != 18)) {
                    PhonePlansAppletTileModel phonePlansAppletTileModel = (PhonePlansAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer6, 1).getValue();
                    PhonePlansAppletTileModel.Uninstalled uninstalled6 = phonePlansAppletTileModel instanceof PhonePlansAppletTileModel.Uninstalled ? (PhonePlansAppletTileModel.Uninstalled) phonePlansAppletTileModel : null;
                    PromotedAppletTileViewModel.Loaded loaded6 = uninstalled6 != null ? uninstalled6.promotedModel : null;
                    if (loaded6 != null) {
                        gapComposer6.startReplaceGroup(-1024887166);
                        boolean changedInstance6 = gapComposer6.changedInstance(this);
                        Object rememberedValue6 = gapComposer6.rememberedValue();
                        if (changedInstance6 || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new UtilsKt$$ExternalSyntheticLambda0(this, 20);
                            gapComposer6.updateRememberedValue(rememberedValue6);
                        }
                        SharedUIKt.PromotedAppletTile(loaded6, (Function1) rememberedValue6, null, gapComposer6, 0);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(-1024681016);
                        UI(appletTileAppearance, gapComposer6, i7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                        gapComposer6.end(false);
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup5 = gapComposer6.endRestartGroup();
                if (endRestartGroup5 != null) {
                    endRestartGroup5.block = new PhonePlansAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 0);
                    break;
                }
                break;
        }
    }

    /* renamed from: RenderSharedVisual-ziNgDLE, reason: not valid java name */
    public void m3765RenderSharedVisualziNgDLE(BorrowAppletTileModel.Visual visual, float f, Composer composer, int i) {
        TaxesAppletTile taxesAppletTile;
        float f2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1267279843);
        int i2 = (gapComposer.changedInstance(visual) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            taxesAppletTile = this;
            f2 = f;
            gapComposer.skipToGroupEnd();
        } else if (visual instanceof BorrowAppletTileModel.Visual.Allocations) {
            gapComposer.startReplaceGroup(771433663);
            m3763AllocationChartziNgDLE(((BorrowAppletTileModel.Visual.Allocations) visual).values, f, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
            gapComposer.end(false);
            taxesAppletTile = this;
            f2 = f;
        } else {
            if (!(visual instanceof BorrowAppletTileModel.Visual.Graphic)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1914779892, false);
            }
            gapComposer.startReplaceGroup(771547898);
            taxesAppletTile = this;
            f2 = f;
            taxesAppletTile.m3764GraphicrAjV9yQ((BorrowAppletTileModel.Visual.Graphic) visual, f2, true, gapComposer, (i2 & 14) | MLKEMEngine.KyberPolyBytes | (i2 & 112) | ((i2 << 3) & 7168));
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BorrowAppletTile$$ExternalSyntheticLambda1(taxesAppletTile, visual, f2, i);
        }
    }

    /* renamed from: TaxesIcon-6a0pyJM, reason: not valid java name */
    public void m3766TaxesIcon6a0pyJM(final boolean z, final TaxesIconType taxesIconType, final float f, final boolean z2, Composer composer, final int i) {
        GapComposer gapComposer;
        Icons icons;
        long j;
        long j2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1922706499);
        int i2 = i | (gapComposer2.changed(z) ? 4 : 2) | (gapComposer2.changedInstance(taxesIconType) ? 32 : 16) | (gapComposer2.changed(f) ? 256 : 128) | (gapComposer2.changed(z2) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            if (taxesIconType.equals(TaxesIconType.Standard.INSTANCE)) {
                icons = z2 ? Icons.Taxes24 : Icons.Taxes16;
            } else {
                if (!taxesIconType.equals(TaxesIconType.Alert.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                icons = z2 ? Icons.Alert24 : Icons.Alert16;
            }
            Icons icons2 = icons;
            if (z2 && !z) {
                gapComposer2.startReplaceGroup(-1664975006);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                gapComposer = gapComposer2;
                SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons2, colors.semantic.service.taxes, f, gapComposer, i2 & 896, 0);
                gapComposer.end(false);
            } else if (z2 && z) {
                gapComposer2.startReplaceGroup(-1664762625);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                long j3 = colors2.semantic.background.warning;
                Colors colors3 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j3, icons2, colors3.semantic.icon.inverse, f, gapComposer2, (i2 << 3) & 7168, 0);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1664496211);
                if (z) {
                    gapComposer2.startReplaceGroup(-884973117);
                    Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j = colors4.semantic.background.subtle;
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-884971198);
                    Colors colors5 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j = colors5.semantic.service.taxes;
                    gapComposer2.end(false);
                }
                if (z) {
                    gapComposer2.startReplaceGroup(-884967196);
                    Colors colors6 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j2 = colors6.semantic.icon.warning;
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-884965340);
                    Colors colors7 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j2 = colors7.semantic.icon.inverse;
                    gapComposer2.end(false);
                }
                SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j, icons2, j2, f, gapComposer2, (i2 << 3) & 7168, 0);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(z, taxesIconType, f, z2, i) { // from class: com.squareup.cash.tax.applet.views.TaxesAppletTile$$ExternalSyntheticLambda0
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ TaxesIconType f$2;
                public final /* synthetic */ float f$3;
                public final /* synthetic */ boolean f$4;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    TaxesAppletTile.this.m3766TaxesIcon6a0pyJM(this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final void UI(AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.$r8$classId;
        StateFlow stateFlow = this.models;
        appletTileAppearance.getClass();
        switch (i8) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-2021109249);
                if ((i & 6) == 0) {
                    i2 = i | (gapComposer.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= gapComposer.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    UI((TaxesAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer, 1).getValue(), appletTileAppearance, gapComposer, (i2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new TaxesAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 0);
                    return;
                }
                return;
            case 1:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-2110036969);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer2.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    UI((BitcoinAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer2, 1).getValue(), appletTileAppearance, gapComposer2, (i3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new BitcoinAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 1);
                    return;
                }
                return;
            case 2:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(-1746131844);
                if ((i & 6) == 0) {
                    i4 = i | (gapComposer3.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    UI((BorrowAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer3, 1).getValue(), appletTileAppearance, gapComposer3, (i4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new BorrowAppletTile$$ExternalSyntheticLambda10(this, appletTileAppearance, i, 1);
                    return;
                }
                return;
            case 3:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startRestartGroup(-620598388);
                if ((i & 6) == 0) {
                    i5 = i | (gapComposer4.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= gapComposer4.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer4.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
                    SharedUIKt.AppletTileRow(null, Expect_jvmKt.rememberComposableLambda(-1348878442, new PoolToastKt$$ExternalSyntheticLambda0(6, this, appletTileAppearance, Updater.collectAsState(stateFlow, null, gapComposer4, 1)), gapComposer4), gapComposer4, 48, 1);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup4 = gapComposer4.endRestartGroup();
                if (endRestartGroup4 != null) {
                    endRestartGroup4.block = new StocksAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 1);
                    return;
                }
                return;
            case 4:
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startRestartGroup(122304364);
                if ((i & 6) == 0) {
                    i6 = i | (gapComposer5.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i6 = i;
                }
                if ((i & 48) == 0) {
                    i6 |= gapComposer5.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer5.shouldExecute(i6 & 1, (i6 & 19) != 18)) {
                    JvmActuals_jvmKt.UI((PaychecksAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer5, 1).getValue(), appletTileAppearance, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) this.onClick, gapComposer5, (i6 << 3) & 112);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup5 = gapComposer5.endRestartGroup();
                if (endRestartGroup5 != null) {
                    endRestartGroup5.block = new PaychecksAppletTile$$ExternalSyntheticLambda3(this, appletTileAppearance, i, 1);
                    return;
                }
                return;
            default:
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startRestartGroup(-2141532427);
                if ((i & 6) == 0) {
                    i7 = i | (gapComposer6.changed(appletTileAppearance) ? 4 : 2);
                } else {
                    i7 = i;
                }
                if ((i & 48) == 0) {
                    i7 |= gapComposer6.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer6.shouldExecute(i7 & 1, (i7 & 19) != 18)) {
                    PhonePlansAppletTileModel phonePlansAppletTileModel = (PhonePlansAppletTileModel) Updater.collectAsState(stateFlow, null, gapComposer6, 1).getValue();
                    if (phonePlansAppletTileModel instanceof PhonePlansAppletTileModel.Loading) {
                        gapComposer6.startReplaceGroup(-723323175);
                        gapComposer6.end(false);
                    } else if (phonePlansAppletTileModel instanceof PhonePlansAppletTileModel.Uninstalled) {
                        gapComposer6.startReplaceGroup(-723322221);
                        UninstalledUI((PhonePlansAppletTileModel.Uninstalled) phonePlansAppletTileModel, gapComposer6, i7 & 112);
                        gapComposer6.end(false);
                    } else {
                        if (!(phonePlansAppletTileModel instanceof PhonePlansAppletTileModel.Installed)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer6, -723324557, false);
                        }
                        gapComposer6.startReplaceGroup(-723320502);
                        InstalledUI((PhonePlansAppletTileModel.Installed) phonePlansAppletTileModel, appletTileAppearance, gapComposer6, (i7 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                        gapComposer6.end(false);
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup6 = gapComposer6.endRestartGroup();
                if (endRestartGroup6 != null) {
                    endRestartGroup6.block = new PhonePlansAppletTile$$ExternalSyntheticLambda2(this, appletTileAppearance, i, 1);
                    return;
                }
                return;
        }
    }

    public void UninstalledUI(PhonePlansAppletTileModel.Uninstalled uninstalled, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-744482301);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        int i3 = 18;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SharedUIKt.AppletTileRow(null, Expect_jvmKt.rememberComposableLambda(-1579369543, new ProfileKt$$ExternalSyntheticLambda1(i3, uninstalled, this), gapComposer), gapComposer, 48, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(this, uninstalled, i, 12);
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationSectionId() {
        switch (this.$r8$classId) {
            case 0:
                return (StateFlowKt$stateFlowOf$1) this.installationSectionId;
            case 1:
                return (StateFlowKt$stateFlowOf$1) this.installationSectionId;
            case 2:
                return (StateFlowKt$stateFlowOf$1) this.installationSectionId;
            case 3:
                return (StateFlowKt$stateFlowOf$1) this.installationSectionId;
            case 4:
                return this.installationState;
            default:
                return (StateFlowKt$stateFlowOf$1) this.installationSectionId;
        }
    }

    @Override // com.squareup.cash.money.applets.viewmodels.AppletTile
    public final StateFlow getInstallationState() {
        switch (this.$r8$classId) {
            case 0:
                return this.installationState;
            case 1:
                return this.installationState;
            case 2:
                return this.installationState;
            case 3:
                return this.installationState;
            case 4:
                return (DerivedStateFlow) this.installationSectionId;
            default:
                return this.installationState;
        }
    }

    public TaxesAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, char c) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = StateFlowKt.mapState(stateFlow, new RewardQueries$$ExternalSyntheticLambda4(25));
    }

    public TaxesAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = StateFlowKt.mapState(stateFlow, new TabToolbarsKt$$ExternalSyntheticLambda28(28));
    }

    public TaxesAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, byte b) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.BALANCE);
        this.installationState = StateFlowKt.mapState(stateFlow, new BenefitsHubViewKt$$ExternalSyntheticLambda2(17));
    }

    public TaxesAppletTile(StateFlow stateFlow, TaxesAppletViewsModule$$ExternalSyntheticLambda1 taxesAppletViewsModule$$ExternalSyntheticLambda1, int i) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = taxesAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.BALANCE);
        this.installationState = StateFlowKt.mapState(stateFlow, new ActivityItemLayout$$ExternalSyntheticLambda4(25));
    }

    public TaxesAppletTile(StateFlow stateFlow, ScoreAppletViewsModule$$ExternalSyntheticLambda1 scoreAppletViewsModule$$ExternalSyntheticLambda1) {
        stateFlow.getClass();
        this.models = stateFlow;
        this.onClick = scoreAppletViewsModule$$ExternalSyntheticLambda1;
        this.installationSectionId = new StateFlowKt$stateFlowOf$1(AppletTileInstallationSectionId.SERVICE);
        this.installationState = StateFlowKt.mapState(stateFlow, new PoolDetailsViewKt$$ExternalSyntheticLambda3(24));
    }

    public void UninstalledUI(BorrowAppletTileModel.Uninstalled uninstalled, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2096043146);
        int i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(this) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = uninstalled.title;
            String str2 = uninstalled.secondaryText;
            if (str2 == null) {
                str2 = "";
            }
            SharedUIKt.AppletTileRowUninstalledContent(2131231141, 0, gapComposer, str, str2, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) this.onClick);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda2(this, uninstalled, i, 27);
        }
    }

    public void UninstalledUI(TaxesAppletTileModel.Uninstalled uninstalled, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1699472525);
        int i2 = (gapComposer.changedInstance(uninstalled) ? 4 : 2) | i | (gapComposer.changedInstance(this) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SharedUIKt.AppletTileRowUninstalledContent(2131233615, 0, gapComposer, Room.stringResource(gapComposer, R.string.taxes_applet_tile_title), uninstalled.subtitle, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) this.onClick);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxTooltipView$$ExternalSyntheticLambda0(this, uninstalled, i, 25);
        }
    }

    public void InstalledUI(PhonePlansAppletTileModel.Installed installed, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(678198857);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(installed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (appletTileAppearance.useRedesignedTiles) {
                gapComposer.startReplaceGroup(696098121);
                InstalledUIRedesign(installed, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(696151627);
                InstalledUILegacy(installed, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(this, installed, appletTileAppearance, i, 29);
        }
    }

    public void InstalledUI(TaxesAppletTileModel.Installed installed, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        Pair pair;
        InstalledServiceAppletTileContentModel.Emphasis emphasis;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1444998739);
        int i2 = i | (gapComposer.changedInstance(installed) ? 4 : 2) | (gapComposer.changed(appletTileAppearance) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = appletTileAppearance.useRedesignedTiles;
            if (z) {
                gapComposer.startReplaceGroup(1804931421);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                pair = new Pair(new InstalledServiceAppletTileLayoutConfig(16.0f, RecyclerView.DECELERATION_RATE, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, InstalledServiceAppletTileLayoutConfig.VisualPosition.END, Alignment.Companion.Bottom), new Dp(64.0f));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1805294524);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Pair pair2 = new Pair(new InstalledServiceAppletTileLayoutConfig(8.0f, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 24), new Dp(28.0f));
                gapComposer.end(false);
                pair = pair2;
            }
            InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig = (InstalledServiceAppletTileLayoutConfig) pair.first;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-914948711, new TaxesAppletTile$$ExternalSyntheticLambda9(installed, this, ((Dp) pair.second).value, z), gapComposer);
            InstalledAppletTileHeaderModel installedAppletTileHeaderModel = new InstalledAppletTileHeaderModel(Room.stringResource(gapComposer, R.string.taxes_applet_tile_title), null, null, 14);
            String str = (String) installed.getEmphasizedSubtitle().first;
            if (str == null) {
                gapComposer.startReplaceGroup(-497999787);
                gapComposer.end(false);
                emphasis = null;
            } else {
                gapComposer.startReplaceGroup(-497999786);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                InstalledServiceAppletTileContentModel.Emphasis emphasis2 = new InstalledServiceAppletTileContentModel.Emphasis(str, colors.semantic.text.standard, null);
                gapComposer.end(false);
                emphasis = emphasis2;
            }
            String str2 = (String) installed.getEmphasizedSubtitle().second;
            if (z) {
                gapComposer.startReplaceGroup(-497796086);
                gapComposer.end(false);
                composableLambdaImpl = null;
            } else {
                gapComposer.startReplaceGroup(-497773083);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1768540757, new TaxesAppletTile$$ExternalSyntheticLambda10(rememberComposableLambda, i3), gapComposer);
                gapComposer.end(false);
                composableLambdaImpl = rememberComposableLambda2;
            }
            ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new InstalledServiceAppletTileContentModel(emphasis, str2, null, composableLambdaImpl, 4));
            String warningSubtitle = installed.getWarningSubtitle();
            if (warningSubtitle == null) {
                gapComposer.startReplaceGroup(-497675899);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-497675898);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                mutableListOf.add(new InstalledServiceAppletTileContentModel(new InstalledServiceAppletTileContentModel.Emphasis(warningSubtitle, colors2.semantic.text.warning, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).helpText), null, null, null, 14));
                gapComposer.end(false);
            }
            SharedUIKt.InstalledServiceAppletTile(installedAppletTileHeaderModel, mutableListOf, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) this.onClick, false, null, installedServiceAppletTileLayoutConfig, z ? rememberComposableLambda : null, gapComposer, 0, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(this, installed, appletTileAppearance, i, 2);
        }
    }

    public void UI(BorrowAppletTileModel borrowAppletTileModel, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1350661788);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(borrowAppletTileModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            SharedUIKt.AppletTileRow(null, Expect_jvmKt.rememberComposableLambda(-1791753646, new SectionKt$$ExternalSyntheticLambda2(11, borrowAppletTileModel, appletTileAppearance, this), gapComposer), gapComposer, 48, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(this, borrowAppletTileModel, appletTileAppearance, i, 6);
        }
    }

    public void UI(BitcoinAppletTileModel bitcoinAppletTileModel, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(965134394);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bitcoinAppletTileModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            SharedUIKt.AppletTileRow(null, Expect_jvmKt.rememberComposableLambda(-2046785296, new SectionKt$$ExternalSyntheticLambda2(i3, bitcoinAppletTileModel, this, appletTileAppearance), gapComposer), gapComposer, 48, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(this, bitcoinAppletTileModel, appletTileAppearance, i, 25);
        }
    }

    public void UI(TaxesAppletTileModel taxesAppletTileModel, AppletTile.AppletTileAppearance appletTileAppearance, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1823833143);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(taxesAppletTileModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(appletTileAppearance) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            SharedUIKt.AppletTileRow(null, Expect_jvmKt.rememberComposableLambda(1712132417, new SheetKt$$ExternalSyntheticLambda5(20, taxesAppletTileModel, this, appletTileAppearance), gapComposer), gapComposer, 48, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(this, taxesAppletTileModel, appletTileAppearance, i, 14);
        }
    }
}
