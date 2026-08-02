package com.squareup.cash.support.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.LimitInsets;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda1;
import androidx.compose.ui.unit.Density;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputAreaKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetNameViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.borrow.views.BulletinInfoOverlayKt$$ExternalSyntheticLambda20;
import com.squareup.cash.card.onboarding.CardStudioViewKt$$ExternalSyntheticLambda60;
import com.squareup.cash.common.composeui.ArcadeInfoBlockerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$1$1;
import com.squareup.cash.offers.views.OffersSearchViewKt$OffersSearchView$1$1;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda1;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda3;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.screenshot.ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewModel$Loaded;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewModel$Editing;
import com.squareup.cash.support.viewmodels.PhoneVerificationEvents;
import com.squareup.cash.support.viewmodels.PhoneVerificationViewModel;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.viewmodels.SupportArticleIncidentsSheetViewModel;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewModel;
import com.squareup.cash.support.viewmodels.SupportFullScreenActivityPickerViewModel;
import com.squareup.cash.support.viewmodels.SupportHomeContactOptionsSheetEvents;
import com.squareup.cash.support.viewmodels.SupportHomeContactOptionsSheetViewModel;
import com.squareup.cash.support.viewmodels.SupportIncidentDetailsViewModel;
import com.squareup.cash.support.viewmodels.SupportPhoneStatusViewModel;
import com.squareup.cash.support.viewmodels.SupportTransactionConfirmationViewModel;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.support.views.home.SupportHomeViewKt;
import com.squareup.cash.tabs.views.ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda8;
import com.squareup.cash.taptopay.views.TapToPayFirstTimeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.taptopay.views.TapToPayInitiatorNotesKt$$ExternalSyntheticLambda4;
import com.squareup.cash.tax.views.TaxReturnsViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.HeroCardNullStateKt$$ExternalSyntheticLambda8;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.work.views.pay.PastPaySectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.pay.PaySectionViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda14;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda2;
import com.stripe.android.uicore.elements.OTPElementUIKt$$ExternalSyntheticLambda10;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class ScreenshotReviewViewKt {

    /* renamed from: lambda$-1161506885, reason: not valid java name */
    public static final ComposableLambdaImpl f688lambda$1161506885;

    /* renamed from: lambda$-11833360, reason: not valid java name */
    public static final ComposableLambdaImpl f689lambda$11833360;

    /* renamed from: lambda$-1306729248, reason: not valid java name */
    public static final ComposableLambdaImpl f690lambda$1306729248;

    /* renamed from: lambda$-1434795663, reason: not valid java name */
    public static final ComposableLambdaImpl f691lambda$1434795663;

    /* renamed from: lambda$-1440766607, reason: not valid java name */
    public static final ComposableLambdaImpl f692lambda$1440766607;

    /* renamed from: lambda$-1532292486, reason: not valid java name */
    public static final ComposableLambdaImpl f693lambda$1532292486;

    /* renamed from: lambda$-1577485937, reason: not valid java name */
    public static final ComposableLambdaImpl f694lambda$1577485937;

    /* renamed from: lambda$-1734210168, reason: not valid java name */
    public static final ComposableLambdaImpl f695lambda$1734210168;

    /* renamed from: lambda$-1778010247, reason: not valid java name */
    public static final ComposableLambdaImpl f696lambda$1778010247;

    /* renamed from: lambda$-185984590, reason: not valid java name */
    public static final ComposableLambdaImpl f697lambda$185984590;

    /* renamed from: lambda$-1890950155, reason: not valid java name */
    public static final ComposableLambdaImpl f698lambda$1890950155;

    /* renamed from: lambda$-1974654492, reason: not valid java name */
    public static final ComposableLambdaImpl f699lambda$1974654492;

    /* renamed from: lambda$-348806137, reason: not valid java name */
    public static final ComposableLambdaImpl f700lambda$348806137;

    /* renamed from: lambda$-465933591, reason: not valid java name */
    public static final ComposableLambdaImpl f701lambda$465933591;

    /* renamed from: lambda$-515032236, reason: not valid java name */
    public static final ComposableLambdaImpl f702lambda$515032236;

    /* renamed from: lambda$-713634903, reason: not valid java name */
    public static final ComposableLambdaImpl f703lambda$713634903;

    /* renamed from: lambda$-754111797, reason: not valid java name */
    public static final ComposableLambdaImpl f704lambda$754111797;
    public static final ComposableLambdaImpl lambda$1089689742;
    public static final ComposableLambdaImpl lambda$1457024423;
    public static final ComposableLambdaImpl lambda$1589843485;
    public static final ComposableLambdaImpl lambda$1605808;
    public static final ComposableLambdaImpl lambda$165823103;
    public static final ComposableLambdaImpl lambda$1799708778;
    public static final ComposableLambdaImpl lambda$242623696;
    public static final ComposableLambdaImpl lambda$37200767;
    public static final ComposableLambdaImpl lambda$383647945;
    public static final ComposableLambdaImpl lambda$551363642;
    public static final ComposableLambdaImpl lambda$686376222;
    public static final ComposableLambdaImpl lambda$875257900;
    public static final ComposableLambdaImpl lambda$94418302 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(14), false, 94418302);

    /* renamed from: lambda$-859728966, reason: not valid java name */
    public static final ComposableLambdaImpl f705lambda$859728966 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(7), false, -859728966);
    public static final ComposableLambdaImpl lambda$708685509 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(8), false, 708685509);
    public static final ComposableLambdaImpl lambda$877963016 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(9), false, 877963016);
    public static final ComposableLambdaImpl lambda$1927832231 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(10), false, 1927832231);
    public static final ComposableLambdaImpl lambda$1096892200 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(11), false, 1096892200);

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenshotReviewViewModel.UploadStatus.values().length];
            try {
                ScreenshotReviewViewModel.UploadStatus uploadStatus = ScreenshotReviewViewModel.UploadStatus.UPLOADING;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ScreenshotReviewViewModel.UploadStatus uploadStatus2 = ScreenshotReviewViewModel.UploadStatus.UPLOADING;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ScreenshotReviewViewModel.UploadStatus uploadStatus3 = ScreenshotReviewViewModel.UploadStatus.UPLOADING;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(15), false, 1156919709);
        lambda$1799708778 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(12), false, 1799708778);
        lambda$1589843485 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(20), false, 1589843485);
        f694lambda$1577485937 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(21), false, -1577485937);
        lambda$1605808 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(13), false, 1605808);
        lambda$1457024423 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(14), false, 1457024423);
        f696lambda$1778010247 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(15), false, -1778010247);
        f689lambda$11833360 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(16), false, -11833360);
        lambda$242623696 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(17), false, 242623696);
        lambda$686376222 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(18), false, 686376222);
        f695lambda$1734210168 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(19), false, -1734210168);
        new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(16), false, -1289076700);
        new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(17), false, -381966722);
        new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(18), false, 1649189661);
        new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(19), false, -1602159388);
        new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(20), false, -1943800168);
        new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(21), false, -2044603047);
        new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(22), false, 931260639);
        f700lambda$348806137 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(22), false, -348806137);
        lambda$875257900 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(23), false, 875257900);
        f701lambda$465933591 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(24), false, -465933591);
        lambda$1089689742 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(23), false, 1089689742);
        f692lambda$1440766607 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(25), false, -1440766607);
        f697lambda$185984590 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(26), false, -185984590);
        lambda$383647945 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(24), false, 383647945);
        f690lambda$1306729248 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(27), false, -1306729248);
        f693lambda$1532292486 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(28), false, -1532292486);
        f702lambda$515032236 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(25), false, -515032236);
        f698lambda$1890950155 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(26), false, -1890950155);
        lambda$551363642 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(27), false, 551363642);
        new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(29), false, -1464556514);
        new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(1), false, -1459492091);
        f691lambda$1434795663 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(28), false, -1434795663);
        lambda$165823103 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(29), false, 165823103);
        lambda$37200767 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(2), false, 37200767);
        f699lambda$1974654492 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(3), false, -1974654492);
        f688lambda$1161506885 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(1), false, -1161506885);
        f704lambda$754111797 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(4), false, -754111797);
        f703lambda$713634903 = new ComposableLambdaImpl(new ArticleViewKt$$ExternalSyntheticLambda10(5), false, -713634903);
    }

    public static final void ButtonBox(PhoneVerificationViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-739223381);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(OffsetKt.windowInsetsPadding(fillMaxWidth, new LimitInsets(Arrangement$End$1.current(gapComposer).systemBars, 32)), 16.0f, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            if (loaded.status == PhoneVerificationViewModel.Loaded.Status.RESPONDING) {
                gapComposer.startReplaceGroup(-210996280);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                ProgressCircularKt.ProgressCircular(0, 0, gapComposer, BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center));
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-210868467);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(1794313771);
            List list = loaded.buttons;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                VerificationButtons(loaded.status, (PhoneVerificationViewModel.Loaded.ButtonViewModel) it.next(), function1, gapComposer, (i2 << 3) & 896);
                arrayList.add(Unit.INSTANCE);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(loaded, function1, i, 5);
        }
    }

    public static final void ButtonOrSubmitting(ContactSupportEmailMessageViewModel$Editing contactSupportEmailMessageViewModel$Editing, Function1 function1, TextFieldState textFieldState, Composer composer, int i) {
        Modifier modifier;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(619792582);
        int i2 = i | (gapComposer.changedInstance(contactSupportEmailMessageViewModel$Editing) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | (gapComposer.changed(textFieldState) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            Modifier windowInsetsPadding = OffsetKt.windowInsetsPadding(m298padding3ABfNKs, new LimitInsets(Arrangement$End$1.current(gapComposer).systemBars, 32));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, windowInsetsPadding);
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
            if (contactSupportEmailMessageViewModel$Editing.isSubmitting) {
                gapComposer.startReplaceGroup(2102418150);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(false);
                modifier = null;
            } else {
                gapComposer.startReplaceGroup(2102474198);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                boolean z = textFieldState.getValue$foundation().text.length() > 0;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                boolean changed = ((i3 & 896) == 256) | gapComposer.changed(delegatingSoftwareKeyboardController) | ((i3 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BasicShieetScope$$ExternalSyntheticLambda10(23, delegatingSoftwareKeyboardController, function1, textFieldState);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier = null;
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, lambda$708685509, gapComposer, 1573296, 40);
                gapComposer.end(false);
            }
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, modifier);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(contactSupportEmailMessageViewModel$Editing, function1, textFieldState, i, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Dispute(DisputeRow disputeRow, Function1 function1, Composer composer, int i) {
        int i2;
        Icons icons;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object rememberedValue2;
        disputeRow.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(805344918);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(disputeRow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int ordinal = disputeRow.transactionType.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    icons = Icons.CardBasic24;
                } else if (ordinal == 2) {
                    icons = Icons.CashAppPay24;
                } else if (ordinal == 3) {
                    icons = null;
                } else if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                String str = disputeRow.displayName;
                String str2 = disputeRow.status;
                String str3 = disputeRow.date;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2055129648, new TabToolbarsKt$$ExternalSyntheticLambda3(14, disputeRow, icons), gapComposer);
                int i3 = i2 & 14;
                z = i3 != 4;
                rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (!z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new RealSandboxer$$ExternalSyntheticLambda0(disputeRow, 27);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function12 = (Function1) rememberedValue;
                z2 = ((i2 & 112) != 32) | (i3 != 4);
                rememberedValue2 = gapComposer.rememberedValue();
                if (!z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TaxWebAppBridge$$ExternalSyntheticLambda0(7, function1, disputeRow);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                CellDefaultKt.m3389CellActivityGZm5OLo(rememberComposableLambda, str, function12, (Function0) rememberedValue2, null, null, str2, str3, true, 0, 0L, gapComposer, 100663302, 1584);
            }
            icons = Icons.CurrencyUsd24;
            String str4 = disputeRow.displayName;
            String str22 = disputeRow.status;
            String str32 = disputeRow.date;
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-2055129648, new TabToolbarsKt$$ExternalSyntheticLambda3(14, disputeRow, icons), gapComposer);
            int i32 = i2 & 14;
            if (i32 != 4) {
            }
            rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (!z) {
            }
            rememberedValue = new RealSandboxer$$ExternalSyntheticLambda0(disputeRow, 27);
            gapComposer.updateRememberedValue(rememberedValue);
            Function1 function122 = (Function1) rememberedValue;
            z2 = ((i2 & 112) != 32) | (i32 != 4);
            rememberedValue2 = gapComposer.rememberedValue();
            if (!z2) {
            }
            rememberedValue2 = new TaxWebAppBridge$$ExternalSyntheticLambda0(7, function1, disputeRow);
            gapComposer.updateRememberedValue(rememberedValue2);
            CellDefaultKt.m3389CellActivityGZm5OLo(rememberComposableLambda2, str4, function122, (Function0) rememberedValue2, null, null, str22, str32, true, 0, 0L, gapComposer, 100663302, 1584);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(disputeRow, function1, i, 1);
        }
    }

    public static final void DisputesTracker(SupportDisputeTrackerViewModel supportDisputeTrackerViewModel, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Function1 function12;
        int i4;
        Function1 function13;
        Function1 function14;
        supportDisputeTrackerViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2137553008);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer.changedInstance(supportDisputeTrackerViewModel) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
            function12 = function1;
        } else {
            function12 = function1;
            i4 = i3 | (gapComposer.changedInstance(function12) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (i5 != 0) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(26);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function14 = (Function1) rememberedValue;
            } else {
                function14 = function12;
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            NavigationType navigationType = NavigationType.BACK;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z = (i4 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(18, function14);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub(f690lambda$1306729248, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer, 438, 104);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (supportDisputeTrackerViewModel.equals(SupportDisputeTrackerViewModel.Loading.INSTANCE)) {
                gapComposer.startReplaceGroup(-1930376507);
                DisputesTrackerLoadingContent(gapComposer, 0);
                gapComposer.end(false);
            } else if (supportDisputeTrackerViewModel.equals(SupportDisputeTrackerViewModel.Failed.INSTANCE)) {
                gapComposer.startReplaceGroup(-1930374965);
                DisputesTrackerFailedContent(function14, gapComposer, (i4 >> 3) & 14);
                gapComposer.end(false);
            } else {
                if (!(supportDisputeTrackerViewModel instanceof SupportDisputeTrackerViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1930377375, false);
                }
                gapComposer.startReplaceGroup(-1930373134);
                DisputesTrackerLoadedContent((SupportDisputeTrackerViewModel.Loaded) supportDisputeTrackerViewModel, function14, gapComposer, i4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            function13 = function14;
        } else {
            gapComposer.skipToGroupEnd();
            function13 = function12;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(supportDisputeTrackerViewModel, function13, i, i2, 16);
        }
    }

    public static final void DisputesTrackerFailedContent(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-685098695);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String stringResource = Room.stringResource(gapComposer, R.string.support_dispute_tracker_confirmation_button_talkback);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            Countries.PageHeader(Room.stringResource(gapComposer, R.string.support_dispute_tracker_error_title), (Modifier) null, f693lambda$1532292486, Room.stringResource(gapComposer, R.string.support_dispute_tracker_error_subtitle), gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerBetweenSectionLarge(0, 0, gapComposer, new LayoutWeightElement(1.0f, true));
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, 16.0f);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(stringResource, 25);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m299paddingVpY3zN4, false, (Function1) rememberedValue);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(19, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, semantics, null, false, false, null, f702lambda$515032236, gapComposer, 1572864, 60);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayFirstTimeKt$$ExternalSyntheticLambda1(i, 2, function1);
        }
    }

    public static final void DisputesTrackerLoadedContent(SupportDisputeTrackerViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        int i3;
        loaded.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-26772630);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            int i4 = i2 & 14;
            int i5 = i2 & 112;
            boolean changed = (i5 == 32) | gapComposer2.changed(rememberLazyListState) | (i4 == 4);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                ArticlePresenter$models$1$1 articlePresenter$models$1$1 = new ArticlePresenter$models$1$1(rememberLazyListState, loaded, function1, (Continuation) null, 26);
                gapComposer2.updateRememberedValue(articlePresenter$models$1$1);
                rememberedValue = articlePresenter$models$1$1;
            }
            Updater.LaunchedEffect(gapComposer2, rememberLazyListState, (Function2) rememberedValue);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z = (i4 == 4) | (i5 == 32);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BottomSheet$$ExternalSyntheticLambda3(15, loaded, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            i3 = 2;
            LazyDslKt.LazyColumn(fillMaxSize, rememberLazyListState, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, 6, 508);
        } else {
            gapComposer = gapComposer2;
            i3 = 2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(loaded, function1, i, i3);
        }
    }

    public static final void DisputesTrackerLoadingContent(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-453856293);
        Applier applier = gapComposer.applier;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer, R.string.support_dispute_tracker_title), (Modifier) null, (String) null, (Function0) null, Room.stringResource(gapComposer, R.string.support_dispute_tracker_subtitle), gapComposer, 0, 14);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArticleViewKt$$ExternalSyntheticLambda10(i, 8);
        }
    }

    public static final void EditingMessage(ContactSupportEmailMessageViewModel$Editing contactSupportEmailMessageViewModel$Editing, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        int i2;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        NeverEqualPolicy neverEqualPolicy;
        Modifier.Companion companion;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        TextFieldState textFieldState;
        float f;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        int i3;
        boolean z;
        ContactSupportEmailMessageViewModel$Editing contactSupportEmailMessageViewModel$Editing2 = contactSupportEmailMessageViewModel$Editing;
        Function1 function12 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1213032458);
        Applier applier = gapComposer2.applier;
        int i4 = i | (gapComposer2.changedInstance(contactSupportEmailMessageViewModel$Editing2) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function12) ? 32 : 16;
        }
        int i5 = i4;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(null, 0L, gapComposer2, 0, 3);
            GapComposer gapComposer3 = gapComposer2;
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            int i6 = i5 & 112;
            boolean changed = (i6 == 32) | gapComposer3.changed(m382rememberTextFieldStateLepunE);
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new MusicViewKt$LoadedMusicContent$1$1(function12, m382rememberTextFieldStateLepunE, (Continuation) null, 16);
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer3, charSequence, (Function2) rememberedValue);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
            } else {
                gapComposer3.startReplaceGroup(-1762997739);
                gapComposer3.end(false);
            }
            Modifier imePadding = SpacerKt.imePadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, imePadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$16);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$17);
            ContactSupportEmailMessageViewModel$Editing.StatusResult statusResult = contactSupportEmailMessageViewModel$Editing2.statusResult;
            if (statusResult == null) {
                statusResult = null;
            }
            if (statusResult == null) {
                gapComposer3.startReplaceGroup(2026322609);
                i3 = 0;
                gapComposer3.end(false);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                i2 = i6;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                textFieldState = m382rememberTextFieldStateLepunE;
                neverEqualPolicy = neverEqualPolicy2;
                companion = companion2;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                f = 1.0f;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
            } else {
                gapComposer3.startReplaceGroup(2026322610);
                boolean z2 = i6 == 32;
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy2) {
                    rememberedValue2 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(27, function12);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                Function0 function0 = (Function0) rememberedValue2;
                boolean z3 = i6 == 32;
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy2) {
                    rememberedValue3 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(28, function12);
                    gapComposer3.updateRememberedValue(rememberedValue3);
                }
                i2 = i6;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                neverEqualPolicy = neverEqualPolicy2;
                companion = companion2;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                textFieldState = m382rememberTextFieldStateLepunE;
                f = 1.0f;
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                ArcadeModal2Kt.Modal(null, contactSupportEmailMessageViewModel$Editing, function0, (Function0) rememberedValue3, false, false, Expect_jvmKt.rememberComposableLambda(-1531639426, new TabToolbarsKt$$ExternalSyntheticLambda3(8, function12, statusResult), gapComposer3), gapComposer3, ((i5 << 3) & 112) | 1572864, 49);
                gapComposer3 = gapComposer3;
                i3 = 0;
                gapComposer3.end(false);
            }
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(f, SizeKt.fillMaxWidth(companion, f), true);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, i3);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$12, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$1);
            NavigationType navigationType = NavigationType.BACK;
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController3 = delegatingSoftwareKeyboardController;
            boolean changed2 = gapComposer3.changed(delegatingSoftwareKeyboardController3) | (i2 == 32);
            Object rememberedValue4 = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
            if (changed2 || rememberedValue4 == neverEqualPolicy3) {
                rememberedValue4 = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController3, function1, 25);
                gapComposer3.updateRememberedValue(rememberedValue4);
            }
            GapComposer gapComposer4 = gapComposer3;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, (Function3) null, gapComposer4, 54, 108);
            gapComposer = gapComposer4;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(Room.stringResource(gapComposer, R.string.arcade_contact_support_message_title), (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            String stringResource = Room.stringResource(gapComposer, R.string.contact_support_message_hint);
            Modifier focusRequester = FocusTraversalKt.focusRequester(SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), f), DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer));
            TextFieldState textFieldState2 = textFieldState;
            boolean changed3 = gapComposer.changed(textFieldState2);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue5 == neverEqualPolicy3) {
                rememberedValue5 = new TapToPayInitiatorNotesKt$$ExternalSyntheticLambda4(1, textFieldState2);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Modifier semantics = SemanticsModifierKt.semantics(focusRequester, false, (Function1) rememberedValue5);
            boolean z4 = contactSupportEmailMessageViewModel$Editing.showMinimumCharactersNotMetMessage;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 7, (Boolean) null, 119);
            boolean changed4 = gapComposer.changed(delegatingSoftwareKeyboardController3);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue6 == neverEqualPolicy3) {
                z = true;
                rememberedValue6 = new ContactSupportEmailInputViewKt$$ExternalSyntheticLambda4(delegatingSoftwareKeyboardController3, 1);
                gapComposer.updateRememberedValue(rememberedValue6);
            } else {
                z = true;
            }
            function12 = function1;
            contactSupportEmailMessageViewModel$Editing2 = contactSupportEmailMessageViewModel$Editing;
            InputAreaKt.InputArea(textFieldState2, semantics, false, false, z4, null, Expect_jvmKt.rememberComposableLambda(-318580884, new TaxReturnsViewKt$$ExternalSyntheticLambda5(contactSupportEmailMessageViewModel$Editing, 3), gapComposer), stringResource, keyboardOptions, (KeyboardActionHandler) rememberedValue6, null, null, null, null, null, gapComposer, 102236160, 0, 31788);
            gapComposer.end(z);
            ButtonOrSubmitting(contactSupportEmailMessageViewModel$Editing2, function12, textFieldState2, gapComposer, i5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(z);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(contactSupportEmailMessageViewModel$Editing2, function12, i, 23);
        }
    }

    public static final void FailedMessageSubmitDialog(int i, Composer composer, Modifier modifier, String str, String str2, String str3, Function0 function0) {
        Modifier modifier2;
        function0.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-405909622);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(str3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 >> 3;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ModalKt.Modal(companion, str, str2, Expect_jvmKt.rememberComposableLambda(1307222502, new ArcadeInfoBlockerKt$$ExternalSyntheticLambda0(function0, str3, 3), gapComposer), (Function3) null, (Function3) null, gapComposer, (i3 & 112) | 3078 | (i3 & 896), 48);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShopErrorKt$$ExternalSyntheticLambda1(modifier2, function0, str, str2, str3, i, 2);
        }
    }

    public static final void FullScreenActivityPickerHeader(String str, String str2, Composer composer, int i) {
        String str3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1416893552);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
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
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 16.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4088, 0L, (Composer) gapComposer, m302paddingqDBjuR0$default, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).sectionTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            if (str2 != null) {
                gapComposer.startReplaceGroup(-114891600);
                str3 = str2;
                Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 8.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                str3 = str2;
                gapComposer.startReplaceGroup(-114720356);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            str3 = str2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PreviewActivity$$ExternalSyntheticLambda1(str, i, 5, str3);
        }
    }

    public static final void InvalidEmailDialog(int i, Composer composer, Modifier modifier, String str, String str2, String str3, Function0 function0) {
        Modifier modifier2;
        function0.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(694464230);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(str3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 >> 3;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ModalKt.Modal(companion, str, str2, Expect_jvmKt.rememberComposableLambda(1755120906, new ArcadeInfoBlockerKt$$ExternalSyntheticLambda0(function0, str3, 2), gapComposer), (Function3) null, (Function3) null, gapComposer, (i3 & 112) | 3078 | (i3 & 896), 48);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShopErrorKt$$ExternalSyntheticLambda1(modifier2, function0, str, str2, str3, i, 1);
        }
    }

    public static final void LoadMoreProgress(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(275523097);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f), 32.0f), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            endRestartGroup.block = new ArticleViewKt$$ExternalSyntheticLambda10(i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    public static final void Loaded(ContactSupportEmailInputViewModel$Loaded contactSupportEmailInputViewModel$Loaded, Function1 function1, Composer composer, int i) {
        ContactSupportEmailInputViewModel$Loaded contactSupportEmailInputViewModel$Loaded2;
        Function1 function12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        BiasAlignment.Horizontal horizontal;
        NeverEqualPolicy neverEqualPolicy;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Arrangement$Top$1 arrangement$Top$1;
        ContactSupportEmailInputViewModel$Loaded.ViewMode viewMode;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        int i2;
        ?? r9;
        String str;
        MutableState mutableState;
        ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState editEmailState;
        boolean z;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1096710016);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(contactSupportEmailInputViewModel$Loaded) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Object[] objArr = new Object[0];
            boolean changedInstance = gapComposer.changedInstance(contactSupportEmailInputViewModel$Loaded);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new PageTagSlotKt$$ExternalSyntheticLambda0(contactSupportEmailInputViewModel$Loaded, 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE((String) mutableState2.getValue(), 0L, gapComposer, 0, 2);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
            int i5 = i4 & 112;
            boolean changed = gapComposer.changed(mutableState2) | gapComposer.changed(m382rememberTextFieldStateLepunE) | (i5 == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new OffersSearchViewKt$OffersSearchView$1$1(m382rememberTextFieldStateLepunE, function1, mutableState2, null);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, charSequence, (Function2) rememberedValue2);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier imePadding = SpacerKt.imePadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, imePadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$16);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$17);
            ContactSupportEmailInputViewModel$Loaded.ViewMode viewMode2 = contactSupportEmailInputViewModel$Loaded.viewMode;
            ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState editEmailState2 = viewMode2 instanceof ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit ? ((ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit) viewMode2).state : null;
            if (editEmailState2 == null) {
                editEmailState2 = null;
            }
            ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Failure failure = editEmailState2 instanceof ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Failure ? (ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Failure) editEmailState2 : null;
            if (failure == null) {
                gapComposer.startReplaceGroup(-1072582096);
                i2 = 0;
                gapComposer.end(false);
                contactSupportEmailInputViewModel$Loaded2 = contactSupportEmailInputViewModel$Loaded;
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                viewMode = viewMode2;
                arrangement$Top$1 = arrangement$Top$12;
                horizontal = horizontal2;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                neverEqualPolicy = neverEqualPolicy2;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$14;
                companion = companion2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
            } else {
                gapComposer.startReplaceGroup(-1072582095);
                boolean z3 = i5 == 32;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z3 || rememberedValue3 == neverEqualPolicy2) {
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                    rememberedValue3 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(24, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                } else {
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                }
                Function0 function0 = (Function0) rememberedValue3;
                boolean z4 = i5 == 32;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z4 || rememberedValue4 == neverEqualPolicy2) {
                    rememberedValue4 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(25, function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                horizontal = horizontal2;
                neverEqualPolicy = neverEqualPolicy2;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                arrangement$Top$1 = arrangement$Top$12;
                viewMode = viewMode2;
                delegatingSoftwareKeyboardController = delegatingSoftwareKeyboardController2;
                companion = companion2;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$14;
                ArcadeModal2Kt.Modal(null, contactSupportEmailInputViewModel$Loaded, function0, (Function0) rememberedValue4, false, false, Expect_jvmKt.rememberComposableLambda(158633404, new TabToolbarsKt$$ExternalSyntheticLambda3(7, function1, failure), gapComposer), gapComposer, ((i4 << 3) & 112) | 1572864, 49);
                gapComposer = gapComposer;
                i2 = 0;
                contactSupportEmailInputViewModel$Loaded2 = contactSupportEmailInputViewModel$Loaded;
                gapComposer.end(false);
            }
            Modifier imePadding2 = SpacerKt.imePadding(companion);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, i2);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, imePadding2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$16, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
            String str2 = contactSupportEmailInputViewModel$Loaded2.title;
            ContactSupportEmailInputViewModel$Loaded.ViewMode viewMode3 = viewMode;
            if (Intrinsics.areEqual(viewMode3, ContactSupportEmailInputViewModel$Loaded.ViewMode.Review.INSTANCE)) {
                r9 = 0;
                str = re$$ExternalSyntheticOutline0.m(gapComposer, 901751323, R.string.contact_support_email_input_editing_body, gapComposer, false);
            } else {
                r9 = 0;
                gapComposer.startReplaceGroup(901845656);
                gapComposer.end(false);
                str = null;
            }
            GapComposer gapComposer2 = gapComposer;
            Countries.PageHeader(str2, (Modifier) null, (Function2) null, str, gapComposer2, 0, 6);
            gapComposer = gapComposer2;
            boolean z5 = viewMode3 instanceof ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit;
            if (z5) {
                gapComposer.startReplaceGroup(901934099);
                editEmailState = null;
                DBUtil.SpacerWithinSectionMedium(r9, 1, gapComposer, null);
                String stringResource = Room.stringResource(gapComposer, R.string.contact_support_email_input_hint);
                Modifier focusRequester = FocusTraversalKt.focusRequester(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer));
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 6, 7, (Boolean) null, 115);
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController3 = delegatingSoftwareKeyboardController;
                boolean changed2 = gapComposer.changed(delegatingSoftwareKeyboardController3);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue5 == neverEqualPolicy) {
                    z2 = false;
                    rememberedValue5 = new ContactSupportEmailInputViewKt$$ExternalSyntheticLambda4(delegatingSoftwareKeyboardController3, 0);
                    gapComposer.updateRememberedValue(rememberedValue5);
                } else {
                    z2 = false;
                }
                KeyboardActionHandler keyboardActionHandler = (KeyboardActionHandler) rememberedValue5;
                mutableState = mutableState2;
                z = true;
                InputFieldKt.InputField(m382rememberTextFieldStateLepunE, focusRequester, false, false, false, null, null, null, null, stringResource, keyboardOptions, keyboardActionHandler, null, null, null, null, gapComposer, 0, 6, 61948);
                gapComposer.end(z2);
            } else {
                boolean z6 = r9;
                mutableState = mutableState2;
                editEmailState = null;
                z = true;
                gapComposer.startReplaceGroup(902457472);
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$94418302, Expect_jvmKt.rememberComposableLambda(-906637569, new TaxTooltipView$$ExternalSyntheticLambda0(5, contactSupportEmailInputViewModel$Loaded2, mutableState), gapComposer), null, null, false, false, null, null, null, 0L, gapComposer, 54, 4092);
                gapComposer.end(z6);
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, z));
            ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState editEmailState3 = z5 ? ((ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit) viewMode3).state : editEmailState;
            if (editEmailState3 == null) {
                editEmailState3 = editEmailState;
            }
            function12 = function1;
            ButtonBox(z5, editEmailState3 instanceof ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Verifying, contactSupportEmailInputViewModel$Loaded2.nextButtonEnabled, (String) mutableState.getValue(), function12, gapComposer, 57344 & (i4 << 9));
            gapComposer.end(z);
            gapComposer.end(z);
        } else {
            contactSupportEmailInputViewModel$Loaded2 = contactSupportEmailInputViewModel$Loaded;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(contactSupportEmailInputViewModel$Loaded2, function12, i, 22);
        }
    }

    public static final void LoadedList(ScreenshotReviewViewModel screenshotReviewViewModel, Function1 function1, Composer composer, int i) {
        ScreenshotReviewViewModel screenshotReviewViewModel2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2051036020);
        int i2 = (gapComposer.changedInstance(screenshotReviewViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(25);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            screenshotReviewViewModel2 = screenshotReviewViewModel;
            function12 = function1;
            ScreenshotList(screenshotReviewViewModel2, function12, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(1168948336, new TabToolbarsKt$$ExternalSyntheticLambda3(10, screenshotReviewViewModel, function1), gapComposer), gapComposer, (i2 & 14) | 3456 | (i2 & 112));
        } else {
            screenshotReviewViewModel2 = screenshotReviewViewModel;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScreenshotReviewViewKt$$ExternalSyntheticLambda3(screenshotReviewViewModel2, function12, i, 1);
        }
    }

    public static final void Loading(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-240957861);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            int i3 = i2;
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z = (i3 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda8(3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(f704lambda$754111797, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayFirstTimeKt$$ExternalSyntheticLambda1(i, 4, function1);
        }
    }

    public static final void LoadingUi(Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1173315755);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardNullStateKt$$ExternalSyntheticLambda8(i, 6, function1);
        }
    }

    public static final void OptionCells(SupportHomeContactOptionsSheetViewModel supportHomeContactOptionsSheetViewModel, Function1 function1, Composer composer, int i) {
        Pair pair;
        long j;
        ComposableLambdaImpl composableLambdaImpl;
        Icons icons;
        supportHomeContactOptionsSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(383794412);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(supportHomeContactOptionsSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i4 = 1;
        boolean z = false;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
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
            gapComposer.startReplaceGroup(852583168);
            for (SupportHomeContactOptionsSheetViewModel.ContactOption contactOption : supportHomeContactOptionsSheetViewModel.contactOptions) {
                int ordinal = contactOption.f1209type.ordinal();
                if (ordinal == 0) {
                    pair = new Pair(Icons.CommSms24, SupportHomeContactOptionsSheetEvents.ChatClicked.INSTANCE);
                } else {
                    if (ordinal != i4) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    pair = new Pair(Icons.CommPhoneFill24, SupportHomeContactOptionsSheetEvents.PhoneClicked.INSTANCE);
                }
                Icons icons2 = (Icons) pair.first;
                SupportHomeContactOptionsSheetEvents supportHomeContactOptionsSheetEvents = (SupportHomeContactOptionsSheetEvents) pair.second;
                if (contactOption.enabled) {
                    gapComposer.startReplaceGroup(1093461596);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(z);
                    }
                    j = colors.semantic.background.brand;
                    gapComposer.end(z);
                } else {
                    gapComposer.startReplaceGroup(1093537019);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(z);
                    }
                    j = colors2.semantic.background.subtle;
                    gapComposer.end(z);
                }
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z);
                }
                long j2 = colors3.semantic.icon.inverse;
                String str = contactOption.subtitle;
                if (str == null) {
                    gapComposer.startReplaceGroup(1093788118);
                    gapComposer.end(z);
                    composableLambdaImpl = null;
                } else {
                    gapComposer.startReplaceGroup(1093788119);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(193151713, new PastPaySectionKt$$ExternalSyntheticLambda1(str, i2), gapComposer);
                    gapComposer.end(z);
                    composableLambdaImpl = rememberComposableLambda;
                }
                Badge.Small small = contactOption.hasNotificationBadge ? Badge.Small.INSTANCE : null;
                CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                boolean z2 = contactOption.enabled;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    icons = icons2;
                    rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(27);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    icons = icons2;
                }
                Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1274708069, new SheetKt$$ExternalSyntheticLambda6(contactOption, 24), gapComposer);
                boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(supportHomeContactOptionsSheetEvents);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new TaxWebAppBridge$$ExternalSyntheticLambda0(8, function1, supportHomeContactOptionsSheetEvents);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j, rememberComposableLambda2, semantics, j2, (Function0) rememberedValue2, null, z2, false, composableLambdaImpl, small, push, 0L, null, gapComposer2, 3120, MLKEMEngine.KyberPolyBytes, 25216);
                i2 = 2;
                i4 = 1;
                z = false;
                gapComposer = gapComposer2;
                companion = companion;
            }
            gapComposer.end(z);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportHomeContactOptionsSheetKt$$ExternalSyntheticLambda0(supportHomeContactOptionsSheetViewModel, function1, i, 2);
        }
    }

    /* renamed from: PlaceHolderBox-i1RSzL4, reason: not valid java name */
    public static final void m3752PlaceHolderBoxi1RSzL4(float f, float f2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1800310410);
        if (gapComposer.shouldExecute(i & 1, (i & 19) != 18)) {
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 4.0f), f, f2);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(m287sizeVpY3zN4, colors.semantic.background.subtle, RoundedCornerShapeKt.RoundedCornerShape(24)), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaySectionViewKt$$ExternalSyntheticLambda4(f, f2, i, 1);
        }
    }

    public static final void PrimaryButton(int i, Composer composer, final SupportPhoneStatusViewModel.Loaded loaded, final Function1 function1) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-37637481);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int ordinal = loaded.activeStatus.ordinal();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                        if (ordinal != 5) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1809876325, false);
                        }
                    }
                }
                gapComposer.startReplaceGroup(-271322455);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new Function0() { // from class: com.squareup.cash.support.views.SupportPhoneStratusViewKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i4 = r3;
                            SupportPhoneStatusViewModel.Loaded loaded2 = loaded;
                            Function1 function12 = function1;
                            switch (i4) {
                                case 0:
                                    function12.invoke(loaded2.button.event);
                                    break;
                                default:
                                    function12.invoke(loaded2.button.event);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(865689053, new Function3() { // from class: com.squareup.cash.support.views.SupportPhoneStratusViewKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i4 = r2;
                        SupportPhoneStatusViewModel.Loaded loaded2 = loaded;
                        switch (i4) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.button.text, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((RowScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.button.text, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 1573296, 56);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(-271517228);
            int i4 = ((i2 & 112) == 32 ? 1 : 0) | ((i2 & 14) != 4 ? 0 : 1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (i4 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new Function0() { // from class: com.squareup.cash.support.views.SupportPhoneStratusViewKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i42 = i3;
                        SupportPhoneStatusViewModel.Loaded loaded2 = loaded;
                        Function1 function12 = function1;
                        switch (i42) {
                            case 0:
                                function12.invoke(loaded2.button.event);
                                break;
                            default:
                                function12.invoke(loaded2.button.event);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(408711412, new Function3() { // from class: com.squareup.cash.support.views.SupportPhoneStratusViewKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i42 = i3;
                    SupportPhoneStatusViewModel.Loaded loaded2 = loaded;
                    switch (i42) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.button.text, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            ((RowScope) obj).getClass();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded2.button.text, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 1572912, 60);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportPhoneStratusViewKt$$ExternalSyntheticLambda8(loaded, function1, i, 2);
        }
    }

    public static final void ScreenshotConfirm(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(300789463);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Unit unit = Unit.INSTANCE;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean z2 = i3 == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(1, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ArcadeModal2Kt.Modal(null, unit, function0, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(1394613495, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(28, function1), gapComposer), gapComposer, 1572912, 49);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayFirstTimeKt$$ExternalSyntheticLambda1(i, 1, function1);
        }
    }

    public static final void ScreenshotList(ScreenshotReviewViewModel screenshotReviewViewModel, Function1 function1, Function1 function12, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(308780706);
        int i2 = (gapComposer.changedInstance(screenshotReviewViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(483987116, new WorkWebViewKt$$ExternalSyntheticLambda14(3, function1), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1324899685, new StripeThemeKt$$ExternalSyntheticLambda2(composableLambdaImpl, 6), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(screenshotReviewViewModel) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardTransitionKt$$ExternalSyntheticLambda4(12, screenshotReviewViewModel, function1, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ScreenScaffoldKt.ScreenScaffoldLazy(m177backgroundbw27NRU, null, null, rememberComposableLambda, rememberComposableLambda2, (Function1) rememberedValue, gapComposer, 27648, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(screenshotReviewViewModel, function1, function12, composableLambdaImpl, i, 22);
        }
    }

    public static final void ScreenshotReview(ScreenshotReviewViewModel screenshotReviewViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(765962575);
        int i2 = (gapComposer.changedInstance(screenshotReviewViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else if (screenshotReviewViewModel instanceof ScreenshotReviewViewModel.Loaded) {
            gapComposer.startReplaceGroup(1650632421);
            Loaded((ScreenshotReviewViewModel.Loaded) screenshotReviewViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else if (screenshotReviewViewModel instanceof ScreenshotReviewViewModel.ViewingScreenshot) {
            gapComposer.startReplaceGroup(1650634895);
            ScreenshotViewed((ScreenshotReviewViewModel.ViewingScreenshot) screenshotReviewViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else if (screenshotReviewViewModel instanceof ScreenshotReviewViewModel.Uploading) {
            gapComposer.startReplaceGroup(1650637416);
            Uploading((ScreenshotReviewViewModel.Uploading) screenshotReviewViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else if (screenshotReviewViewModel instanceof ScreenshotReviewViewModel.Uploaded) {
            gapComposer.startReplaceGroup(1650639687);
            Uploaded((ScreenshotReviewViewModel.Uploaded) screenshotReviewViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        } else {
            if (!(screenshotReviewViewModel instanceof ScreenshotReviewViewModel.UploadFailed)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1650630934, false);
            }
            gapComposer.startReplaceGroup(1650642059);
            UploadFailed((ScreenshotReviewViewModel.UploadFailed) screenshotReviewViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScreenshotReviewViewKt$$ExternalSyntheticLambda3(screenshotReviewViewModel, function1, i, 0);
        }
    }

    public static final void ScreenshotReviewContent(ScreenshotReviewViewModel screenshotReviewViewModel, Function1 function1, Composer composer, int i) {
        screenshotReviewViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(468125904);
        int i2 = (gapComposer.changedInstance(screenshotReviewViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(0, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1662464091, new SupportViewFactory$$ExternalSyntheticLambda1(screenshotReviewViewModel, function1, 1, (byte) 0), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportViewFactory$$ExternalSyntheticLambda1(screenshotReviewViewModel, function1, i);
        }
    }

    public static final void ScreenshotRow(LazyItemScopeImpl lazyItemScopeImpl, ScreenshotReviewViewModel.Screenshot screenshot, Function1 function1, CellDefaultAccessory cellDefaultAccessory, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-620574079);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(lazyItemScopeImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(screenshot) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(cellDefaultAccessory) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, Modifier.Companion.$$INSTANCE);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(548517487, new TaxTooltipView$$ExternalSyntheticLambda0(7, screenshot, function1), gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1274669776, new ScreenshotReviewViewKt$$ExternalSyntheticLambda22(screenshot, 3), gapComposer2);
            boolean changedInstance = gapComposer2.changedInstance(screenshot) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TaxWebAppBridge$$ExternalSyntheticLambda0(6, screenshot, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, animateItem$default, (Function0) rememberedValue, false, false, null, null, cellDefaultAccessory, 0L, gapComposer, ((i2 << 18) & 1879048192) | 54, 3568);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(lazyItemScopeImpl, i, screenshot, function1, cellDefaultAccessory, 23);
        }
    }

    public static final void ScreenshotViewed(ScreenshotReviewViewModel.ViewingScreenshot viewingScreenshot, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-912062824);
        int i2 = (gapComposer.changedInstance(viewingScreenshot) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            int i3 = i2 & 112;
            LoadedList(viewingScreenshot, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, colors.component.ui.dimmer.background, ColorKt.RectangleShape), 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            boolean z = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(3, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AsyncImageKt.m1443SubcomposeAsyncImageQgsmV_s(viewingScreenshot.viewScreenshotUri, null, (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), ImageKt.m182clickableO2vRcR0$default(fillMaxSize2, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue2, 28), Alignment.Companion.Center, null, f689lambda$11833360, gapComposer, 1572912, 4016);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(viewingScreenshot, function1, i, 25);
        }
    }

    public static final void SheetContent(SupportArticleIncidentsSheetViewModel supportArticleIncidentsSheetViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer;
        SupportArticleIncidentsSheetViewModel supportArticleIncidentsSheetViewModel2;
        supportArticleIncidentsSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1657912387);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changed(supportArticleIncidentsSheetViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer2, R.string.support_article_incident_notifications_title), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, ImageKt.verticalScroll$default(companion, ImageKt.rememberScrollState(gapComposer2), false, 14), false);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            supportArticleIncidentsSheetViewModel2 = supportArticleIncidentsSheetViewModel;
            List list = supportArticleIncidentsSheetViewModel2.notifications;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                function12 = function1;
                rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda5(14, function12);
                gapComposer2.updateRememberedValue(rememberedValue);
            } else {
                function12 = function1;
            }
            SupportHomeViewKt.SupportNotifications(list, (Function1) rememberedValue, gapComposer2, 0);
            gapComposer2.end(true);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1508189404, new HeroCardNullStateKt$$ExternalSyntheticLambda8(2, function12), gapComposer2), gapComposer2, 3072, 7);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            supportArticleIncidentsSheetViewModel2 = supportArticleIncidentsSheetViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(supportArticleIncidentsSheetViewModel2, function12, i, 29);
        }
    }

    public static final void ShimmerSupportTransactionRowView(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1406681641);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SheetKt$$ExternalSyntheticLambda9(28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CellDefaultKt.m3388CellActivity6RhP_wg(f700lambda$348806137, lambda$875257900, lambda$1089689742, (Function0) rememberedValue, null, null, f692lambda$1440766607, f697lambda$185984590, true, 0L, gapComposer, 114822582, 560);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArticleViewKt$$ExternalSyntheticLambda10(i, 6);
        }
    }

    public static final void SubscriptionButton(SupportIncidentDetailsViewModel.ButtonViewModel buttonViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1169232009);
        int i2 = 16;
        int i3 = (gapComposer.changedInstance(buttonViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(OffsetKt.windowInsetsPadding(fillMaxWidth, new LimitInsets(Arrangement$End$1.current(gapComposer).systemBars, 32)), RecyclerView.DECELERATION_RATE, 16.0f, 1);
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
            if (Intrinsics.areEqual(buttonViewModel, SupportIncidentDetailsViewModel.ButtonViewModel.UpdatingSubscription.INSTANCE)) {
                gapComposer.startReplaceGroup(746219509);
                ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                if (!(buttonViewModel instanceof SupportIncidentDetailsViewModel.ButtonViewModel.Display)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 746218566, false);
                }
                gapComposer.startReplaceGroup(1658039787);
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-873262400, new TabToolbarsKt$$ExternalSyntheticLambda3(i2, function1, buttonViewModel), gapComposer), gapComposer, 24576, 15);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxTooltipView$$ExternalSyntheticLambda0(buttonViewModel, function1, i, 11);
        }
    }

    public static final void SupportFullScreenActivityPickerView(SupportFullScreenActivityPickerViewModel supportFullScreenActivityPickerViewModel, Function1 function1, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, Composer composer, int i) {
        supportFullScreenActivityPickerViewModel.getClass();
        function1.getClass();
        realImageLoader.getClass();
        realCashVibrator.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1575059419);
        int i2 = (gapComposer.changedInstance(supportFullScreenActivityPickerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128) | (gapComposer.changedInstance(realCashVibrator) ? 2048 : 1024);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.skipToGroupEnd();
        } else if (supportFullScreenActivityPickerViewModel.equals(SupportFullScreenActivityPickerViewModel.Loading.INSTANCE)) {
            gapComposer.startReplaceGroup(-1803604722);
            Loading(gapComposer, 0);
            gapComposer.end(false);
        } else {
            if (!(supportFullScreenActivityPickerViewModel instanceof SupportFullScreenActivityPickerViewModel.Loaded)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1803605796, false);
            }
            gapComposer.startReplaceGroup(-77110772);
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator)}, Expect_jvmKt.rememberComposableLambda(2055099236, new TaxTooltipView$$ExternalSyntheticLambda0(9, supportFullScreenActivityPickerViewModel, function1), gapComposer), gapComposer, 56);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(supportFullScreenActivityPickerViewModel, i, function1, realImageLoader, realCashVibrator, 11);
        }
    }

    public static final void SupportIncidentDetails(SupportIncidentDetailsViewModel.Loaded loaded, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Function1 function12;
        Pair pair;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1166335936);
        int i4 = (gapComposer.changed(loaded) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (gapComposer.changedInstance(function1) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i5 != 0) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(28);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function1 = (Function1) rememberedValue;
            }
            Function1 function13 = function1;
            int ordinal = loaded.severity.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(137635741);
                Icons icons = Icons.Check32;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(icons, new Color(colors.semantic.background.brand));
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(137638218);
                Icons icons2 = Icons.AlertReportedFill32;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(icons2, new Color(colors2.semantic.background.danger));
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 137634614, false);
                }
                gapComposer.startReplaceGroup(137641056);
                Icons icons3 = Icons.InformationFill32;
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(icons3, new Color(colors3.semantic.icon.info));
                gapComposer.end(false);
            }
            m3753SupportIncidentViewOadGlvw(loaded.title, ((Color) pair.second).value, (Icons) pair.first, loaded.status, loaded.details, Expect_jvmKt.rememberComposableLambda(-423482186, new TaxTooltipView$$ExternalSyntheticLambda0(12, loaded, function13), gapComposer), function13, gapComposer, ((i3 << 15) & 3670016) | 196608);
            function12 = function13;
        } else {
            gapComposer.skipToGroupEnd();
            function12 = function1;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(i, i2, 3, loaded, function12);
        }
    }

    public static final void SupportIncidentLoading(Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(946262511);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.BACK;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(26, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(lambda$37200767, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 438, 104);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxSize2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardNullStateKt$$ExternalSyntheticLambda8(i, 4, function1);
        }
    }

    public static final void SupportIncidentNotFound(Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1387569240);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            String stringResource = Room.stringResource(gapComposer, R.string.support_incident_details_not_found_title);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            function12 = function1;
            m3753SupportIncidentViewOadGlvw(stringResource, colors.semantic.background.danger, Icons.InformationFill32, Room.stringResource(gapComposer, R.string.support_incident_details_not_found_message), "", null, function12, gapComposer, ((i2 << 18) & 3670016) | 221568);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayFirstTimeKt$$ExternalSyntheticLambda1(i, 3, function12);
        }
    }

    /* renamed from: SupportIncidentView-OadGlvw, reason: not valid java name */
    public static final void m3753SupportIncidentViewOadGlvw(final String str, final long j, Icons icons, String str2, final String str3, Function2 function2, final Function1 function1, Composer composer, final int i) {
        int i2;
        Function2 function22;
        String str4;
        Icons icons2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2094199495);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(j) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(icons.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(str3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 599187) != 599186)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(80.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.derivedStateOf(new WalletHomeViewKt$$ExternalSyntheticLambda5(rememberScrollState, mo236toPx0680j_4, 1));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            State state = (State) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.BACK;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1003601833, new TaxTooltipView$$ExternalSyntheticLambda0(13, state, str), gapComposer);
            int i4 = i3 & 3670016;
            boolean z = i4 == 1048576;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(27, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            int i5 = 1;
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer, 438, 104);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), rememberScrollState, false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            icons2 = icons;
            str4 = str2;
            gapComposer = gapComposer;
            Countries.PageHeader(str, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-890046224, new BulletinInfoOverlayKt$$ExternalSyntheticLambda20(icons2, j, i5), gapComposer), Recorder$$ExternalSyntheticOutline2.m$1(str4, "\n"), gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes, 2);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            long j2 = Strings.getColors(gapComposer).semantic.text.subtle;
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyMedium;
            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer).bodyMedium.spanStyle, Strings.getColors(gapComposer).semantic.text.link, null, 0L, JpegConstants.COM_MARKER), 2);
            boolean z2 = i4 == 1048576;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new HeroCardNullStateKt$$ExternalSyntheticLambda8(3, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            LazyDslKt.m304MarkdownTextpCuZGqc(str3, (Function2) rememberedValue3, m300paddingVpY3zN4$default, textStyle, j2, markdownSpanValues, null, null, 0, 0, 0, gapComposer, ((i3 >> 12) & 14) | MLKEMEngine.KyberPolyBytes, 1984);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            if (function2 == null) {
                gapComposer.startReplaceGroup(-871949218);
                gapComposer.end(false);
                function22 = function2;
            } else {
                gapComposer.startReplaceGroup(1218798595);
                function22 = function2;
                Recorder$$ExternalSyntheticOutline1.m(14 & (i3 >> 15), function22, gapComposer, false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            function22 = function2;
            str4 = str2;
            icons2 = icons;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Function2 function23 = function22;
            final Icons icons3 = icons2;
            final String str5 = str4;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.support.views.SupportIncidentDetailsViewKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ScreenshotReviewViewKt.m3753SupportIncidentViewOadGlvw(str, j, icons3, str5, str3, function23, function1, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void SupportPhoneLoaded(int i, Composer composer, SupportPhoneStatusViewModel.Loaded loaded, Function1 function1) {
        int i2;
        final SupportPhoneStatusViewModel.Loaded loaded2;
        Function1 function12;
        int i3;
        Pair pair;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(330778275);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            int ordinal = loaded.activeStatus.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i3 = i4;
                        gapComposer.startReplaceGroup(50353312);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        pair = new Pair(new Color(colors.semantic.background.brand), Icons.Check32);
                        gapComposer.end(false);
                    } else if (ordinal == 3) {
                        gapComposer.startReplaceGroup(50355880);
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        i3 = i4;
                        pair = new Pair(new Color(colors2.semantic.background.brand), Icons.CommPhoneFill32);
                        gapComposer.end(false);
                    } else if (ordinal != 4 && ordinal != 5) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 50349676, false);
                    }
                }
                i3 = i4;
                gapComposer.startReplaceGroup(50359776);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(new Color(colors3.semantic.icon.extraSubtle), Icons.Alert32);
                gapComposer.end(false);
            } else {
                i3 = i4;
                gapComposer.startReplaceGroup(50350844);
                Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(new Color(colors4.semantic.icon.danger), Icons.Failed32);
                gapComposer.end(false);
            }
            long j = ((Color) pair.first).value;
            Icons icons = (Icons) pair.second;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda8(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            Modifier windowInsetsPadding = OffsetKt.windowInsetsPadding(fillMaxSize, new LimitInsets(Arrangement$End$1.current(gapComposer).systemBars, 32));
            Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors5 == null) {
                colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(windowInsetsPadding, colors5.semantic.background.f1047app, ColorKt.RectangleShape);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), rememberScrollState, false, 14);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            Modifier then = verticalScroll$default.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            loaded2 = loaded;
            final int i5 = 0;
            final int i6 = 1;
            Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(-787939634, new Function2() { // from class: com.squareup.cash.support.views.SupportPhoneStratusViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i5;
                    SupportPhoneStatusViewModel.Loaded loaded3 = loaded2;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded3.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str = loaded3.message;
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                Colors colors6 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors6 == null) {
                                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                LazyDslKt.m304MarkdownTextpCuZGqc(str, null, null, textStyle, colors6.semantic.text.subtle, null, null, null, 0, 0, 0, gapComposer3, 48, 2020);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), (Modifier) null, Expect_jvmKt.rememberComposableLambda(1115724044, new BulletinInfoOverlayKt$$ExternalSyntheticLambda20(icons, j, 2), gapComposer), Expect_jvmKt.rememberComposableLambda(2067555883, new Function2() { // from class: com.squareup.cash.support.views.SupportPhoneStratusViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i6;
                    SupportPhoneStatusViewModel.Loaded loaded3 = loaded2;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loaded3.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str = loaded3.message;
                                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                Colors colors6 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors6 == null) {
                                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                LazyDslKt.m304MarkdownTextpCuZGqc(str, null, null, textStyle, colors6.semantic.text.subtle, null, null, null, 0, 0, 0, gapComposer3, 48, 2020);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 3462, 2);
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            gapComposer.end(true);
            function12 = function1;
            SupportPhoneStatusButtonBox(((i3 >> 3) & 14) | ((i3 << 3) & 112), gapComposer, loaded2, function12);
            gapComposer.end(true);
        } else {
            loaded2 = loaded;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportPhoneStratusViewKt$$ExternalSyntheticLambda8(loaded2, function12, i, 0);
        }
    }

    public static final void SupportPhoneLoading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1873980014);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            endRestartGroup.block = new ArticleViewKt$$ExternalSyntheticLambda10(i, 10);
        }
    }

    public static final void SupportPhoneStatus(SupportPhoneStatusViewModel supportPhoneStatusViewModel, Function1 function1, Composer composer, int i, int i2) {
        Function1 function12;
        int i3;
        Function1 function13;
        Function1 function14;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(965239156);
        int i4 = i | (gapComposer.changedInstance(supportPhoneStatusViewModel) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            function12 = function1;
        } else {
            function12 = function1;
            i3 = i4 | (gapComposer.changedInstance(function12) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (i5 != 0) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(29);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function14 = (Function1) rememberedValue;
            } else {
                function14 = function12;
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            Modifier windowInsetsPadding = OffsetKt.windowInsetsPadding(fillMaxSize, new LimitInsets(Arrangement$End$1.current(gapComposer).systemBars, 32));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(windowInsetsPadding, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            NavigationType navigationType = NavigationType.BACK;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(29, function14);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DBUtil.TitleBarSub(f699lambda$1974654492, navigationType, fillMaxWidth, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer, 438, 104);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            if (Intrinsics.areEqual(supportPhoneStatusViewModel, SupportPhoneStatusViewModel.Loading.INSTANCE)) {
                gapComposer.startReplaceGroup(-1377213569);
                SupportPhoneLoading(gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (!(supportPhoneStatusViewModel instanceof SupportPhoneStatusViewModel.Loaded)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1377215341, false);
                }
                gapComposer.startReplaceGroup(-1377211348);
                SupportPhoneLoaded(i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, gapComposer, (SupportPhoneStatusViewModel.Loaded) supportPhoneStatusViewModel, function14);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            function13 = function14;
        } else {
            gapComposer.skipToGroupEnd();
            function13 = function12;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(i, i2, 4, supportPhoneStatusViewModel, function13);
        }
    }

    public static final void SupportPhoneStatusButtonBox(int i, Composer composer, SupportPhoneStatusViewModel.Loaded loaded, Function1 function1) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1473145349);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(loaded) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(OffsetKt.windowInsetsPadding(fillMaxWidth, new LimitInsets(Arrangement$End$1.current(gapComposer).systemBars, 32)), 16.0f, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            if (loaded.allowCancellation) {
                gapComposer.startReplaceGroup(-1310313184);
                ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                boolean z = (i3 & 14) == 4;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda8(2, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth2, buttonProminence, false, false, null, f688lambda$1161506885, gapComposer, 1573296, 56);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1310054489);
                gapComposer.end(false);
            }
            PrimaryButton(((i3 >> 3) & 14) | ((i3 << 3) & 112), gapComposer, loaded, function1);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportPhoneStratusViewKt$$ExternalSyntheticLambda8(function1, loaded, i);
        }
    }

    public static final void Thumbnail(String str, Function1 function1, Composer composer, int i) {
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1956494432);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            AsyncImageKt.m1443SubcomposeAsyncImageQgsmV_s(str2, null, (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader), SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), Alignment.Companion.Center, null, Expect_jvmKt.rememberComposableLambda(-849384194, new TabContentViewKt$$ExternalSyntheticLambda11(str, function1, 29), gapComposer), gapComposer, (i2 & 14) | 1575984, 4016);
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda6(str2, function1, i, 12);
        }
    }

    public static final void UploadFailed(ScreenshotReviewViewModel.UploadFailed uploadFailed, Function1 function1, Composer composer, int i) {
        Function1 function12;
        ScreenshotReviewViewModel.UploadFailed uploadFailed2 = uploadFailed;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1557742047);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(uploadFailed2) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3;
        int i5 = 1;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(24);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int i6 = i4 & 112;
            ScreenshotList(uploadFailed2, function1, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(764714595, new WorkWebViewKt$$ExternalSyntheticLambda14(i5, function1), gapComposer), gapComposer, (i4 & 14) | 3456 | i6);
            function12 = function1;
            boolean z = i6 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(4, function12);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
            boolean z2 = i6 == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ScreenshotReviewViewKt$$ExternalSyntheticLambda0(5, function12);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            ArcadeModal2Kt.Modal(null, uploadFailed, function0, (Function0) rememberedValue3, false, false, Expect_jvmKt.rememberComposableLambda(1688205273, new WorkWebViewKt$$ExternalSyntheticLambda14(i2, function12), gapComposer), gapComposer, ((i4 << 3) & 112) | 1572864, 49);
            uploadFailed2 = uploadFailed;
            gapComposer = gapComposer;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(uploadFailed2, function12, i, 27);
        }
    }

    public static final void UploadStatusAccessory(ScreenshotReviewViewModel.UploadStatus uploadStatus, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1104588382);
        int i2 = (gapComposer.changed(uploadStatus == null ? -1 : uploadStatus.ordinal()) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            int i3 = uploadStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uploadStatus.ordinal()];
            if (i3 != -1) {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i3 == 1) {
                    gapComposer.startReplaceGroup(1247097999);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.wrapContentSize$default(SizeKt.m285size3ABfNKs(companion, 24.0f), null, 3));
                    gapComposer.end(false);
                } else if (i3 == 2) {
                    gapComposer.startReplaceGroup(1247246117);
                    Trace.m1191Iconww6aTOc(Icons.CheckFill24, Room.stringResource(gapComposer, R.string.support_screenshot_review_accessibility_screenshot_uploaded), SizeKt.wrapContentSize$default(companion, null, 3), 0L, gapComposer, 390, 8);
                    gapComposer.end(false);
                } else {
                    if (i3 != 3) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -652509488, false);
                    }
                    gapComposer.startReplaceGroup(1247530976);
                    Trace.m1191Iconww6aTOc(Icons.AlertFill24, Room.stringResource(gapComposer, R.string.support_screenshot_review_accessibility_screenshot_upload_failed), SizeKt.wrapContentSize$default(companion, null, 3), 0L, gapComposer, 390, 8);
                    gapComposer.end(false);
                }
            } else {
                gapComposer.startReplaceGroup(1247765863);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda6(uploadStatus, i, 22);
        }
    }

    public static final void Uploaded(ScreenshotReviewViewModel.Uploaded uploaded, Function1 function1, Composer composer, int i) {
        ScreenshotReviewViewModel.Uploaded uploaded2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-63802593);
        int i2 = (gapComposer.changedInstance(uploaded) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            uploaded2 = uploaded;
            function12 = function1;
            ScreenshotList(uploaded2, function12, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(2110034851, new TabToolbarsKt$$ExternalSyntheticLambda3(12, function1, uploaded), gapComposer), gapComposer, (i2 & 14) | 3456 | (i2 & 112));
        } else {
            uploaded2 = uploaded;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(uploaded2, function12, i, 28);
        }
    }

    public static final void Uploading(ScreenshotReviewViewModel.Uploading uploading, Function1 function1, Composer composer, int i) {
        ScreenshotReviewViewModel.Uploading uploading2;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2108750255);
        int i2 = (gapComposer.changedInstance(uploading) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScreenshotReviewViewKt$$ExternalSyntheticLambda4(23);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            uploading2 = uploading;
            function12 = function1;
            ScreenshotList(uploading2, function12, (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(-405072427, new TabToolbarsKt$$ExternalSyntheticLambda3(9, uploading, function1), gapComposer), gapComposer, (i2 & 14) | 3456 | (i2 & 112));
        } else {
            uploading2 = uploading;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(uploading2, function12, i, 26);
        }
    }

    public static final void VerificationButtons(PhoneVerificationViewModel.Loaded.Status status, final PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel, final Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(328776561);
        final int i3 = 2;
        final int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(status.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(buttonViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        final int i5 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int ordinal = status.ordinal();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(2057357404);
                if (buttonViewModel.event.equals(PhoneVerificationEvents.Reject.INSTANCE)) {
                    gapComposer.startReplaceGroup(2057394418);
                    ButtonProminence buttonProminence = ButtonProminence.SUBTLE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    int i6 = (gapComposer.changedInstance(buttonViewModel) ? 1 : 0) | ((i2 & 896) != 256 ? 0 : 1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (i6 != 0 || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new Function0() { // from class: com.squareup.cash.support.views.SupportPhoneVerificationViewKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i7 = i5;
                                PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel2 = buttonViewModel;
                                Function1 function12 = function1;
                                switch (i7) {
                                    case 0:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    case 1:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    case 2:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    case 3:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    default:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1391904016, new Function3() { // from class: com.squareup.cash.support.views.SupportPhoneVerificationViewKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i7 = i5;
                            PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel2 = buttonViewModel;
                            switch (i7) {
                                case 0:
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    Composer composer4 = (Composer) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    Composer composer5 = (Composer) obj2;
                                    int intValue4 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer6 = (Composer) obj2;
                                    int intValue5 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer6 = (GapComposer) composer6;
                                    if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 1573296, 56);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(2057607791);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(buttonViewModel);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.support.views.SupportPhoneVerificationViewKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i7 = i4;
                                PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel2 = buttonViewModel;
                                Function1 function12 = function1;
                                switch (i7) {
                                    case 0:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    case 1:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    case 2:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    case 3:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    default:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(1836924999, new Function3() { // from class: com.squareup.cash.support.views.SupportPhoneVerificationViewKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i7 = r2;
                            PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel2 = buttonViewModel;
                            switch (i7) {
                                case 0:
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    Composer composer4 = (Composer) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    Composer composer5 = (Composer) obj2;
                                    int intValue4 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer6 = (Composer) obj2;
                                    int intValue5 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer6 = (GapComposer) composer6;
                                    if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 1573296, 56);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
            } else if (ordinal != 1) {
                final int i7 = 3;
                if (ordinal != 4) {
                    gapComposer.startReplaceGroup(2058255195);
                    ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    int i8 = (gapComposer.changedInstance(buttonViewModel) ? 1 : 0) | ((i2 & 896) != 256 ? 0 : 1);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (i8 != 0 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.support.views.SupportPhoneVerificationViewKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i72 = i7;
                                PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel2 = buttonViewModel;
                                Function1 function12 = function1;
                                switch (i72) {
                                    case 0:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    case 1:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    case 2:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    case 3:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                    default:
                                        function12.invoke(buttonViewModel2.event);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth3, buttonProminence3, false, false, null, Expect_jvmKt.rememberComposableLambda(-684786997, new Function3() { // from class: com.squareup.cash.support.views.SupportPhoneVerificationViewKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i72 = i4;
                            PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel2 = buttonViewModel;
                            switch (i72) {
                                case 0:
                                    Composer composer2 = (Composer) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Composer composer3 = (Composer) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    Composer composer4 = (Composer) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    Composer composer5 = (Composer) obj2;
                                    int intValue4 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer6 = (Composer) obj2;
                                    int intValue5 = ((Integer) obj3).intValue();
                                    ((RowScope) obj).getClass();
                                    GapComposer gapComposer6 = (GapComposer) composer6;
                                    if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 1573296, 56);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(2057837563);
                    if (buttonViewModel.event.equals(PhoneVerificationEvents.Close.INSTANCE)) {
                        gapComposer.startReplaceGroup(2057864254);
                        boolean changedInstance2 = ((i2 & 896) == 256) | gapComposer.changedInstance(buttonViewModel);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new Function0() { // from class: com.squareup.cash.support.views.SupportPhoneVerificationViewKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i72 = r3;
                                    PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel2 = buttonViewModel;
                                    Function1 function12 = function1;
                                    switch (i72) {
                                        case 0:
                                            function12.invoke(buttonViewModel2.event);
                                            break;
                                        case 1:
                                            function12.invoke(buttonViewModel2.event);
                                            break;
                                        case 2:
                                            function12.invoke(buttonViewModel2.event);
                                            break;
                                        case 3:
                                            function12.invoke(buttonViewModel2.event);
                                            break;
                                        default:
                                            function12.invoke(buttonViewModel2.event);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer.updateRememberedValue(rememberedValue4);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue4, SizeKt.fillMaxWidth(companion, 1.0f), null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1469894287, new Function3() { // from class: com.squareup.cash.support.views.SupportPhoneVerificationViewKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i72 = i3;
                                PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel2 = buttonViewModel;
                                switch (i72) {
                                    case 0:
                                        Composer composer2 = (Composer) obj2;
                                        int intValue = ((Integer) obj3).intValue();
                                        ((RowScope) obj).getClass();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        Composer composer3 = (Composer) obj2;
                                        int intValue2 = ((Integer) obj3).intValue();
                                        ((RowScope) obj).getClass();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        Composer composer4 = (Composer) obj2;
                                        int intValue3 = ((Integer) obj3).intValue();
                                        ((RowScope) obj).getClass();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        Composer composer5 = (Composer) obj2;
                                        int intValue4 = ((Integer) obj3).intValue();
                                        ((RowScope) obj).getClass();
                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                        if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer6 = (Composer) obj2;
                                        int intValue5 = ((Integer) obj3).intValue();
                                        ((RowScope) obj).getClass();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, 1572912, 60);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(2058027407);
                        ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                        int i9 = (gapComposer.changedInstance(buttonViewModel) ? 1 : 0) | ((i2 & 896) != 256 ? 0 : 1);
                        Object rememberedValue5 = gapComposer.rememberedValue();
                        if (i9 != 0 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new Function0() { // from class: com.squareup.cash.support.views.SupportPhoneVerificationViewKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i72 = i3;
                                    PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel2 = buttonViewModel;
                                    Function1 function12 = function1;
                                    switch (i72) {
                                        case 0:
                                            function12.invoke(buttonViewModel2.event);
                                            break;
                                        case 1:
                                            function12.invoke(buttonViewModel2.event);
                                            break;
                                        case 2:
                                            function12.invoke(buttonViewModel2.event);
                                            break;
                                        case 3:
                                            function12.invoke(buttonViewModel2.event);
                                            break;
                                        default:
                                            function12.invoke(buttonViewModel2.event);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer.updateRememberedValue(rememberedValue5);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue5, fillMaxWidth4, buttonProminence4, false, false, null, Expect_jvmKt.rememberComposableLambda(1758934728, new Function3() { // from class: com.squareup.cash.support.views.SupportPhoneVerificationViewKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                int i72 = i7;
                                PhoneVerificationViewModel.Loaded.ButtonViewModel buttonViewModel2 = buttonViewModel;
                                switch (i72) {
                                    case 0:
                                        Composer composer2 = (Composer) obj2;
                                        int intValue = ((Integer) obj3).intValue();
                                        ((RowScope) obj).getClass();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        Composer composer3 = (Composer) obj2;
                                        int intValue2 = ((Integer) obj3).intValue();
                                        ((RowScope) obj).getClass();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        Composer composer4 = (Composer) obj2;
                                        int intValue3 = ((Integer) obj3).intValue();
                                        ((RowScope) obj).getClass();
                                        GapComposer gapComposer4 = (GapComposer) composer4;
                                        if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        Composer composer5 = (Composer) obj2;
                                        int intValue4 = ((Integer) obj3).intValue();
                                        ((RowScope) obj).getClass();
                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                        if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer6 = (Composer) obj2;
                                        int intValue5 = ((Integer) obj3).intValue();
                                        ((RowScope) obj).getClass();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonViewModel2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), gapComposer, 1573296, 56);
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                }
            } else {
                gapComposer.startReplaceGroup(2057257770);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(status, buttonViewModel, function1, i, 11);
        }
    }

    public static final void Loading(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(753621517);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier != null) {
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
                Updater.invalidApplier();
                throw null;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArticleViewKt$$ExternalSyntheticLambda10(i, 9);
        }
    }

    public static final void ButtonBox(boolean z, boolean z2, boolean z3, String str, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-584739104);
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
            i2 |= gapComposer.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            if (z2) {
                gapComposer.startReplaceGroup(424966365);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 24.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (gapComposer.applier != null) {
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
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 48.0f));
                    gapComposer.end(true);
                    gapComposer.end(false);
                } else {
                    Updater.invalidApplier();
                    throw null;
                }
            } else {
                gapComposer.startReplaceGroup(425154628);
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(866283386, new OTPElementUIKt$$ExternalSyntheticLambda10(z, function1, delegatingSoftwareKeyboardController, str, z3), gapComposer), gapComposer, 24576, 15);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardStudioViewKt$$ExternalSyntheticLambda60(z, z2, z3, str, function1, i);
        }
    }

    public static final void SheetContent(SupportHomeContactOptionsSheetViewModel supportHomeContactOptionsSheetViewModel, Function1 function1, Composer composer, int i) {
        supportHomeContactOptionsSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-940471866);
        int i2 = (gapComposer.changedInstance(supportHomeContactOptionsSheetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(468007963, new SupportHomeContactOptionsSheetKt$$ExternalSyntheticLambda0(function1, supportHomeContactOptionsSheetViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportHomeContactOptionsSheetKt$$ExternalSyntheticLambda0(supportHomeContactOptionsSheetViewModel, function1, i, i3);
        }
    }

    public static final void SheetContent(SupportTransactionConfirmationViewModel supportTransactionConfirmationViewModel, Function1 function1, Composer composer, int i) {
        supportTransactionConfirmationViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1476541247);
        int i2 = (gapComposer.changed(supportTransactionConfirmationViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier != null) {
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
                Countries.PageHeader(supportTransactionConfirmationViewModel.title, (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(116938439, new SupportTransactionConfirmationView$$ExternalSyntheticLambda3(function1, supportTransactionConfirmationViewModel), gapComposer), gapComposer, 24576, 15);
                gapComposer = gapComposer;
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(true);
            } else {
                Updater.invalidApplier();
                throw null;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SupportTransactionConfirmationView$$ExternalSyntheticLambda0(supportTransactionConfirmationViewModel, function1, i);
        }
    }

    public static final void Loaded(PhoneVerificationViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Pair pair;
        float f;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(476083651);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changed(loaded) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            if (loaded.status != PhoneVerificationViewModel.Loaded.Status.RESPONDING && !CollectionsKt__CollectionsKt.listOf((Object[]) new PhoneVerificationViewModel.Loaded.Status[]{PhoneVerificationViewModel.Loaded.Status.PENDING, PhoneVerificationViewModel.Loaded.Status.VERIFIED, PhoneVerificationViewModel.Loaded.Status.REJECTED, PhoneVerificationViewModel.Loaded.Status.FAILED_PIN}).contains(loaded.status)) {
                if (!loaded.phoneVerificationResultSuccess) {
                    gapComposer2.startReplaceGroup(-2045099070);
                    Icons icons = Icons.AlertOffline32;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    pair = new Pair(icons, new Color(colors.semantic.icon.danger));
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-2045096576);
                    Icons icons2 = Icons.Alert32;
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    pair = new Pair(icons2, new Color(colors2.semantic.icon.extraSubtle));
                    gapComposer2.end(false);
                }
            } else {
                gapComposer2.startReplaceGroup(-2045102910);
                Icons icons3 = Icons.CommPhoneFill32;
                Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                pair = new Pair(icons3, new Color(colors3.semantic.icon.brand));
                gapComposer2.end(false);
            }
            Icons icons4 = (Icons) pair.first;
            long j = ((Color) pair.second).value;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier != null) {
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                float f2 = 1.0f;
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(companion, 1.0f), rememberScrollState, false, 14);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                    f = Float.MAX_VALUE;
                } else {
                    f = Float.MAX_VALUE;
                }
                Modifier then = verticalScroll$default.then(new LayoutWeightElement(f2, true));
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, then);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                NavigationType navigationType = NavigationType.CLOSE;
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda8(4, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                gapComposer = gapComposer2;
                DBUtil.TitleBarSub(f703lambda$713634903, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                Countries.PageHeader(loaded.title, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-972613766, new BulletinInfoOverlayKt$$ExternalSyntheticLambda20(icons4, j, 3), gapComposer), loaded.subTitle, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f > f ? f : 1.0f, true));
                gapComposer.end(true);
                ButtonBox(loaded, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer.end(true);
            } else {
                Updater.invalidApplier();
                throw null;
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxTooltipView$$ExternalSyntheticLambda0(loaded, function1, i, 16);
        }
    }

    public static final void Loaded(ScreenshotReviewViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        ScreenshotReviewViewModel.Loaded loaded2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-944295297);
        int i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            LoadedList(loaded, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            if (loaded.showQuitConfirmation) {
                gapComposer.startReplaceGroup(534786122);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new SheetKt$$ExternalSyntheticLambda9(26);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new SheetKt$$ExternalSyntheticLambda9(27);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                loaded2 = loaded;
                ArcadeModal2Kt.Modal(null, loaded2, function0, (Function0) rememberedValue2, false, false, Expect_jvmKt.rememberComposableLambda(-359191621, new WorkWebViewKt$$ExternalSyntheticLambda14(7, function1), gapComposer), gapComposer, ((i2 << 3) & 112) | 1576320, 49);
                gapComposer.end(false);
            } else {
                loaded2 = loaded;
                gapComposer.startReplaceGroup(535425187);
                gapComposer.end(false);
            }
        } else {
            loaded2 = loaded;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(loaded2, function1, i, 24);
        }
    }
}
