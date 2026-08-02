package com.squareup.cash.wallet.views;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.biometric.KeyguardUtils;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.DefaultDraggableState;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListLayoutInfoKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda6;
import androidx.compose.material.TextFieldDefaults$$ExternalSyntheticLambda3;
import androidx.compose.material.TextFieldKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda3;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.google.mlkit.vision.text.zzc;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.timeline.TimelineItem;
import com.squareup.cash.arcade.components.timeline.TimelineState;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.card.onboarding.graphics.HeartEdition;
import com.squareup.cash.card.onboarding.graphics.HeartPoseController;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardEdition;
import com.squareup.cash.card.onboarding.graphics.MiniCardPoseController;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.TagPoseController;
import com.squareup.cash.card.onboarding.graphics.WandEdition;
import com.squareup.cash.card.onboarding.graphics.WandPose;
import com.squareup.cash.card.onboarding.graphics.WandPoseController;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.charting.components.LineChartKt$Chart$1$1;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.widgets.LinkStyle;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector3;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.nearby.views.PulsingState$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda0;
import com.squareup.cash.shopping.views.ShopErrorKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.taptopay.views.TapToPayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.applet.views.TaxesAppletTile$$ExternalSyntheticLambda10;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.viewmodels.CardLockHalfSheetModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.DeviceLockModel;
import com.squareup.cash.wallet.viewmodels.PrepurchaseCardData;
import com.squareup.cash.wallet.viewmodels.PresentationAction;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.wallet.views.CardLockViewKt;
import com.squareup.cash.wallet.views.LockAnimationColorTreatment;
import com.squareup.cash.work.views.ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.FirstOrNullOnTimeoutKt;
import com.squareup.util.coroutines.TickerKt$tickerFlow$1;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda78;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.RenderScriptBlurEffect$updateSurface$2$2$1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public abstract class UtilsKt {
    public static final WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 EaseInOutSineEasing;
    public static final float[] TAG_LOCAL_X_AXIS;

    /* renamed from: lambda$-1106265579, reason: not valid java name */
    public static final ComposableLambdaImpl f742lambda$1106265579;

    /* renamed from: lambda$-1267424863, reason: not valid java name */
    public static final ComposableLambdaImpl f743lambda$1267424863;

    /* renamed from: lambda$-1362378728, reason: not valid java name */
    public static final ComposableLambdaImpl f744lambda$1362378728;

    /* renamed from: lambda$-1460260093, reason: not valid java name */
    public static final ComposableLambdaImpl f745lambda$1460260093;

    /* renamed from: lambda$-159782257, reason: not valid java name */
    public static final ComposableLambdaImpl f746lambda$159782257;

    /* renamed from: lambda$-2022303276, reason: not valid java name */
    public static final ComposableLambdaImpl f748lambda$2022303276;

    /* renamed from: lambda$-617451479, reason: not valid java name */
    public static final ComposableLambdaImpl f749lambda$617451479;
    public static final ComposableLambdaImpl lambda$1213729391;
    public static final ComposableLambdaImpl lambda$1369058334;
    public static final ComposableLambdaImpl lambda$1752536149;
    public static final ComposableLambdaImpl lambda$1786942330;
    public static final ComposableLambdaImpl lambda$1920557439;
    public static final ComposableLambdaImpl lambda$1413459481 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(25), false, 1413459481);

    /* renamed from: lambda$-1986995088, reason: not valid java name */
    public static final ComposableLambdaImpl f747lambda$1986995088 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(26), false, -1986995088);
    public static final ComposableLambdaImpl lambda$88693854 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(27), false, 88693854);

    static {
        int i = 29;
        f743lambda$1267424863 = new ComposableLambdaImpl(new TapToPayKt$$ExternalSyntheticLambda0(i), false, -1267424863);
        int i2 = 1;
        new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(i2), false, 411223314);
        int i3 = 2;
        new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(i3), false, 2047226294);
        f742lambda$1106265579 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(28), false, -1106265579);
        f748lambda$2022303276 = new ComposableLambdaImpl(new ComposableSingletons$TabToolbarsKt$$ExternalSyntheticLambda0(i), false, -2022303276);
        int i4 = 3;
        f749lambda$617451479 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(i4), false, -617451479);
        lambda$1369058334 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(i2), false, 1369058334);
        int i5 = 4;
        f746lambda$159782257 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(i5), false, -159782257);
        lambda$1786942330 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(i3), false, 1786942330);
        lambda$1920557439 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(i4), false, 1920557439);
        f745lambda$1460260093 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(i5), false, -1460260093);
        lambda$1213729391 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(5), false, 1213729391);
        lambda$1752536149 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(14), false, 1752536149);
        f744lambda$1362378728 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(15), false, -1362378728);
        TAG_LOCAL_X_AXIS = new float[]{1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        EaseInOutSineEasing = new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(13);
    }

    public static final void CardLockHalfSheet(String str, String str2, ArrayList arrayList, Function2 function2, Modifier modifier, Composer composer, int i) {
        str.getClass();
        str2.getClass();
        function2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-820198845);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changedInstance(arrayList) ? 256 : 128) | (gapComposer.changedInstance(function2) ? 2048 : 1024) | (gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(modifier, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            Countries.PageHeader(str, (Modifier) null, (Function2) null, str2, gapComposer, (i2 & 14) | ((i2 << 6) & 7168), 6);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13));
            gapComposer.startReplaceGroup(2047911170);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                DeviceLockRow((DeviceLockModel) it.next(), function2, gapComposer, (i2 >> 6) & 112);
            }
            gapComposer.end(false);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(str, str2, arrayList, function2, modifier, i, 26);
        }
    }

    public static final void CardLockHalfSheetView(CardLockHalfSheetModel cardLockHalfSheetModel, Function2 function2, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 function02;
        cardLockHalfSheetModel.getClass();
        function2.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1896159965);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(cardLockHalfSheetModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            SheetKt.Sheet(function02, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(959452154, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(i3, cardLockHalfSheetModel, function2), gapComposer), gapComposer, ((i2 >> 6) & 14) | 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(cardLockHalfSheetModel, function2, function0, false, i, 23);
        }
    }

    public static final void CircleButton(Modifier modifier, boolean z, Icons icons, Function0 function0, String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-108789662);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(icons.ordinal()) ? 256 : 128;
        }
        int i3 = i2 | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clip, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15), z, null, new Role(0), function0, 8);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m182clickableO2vRcR0$default, RecyclerView.DECELERATION_RATE, 8.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 64.0f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(ClipKt.clip(m285size3ABfNKs, roundedCornerShape), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), 1.0f, Strings.getColors(gapComposer).semantic.border.subtle, roundedCornerShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m178borderxT4_qwU);
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
            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, ((i3 >> 6) & 14) | 48, 4);
            gapComposer.end(true);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 4.0f));
            Room.m1165Text25TpFw(0, 2, 0, 0, ((i3 >> 12) & 14) | 1572912, 0, 4016, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).helpText, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744447), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(modifier, z, icons, function0, str, i);
        }
    }

    public static final void CompactRender(CardSchemeViewModel.Module.Accessory.Button button, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(43378272);
        int i3 = (gapComposer.changedInstance(button) ? 4 : 2) | i;
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
            CrossfadeKt.Crossfade(new Pair(Boolean.valueOf(button.isDestructive), button.prominence), modifier3, (FiniteAnimationSpec) null, "button", Expect_jvmKt.rememberComposableLambda(462196089, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(6, button, Expect_jvmKt.rememberComposableLambda(-763563007, new WalletCardSchemeViewKt$$ExternalSyntheticLambda10(button, i5), gapComposer)), gapComposer), gapComposer, (i3 & 112) | 27648, 4);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(button, modifier2, i, i2, 17);
        }
    }

    public static final void DeliveryStatusRow(final CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel deliveryStatusRowModel, Modifier modifier, Function0 function0, Composer composer, int i) {
        CellDefaultAccessory cellDefaultAccessory;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1546329862);
        int i2 = i | (gapComposer.changedInstance(deliveryStatusRowModel) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = deliveryStatusRowModel.buttonLabel;
            if (str != null) {
                gapComposer.startReplaceGroup(-1105878064);
                cellDefaultAccessory = new CellDefaultAccessory.ButtonCompact(deliveryStatusRowModel.buttonAction != null ? function0 : null, ButtonProminence.PROMINENT, false, Expect_jvmKt.rememberComposableLambda(877875277, new ShopErrorKt$$ExternalSyntheticLambda0(str, 10), gapComposer), 12);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1105666799);
                gapComposer.end(false);
                cellDefaultAccessory = CellDefaultAccessory.None.INSTANCE;
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(-233077356, new Function2() { // from class: com.squareup.cash.wallet.views.DeliveryStatusRowViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel deliveryStatusRowModel2 = deliveryStatusRowModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deliveryStatusRowModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str2 = deliveryStatusRowModel2.subtitle;
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), modifier, null, false, false, Expect_jvmKt.rememberComposableLambda(1771170638, new Function2() { // from class: com.squareup.cash.wallet.views.DeliveryStatusRowViewKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel deliveryStatusRowModel2 = deliveryStatusRowModel;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deliveryStatusRowModel2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                String str2 = deliveryStatusRowModel2.subtitle;
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, Color.Transparent, cellDefaultAccessory, null, gapComposer, (i2 & 112) | 102236166, 1212);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(deliveryStatusRowModel, modifier, function0, i, 24);
        }
    }

    public static final void DeviceLockRow(DeviceLockModel deviceLockModel, Function2 function2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1266409622);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(deviceLockModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z = deviceLockModel.isDisabled;
            boolean z2 = deviceLockModel.isLoading;
            Modifier alpha = AlphaKt.alpha(fillMaxWidth, z ? 0.5f : 1.0f);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(alpha, 16.0f, 16.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, deviceLockModel.name, (Map) null, (Function1) null, false);
            String str = deviceLockModel.errorText;
            if (str != null) {
                gapComposer.startReplaceGroup(-291077902);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.danger, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-290901078);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, deviceLockModel.statusText, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            Strings.getSizes(gapComposer).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
            if (z2) {
                gapComposer.startReplaceGroup(764855724);
                ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
                Strings.getSizes(gapComposer).getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(764986420);
                gapComposer.end(false);
            }
            boolean z3 = deviceLockModel.isLocked;
            boolean z4 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z4 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BottomSheet$$ExternalSyntheticLambda3(28, deviceLockModel, function2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ModalKt.Toggle(z3, null, (Function1) rememberedValue, (z2 || deviceLockModel.isDisabled) ? false : true, null, gapComposer, 0, 18);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(deviceLockModel, function2, i, 24);
        }
    }

    public static final void Disclosure(CardSchemeViewModel.Module.Disclosure disclosure, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        float f;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-464334408);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(disclosure) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (disclosure.showIcon) {
                gapComposer.startReplaceGroup(-335399004);
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(new HorizontalAlignElement(Alignment.Companion.CenterHorizontally), RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5);
                Icons icons = Icons.Fdic32;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                f = 1.0f;
                Trace.m1191Iconww6aTOc(icons, (String) null, m302paddingqDBjuR0$default, colors.semantic.icon.extraSubtle, gapComposer, 54, 0);
                gapComposer.end(false);
            } else {
                f = 1.0f;
                gapComposer.startReplaceGroup(-335162412);
                gapComposer.end(false);
            }
            String str = disclosure.text;
            if (str == null) {
                gapComposer.startReplaceGroup(-335115541);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-335115540);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m299paddingVpY3zN4(Modifier.Companion.$$INSTANCE, 16.0f, 8.0f), f);
                SpanStyle m973copyGSF8kmg$default = SpanStyle.m973copyGSF8kmg$default(Strings.getTypography(gapComposer).linkXSmall.spanStyle, Strings.getColors(gapComposer).semantic.text.link, null, 0L, JpegConstants.COM_MARKER);
                TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
                long j = Strings.getColors(gapComposer).semantic.text.subtle;
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new HeroCardNullStateKt$$ExternalSyntheticLambda8(19, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                KeyguardUtils.m14MarkdownTextnvClB8o(str, (Function2) rememberedValue, fillMaxWidth2, textStyle, j, m973copyGSF8kmg$default, null, 0, 5, new TextLineBalancing(1), 0, gapComposer, 0, 1216);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(disclosure, function1, modifier, i, 28);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if ((r17 & 16) != 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HeroCardNullState(final CardSchemeViewModel.CardNullStateBooklet cardNullStateBooklet, final Function1 function1, final Modifier modifier, Function2 function2, ScrollState scrollState, Composer composer, final int i, final int i2) {
        GapComposer gapComposer;
        final Function2 function22;
        final ScrollState scrollState2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function23;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(976432774);
        int i3 = (gapComposer2.changedInstance(cardNullStateBooklet) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(function2) ? 2048 : 1024;
        }
        int i5 = i3 | (((i2 & 16) == 0 && gapComposer2.changed(scrollState)) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                if (i4 != 0) {
                    function2 = f743lambda$1267424863;
                }
                if ((i2 & 16) != 0) {
                    scrollState = ImageKt.rememberScrollState(gapComposer2);
                    i5 &= -57345;
                }
                final Function2 function24 = function2;
                int i6 = i5;
                final ScrollState scrollState3 = scrollState;
                gapComposer2.endDefaults();
                CardSchemeViewModel.CardNullStateBooklet.Content content = cardNullStateBooklet.content;
                if (content == null) {
                    endRestartGroup = gapComposer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    final int i7 = 0;
                    function23 = new Function2() { // from class: com.squareup.cash.wallet.views.HeroCardNullStateKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i8 = i7;
                            int i9 = i;
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    UtilsKt.HeroCardNullState(cardNullStateBooklet, function1, modifier, function24, scrollState3, (Composer) obj, Updater.updateChangedFlags(i9 | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    UtilsKt.HeroCardNullState(cardNullStateBooklet, function1, modifier, function24, scrollState3, (Composer) obj, Updater.updateChangedFlags(i9 | 1), i2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    gapComposer = gapComposer2;
                    ScreenScaffoldKt.ScreenScaffoldColumn(modifier, scrollState3, null, lambda$88693854, Expect_jvmKt.rememberComposableLambda(1230523791, new FieldBinding$$ExternalSyntheticLambda4(content, 13), gapComposer2), Expect_jvmKt.rememberComposableLambda(354333896, new SheetKt$$ExternalSyntheticLambda5(28, content, function24, function1), gapComposer2), gapComposer, ((i6 >> 6) & 14) | 224256 | ((i6 >> 9) & 112), 4);
                    scrollState2 = scrollState3;
                    function22 = function24;
                }
            } else {
                gapComposer2.skipToGroupEnd();
            }
            endRestartGroup.block = function23;
        }
        gapComposer = gapComposer2;
        gapComposer.skipToGroupEnd();
        function22 = function2;
        scrollState2 = scrollState;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i8 = 1;
            function23 = new Function2() { // from class: com.squareup.cash.wallet.views.HeroCardNullStateKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i82 = i8;
                    int i9 = i;
                    switch (i82) {
                        case 0:
                            ((Integer) obj2).getClass();
                            UtilsKt.HeroCardNullState(cardNullStateBooklet, function1, modifier, function22, scrollState2, (Composer) obj, Updater.updateChangedFlags(i9 | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            UtilsKt.HeroCardNullState(cardNullStateBooklet, function1, modifier, function22, scrollState2, (Composer) obj, Updater.updateChangedFlags(i9 | 1), i2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function23;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HeroHeartEffect(WandPose wandPose, WandPoseController.Output output, HeartScene heartScene, HeartPoseController heartPoseController, boolean z, Modifier modifier, HeartEdition heartEdition, String str, int i, Engine engine, Composer composer, int i2) {
        GapComposer gapComposer;
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        float f;
        boolean z2;
        long currentTextColor;
        boolean z3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(622065571);
        int i4 = i2 | (gapComposer2.changed(wandPose.ordinal()) ? 4 : 2) | (gapComposer2.changedInstance(output) ? 32 : 16) | (gapComposer2.changedInstance(heartScene) ? 256 : 128) | (gapComposer2.changedInstance(heartPoseController) ? 2048 : 1024) | (gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(heartEdition.ordinal()) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changed(str) ? 8388608 : 4194304) | (gapComposer2.changed(i) ? 67108864 : 33554432) | (gapComposer2.changedInstance(engine) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer2.shouldExecute(i4 & 1, (306783379 & i4) != 306783378)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Quat times = HeartScene.DEFAULT_ROTATION.times(rememberCopyTiltRotation(i, (i4 >> 24) & 14, gapComposer2).times(output.rotation));
            Vector3 vector3 = output.positionOffset;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (heartPoseController == null || wandPose == WandPose.Locked || z) {
                i3 = i4;
                gapComposer2.startReplaceGroup(-827590871);
                gapComposer2.end(false);
                modifier2 = companion;
            } else {
                gapComposer2.startReplaceGroup(-827768563);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    i3 = i4;
                    z3 = false;
                    rememberedValue2 = new HeroTagViewKt$$ExternalSyntheticLambda12((int) (0 == true ? 1 : 0), mutableState);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                } else {
                    i3 = i4;
                    z3 = false;
                }
                modifier2 = FlowsKt.tagDragGestures(companion, heartPoseController, (Function2) rememberedValue2);
                gapComposer2.end(z3);
            }
            int i5 = i3 >> 15;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier then = OffsetKt.aspectRatio(0.85f, SizeKt.fillMaxWidth(companion, 1.0f), false).then(modifier2);
            float f2 = output.scale * 0.75f;
            float f3 = output.opacity;
            if (Strings.getColors(gapComposer2).isLight) {
                gapComposer2.startReplaceGroup(1277446275);
                modifier3 = then;
                f = f3;
                currentTextColor = Strings.getColors(gapComposer2).semantic.text.subtle;
                z2 = false;
                gapComposer2.end(false);
            } else {
                modifier3 = then;
                f = f3;
                z2 = false;
                gapComposer2.startReplaceGroup(1277447309);
                currentTextColor = Strings.getCurrentTextColor(gapComposer2);
                gapComposer2.end(false);
            }
            boolean z4 = wandPose == WandPose.Locked ? true : z2;
            float f4 = output.darkening;
            float f5 = output.lightIntensity;
            float f6 = output.saturation;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new HeroTagViewKt$$ExternalSyntheticLambda7(5, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Modifier modifier4 = modifier3;
            FlowsKt.m3441HeartEffect37dI38Q(modifier4, f2, times, vector3, f, str, currentTextColor, z4, f4, f5, f6, heartEdition, null, engine, heartScene, (Function1) rememberedValue3, gapComposer2, 512 | ((i3 >> 6) & 458752), (i5 & 112) | 1605632 | (i5 & 57344) | PKIFailureInfo.transactionIdInUse | (458752 & (i3 << 9)), 12288);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldDefaults$$ExternalSyntheticLambda3(wandPose, output, heartScene, heartPoseController, z, modifier, heartEdition, str, i, engine, i2, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HeroMiniCardEffect(WandPose wandPose, WandPoseController.Output output, MiniCardScene miniCardScene, MiniCardPoseController miniCardPoseController, boolean z, Modifier modifier, MiniCardEdition miniCardEdition, String str, int i, Engine engine, Composer composer, int i2) {
        GapComposer gapComposer;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        boolean z3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1947857775);
        int i5 = i2 | (gapComposer2.changed(wandPose.ordinal()) ? 4 : 2) | (gapComposer2.changedInstance(output) ? 32 : 16) | (gapComposer2.changedInstance(miniCardScene) ? 256 : 128) | (gapComposer2.changedInstance(miniCardPoseController) ? 2048 : 1024) | (gapComposer2.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(miniCardEdition.ordinal()) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer2.changed(str) ? 8388608 : 4194304) | (gapComposer2.changed(i) ? 67108864 : 33554432) | (gapComposer2.changedInstance(engine) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) != 306783378)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Quat times = MiniCardScene.DEFAULT_ROTATION.times(rememberCopyTiltRotation(i, (i5 >> 24) & 14, gapComposer2).times(output.rotation));
            Vector3 vector3 = output.positionOffset;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (miniCardPoseController == null || wandPose == WandPose.Locked || z) {
                i3 = i5;
                gapComposer2.startReplaceGroup(-671271715);
                gapComposer2.end(false);
                modifier2 = companion;
            } else {
                gapComposer2.startReplaceGroup(-671452290);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    i3 = i5;
                    z3 = false;
                    rememberedValue2 = new HeroTagViewKt$$ExternalSyntheticLambda6(0 == true ? 1 : 0, mutableState);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                } else {
                    i3 = i5;
                    z3 = false;
                }
                modifier2 = FlowsKt.tagDragGestures(companion, miniCardPoseController, (Function2) rememberedValue2);
                gapComposer2.end(z3);
            }
            int i6 = i3 >> 15;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier then = OffsetKt.aspectRatio(0.85f, SizeKt.fillMaxWidth(companion, 1.0f), false).then(modifier2);
            float f = output.scale * 0.624f;
            float f2 = output.opacity;
            gapComposer2.startReplaceGroup(1044898235);
            long j = ((Color) gapComposer2.consume(ArcadeThemeKt.LocalTextColor)).value;
            if (j == 16) {
                j = Strings.getColors(gapComposer2).semantic.text.standard;
            }
            gapComposer2.end(false);
            if (wandPose == WandPose.Locked) {
                i4 = i3;
                z2 = true;
            } else {
                i4 = i3;
                z2 = false;
            }
            float f3 = output.darkening;
            float f4 = output.lightIntensity;
            float f5 = output.saturation;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new HeroTagViewKt$$ExternalSyntheticLambda7(0, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            FlowsKt.m3442MiniCardEffect37dI38Q(then, f, times, vector3, f2, str, j, z2, f3, f4, f5, miniCardEdition, null, engine, miniCardScene, (Function1) rememberedValue3, gapComposer2, 512 | ((i4 >> 6) & 458752), (i6 & 112) | 1605632 | (i6 & 57344) | PKIFailureInfo.transactionIdInUse | (458752 & (i4 << 9)), 12288);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldDefaults$$ExternalSyntheticLambda3(wandPose, output, miniCardScene, miniCardPoseController, z, modifier, miniCardEdition, str, i, engine, i2, 5);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void HeroPaymentDevicesCarousel(com.squareup.cash.wallet.viewmodels.CardSchemeViewModel.Module.HeroPaymentDevices r44, kotlin.jvm.functions.Function1 r45, coil3.RealImageLoader r46, androidx.compose.ui.Modifier r47, kotlin.jvm.functions.Function1 r48, com.squareup.cash.wallet.views.HeroPaymentDevicesRenderingMode r49, androidx.compose.runtime.Composer r50, int r51) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.wallet.views.UtilsKt.HeroPaymentDevicesCarousel(com.squareup.cash.wallet.viewmodels.CardSchemeViewModel$Module$HeroPaymentDevices, kotlin.jvm.functions.Function1, coil3.RealImageLoader, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, com.squareup.cash.wallet.views.HeroPaymentDevicesRenderingMode, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0244 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HeroTagInspectionStub(CardSchemeViewModel.Module.HeroTag heroTag, TagFormFactor tagFormFactor, boolean z, Modifier modifier, Composer composer, int i) {
        int i2;
        CardSchemeViewModel.Module.HeroTag heroTag2;
        boolean z2;
        Modifier.Companion companion;
        boolean z3;
        boolean z4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1749915230);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(heroTag) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(tagFormFactor == null ? -1 : tagFormFactor.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.wallet_card_max_width);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(companion2, RecyclerView.DECELERATION_RATE, dimensionResource, 1);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m292widthInVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            switch (tagFormFactor == null ? -1 : HeroTagViewKt$WhenMappings.$EnumSwitchMapping$0[tagFormFactor.ordinal()]) {
                case -1:
                    z2 = false;
                    companion = companion2;
                    gapComposer.startReplaceGroup(268432182);
                    gapComposer.end(false);
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    heroTag2 = heroTag;
                    z3 = z2;
                    AnimatedContentKt.AnimatedVisibility(z, boxScopeInstance.align(companion, biasAlignment), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) lambda$1786942330, (Composer) gapComposer, ((i2 >> 6) & 14) | 200064, 16);
                    if (heroTag2.isActivated || z || !heroTag2.isLocked) {
                        z4 = true;
                        gapComposer.startReplaceGroup(-268003376);
                        gapComposer.end(z3);
                    } else {
                        gapComposer.startReplaceGroup(-268217927);
                        Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(boxScopeInstance.align(companion, biasAlignment), 0.25f), z3);
                        int i3 = CardLockViewKt.$r8$clinit;
                        int i4 = tagFormFactor != null ? CardLockViewKt.WhenMappings.$EnumSwitchMapping$1[tagFormFactor.ordinal()] : -1;
                        z4 = true;
                        CardLockViewKt.LockAnimation(z3, aspectRatio, (i4 == 1 || i4 == 2) ? LockAnimationColorTreatment.LightLock.INSTANCE : LockAnimationColorTreatment.Adaptive.INSTANCE, gapComposer, 6);
                        gapComposer.end(z3);
                    }
                    gapComposer.end(z4);
                    gapComposer.end(z4);
                    break;
                case 0:
                default:
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 268395641, false);
                case 1:
                case 2:
                    companion = companion2;
                    gapComposer.startReplaceGroup(268398023);
                    FlowsKt.m3443WandEffect37dI38Q(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 390.0f), 0.11f, WandScene.DEFAULT_ROTATION, new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), RecyclerView.DECELERATION_RATE, null, 0L, heroTag.isLocked, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, tagFormFactor == TagFormFactor.WAND_FIRST_EDITION ? WandEdition.FIRST_EDITION : WandEdition.STANDARD, null, null, null, null, gapComposer, 566, 0, 128880);
                    z2 = false;
                    gapComposer.end(false);
                    BiasAlignment biasAlignment2 = Alignment.Companion.Center;
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    heroTag2 = heroTag;
                    z3 = z2;
                    AnimatedContentKt.AnimatedVisibility(z, boxScopeInstance2.align(companion, biasAlignment2), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) lambda$1786942330, (Composer) gapComposer, ((i2 >> 6) & 14) | 200064, 16);
                    if (heroTag2.isActivated) {
                    }
                    z4 = true;
                    gapComposer.startReplaceGroup(-268003376);
                    gapComposer.end(z3);
                    gapComposer.end(z4);
                    gapComposer.end(z4);
                    break;
                case 3:
                case 4:
                    companion = companion2;
                    gapComposer.startReplaceGroup(268410602);
                    FlowsKt.m3441HeartEffect37dI38Q(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 390.0f), 0.75f, HeartScene.DEFAULT_ROTATION, new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), RecyclerView.DECELERATION_RATE, null, 0L, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, tagFormFactor == TagFormFactor.HEART_FIRST_EDITION ? HeartEdition.FIRST_EDITION : HeartEdition.STANDARD, null, null, null, null, gapComposer, 566, 0, 129008);
                    z2 = false;
                    gapComposer.end(false);
                    BiasAlignment biasAlignment22 = Alignment.Companion.Center;
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    heroTag2 = heroTag;
                    z3 = z2;
                    AnimatedContentKt.AnimatedVisibility(z, boxScopeInstance22.align(companion, biasAlignment22), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) lambda$1786942330, (Composer) gapComposer, ((i2 >> 6) & 14) | 200064, 16);
                    if (heroTag2.isActivated) {
                    }
                    z4 = true;
                    gapComposer.startReplaceGroup(-268003376);
                    gapComposer.end(z3);
                    gapComposer.end(z4);
                    gapComposer.end(z4);
                    break;
                case 5:
                case 6:
                    gapComposer.startReplaceGroup(268422551);
                    companion = companion2;
                    FlowsKt.m3442MiniCardEffect37dI38Q(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion2, 1.0f), 390.0f), 0.624f, MiniCardScene.DEFAULT_ROTATION, new Vector3(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), RecyclerView.DECELERATION_RATE, null, 0L, false, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, tagFormFactor == TagFormFactor.MINI_CARD_FIRST_EDITION ? MiniCardEdition.FIRST_EDITION : MiniCardEdition.STANDARD, null, null, null, null, gapComposer, 566, 0, 129008);
                    z2 = false;
                    gapComposer.end(false);
                    BiasAlignment biasAlignment222 = Alignment.Companion.Center;
                    BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                    heroTag2 = heroTag;
                    z3 = z2;
                    AnimatedContentKt.AnimatedVisibility(z, boxScopeInstance222.align(companion, biasAlignment222), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) lambda$1786942330, (Composer) gapComposer, ((i2 >> 6) & 14) | 200064, 16);
                    if (heroTag2.isActivated) {
                    }
                    z4 = true;
                    gapComposer.startReplaceGroup(-268003376);
                    gapComposer.end(z3);
                    gapComposer.end(z4);
                    gapComposer.end(z4);
                    break;
            }
        } else {
            heroTag2 = heroTag;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(heroTag2, tagFormFactor, z, modifier, i, 24);
        }
    }

    public static final void HeroWandEffect(WandPose wandPose, WandPoseController.Output output, WandScene wandScene, WandPoseController wandPoseController, boolean z, Modifier modifier, WandEdition wandEdition, String str, int i, Engine engine, Composer composer, int i2) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1648525475);
        int i3 = i2 | (gapComposer.changed(wandPose.ordinal()) ? 4 : 2) | (gapComposer.changedInstance(output) ? 32 : 16) | (gapComposer.changedInstance(wandScene) ? 256 : 128) | (gapComposer.changedInstance(wandPoseController) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(wandEdition.ordinal()) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(str) ? 8388608 : 4194304) | (gapComposer.changed(i) ? 67108864 : 33554432) | (gapComposer.changedInstance(engine) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer.shouldExecute(i3 & 1, (306783379 & i3) != 306783378)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Quat times = WandScene.DEFAULT_ROTATION.times(rememberCopyTiltRotation(i, (i3 >> 24) & 14, gapComposer).times(output.rotation));
            Vector3 vector3 = output.positionOffset;
            Vector3 vector32 = new Vector3(vector3.x * 0.0308f, vector3.y * 0.0308f, vector3.z * 0.0308f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (wandPoseController == null || wandPose == WandPose.Locked || z) {
                gapComposer.startReplaceGroup(1730260367);
                gapComposer.end(false);
                modifier2 = companion;
            } else {
                gapComposer.startReplaceGroup(1730082675);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new HeroTagViewKt$$ExternalSyntheticLambda6(1, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                modifier2 = FlowsKt.tagDragGestures(companion, wandPoseController, (Function2) rememberedValue2);
                gapComposer.end(false);
            }
            int i4 = i3 >> 15;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Modifier then = OffsetKt.aspectRatio(0.85f, SizeKt.fillMaxWidth(companion, 1.0f), false).then(modifier2);
            float f = output.scale * 0.11f;
            gapComposer.startReplaceGroup(1044898235);
            long j = ((Color) gapComposer.consume(ArcadeThemeKt.LocalTextColor)).value;
            if (j == 16) {
                j = Strings.getColors(gapComposer).semantic.text.standard;
            }
            gapComposer.end(false);
            boolean z2 = wandPose == WandPose.Locked;
            float f2 = output.darkening;
            float f3 = output.lightIntensity;
            float f4 = output.saturation;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new HeroTagViewKt$$ExternalSyntheticLambda7(4, mutableState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            FlowsKt.m3443WandEffect37dI38Q(then, f, times, vector32, RecyclerView.DECELERATION_RATE, str, j, z2, f2, f3, f4, wandEdition, null, engine, wandScene, (Function1) rememberedValue3, gapComposer, 512 | ((i3 >> 6) & 458752), (i4 & 112) | 1605632 | (i4 & 57344) | PKIFailureInfo.transactionIdInUse | (458752 & (i3 << 9)), 12304);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextFieldDefaults$$ExternalSyntheticLambda3(wandPose, output, wandScene, wandPoseController, z, modifier, wandEdition, str, i, engine, i2, 3);
        }
    }

    public static final void HostControllerTickLoop(final PageTagSlot pageTagSlot, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1924274194);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(pageTagSlot) ? 4 : 2) | i;
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            boolean changedInstance = gapComposer.changedInstance(pageTagSlot);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function1() { // from class: com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6 = i4;
                        final int i7 = 1;
                        final PageTagSlot pageTagSlot2 = pageTagSlot;
                        DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj;
                        switch (i6) {
                            case 0:
                                disposableEffectScope.getClass();
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = pageTagSlot2.writerCount$delegate;
                                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                                final int i8 = 0;
                                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.PageTagSlotKt$HostControllerTickLoop$lambda$0$0$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public final void dispose() {
                                        int i9 = i8;
                                        PageTagSlot pageTagSlot3 = pageTagSlot2;
                                        switch (i9) {
                                            case 0:
                                                pageTagSlot3.writerCount$delegate.setIntValue(r3.getIntValue() - 1);
                                                break;
                                            default:
                                                TagPoseController tagPoseController = pageTagSlot3.controller;
                                                if (tagPoseController.getCurrentPose() != WandPose.Locked) {
                                                    tagPoseController.snapToPose(WandPose.Still);
                                                    pageTagSlot3.outputState.setValue(tagPoseController.tick(pageTagSlot3.lastFrameTime, RecyclerView.DECELERATION_RATE));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                            default:
                                disposableEffectScope.getClass();
                                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.PageTagSlotKt$HostControllerTickLoop$lambda$0$0$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public final void dispose() {
                                        int i9 = i7;
                                        PageTagSlot pageTagSlot3 = pageTagSlot2;
                                        switch (i9) {
                                            case 0:
                                                pageTagSlot3.writerCount$delegate.setIntValue(r3.getIntValue() - 1);
                                                break;
                                            default:
                                                TagPoseController tagPoseController = pageTagSlot3.controller;
                                                if (tagPoseController.getCurrentPose() != WandPose.Locked) {
                                                    tagPoseController.snapToPose(WandPose.Still);
                                                    pageTagSlot3.outputState.setValue(tagPoseController.tick(pageTagSlot3.lastFrameTime, RecyclerView.DECELERATION_RATE));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(pageTagSlot, (Function1) rememberedValue, gapComposer);
            float density = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).getDensity();
            Float valueOf = Float.valueOf(density);
            boolean changedInstance2 = gapComposer.changedInstance(pageTagSlot) | gapComposer.changed(density);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RenderScriptBlurEffect$updateSurface$2$2$1(pageTagSlot, density, continuation, 3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(pageTagSlot, valueOf, (Function2) rememberedValue2, gapComposer);
            boolean changedInstance3 = gapComposer.changedInstance(pageTagSlot);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new TickerKt$tickerFlow$1(pageTagSlot, continuation, i2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, pageTagSlot, (Function2) rememberedValue3);
            boolean changedInstance4 = gapComposer.changedInstance(pageTagSlot);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new Function1() { // from class: com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6 = i5;
                        final int i7 = 1;
                        final PageTagSlot pageTagSlot2 = pageTagSlot;
                        DisposableEffectScope disposableEffectScope = (DisposableEffectScope) obj;
                        switch (i6) {
                            case 0:
                                disposableEffectScope.getClass();
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = pageTagSlot2.writerCount$delegate;
                                parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                                final int i8 = 0;
                                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.PageTagSlotKt$HostControllerTickLoop$lambda$0$0$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public final void dispose() {
                                        int i9 = i8;
                                        PageTagSlot pageTagSlot3 = pageTagSlot2;
                                        switch (i9) {
                                            case 0:
                                                pageTagSlot3.writerCount$delegate.setIntValue(r3.getIntValue() - 1);
                                                break;
                                            default:
                                                TagPoseController tagPoseController = pageTagSlot3.controller;
                                                if (tagPoseController.getCurrentPose() != WandPose.Locked) {
                                                    tagPoseController.snapToPose(WandPose.Still);
                                                    pageTagSlot3.outputState.setValue(tagPoseController.tick(pageTagSlot3.lastFrameTime, RecyclerView.DECELERATION_RATE));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                            default:
                                disposableEffectScope.getClass();
                                return new DisposableEffectResult() { // from class: com.squareup.cash.wallet.views.PageTagSlotKt$HostControllerTickLoop$lambda$0$0$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public final void dispose() {
                                        int i9 = i7;
                                        PageTagSlot pageTagSlot3 = pageTagSlot2;
                                        switch (i9) {
                                            case 0:
                                                pageTagSlot3.writerCount$delegate.setIntValue(r3.getIntValue() - 1);
                                                break;
                                            default:
                                                TagPoseController tagPoseController = pageTagSlot3.controller;
                                                if (tagPoseController.getCurrentPose() != WandPose.Locked) {
                                                    tagPoseController.snapToPose(WandPose.Still);
                                                    pageTagSlot3.outputState.setValue(tagPoseController.tick(pageTagSlot3.lastFrameTime, RecyclerView.DECELERATION_RATE));
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                };
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.DisposableEffect(pageTagSlot, (Function1) rememberedValue4, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PageTagSlotKt$$ExternalSyntheticLambda1(pageTagSlot, i, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Module(final CardSchemeViewModel.Module module, Function1 function1, RealImageLoader realImageLoader, Modifier modifier, Function1 function12, HeroPaymentDevicesRenderingMode heroPaymentDevicesRenderingMode, Composer composer, int i, int i2) {
        int i3;
        Function1 function13;
        Function1 function14;
        Function1 function15;
        RecomposeScopeImpl endRestartGroup;
        int i4;
        Function1 function16;
        Function1 function17;
        GapComposer gapComposer;
        String str;
        Modifier modifier2 = modifier;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-987169349);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(module) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function13 = function12;
            i3 |= gapComposer2.changedInstance(function13) ? 16384 : PKIFailureInfo.certRevoked;
            if ((196608 & i) == 0) {
                i3 |= gapComposer2.changed(heroPaymentDevicesRenderingMode.ordinal()) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            final int i6 = 1;
            final int i7 = 0;
            if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                function14 = function1;
                gapComposer2.skipToGroupEnd();
                function15 = function13;
            } else {
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (i5 != 0) {
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CardAppletTile$$ExternalSyntheticLambda0(23);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Function1 function18 = (Function1) rememberedValue;
                    i4 = 2;
                    function16 = function18;
                } else {
                    i4 = 2;
                    function16 = function13;
                }
                if (module instanceof CardSchemeViewModel.Module.HeroCard) {
                    gapComposer2.startReplaceGroup(-1120643194);
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1980847117, new TaxReturnsView$$ExternalSyntheticLambda1(27, module, modifier2, function1), gapComposer2), gapComposer2, 56);
                    gapComposer2.end(false);
                    function14 = function1;
                    function17 = function16;
                } else {
                    if (module instanceof CardSchemeViewModel.Module.HeroPaymentDevices) {
                        gapComposer2.startReplaceGroup(-1120440919);
                        HeroPaymentDevicesCarousel((CardSchemeViewModel.Module.HeroPaymentDevices) module, function1, realImageLoader, modifier2, function16, heroPaymentDevicesRenderingMode, gapComposer2, i3 & 524286);
                        function14 = function1;
                        modifier2 = modifier2;
                        function17 = function16;
                        gapComposer = gapComposer2;
                        gapComposer.end(false);
                    } else {
                        function14 = function1;
                        function17 = function16;
                        gapComposer = gapComposer2;
                        if (module instanceof CardSchemeViewModel.Module.Disclosure) {
                            gapComposer.startReplaceGroup(-1120133895);
                            CardSchemeViewModel.Module.Disclosure disclosure = (CardSchemeViewModel.Module.Disclosure) module;
                            if (disclosure.text != null || disclosure.showIcon) {
                                gapComposer.startReplaceGroup(-1120086031);
                                Disclosure(disclosure, function14, modifier2, gapComposer, (i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i3 >> 3) & 896));
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-1120034137);
                                gapComposer.end(false);
                            }
                            gapComposer.end(false);
                        } else if (module instanceof CardSchemeViewModel.Module.Divider) {
                            gapComposer.startReplaceGroup(-1120006175);
                            DBUtil.SpacerBetweenSectionXLargeBelowCell((i3 >> 9) & 14, 0, gapComposer, modifier2);
                            gapComposer.end(false);
                        } else if (module instanceof CardSchemeViewModel.Module.Header) {
                            gapComposer.startReplaceGroup(-1119915624);
                            String str2 = ((CardSchemeViewModel.Module.Header) module).text;
                            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            gapComposer2 = gapComposer;
                            ViewfinderDefaults.SectionHeader(str2, SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), (String) null, (Function0) null, (String) null, gapComposer2, 0, 28);
                            gapComposer2.end(false);
                            modifier2 = modifier;
                        } else {
                            gapComposer2 = gapComposer;
                            if (module instanceof CardSchemeViewModel.Module.ListItemModule) {
                                gapComposer2.startReplaceGroup(-1119724726);
                                CardSchemeViewModel.Module.ListItemModule listItemModule = (CardSchemeViewModel.Module.ListItemModule) module;
                                boolean z = !listItemModule.isDisabled;
                                CardSchemeViewModel.Module.Accessory.Push push = listItemModule.push;
                                modifier2 = modifier;
                                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-941887290, new Function2() { // from class: com.squareup.cash.wallet.views.WalletCardSchemeViewKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        int i8 = i7;
                                        CardSchemeViewModel.Module module2 = module;
                                        switch (i8) {
                                            case 0:
                                                Composer composer2 = (Composer) obj;
                                                int intValue = ((Integer) obj2).intValue();
                                                GapComposer gapComposer3 = (GapComposer) composer2;
                                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                    zzd zzdVar = Icons.Companion;
                                                    String str3 = ((CardSchemeViewModel.Module.ListItemModule) module2).iconToken;
                                                    zzdVar.getClass();
                                                    Icons icons = zzd.get(str3);
                                                    if (icons == null) {
                                                        icons = Icons.Pending24;
                                                    }
                                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer3, 48, 12);
                                                } else {
                                                    gapComposer3.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer3 = (Composer) obj;
                                                int intValue2 = ((Integer) obj2).intValue();
                                                GapComposer gapComposer4 = (GapComposer) composer3;
                                                if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                                    boolean changedInstance = gapComposer4.changedInstance(module2);
                                                    Object rememberedValue2 = gapComposer4.rememberedValue();
                                                    if (changedInstance || rememberedValue2 == Composer.Companion.Empty) {
                                                        rememberedValue2 = new AlertBannerKt$$ExternalSyntheticLambda3(module2, 21);
                                                        gapComposer4.updateRememberedValue(rememberedValue2);
                                                    }
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue2), (TextStyle) null, (TextLineBalancing) null, ((CardSchemeViewModel.Module.ListItemModule) module2).mainText, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer2), Expect_jvmKt.rememberComposableLambda(221693895, new Function2() { // from class: com.squareup.cash.wallet.views.WalletCardSchemeViewKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        int i8 = i6;
                                        CardSchemeViewModel.Module module2 = module;
                                        switch (i8) {
                                            case 0:
                                                Composer composer2 = (Composer) obj;
                                                int intValue = ((Integer) obj2).intValue();
                                                GapComposer gapComposer3 = (GapComposer) composer2;
                                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                    zzd zzdVar = Icons.Companion;
                                                    String str3 = ((CardSchemeViewModel.Module.ListItemModule) module2).iconToken;
                                                    zzdVar.getClass();
                                                    Icons icons = zzd.get(str3);
                                                    if (icons == null) {
                                                        icons = Icons.Pending24;
                                                    }
                                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer3, 48, 12);
                                                } else {
                                                    gapComposer3.skipToGroupEnd();
                                                }
                                                break;
                                            default:
                                                Composer composer3 = (Composer) obj;
                                                int intValue2 = ((Integer) obj2).intValue();
                                                GapComposer gapComposer4 = (GapComposer) composer3;
                                                if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                                    boolean changedInstance = gapComposer4.changedInstance(module2);
                                                    Object rememberedValue2 = gapComposer4.rememberedValue();
                                                    if (changedInstance || rememberedValue2 == Composer.Companion.Empty) {
                                                        rememberedValue2 = new AlertBannerKt$$ExternalSyntheticLambda3(module2, 21);
                                                        gapComposer4.updateRememberedValue(rememberedValue2);
                                                    }
                                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue2), (TextStyle) null, (TextLineBalancing) null, ((CardSchemeViewModel.Module.ListItemModule) module2).mainText, (Map) null, (Function1) null, false);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer2), modifier2, push != null ? push.onClick : null, z, false, null, null, (push == null || (str = push.text) == null) ? CellDefaultAccessory.Push.INSTANCE : new CellDefaultAccessory.Label(str, i4), 0L, gapComposer2, ((i3 >> 3) & 896) | 54, 3536);
                                gapComposer2 = gapComposer2;
                                gapComposer2.end(false);
                                function14 = function1;
                            } else {
                                if (module instanceof CardSchemeViewModel.Module.StatusModule) {
                                    gapComposer2.startReplaceGroup(-1119111112);
                                    Render((CardSchemeViewModel.Module.StatusModule) module, modifier, gapComposer2, (i3 & 14) | ((i3 >> 6) & 112));
                                    gapComposer2.end(false);
                                    function14 = function1;
                                } else if (module instanceof CardSchemeViewModel.Module.NextUpCard) {
                                    gapComposer2.startReplaceGroup(-1119041083);
                                    function14 = function1;
                                    Render((CardSchemeViewModel.Module.NextUpCard) module, modifier, function14, gapComposer2, (i3 & 14) | ((i3 >> 6) & 112) | ((i3 << 3) & 896));
                                    gapComposer2.end(false);
                                } else {
                                    function14 = function1;
                                    if (module instanceof CardSchemeViewModel.Module.KybRestrictionModel) {
                                        gapComposer2.startReplaceGroup(-1118940891);
                                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(modifier, 20.0f);
                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer2.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer2.startReusableNode();
                                        if (gapComposer2.inserting) {
                                            gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                                        } else {
                                            gapComposer2.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                        ColorResources_androidKt.FeatureRestrictionCallbackBanner(((CardSchemeViewModel.Module.KybRestrictionModel) module).uiCallbackModel, null, false, true, gapComposer2, 3072, 6);
                                        gapComposer2 = gapComposer2;
                                        gapComposer2.end(true);
                                        gapComposer2.end(false);
                                    } else if (module instanceof CardSchemeViewModel.Module.CallToActionModule) {
                                        gapComposer2.startReplaceGroup(-1118730897);
                                        CardSchemeViewModel.Module.CallToActionModule callToActionModule = (CardSchemeViewModel.Module.CallToActionModule) module;
                                        String str3 = callToActionModule.title;
                                        String str4 = callToActionModule.subtitle;
                                        Image image = callToActionModule.image;
                                        String str5 = callToActionModule.button.text;
                                        LinkStyle linkStyle = LinkStyle.SUBTLE;
                                        boolean changedInstance = gapComposer2.changedInstance(module);
                                        Object rememberedValue2 = gapComposer2.rememberedValue();
                                        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                                            rememberedValue2 = new PageTagSlotKt$$ExternalSyntheticLambda0(module, 17);
                                            gapComposer2.updateRememberedValue(rememberedValue2);
                                        }
                                        FirstOrNullOnTimeoutKt.UpsellWidget(image, str3, str4, str5, (Function0) rememberedValue2, modifier, linkStyle, gapComposer2, 1572864 | ((i3 << 6) & 458752));
                                        modifier2 = modifier;
                                        gapComposer2 = gapComposer2;
                                        gapComposer2.end(false);
                                    } else {
                                        modifier2 = modifier;
                                        if (!(module instanceof CardSchemeViewModel.Module.ShippingTimeline)) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 518040609, false);
                                        }
                                        gapComposer2.startReplaceGroup(518111254);
                                        Render((CardSchemeViewModel.Module.ShippingTimeline) module, modifier2, gapComposer2, (i3 & 14) | ((i3 >> 6) & 112));
                                        gapComposer2.end(false);
                                    }
                                }
                                modifier2 = modifier;
                            }
                        }
                    }
                    gapComposer2 = gapComposer;
                }
                function15 = function17;
            }
            endRestartGroup = gapComposer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(module, function14, realImageLoader, modifier2, function15, heroPaymentDevicesRenderingMode, i, i2);
                return;
            }
            return;
        }
        function13 = function12;
        if ((196608 & i) == 0) {
        }
        final int i62 = 1;
        final int i72 = 0;
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void MoneyOverlaySettleLoop(PageTagSlot pageTagSlot, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1438329140);
        int i2 = (gapComposer.changedInstance(pageTagSlot) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean changed = gapComposer.changed(pageTagSlot);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.derivedStateOf(new PageTagSlotKt$$ExternalSyntheticLambda0(pageTagSlot, i3));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            State state = (State) rememberedValue;
            Boolean bool = (Boolean) state.getValue();
            bool.booleanValue();
            boolean changed2 = gapComposer.changed(state) | gapComposer.changedInstance(pageTagSlot);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new PageTagSlotKt$MoneyOverlaySettleLoop$1$1(pageTagSlot, state, null);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(pageTagSlot, bool, (Function2) rememberedValue2, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PageTagSlotKt$$ExternalSyntheticLambda1(pageTagSlot, i, i3);
        }
    }

    public static final void NextUpCardContent(String str, String str2, String str3, boolean z, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Composer composer, int i) {
        int i2;
        Function0 function02;
        ComposableLambdaImpl composableLambdaImpl2;
        int i3;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1568981020);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            function02 = function0;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(modifier) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(ClipKt.clip(ImageKt.m179borderziNgDLE(fillMaxWidth, 1.0f, new SolidColor(Strings.getColors(gapComposer).semantic.border.subtle), m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), z, null, null, function02, 14);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Strings.getSizes(gapComposer).getClass();
            Strings.getSizes(gapComposer).getClass();
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(m183clickableoSLSa3U$default, 20.0f, 16.0f, 16.0f, 16.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            Strings.getSizes(gapComposer).getClass();
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(m, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), 104.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Start, gapComposer, 6);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            boolean z3 = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StateBindingsKt$$ExternalSyntheticLambda0(str3, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4088, 0L, (Composer) gapComposer, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            if (str2 == null) {
                gapComposer.startReplaceGroup(1809314675);
                gapComposer.end(false);
                i3 = i2;
                z2 = true;
            } else {
                gapComposer.startReplaceGroup(1809314676);
                Strings.getSizes(gapComposer).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                Strings.getSizes(gapComposer).getClass();
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                i3 = i2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                Trace.m1191Iconww6aTOc(Icons.Push24, (String) null, SizeKt.m285size3ABfNKs(companion, 16.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 438, 0);
                z2 = true;
                gapComposer.end(true);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
            composableLambdaImpl2 = composableLambdaImpl;
            composableLambdaImpl2.invoke(gapComposer, Integer.valueOf((i3 >> 15) & 14));
            gapComposer.end(z2);
            gapComposer.end(z2);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(str, str2, str3, z, function0, composableLambdaImpl2, modifier, i);
        }
    }

    public static final void NextUpCardImage(CardSchemeViewModel.Module.Icon.LegacyAvatar legacyAvatar, Image image, boolean z, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1134589687);
        int i2 = i | (gapComposer.changedInstance(legacyAvatar) ? 4 : 2) | (gapComposer.changedInstance(image) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 104.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(m285size3ABfNKs, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (image != null) {
                gapComposer.startReplaceGroup(907615887);
                ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer, ThemablesKt.urlForTheme(image, gapComposer)), null, AlphaKt.alpha(SizeKt.fillMaxSize(companion, 1.0f), z ? 0.3f : 1.0f), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer, 24624, 104);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(907865747);
                Render(legacyAvatar, z, gapComposer, ((i2 >> 3) & 112) | (i2 & 14));
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda16(legacyAvatar, image, z, i, 4);
        }
    }

    public static final void NextUpDismissibleContainer(Modifier modifier, Function0 function0, Function0 function02, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-80191842);
        int i2 = 2;
        int i3 = 4;
        int i4 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            float mo236toPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(88.0f);
            String stringResource = Room.stringResource(gapComposer, R.string.next_up_dismiss);
            boolean changed = gapComposer.changed(mo236toPx0680j_4);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new PulsingState$$ExternalSyntheticLambda0(mo236toPx0680j_4, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SwipeToDismissBoxState rememberSwipeToDismissBoxState = MenuKt.rememberSwipeToDismissBoxState(gapComposer, (Function1) rememberedValue);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj2 = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            Modifier testTag = TestTagKt.testTag(modifier, "next-up-card");
            boolean changed2 = gapComposer.changed(stringResource) | ((i4 & 896) == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj) {
                rememberedValue2 = new ModalBottomSheetKt$$ExternalSyntheticLambda6(stringResource, function02, i3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(testTag, false, (Function1) rememberedValue2);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(675453372, new CardAppletTile$$ExternalSyntheticLambda1(m340RoundedCornerShape0680j_4, i3), gapComposer);
            boolean z = (i4 & 112) == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z || rememberedValue3 == obj) {
                rememberedValue3 = new CardTransitionKt$$ExternalSyntheticLambda16(5, function0);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MenuKt.SwipeToDismissBox(rememberSwipeToDismissBoxState, rememberComposableLambda, semantics, false, false, false, (Function1) rememberedValue3, Expect_jvmKt.rememberComposableLambda(-2037331774, new TaxesAppletTile$$ExternalSyntheticLambda10(composableLambdaImpl, i2), gapComposer), gapComposer, 12586040, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(modifier, i, function0, function02, composableLambdaImpl, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void PagerDots(int i, int i2, Function1 function1, Modifier modifier, Composer composer, int i3) {
        int i4;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1430808199);
        Applier applier = gapComposer.applier;
        int i5 = 2;
        int i6 = 4;
        int i7 = i3 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changed(i2) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        int i8 = 1;
        boolean z = 0;
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 1171) != 1170)) {
            String stringResource = Room.stringResource(R.string.hero_payment_devices_pager_position, new Object[]{Integer.valueOf(i2 + 1), Integer.valueOf(i)}, gapComposer);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            Object obj2 = rememberedValue;
            if (changed || rememberedValue == obj) {
                Object stateBindingsKt$$ExternalSyntheticLambda0 = new StateBindingsKt$$ExternalSyntheticLambda0(stringResource, i5);
                gapComposer.updateRememberedValue(stateBindingsKt$$ExternalSyntheticLambda0);
                obj2 = stateBindingsKt$$ExternalSyntheticLambda0;
            }
            Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) obj2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(10.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, i8)), Alignment.Companion.Top, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-858994077);
            int i9 = 0;
            while (i9 < i) {
                boolean z2 = i9 == i2 ? i8 : z;
                int i10 = i9 + 1;
                String stringResource2 = Room.stringResource(R.string.hero_payment_devices_pager_go_to_page, new Object[]{Integer.valueOf(i10)}, gapComposer);
                Object rememberedValue2 = gapComposer.rememberedValue();
                Object obj3 = rememberedValue2;
                if (rememberedValue2 == obj) {
                    obj3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj3;
                Role role = new Role(i6);
                int i11 = ((i7 & 896) == 256 ? i8 : z) | (gapComposer.changed(i9) ? 1 : 0);
                Object rememberedValue3 = gapComposer.rememberedValue();
                Object obj4 = rememberedValue3;
                if (i11 != 0 || rememberedValue3 == obj) {
                    Object tabContentViewKt$$ExternalSyntheticLambda18 = new TabContentViewKt$$ExternalSyntheticLambda18(i9, 14, function1);
                    gapComposer.updateRememberedValue(tabContentViewKt$$ExternalSyntheticLambda18);
                    obj4 = tabContentViewKt$$ExternalSyntheticLambda18;
                }
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion, mutableInteractionSourceImpl, null, false, stringResource2, role, (Function0) obj4, 4);
                boolean changed2 = gapComposer.changed(z2);
                Object rememberedValue4 = gapComposer.rememberedValue();
                Object obj5 = rememberedValue4;
                if (changed2 || rememberedValue4 == obj) {
                    Object moneyTabUIKt$$ExternalSyntheticLambda24 = new MoneyTabUIKt$$ExternalSyntheticLambda24(z2, 21);
                    gapComposer.updateRememberedValue(moneyTabUIKt$$ExternalSyntheticLambda24);
                    obj5 = moneyTabUIKt$$ExternalSyntheticLambda24;
                }
                Modifier semantics2 = SemanticsModifierKt.semantics(m182clickableO2vRcR0$default, z, (Function1) obj5);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z);
                int i12 = i7;
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, semantics2);
                ComposeUiNode.Companion.getClass();
                Function0 function02 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(function02);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 8.0f), RoundedCornerShapeKt.CircleShape);
                if (z2 != 0) {
                    gapComposer.startReplaceGroup(1304882686);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    i4 = 0;
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.icon.prominent;
                    gapComposer.end(false);
                } else {
                    i4 = 0;
                    gapComposer.startReplaceGroup(1304884736);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.icon.extraSubtle;
                    gapComposer.end(false);
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, j, ColorKt.RectangleShape), gapComposer, i4);
                gapComposer.end(true);
                i8 = 1;
                i9 = i10;
                z = i4;
                i7 = i12;
                i6 = 4;
            }
            gapComposer.end(z);
            gapComposer.end(i8);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ListOrderedKt$$ExternalSyntheticLambda3(i, i2, function1, modifier, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PrepurchaseCacToggle(Modifier modifier, ToggleEntryPointData.ToggleState toggleState, Function0 function0, Icon icon, boolean z, Composer composer, int i) {
        Modifier modifier2;
        long j;
        MutableState mutableState;
        boolean z2;
        long j2;
        MutableState mutableState2;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        float f;
        Object defaultDraggableState;
        boolean changed3;
        Object rememberedValue2;
        boolean z3;
        boolean changed4;
        Object rememberedValue3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        MutableState mutableState3;
        long j3;
        Modifier.Companion companion;
        Icon icon2 = icon;
        toggleState.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(955473898);
        Applier applier = gapComposer.applier;
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(toggleState.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(icon2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(toggleState == ToggleEntryPointData.ToggleState.TURNED_ON), gapComposer);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Boolean.valueOf(toggleState != ToggleEntryPointData.ToggleState.DISABLED), gapComposer);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            float mo236toPx0680j_4 = density.mo236toPx0680j_4(119.0f) - density.mo236toPx0680j_4(64.0f);
            if (mo236toPx0680j_4 < RecyclerView.DECELERATION_RATE) {
                mo236toPx0680j_4 = 0.0f;
            }
            boolean changed5 = gapComposer.changed(((Boolean) rememberUpdatedState.getValue()).booleanValue());
            Object rememberedValue4 = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed5 || rememberedValue4 == obj) {
                rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(((Boolean) rememberUpdatedState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE, gapComposer);
            }
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue4;
            ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
            float f2 = mo236toPx0680j_4;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(parcelableSnapshotMutableFloatState.getFloatValue(), null, null, null, gapComposer, 0, 30);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue5;
            Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
            boolean changed6 = gapComposer.changed(mutableFloatState) | gapComposer.changed(rememberUpdatedState);
            Object rememberedValue6 = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changed6 || rememberedValue6 == obj) {
                rememberedValue6 = new NavHostKt$NavHost$29$1$1$1(mutableFloatState, rememberUpdatedState, continuation, 5);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue6);
            boolean z4 = (((Boolean) rememberUpdatedState.getValue()).booleanValue() && parcelableSnapshotMutableFloatState.getFloatValue() < 0.5f) || (!((Boolean) rememberUpdatedState.getValue()).booleanValue() && parcelableSnapshotMutableFloatState.getFloatValue() > 0.5f);
            if (!((Boolean) rememberUpdatedState2.getValue()).booleanValue() && ((Boolean) rememberUpdatedState.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(-912527790);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    z2 = false;
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    z2 = false;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors.component.toggle.active.background.disabled;
                gapComposer.end(z2);
            } else if (((Boolean) rememberUpdatedState2.getValue()).booleanValue()) {
                if ((!((Boolean) rememberUpdatedState.getValue()).booleanValue() || z4) && (((Boolean) rememberUpdatedState.getValue()).booleanValue() || !z4)) {
                    gapComposer.startReplaceGroup(-912519024);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.background.subtle;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-912520977);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors3.semantic.background.brand;
                    gapComposer.end(false);
                }
                mutableState = rememberUpdatedState;
                long j4 = j;
                mutableState2 = mutableState;
                State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j4, null, null, gapComposer, 0, 14);
                String stringResource = Room.stringResource(gapComposer, R.string.apcac_toggle_dimmed_state_accessibility_description);
                String stringResource2 = Room.stringResource(gapComposer, R.string.apcac_toggle_turned_on_state_accessibility_description);
                String stringResource3 = Room.stringResource(gapComposer, R.string.apcac_toggle_turned_off_state_accessibility_description);
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier clip = ClipKt.clip(SizeKt.m287sizeVpY3zN4(SizeKt.m290width3ABfNKs(companion2, 119.0f), 119.0f, 64.0f), RoundedCornerShapeKt.RoundedCornerShape(100));
                changed = gapComposer.changed(m153animateColorAsStateeuL9pac);
                rememberedValue = gapComposer.rememberedValue();
                if (!changed || rememberedValue == obj) {
                    rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda10(m153animateColorAsStateeuL9pac, 24);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier drawBehind = ClipKt.drawBehind(clip, (Function1) rememberedValue);
                Orientation orientation = Orientation.Horizontal;
                boolean z5 = (((Boolean) rememberUpdatedState2.getValue()).booleanValue() || z) ? false : true;
                changed2 = gapComposer.changed(((Boolean) mutableState2.getValue()).booleanValue());
                Object rememberedValue7 = gapComposer.rememberedValue();
                int i3 = 6;
                if (!changed2 || rememberedValue7 == obj) {
                    f = f2;
                    TextFieldKt$$ExternalSyntheticLambda0 textFieldKt$$ExternalSyntheticLambda0 = new TextFieldKt$$ExternalSyntheticLambda0(f, mutableFloatState, i3);
                    CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = DraggableKt.NoOpOnDragStarted;
                    defaultDraggableState = new DefaultDraggableState(textFieldKt$$ExternalSyntheticLambda0);
                    gapComposer.updateRememberedValue(defaultDraggableState);
                } else {
                    defaultDraggableState = rememberedValue7;
                    f = f2;
                }
                DraggableState draggableState = (DraggableState) defaultDraggableState;
                changed3 = gapComposer.changed(z4) | ((i2 & 896) != 256) | gapComposer.changed(mutableFloatState);
                rememberedValue2 = gapComposer.rememberedValue();
                if (!changed3 || rememberedValue2 == obj) {
                    z3 = false;
                    PrepurchaseCacToggleKt$PrepurchaseCacToggle$4$1 prepurchaseCacToggleKt$PrepurchaseCacToggle$4$1 = new PrepurchaseCacToggleKt$PrepurchaseCacToggle$4$1(z4, function0, mutableFloatState, parcelableSnapshotMutableIntState, null);
                    gapComposer.updateRememberedValue(prepurchaseCacToggleKt$PrepurchaseCacToggle$4$1);
                    rememberedValue2 = prepurchaseCacToggleKt$PrepurchaseCacToggle$4$1;
                } else {
                    z3 = false;
                }
                Modifier draggable$default = DraggableKt.draggable$default(drawBehind, draggableState, orientation, z5, null, false, null, (Function3) rememberedValue2, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
                changed4 = gapComposer.changed(rememberUpdatedState2) | gapComposer.changed(stringResource) | gapComposer.changed(mutableState2) | gapComposer.changed(stringResource2) | gapComposer.changed(stringResource3);
                rememberedValue3 = gapComposer.rememberedValue();
                if (!changed4 || rememberedValue3 == obj) {
                    rememberedValue3 = new SelfieWorkflow$$ExternalSyntheticLambda78(stringResource, stringResource2, stringResource3, rememberUpdatedState2, mutableState2, 1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Modifier semantics = SemanticsModifierKt.semantics(draggable$default, z3, (Function1) rememberedValue3);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, z3);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier != null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
                Integer valueOf2 = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf2, composeUiNode$Companion$SetModifier$14);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
                long j5 = Strings.getColors(gapComposer).semantic.background.f1047app;
                long j6 = Strings.getColors(gapComposer).semantic.border.subtle;
                boolean changed7 = gapComposer.changed(animateFloatAsState) | gapComposer.changed(f);
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (changed7 || rememberedValue8 == obj) {
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    rememberedValue8 = new CardTransitionKt$$ExternalSyntheticLambda24(f, animateFloatAsState, 3);
                    gapComposer.updateRememberedValue(rememberedValue8);
                } else {
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                }
                Modifier clip2 = ClipKt.clip(SizeKt.m285size3ABfNKs(ColorKt.graphicsLayer(companion2, (Function1) rememberedValue8), 64.0f), RoundedCornerShapeKt.CircleShape);
                boolean changed8 = gapComposer.changed(j5) | gapComposer.changed(mutableState2) | gapComposer.changed(rememberUpdatedState2) | gapComposer.changed(j6);
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (changed8 || rememberedValue9 == obj) {
                    mutableState3 = rememberUpdatedState2;
                    rememberedValue9 = new BorderKt$$ExternalSyntheticLambda0(j5, j6, mutableState2, mutableState3);
                    gapComposer.updateRememberedValue(rememberedValue9);
                } else {
                    mutableState3 = rememberUpdatedState2;
                }
                Modifier drawBehind2 = ClipKt.drawBehind(clip2, (Function1) rememberedValue9);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, drawBehind2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
                if (z) {
                    gapComposer.startReplaceGroup(29746761);
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion2, 16.0f));
                    gapComposer.end(false);
                    icon2 = icon;
                    companion = companion2;
                } else {
                    boolean z6 = false;
                    gapComposer.startReplaceGroup(29856687);
                    icon2 = icon;
                    String str = icon != null ? icon2.arcade_id : null;
                    if (str == null) {
                        gapComposer.startReplaceGroup(29856686);
                        gapComposer.end(false);
                        companion = companion2;
                    } else {
                        gapComposer.startReplaceGroup(29856687);
                        if (((Boolean) mutableState3.getValue()).booleanValue()) {
                            gapComposer.startReplaceGroup(-724059433);
                            j3 = Strings.getColors(gapComposer).semantic.icon.standard;
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-723975113);
                            j3 = Strings.getColors(gapComposer).semantic.icon.disabled;
                            gapComposer.end(false);
                        }
                        companion = companion2;
                        State m153animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j3, null, null, gapComposer, 0, 14);
                        Icons.Companion.getClass();
                        Icons icons = zzd.get(str);
                        if (icons == null) {
                            icons = Icons.PayInFour16;
                        }
                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, ((Color) m153animateColorAsStateeuL9pac2.getValue()).value, gapComposer, 48, 4);
                        gapComposer = gapComposer;
                        z6 = false;
                        gapComposer.end(false);
                    }
                    gapComposer.end(z6);
                }
                gapComposer.end(true);
                gapComposer.end(true);
                modifier2 = companion;
            } else {
                gapComposer.startReplaceGroup(-912525006);
                Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    z2 = false;
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    z2 = false;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors4.component.toggle.inactive.background.disabled;
                gapComposer.end(z2);
            }
            j = j2;
            mutableState = rememberUpdatedState;
            long j42 = j;
            mutableState2 = mutableState;
            State m153animateColorAsStateeuL9pac3 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j42, null, null, gapComposer, 0, 14);
            String stringResource4 = Room.stringResource(gapComposer, R.string.apcac_toggle_dimmed_state_accessibility_description);
            String stringResource22 = Room.stringResource(gapComposer, R.string.apcac_toggle_turned_on_state_accessibility_description);
            String stringResource32 = Room.stringResource(gapComposer, R.string.apcac_toggle_turned_off_state_accessibility_description);
            Modifier.Companion companion22 = Modifier.Companion.$$INSTANCE;
            Modifier clip3 = ClipKt.clip(SizeKt.m287sizeVpY3zN4(SizeKt.m290width3ABfNKs(companion22, 119.0f), 119.0f, 64.0f), RoundedCornerShapeKt.RoundedCornerShape(100));
            changed = gapComposer.changed(m153animateColorAsStateeuL9pac3);
            rememberedValue = gapComposer.rememberedValue();
            if (!changed) {
            }
            rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda10(m153animateColorAsStateeuL9pac3, 24);
            gapComposer.updateRememberedValue(rememberedValue);
            Modifier drawBehind3 = ClipKt.drawBehind(clip3, (Function1) rememberedValue);
            Orientation orientation2 = Orientation.Horizontal;
            if (((Boolean) rememberUpdatedState2.getValue()).booleanValue()) {
            }
            changed2 = gapComposer.changed(((Boolean) mutableState2.getValue()).booleanValue());
            Object rememberedValue72 = gapComposer.rememberedValue();
            int i32 = 6;
            if (changed2) {
            }
            f = f2;
            TextFieldKt$$ExternalSyntheticLambda0 textFieldKt$$ExternalSyntheticLambda02 = new TextFieldKt$$ExternalSyntheticLambda0(f, mutableFloatState, i32);
            CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$52 = DraggableKt.NoOpOnDragStarted;
            defaultDraggableState = new DefaultDraggableState(textFieldKt$$ExternalSyntheticLambda02);
            gapComposer.updateRememberedValue(defaultDraggableState);
            DraggableState draggableState2 = (DraggableState) defaultDraggableState;
            changed3 = gapComposer.changed(z4) | ((i2 & 896) != 256) | gapComposer.changed(mutableFloatState);
            rememberedValue2 = gapComposer.rememberedValue();
            if (changed3) {
            }
            z3 = false;
            PrepurchaseCacToggleKt$PrepurchaseCacToggle$4$1 prepurchaseCacToggleKt$PrepurchaseCacToggle$4$12 = new PrepurchaseCacToggleKt$PrepurchaseCacToggle$4$1(z4, function0, mutableFloatState, parcelableSnapshotMutableIntState, null);
            gapComposer.updateRememberedValue(prepurchaseCacToggleKt$PrepurchaseCacToggle$4$12);
            rememberedValue2 = prepurchaseCacToggleKt$PrepurchaseCacToggle$4$12;
            Modifier draggable$default2 = DraggableKt.draggable$default(drawBehind3, draggableState2, orientation2, z5, null, false, null, (Function3) rememberedValue2, false, EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            changed4 = gapComposer.changed(rememberUpdatedState2) | gapComposer.changed(stringResource4) | gapComposer.changed(mutableState2) | gapComposer.changed(stringResource22) | gapComposer.changed(stringResource32);
            rememberedValue3 = gapComposer.rememberedValue();
            if (!changed4) {
            }
            rememberedValue3 = new SelfieWorkflow$$ExternalSyntheticLambda78(stringResource4, stringResource22, stringResource32, rememberUpdatedState2, mutableState2, 1);
            gapComposer.updateRememberedValue(rememberedValue3);
            Modifier semantics2 = SemanticsModifierKt.semantics(draggable$default2, z3, (Function1) rememberedValue3);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, z3);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, semantics2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(modifier2, toggleState, function0, icon2, z, i);
        }
    }

    public static final void PrepurchaseCardButtons(CardSchemeViewModel.Module.HeroCard heroCard, Modifier modifier, CardSchemeViewModel.Module.Accessory.Button button, CardSchemeViewModel.Module.Accessory.Button button2, PrepurchaseCardData.Toggle toggle, Function0 function0, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        boolean z;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        Modifier.Companion companion;
        Object obj;
        String str;
        float f;
        Modifier modifier3;
        boolean z2;
        int i2;
        int i3;
        RippleNodeFactory rippleNodeFactory;
        String m;
        Map map;
        ToggleEntryPointData.ToggleState toggleState = toggle.state;
        heroCard.getClass();
        button.getClass();
        function0.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-710689795);
        Applier applier = gapComposer.applier;
        int i4 = i | (gapComposer.changedInstance(heroCard) ? 4 : 2) | 48 | (gapComposer.changedInstance(button) ? 256 : 128) | (gapComposer.changedInstance(button2) ? 2048 : 1024) | (gapComposer.changedInstance(toggle) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf(!heroCard.cardDetails.isEnabled), gapComposer);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Boolean.valueOf(button.isLoading), gapComposer);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            Object obj2 = DefaultSizes.border.entries;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            Function0 function02 = null;
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight = rowScopeInstance.weight(1.0f, companion2, true);
            if (!button.isEnabled || ((Boolean) rememberUpdatedState2.getValue()).booleanValue()) {
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                z = false;
            } else {
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                z = true;
            }
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
            CircleButton(weight, z, ((Boolean) rememberUpdatedState.getValue()).booleanValue() ? Icons.LockLocked16 : Icons.LockUnlocked16, button.onClick, button.text, gapComposer, 0);
            CircleButton(rowScopeInstance.weight(1.0f, companion2, true), button2.isEnabled, Icons.Copy16, button2.onClick, button2.text, gapComposer, MLKEMEngine.KyberPolyBytes);
            String str2 = toggle.infoIconActionUrl;
            boolean z3 = toggleState == ToggleEntryPointData.ToggleState.DISABLED;
            Modifier weight2 = rowScopeInstance.weight(1.4f, companion2, true);
            Strings.getSizes(gapComposer).getClass();
            Modifier clip = ClipKt.clip(weight2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (rememberedValue == obj3) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            if (z3) {
                gapComposer.startReplaceGroup(-679271356);
                gapComposer.end(false);
                i2 = 1;
                str = str2;
                obj = obj3;
                companion = companion2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                rippleNodeFactory = null;
                i3 = 2;
                f = RecyclerView.DECELERATION_RATE;
                modifier3 = clip;
                z2 = false;
            } else {
                gapComposer.startReplaceGroup(255183009);
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                companion = companion2;
                obj = obj3;
                str = str2;
                f = RecyclerView.DECELERATION_RATE;
                modifier3 = clip;
                z2 = false;
                i2 = 1;
                i3 = 2;
                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer, 0, 15);
                gapComposer.end(false);
                rippleNodeFactory = m3400rippleYJYuY3k;
            }
            boolean z4 = !toggle.loading;
            if (z3) {
                gapComposer.startReplaceGroup(-679142396);
                gapComposer.end(z2);
                m = null;
            } else {
                m = re$$ExternalSyntheticOutline0.m(gapComposer, 255187210, R.string.apcac_toggle_click_label, gapComposer, z2);
            }
            Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(modifier3, mutableInteractionSourceImpl, rippleNodeFactory, z4, m, new Role(i3), function0);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(m181clickableO2vRcR0, f, 8.0f, i2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
            PrepurchaseCacToggle(null, toggle.state, function0, toggle.icon, toggle.loading, gapComposer, (i4 >> 9) & 896);
            Strings.getSizes(gapComposer).getClass();
            modifier2 = companion;
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(modifier2, 4.0f));
            String str3 = toggle.text;
            if (str3 == null) {
                gapComposer.startReplaceGroup(375775940);
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(375775941);
                String str4 = str;
                boolean z5 = (toggleState == ToggleEntryPointData.ToggleState.TURNED_ON && str4 == null) ? z2 : true;
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                builder.append(str3);
                if (z5) {
                    builder.append(" ");
                    KeyMappingKt.appendInlineContent(builder, "<info_icon>", "�");
                }
                AnnotatedString annotatedString = builder.toAnnotatedString();
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).helpText, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744447);
                long j = Strings.getColors(gapComposer).semantic.text.standard;
                if (z5) {
                    gapComposer.startReplaceGroup(1516878904);
                    if (str4 == null) {
                        gapComposer.startReplaceGroup(1517015737);
                    } else {
                        gapComposer.startReplaceGroup(1517015738);
                        boolean changed = gapComposer.changed(str4) | ((i4 & 3670016) == 1048576 ? true : z2);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        if (changed || rememberedValue2 == obj) {
                            rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str4, 25);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        function02 = (Function0) rememberedValue2;
                    }
                    gapComposer.end(z2);
                    map = MapsKt__MapsJVMKt.mapOf(new Pair("<info_icon>", inlineInfoIcon(function02)));
                    gapComposer.end(z2);
                } else {
                    gapComposer.startReplaceGroup(1517110009);
                    gapComposer.end(z2);
                    map = EmptyMap.INSTANCE;
                    map.getClass();
                }
                Room.m1164Text25TpFw(0, 0, 0, 0, 48, 0, 2032, j, (Composer) gapComposer, SizeKt.fillMaxWidth(modifier2, 1.0f), annotatedString, m994copyp1EtxEg$default, (TextLineBalancing) null, map, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(z2);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetKt$$ExternalSyntheticLambda0(heroCard, modifier2, button, button2, toggle, function0, function1, i);
        }
    }

    public static final void PrepurchaseCardHeaderView(PrepurchaseCardData.CardHeader cardHeader, Function1 function1, Modifier modifier, Composer composer, int i) {
        Function1 function12;
        Modifier modifier2;
        int i2;
        Modifier.Companion companion;
        boolean z;
        Object obj;
        cardHeader.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1576804854);
        int i3 = i | (gapComposer.changedInstance(cardHeader) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(m300paddingVpY3zN4$default, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = new CardAppletTile$$ExternalSyntheticLambda0(20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m302paddingqDBjuR0$default, true, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Function0 function0 = null;
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
            String str = cardHeader.title;
            if (str == null) {
                gapComposer.startReplaceGroup(-913949024);
                gapComposer.end(false);
                i2 = i3;
                companion = companion2;
                z = false;
                obj = obj2;
            } else {
                gapComposer.startReplaceGroup(-913949023);
                i2 = i3;
                companion = companion2;
                z = false;
                obj = obj2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).numeralLarge, (TextLineBalancing) null, cardHeader.amount, (Map) null, (Function1) null, false);
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
            String str2 = cardHeader.buttonClientRoute;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-913527238);
                gapComposer.end(z);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(-913527237);
                boolean changed = gapComposer.changed(str2) | ((i2 & 112) == 32 ? true : z);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == obj) {
                    function12 = function1;
                    rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda13(function12, str2, 26);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    function12 = function1;
                }
                function0 = (Function0) rememberedValue2;
                gapComposer.end(z);
            }
            coil3.size.SizeKt.ButtonCompact(function0, null, null, false, false, null, Expect_jvmKt.rememberComposableLambda(425571192, new CardAppletTile$$ExternalSyntheticLambda1(cardHeader, 1), gapComposer), gapComposer, 1572864, 62);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(modifier2, (Object) cardHeader, function12, i, 25);
        }
    }

    public static final void PresentationTimelineContent(PresentationTimelineViewModel presentationTimelineViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        TimelineItem.State state;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(704531618);
        int i2 = i | (gapComposer.changedInstance(presentationTimelineViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Countries.PageHeader(presentationTimelineViewModel.title, (Modifier) null, Expect_jvmKt.rememberComposableLambda(2002999651, new FieldBinding$$ExternalSyntheticLambda4(presentationTimelineViewModel, 14), gapComposer), presentationTimelineViewModel.subtitle, gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            gapComposer = gapComposer;
            TimelineState rememberTimelineState = LazyGridDslKt.rememberTimelineState(null, gapComposer, 1);
            ArrayList<PresentationTimelineViewModel.Step> arrayList = presentationTimelineViewModel.steps;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (PresentationTimelineViewModel.Step step : arrayList) {
                int ordinal = step.state.ordinal();
                if (ordinal == 0) {
                    state = TimelineItem.State.Done;
                } else if (ordinal == 1) {
                    state = TimelineItem.State.Incomplete;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    state = TimelineItem.State.NotStarted;
                }
                arrayList2.add(LazyListLayoutInfoKt.TimelineItem$default(state, step.title, step.date, null, null, null, 120));
            }
            LazyListLayoutInfoKt.Timeline(rememberTimelineState, Tags.toImmutableList(arrayList2), null, gapComposer, 0, 4);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13));
            PresentationAction presentationAction = presentationTimelineViewModel.action;
            if (presentationAction != null) {
                gapComposer.startReplaceGroup(1691502316);
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-548425483, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(3, function1, presentationAction), gapComposer), gapComposer, 24576, 15);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1691654154);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxReturnsView$$ExternalSyntheticLambda1(modifier, (Object) presentationTimelineViewModel, function1, i, 26);
        }
    }

    public static final void PresentationTimelineView(PresentationTimelineViewModel presentationTimelineViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        presentationTimelineViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-525758901);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(presentationTimelineViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PayHomeViewKt$$ExternalSyntheticLambda2(i4, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(597646356, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(i3, (Object) presentationTimelineViewModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(presentationTimelineViewModel, function1, i, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Render(final CardSchemeViewModel.Module.HeroTag heroTag, final Modifier modifier, final int i, float f, boolean z, boolean z2, Composer composer, final int i2, final int i3) {
        int i4;
        float f2;
        int i5;
        final boolean z3;
        int i6;
        boolean z4;
        final float f3;
        final boolean z5;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        Object logger$_log$2;
        boolean z6;
        boolean z7;
        TagFormFactor tagFormFactor;
        boolean z8;
        int i7;
        Continuation continuation;
        PageTagSlot pageTagSlot;
        final PageTagSlot pageTagSlot2;
        Applier applier;
        boolean z9;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        Object obj;
        int i8;
        float f4;
        CardSchemeViewModel.Module.HeroTag heroTag2;
        GapComposer gapComposer2;
        heroTag.getClass();
        boolean z13 = heroTag.isLocked;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(1947471802);
        Applier applier2 = gapComposer3.applier;
        if ((i2 & 6) == 0) {
            i4 = (gapComposer3.changedInstance(heroTag) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer3.changed(modifier) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer3.changed(i) ? 256 : 128;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            f2 = f;
            i4 |= gapComposer3.changed(f2) ? 2048 : 1024;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                z3 = z;
                i4 |= gapComposer3.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 196608;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i2 & 196608) == 0) {
                        i4 |= gapComposer3.changed(z4) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 74899) != 74898)) {
                    float f5 = i9 != 0 ? RecyclerView.DECELERATION_RATE : f2;
                    boolean z14 = i5 != 0 ? false : z3;
                    boolean z15 = i6 != 0 ? true : z4;
                    Object obj2 = (PlatformHapticFeedback) gapComposer3.consume(CompositionLocalsKt.LocalHapticFeedback);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    Object obj3 = Composer.Companion.Empty;
                    if (rememberedValue == obj3) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline1.m(z13, gapComposer3);
                    }
                    MutableState mutableState = (MutableState) rememberedValue;
                    boolean z16 = heroTag.isActivated;
                    TagFormFactor tagFormFactor2 = heroTag.formFactor;
                    Boolean valueOf = Boolean.valueOf(z13);
                    boolean changedInstance = gapComposer3.changedInstance(heroTag) | gapComposer3.changedInstance(obj2);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj3) {
                        z6 = z15;
                        z7 = z13;
                        tagFormFactor = tagFormFactor2;
                        z8 = false;
                        i7 = i4;
                        Continuation continuation2 = null;
                        logger$_log$2 = new Logger$_log$2(heroTag, obj2, mutableState, continuation2, 10);
                        gapComposer3.updateRememberedValue(logger$_log$2);
                        continuation = continuation2;
                    } else {
                        tagFormFactor = tagFormFactor2;
                        z6 = z15;
                        z7 = z13;
                        z8 = false;
                        i7 = i4;
                        logger$_log$2 = rememberedValue2;
                        continuation = null;
                    }
                    Updater.LaunchedEffect(gapComposer3, valueOf, (Function2) logger$_log$2);
                    ProvidableCompositionLocal providableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                    CardRegistry cardRegistry = (CardRegistry) gapComposer3.consume(providableCompositionLocal);
                    final WandPose wandPose = z7 ? WandPose.Locked : z14 ? WandPose.Still : !z16 ? WandPose.Inactive : WandPose.Lean;
                    if (((Boolean) gapComposer3.consume(InspectionModeKt.LocalInspectionMode)).booleanValue() || cardRegistry == null) {
                        final boolean z17 = z6;
                        final float f6 = f5;
                        final boolean z18 = z14;
                        gapComposer3.startReplaceGroup(715743193);
                        HeroTagInspectionStub(heroTag, heroTag.formFactor, heroTag.isLoading, modifier, gapComposer3, (i7 & 14) | ((i7 << 6) & 7168));
                        gapComposer3.end(false);
                        endRestartGroup = gapComposer3.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        final int i10 = 0;
                        function2 = new Function2() { // from class: com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                switch (i10) {
                                    case 0:
                                        ((Integer) obj5).getClass();
                                        UtilsKt.Render(heroTag, modifier, i, f6, z18, z17, (Composer) obj4, Updater.updateChangedFlags(i2 | 1), i3);
                                        break;
                                    case 1:
                                        ((Integer) obj5).getClass();
                                        UtilsKt.Render(heroTag, modifier, i, f6, z18, z17, (Composer) obj4, Updater.updateChangedFlags(i2 | 1), i3);
                                        break;
                                    default:
                                        ((Integer) obj5).getClass();
                                        UtilsKt.Render(heroTag, modifier, i, f6, z18, z17, (Composer) obj4, Updater.updateChangedFlags(i2 | 1), i3);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        gapComposer3.startReplaceGroup(715849864);
                        gapComposer3.end(z8);
                        final boolean z19 = z14;
                        Engine tagEngineCache = CardTransitionKt.tagEngineCache(gapComposer3);
                        String str2 = heroTag.deviceId;
                        if (str2 == null) {
                            str2 = heroTag.tagThemeToken;
                        }
                        if (tagFormFactor == null) {
                            gapComposer3.startReplaceGroup(716544728);
                            gapComposer3.end(z8);
                            pageTagSlot2 = continuation;
                        } else {
                            gapComposer3.startReplaceGroup(716544729);
                            WandPose wandPose2 = z19 ? WandPose.Still : WandPose.Lean;
                            gapComposer3.startReplaceGroup(-1073766626);
                            CardRegistry cardRegistry2 = (CardRegistry) gapComposer3.consume(providableCompositionLocal);
                            if (cardRegistry2 != null) {
                                LinkedHashMap linkedHashMap = cardRegistry2.pageTagSlots;
                                Context context = (Context) gapComposer3.consume(AndroidCompositionLocals_androidKt.LocalContext);
                                Engine tagEngineCache2 = CardTransitionKt.tagEngineCache(gapComposer3);
                                if (tagEngineCache2 != null) {
                                    PageTagSlot pageTagSlot3 = (PageTagSlot) linkedHashMap.get(Integer.valueOf(i));
                                    if (pageTagSlot3 == null || pageTagSlot3.formFactor != tagFormFactor || !Intrinsics.areEqual(pageTagSlot3.tagIdentity, str2)) {
                                        if (pageTagSlot3 != null) {
                                            pageTagSlot3.dispose();
                                        }
                                        pageTagSlot3 = new PageTagSlot(str2, tagFormFactor, wandPose2, context, tagEngineCache2);
                                        linkedHashMap.put(Integer.valueOf(i), pageTagSlot3);
                                    }
                                    pageTagSlot = pageTagSlot3;
                                    z8 = false;
                                    gapComposer3.end(false);
                                    gapComposer3.end(z8);
                                    pageTagSlot2 = pageTagSlot;
                                }
                            }
                            gapComposer3.end(z8);
                            pageTagSlot = null;
                            gapComposer3.end(z8);
                            pageTagSlot2 = pageTagSlot;
                        }
                        if (pageTagSlot2 == 0) {
                            endRestartGroup = gapComposer3.endRestartGroup();
                            if (endRestartGroup == null) {
                                return;
                            }
                            final int i11 = 1;
                            final boolean z20 = z6;
                            final float f7 = f5;
                            function2 = new Function2() { // from class: com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    switch (i11) {
                                        case 0:
                                            ((Integer) obj5).getClass();
                                            UtilsKt.Render(heroTag, modifier, i, f7, z19, z20, (Composer) obj4, Updater.updateChangedFlags(i2 | 1), i3);
                                            break;
                                        case 1:
                                            ((Integer) obj5).getClass();
                                            UtilsKt.Render(heroTag, modifier, i, f7, z19, z20, (Composer) obj4, Updater.updateChangedFlags(i2 | 1), i3);
                                            break;
                                        default:
                                            ((Integer) obj5).getClass();
                                            UtilsKt.Render(heroTag, modifier, i, f7, z19, z20, (Composer) obj4, Updater.updateChangedFlags(i2 | 1), i3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            boolean z21 = z6;
                            final float f8 = f5;
                            Scene scene = pageTagSlot2.scene;
                            MutableState transitionType = CardTransitionKt.getTransitionType(gapComposer3);
                            if (z19) {
                                applier = applier2;
                                z9 = z16;
                                gapComposer3.startReplaceGroup(717670184);
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(717057066);
                                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = (CardRegistry$CardTransition$TransitionType) transitionType.getValue();
                                boolean changed = gapComposer3.changed(transitionType) | gapComposer3.changedInstance(cardRegistry);
                                applier = applier2;
                                Object rememberedValue3 = gapComposer3.rememberedValue();
                                if (changed || rememberedValue3 == obj3) {
                                    z9 = z16;
                                    rememberedValue3 = new NavHostKt$NavHost$29$1$1$1(cardRegistry, transitionType, (Continuation) null, 4);
                                    gapComposer3.updateRememberedValue(rememberedValue3);
                                } else {
                                    z9 = z16;
                                }
                                Updater.LaunchedEffect(cardRegistry, cardRegistry$CardTransition$TransitionType, (Function2) rememberedValue3, gapComposer3);
                                gapComposer3.end(false);
                            }
                            Animatable animatable = cardRegistry.activeHeroTagFocusGain;
                            final float floatValue = animatable != null ? ((Number) animatable.getValue()).floatValue() : 1.0f;
                            if (z19) {
                                gapComposer3.startReplaceGroup(718555637);
                                MoneyOverlaySettleLoop(pageTagSlot2, gapComposer3, 0);
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(717887804);
                                HostControllerTickLoop(pageTagSlot2, gapComposer3, 0);
                                boolean changed2 = ((i7 & 7168) == 2048) | gapComposer3.changed(floatValue) | gapComposer3.changedInstance(pageTagSlot2) | gapComposer3.changed(wandPose.ordinal());
                                Object rememberedValue4 = gapComposer3.rememberedValue();
                                if (changed2 || rememberedValue4 == obj3) {
                                    rememberedValue4 = new Function0() { // from class: com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            float f9 = f8;
                                            float coerceIn = RangesKt___RangesKt.coerceIn((1.0f - Math.abs(f9)) * floatValue, RecyclerView.DECELERATION_RATE, 1.0f);
                                            TagPoseController tagPoseController = pageTagSlot2.controller;
                                            WandPose wandPose3 = wandPose;
                                            if (coerceIn >= 1.0f) {
                                                tagPoseController.setPose(wandPose3);
                                            } else {
                                                WandPose wandPose4 = WandPose.Float;
                                                tagPoseController.setBlendedPose(wandPose3, coerceIn, Math.signum(f9));
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    gapComposer3.updateRememberedValue(rememberedValue4);
                                }
                                Updater.SideEffect((Function0) rememberedValue4, gapComposer3);
                                gapComposer3.end(false);
                            }
                            WandPoseController.Output output = (WandPoseController.Output) pageTagSlot2.outputState.getValue();
                            TagPoseController tagPoseController = !z19 ? pageTagSlot2.controller : null;
                            if (heroTag.showRingText && z21) {
                                z10 = false;
                                boolean z22 = z9;
                                str = re$$ExternalSyntheticOutline0.m(gapComposer3, 718930985, R.string.prepurchase_contour_text, gapComposer3, false);
                                z11 = z22;
                            } else {
                                z10 = false;
                                gapComposer3.startReplaceGroup(718998038);
                                gapComposer3.end(false);
                                z11 = z9;
                                str = null;
                            }
                            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(gapComposer3, R.dimen.wallet_card_max_width);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, z10);
                            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                            WandPose wandPose3 = wandPose;
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, modifier);
                            ComposeUiNode.Companion.getClass();
                            Function0 function0 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer3.startReusableNode();
                            boolean z23 = z11;
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(function0);
                            } else {
                                gapComposer3.useNode();
                            }
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                            Integer valueOf2 = Integer.valueOf(hashCode);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                            Updater.m576setimpl(gapComposer3, valueOf2, composeUiNode$Companion$SetModifier$13);
                            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, dimensionResource, 1);
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                            float f9 = floatValue;
                            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m292widthInVpY3zN4$default);
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(function0);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                            switch (tagFormFactor == null ? -1 : HeroTagViewKt$WhenMappings.$EnumSwitchMapping$0[tagFormFactor.ordinal()]) {
                                case -1:
                                    z12 = z23;
                                    obj = obj3;
                                    i8 = 2;
                                    f4 = 1.0f;
                                    heroTag2 = heroTag;
                                    gapComposer3.startReplaceGroup(1135834218);
                                    gapComposer3.end(false);
                                    gapComposer2 = gapComposer3;
                                    break;
                                case 0:
                                default:
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1135778271, false);
                                case 1:
                                case 2:
                                    z12 = z23;
                                    f4 = 1.0f;
                                    heroTag2 = heroTag;
                                    gapComposer3.startReplaceGroup(849449880);
                                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 390.0f);
                                    WandScene wandScene = scene instanceof WandScene ? (WandScene) scene : null;
                                    WandPoseController wandPoseController = tagPoseController instanceof WandPoseController ? (WandPoseController) tagPoseController : null;
                                    boolean z24 = heroTag2.isLoading;
                                    WandEdition wandEdition = tagFormFactor == TagFormFactor.WAND_FIRST_EDITION ? WandEdition.FIRST_EDITION : WandEdition.STANDARD;
                                    int i12 = heroTag2.copyAnimationTrigger;
                                    Quat quat = WandScene.DEFAULT_ROTATION;
                                    WandEdition wandEdition2 = wandEdition;
                                    obj = obj3;
                                    i8 = 2;
                                    HeroWandEffect(wandPose3, output, wandScene, wandPoseController, z24, m277height3ABfNKs, wandEdition2, str, i12, tagEngineCache, gapComposer3, 1073943104);
                                    GapComposer gapComposer4 = gapComposer3;
                                    gapComposer4.end(false);
                                    gapComposer2 = gapComposer4;
                                    break;
                                case 3:
                                case 4:
                                    z12 = z23;
                                    f4 = 1.0f;
                                    heroTag2 = heroTag;
                                    gapComposer3.startReplaceGroup(850026356);
                                    Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 390.0f);
                                    HeartScene heartScene = scene instanceof HeartScene ? (HeartScene) scene : null;
                                    HeartPoseController heartPoseController = tagPoseController instanceof HeartPoseController ? (HeartPoseController) tagPoseController : null;
                                    boolean z25 = heroTag2.isLoading;
                                    HeartEdition heartEdition = tagFormFactor == TagFormFactor.HEART_FIRST_EDITION ? HeartEdition.FIRST_EDITION : HeartEdition.STANDARD;
                                    int i13 = heroTag2.copyAnimationTrigger;
                                    Quat quat2 = HeartScene.DEFAULT_ROTATION;
                                    HeartEdition heartEdition2 = heartEdition;
                                    obj = obj3;
                                    i8 = 2;
                                    HeroHeartEffect(wandPose3, output, heartScene, heartPoseController, z25, m277height3ABfNKs2, heartEdition2, str, i13, tagEngineCache, gapComposer3, 1073943104);
                                    GapComposer gapComposer5 = gapComposer3;
                                    gapComposer5.end(false);
                                    gapComposer2 = gapComposer5;
                                    break;
                                case 5:
                                case 6:
                                    gapComposer3.startReplaceGroup(850614984);
                                    Modifier m277height3ABfNKs3 = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 390.0f);
                                    MiniCardScene miniCardScene = scene instanceof MiniCardScene ? (MiniCardScene) scene : null;
                                    MiniCardPoseController miniCardPoseController = tagPoseController instanceof MiniCardPoseController ? (MiniCardPoseController) tagPoseController : null;
                                    heroTag2 = heroTag;
                                    boolean z26 = heroTag2.isLoading;
                                    MiniCardEdition miniCardEdition = tagFormFactor == TagFormFactor.MINI_CARD_FIRST_EDITION ? MiniCardEdition.FIRST_EDITION : MiniCardEdition.STANDARD;
                                    int i14 = heroTag2.copyAnimationTrigger;
                                    float[] fArr = MiniCardScene.LIGHT_KEY_OFFSET;
                                    obj = obj3;
                                    f4 = 1.0f;
                                    z12 = z23;
                                    MiniCardEdition miniCardEdition2 = miniCardEdition;
                                    i8 = 2;
                                    HeroMiniCardEffect(wandPose3, output, miniCardScene, miniCardPoseController, z26, m277height3ABfNKs3, miniCardEdition2, str, i14, tagEngineCache, gapComposer3, 1073943104);
                                    GapComposer gapComposer6 = gapComposer3;
                                    gapComposer6.end(false);
                                    gapComposer2 = gapComposer6;
                                    break;
                            }
                            boolean z27 = heroTag2.isLoading;
                            BiasAlignment biasAlignment = Alignment.Companion.Center;
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            AnimatedContentKt.AnimatedVisibility(z27, boxScopeInstance.align(companion, biasAlignment), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) lambda$1369058334, (Composer) gapComposer2, 200064, 16);
                            if (z19 || !z12 || heroTag2.isLoading || !z7) {
                                gapComposer2.startReplaceGroup(851887100);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(851575488);
                                Modifier aspectRatio = OffsetKt.aspectRatio(f4, SizeKt.fillMaxWidth(boxScopeInstance.align(companion, biasAlignment), 0.25f), false);
                                boolean changed3 = gapComposer2.changed(f9);
                                Object rememberedValue5 = gapComposer2.rememberedValue();
                                if (changed3 || rememberedValue5 == obj) {
                                    rememberedValue5 = new PulsingState$$ExternalSyntheticLambda0(f9, 18);
                                    gapComposer2.updateRememberedValue(rememberedValue5);
                                }
                                Modifier graphicsLayer = ColorKt.graphicsLayer(aspectRatio, (Function1) rememberedValue5);
                                int i15 = CardLockViewKt.$r8$clinit;
                                int i16 = tagFormFactor == null ? -1 : CardLockViewKt.WhenMappings.$EnumSwitchMapping$1[tagFormFactor.ordinal()];
                                CardLockViewKt.LockAnimation(false, graphicsLayer, (i16 == 1 || i16 == i8) ? LockAnimationColorTreatment.LightLock.INSTANCE : LockAnimationColorTreatment.Adaptive.INSTANCE, gapComposer2, 6);
                                gapComposer2.end(false);
                            }
                            gapComposer2.end(true);
                            gapComposer2.end(true);
                            z3 = z19;
                            z5 = z21;
                            f3 = f8;
                            gapComposer = gapComposer2;
                        }
                    }
                    endRestartGroup.block = function2;
                    return;
                }
                gapComposer3.skipToGroupEnd();
                f3 = f2;
                z5 = z4;
                gapComposer = gapComposer3;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i17 = 2;
                    function2 = new Function2() { // from class: com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (i17) {
                                case 0:
                                    ((Integer) obj5).getClass();
                                    UtilsKt.Render(heroTag, modifier, i, f3, z3, z5, (Composer) obj4, Updater.updateChangedFlags(i2 | 1), i3);
                                    break;
                                case 1:
                                    ((Integer) obj5).getClass();
                                    UtilsKt.Render(heroTag, modifier, i, f3, z3, z5, (Composer) obj4, Updater.updateChangedFlags(i2 | 1), i3);
                                    break;
                                default:
                                    ((Integer) obj5).getClass();
                                    UtilsKt.Render(heroTag, modifier, i, f3, z3, z5, (Composer) obj4, Updater.updateChangedFlags(i2 | 1), i3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                    return;
                }
                return;
            }
            z3 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if (gapComposer3.shouldExecute(i4 & 1, (i4 & 74899) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z3 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 74899) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void StatusModuleAvatar(CardSchemeViewModel.Module.Icon.LegacyAvatar legacyAvatar, Composer composer, int i) {
        long j;
        long j2;
        AvatarOverlay remoteImage;
        CardSchemeViewModel.Module.Icon.LegacyAvatarBackground legacyAvatarBackground = legacyAvatar.background;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-606874545);
        int i2 = (gapComposer.changedInstance(legacyAvatar) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            int ordinal = legacyAvatarBackground.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(909120246);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.icon.inverse;
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(909122806);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.icon.inverse;
                gapComposer.end(false);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 909117187, false);
                }
                gapComposer.startReplaceGroup(909125365);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors3.semantic.icon.subtle;
                gapComposer.end(false);
            }
            int ordinal2 = legacyAvatarBackground.ordinal();
            if (ordinal2 == 0) {
                gapComposer.startReplaceGroup(909130196);
                Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors4.semantic.background.brand;
                gapComposer.end(false);
            } else if (ordinal2 == 1) {
                gapComposer.startReplaceGroup(909132885);
                Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors5.semantic.background.danger;
                gapComposer.end(false);
            } else {
                if (ordinal2 != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 909126962, false);
                }
                gapComposer.startReplaceGroup(909135605);
                Colors colors6 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors6 == null) {
                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors6.semantic.background.subtle;
                gapComposer.end(false);
            }
            long j3 = j2;
            CardSchemeViewModel.Module.Icon.LegacyAvatar.AvatarImage avatarImage = legacyAvatar.avatarImage;
            AvatarOverlay avatarOverlay = null;
            if (avatarImage instanceof CardSchemeViewModel.Module.Icon.LegacyAvatar.AvatarImage.Remote) {
                gapComposer.startReplaceGroup(-1881444183);
                ThemablesKt.urlForTheme(null, gapComposer);
                zzd zzdVar = Icons.Companion;
                throw null;
            }
            if (!(avatarImage instanceof CardSchemeViewModel.Module.Icon.LegacyAvatar.AvatarImage.Local)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 909137548, false);
            }
            gapComposer.startReplaceGroup(-1880918175);
            gapComposer.end(false);
            zzd zzdVar2 = Icons.Companion;
            String str = ((CardSchemeViewModel.Module.Icon.LegacyAvatar.AvatarImage.Local) avatarImage).iconId;
            zzdVar2.getClass();
            Icons icons = zzd.get(str);
            if (icons == null) {
                icons = Icons.Pending24;
            }
            AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(icons, j, 4);
            CardSchemeViewModel.Module.Icon.LegacyAvatar.AvatarImage avatarImage2 = legacyAvatar.badgeImage;
            if (avatarImage2 == null) {
                gapComposer.startReplaceGroup(-1880706787);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1880706786);
                if (avatarImage2 instanceof CardSchemeViewModel.Module.Icon.LegacyAvatar.AvatarImage.Local) {
                    gapComposer.startReplaceGroup(2014392943);
                    gapComposer.end(false);
                    zzd zzdVar3 = Icons.Companion;
                    String str2 = ((CardSchemeViewModel.Module.Icon.LegacyAvatar.AvatarImage.Local) avatarImage2).iconId;
                    zzdVar3.getClass();
                    Icons icons2 = zzd.get(str2);
                    if (icons2 == null) {
                        icons2 = Icons.Pending24;
                    }
                    remoteImage = new AvatarOverlay.LocalIcon(14, 0L, 0L, icons2);
                } else {
                    if (!(avatarImage2 instanceof CardSchemeViewModel.Module.Icon.LegacyAvatar.AvatarImage.Remote)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1727547495, false);
                    }
                    gapComposer.startReplaceGroup(2014518307);
                    remoteImage = new AvatarOverlay.RemoteImage(ThemablesKt.urlForTheme(null, gapComposer), false, 0L, 0L, new AvatarOverlay.LocalIcon(14, 0L, 0L, Icons.Pending24), new Hero3DCardViewKt$$ExternalSyntheticLambda11(8), 12);
                    gapComposer.end(false);
                }
                avatarOverlay = remoteImage;
                gapComposer.end(false);
            }
            TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size48, legacyAvatar.monogram, j3, (String) null, (Modifier) null, (AvatarImage) localIcon, (Function2) null, avatarOverlay, false, 0L, (Composer) gapComposer, 6, 0, 1872);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda4(legacyAvatar, i, 17);
        }
    }

    public static final void TimelineHeaderAvatar(PresentationTimelineViewModel.Icon icon, Composer composer, int i) {
        long j;
        long j2;
        Icons icons;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1906784507);
        int i2 = (gapComposer.changed(icon.ordinal()) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            int ordinal = icon.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                gapComposer.startReplaceGroup(-1531110591);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                if (ordinal != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1531120505, false);
                }
                gapComposer.startReplaceGroup(-1531116896);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.background.brand;
                gapComposer.end(false);
            }
            int ordinal2 = icon.ordinal();
            if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                gapComposer.startReplaceGroup(-1531099357);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors3.semantic.icon.standard;
                gapComposer.end(false);
            } else {
                if (ordinal2 != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1531108961, false);
                }
                gapComposer.startReplaceGroup(-1531105534);
                Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j2 = colors4.semantic.icon.inverse;
                gapComposer.end(false);
            }
            int ordinal3 = icon.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 == 1) {
                    icons = Icons.MovingExpense24;
                } else if (ordinal3 == 2) {
                    icons = Icons.Delivery24;
                } else if (ordinal3 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size48, "", j, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, j2, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 3126, 0, 2000);
            }
            icons = Icons.Check24;
            TextViewKt.m3613AvatarB_rZmmc(AvatarSize.Size48, "", j, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(icons, j2, 4), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 3126, 0, 2000);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FieldBinding$$ExternalSyntheticLambda4(icon, i, 15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x026e, code lost:
    
        if (r8.isLocked == true) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
    
        if (r5 == null) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x055e  */
    /* JADX WARN: Type inference failed for: r12v18, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r38v0, types: [kotlin.Function, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WalletScheme(Modifier modifier, List list, Function1 function1, RealImageLoader realImageLoader, Function2 function2, Composer composer, int i) {
        GapComposer gapComposer;
        MutableState mutableState;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Continuation continuation;
        boolean z;
        float f;
        MutableState mutableState2;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        Modifier.Companion companion;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        NeverEqualPolicy neverEqualPolicy;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        LinearGradient m132linearGradientmHitzGk;
        Continuation continuation2;
        LinearGradient m132linearGradientmHitzGk2;
        int i2;
        GapComposer gapComposer2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        CardSchemeViewModel.Module module;
        Modifier.Companion companion2;
        ?? r30;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
        ?? r13;
        ?? r12;
        String str;
        String str2;
        int i3;
        float f2;
        List list2 = list;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(RecyclerView.DECELERATION_RATE);
        modifier.getClass();
        list2.getClass();
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-675799057);
        Applier applier = gapComposer3.applier;
        int i4 = i | (gapComposer3.changed(modifier) ? 4 : 2) | (gapComposer3.changedInstance(list2) ? 32 : 16) | (gapComposer3.changedInstance(function1) ? 256 : 128) | (gapComposer3.changedInstance(realImageLoader) ? 2048 : 1024);
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            float dimensionResource = PrimitiveResources_androidKt.dimensionResource(gapComposer3, R.dimen.wallet_module_spacing);
            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, modifier);
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
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            CardRegistry cardRegistry = (CardRegistry) gapComposer3.consume(CardTransitionKt.LocalCardRegistry);
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy2) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof CardSchemeViewModel.Module.HeroPaymentDevices) {
                        arrayList.add(obj);
                    }
                }
                CardSchemeViewModel.Module.HeroPaymentDevices heroPaymentDevices = (CardSchemeViewModel.Module.HeroPaymentDevices) CollectionsKt.firstOrNull((List) arrayList);
                if (heroPaymentDevices != null) {
                    int i5 = heroPaymentDevices.currentPage;
                    Object orNull = CollectionsKt.getOrNull(i5 - 1, heroPaymentDevices.heroTags);
                    if (i5 <= 0) {
                        orNull = null;
                    }
                    rememberedValue = (CardSchemeViewModel.Module.HeroTag) orNull;
                }
                rememberedValue = cardRegistry != null ? cardRegistry.getActiveHeroTag() : null;
                gapComposer3.updateRememberedValue(rememberedValue);
            }
            CardSchemeViewModel.Module.HeroTag heroTag = (CardSchemeViewModel.Module.HeroTag) rememberedValue;
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Updater.mutableStateOf$default(heroTag);
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState3 = (MutableState) rememberedValue2;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion3);
            ComposeUiNode.Companion.getClass();
            float f3 = dimensionResource;
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$13);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
            Integer valueOf3 = Integer.valueOf(hashCode2);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf3, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$18);
            CardSchemeViewModel.Module.HeroTag heroTag2 = (CardSchemeViewModel.Module.HeroTag) mutableState3.getValue();
            Image image = heroTag2 != null ? heroTag2.background : null;
            boolean z2 = image != null;
            Object rememberedValue3 = gapComposer3.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = Updater.mutableStateOf$default(image);
                gapComposer3.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState4 = (MutableState) rememberedValue3;
            if (z2) {
                mutableState4.setValue(image);
            }
            Object rememberedValue4 = gapComposer3.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy2) {
                mutableState = mutableState4;
                rememberedValue4 = AnimatableKt.Animatable(z2 ? 1.0f : 0.0f, 0.01f);
                gapComposer3.updateRememberedValue(rememberedValue4);
            } else {
                mutableState = mutableState4;
            }
            Animatable animatable = (Animatable) rememberedValue4;
            Boolean valueOf4 = Boolean.valueOf(z2);
            boolean changedInstance = gapComposer3.changedInstance(animatable) | gapComposer3.changed(z2);
            Object rememberedValue5 = gapComposer3.rememberedValue();
            int i6 = 3;
            if (changedInstance || rememberedValue5 == neverEqualPolicy2) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                continuation = null;
                rememberedValue5 = new LineChartKt$Chart$1$1(animatable, z2, continuation, i6);
                gapComposer3.updateRememberedValue(rememberedValue5);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                continuation = null;
            }
            Updater.LaunchedEffect(gapComposer3, valueOf4, (Function2) rememberedValue5);
            if (z2 || ((Number) animatable.getValue()).floatValue() > RecyclerView.DECELERATION_RATE) {
                gapComposer3.startReplaceGroup(1621044573);
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(false);
                }
                long j = colors.semantic.background.f1047app;
                CardSchemeViewModel.Module.HeroTag heroTag3 = (CardSchemeViewModel.Module.HeroTag) mutableState3.getValue();
                if (heroTag3 == null || heroTag3.isActivated) {
                    CardSchemeViewModel.Module.HeroTag heroTag4 = (CardSchemeViewModel.Module.HeroTag) mutableState3.getValue();
                    if (heroTag4 != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    f = 0.0f;
                    GapComposer gapComposer4 = gapComposer3;
                    mutableState2 = mutableState3;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                    companion = companion3;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                    neverEqualPolicy = neverEqualPolicy2;
                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, null, "BackgroundOverlay", null, gapComposer4, 3072, 22);
                    Image image2 = (Image) mutableState.getValue();
                    Modifier aspectRatio = OffsetKt.aspectRatio(0.9006928f, ValueInsets.layout(SizeKt.fillMaxWidth(companion, 1.0f), new Hero3DCardViewKt$$ExternalSyntheticLambda11(6)), false);
                    float floatValue = ((Number) animatable.getValue()).floatValue();
                    int i7 = TagHeroBackgroundKt.$r8$clinit;
                    aspectRatio.getClass();
                    TagHeroBackgroundKt.TagHeroBackground(image2, ColorKt.graphicsLayer(aspectRatio, new PulsingState$$ExternalSyntheticLambda0(floatValue, 19)), gapComposer4, 0);
                    Modifier aspectRatio2 = OffsetKt.aspectRatio(0.9006928f, ValueInsets.layout(SizeKt.fillMaxWidth(companion, 1.0f), new Hero3DCardViewKt$$ExternalSyntheticLambda11(6)), false);
                    float floatValue2 = ((Number) animatable.getValue()).floatValue() * ((Number) animateFloatAsState.getValue()).floatValue();
                    aspectRatio2.getClass();
                    Modifier graphicsLayer = ColorKt.graphicsLayer(aspectRatio2, new PulsingState$$ExternalSyntheticLambda0(floatValue2, 20));
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                    m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r1, new Pair[]{new Pair(valueOf2, new Color(j)), new Pair(Float.valueOf(0.6f), new Color(j)), new Pair(valueOf, new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14)))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                    continuation2 = null;
                    BoxKt.Box(ImageKt.background$default(graphicsLayer, m132linearGradientmHitzGk, null, 6), gapComposer4, 0);
                    Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), 1.0f), 200.0f);
                    m132linearGradientmHitzGk2 = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r2, new Pair[]{new Pair(valueOf2, new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14))), new Pair(valueOf, new Color(j))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                    i2 = 0;
                    BoxKt.Box(ImageKt.background$default(m277height3ABfNKs, m132linearGradientmHitzGk2, null, 6), gapComposer4, 0);
                    gapComposer4.end(false);
                    gapComposer2 = gapComposer4;
                } else {
                    z = true;
                }
                f = 0.45f;
                GapComposer gapComposer42 = gapComposer3;
                mutableState2 = mutableState3;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                companion = companion3;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                neverEqualPolicy = neverEqualPolicy2;
                State animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f, null, "BackgroundOverlay", null, gapComposer42, 3072, 22);
                Image image22 = (Image) mutableState.getValue();
                Modifier aspectRatio3 = OffsetKt.aspectRatio(0.9006928f, ValueInsets.layout(SizeKt.fillMaxWidth(companion, 1.0f), new Hero3DCardViewKt$$ExternalSyntheticLambda11(6)), false);
                float floatValue3 = ((Number) animatable.getValue()).floatValue();
                int i72 = TagHeroBackgroundKt.$r8$clinit;
                aspectRatio3.getClass();
                TagHeroBackgroundKt.TagHeroBackground(image22, ColorKt.graphicsLayer(aspectRatio3, new PulsingState$$ExternalSyntheticLambda0(floatValue3, 19)), gapComposer42, 0);
                Modifier aspectRatio22 = OffsetKt.aspectRatio(0.9006928f, ValueInsets.layout(SizeKt.fillMaxWidth(companion, 1.0f), new Hero3DCardViewKt$$ExternalSyntheticLambda11(6)), false);
                float floatValue22 = ((Number) animatable.getValue()).floatValue() * ((Number) animateFloatAsState2.getValue()).floatValue();
                aspectRatio22.getClass();
                Modifier graphicsLayer2 = ColorKt.graphicsLayer(aspectRatio22, new PulsingState$$ExternalSyntheticLambda0(floatValue22, 20));
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r1, new Pair[]{new Pair(valueOf2, new Color(j)), new Pair(Float.valueOf(0.6f), new Color(j)), new Pair(valueOf, new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14)))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                continuation2 = null;
                BoxKt.Box(ImageKt.background$default(graphicsLayer2, m132linearGradientmHitzGk, null, 6), gapComposer42, 0);
                Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), 1.0f), 200.0f);
                m132linearGradientmHitzGk2 = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r2, new Pair[]{new Pair(valueOf2, new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j, 14))), new Pair(valueOf, new Color(j))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                i2 = 0;
                BoxKt.Box(ImageKt.background$default(m277height3ABfNKs2, m132linearGradientmHitzGk2, null, 6), gapComposer42, 0);
                gapComposer42.end(false);
                gapComposer2 = gapComposer42;
            } else {
                gapComposer3.startReplaceGroup(1623591223);
                gapComposer3.end(false);
                mutableState2 = mutableState3;
                neverEqualPolicy = neverEqualPolicy2;
                continuation2 = continuation;
                gapComposer2 = gapComposer3;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                companion = companion3;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                i2 = 0;
            }
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, i2);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, companion);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = composeUiNode$Companion$SetModifier$13;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$19);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = composeUiNode$Companion$SetModifier$12;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$110);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$14 = ownerSnapshotObserver$onCommitAffectingLayout$1;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = composeUiNode$Companion$SetModifier$1;
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$111, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$14);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$18);
            function2.invoke(gapComposer2, 6);
            CardSchemeViewModel.Module module2 = (CardSchemeViewModel.Module) CollectionsKt.firstOrNull(list);
            if (module2 == null) {
                gapComposer2.startReplaceGroup(1974012970);
                r13 = 0;
                gapComposer2.end(false);
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$14;
                r30 = continuation2;
                companion2 = companion;
                r12 = gapComposer2;
            } else {
                gapComposer2.startReplaceGroup(1974012971);
                HeroPaymentDevicesRenderingMode heroPaymentDevicesRenderingMode = HeroPaymentDevicesRenderingMode.HeroPortionOnly;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$18;
                Modifier m3793createModifierForIndexJS8el8 = m3793createModifierForIndexJS8el8(list, 0, f3, true);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    module = module2;
                    rememberedValue6 = new HeroTagViewKt$$ExternalSyntheticLambda7(8, mutableState2);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                } else {
                    module = module2;
                }
                int i8 = i4 >> 3;
                int i9 = (i8 & 896) | (i8 & 112) | 221184;
                GapComposer gapComposer5 = gapComposer2;
                f3 = f3;
                companion2 = companion;
                r30 = 0;
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$14;
                Module(module, function1, realImageLoader, m3793createModifierForIndexJS8el8, (Function1) rememberedValue6, heroPaymentDevicesRenderingMode, gapComposer5, i9, 0);
                GapComposer gapComposer6 = gapComposer5;
                r13 = 0;
                gapComposer6.end(false);
                r12 = gapComposer6;
            }
            r12.end(true);
            r12.end(true);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            Colors colors2 = (Colors) r12.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m((GapComposer) r12, -1762997026, (GapComposer) r12, (boolean) r13);
            } else {
                r12.startReplaceGroup(-1762997739);
                r12.end(r13);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, colors2.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r12, r13);
            int hashCode4 = Long.hashCode(r12.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = r12.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(r12, m177backgroundbw27NRU);
            r12.startReusableNode();
            if (r12.inserting) {
                r12.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r12.useNode();
            }
            Updater.m576setimpl(r12, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$19);
            Updater.m576setimpl(r12, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$110);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, (GapComposer) r12, composeUiNode$Companion$SetModifier$111, (GapComposer) r12, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(r12, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            r12.startReplaceGroup(-1681088438);
            int i10 = 0;
            GapComposer gapComposer7 = r12;
            for (Object obj2 : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw r30;
                }
                CardSchemeViewModel.Module module3 = (CardSchemeViewModel.Module) obj2;
                if (i10 != 0 || (module3 instanceof CardSchemeViewModel.Module.HeroPaymentDevices)) {
                    if (module3 instanceof CardSchemeViewModel.Module.CallToActionModule) {
                        str = "call-to-action:";
                    } else if (module3 instanceof CardSchemeViewModel.Module.Disclosure) {
                        str = "disclosure:";
                    } else if (Intrinsics.areEqual(module3, CardSchemeViewModel.Module.Divider.INSTANCE)) {
                        str = "divider:";
                    } else if (module3 instanceof CardSchemeViewModel.Module.Header) {
                        str = "header:";
                    } else if (module3 instanceof CardSchemeViewModel.Module.HeroCard) {
                        str = "hero-card:";
                    } else if (module3 instanceof CardSchemeViewModel.Module.HeroPaymentDevices) {
                        str = "hero-payment-devices:";
                    } else if (module3 instanceof CardSchemeViewModel.Module.KybRestrictionModel) {
                        str = "kyb-restriction:";
                    } else if (module3 instanceof CardSchemeViewModel.Module.ListItemModule) {
                        str = "list-item:";
                    } else if (module3 instanceof CardSchemeViewModel.Module.NextUpCard) {
                        str2 = "next-up:" + ((CardSchemeViewModel.Module.NextUpCard) module3).id + ":" + i10;
                        gapComposer7.startMovableGroup(1883203984, str2);
                        i3 = i11;
                        f2 = f3;
                        GapComposer gapComposer8 = gapComposer7;
                        Module(module3, function1, realImageLoader, m3793createModifierForIndexJS8el8(list, i10, f2, false), null, i10 != 0 ? HeroPaymentDevicesRenderingMode.ListPortionOnly : HeroPaymentDevicesRenderingMode.Full, gapComposer8, (i4 >> 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, 16);
                        gapComposer7 = gapComposer8;
                        gapComposer7.end(false);
                    } else if (module3 instanceof CardSchemeViewModel.Module.ShippingTimeline) {
                        str = "shipping-timeline:";
                    } else {
                        if (!(module3 instanceof CardSchemeViewModel.Module.StatusModule)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        str = "status:";
                    }
                    str2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i10, str);
                    gapComposer7.startMovableGroup(1883203984, str2);
                    i3 = i11;
                    f2 = f3;
                    GapComposer gapComposer82 = gapComposer7;
                    Module(module3, function1, realImageLoader, m3793createModifierForIndexJS8el8(list, i10, f2, false), null, i10 != 0 ? HeroPaymentDevicesRenderingMode.ListPortionOnly : HeroPaymentDevicesRenderingMode.Full, gapComposer82, (i4 >> 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION, 16);
                    gapComposer7 = gapComposer82;
                    gapComposer7.end(false);
                } else {
                    i3 = i11;
                    f2 = f3;
                }
                f3 = f2;
                i10 = i3;
                gapComposer7 = gapComposer7;
            }
            list2 = list;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer7, false, true, true);
            gapComposer = gapComposer7;
        } else {
            GapComposer gapComposer9 = gapComposer3;
            gapComposer9.skipToGroupEnd();
            gapComposer = gapComposer9;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda15(modifier, list2, function1, realImageLoader, (Function) function2, i, 28);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d1, code lost:
    
        if (r10.animateScrollToPage(0, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, r11, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(240, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(300, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$peekFirstTag(DefaultPagerState defaultPagerState, ContinuationImpl continuationImpl) {
        WalletCardSchemeViewKt$peekFirstTag$1 walletCardSchemeViewKt$peekFirstTag$1;
        PagerState pagerState;
        PagerState pagerState2;
        PagerState pagerState3;
        PagerState pagerState4;
        PagerState pagerState5;
        if (continuationImpl instanceof WalletCardSchemeViewKt$peekFirstTag$1) {
            walletCardSchemeViewKt$peekFirstTag$1 = (WalletCardSchemeViewKt$peekFirstTag$1) continuationImpl;
            int i = walletCardSchemeViewKt$peekFirstTag$1.label;
            if ((i & PKIFailureInfo.systemUnavail) != 0) {
                walletCardSchemeViewKt$peekFirstTag$1.label = i - PKIFailureInfo.systemUnavail;
                Object obj = walletCardSchemeViewKt$peekFirstTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (walletCardSchemeViewKt$peekFirstTag$1.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        walletCardSchemeViewKt$peekFirstTag$1.L$0 = defaultPagerState;
                        walletCardSchemeViewKt$peekFirstTag$1.label = 1;
                        pagerState = defaultPagerState;
                        break;
                    case 1:
                        PagerState pagerState6 = walletCardSchemeViewKt$peekFirstTag$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        pagerState = pagerState6;
                        if (((ParcelableSnapshotMutableIntState) pagerState.scrollPosition.elementTypes).getIntValue() == 0) {
                            TweenSpec tween$default = AnimatableKt.tween$default(320, 0, EasingKt.FastOutSlowInEasing, 2);
                            walletCardSchemeViewKt$peekFirstTag$1.L$0 = pagerState;
                            walletCardSchemeViewKt$peekFirstTag$1.label = 2;
                            Object animateScrollToPage = pagerState.animateScrollToPage(0, 0.5f, tween$default, walletCardSchemeViewKt$peekFirstTag$1);
                            pagerState2 = pagerState;
                            break;
                        } else {
                            return Unit.INSTANCE;
                        }
                    case 2:
                        PagerState pagerState7 = walletCardSchemeViewKt$peekFirstTag$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        pagerState2 = pagerState7;
                        walletCardSchemeViewKt$peekFirstTag$1.L$0 = pagerState2;
                        walletCardSchemeViewKt$peekFirstTag$1.label = 3;
                        pagerState3 = pagerState2;
                        break;
                    case 3:
                        PagerState pagerState8 = walletCardSchemeViewKt$peekFirstTag$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        pagerState3 = pagerState8;
                        TweenSpec tween$default2 = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, 0, EasingKt.FastOutSlowInEasing, 2);
                        walletCardSchemeViewKt$peekFirstTag$1.L$0 = pagerState3;
                        walletCardSchemeViewKt$peekFirstTag$1.label = 4;
                        Object animateScrollToPage2 = pagerState3.animateScrollToPage(0, RecyclerView.DECELERATION_RATE, tween$default2, walletCardSchemeViewKt$peekFirstTag$1);
                        pagerState4 = pagerState3;
                        break;
                    case 4:
                        PagerState pagerState9 = walletCardSchemeViewKt$peekFirstTag$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        pagerState4 = pagerState9;
                        TweenSpec tween$default3 = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 0, EasingKt.FastOutSlowInEasing, 2);
                        walletCardSchemeViewKt$peekFirstTag$1.L$0 = pagerState4;
                        walletCardSchemeViewKt$peekFirstTag$1.label = 5;
                        Object animateScrollToPage3 = pagerState4.animateScrollToPage(0, 0.03f, tween$default3, walletCardSchemeViewKt$peekFirstTag$1);
                        pagerState5 = pagerState4;
                        break;
                    case 5:
                        PagerState pagerState10 = walletCardSchemeViewKt$peekFirstTag$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        pagerState5 = pagerState10;
                        SpringSpec spring$default = AnimatableKt.spring$default(0.85f, 1500.0f, null, 4);
                        walletCardSchemeViewKt$peekFirstTag$1.L$0 = null;
                        walletCardSchemeViewKt$peekFirstTag$1.label = 6;
                        break;
                    case 6:
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        walletCardSchemeViewKt$peekFirstTag$1 = new WalletCardSchemeViewKt$peekFirstTag$1(continuationImpl);
        Object obj2 = walletCardSchemeViewKt$peekFirstTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (walletCardSchemeViewKt$peekFirstTag$1.label) {
        }
    }

    /* renamed from: createModifierForIndex--JS8el8, reason: not valid java name */
    public static final Modifier m3793createModifierForIndexJS8el8(List list, int i, float f, boolean z) {
        float f2;
        CardSchemeViewModel.Module module = (CardSchemeViewModel.Module) list.get(i);
        boolean z2 = i == list.size() - 1;
        boolean z3 = i == 0 && (module instanceof CardSchemeViewModel.Module.HeroPaymentDevices) && z;
        boolean z4 = i == 0 && (module instanceof CardSchemeViewModel.Module.HeroPaymentDevices) && !z;
        boolean z5 = module instanceof CardSchemeViewModel.Module.HeroCard;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (!z5 && !(module instanceof CardSchemeViewModel.Module.HeroPaymentDevices) && !(module instanceof CardSchemeViewModel.Module.NextUpCard) && !(module instanceof CardSchemeViewModel.Module.CallToActionModule)) {
            return companion;
        }
        float f3 = RecyclerView.DECELERATION_RATE;
        if (module != null) {
            EmptyList emptyList = EmptyList.INSTANCE;
            if (CollectionsKt.contains(emptyList, module.getClass())) {
                CardSchemeViewModel.Module module2 = (CardSchemeViewModel.Module) CollectionsKt.getOrNull(i - 1, list);
                boolean z6 = module2 != null && CollectionsKt.contains(emptyList, module2.getClass());
                CardSchemeViewModel.Module module3 = (CardSchemeViewModel.Module) CollectionsKt.getOrNull(i + 1, list);
                boolean z7 = module3 != null && CollectionsKt.contains(emptyList, module3.getClass());
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                float f4 = (z6 || z4 || (module instanceof CardSchemeViewModel.Module.NextUpCard)) ? 0.0f : f / 2.0f;
                if (z2 || z7 || z3) {
                    f2 = 0.0f;
                } else {
                    f2 = module instanceof CardSchemeViewModel.Module.NextUpCard ? 32.0f : f / 2.0f;
                }
                return SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, f4, RecyclerView.DECELERATION_RATE, f2, 5);
            }
        }
        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
        float f5 = (z4 || (module instanceof CardSchemeViewModel.Module.NextUpCard)) ? 0.0f : f / 2.0f;
        if (z2 || z3) {
            r10 = 0.0f;
        } else if (!(module instanceof CardSchemeViewModel.Module.NextUpCard)) {
            r10 = f / 2.0f;
        }
        float f6 = (z5 || (module instanceof CardSchemeViewModel.Module.HeroPaymentDevices)) ? 0.0f : f;
        if (!z5 && !(module instanceof CardSchemeViewModel.Module.HeroPaymentDevices)) {
            f3 = f;
        }
        return SpacerKt.m301paddingqDBjuR0(fillMaxWidth2, f6, f5, f3, r10);
    }

    public static final InlineTextContent inlineInfoIcon(Function0 function0) {
        return new InlineTextContent(new Placeholder(7, Room.getSp(12), Room.getSp(12)), new ComposableLambdaImpl(new ActionPillKt$$ExternalSyntheticLambda0(5, function0), true, 1913103752));
    }

    public static final Quat rememberCopyTiltRotation(int i, int i2, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        SpringSpec urgent$default = ImageUtil.urgent$default((zzc) ((Motion) gapComposer.consume(MotionKt.LocalMotion)).springs.resultMetadata);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Animatable animatable = (Animatable) rememberedValue;
        Object[] objArr = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = new AlertBannerKt$$ExternalSyntheticLambda0(24);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 48);
        Integer valueOf = Integer.valueOf(i);
        boolean changed = gapComposer.changed(mutableState) | ((((i2 & 14) ^ 6) > 4 && gapComposer.changed(i)) || (i2 & 6) == 4) | gapComposer.changedInstance(animatable) | gapComposer.changed(urgent$default);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == obj) {
            Object governmentIdFeed$analyze$5 = new GovernmentIdFeed$analyze$5(i, animatable, urgent$default, mutableState, (Continuation) null);
            gapComposer.updateRememberedValue(governmentIdFeed$analyze$5);
            rememberedValue3 = governmentIdFeed$analyze$5;
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue3);
        return new Quat((float) Math.toRadians(((Number) animatable.getValue()).floatValue()), TAG_LOCAL_X_AXIS);
    }

    public static final ButtonProminence toButtonProminence(CardSchemeViewModel.Module.Accessory.Button.Prominence prominence) {
        prominence.getClass();
        int ordinal = prominence.ordinal();
        if (ordinal == 0) {
            return ButtonProminence.PROMINENT;
        }
        if (ordinal == 1) {
            return ButtonProminence.STANDARD;
        }
        if (ordinal == 2) {
            return ButtonProminence.SUBTLE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final void Disclosure(CardSchemeViewModel.Module.Disclosure disclosure, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2050427694);
        int i2 = (gapComposer.changedInstance(disclosure) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = disclosure.text;
            if (str == null) {
                gapComposer.startReplaceGroup(1266669608);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1266669609);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.text.subtle;
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new HeroCardNullStateKt$$ExternalSyntheticLambda8(i3, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, fillMaxWidth, textStyle, j, null, null, new TextLineBalancing(1), 0, 0, 5, gapComposer, 0, 864);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(disclosure, function1, i, 18);
        }
    }

    public static final void Render(final CardSchemeViewModel.Module.StatusModule statusModule, Modifier modifier, Composer composer, int i) {
        int i2;
        Function0 function0;
        ButtonProminence buttonProminence;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1198997907);
        final int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(statusModule) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        final int i5 = 0;
        final int i6 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean changedInstance = gapComposer.changedInstance(statusModule);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PageTagSlotKt$$ExternalSyntheticLambda0(statusModule, i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(modifier, (Function0) rememberedValue);
            CardSchemeViewModel.Module.Accessory accessory = statusModule.accessory;
            CellDefaultAccessory cellDefaultAccessory = null;
            if (accessory == null) {
                function0 = null;
            } else if (accessory instanceof CardSchemeViewModel.Module.Accessory.Button) {
                function0 = ((CardSchemeViewModel.Module.Accessory.Button) accessory).onClick;
            } else if (accessory instanceof CardSchemeViewModel.Module.Accessory.Push) {
                function0 = ((CardSchemeViewModel.Module.Accessory.Push) accessory).onClick;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            boolean z = !statusModule.isDisabled;
            if (accessory == null) {
                gapComposer.startReplaceGroup(1897176384);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1897176385);
                if (accessory instanceof CardSchemeViewModel.Module.Accessory.Button) {
                    gapComposer.startReplaceGroup(-714533814);
                    CardSchemeViewModel.Module.Accessory.Button button = (CardSchemeViewModel.Module.Accessory.Button) accessory;
                    int ordinal = button.prominence.ordinal();
                    if (ordinal == 0) {
                        buttonProminence = ButtonProminence.PROMINENT;
                    } else if (ordinal == 1) {
                        buttonProminence = ButtonProminence.STANDARD;
                    } else if (ordinal == 2) {
                        buttonProminence = ButtonProminence.SUBTLE;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    CellDefaultAccessory.ButtonCompact buttonCompact = new CellDefaultAccessory.ButtonCompact(null, buttonProminence, button.isDestructive, Expect_jvmKt.rememberComposableLambda(-1101735684, new CardAppletTile$$ExternalSyntheticLambda1(accessory, 3), gapComposer), 9);
                    gapComposer.end(false);
                    cellDefaultAccessory = buttonCompact;
                } else if (accessory instanceof CardSchemeViewModel.Module.Accessory.Push) {
                    gapComposer.startReplaceGroup(-675251650);
                    gapComposer.end(false);
                    String str = ((CardSchemeViewModel.Module.Accessory.Push) accessory).text;
                    if (str != null) {
                        cellDefaultAccessory = new CellDefaultAccessory.Label(str, 2);
                    } else {
                        cellDefaultAccessory = CellDefaultAccessory.Push.INSTANCE;
                    }
                } else {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -714536210, false);
                }
                gapComposer.end(false);
            }
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(Expect_jvmKt.rememberComposableLambda(284416271, new Function2() { // from class: com.squareup.cash.wallet.views.WalletCardSchemeViewKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Modifier modifier2;
                    int i7 = i5;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    CardSchemeViewModel.Module.StatusModule statusModule2 = statusModule;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                UtilsKt.Render(statusModule2.icon, statusModule2.isDisabled, gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                boolean changedInstance2 = gapComposer3.changedInstance(statusModule2);
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (changedInstance2 || rememberedValue2 == Composer.Companion.Empty) {
                                    rememberedValue2 = new AlertBannerKt$$ExternalSyntheticLambda3(statusModule2, 20);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2);
                                String str2 = statusModule2.mainText;
                                str2.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer3, semantics, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(16.0f), Alignment.Companion.Start, gapComposer4, 6);
                                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer4.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer4.startReusableNode();
                                if (gapComposer4.inserting) {
                                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer4.useNode();
                                }
                                Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str3 = statusModule2.infoText;
                                if (str3 == null) {
                                    gapComposer4.startReplaceGroup(1030613112);
                                    gapComposer4.end(false);
                                    modifier2 = null;
                                } else {
                                    gapComposer4.startReplaceGroup(1030613113);
                                    modifier2 = null;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                }
                                CardSchemeViewModel.Module.Accessory.Button button2 = statusModule2.bottomButton;
                                if (button2 == null) {
                                    gapComposer4.startReplaceGroup(1030664262);
                                } else {
                                    gapComposer4.startReplaceGroup(864531227);
                                    UtilsKt.CompactRender(button2, modifier2, gapComposer4, 0, 1);
                                }
                                gapComposer4.end(false);
                                gapComposer4.end(true);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), Expect_jvmKt.rememberComposableLambda(-189609712, new Function2() { // from class: com.squareup.cash.wallet.views.WalletCardSchemeViewKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Modifier modifier2;
                    int i7 = i6;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    CardSchemeViewModel.Module.StatusModule statusModule2 = statusModule;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                UtilsKt.Render(statusModule2.icon, statusModule2.isDisabled, gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                boolean changedInstance2 = gapComposer3.changedInstance(statusModule2);
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (changedInstance2 || rememberedValue2 == Composer.Companion.Empty) {
                                    rememberedValue2 = new AlertBannerKt$$ExternalSyntheticLambda3(statusModule2, 20);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2);
                                String str2 = statusModule2.mainText;
                                str2.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer3, semantics, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(16.0f), Alignment.Companion.Start, gapComposer4, 6);
                                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer4.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer4.startReusableNode();
                                if (gapComposer4.inserting) {
                                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer4.useNode();
                                }
                                Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str3 = statusModule2.infoText;
                                if (str3 == null) {
                                    gapComposer4.startReplaceGroup(1030613112);
                                    gapComposer4.end(false);
                                    modifier2 = null;
                                } else {
                                    gapComposer4.startReplaceGroup(1030613113);
                                    modifier2 = null;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                }
                                CardSchemeViewModel.Module.Accessory.Button button2 = statusModule2.bottomButton;
                                if (button2 == null) {
                                    gapComposer4.startReplaceGroup(1030664262);
                                } else {
                                    gapComposer4.startReplaceGroup(864531227);
                                    UtilsKt.CompactRender(button2, modifier2, gapComposer4, 0, 1);
                                }
                                gapComposer4.end(false);
                                gapComposer4.end(true);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), onVisible$default, function0, null, z, false, Expect_jvmKt.rememberComposableLambda(1261201686, new Function2() { // from class: com.squareup.cash.wallet.views.WalletCardSchemeViewKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Modifier modifier2;
                    int i7 = i3;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    CardSchemeViewModel.Module.StatusModule statusModule2 = statusModule;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                UtilsKt.Render(statusModule2.icon, statusModule2.isDisabled, gapComposer2, 0);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                boolean changedInstance2 = gapComposer3.changedInstance(statusModule2);
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (changedInstance2 || rememberedValue2 == Composer.Companion.Empty) {
                                    rememberedValue2 = new AlertBannerKt$$ExternalSyntheticLambda3(statusModule2, 20);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2);
                                String str2 = statusModule2.mainText;
                                str2.getClass();
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer3, semantics, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer4;
                            if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(16.0f), Alignment.Companion.Start, gapComposer4, 6);
                                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, companion);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer4.applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer4.startReusableNode();
                                if (gapComposer4.inserting) {
                                    gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                } else {
                                    gapComposer4.useNode();
                                }
                                Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                String str3 = statusModule2.infoText;
                                if (str3 == null) {
                                    gapComposer4.startReplaceGroup(1030613112);
                                    gapComposer4.end(false);
                                    modifier2 = null;
                                } else {
                                    gapComposer4.startReplaceGroup(1030613113);
                                    modifier2 = null;
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    gapComposer4.end(false);
                                }
                                CardSchemeViewModel.Module.Accessory.Button button2 = statusModule2.bottomButton;
                                if (button2 == null) {
                                    gapComposer4.startReplaceGroup(1030664262);
                                } else {
                                    gapComposer4.startReplaceGroup(864531227);
                                    UtilsKt.CompactRender(button2, modifier2, gapComposer4, 0, 1);
                                }
                                gapComposer4.end(false);
                                gapComposer4.end(true);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                    }
                }
            }, gapComposer), null, cellDefaultAccessory, 0L, null, gapComposer, 12582966, 0, 3408);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(statusModule, modifier, i, 27);
        }
    }

    public static final void Render(CardSchemeViewModel.Module.NextUpCard nextUpCard, Modifier modifier, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1436923104);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(nextUpCard) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(530102602, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(5, (Object) nextUpCard, function1), gapComposer);
            boolean z = nextUpCard.isDismissible;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z) {
                gapComposer.startReplaceGroup(563391834);
                int i5 = i2 & 896;
                boolean changedInstance = (i5 == 256) | gapComposer.changedInstance(nextUpCard);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new WalletCardSchemeViewKt$$ExternalSyntheticLambda13(function1, nextUpCard, i4);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier onVisible$default = VisibleKt.onVisible$default(modifier, (Function0) rememberedValue);
                boolean changedInstance2 = (i5 == 256) | gapComposer.changedInstance(nextUpCard);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new WalletCardSchemeViewKt$$ExternalSyntheticLambda13(function1, nextUpCard, r5);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function0 function0 = (Function0) rememberedValue2;
                int i6 = (gapComposer.changedInstance(nextUpCard) ? 1 : 0) | (i5 != 256 ? 0 : 1);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (i6 != 0 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new WalletCardSchemeViewKt$$ExternalSyntheticLambda13(function1, nextUpCard, i3);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                NextUpDismissibleContainer(onVisible$default, function0, (Function0) rememberedValue3, rememberComposableLambda, gapComposer, 3072);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(563715505);
                int i7 = (gapComposer.changedInstance(nextUpCard) ? 1 : 0) | ((i2 & 896) != 256 ? 0 : 1);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (i7 != 0 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new WalletCardSchemeViewKt$$ExternalSyntheticLambda13(function1, nextUpCard, 3);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                rememberComposableLambda.invoke((Object) VisibleKt.onVisible$default(modifier, (Function0) rememberedValue4), (Object) gapComposer, (Object) 48);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(nextUpCard, modifier, function1, false, i, 27);
        }
    }

    public static final void Render(CardSchemeViewModel.Module.Icon icon, boolean z, Composer composer, int i) {
        AvatarSize avatarSize;
        BiasAlignment biasAlignment = Alignment.Companion.TopStart;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1642272809);
        Applier applier = gapComposer.applier;
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(icon) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(z) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = icon instanceof CardSchemeViewModel.Module.Icon.LegacyAvatar;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z2) {
                gapComposer.startReplaceGroup(-976695955);
                Modifier alpha = AlphaKt.alpha(companion, z ? 0.3f : 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, alpha);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                if (applier != null) {
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
                    StatusModuleAvatar((CardSchemeViewModel.Module.Icon.LegacyAvatar) icon, gapComposer, i3 & 14);
                    gapComposer.end(true);
                    gapComposer.end(false);
                } else {
                    Updater.invalidApplier();
                    throw null;
                }
            } else if (icon instanceof CardSchemeViewModel.Module.Icon.Avatar) {
                gapComposer.startReplaceGroup(-976497152);
                Modifier alpha2 = AlphaKt.alpha(companion, z ? 0.3f : 1.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, alpha2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (applier != null) {
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    CardSchemeViewModel.Module.Icon.Avatar avatar = (CardSchemeViewModel.Module.Icon.Avatar) icon;
                    int ordinal = avatar.size.ordinal();
                    if (ordinal == 0) {
                        avatarSize = AvatarSize.Size48;
                    } else if (ordinal == 1) {
                        avatarSize = AvatarSize.Size64;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    AvatarsKt.HorizontalStackedAvatars(avatarSize, avatar.stackedAvatarViewModel, null, null, gapComposer, 0, 12);
                    gapComposer.end(true);
                    gapComposer.end(false);
                } else {
                    Updater.invalidApplier();
                    throw null;
                }
            } else {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1971169777, false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda3(icon, z, i, i2);
        }
    }

    public static final void Render(CardSchemeViewModel.Module.ShippingTimeline shippingTimeline, Modifier modifier, Composer composer, int i) {
        TimelineItem.State state;
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1786589444);
        int i2 = (i & 6) == 0 ? i | (gapComposer.changedInstance(shippingTimeline) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, (TextLineBalancing) null, shippingTimeline.title, (Map) null, (Function1) null, false);
                TimelineState rememberTimelineState = LazyGridDslKt.rememberTimelineState(null, gapComposer, 1);
                gapComposer.startReplaceGroup(-2137950287);
                ArrayList<CardSchemeViewModel.Module.ShippingTimeline.ShippingTimelineItem> arrayList = shippingTimeline.items;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (CardSchemeViewModel.Module.ShippingTimeline.ShippingTimelineItem shippingTimelineItem : arrayList) {
                    int ordinal = shippingTimelineItem.prominence.ordinal();
                    if (ordinal == 0) {
                        state = TimelineItem.State.Done;
                    } else if (ordinal == 1) {
                        state = TimelineItem.State.NotStarted;
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    TimelineItem.State state2 = state;
                    String str = shippingTimelineItem.mainText;
                    String str2 = shippingTimelineItem.infoText;
                    CardSchemeViewModel.Module.Accessory.Button button = shippingTimelineItem.button;
                    if (button == null) {
                        gapComposer.startReplaceGroup(1986959231);
                        gapComposer.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer.startReplaceGroup(1986959232);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-68493944, new WalletCardSchemeViewKt$$ExternalSyntheticLambda10(button, 0), gapComposer);
                        gapComposer.end(false);
                        composableLambdaImpl = rememberComposableLambda;
                    }
                    arrayList2.add(LazyListLayoutInfoKt.TimelineItem$default(state2, str, null, str2, null, composableLambdaImpl, 52));
                }
                gapComposer.end(false);
                LazyListLayoutInfoKt.Timeline(rememberTimelineState, Tags.toImmutableList(arrayList2), null, gapComposer, 0, 4);
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
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(shippingTimeline, modifier, i, 26);
        }
    }
}
