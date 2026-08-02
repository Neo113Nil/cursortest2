package com.squareup.cash.support.views.home;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.SearchBarKeyboardState;
import com.squareup.cash.arcade.components.SearchBarKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda60;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.viewmodels.SupportHomeDisputes;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.support.viewmodels.SupportNotification;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.tabs.views.ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda8;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardNullStateKt$$ExternalSyntheticLambda8;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class SupportHomeViewKt {

    /* renamed from: lambda$-1107622242, reason: not valid java name */
    public static final ComposableLambdaImpl f708lambda$1107622242 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(18), false, -1107622242);

    /* renamed from: lambda$-1593744950, reason: not valid java name */
    public static final ComposableLambdaImpl f709lambda$1593744950 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(19), false, -1593744950);

    /* renamed from: lambda$-1957065437, reason: not valid java name */
    public static final ComposableLambdaImpl f710lambda$1957065437 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(2), false, -1957065437);
    public static final ComposableLambdaImpl lambda$1171997853 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(3), false, 1171997853);
    public static final ComposableLambdaImpl lambda$2114223618 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(23), false, 2114223618);

    /* renamed from: lambda$-624077850, reason: not valid java name */
    public static final ComposableLambdaImpl f714lambda$624077850 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(24), false, -624077850);

    /* renamed from: lambda$-614307289, reason: not valid java name */
    public static final ComposableLambdaImpl f713lambda$614307289 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(25), false, -614307289);

    /* renamed from: lambda$-552154849, reason: not valid java name */
    public static final ComposableLambdaImpl f712lambda$552154849 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(26), false, -552154849);

    /* renamed from: lambda$-317936939, reason: not valid java name */
    public static final ComposableLambdaImpl f711lambda$317936939 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(4), false, -317936939);

    /* renamed from: lambda$-1027294493, reason: not valid java name */
    public static final ComposableLambdaImpl f707lambda$1027294493 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(27), false, -1027294493);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SupportHomeViewModel.NavigationIcon.values().length];
            try {
                SupportHomeViewModel.NavigationIcon navigationIcon = SupportHomeViewModel.NavigationIcon.BACK;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(20), false, -1055999176);
        new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(21), false, 911952880);
        new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(22), false, -50609799);
    }

    public static final void Activities(boolean z, boolean z2, boolean z3, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        boolean z4;
        Pair pair;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-637304808);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                gapComposer.startReplaceGroup(2103134566);
                Integer valueOf = Integer.valueOf(R.string.support_home_activity_show_more);
                boolean z5 = (i2 & 7168) == 2048;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z5 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda8(12, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                pair = new Pair(valueOf, (Function0) rememberedValue);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2103237548);
                gapComposer.end(false);
                pair = new Pair(null, null);
            }
            z4 = z3;
            Section(R.string.support_home_header_activity, f712lambda$552154849, (Integer) pair.first, (Function0) pair.second, z4, Expect_jvmKt.rememberComposableLambda(932429091, new SupportHomeViewKt$$ExternalSyntheticLambda33(z2, function1, composableLambdaImpl), gapComposer), gapComposer, ((i2 << 6) & 57344) | 196656, 0);
        } else {
            z4 = z3;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardStudioViewKt$$ExternalSyntheticLambda60(z, z2, z4, function1, composableLambdaImpl, i);
        }
    }

    public static final void ActivityPicker(UiCallbackModel uiCallbackModel, Composer composer, int i) {
        UiCallbackModel uiCallbackModel2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-22844756);
        int i2 = (gapComposer.changed(uiCallbackModel) ? 4 : 2) | i;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            uiCallbackModel2 = uiCallbackModel;
            gapComposer.skipToGroupEnd();
        } else if (uiCallbackModel != null) {
            gapComposer.startReplaceGroup(-1963126322);
            uiCallbackModel2 = uiCallbackModel;
            AvatarsKt.ActivityEmbeddedView(uiCallbackModel2, null, f711lambda$317936939, f707lambda$1027294493, null, gapComposer, (i2 & 14) | 3456, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
            gapComposer.end(false);
        } else {
            uiCallbackModel2 = uiCallbackModel;
            gapComposer.startReplaceGroup(-1962595850);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda6(uiCallbackModel2, i, 28);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final void BrowseCategories(List list, Function1 function1, Composer composer, int i) {
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1048943140);
        int i2 = 32;
        int i3 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final boolean z = 0;
        final int i4 = 1;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (list.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 7);
                    return;
                }
                return;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-368984327);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final SupportHomeViewModel.Category category = (SupportHomeViewModel.Category) it.next();
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                Object obj = rememberedValue;
                if (rememberedValue == neverEqualPolicy) {
                    TabToolbarsKt$$ExternalSyntheticLambda28 tabToolbarsKt$$ExternalSyntheticLambda28 = new TabToolbarsKt$$ExternalSyntheticLambda28(10);
                    gapComposer.updateRememberedValue(tabToolbarsKt$$ExternalSyntheticLambda28);
                    obj = tabToolbarsKt$$ExternalSyntheticLambda28;
                }
                Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, z, (Function1) obj);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1295278559, new Function2() { // from class: com.squareup.cash.support.views.home.SupportHomeCategoriesViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Icons icons;
                        int i5 = z;
                        SupportHomeViewModel.Category category2 = category;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Article.Icon icon = category2.icon;
                                    Article.Glyph glyph = icon != null ? icon.glyph : null;
                                    switch (glyph == null ? -1 : HomeUtilsKt$WhenMappings.$EnumSwitchMapping$0[glyph.ordinal()]) {
                                        case -1:
                                        case 20:
                                        case 21:
                                            icons = Icons.Document24;
                                            break;
                                        case 0:
                                        default:
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        case 1:
                                            icons = Icons.CardBasic24;
                                            break;
                                        case 2:
                                            icons = Icons.CurrencyBtc24;
                                            break;
                                        case 3:
                                            icons = Icons.Investing24;
                                            break;
                                        case 4:
                                            icons = Icons.Favorite24;
                                            break;
                                        case 5:
                                            icons = Icons.Deposit24;
                                            break;
                                        case 6:
                                            icons = Icons.Limits24;
                                            break;
                                        case 7:
                                            icons = Icons.InformationOutline24;
                                            break;
                                        case 8:
                                            icons = Icons.Avatar24;
                                            break;
                                        case 9:
                                            icons = Icons.Fast24;
                                            break;
                                        case 10:
                                            icons = Icons.Borrow24;
                                            break;
                                        case 11:
                                            icons = Icons.CashAppPay24;
                                            break;
                                        case 12:
                                            icons = Icons.Business24;
                                            break;
                                        case 13:
                                            icons = Icons.Taxes24;
                                            break;
                                        case 14:
                                            icons = Icons.Add24;
                                            break;
                                        case 15:
                                            icons = Icons.Atm24;
                                            break;
                                        case 16:
                                            icons = Icons.Family24;
                                            break;
                                        case 17:
                                            icons = Icons.PayLater24;
                                            break;
                                        case 18:
                                            icons = Icons.Savings24;
                                            break;
                                        case 19:
                                            icons = Icons.LogoAfterpay24;
                                            break;
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, category2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1466118016, new Function2() { // from class: com.squareup.cash.support.views.home.SupportHomeCategoriesViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Icons icons;
                        int i5 = i4;
                        SupportHomeViewModel.Category category2 = category;
                        switch (i5) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Article.Icon icon = category2.icon;
                                    Article.Glyph glyph = icon != null ? icon.glyph : null;
                                    switch (glyph == null ? -1 : HomeUtilsKt$WhenMappings.$EnumSwitchMapping$0[glyph.ordinal()]) {
                                        case -1:
                                        case 20:
                                        case 21:
                                            icons = Icons.Document24;
                                            break;
                                        case 0:
                                        default:
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        case 1:
                                            icons = Icons.CardBasic24;
                                            break;
                                        case 2:
                                            icons = Icons.CurrencyBtc24;
                                            break;
                                        case 3:
                                            icons = Icons.Investing24;
                                            break;
                                        case 4:
                                            icons = Icons.Favorite24;
                                            break;
                                        case 5:
                                            icons = Icons.Deposit24;
                                            break;
                                        case 6:
                                            icons = Icons.Limits24;
                                            break;
                                        case 7:
                                            icons = Icons.InformationOutline24;
                                            break;
                                        case 8:
                                            icons = Icons.Avatar24;
                                            break;
                                        case 9:
                                            icons = Icons.Fast24;
                                            break;
                                        case 10:
                                            icons = Icons.Borrow24;
                                            break;
                                        case 11:
                                            icons = Icons.CashAppPay24;
                                            break;
                                        case 12:
                                            icons = Icons.Business24;
                                            break;
                                        case 13:
                                            icons = Icons.Taxes24;
                                            break;
                                        case 14:
                                            icons = Icons.Add24;
                                            break;
                                        case 15:
                                            icons = Icons.Atm24;
                                            break;
                                        case 16:
                                            icons = Icons.Family24;
                                            break;
                                        case 17:
                                            icons = Icons.PayLater24;
                                            break;
                                        case 18:
                                            icons = Icons.Savings24;
                                            break;
                                        case 19:
                                            icons = Icons.LogoAfterpay24;
                                            break;
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, category2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                int i5 = ((i3 & 112) == i2 ? i4 : z) | (gapComposer.changed(category) ? 1 : 0);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (i5 != 0 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TaxWebAppBridge$$ExternalSyntheticLambda0(11, function1, category);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, semantics, (Function0) rememberedValue2, false, true, null, null, push, 0L, gapComposer, 806879286, 3504);
                i4 = 1;
                z = z;
                companion = companion;
                i2 = i2;
            }
            gapComposer.end(z);
            gapComposer.end(true);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    public static final void ContactUs(List list, Function1 function1, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2100772744);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        final boolean z = 0;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (list.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 9);
                    return;
                }
                return;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1290525200);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final SupportHomeViewModel.ContactOption contactOption = (SupportHomeViewModel.ContactOption) it.next();
                String str = contactOption.subtitle;
                if (str == null) {
                    gapComposer.startReplaceGroup(-1610719462);
                    gapComposer.end(z);
                    composableLambdaImpl = null;
                } else {
                    gapComposer.startReplaceGroup(-1610719461);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(136797472, new PastPaySectionKt$$ExternalSyntheticLambda1(str, i2), gapComposer);
                    gapComposer.end(z);
                    composableLambdaImpl = rememberComposableLambda;
                }
                String str2 = contactOption.subtitle;
                boolean z2 = (str2 == null || str2.length() == 0) ? true : z;
                Badge.Small small = contactOption.hasNotificationBadge ? Badge.Small.INSTANCE : null;
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                boolean z3 = contactOption.enabled;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                    rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(11);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, z, (Function1) rememberedValue);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(20093706, new Function2() { // from class: com.squareup.cash.support.views.home.SupportHomeContactViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Icons icons;
                        int i4 = z;
                        SupportHomeViewModel.ContactOption contactOption2 = contactOption;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    int ordinal = contactOption2.f1210type.ordinal();
                                    if (ordinal == 0) {
                                        icons = Icons.CommSms24;
                                    } else if (ordinal != 1) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        icons = Icons.CommPhoneFill24;
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contactOption2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                final int i4 = 1;
                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(196421963, new Function2() { // from class: com.squareup.cash.support.views.home.SupportHomeContactViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Icons icons;
                        int i42 = i4;
                        SupportHomeViewModel.ContactOption contactOption2 = contactOption;
                        switch (i42) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    int ordinal = contactOption2.f1210type.ordinal();
                                    if (ordinal == 0) {
                                        icons = Icons.CommSms24;
                                    } else if (ordinal != 1) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        icons = Icons.CommPhoneFill24;
                                    }
                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contactOption2.title, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                boolean z4 = z2;
                boolean changed = ((i3 & 112) == 32) | gapComposer.changed(contactOption);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == obj) {
                    rememberedValue2 = new TaxWebAppBridge$$ExternalSyntheticLambda0(12, contactOption, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda2, rememberComposableLambda3, semantics, (Function0) rememberedValue2, z3, z4, composableLambdaImpl, small, push, 0L, gapComposer, 805306422, 3088);
                z = 0;
                i2 = 4;
                companion = companion;
            }
            gapComposer.end(z);
            gapComposer.end(true);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 10);
        }
    }

    public static final void DisputeCell(Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-428870142);
        int i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer, R.string.support_home_disputes_cell_talkback);
            CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 29);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == obj) {
                rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda8(13, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f714lambda$624077850, f713lambda$614307289, semantics, (Function0) rememberedValue2, false, false, null, null, push, 0L, gapComposer, 805306422, 3568);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardNullStateKt$$ExternalSyntheticLambda8(i, 10, function1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c8, code lost:
    
        if ((!r10.isEmpty()) == true) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Loaded(SupportHomeViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        ActivityEmbeddedViewModel activityEmbeddedViewModel;
        ActivityEmbeddedViewModel activityEmbeddedViewModel2;
        List list;
        byte b;
        int i4;
        boolean z4;
        ?? r2;
        boolean z5;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1518308512);
        int i5 = (gapComposer2.changed(loaded) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String stringResource = Room.stringResource(gapComposer2, R.string.support_home_talk_back_search);
            String str = loaded.searchPlaceholder;
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE("", 0L, gapComposer2, 6, 2);
            SearchBarKeyboardState rememberSearchBarKeyboardState = SearchBarKt.rememberSearchBarKeyboardState(false, gapComposer2);
            boolean changed = gapComposer2.changed(stringResource);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 28);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue);
            boolean z6 = (i5 & 112) == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z6 || rememberedValue2 == obj) {
                rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda8(11, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            SearchBarKt.SearchBar(m382rememberTextFieldStateLepunE, str, rememberSearchBarKeyboardState, semantics, null, null, null, (Function0) rememberedValue2, "Search", null, false, null, gapComposer2, 100663296, 0, 7792);
            GapComposer gapComposer3 = gapComposer2;
            if (loaded.notifications.isEmpty()) {
                gapComposer3.startReplaceGroup(1330775436);
                gapComposer3.end(false);
                z = false;
            } else {
                gapComposer3.startReplaceGroup(1330561133);
                Section(R.string.support_home_header_notifications, null, null, null, false, Expect_jvmKt.rememberComposableLambda(1144226566, new SupportHomeViewKt$$ExternalSyntheticLambda15(loaded, function1, 1, (byte) 0), gapComposer3), gapComposer3, 221184, 14);
                gapComposer3.end(false);
                z = true;
            }
            SupportHomeViewModel.Loaded.ActivitySectionConfig activitySectionConfig = loaded.activitySectionConfig;
            if (activitySectionConfig instanceof SupportHomeViewModel.Loaded.ActivitySectionConfig.DisputeOnly) {
                gapComposer3.startReplaceGroup(1330889857);
                SupportHomeDisputes supportHomeDisputes = ((SupportHomeViewModel.Loaded.ActivitySectionConfig.DisputeOnly) activitySectionConfig).disputes;
                if (supportHomeDisputes != null && supportHomeDisputes.totalClaims > 0) {
                    gapComposer3.startReplaceGroup(1330939581);
                    Section(R.string.support_home_header_activity, lambda$2114223618, null, null, z, Expect_jvmKt.rememberComposableLambda(1618287230, new HeroCardNullStateKt$$ExternalSyntheticLambda8(7, function1), gapComposer3), gapComposer3, 200112, 0);
                    gapComposer3.end(false);
                    z5 = true;
                } else {
                    gapComposer3.startReplaceGroup(1331292268);
                    gapComposer3.end(false);
                    z5 = z;
                }
                gapComposer3.end(false);
                b = 0;
                z3 = true;
                z = z5;
                i2 = 4;
                i3 = 2;
            } else {
                if (!(activitySectionConfig instanceof SupportHomeViewModel.Loaded.ActivitySectionConfig.PickerAndDisputes)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -1896733040, false);
                }
                gapComposer3.startReplaceGroup(1331371256);
                SupportHomeViewModel.Loaded.ActivitySectionConfig.PickerAndDisputes pickerAndDisputes = (SupportHomeViewModel.Loaded.ActivitySectionConfig.PickerAndDisputes) activitySectionConfig;
                SupportHomeDisputes supportHomeDisputes2 = pickerAndDisputes.disputes;
                UiCallbackModel uiCallbackModel = pickerAndDisputes.activityEmbeddedViewModel;
                if (uiCallbackModel != null && (activityEmbeddedViewModel2 = (ActivityEmbeddedViewModel) uiCallbackModel.model) != null && (list = activityEmbeddedViewModel2.feedEntries) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof ActivityFeedEntry.Item) {
                            arrayList.add(obj2);
                        }
                    }
                }
                if (supportHomeDisputes2 == null || supportHomeDisputes2.totalClaims <= 0) {
                    z2 = false;
                    z3 = true;
                    i2 = 4;
                    i3 = 2;
                    gapComposer3.startReplaceGroup(1331936076);
                    gapComposer3.end(false);
                    gapComposer3.end(z2);
                    b = z2;
                }
                gapComposer3.startReplaceGroup(1331492094);
                int i6 = ((i5 << 6) & 7168) | 24576;
                z2 = false;
                z3 = true;
                i2 = 4;
                i3 = 2;
                Activities((uiCallbackModel == null || (activityEmbeddedViewModel = (ActivityEmbeddedViewModel) uiCallbackModel.model) == null) ? false : activityEmbeddedViewModel.hasMore, supportHomeDisputes2 != null && supportHomeDisputes2.totalClaims > 0, z, function1, Expect_jvmKt.rememberComposableLambda(-1667941808, new SheetKt$$ExternalSyntheticLambda6(activitySectionConfig, 27), gapComposer3), gapComposer3, i6);
                gapComposer3.end(false);
                z = true;
                gapComposer3.end(z2);
                b = z2;
            }
            if (loaded.suggestedActions.isEmpty()) {
                i4 = i2;
                z4 = z3;
                boolean z7 = b;
                gapComposer3.startReplaceGroup(1332320972);
                gapComposer3.end(z7);
                r2 = z7;
            } else {
                gapComposer3.startReplaceGroup(1332006725);
                i4 = i2;
                z4 = z3;
                boolean z8 = b;
                Section(R.string.support_home_header_suggested_articles, null, null, null, z, Expect_jvmKt.rememberComposableLambda(1026523965, new SupportHomeViewKt$$ExternalSyntheticLambda15(loaded, function1, i3, b), gapComposer3), gapComposer3, 196608, 14);
                gapComposer3.end(z8);
                z = z4;
                r2 = z8;
            }
            if (loaded.showArticleError || !loaded.categories.isEmpty()) {
                gapComposer3.startReplaceGroup(1332397542);
                Section(R.string.support_home_header_articles, null, null, null, z, Expect_jvmKt.rememberComposableLambda(1749814398, new SupportHomeViewKt$$ExternalSyntheticLambda15(loaded, function1, 3, r2), gapComposer3), gapComposer3, 196608, 14);
                gapComposer3.end(r2);
                z = z4;
            } else {
                gapComposer3.startReplaceGroup(1332710828);
                gapComposer3.end(r2);
            }
            if (loaded.contactOptions.isEmpty() || loaded.showProminentContactSupportButton) {
                gapComposer3.startReplaceGroup(1333766316);
                gapComposer3.end(r2);
            } else {
                gapComposer3.startReplaceGroup(1332829341);
                Section(R.string.support_home_header_contact, Expect_jvmKt.rememberComposableLambda(1261555267, new HeroCardNullStateKt$$ExternalSyntheticLambda8(8, function1), gapComposer3), null, null, z, Expect_jvmKt.rememberComposableLambda(-1821862465, new SupportHomeViewKt$$ExternalSyntheticLambda15(loaded, function1, i4, r2), gapComposer3), gapComposer3, 196656, 12);
                gapComposer3.end(r2);
            }
            gapComposer3.end(z4);
            gapComposer = gapComposer3;
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportHomeViewKt$$ExternalSyntheticLambda15(loaded, function1, i);
        }
    }

    /* renamed from: Loading-8Feqmps, reason: not valid java name */
    public static final void m3754Loading8Feqmps(float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1254113633);
        int i2 = (gapComposer.changed(f) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), f / 2.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TrackRowKt$$ExternalSyntheticLambda0(f, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Section(final int i, Function2 function2, Integer num, Function0 function0, final boolean z, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2, final int i3) {
        int i4;
        Function2 function22;
        int i5;
        Integer num2;
        int i6;
        Function0 function02;
        final Integer num3;
        RecomposeScopeImpl endRestartGroup;
        ComposableLambdaImpl rememberComposableLambda;
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1326919744);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            function22 = function2;
            i4 |= gapComposer.changedInstance(function22) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                num2 = num;
                i4 |= gapComposer.changed(num2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    function02 = function0;
                    i4 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
                    if ((i2 & 24576) == 0) {
                        i4 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
                    }
                    if ((196608 & i2) == 0) {
                        i4 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) == 74898)) {
                        gapComposer.skipToGroupEnd();
                        num3 = num2;
                    } else {
                        if (i7 != 0) {
                            function22 = null;
                        }
                        num3 = i5 != 0 ? null : num2;
                        if (i6 != 0) {
                            function02 = null;
                        }
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        if (z) {
                            gapComposer.startReplaceGroup(613145766);
                            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 18.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5), 16.0f, RecyclerView.DECELERATION_RATE, 2));
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(613264930);
                            gapComposer.end(false);
                        }
                        if (function22 == null) {
                            gapComposer.startReplaceGroup(613400337);
                            gapComposer.end(false);
                            rememberComposableLambda = null;
                        } else {
                            gapComposer.startReplaceGroup(613400338);
                            rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1806969831, new ToastKt$$ExternalSyntheticLambda11(23, function22), gapComposer);
                            gapComposer.end(false);
                        }
                        if (num3 == null) {
                            gapComposer.startReplaceGroup(613454866);
                            gapComposer.end(false);
                            composableLambdaImpl2 = null;
                        } else {
                            gapComposer.startReplaceGroup(613454867);
                            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1513887208, new LocalCombinedViewsKt$$ExternalSyntheticLambda3(num3.intValue(), 13), gapComposer);
                            gapComposer.end(false);
                            composableLambdaImpl2 = rememberComposableLambda2;
                        }
                        ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(-1694534169, new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i, 14), gapComposer), SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), composableLambdaImpl2, function02, rememberComposableLambda, gapComposer, (i4 & 7168) | 54, 0);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i4 >> 15) & 14));
                    }
                    final Function2 function23 = function22;
                    final Function0 function03 = function02;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new Function2() { // from class: com.squareup.cash.support.views.home.SupportHomeViewKt$$ExternalSyntheticLambda29
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                SupportHomeViewKt.Section(i, function23, num3, function03, z, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i2 | 1), i3);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                function02 = function0;
                if ((i2 & 24576) == 0) {
                }
                if ((196608 & i2) == 0) {
                }
                if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) == 74898)) {
                }
                final Function2 function232 = function22;
                final Function0 function032 = function02;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            num2 = num;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            function02 = function0;
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) == 74898)) {
            }
            final Function2 function2322 = function22;
            final Function0 function0322 = function02;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function22 = function2;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        num2 = num;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        function02 = function0;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) == 74898)) {
        }
        final Function2 function23222 = function22;
        final Function0 function03222 = function02;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SuggestedActions(List list, Function1 function1, Composer composer, int i) {
        Icons icons;
        ComposableLambdaImpl composableLambdaImpl;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-11137590);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 1;
        boolean z = false;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (list.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 11);
                    return;
                }
                return;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(876442726);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SupportHomeViewModel.SuggestedAction suggestedAction = (SupportHomeViewModel.SuggestedAction) it.next();
                int ordinal = suggestedAction.icon.ordinal();
                if (ordinal == 0) {
                    icons = Icons.DocumentFill24;
                } else if (ordinal == i4) {
                    icons = Icons.Hyperlink24;
                } else {
                    if (ordinal != i2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    icons = Icons.LinkOut24;
                }
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z);
                }
                long j = colors.semantic.icon.standard;
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z);
                }
                long j2 = colors2.semantic.background.subtle;
                String str = suggestedAction.link.previewText;
                if (str == null) {
                    gapComposer.startReplaceGroup(-937038242);
                    gapComposer.end(z);
                    composableLambdaImpl = null;
                } else {
                    gapComposer.startReplaceGroup(-937038241);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-81484605, new PastPaySectionKt$$ExternalSyntheticLambda1(str, 5), gapComposer);
                    gapComposer.end(z);
                    composableLambdaImpl = rememberComposableLambda;
                }
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 64.0f, RecyclerView.DECELERATION_RATE, i2);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(2063785287, new SheetKt$$ExternalSyntheticLambda6(suggestedAction, 26), gapComposer);
                boolean changed = ((i3 & 112) == 32) | gapComposer.changed(suggestedAction);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda0(13, function1, suggestedAction);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j2, rememberComposableLambda2, m279heightInVpY3zN4$default, j, (Function0) rememberedValue, null, false, false, composableLambdaImpl, null, push, 0L, null, gapComposer2, 27696, MLKEMEngine.KyberPolyBytes, 27520);
                i4 = 1;
                z = false;
                gapComposer = gapComposer2;
                i2 = 2;
                companion = companion;
            }
            gapComposer.end(z);
            gapComposer.end(true);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 12);
        }
    }

    public static final void SupportHomeAlert(Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1841022051);
        if (gapComposer2.shouldExecute(i & 1, i != 0)) {
            Icons icons = Icons.AlertReportedFill24;
            String stringResource = Room.stringResource(gapComposer2, R.string.support_article_error_icon_description);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.icon.inverse;
            Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, stringResource, colors2.semantic.background.danger, f708lambda$1107622242, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), j, null, null, false, false, f709lambda$1593744950, null, null, 0L, null, gapComposer, 27654, 6, 31680);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArticleViewKt$$ExternalSyntheticLambda10(i, 28);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SupportHomeOrLoading(SupportHomeViewModel supportHomeViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        SupportHomeViewModel supportHomeViewModel2;
        SupportHomeViewModel.NavigationIcon navigationIcon;
        Throwable th;
        Function1 function13;
        boolean z;
        Object rememberedValue;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1967363445);
        int i2 = i | (gapComposer.changedInstance(supportHomeViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(16.0f);
            Object rememberedValue2 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.derivedStateOf(new WalletHomeViewKt$$ExternalSyntheticLambda5(rememberScrollState, mo236toPx0680j_4, 3));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            State state = (State) rememberedValue2;
            boolean z2 = supportHomeViewModel instanceof SupportHomeViewModel.Loaded;
            SupportHomeViewModel.Loaded loaded = z2 ? (SupportHomeViewModel.Loaded) supportHomeViewModel : null;
            SupportHomeViewModel.Loading loading = supportHomeViewModel instanceof SupportHomeViewModel.Loading ? (SupportHomeViewModel.Loading) supportHomeViewModel : null;
            if (loaded == null || (navigationIcon = loaded.navigationIcon) == null) {
                navigationIcon = loading != null ? loading.navigationIcon : null;
            }
            NavigationType navigationType = (navigationIcon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[navigationIcon.ordinal()]) == 1 ? NavigationType.BACK : NavigationType.CLOSE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NavigationType navigationType2 = navigationType;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                th = null;
            } else {
                th = null;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new TabToolbarsKt$$ExternalSyntheticLambda28(13);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m177backgroundbw27NRU, false, (Function1) rememberedValue3);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw th;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1363714811, new SupportHomeViewKt$$ExternalSyntheticLambda2(state, 0), gapComposer);
            boolean z3 = (i2 & 112) == 32;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z3 || rememberedValue4 == neverEqualPolicy) {
                function13 = function1;
                rememberedValue4 = new TabToolbarsKt$$ExternalSyntheticLambda8(14, function13);
                gapComposer.updateRememberedValue(rememberedValue4);
            } else {
                function13 = function1;
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType2, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer, 390, 104);
            boolean changed = gapComposer.changed(supportHomeViewModel);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = Updater.derivedStateOf(new PageTagSlotKt$$ExternalSyntheticLambda0(supportHomeViewModel, 3));
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            State state2 = (State) rememberedValue5;
            if (z2) {
                SupportHomeViewModel.Loaded loaded2 = (SupportHomeViewModel.Loaded) supportHomeViewModel;
                if (!loaded2.contactOptions.isEmpty() && loaded2.showProminentContactSupportButton) {
                    z = true;
                    rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
                    }
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier then = fillMaxWidth2.then(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                    SheetKt$$ExternalSyntheticLambda4 sheetKt$$ExternalSyntheticLambda4 = new SheetKt$$ExternalSyntheticLambda4(rememberScrollState, z, function13, state2, supportHomeViewModel, parcelableSnapshotMutableIntState);
                    function12 = function13;
                    supportHomeViewModel2 = supportHomeViewModel;
                    OffsetKt.BoxWithConstraints(then, null, false, Expect_jvmKt.rememberComposableLambda(-596218281, sheetKt$$ExternalSyntheticLambda4, gapComposer), gapComposer, 3072, 6);
                    gapComposer.end(true);
                }
            }
            z = false;
            rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == neverEqualPolicy) {
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue;
            Modifier fillMaxWidth22 = SizeKt.fillMaxWidth(companion, 1.0f);
            if (1.0f <= 0.0d) {
            }
            Modifier then2 = fillMaxWidth22.then(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            SheetKt$$ExternalSyntheticLambda4 sheetKt$$ExternalSyntheticLambda42 = new SheetKt$$ExternalSyntheticLambda4(rememberScrollState, z, function13, state2, supportHomeViewModel, parcelableSnapshotMutableIntState2);
            function12 = function13;
            supportHomeViewModel2 = supportHomeViewModel;
            OffsetKt.BoxWithConstraints(then2, null, false, Expect_jvmKt.rememberComposableLambda(-596218281, sheetKt$$ExternalSyntheticLambda42, gapComposer), gapComposer, 3072, 6);
            gapComposer.end(true);
        } else {
            function12 = function1;
            supportHomeViewModel2 = supportHomeViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportHomeView$$ExternalSyntheticLambda3(supportHomeViewModel2, function12, i);
        }
    }

    public static final void SupportNotifications(List list, Function1 function1, Composer composer, int i) {
        Icons icons;
        SupportNotification.Trigger trigger;
        long j;
        long j2;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(966070296);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        boolean z = false;
        int i4 = 1;
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (list.isEmpty()) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 13);
                    return;
                }
                return;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-596625374);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final SupportNotification supportNotification = (SupportNotification) it.next();
                SupportNotification.Trigger trigger2 = supportNotification.trigger;
                SupportNotification.Trigger.ChatMessage chatMessage = SupportNotification.Trigger.ChatMessage.INSTANCE;
                boolean areEqual = Intrinsics.areEqual(trigger2, chatMessage);
                SupportNotification.Trigger.PhoneMessage phoneMessage = SupportNotification.Trigger.PhoneMessage.INSTANCE;
                if (areEqual) {
                    icons = Icons.CommSms24;
                } else if (Intrinsics.areEqual(trigger2, phoneMessage)) {
                    icons = Icons.CommPhoneFill24;
                } else {
                    if (!(trigger2 instanceof SupportNotification.Trigger.Incident)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    int ordinal = ((SupportNotification.Trigger.Incident) trigger2).severity.ordinal();
                    if (ordinal == 0) {
                        icons = Icons.CheckFill24;
                    } else if (ordinal == i4) {
                        icons = Icons.AlertReportedFill24;
                    } else {
                        if (ordinal != i2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        icons = Icons.InformationFill24;
                    }
                }
                if (Intrinsics.areEqual(trigger2, chatMessage) || Intrinsics.areEqual(trigger2, phoneMessage)) {
                    trigger = trigger2;
                    gapComposer.startReplaceGroup(-655458544);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(z);
                    }
                    j = colors.semantic.icon.standard;
                    gapComposer.end(z);
                } else {
                    if (!(trigger2 instanceof SupportNotification.Trigger.Incident)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -655461113, z);
                    }
                    gapComposer.startReplaceGroup(1155662879);
                    int ordinal2 = ((SupportNotification.Trigger.Incident) trigger2).severity.ordinal();
                    if (ordinal2 != 0 && ordinal2 != i4 && ordinal2 != i2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -655457213, z);
                    }
                    gapComposer.startReplaceGroup(-655453937);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(z);
                    }
                    trigger = trigger2;
                    j = colors2.semantic.icon.inverse;
                    gapComposer.end(z);
                    gapComposer.end(z);
                }
                SupportNotification.Trigger trigger3 = trigger;
                if (Intrinsics.areEqual(trigger3, chatMessage) || Intrinsics.areEqual(trigger3, phoneMessage)) {
                    gapComposer.startReplaceGroup(-974841112);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(z);
                    }
                    j2 = colors3.semantic.background.subtle;
                    gapComposer.end(z);
                } else {
                    if (!(trigger3 instanceof SupportNotification.Trigger.Incident)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -974843775, z);
                    }
                    gapComposer.startReplaceGroup(-155261207);
                    int ordinal3 = ((SupportNotification.Trigger.Incident) trigger3).severity.ordinal();
                    if (ordinal3 == 0) {
                        gapComposer.startReplaceGroup(-974837433);
                        Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(z);
                        }
                        j2 = colors4.semantic.background.brand;
                        gapComposer.end(z);
                    } else if (ordinal3 == 1) {
                        gapComposer.startReplaceGroup(-974835384);
                        Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors5 == null) {
                            colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(z);
                        }
                        j2 = colors5.semantic.background.danger;
                        gapComposer.end(z);
                    } else {
                        if (ordinal3 != i2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -974839751, z);
                        }
                        gapComposer.startReplaceGroup(-974833530);
                        Colors colors6 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors6 == null) {
                            colors6 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(z);
                        }
                        j2 = colors6.semantic.icon.info;
                        gapComposer.end(z);
                    }
                    gapComposer.end(z);
                }
                Badge.Small small = supportNotification.showUnreadDot ? Badge.Small.INSTANCE : null;
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 64.0f, RecyclerView.DECELERATION_RATE, i2);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(18);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                final int i5 = 0;
                Modifier semantics = SemanticsModifierKt.semantics(m279heightInVpY3zN4$default, false, (Function1) rememberedValue);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(2098927610, new Function2() { // from class: com.squareup.cash.support.views.home.SupportNotificationsViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i6 = i5;
                        SupportNotification supportNotification2 = supportNotification;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str = supportNotification2.title;
                                    TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                    Colors colors7 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors7 == null) {
                                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors7.semantic.text.standard, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str2 = supportNotification2.message;
                                    TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                    Colors colors8 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors8 == null) {
                                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors8.semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                boolean changed = ((i3 & 112) == 32) | gapComposer.changed(supportNotification);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TaxWebAppBridge$$ExternalSyntheticLambda0(14, function1, supportNotification);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                final int i6 = 1;
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j2, rememberComposableLambda, semantics, j, (Function0) rememberedValue2, null, false, false, Expect_jvmKt.rememberComposableLambda(1215603238, new Function2() { // from class: com.squareup.cash.support.views.home.SupportNotificationsViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i62 = i6;
                        SupportNotification supportNotification2 = supportNotification;
                        switch (i62) {
                            case 0:
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                GapComposer gapComposer22 = (GapComposer) composer2;
                                if (gapComposer22.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str = supportNotification2.title;
                                    TextStyle textStyle = ((Typography) gapComposer22.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                    Colors colors7 = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                                    if (colors7 == null) {
                                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                                    } else {
                                        gapComposer22.startReplaceGroup(-1762997739);
                                        gapComposer22.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors7.semantic.text.standard, (Composer) gapComposer22, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer22.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str2 = supportNotification2.message;
                                    TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                    Colors colors8 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                    if (colors8 == null) {
                                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                    } else {
                                        gapComposer3.startReplaceGroup(-1762997739);
                                        gapComposer3.end(false);
                                    }
                                    Room.m1165Text25TpFw(0, 2, 0, 0, 1572864, 0, 4018, colors8.semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), small, push, 0L, null, gapComposer2, 805309488, 390, 24960);
                i4 = 1;
                z = false;
                gapComposer = gapComposer2;
                companion = companion;
                i2 = 2;
            }
            gapComposer.end(z);
            gapComposer.end(true);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 14);
        }
    }
}
