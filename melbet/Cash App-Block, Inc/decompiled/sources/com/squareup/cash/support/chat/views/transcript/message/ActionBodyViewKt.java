package com.squareup.cash.support.chat.views.transcript.message;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.blockers.presenters.ReferralCodePresenter$models$2$1$1;
import com.squareup.cash.common.composeui.shimmer.ShimmerCellsKt;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda16;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.moneybot.widgets.FloatingChatInputKt$$ExternalSyntheticLambda8;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda9;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.views.search.ShopHubResultsListKt$$ExternalSyntheticLambda14;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$ActivityBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TransactionBodyViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda6;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda11;
import com.squareup.cash.support.chat.views.survey.ChatSurveyKt$$ExternalSyntheticLambda3;
import com.squareup.cash.support.chat.views.transcript.message.ImagePlaceholderView;
import com.squareup.cash.support.screenshot.ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.CardTransitionKt$$ExternalSyntheticLambda3;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt$$ExternalSyntheticLambda0;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public abstract class ActionBodyViewKt {

    /* renamed from: lambda$-446327618, reason: not valid java name */
    public static final ComposableLambdaImpl f683lambda$446327618 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(28), false, -446327618);

    /* renamed from: lambda$-1155048135, reason: not valid java name */
    public static final ComposableLambdaImpl f681lambda$1155048135 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(5), false, -1155048135);
    public static final ComposableLambdaImpl lambda$1197371671 = new ComposableLambdaImpl(new ShopHubResultsListKt$$ExternalSyntheticLambda14(29), false, 1197371671);
    public static final ComposableLambdaImpl lambda$62636180 = new ComposableLambdaImpl(new ChatSurveyKt$$ExternalSyntheticLambda3(6), false, 62636180);

    /* renamed from: lambda$-1888473015, reason: not valid java name */
    public static final ComposableLambdaImpl f682lambda$1888473015 = new ComposableLambdaImpl(new ComposableSingletons$ScreenshotViewKt$$ExternalSyntheticLambda0(1), false, -1888473015);

    public static final void ActionBody(String str, String str2, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2109618147);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            long j = Strings.getColors(gapComposer).semantic.background.subtle;
            RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(16.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(companion, j, RoundedCornerShape), false, null, null, function0, 15), 16.0f, 12.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, ((i2 >> 3) & 14) | 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DisclaimerTextKt$$ExternalSyntheticLambda0(i, 3, str, str2, function0);
        }
    }

    public static final void ActivityTransactionBody(final SupportActivityItemLoader supportActivityItemLoader, final RealImageLoader realImageLoader, final BodyViewModel$ActivityBodyViewModel bodyViewModel$ActivityBodyViewModel, final Function1 function1, Composer composer, final int i) {
        final SupportActivityItemLoader supportActivityItemLoader2;
        final RealImageLoader realImageLoader2;
        final BodyViewModel$ActivityBodyViewModel bodyViewModel$ActivityBodyViewModel2;
        final Function1 function12;
        GapComposer gapComposer;
        final int i2;
        supportActivityItemLoader.getClass();
        realImageLoader.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1105333094);
        int i3 = (gapComposer2.changedInstance(supportActivityItemLoader) ? 4 : 2) | i | (gapComposer2.changedInstance(realImageLoader) ? 32 : 16) | (gapComposer2.changedInstance(bodyViewModel$ActivityBodyViewModel) ? 256 : 128) | (gapComposer2.changedInstance(function1) ? 2048 : 1024);
        if (!gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            supportActivityItemLoader2 = supportActivityItemLoader;
            realImageLoader2 = realImageLoader;
            bodyViewModel$ActivityBodyViewModel2 = bodyViewModel$ActivityBodyViewModel;
            function12 = function1;
            gapComposer = gapComposer2;
            i2 = i;
            gapComposer.skipToGroupEnd();
        } else {
            if (bodyViewModel$ActivityBodyViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(supportActivityItemLoader, realImageLoader, bodyViewModel$ActivityBodyViewModel, function1, i, i4) { // from class: com.squareup.cash.support.chat.views.transcript.message.ActivityTransactionKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ SupportActivityItemLoader f$0;
                        public final /* synthetic */ RealImageLoader f$1;
                        public final /* synthetic */ BodyViewModel$ActivityBodyViewModel f$2;
                        public final /* synthetic */ Function1 f$3;

                        {
                            this.$r8$classId = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.$r8$classId) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(1);
                                    ActionBodyViewKt.ActivityTransactionBody(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags2 = Updater.updateChangedFlags(1);
                                    ActionBodyViewKt.ActivityTransactionBody(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            supportActivityItemLoader2 = supportActivityItemLoader;
            realImageLoader2 = realImageLoader;
            i2 = i;
            bodyViewModel$ActivityBodyViewModel2 = bodyViewModel$ActivityBodyViewModel;
            function12 = function1;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = FlowKt.MutableSharedFlow$default(1, 0, null, 6);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue;
            boolean changed = gapComposer2.changed(bodyViewModel$ActivityBodyViewModel2.entityId);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = FlowKt.transformLatest(mutableSharedFlow, new ActivityTransactionKt$ActivityTransactionBody$lambda$2$$inlined$flatMapLatest$1(null, supportActivityItemLoader2, bodyViewModel$ActivityBodyViewModel2, 0));
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            gapComposer = gapComposer2;
            MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, SupportActivityItemLoader.State.Failure.INSTANCE$1, null, gapComposer, 0, 2);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(mutableSharedFlow);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ReferralCodePresenter$models$2$1$1(mutableSharedFlow, null, 4);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), Expect_jvmKt.rememberComposableLambda(-418247002, new TabToolbarsKt$$ExternalSyntheticLambda6(9, mutableSharedFlow, function12, collectAsState), gapComposer), gapComposer, 56);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = 1;
            endRestartGroup2.block = new Function2(supportActivityItemLoader2, realImageLoader2, bodyViewModel$ActivityBodyViewModel2, function12, i2, i5) { // from class: com.squareup.cash.support.chat.views.transcript.message.ActivityTransactionKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ SupportActivityItemLoader f$0;
                public final /* synthetic */ RealImageLoader f$1;
                public final /* synthetic */ BodyViewModel$ActivityBodyViewModel f$2;
                public final /* synthetic */ Function1 f$3;

                {
                    this.$r8$classId = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(1);
                            ActionBodyViewKt.ActivityTransactionBody(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(1);
                            ActionBodyViewKt.ActivityTransactionBody(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void EnhancedSuggestedReplies(ArrayList arrayList, ChatView$$ExternalSyntheticLambda6 chatView$$ExternalSyntheticLambda6, Composer composer, int i) {
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(529184526);
        int i2 = (gapComposer.changedInstance(arrayList) ? 4 : 2) | i | (gapComposer.changedInstance(chatView$$ExternalSyntheticLambda6) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(wrapContentHeight, colors.semantic.background.f1047app, ColorKt.RectangleShape);
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
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(864257670, new TabToolbarsKt$$ExternalSyntheticLambda3(6, arrayList, chatView$$ExternalSyntheticLambda6), gapComposer), gapComposer, 24966, 10);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1(arrayList, chatView$$ExternalSyntheticLambda6, i, 22);
        }
    }

    public static final void FailedToLoadContent(int i, int i2, Composer composer, Function0 function0) {
        Function0 function02;
        int i3;
        Function0 function03;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1741303294);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            i3 = i | (gapComposer.changedInstance(function02) ? 4 : 2);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (i4 != 0) {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = new SheetKt$$ExternalSyntheticLambda9(17);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                function03 = (Function0) rememberedValue;
            } else {
                function03 = function02;
            }
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f);
            int i5 = i3;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j, m340RoundedCornerShape0680j_4);
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, colors2.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m178borderxT4_qwU);
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
            boolean z = (i5 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ToViewKt$$ExternalSyntheticLambda2(29, function03);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3388CellActivity6RhP_wg(f683lambda$446327618, f681lambda$1155048135, lambda$1197371671, (Function0) rememberedValue2, companion, null, lambda$62636180, null, true, 0L, gapComposer, 102457782, 640);
            gapComposer.end(true);
            function02 = function03;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FloatingChatInputKt$$ExternalSyntheticLambda8(function02, i, i2);
        }
    }

    public static final void ImagePlaceholder(ImagePlaceholderView.State state, Function0 function0, Composer composer, int i) {
        state.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(887633602);
        int i2 = (gapComposer.changed(state.ordinal()) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier modifier = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier, 240.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m285size3ABfNKs, 1.0f, colors.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            if (state == ImagePlaceholderView.State.ERROR) {
                gapComposer.startReplaceGroup(-620637279);
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(1, function0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier = ImageKt.m183clickableoSLSa3U$default(modifier, false, null, null, (Function0) rememberedValue, 15);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-620569730);
                gapComposer.end(false);
            }
            Modifier then = m178borderxT4_qwU.then(modifier);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(999649718);
                ImagePlaceholderProgress(gapComposer, 0);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 999647961, false);
                }
                gapComposer.startReplaceGroup(999651923);
                ImagePlaceholderError(gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActionPillKt$$ExternalSyntheticLambda1((Object) state, function0, i, 23);
        }
    }

    public static final void ImagePlaceholderError(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1417297325);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer, 54);
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
            Trace.m1191Iconww6aTOc(Icons.AlertOutline24, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.extraSubtle, gapComposer, 54, 4);
            Room.m1164Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(gapComposer).semantic.icon.extraSubtle, (Composer) gapComposer, (Modifier) null, new AnnotatedString(Room.stringResource(gapComposer, R.string.support_chat_image_load_fail)), Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ChatSurveyKt$$ExternalSyntheticLambda3(i, 8);
        }
    }

    public static final void ImagePlaceholderProgress(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1669554852);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 60.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m285size3ABfNKs);
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
            ProgressCircularKt.ProgressCircular(0, 0, gapComposer, BoxScopeInstance.INSTANCE.matchParentSize());
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ChatSurveyKt$$ExternalSyntheticLambda3(i, 7);
        }
    }

    public static final void LoadedContent(BodyViewModel$TransactionBodyViewModel.Loaded loaded, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1993582594);
        int i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(20.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Modifier transactionBodyModifier = transactionBodyModifier(gapComposer);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, transactionBodyModifier);
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
            TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(loaded.avatar, null, null, gapComposer, 8, 3), null, false, gapComposer, 6, 28);
            String str = loaded.title;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda6(loaded, i, 20);
        }
    }

    public static final void LoadingContent(String str, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1547868663);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Modifier transactionBodyModifier = transactionBodyModifier(gapComposer);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, transactionBodyModifier);
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
            ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f));
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardTransitionKt$$ExternalSyntheticLambda3(str, i, 3);
        }
    }

    public static final void MessageContent(final String str, final ChatContentViewModel.EntryViewModel.Sender sender, final boolean z, final Function1 function1, Function0 function0, Composer composer, int i) {
        ChatContentViewModel.EntryViewModel.Sender sender2;
        Pair pair;
        long j;
        TextStyle textStyle;
        int i2;
        boolean z2;
        Modifier m183clickableoSLSa3U$default;
        boolean z3;
        sender.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(706024591);
        int i3 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(sender.ordinal()) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            int ordinal = sender.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-115193244);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Color color = new Color(colors.semantic.text.standard);
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(color, new Color(colors2.semantic.text.inverse));
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(-115189655);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                Colors colors3 = (Colors) gapComposer.consume(staticProvidableCompositionLocal2);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Color color2 = new Color(colors3.semantic.background.subtle);
                Colors colors4 = (Colors) gapComposer.consume(staticProvidableCompositionLocal2);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(color2, new Color(colors4.semantic.text.standard));
                gapComposer.end(false);
            } else if (ordinal == 2) {
                gapComposer.startReplaceGroup(-115186330);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalColors;
                Colors colors5 = (Colors) gapComposer.consume(staticProvidableCompositionLocal3);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Color color3 = new Color(colors5.semantic.background.f1047app);
                Colors colors6 = (Colors) gapComposer.consume(staticProvidableCompositionLocal3);
                if (colors6 == null) {
                    colors6 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(color3, new Color(colors6.semantic.text.standard));
                gapComposer.end(false);
            } else {
                if (ordinal != 3) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -115194243, false);
                }
                gapComposer.startReplaceGroup(-115183027);
                Color color4 = new Color(Color.Transparent);
                Colors colors7 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors7 == null) {
                    colors7 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(color4, new Color(colors7.semantic.text.disabled));
                gapComposer.end(false);
            }
            long j2 = ((Color) pair.first).value;
            long j3 = ((Color) pair.second).value;
            int[] iArr = MessageContentKt$WhenMappings.$EnumSwitchMapping$0;
            if (iArr[sender.ordinal()] == 4) {
                gapComposer.startReplaceGroup(-115177632);
                TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors8 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors8 == null) {
                    colors8 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = j3;
                long j4 = colors8.semantic.text.placeholder;
                int i4 = LineBreak.Simple;
                textStyle = TextStyle.m994copyp1EtxEg$default(textStyle2, j4, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, TextOverflow.access$packBytes(3, 1, 1), 14680062);
                gapComposer.end(false);
            } else {
                j = j3;
                gapComposer.startReplaceGroup(-115166919);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                gapComposer.end(false);
            }
            int i5 = iArr[sender.ordinal()] == 4 ? 3 : 5;
            int ordinal2 = sender.ordinal();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (ordinal2 == 2) {
                i2 = 5;
                gapComposer.startReplaceGroup(-115149005);
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                Colors colors9 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors9 == null) {
                    colors9 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, colors9.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 16.0f, 12.0f);
                z2 = false;
                m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m299paddingVpY3zN4, false, null, null, function0, 15);
                gapComposer.end(false);
            } else if (ordinal2 != 3) {
                gapComposer.startReplaceGroup(-115139437);
                gapComposer.end(false);
                Modifier m299paddingVpY3zN42 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(companion, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 16.0f, 12.0f);
                z2 = false;
                i2 = 5;
                m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m299paddingVpY3zN42, false, null, null, function0, 15);
            } else {
                i2 = 5;
                gapComposer.startReplaceGroup(-115146196);
                gapComposer.end(false);
                m183clickableoSLSa3U$default = ImageKt.m177backgroundbw27NRU(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), j2, ColorKt.RectangleShape);
                z2 = false;
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z2);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
            if (str == null) {
                gapComposer.startReplaceGroup(-705490975);
                gapComposer.end(z2);
                sender2 = sender;
                z3 = true;
            } else {
                gapComposer.startReplaceGroup(-705490974);
                final int i6 = i5;
                int i7 = i2;
                boolean z4 = z2;
                final long j5 = j;
                z3 = true;
                final TextStyle textStyle3 = textStyle;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1419497160, new Function2() { // from class: com.squareup.cash.support.chat.views.transcript.message.MessageContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int intValue = ((Integer) obj2).intValue();
                        boolean z5 = false;
                        GapComposer gapComposer2 = (GapComposer) composer2;
                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                            ChatContentViewModel.EntryViewModel.Sender sender3 = ChatContentViewModel.EntryViewModel.Sender.CUSTOMER;
                            Modifier modifier = Modifier.Companion.$$INSTANCE;
                            ChatContentViewModel.EntryViewModel.Sender sender4 = ChatContentViewModel.EntryViewModel.Sender.this;
                            String str2 = str;
                            TextStyle textStyle4 = textStyle3;
                            long j6 = j5;
                            int i8 = i6;
                            Object obj3 = Composer.Companion.Empty;
                            if (sender4 == sender3) {
                                gapComposer2.startReplaceGroup(-7989456);
                                Object rememberedValue = gapComposer2.rememberedValue();
                                if (rememberedValue == obj3) {
                                    rememberedValue = new ChatSurveyKt$$ExternalSyntheticLambda11(10);
                                    gapComposer2.updateRememberedValue(rememberedValue);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, i8, 0, 0, 3824, j6, (Composer) gapComposer2, SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue), textStyle4, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(-7579574);
                                Colors colors10 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                if (colors10 == null) {
                                    colors10 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                } else {
                                    gapComposer2.startReplaceGroup(-1762997739);
                                    gapComposer2.end(false);
                                }
                                MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(colors10.base.brandOcean, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER), 2);
                                if (z) {
                                    gapComposer2.startReplaceGroup(-7100500);
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.startReplaceGroup(-7175148);
                                    Object rememberedValue2 = gapComposer2.rememberedValue();
                                    if (rememberedValue2 == obj3) {
                                        rememberedValue2 = new ChatSurveyKt$$ExternalSyntheticLambda11(11);
                                        gapComposer2.updateRememberedValue(rememberedValue2);
                                    }
                                    modifier = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue2);
                                    gapComposer2.end(false);
                                }
                                Modifier modifier2 = modifier;
                                Function1 function12 = function1;
                                boolean changed = gapComposer2.changed(function12);
                                Object rememberedValue3 = gapComposer2.rememberedValue();
                                if (changed || rememberedValue3 == obj3) {
                                    rememberedValue3 = new ScoreHomeKt$$ExternalSyntheticLambda8(function12, z5, 26);
                                    gapComposer2.updateRememberedValue(rememberedValue3);
                                }
                                LazyDslKt.m305MultiblockMarkdown1kVgcOc(str2, (Function2) rememberedValue3, modifier2, textStyle4, j6, markdownSpanValues, i8, null, gapComposer2, 0, 128);
                                gapComposer2.end(false);
                            }
                        } else {
                            gapComposer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                sender2 = sender;
                if (sender2 == ChatContentViewModel.EntryViewModel.Sender.SYSTEM) {
                    gapComposer.startReplaceGroup(533605280);
                    rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
                    gapComposer.end(z4);
                } else {
                    gapComposer.startReplaceGroup(533638729);
                    SimpleLayoutKt.SelectionContainer(null, Expect_jvmKt.rememberComposableLambda(1966841998, new StripeThemeKt$$ExternalSyntheticLambda2(rememberComposableLambda, i7), gapComposer), gapComposer, 48, 1);
                    gapComposer.end(z4);
                }
                gapComposer.end(z4);
            }
            gapComposer.end(z3);
        } else {
            sender2 = sender;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(str, sender2, z, function1, function0, i);
        }
    }

    public static final void MissingContent(String str, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-8219763);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            Modifier transactionBodyModifier = transactionBodyModifier(gapComposer);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, transactionBodyModifier);
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
            Trace.m1190Iconww6aTOc(Countries.painterResource(R.drawable.icon_alert_outline_24, 0, gapComposer), (String) null, SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f), Strings.getColors(gapComposer).semantic.icon.subtle, gapComposer, Painter.$stable | 432, 0);
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CardTransitionKt$$ExternalSyntheticLambda3(str, i, 4);
        }
    }

    public static final void SuggestedRepliesButtons(ChatRowViewModel.SuggestedRepliesRowViewModel suggestedRepliesRowViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(890503651);
        int i2 = (gapComposer.changedInstance(suggestedRepliesRowViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z = suggestedRepliesRowViewModel.model.chatUiUpliftEnabled;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            OffsetKt.FlowRow(SizeKt.fillMaxWidth(companion, 1.0f).then(z ? SpacerKt.m301paddingqDBjuR0(companion, RecyclerView.DECELERATION_RATE, 8.0f, 16.0f, 8.0f) : SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, 1)), z ? SpacerKt.Start : SpacerKt.End, new Arrangement$SpacedAligned(z ? 12.0f : 16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), null, 0, 0, Expect_jvmKt.rememberComposableLambda(-984729058, new MoneyTabUIKt$$ExternalSyntheticLambda16(suggestedRepliesRowViewModel, z, 5), gapComposer), gapComposer, 1572864, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestedRepliesViewKt$$ExternalSyntheticLambda1(suggestedRepliesRowViewModel, i);
        }
    }

    public static final void SuggestedReplyButton(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        Modifier background$default;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-632892257);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            MutableState collectIsPressedAsState = Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer, 6);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f);
            long j = Strings.getColors(gapComposer).isLight ? 4293454056L : 4281545523L;
            boolean booleanValue = ((Boolean) collectIsPressedAsState.getValue()).booleanValue();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (booleanValue) {
                gapComposer.startReplaceGroup(413616369);
                background$default = ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(gapComposer).component.button.standard.background.pressed, m340RoundedCornerShape0680j_4);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(413771896);
                gapComposer.end(false);
                long j2 = j;
                background$default = ImageKt.background$default(companion, new LinearGradient(CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{new Color(Color.m675copywmQWz5c$default(0.5f, ColorKt.Color(j2), 14)), new Color(Color.m675copywmQWz5c$default(0.2f, ColorKt.Color(j2), 14))}), null, 0L, 9187343241974906880L), m340RoundedCornerShape0680j_4, 4);
            }
            Modifier then = ImageKt.m182clickableO2vRcR0$default(ClipKt.clip(SizeKt.m276defaultMinSizeVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, 44.0f, 1), m340RoundedCornerShape0680j_4), mutableInteractionSourceImpl, null, false, null, new Role(0), function0, 12).then(background$default);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(then, 16.0f, 10.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.placeholder, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda1(str, function0, modifier, i, 6);
        }
    }

    public static final void TransactionBodyContent(BodyViewModel$TransactionBodyViewModel bodyViewModel$TransactionBodyViewModel, String str, String str2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(554993120);
        int i2 = (gapComposer.changedInstance(bodyViewModel$TransactionBodyViewModel) ? 4 : 2) | i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (Intrinsics.areEqual(bodyViewModel$TransactionBodyViewModel, BodyViewModel$TransactionBodyViewModel.Loading.INSTANCE)) {
            gapComposer.startReplaceGroup(772448539);
            LoadingContent(str, gapComposer, (i2 >> 3) & 14);
            gapComposer.end(false);
        } else if (bodyViewModel$TransactionBodyViewModel instanceof BodyViewModel$TransactionBodyViewModel.Loaded) {
            gapComposer.startReplaceGroup(772449976);
            LoadedContent((BodyViewModel$TransactionBodyViewModel.Loaded) bodyViewModel$TransactionBodyViewModel, gapComposer, i2 & 14);
            gapComposer.end(false);
        } else {
            if (!Intrinsics.areEqual(bodyViewModel$TransactionBodyViewModel, BodyViewModel$TransactionBodyViewModel.Missing.INSTANCE)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 772447574, false);
            }
            gapComposer.startReplaceGroup(772451259);
            MissingContent(str2, gapComposer, (i2 >> 6) & 14);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda6(bodyViewModel$TransactionBodyViewModel, str, str2, i, 10);
        }
    }

    public static final void UnknownMessageBody(int i, Composer composer, Modifier modifier, Function0 function0) {
        Function0 function02 = function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-319083738);
        int i2 = i | (gapComposer.changedInstance(function02) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
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
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Icons icons = Icons.AlertOutline24;
            long j = Strings.getColors(gapComposer).semantic.icon.subtle;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Trace.m1191Iconww6aTOc(icons, (String) null, SizeKt.m285size3ABfNKs(companion, 24.0f), j, gapComposer, 438, 0);
            Strings.getSizes(gapComposer).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 4.0f, gapComposer);
            Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.support_chat_unknown_body_text), (Map) null, (Function1) null, false);
            function02 = function0;
            coil3.size.SizeKt.Button(function02, SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 12.0f), null, false, false, null, f682lambda$1888473015, gapComposer, (i2 & 14) | 1572912, 60);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(function02, modifier, i, 17);
        }
    }

    public static final Modifier transactionBodyModifier(Composer composer) {
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
        if (colors2 == null) {
            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        return SpacerKt.m299paddingVpY3zN4(ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, colors2.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 16.0f, 16.0f);
    }

    public static final void LoadingContent(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1447312738);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, colors2.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m178borderxT4_qwU);
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
                ShimmerCellsKt.m3504ShimmerCellItemFNF3uiM(false, false, 0L, gapComposer, 0, 7);
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
            endRestartGroup.block = new ChatSurveyKt$$ExternalSyntheticLambda3(i, 4);
        }
    }

    public static final void LoadedContent(ActivityItemViewModel activityItemViewModel, Function0 function0, Composer composer, int i) {
        ActivityItemViewModel activityItemViewModel2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1866944433);
        int i2 = (gapComposer.changedInstance(activityItemViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, colors2.semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalMapKt$$ExternalSyntheticLambda10(29, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            activityItemViewModel2 = activityItemViewModel;
            ActivityItemViewKt.m2972ActivityItemViewww6aTOc(activityItemViewModel2, (Function1) rememberedValue, m178borderxT4_qwU, 0L, gapComposer, i2 & 14, 8);
        } else {
            activityItemViewModel2 = activityItemViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareSheetViewKt$$ExternalSyntheticLambda2(activityItemViewModel2, function0, i, 20);
        }
    }
}
