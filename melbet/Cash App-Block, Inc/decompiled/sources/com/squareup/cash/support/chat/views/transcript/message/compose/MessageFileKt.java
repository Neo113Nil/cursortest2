package com.squareup.cash.support.chat.views.transcript.message.compose;

import android.content.Context;
import android.util.Patterns;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.pager.LazyLayoutPagerKt$$ExternalSyntheticLambda3;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda17;
import androidx.compose.material3.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.window.PopupProperties;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.media3.common.FileTypes;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.brand.profile.LocalBrandProfileViewKt$$ExternalSyntheticLambda10;
import app.cash.local.views.fulfillment.SchedulingTimePickerChipKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.LocalImageLoaderKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.transition.CrossfadeTransition;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountAvatarKt$$ExternalSyntheticLambda2;
import com.squareup.cash.account.components.AccountUiViewKt$$ExternalSyntheticLambda14;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter$models$2$1$1;
import com.squareup.cash.common.composeui.shimmer.ShimmerCellsKt;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolErrorViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActivityBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$FileBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ImageBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$SystemMessageBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TextBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Failed;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Recorded;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel$MessageViewModel$Status$Sending;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda3;
import com.squareup.cash.support.chat.views.transcript.message.ActivityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1;
import com.squareup.cash.support.screenshot.ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.views.ScreenshotConfirmViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda23;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda4;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda16;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.work.views.shift.ShiftNoteViewKt$$ExternalSyntheticLambda10;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class MessageFileKt {
    public static final ComposableLambdaImpl lambda$681343826 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(9), false, 681343826);
    public static final ComposableLambdaImpl lambda$269633071 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(10), false, 269633071);

    /* renamed from: lambda$-1118137349, reason: not valid java name */
    public static final ComposableLambdaImpl f684lambda$1118137349 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(11), false, -1118137349);

    /* renamed from: lambda$-1635181672, reason: not valid java name */
    public static final ComposableLambdaImpl f685lambda$1635181672 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(12), false, -1635181672);

    /* renamed from: lambda$-767805880, reason: not valid java name */
    public static final ComposableLambdaImpl f686lambda$767805880 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(4), false, -767805880);
    public static final ComposableLambdaImpl lambda$796123327 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(5), false, 796123327);

    static {
        new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(2), false, -933918461);
        new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(3), false, -647363462);
    }

    public static final void ActivityFailedToLoadContent(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-463011189);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(24.0f, modifier, Strings.getColors(gapComposer).semantic.border.subtle, 16.0f);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(3, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m, false, null, null, (Function0) rememberedValue, 15);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Trace.m1191Iconww6aTOc(Icons.AlertFill24, (String) null, SizeKt.m285size3ABfNKs(companion, 48.0f), Strings.getColors(gapComposer).semantic.icon.warning, gapComposer, 438, 0);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
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
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, companion);
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
            gapComposer = gapComposer;
            i2 = 18;
            Room.m1164Text25TpFw(0, 0, 0, 5, 0, 0, 2810, 0L, (Composer) gapComposer, (Modifier) null, new AnnotatedString(Room.stringResource(gapComposer, R.string.support_chat_transaction_failed_to_load)), Strings.getTypography(gapComposer).bodyMedium, new TextLineBalancing(1), (Map) null, (Function1) null, false);
            Trace.m1191Iconww6aTOc(Icons.Push24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
            gapComposer.end(true);
            Room.m1164Text25TpFw(0, 0, 0, 5, 0, 0, 2810, 0L, (Composer) gapComposer, (Modifier) null, new AnnotatedString(Room.stringResource(gapComposer, R.string.support_chat_transaction_failed_to_load_retry)), Strings.getTypography(gapComposer).bodySmall, new TextLineBalancing(1), (Map) null, (Function1) null, false);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
        } else {
            i2 = 18;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(modifier, function0, i, i2);
        }
    }

    public static final void ActivityLoadedContent(ActivityItemViewModel activityItemViewModel, Function0 function0, Composer composer, int i) {
        ActivityItemViewModel activityItemViewModel2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1540551346);
        int i2 = (gapComposer.changedInstance(activityItemViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i3 = i2 | (gapComposer.changed(companion) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(providableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Colors colors2 = (Colors) gapComposer.consume(providableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier clip = ClipKt.clip(ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, colors2.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CardTransitionKt$$ExternalSyntheticLambda16(1, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            activityItemViewModel2 = activityItemViewModel;
            ActivityItemViewKt.m2972ActivityItemViewww6aTOc(activityItemViewModel2, (Function1) rememberedValue, clip, 0L, gapComposer, i3 & 14, 8);
        } else {
            activityItemViewModel2 = activityItemViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1((Object) activityItemViewModel2, function0, i, 25);
        }
    }

    public static final void ActivityLoadingContent(Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(700769863);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = (gapComposer.changed(companion) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(providableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            Colors colors2 = (Colors) gapComposer.consume(providableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, colors2.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(2, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m178borderxT4_qwU, false, null, null, (Function0) rememberedValue, 15);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
            ComposeUiNode.Companion.getClass();
            Function0 function02 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function02);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ShimmerCellsKt.m3504ShimmerCellItemFNF3uiM(false, false, 0L, gapComposer, 0, 7);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda8(function0, i, 7);
        }
    }

    public static final void ImagePlaceholderError(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1209875357);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            long j = Strings.getColors(gapComposer).semantic.border.subtle;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(ImageKt.m177backgroundbw27NRU(companion, j, m340RoundedCornerShape0680j_4), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(4, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue, 15), 16.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Trace.m1191Iconww6aTOc(Icons.AlertFill24, (String) null, SizeKt.m285size3ABfNKs(companion, 48.0f), Strings.getColors(gapComposer).semantic.icon.warning, gapComposer, 438, 0);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion);
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
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 48);
            int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Room.m1164Text25TpFw(0, 0, 0, 5, 0, 0, 2808, 0L, (Composer) gapComposer, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14, 1.0f, true), new AnnotatedString(Room.stringResource(gapComposer, R.string.support_chat_image_error)), Strings.getTypography(gapComposer).bodyMedium, new TextLineBalancing(1), (Map) null, (Function1) null, false);
            Trace.m1191Iconww6aTOc(Icons.Push24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
            gapComposer.end(true);
            Room.m1164Text25TpFw(0, 0, 0, 5, 48, 0, 2808, 0L, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), new AnnotatedString(Room.stringResource(gapComposer, R.string.support_chat_image_tap_to_retry)), Strings.getTypography(gapComposer).bodySmall, new TextLineBalancing(1), (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(function0, modifier2, i, 19);
        }
    }

    public static final void ImagePlaceholderLoading(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(147029749);
        Applier applier = gapComposer.applier;
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 240.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
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
            Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs2);
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
            ProgressCircularKt.ProgressCircular(0, 0, gapComposer, BoxScopeInstance.INSTANCE.matchParentSize());
            gapComposer.end(true);
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 20);
        }
    }

    public static final void MessageAction(ChatContentViewModel.MessageViewModel messageViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1594420817);
        int i2 = (gapComposer.changedInstance(messageViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            MessageContainer(messageViewModel, companion, Expect_jvmKt.rememberComposableLambda(-214294616, new TabToolbarsKt$$ExternalSyntheticLambda6(11, messageViewModel, function1, (BodyViewModel$ActionBodyViewModel) messageViewModel.body), gapComposer), gapComposer, (i2 & 14) | 432);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MessageActionKt$$ExternalSyntheticLambda1(messageViewModel, function1, modifier2, i, 0);
        }
    }

    public static final void MessageActivity(ChatContentViewModel.MessageViewModel messageViewModel, SupportActivityItemLoader supportActivityItemLoader, RealImageLoader realImageLoader, Function1 function1, Modifier modifier, Function1 function12, Function1 function13, Composer composer, int i) {
        Modifier modifier2;
        supportActivityItemLoader.getClass();
        realImageLoader.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1809272671);
        int i2 = i | (gapComposer.changedInstance(messageViewModel) ? 4 : 2) | (gapComposer.changedInstance(supportActivityItemLoader) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | 24576 | (gapComposer.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function13) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            BodyViewModel$ActivityBodyViewModel bodyViewModel$ActivityBodyViewModel = (BodyViewModel$ActivityBodyViewModel) messageViewModel.body;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            MessageContainer(messageViewModel, companion, Expect_jvmKt.rememberComposableLambda(-1906396554, new NavHostKt$$ExternalSyntheticLambda2(messageViewModel, function12, function13, bodyViewModel$ActivityBodyViewModel, supportActivityItemLoader, realImageLoader, function1, mutableState, (MutableState) rememberedValue2), gapComposer), gapComposer, (i2 & 14) | 432);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetKt$$ExternalSyntheticLambda0(messageViewModel, supportActivityItemLoader, realImageLoader, function1, modifier2, function12, function13, i);
        }
    }

    public static final void MessageAvatarAdvocate(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2062227199);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors.semantic.text.brand, RoundedCornerShapeKt.CircleShape);
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
            Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 16.0f);
            Painter painterResource = Countries.painterResource(R.drawable.icon_logo_usd_16, 0, gapComposer);
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors2.semantic.text.inverse;
            ImageKt.Image(painterResource, null, m285size3ABfNKs2, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 432, 56);
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 19);
        }
    }

    public static final void MessageBodyActivity(BodyViewModel$ActivityBodyViewModel bodyViewModel$ActivityBodyViewModel, SupportActivityItemLoader supportActivityItemLoader, RealImageLoader realImageLoader, Function1 function1, Modifier modifier, Function0 function0, Composer composer, int i) {
        Function0 function02;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1531800603);
        int i2 = i | (gapComposer.changedInstance(bodyViewModel$ActivityBodyViewModel) ? 4 : 2) | (gapComposer.changedInstance(supportActivityItemLoader) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | 24576;
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (rememberedValue == neverEqualPolicy) {
                SharedFlowImpl MutableSharedFlow$default = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
                MutableSharedFlow$default.tryEmit(Unit.INSTANCE);
                gapComposer.updateRememberedValue(MutableSharedFlow$default);
                obj = MutableSharedFlow$default;
            }
            MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) obj;
            boolean changed = gapComposer.changed(bodyViewModel$ActivityBodyViewModel.entityId);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = FlowKt.transformLatest(mutableSharedFlow, new ActivityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1(null, supportActivityItemLoader, bodyViewModel$ActivityBodyViewModel, 1));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, SupportActivityItemLoader.State.Failure.INSTANCE$1, null, gapComposer, 0, 2);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(mutableSharedFlow);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ReferralCodePresenter$models$2$1$1(mutableSharedFlow, null, 5);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            function02 = function0;
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-545568603, new LifecycleKt$$ExternalSyntheticLambda0(mutableSharedFlow, function02, function1, collectAsState), gapComposer), gapComposer, 56);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(bodyViewModel$ActivityBodyViewModel, supportActivityItemLoader, realImageLoader, function1, modifier2, function02, i);
        }
    }

    public static final void MessageContainer(ChatContentViewModel.MessageViewModel messageViewModel, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        float f;
        messageViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(839705963);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(messageViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float f2 = messageViewModel.isFirstInGroup ? 28.0f : 4.0f;
            boolean z = messageViewModel.sender == ChatContentViewModel.EntryViewModel.Sender.CUSTOMER;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            float f3 = 80.0f;
            if (z) {
                f = 80.0f;
            } else {
                f = 80.0f;
                f3 = 16.0f;
            }
            if (z) {
                f = 16.0f;
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, f3, f2, f, RecyclerView.DECELERATION_RATE, 8);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(z ? Alignment.Companion.TopEnd : Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Recorder$$ExternalSyntheticOutline2.m((i2 >> 6) & 14, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda4(messageViewModel, modifier, composableLambdaImpl, false, i, 9);
        }
    }

    public static final void MessageFailedRetryDropdownUI(String str, boolean z, Function1 function1, Function1 function12, Function1 function13, Composer composer, int i) {
        String str2;
        int i2;
        Function1 function14;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1005204068);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (gapComposer.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function14 = function12;
            i2 |= gapComposer.changedInstance(function14) ? 2048 : 1024;
        } else {
            function14 = function12;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function13) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(20, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MessageStatusIcon(0, gapComposer, null, (Function0) rememberedValue);
            boolean z3 = i4 == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(21, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MessageRetryPopupMenu(z, (Function0) rememberedValue2, Expect_jvmKt.rememberComposableLambda(483182215, new LifecycleKt$$ExternalSyntheticLambda0(str2, function14, function1, function13, 10), gapComposer), gapComposer, ((i3 >> 3) & 14) | MLKEMEngine.KyberPolyBytes);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda17(str, z, function1, function12, function13, i);
        }
    }

    public static final void MessageFailedRetrySheetUI(String str, boolean z, Function1 function1, Function1 function12, Function1 function13, String str2, Composer composer, int i) {
        Object obj;
        int i2;
        Object obj2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2059472447);
        if ((i & 6) == 0) {
            obj = str;
            i2 = (gapComposer.changed(obj) ? 4 : 2) | i;
        } else {
            obj = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function13) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            obj2 = str2;
            i2 |= gapComposer.changed(obj2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            obj2 = str2;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            int i3 = i2 & 896;
            boolean changedInstance = gapComposer.changedInstance(view) | (i3 == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj3) {
                rememberedValue = new AddMoneyViewKt$$ExternalSyntheticLambda1(view, function1, 4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MessageStatusIcon(0, gapComposer, null, (Function0) rememberedValue);
            if (z) {
                gapComposer.startReplaceGroup(-135335389);
                boolean z2 = i3 == 256;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == obj3) {
                    rememberedValue2 = new ScreenshotConfirmViewKt$$ExternalSyntheticLambda0(22, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SheetKt.Sheet((Function0) rememberedValue2, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(1229086373, new SwipeToDismissKt$$ExternalSyntheticLambda2(15, obj2, obj, function1, function12, function13), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-133799711);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(str, z, function1, function12, function13, str2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MessageFailedRetryUI(String str, boolean z, Function1 function1, Function1 function12, Function1 function13, String str2, boolean z2, Composer composer, int i, int i2) {
        int i3;
        boolean z3;
        boolean z4;
        RecomposeScopeImpl endRestartGroup;
        function1.getClass();
        function12.getClass();
        function13.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(472944962);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | (gapComposer.changed(z) ? 32 : 16);
        if ((i & 3072) == 0) {
            i4 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= gapComposer.changedInstance(function13) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i4 |= gapComposer.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i4 |= 1572864;
        } else if ((1572864 & i) == 0) {
            z3 = z2;
            i4 |= gapComposer.changed(z3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            if (gapComposer.shouldExecute(i4 & 1, (599187 & i4) == 599186)) {
                gapComposer.skipToGroupEnd();
                z4 = z3;
            } else {
                boolean z5 = i5 == 0 ? z3 : true;
                if (z5) {
                    gapComposer.startReplaceGroup(2010923402);
                    MessageFailedRetrySheetUI(str, z, function1, function12, function13, str2, gapComposer, i4 & 524286);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(2011204200);
                    MessageFailedRetryDropdownUI(str, z, function1, function12, function13, gapComposer, i4 & JpegConstants.COM_MARKER);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                }
                z4 = z5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AccountAvatarKt$$ExternalSyntheticLambda2(str, z, function1, function12, function13, str2, z4, i, i2);
                return;
            }
            return;
        }
        z3 = z2;
        if (gapComposer.shouldExecute(i4 & 1, (599187 & i4) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void MessageFile(ChatContentViewModel.MessageViewModel messageViewModel, Modifier modifier, Function1 function1, Function1 function12, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1844180322);
        int i2 = (gapComposer.changedInstance(messageViewModel) ? 4 : 2) | i | 48 | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function12) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            BodyViewModel$FileBodyViewModel bodyViewModel$FileBodyViewModel = (BodyViewModel$FileBodyViewModel) messageViewModel.body;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            MessageContainer(messageViewModel, companion, Expect_jvmKt.rememberComposableLambda(-1994744139, new SwipeToDismissKt$$ExternalSyntheticLambda3(messageViewModel, function1, function12, mutableState, (ViewModelKt) bodyViewModel$FileBodyViewModel, (MutableState) rememberedValue2, 26), gapComposer), gapComposer, (i2 & 14) | 432);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MessageFileKt$$ExternalSyntheticLambda1(messageViewModel, modifier2, function1, function12, i, 0);
        }
    }

    public static final void MessageImage(final ChatContentViewModel.MessageViewModel messageViewModel, final Function1 function1, Function1 function12, final Function0 function0, Modifier modifier, final Function1 function13, final Function1 function14, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        function1.getClass();
        function12.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(964765536);
        int i2 = i | (gapComposer2.changedInstance(messageViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changedInstance(function12) ? 256 : 128) | (gapComposer2.changedInstance(function0) ? 2048 : 1024) | 24576 | (gapComposer2.changedInstance(function13) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(function14) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer2.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            final BodyViewModel$ImageBodyViewModel bodyViewModel$ImageBodyViewModel = (BodyViewModel$ImageBodyViewModel) messageViewModel.body;
            String str = bodyViewModel$ImageBodyViewModel.imageUrl;
            Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            boolean changed = gapComposer2.changed(str);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(ImageState.LOADING);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Updater.mutableStateOf$default(0);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue4;
            ImageRequest.Builder builder = new ImageRequest.Builder(context);
            builder.data = str;
            builder.memoryCacheKey = Boxes$$ExternalSyntheticOutline1.m(((Number) mutableState4.getValue()).intValue(), str, "_");
            builder.diskCacheKey = Boxes$$ExternalSyntheticOutline1.m(((Number) mutableState4.getValue()).intValue(), str, "_");
            Extras.Key key = ImageRequestsKt.transformationsKey;
            Extras.Key key2 = ImageRequests_androidKt.transitionFactoryKey;
            builder.getExtras().set(ImageRequests_androidKt.transitionFactoryKey, new CrossfadeTransition.Factory(200));
            ImageRequest build = builder.build();
            boolean changed2 = gapComposer2.changed(mutableState);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue5 == obj) {
                rememberedValue5 = new TabToolbarsKt$$ExternalSyntheticLambda10(14, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            Function1 function15 = (Function1) rememberedValue5;
            boolean changed3 = gapComposer2.changed(mutableState);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue6 == obj) {
                rememberedValue6 = new TabToolbarsKt$$ExternalSyntheticLambda10(15, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            Function1 function16 = (Function1) rememberedValue6;
            boolean changed4 = gapComposer2.changed(mutableState) | ((i2 & 896) == 256);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue7 == obj) {
                rememberedValue7 = new CashMapViewKt$$ExternalSyntheticLambda3(function12, mutableState, 16);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            final AsyncImagePainter m1450rememberAsyncImagePainterMqRF_0 = AsyncImageKt.m1450rememberAsyncImagePainterMqRF_0(build, function15, function16, (Function1) rememberedValue7, gapComposer2, 0, 398);
            gapComposer = gapComposer2;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            MessageContainer(messageViewModel, companion, Expect_jvmKt.rememberComposableLambda(-1617322121, new Function2() { // from class: com.squareup.cash.support.chat.views.transcript.message.compose.MessageImageKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    MutableState mutableState5;
                    Object obj4;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
                    Modifier.Companion companion2;
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
                    Function0 function02;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
                    int i3;
                    FileTypes fileTypes;
                    boolean z;
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
                    ChatContentViewModel.MessageViewModel messageViewModel2;
                    int i4;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2);
                    Applier applier = gapComposer3.applier;
                    if (shouldExecute) {
                        BiasAlignment.Horizontal horizontal = Alignment.Companion.End;
                        Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 48);
                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                        Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion3);
                        ComposeUiNode.Companion.getClass();
                        Function0 function03 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(function03);
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
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$13);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$17);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer3, 54);
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion3);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(function03);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$15);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$16, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$13);
                        LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$17, 1.0f, false);
                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer3, 0);
                        int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, m);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(function03);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$15);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$16, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$13);
                        Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$17);
                        MutableState mutableState6 = mutableState;
                        int ordinal = ((ImageState) mutableState6.getValue()).ordinal();
                        MutableState mutableState7 = mutableState2;
                        Object obj5 = Composer.Companion.Empty;
                        if (ordinal == 0) {
                            mutableState5 = mutableState7;
                            obj4 = obj5;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                            companion2 = companion3;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                            function02 = function03;
                            composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                            i3 = 3;
                            gapComposer3.startReplaceGroup(897730404);
                            MessageFileKt.ImagePlaceholderLoading(null, gapComposer3, 0);
                            gapComposer3.end(false);
                        } else if (ordinal == 1) {
                            mutableState5 = mutableState7;
                            obj4 = obj5;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                            companion2 = companion3;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                            function02 = function03;
                            composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                            i3 = 3;
                            gapComposer3.startReplaceGroup(897823497);
                            boolean changed5 = gapComposer3.changed(mutableState6);
                            Function0 function04 = function0;
                            boolean changed6 = changed5 | gapComposer3.changed(function04);
                            Object rememberedValue8 = gapComposer3.rememberedValue();
                            if (changed6 || rememberedValue8 == obj4) {
                                rememberedValue8 = new LazyLayoutPagerKt$$ExternalSyntheticLambda3(function04, mutableState4, mutableState6);
                                gapComposer3.updateRememberedValue(rememberedValue8);
                            }
                            MessageFileKt.ImagePlaceholderError(0, gapComposer3, null, (Function0) rememberedValue8);
                            gapComposer3.end(false);
                        } else {
                            if (ordinal != 2) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 860242281, false);
                            }
                            gapComposer3.startReplaceGroup(898124166);
                            String stringResource = Room.stringResource(gapComposer3, R.string.support_chat_image_detail_content_description);
                            Modifier clip = ClipKt.clip(SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(companion3, RecyclerView.DECELERATION_RATE, 240.0f, 1), RecyclerView.DECELERATION_RATE, 240.0f, 1), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
                            Object obj6 = function1;
                            boolean changed7 = gapComposer3.changed(obj6);
                            Object obj7 = bodyViewModel$ImageBodyViewModel;
                            boolean changedInstance = changed7 | gapComposer3.changedInstance(obj7);
                            Object rememberedValue9 = gapComposer3.rememberedValue();
                            if (changedInstance || rememberedValue9 == obj5) {
                                rememberedValue9 = new BasicShieetScope$$ExternalSyntheticLambda10(21, obj6, obj7, mutableState7);
                                gapComposer3.updateRememberedValue(rememberedValue9);
                            }
                            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue9, 15);
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                            composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                            mutableState5 = mutableState7;
                            companion2 = companion3;
                            function02 = function03;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                            ImageKt.Image(m1450rememberAsyncImagePainterMqRF_0, stringResource, m183clickableoSLSa3U$default, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer3, 24576, 104);
                            gapComposer3.end(false);
                            i3 = 3;
                            obj4 = obj5;
                        }
                        gapComposer3.end(true);
                        ChatContentViewModel.MessageViewModel messageViewModel3 = ChatContentViewModel.MessageViewModel.this;
                        FileTypes fileTypes2 = messageViewModel3.status;
                        boolean z2 = fileTypes2 instanceof ChatContentViewModel$MessageViewModel$Status$Failed;
                        if (z2) {
                            gapComposer3.startReplaceGroup(708593822);
                            String statusText = MessageFileKt.toStatusText(fileTypes2, gapComposer3);
                            String str2 = messageViewModel3.idempotenceToken;
                            MutableState mutableState8 = mutableState3;
                            boolean booleanValue = ((Boolean) mutableState8.getValue()).booleanValue();
                            Object rememberedValue10 = gapComposer3.rememberedValue();
                            if (rememberedValue10 == obj4) {
                                rememberedValue10 = new TabToolbarsKt$$ExternalSyntheticLambda10(16, mutableState8);
                                gapComposer3.updateRememberedValue(rememberedValue10);
                            }
                            fileTypes = fileTypes2;
                            composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$12;
                            messageViewModel2 = messageViewModel3;
                            z = z2;
                            i4 = 3;
                            ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                            MessageFileKt.MessageFailedRetryUI(str2, booleanValue, (Function1) rememberedValue10, function13, function14, statusText, false, gapComposer3, MLKEMEngine.KyberPolyBytes, 64);
                            gapComposer3.end(false);
                        } else {
                            fileTypes = fileTypes2;
                            z = z2;
                            ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$1;
                            composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$12;
                            messageViewModel2 = messageViewModel3;
                            i4 = i3;
                            gapComposer3.startReplaceGroup(709000325);
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(true);
                        String statusText2 = MessageFileKt.toStatusText(fileTypes, gapComposer3);
                        RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(i4)), Alignment.Companion.Top, gapComposer3, 6);
                        int hashCode4 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer3, companion2);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(function02);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$15);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer3, composeUiNode$Companion$SetModifier$1, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$12);
                        Updater.m576setimpl(gapComposer3, materializeModifier4, composeUiNode$Companion$SetModifier$13);
                        ChatContentViewModel.MessageViewModel messageViewModel4 = messageViewModel2;
                        MessageFileKt.MessageStatus(statusText2, messageViewModel4.status, messageViewModel4.timestamp, ((Boolean) mutableState5.getValue()).booleanValue(), z ? SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 44.0f, RecyclerView.DECELERATION_RATE, 11) : SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), gapComposer3, 0, 0);
                        gapComposer3.end(true);
                        gapComposer3.end(true);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, (i2 & 14) | 432);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetKt$$ExternalSyntheticLambda0(messageViewModel, function1, function12, function0, modifier2, function13, function14, i);
        }
    }

    public static final void MessageRetryPopupMenu(boolean z, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        boolean z2;
        int i2;
        GapComposer gapComposer;
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1955046778);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (gapComposer2.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
            PopupProperties popupProperties = new PopupProperties(false, 30);
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m591shadows4CzXII$default = ShadowKt.m591shadows4CzXII$default(Modifier.Companion.$$INSTANCE, 8.0f, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f), false, 28);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.subtle;
            ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
            gapComposer = gapComposer2;
            AndroidMenu_androidKt.m516DropdownMenuIlH_yew(z2, function0, ImageKt.m177backgroundbw27NRU(m591shadows4CzXII$default, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), 0L, null, popupProperties, m340RoundedCornerShape0680j_4, 0L, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1261541589, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, 29), gapComposer2), gapComposer, (i2 & 14) | 196608 | (i2 & 112), 1944);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalBrandProfileViewKt$$ExternalSyntheticLambda10(z, function0, composableLambdaImpl, i, 1);
        }
    }

    public static final void MessageRetryPopupMenuContent(Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        Function0 function03;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(635865560);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
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
            AndroidMenu_androidKt.DropdownMenuItem(lambda$681343826, function0, null, lambda$269633071, null, false, null, null, gapComposer, ((i2 << 3) & 112) | 3078, 500);
            function03 = function02;
            AndroidMenu_androidKt.DropdownMenuItem(f684lambda$1118137349, function03, null, f685lambda$1635181672, null, false, null, null, gapComposer, (i2 & 112) | 3078, 500);
            gapComposer.end(true);
        } else {
            function03 = function02;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftNoteViewKt$$ExternalSyntheticLambda10(function0, function03, i, 3);
        }
    }

    public static final void MessageSenderName(int i, Composer composer, Modifier modifier, String str, String str2, boolean z) {
        String str3;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-576136923);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | 3072;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            str3 = str;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (str == null || str.length() == 0) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new SchedulingTimePickerChipKt$$ExternalSyntheticLambda1(str, str2, i, z);
                    return;
                }
                return;
            }
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 44.0f, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12);
            modifier2 = companion;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ChatSurveyKt$$ExternalSyntheticLambda11(17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m302paddingqDBjuR0$default, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, Alignment.Companion.Top, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyXSmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            str3 = str;
            if (!z || str2 == null || str2.length() == 0) {
                gapComposer.startReplaceGroup(693274457);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(693111087);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.placeholder, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyXSmall, (TextLineBalancing) null, " ".concat(str2), (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new AddMoneyViewKt$$ExternalSyntheticLambda23(str3, str2, z, modifier2, i);
        }
    }

    public static final void MessageStatus(final String str, final FileTypes fileTypes, final String str2, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final FileTypes fileTypes2;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-321273317);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            fileTypes2 = fileTypes;
            i3 |= gapComposer.changedInstance(fileTypes2) ? 32 : 16;
        } else {
            fileTypes2 = fileTypes;
        }
        int i5 = i3 | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024);
        int i6 = i2 & 16;
        if (i6 != 0) {
            i4 = i5 | 24576;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i5 | (gapComposer.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            final Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            String str3 = null;
            String str4 = (str == null || str.length() == 0) ? null : str;
            if (str2 != null && str2.length() != 0 && z) {
                str3 = str2;
            }
            if (str4 == null && str3 == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i7 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.support.chat.views.transcript.message.compose.MessageStatusKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i7) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    MessageFileKt.MessageStatus(str, fileTypes2, str2, z, modifier4, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    MessageFileKt.MessageStatus(str, fileTypes2, str2, z, modifier4, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Modifier modifier5 = modifier4;
            String joinToString$default = CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str4, str3}), ", ", null, null, 0, null, null, 62);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier5, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            boolean changed = gapComposer.changed(joinToString$default);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(joinToString$default, 20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            OffsetKt.FlowRow(SemanticsModifierKt.clearAndSetSemantics(m302paddingqDBjuR0$default, (Function1) rememberedValue), SpacerKt.End, SpacerKt.Center, null, 0, 0, Expect_jvmKt.rememberComposableLambda(2098461270, new AccountUiViewKt$$ExternalSyntheticLambda14(str, fileTypes, str2, z, 5), gapComposer), gapComposer, 1573296, 56);
            modifier3 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i8 = 1;
            function2 = new Function2() { // from class: com.squareup.cash.support.chat.views.transcript.message.compose.MessageStatusKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i8) {
                        case 0:
                            ((Integer) obj2).getClass();
                            MessageFileKt.MessageStatus(str, fileTypes, str2, z, modifier3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            MessageFileKt.MessageStatus(str, fileTypes, str2, z, modifier3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void MessageStatusIcon(int i, Composer composer, Modifier modifier, Function0 function0) {
        int i2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-398747826);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalIconColor;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(colors.semantic.text.warning, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(-2087822706, new ShiftListViewKt$$ExternalSyntheticLambda8(function0), gapComposer), gapComposer, 56);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolErrorViewKt$$ExternalSyntheticLambda0(function0, modifier, i, 6);
        }
    }

    public static final void MessageTextAdvocate(ChatContentViewModel.MessageViewModel messageViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(120539405);
        int i2 = i | (gapComposer.changedInstance(messageViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BodyViewModel$TextBodyViewModel bodyViewModel$TextBodyViewModel = (BodyViewModel$TextBodyViewModel) messageViewModel.body;
            String str = bodyViewModel$TextBodyViewModel.text;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            String stringResource = Room.stringResource(gapComposer, R.string.support_chat_message_content_description_enumeration_comma);
            boolean containsUrls = containsUrls(str);
            ChatContentViewModel.EntryViewModel.ContentDescription contentDescription = messageViewModel.contentDescription;
            if (containsUrls) {
                str = null;
            }
            String createContentDescription = createContentDescription(contentDescription, str, stringResource);
            boolean changed = gapComposer.changed(createContentDescription);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealSandboxer$$ExternalSyntheticLambda1(createContentDescription, 21);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            MessageContainer(messageViewModel, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2), Expect_jvmKt.rememberComposableLambda(-56217628, new MessageTextBotKt$$ExternalSyntheticLambda1(messageViewModel, mutableState, bodyViewModel$TextBodyViewModel, containsUrls, function1, 1), gapComposer), gapComposer, (i2 & 14) | MLKEMEngine.KyberPolyBytes);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MessageActionKt$$ExternalSyntheticLambda1(messageViewModel, function1, modifier2, i, 1);
        }
    }

    public static final void MessageTextBot(ChatContentViewModel.MessageViewModel messageViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1209938529);
        int i2 = i | (gapComposer.changedInstance(messageViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            BodyViewModel$TextBodyViewModel bodyViewModel$TextBodyViewModel = (BodyViewModel$TextBodyViewModel) messageViewModel.body;
            String str = bodyViewModel$TextBodyViewModel.text;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            String stringResource = Room.stringResource(gapComposer, R.string.support_chat_message_content_description_enumeration_comma);
            boolean containsUrls = containsUrls(str);
            ChatContentViewModel.EntryViewModel.ContentDescription contentDescription = messageViewModel.contentDescription;
            if (containsUrls) {
                str = null;
            }
            String createContentDescription = createContentDescription(contentDescription, str, stringResource);
            boolean changed = gapComposer.changed(createContentDescription);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealSandboxer$$ExternalSyntheticLambda1(createContentDescription, 22);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            MessageContainer(messageViewModel, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2), Expect_jvmKt.rememberComposableLambda(76285238, new MessageTextBotKt$$ExternalSyntheticLambda1(messageViewModel, mutableState, bodyViewModel$TextBodyViewModel, containsUrls, function1, 0), gapComposer), gapComposer, (i2 & 14) | MLKEMEngine.KyberPolyBytes);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MessageActionKt$$ExternalSyntheticLambda1(messageViewModel, function1, modifier2, i, 2);
        }
    }

    public static final void MessageTextCustomer(ChatContentViewModel.MessageViewModel messageViewModel, Modifier modifier, Function1 function1, Function1 function12, Composer composer, int i) {
        function1.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(529063040);
        int i2 = i | (gapComposer.changedInstance(messageViewModel) ? 4 : 2) | 48 | (gapComposer.changedInstance(function1) ? 256 : 128) | (gapComposer.changedInstance(function12) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            BodyViewModel$TextBodyViewModel bodyViewModel$TextBodyViewModel = (BodyViewModel$TextBodyViewModel) messageViewModel.body;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            String createContentDescription = createContentDescription(messageViewModel.contentDescription, bodyViewModel$TextBodyViewModel.text, Room.stringResource(gapComposer, R.string.support_chat_message_content_description_enumeration_comma));
            boolean changed = gapComposer.changed(createContentDescription);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == obj) {
                rememberedValue3 = new RealSandboxer$$ExternalSyntheticLambda1(createContentDescription, 23);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            modifier = Modifier.Companion.$$INSTANCE;
            MessageContainer(messageViewModel, SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue3), Expect_jvmKt.rememberComposableLambda(-1104518505, new SwipeToDismissKt$$ExternalSyntheticLambda3(messageViewModel, function1, function12, mutableState, (ViewModelKt) bodyViewModel$TextBodyViewModel, mutableState2, 27), gapComposer), gapComposer, (i2 & 14) | MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MessageFileKt$$ExternalSyntheticLambda1(messageViewModel, modifier2, function1, function12, i, 1);
        }
    }

    public static final void MessageTextSystem(ChatContentViewModel.MessageViewModel messageViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Modifier modifier3;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1713664837);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(messageViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float f = messageViewModel.isFirstInGroup ? 28.0f : 4.0f;
            String stringResource = Room.stringResource(gapComposer, R.string.support_chat_message_content_description_enumeration_comma);
            String str = ((BodyViewModel$SystemMessageBodyViewModel) messageViewModel.body).text;
            String createContentDescription = createContentDescription(messageViewModel.contentDescription, str, stringResource);
            boolean containsUrls = containsUrls(str);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changed = gapComposer.changed(createContentDescription);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new RealSandboxer$$ExternalSyntheticLambda1(createContentDescription, 24);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, false, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Color.Transparent, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            long j = Strings.getColors(gapComposer).semantic.text.placeholder;
            TextStyle textStyle = Strings.getTypography(gapComposer).bodyXSmall;
            int i3 = LineBreak.Simple;
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, TextOverflow.access$packBytes(3, 1, 1), 14680063);
            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(Strings.getColors(gapComposer).base.brandOcean, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER), 2);
            if (containsUrls) {
                gapComposer.startReplaceGroup(-993321095);
                gapComposer.end(false);
                modifier3 = companion;
            } else {
                gapComposer.startReplaceGroup(-993387807);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ChatSurveyKt$$ExternalSyntheticLambda11(21);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                modifier3 = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue2);
                gapComposer.end(false);
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda8(function1, false, 29);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            LazyDslKt.m305MultiblockMarkdown1kVgcOc(str, (Function2) rememberedValue3, modifier3, m994copyp1EtxEg$default, j, markdownSpanValues, 3, null, gapComposer, 0, 128);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MessageActionKt$$ExternalSyntheticLambda1(messageViewModel, function1, modifier2, i, 3);
        }
    }

    public static final void MessageTimestamp(int i, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(860758728);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 52.0f, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ChatSurveyKt$$ExternalSyntheticLambda11(16);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m302paddingqDBjuR0$default, (Function1) rememberedValue);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, Alignment.Companion.Top, gapComposer, 6);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, colors.semantic.text.placeholder, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolCreateViewKt$$ExternalSyntheticLambda4(str, modifier2, i, 15);
        }
    }

    public static final void MessageTypingIndicator(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1769896911);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion, 24.0f));
            gapComposer.end(true);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 21);
        }
    }

    public static final void MessageUnknown(ChatContentViewModel.MessageViewModel messageViewModel, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-131173760);
        int i2 = (gapComposer.changedInstance(messageViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            MessageContainer(messageViewModel, companion, Expect_jvmKt.rememberComposableLambda(1155050007, new ShiftListViewKt$$ExternalSyntheticLambda8(9, function0), gapComposer), gapComposer, (i2 & 14) | 432);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda6(messageViewModel, function0, modifier2, i, 12);
        }
    }

    public static final boolean containsUrls(String str) {
        str.getClass();
        Pattern pattern = Patterns.WEB_URL;
        pattern.getClass();
        return new Regex(pattern).containsMatchIn(str);
    }

    public static final String createContentDescription(ChatContentViewModel.EntryViewModel.ContentDescription contentDescription, String str, String str2) {
        str2.getClass();
        return CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str == null ? contentDescription.messageDescription : contentDescription.messagePrefix, str, contentDescription.status}), str2, null, null, 0, null, null, 62);
    }

    public static final String toStatusText(FileTypes fileTypes, Composer composer) {
        int i;
        int i2;
        String m;
        GapComposer gapComposer = (GapComposer) composer;
        if (fileTypes == null) {
            gapComposer.startReplaceGroup(-1787000853);
            gapComposer.end(false);
            return null;
        }
        gapComposer.startReplaceGroup(-1787000852);
        if (fileTypes instanceof ChatContentViewModel$MessageViewModel$Status$Failed) {
            gapComposer.startReplaceGroup(296593401);
            gapComposer.end(false);
            m = ((ChatContentViewModel$MessageViewModel$Status$Failed) fileTypes).reason;
        } else {
            if (fileTypes.equals(ChatContentViewModel$MessageViewModel$Status$Recorded.INSTANCE)) {
                i = 296594250;
                i2 = R.string.support_chat_message_delivered;
            } else {
                if (!fileTypes.equals(ChatContentViewModel$MessageViewModel$Status$Sending.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 296592498, false);
                }
                i = 296596584;
                i2 = R.string.support_chat_message_sending;
            }
            m = re$$ExternalSyntheticOutline0.m(gapComposer, i, i2, gapComposer, false);
        }
        gapComposer.end(false);
        return m;
    }
}
