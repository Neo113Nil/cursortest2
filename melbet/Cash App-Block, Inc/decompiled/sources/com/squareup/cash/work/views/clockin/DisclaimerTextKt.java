package com.squareup.cash.work.views.clockin;

import android.icu.text.MessageFormat;
import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.SwitchKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.android.gms.dynamite.zzg;
import com.google.mlkit.common.internal.zzc;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.PasscodeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.ArcadeInfoBlockerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.components.CardFormElementView$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda22;
import com.squareup.cash.overlays.RealOverlayLayer$show$3;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda18;
import com.squareup.cash.scrubbing.CurrencyConfig;
import com.squareup.cash.scrubbing.MoneyScrubber;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda8;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda0;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import com.squareup.cash.transfers.views.WithdrawViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.work.viewmodels.DeclareCashTipBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ShiftNotStartedDialogViewModel;
import com.squareup.cash.work.viewmodels.TakeBreakBottomSheetViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.cash.work.viewmodels.ToastType;
import com.squareup.cash.work.views.ClockedInStatusDotKt;
import com.squareup.cash.work.views.ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda16;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda1;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda1;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.util.Strings;
import com.squareup.util.android.Views;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.uicore.elements.compat.TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda4;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes7.dex */
public abstract class DisclaimerTextKt {

    /* renamed from: lambda$-137300374, reason: not valid java name */
    public static final ComposableLambdaImpl f757lambda$137300374 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(11), false, -137300374);

    /* renamed from: lambda$-609297783, reason: not valid java name */
    public static final ComposableLambdaImpl f764lambda$609297783 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(12), false, -609297783);
    public static final ComposableLambdaImpl lambda$1424901779 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(13), false, 1424901779);

    /* renamed from: lambda$-1193042190, reason: not valid java name */
    public static final ComposableLambdaImpl f756lambda$1193042190 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(14), false, -1193042190);

    /* renamed from: lambda$-990538894, reason: not valid java name */
    public static final ComposableLambdaImpl f771lambda$990538894 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(15), false, -990538894);
    public static final ComposableLambdaImpl lambda$686484433 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(16), false, 686484433);
    public static final ComposableLambdaImpl lambda$840913324 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(17), false, 840913324);
    public static final ComposableLambdaImpl lambda$1293063277 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(10), false, 1293063277);

    /* renamed from: lambda$-305587284, reason: not valid java name */
    public static final ComposableLambdaImpl f762lambda$305587284 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(18), false, -305587284);
    public static final ComposableLambdaImpl lambda$2031790405 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(11), false, 2031790405);

    /* renamed from: lambda$-2037180048, reason: not valid java name */
    public static final ComposableLambdaImpl f760lambda$2037180048 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(12), false, -2037180048);

    /* renamed from: lambda$-772016025, reason: not valid java name */
    public static final ComposableLambdaImpl f766lambda$772016025 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(13), false, -772016025);

    /* renamed from: lambda$-2026610587, reason: not valid java name */
    public static final ComposableLambdaImpl f759lambda$2026610587 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(14), false, -2026610587);
    public static final ComposableLambdaImpl lambda$958536369 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(23), false, 958536369);

    /* renamed from: lambda$-326310692, reason: not valid java name */
    public static final ComposableLambdaImpl f763lambda$326310692 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(15), false, -326310692);

    /* renamed from: lambda$-791921321, reason: not valid java name */
    public static final ComposableLambdaImpl f767lambda$791921321 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(16), false, -791921321);

    /* renamed from: lambda$-1787545136, reason: not valid java name */
    public static final ComposableLambdaImpl f758lambda$1787545136 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(17), false, -1787545136);

    /* renamed from: lambda$-704102759, reason: not valid java name */
    public static final ComposableLambdaImpl f765lambda$704102759 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(18), false, -704102759);

    /* renamed from: lambda$-960332642, reason: not valid java name */
    public static final ComposableLambdaImpl f770lambda$960332642 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(19), false, -960332642);

    /* renamed from: lambda$-798756967, reason: not valid java name */
    public static final ComposableLambdaImpl f768lambda$798756967 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(19), false, -798756967);
    public static final ComposableLambdaImpl lambda$90352272 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(20), false, 90352272);

    /* renamed from: lambda$-2061130863, reason: not valid java name */
    public static final ComposableLambdaImpl f761lambda$2061130863 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(21), false, -2061130863);
    public static final ComposableLambdaImpl lambda$1122586290 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(20), false, 1122586290);

    /* renamed from: lambda$-806405636, reason: not valid java name */
    public static final ComposableLambdaImpl f769lambda$806405636 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(21), false, -806405636);

    public static final void ClockInBottomSheetView(ClockInBottomSheetViewModel clockInBottomSheetViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Object obj;
        Object obj2;
        Object uiWorkflow$$ExternalSyntheticLambda25;
        MutableState mutableState;
        MutableState mutableState2;
        ClockInBottomSheetViewModel clockInBottomSheetViewModel2 = clockInBottomSheetViewModel;
        Function1 function12 = function1;
        clockInBottomSheetViewModel2.getClass();
        List list = clockInBottomSheetViewModel2.jobs;
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1339060072);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(clockInBottomSheetViewModel2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(ClockInSheetMode.Main);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            List list2 = clockInBottomSheetViewModel2.locations;
            boolean changed = gapComposer.changed(list);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ClockInBottomSheetViewModel.JobItem) obj).isSelected) {
                            break;
                        }
                    }
                }
                ClockInBottomSheetViewModel.JobItem jobItem = (ClockInBottomSheetViewModel.JobItem) obj;
                rememberedValue2 = Updater.mutableStateOf$default(jobItem != null ? jobItem.identifier : null);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            boolean changed2 = gapComposer.changed(list2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (((ClockInBottomSheetViewModel.LocationItem) obj2).isSelected) {
                            break;
                        }
                    }
                }
                ClockInBottomSheetViewModel.LocationItem locationItem = (ClockInBottomSheetViewModel.LocationItem) obj2;
                rememberedValue3 = Updater.mutableStateOf$default(locationItem != null ? locationItem.identifier : null);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState5 = (MutableState) rememberedValue3;
            boolean changed3 = gapComposer.changed((JobIdentifier) mutableState4.getValue()) | ((i2 & 112) == 32) | gapComposer.changed((LocationIdentifier) mutableState5.getValue()) | gapComposer.changed(clockInBottomSheetViewModel2.shouldSendShiftToken);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue4 == neverEqualPolicy) {
                mutableState = mutableState4;
                uiWorkflow$$ExternalSyntheticLambda25 = new UiWorkflow$$ExternalSyntheticLambda25(function12, clockInBottomSheetViewModel2, mutableState, mutableState5, 17);
                mutableState2 = mutableState5;
                gapComposer.updateRememberedValue(uiWorkflow$$ExternalSyntheticLambda25);
            } else {
                uiWorkflow$$ExternalSyntheticLambda25 = rememberedValue4;
                mutableState2 = mutableState5;
                mutableState = mutableState4;
            }
            WalletHomeViewKt$$ExternalSyntheticLambda2 walletHomeViewKt$$ExternalSyntheticLambda2 = new WalletHomeViewKt$$ExternalSyntheticLambda2(mutableState3, mutableState2, mutableState, clockInBottomSheetViewModel, (Function0) uiWorkflow$$ExternalSyntheticLambda25, function1);
            clockInBottomSheetViewModel2 = clockInBottomSheetViewModel;
            function12 = function1;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1427233779, walletHomeViewKt$$ExternalSyntheticLambda2, gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(clockInBottomSheetViewModel2, function12, i, 2);
        }
    }

    public static final void ClockInMainContent(ClockInBottomSheetViewModel clockInBottomSheetViewModel, JobIdentifier jobIdentifier, LocationIdentifier locationIdentifier, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Composer composer, int i) {
        ClockInBottomSheetViewModel.JobItem jobItem;
        ClockInBottomSheetViewModel.LocationItem locationItem;
        Function0 function06;
        Object obj;
        Object obj2;
        ClockInBottomSheetViewModel clockInBottomSheetViewModel2 = clockInBottomSheetViewModel;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1189423410);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(clockInBottomSheetViewModel2) ? 4 : 2) | (gapComposer.changedInstance(jobIdentifier) ? 32 : 16) | (gapComposer.changedInstance(locationIdentifier) ? 256 : 128) | (gapComposer.changedInstance(function03) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function04) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changedInstance(function05) ? 8388608 : 4194304);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 4793491) != 4793490)) {
            if (jobIdentifier != null) {
                Iterator it = clockInBottomSheetViewModel2.jobs.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it.next();
                        if (((ClockInBottomSheetViewModel.JobItem) obj2).identifier.equals(jobIdentifier)) {
                            break;
                        }
                    }
                }
                jobItem = (ClockInBottomSheetViewModel.JobItem) obj2;
            } else {
                jobItem = null;
            }
            if (locationIdentifier != null) {
                Iterator it2 = clockInBottomSheetViewModel2.locations.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (((ClockInBottomSheetViewModel.LocationItem) obj).identifier.equals(locationIdentifier)) {
                            break;
                        }
                    }
                }
                locationItem = (ClockInBottomSheetViewModel.LocationItem) obj;
            } else {
                locationItem = null;
            }
            boolean z = clockInBottomSheetViewModel2.locations.size() > 1;
            boolean z2 = clockInBottomSheetViewModel2.jobs.size() > 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            ClockInBottomSheetViewModel.JobItem jobItem2 = jobItem;
            ClockInBottomSheetViewModel.LocationItem locationItem2 = locationItem;
            ViewfinderDefaults.SectionHeader(clockInBottomSheetViewModel2.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(853685059, new FieldBinding$$ExternalSyntheticLambda4(clockInBottomSheetViewModel2, 18), gapComposer);
            gapComposer = gapComposer;
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f757lambda$137300374, f764lambda$609297783, null, null, false, false, rememberComposableLambda, null, null, 0L, gapComposer, 12582966, 3964);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$1424901779, f756lambda$1193042190, null, z ? function0 : null, false, false, Expect_jvmKt.rememberComposableLambda(279163180, new ClockInBottomSheetViewKt$$ExternalSyntheticLambda16(locationItem2, 0), gapComposer), null, z ? CellDefaultAccessory.Push.INSTANCE : CellDefaultAccessory.None.INSTANCE, 0L, gapComposer, 12582966, 3444);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f771lambda$990538894, lambda$686484433, null, z2 ? function02 : null, false, false, Expect_jvmKt.rememberComposableLambda(-2136277493, new ClockInBottomSheetViewKt$$ExternalSyntheticLambda17(jobItem2, 0), gapComposer), null, z2 ? CellDefaultAccessory.Push.INSTANCE : CellDefaultAccessory.None.INSTANCE, 0L, gapComposer, 12582966, 3444);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            clockInBottomSheetViewModel2 = clockInBottomSheetViewModel;
            String str = clockInBottomSheetViewModel2.reasonText;
            if (str == null) {
                gapComposer.startReplaceGroup(1399731996);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1399731997);
                ClockInBottomSheetViewModel.ReasonAction reasonAction = clockInBottomSheetViewModel2.reasonAction;
                if (reasonAction instanceof ClockInBottomSheetViewModel.ReasonAction.OpenSettings) {
                    function06 = function05;
                } else if (reasonAction instanceof ClockInBottomSheetViewModel.ReasonAction.RequestLocationPermission) {
                    function06 = function04;
                } else {
                    if (reasonAction != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    function06 = null;
                }
                DisclaimerText(str, reasonAction != null ? reasonAction.getText() : null, function06, gapComposer, 0);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 16.0f));
                gapComposer.end(false);
            }
            coil3.size.SizeKt.ButtonCta(function03, SizeKt.fillMaxWidth(companion, 1.0f), ButtonProminence.PROMINENT, false, (clockInBottomSheetViewModel2.isClockInButtonLoading || !clockInBottomSheetViewModel2.isClockInButtonEnabled || jobIdentifier == null || locationIdentifier == null) ? false : true, null, Expect_jvmKt.rememberComposableLambda(-87978659, new CardAppletTile$$ExternalSyntheticLambda1(clockInBottomSheetViewModel2, 8), gapComposer), gapComposer, ((i2 >> 15) & 14) | 1573296, 40);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateInputKt$$ExternalSyntheticLambda1(clockInBottomSheetViewModel2, jobIdentifier, locationIdentifier, function0, function02, function03, function04, function05, i, 14);
        }
    }

    public static final void ClockInOverlayDialog(final int i, final String str, final int i2, final Function0 function0, final Function0 function02, Integer num, Function0 function03, Composer composer, final int i3, final int i4) {
        Integer num2;
        int i5;
        Function0 function04;
        int i6;
        final Integer num3;
        final Function0 function05;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1637984859);
        int i7 = i3 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(i2) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked);
        int i8 = i4 & 32;
        if (i8 != 0) {
            i5 = i7 | 196608;
            num2 = num;
        } else {
            num2 = num;
            i5 = i7 | (gapComposer.changed(num2) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i9 = i4 & 64;
        if (i9 != 0) {
            i6 = i5 | 1572864;
            function04 = function03;
        } else {
            function04 = function03;
            i6 = i5 | (gapComposer.changedInstance(function04) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        }
        if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
            Integer num4 = i8 != 0 ? null : num2;
            Function0 function06 = i9 != 0 ? null : function04;
            ModalKt.Dimmer(null, function02, null, Expect_jvmKt.rememberComposableLambda(1575517314, new CardFormElementView$$ExternalSyntheticLambda0(i, str, num4, function06, function0, i2), gapComposer), gapComposer, ((i6 >> 9) & 112) | 3072, 5);
            num3 = num4;
            function05 = function06;
        } else {
            gapComposer.skipToGroupEnd();
            num3 = num2;
            function05 = function04;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(i, str, i2, function0, function02, num3, function05, i3, i4) { // from class: com.squareup.cash.work.views.clockin.ClockInOverlayViewKt$$ExternalSyntheticLambda14
                public final /* synthetic */ int f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ Function0 f$3;
                public final /* synthetic */ Function0 f$4;
                public final /* synthetic */ Integer f$5;
                public final /* synthetic */ Function0 f$6;
                public final /* synthetic */ int f$8;

                {
                    this.f$8 = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    DisclaimerTextKt.ClockInOverlayDialog(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj, updateChangedFlags, this.f$8);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ClockInOverlayFooter(ClockInOverlayViewModel.Loaded loaded, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function1 function1, Composer composer, int i) {
        int i2;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        MutableState mutableState;
        Long l;
        boolean z3;
        loaded.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        function06.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1592373804);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            function07 = function03;
            i2 |= gapComposer.changedInstance(function07) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function07 = function03;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(function04) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            function08 = function05;
            i2 |= gapComposer.changedInstance(function08) ? 8388608 : 4194304;
        } else {
            function08 = function05;
        }
        if ((100663296 & i) == 0) {
            function09 = function06;
            i2 |= gapComposer.changedInstance(function09) ? 67108864 : 33554432;
        } else {
            function09 = function06;
        }
        if ((805306368 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer.shouldExecute(i2 & 1, (306783379 & i2) != 306783378)) {
            Object obj = null;
            if (loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOut) {
                gapComposer.startReplaceGroup(-1262853368);
                ClockInOverlayViewModel.Loaded.ClockedOut clockedOut = (ClockInOverlayViewModel.Loaded.ClockedOut) loaded;
                Iterator it = clockedOut.locations.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((ClockInOverlayViewModel.PickerItem) next).isSelected) {
                        obj = next;
                        break;
                    }
                }
                ClockInOverlayViewModel.PickerItem pickerItem = (ClockInOverlayViewModel.PickerItem) obj;
                int i3 = (i2 & 112) | ((i2 >> 3) & 57344);
                int i4 = i2 << 6;
                ClockedOutFooter(pickerItem != null && pickerItem.isEnabled && clockedOut.getSelectedJobTitle() != null && clockedOut.isGeofenceAllowed, z, clockedOut.geofenceReasonText, clockedOut.geofenceSettingsLinkText, function07, function0, function02, gapComposer, i3 | (i4 & 458752) | (i4 & 3670016));
                gapComposer.end(false);
            } else if (loaded instanceof ClockInOverlayViewModel.Loaded.ClockedIn) {
                gapComposer.startReplaceGroup(-1262838726);
                ClockInOverlayViewModel.Loaded.ClockedIn clockedIn = (ClockInOverlayViewModel.Loaded.ClockedIn) loaded;
                ClockedInFooter(clockedIn.showTakeBreakButton, clockedIn.isClockOutLoading, function04, function08, gapComposer, (i2 >> 12) & 8064);
                gapComposer.end(false);
            } else if (loaded instanceof ClockInOverlayViewModel.Loaded.OnBreak) {
                gapComposer.startReplaceGroup(-493000619);
                ClockInOverlayViewModel.Loaded.OnBreak onBreak = (ClockInOverlayViewModel.Loaded.OnBreak) loaded;
                Long l2 = onBreak.endBreakEnabledAtMillis;
                CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 = onBreak.currentTimeMillisProvider;
                boolean changedInstance = gapComposer.changedInstance(currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new RealOverlayLayer$show$3(0, currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0, CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0.class, "currentTimeMillis", "currentTimeMillis()J", 0, 1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function010 = (Function0) ((KFunction) rememberedValue);
                function010.getClass();
                gapComposer.startReplaceGroup(2005071850);
                if (l2 == null) {
                    gapComposer.end(false);
                    z3 = true;
                } else {
                    boolean changed = gapComposer.changed(l2.longValue());
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(((Number) function010.invoke()).longValue() >= l2.longValue(), gapComposer);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue2;
                    boolean changed2 = gapComposer.changed(mutableState2) | gapComposer.changed(l2) | gapComposer.changed(function010);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        mutableState = mutableState2;
                        rememberedValue3 = new WorkerWorkflow$render$1(l2, function010, mutableState, (Continuation) null, 12);
                        l = l2;
                        gapComposer.updateRememberedValue(rememberedValue3);
                    } else {
                        l = l2;
                        mutableState = mutableState2;
                    }
                    Updater.LaunchedEffect(gapComposer, l, (Function2) rememberedValue3);
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    gapComposer.end(false);
                    z3 = booleanValue;
                }
                boolean changedInstance2 = gapComposer.changedInstance(loaded) | ((1879048192 & i2) == 536870912);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new ListsKt$$ExternalSyntheticLambda0(13, (Object) loaded, (Object) function1);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                OnBreakFooter(z2, z3, function09, (Function0) rememberedValue4, gapComposer, ((i2 >> 6) & 14) | ((i2 >> 18) & 896));
                gapComposer.end(false);
            } else {
                if (!(loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOutSummary)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1262854493, false);
                }
                gapComposer.startReplaceGroup(-1262804680);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabUIKt$$ExternalSyntheticLambda22(loaded, z, z2, function0, function02, function03, function04, function05, function06, function1, i);
        }
    }

    public static final void ClockInOverlayHeader(Transition transition, Function0 function0, Composer composer, int i) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-167883689);
        int i2 = (gapComposer.changed(transition) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalIconColor;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(colors.component.titleBar.icon.f218default, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(-1816162409, new ClockInOverlayViewKt$$ExternalSyntheticLambda29(function0, transition), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ClockInOverlayViewKt$$ExternalSyntheticLambda29(transition, function0, i);
        }
    }

    public static final void ClockInOverlayLoadedContent(ClockInOverlayState clockInOverlayState, ClockInOverlayViewModel.Loaded loaded, PaddingValuesImpl paddingValuesImpl, Composer composer, int i) {
        int i2;
        NeverEqualPolicy neverEqualPolicy;
        int i3;
        int i4;
        NeverEqualPolicy neverEqualPolicy2;
        boolean z;
        NeverEqualPolicy neverEqualPolicy3;
        int i5;
        int i6;
        NeverEqualPolicy neverEqualPolicy4;
        int i7;
        int i8;
        boolean z2;
        ClockInOverlayState clockInOverlayState2 = clockInOverlayState;
        Integer valueOf = Integer.valueOf(R.string.work_views_cancel);
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(486706309);
        int i9 = i | (gapComposer.changed(clockInOverlayState2) ? 4 : 2) | (gapComposer.changedInstance(loaded) ? 32 : 16) | (gapComposer.changed(paddingValuesImpl) ? 256 : 128);
        if (gapComposer.shouldExecute(i9 & 1, (i9 & 147) != 146)) {
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
            int i10 = i9 & 14;
            ClockInOverlayModeContent(clockInOverlayState2, loaded, paddingValuesImpl, gapComposer, i9 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            if ((loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOut) && ((ClockInOverlayViewModel.Loaded.ClockedOut) loaded).isGeofenceLoading) {
                gapComposer.startReplaceGroup(-2065212692);
                ClockInOverlayLoadingDimmer(gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-2065171369);
                gapComposer.end(false);
            }
            Long l = (Long) clockInOverlayState2.endBreakDisabledDialogRemainingMinutes$delegate.getValue();
            NeverEqualPolicy neverEqualPolicy5 = Composer.Companion.Empty;
            if (l == null) {
                gapComposer.startReplaceGroup(-2065103325);
                gapComposer.end(false);
                i2 = i10;
                neverEqualPolicy = neverEqualPolicy5;
            } else {
                gapComposer.startReplaceGroup(-2065103324);
                String format2 = MessageFormat.format(Room.stringResource(gapComposer, R.string.work_views_end_break_disabled_dialog_body), (Map<String, Object>) MapsKt__MapsJVMKt.mapOf(new Pair("minutes", Long.valueOf(l.longValue()))));
                format2.getClass();
                boolean z3 = i10 == 4;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z3 || rememberedValue == neverEqualPolicy5) {
                    i2 = i10;
                    neverEqualPolicy = neverEqualPolicy5;
                    RealOverlayLayer$show$3 realOverlayLayer$show$3 = new RealOverlayLayer$show$3(0, clockInOverlayState2, ClockInOverlayState.class, "onEndBreakDisabledDialogDismissed", "onEndBreakDisabledDialogDismissed()V", 0, 2);
                    gapComposer.updateRememberedValue(realOverlayLayer$show$3);
                    rememberedValue = realOverlayLayer$show$3;
                } else {
                    i2 = i10;
                    neverEqualPolicy = neverEqualPolicy5;
                }
                Function0 function0 = (Function0) ((KFunction) rememberedValue);
                boolean z4 = i2 == 4;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy) {
                    clockInOverlayState2 = clockInOverlayState;
                    RealOverlayLayer$show$3 realOverlayLayer$show$32 = new RealOverlayLayer$show$3(0, clockInOverlayState2, ClockInOverlayState.class, "onEndBreakDisabledDialogDismissed", "onEndBreakDisabledDialogDismissed()V", 0, 3);
                    gapComposer.updateRememberedValue(realOverlayLayer$show$32);
                    rememberedValue2 = realOverlayLayer$show$32;
                } else {
                    clockInOverlayState2 = clockInOverlayState;
                }
                ClockInOverlayDialog(R.string.work_views_end_break_disabled_dialog_title, format2, R.string.work_shift_not_started_got_it, function0, (Function0) ((KFunction) rememberedValue2), null, null, gapComposer, 0, 96);
                gapComposer.end(false);
            }
            DisabledClockInReason disabledClockInReason = (DisabledClockInReason) clockInOverlayState2.disabledClockInReason$delegate.getValue();
            int i11 = disabledClockInReason == null ? -1 : ClockInOverlayViewKt$WhenMappings.$EnumSwitchMapping$0[disabledClockInReason.ordinal()];
            if (i11 == -1) {
                i3 = i2;
                i4 = 4;
                neverEqualPolicy2 = neverEqualPolicy;
                z = false;
                gapComposer.startReplaceGroup(-1867676785);
                gapComposer.end(false);
            } else if (i11 == 1) {
                int i12 = i2;
                NeverEqualPolicy neverEqualPolicy6 = neverEqualPolicy;
                gapComposer.startReplaceGroup(-1867711589);
                String stringResource = Room.stringResource(gapComposer, R.string.work_views_no_location_selected_body);
                boolean z5 = i12 == 4;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z5 || rememberedValue3 == neverEqualPolicy6) {
                    neverEqualPolicy4 = neverEqualPolicy6;
                    i7 = 4;
                    i8 = i12;
                    RealOverlayLayer$show$3 realOverlayLayer$show$33 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onDisabledClockInDialogPrimaryClick", "onDisabledClockInDialogPrimaryClick()V", 0, 4);
                    gapComposer.updateRememberedValue(realOverlayLayer$show$33);
                    rememberedValue3 = realOverlayLayer$show$33;
                } else {
                    i8 = i12;
                    neverEqualPolicy4 = neverEqualPolicy6;
                    i7 = 4;
                }
                Function0 function02 = (Function0) ((KFunction) rememberedValue3);
                boolean z6 = i8 == i7;
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z6 || rememberedValue4 == neverEqualPolicy4) {
                    RealOverlayLayer$show$3 realOverlayLayer$show$34 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onDisabledClockInDialogDismissed", "onDisabledClockInDialogDismissed()V", 0, 5);
                    gapComposer.updateRememberedValue(realOverlayLayer$show$34);
                    rememberedValue4 = realOverlayLayer$show$34;
                }
                Function0 function03 = (Function0) ((KFunction) rememberedValue4);
                boolean z7 = i8 == i7;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z7 || rememberedValue5 == neverEqualPolicy4) {
                    RealOverlayLayer$show$3 realOverlayLayer$show$35 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onDisabledClockInDialogDismissed", "onDisabledClockInDialogDismissed()V", 0, 6);
                    gapComposer.updateRememberedValue(realOverlayLayer$show$35);
                    rememberedValue5 = realOverlayLayer$show$35;
                }
                Function0 function04 = (Function0) ((KFunction) rememberedValue5);
                i3 = i8;
                neverEqualPolicy2 = neverEqualPolicy4;
                i4 = i7;
                ClockInOverlayDialog(R.string.work_views_no_location_selected_title, stringResource, R.string.work_views_select_location_button, function02, function03, valueOf, function04, gapComposer, 0, 0);
                gapComposer = gapComposer;
                z = false;
                gapComposer.end(false);
            } else {
                if (i11 != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1867713700, false);
                }
                gapComposer.startReplaceGroup(-1867693204);
                String stringResource2 = Room.stringResource(gapComposer, R.string.work_views_no_job_selected_body);
                boolean z8 = i2 == 4;
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (z8 || rememberedValue6 == neverEqualPolicy) {
                    z2 = true;
                    RealOverlayLayer$show$3 realOverlayLayer$show$36 = new RealOverlayLayer$show$3(0, clockInOverlayState2, ClockInOverlayState.class, "onDisabledClockInDialogPrimaryClick", "onDisabledClockInDialogPrimaryClick()V", 0, 7);
                    gapComposer.updateRememberedValue(realOverlayLayer$show$36);
                    rememberedValue6 = realOverlayLayer$show$36;
                } else {
                    z2 = true;
                }
                Function0 function05 = (Function0) ((KFunction) rememberedValue6);
                boolean z9 = i2 == 4 ? z2 : false;
                Object rememberedValue7 = gapComposer.rememberedValue();
                if (z9 || rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onDisabledClockInDialogDismissed", "onDisabledClockInDialogDismissed()V", 0, 8);
                    gapComposer.updateRememberedValue(rememberedValue7);
                }
                Function0 function06 = (Function0) ((KFunction) rememberedValue7);
                boolean z10 = i2 == 4 ? z2 : false;
                Object rememberedValue8 = gapComposer.rememberedValue();
                if (z10 || rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onDisabledClockInDialogDismissed", "onDisabledClockInDialogDismissed()V", 0, 9);
                    gapComposer.updateRememberedValue(rememberedValue8);
                }
                Function0 function07 = (Function0) ((KFunction) rememberedValue8);
                i4 = 4;
                i3 = i2;
                neverEqualPolicy2 = neverEqualPolicy;
                ClockInOverlayDialog(R.string.work_views_no_job_selected_title, stringResource2, R.string.work_views_select_job_button, function05, function06, valueOf, function07, gapComposer, 0, 0);
                gapComposer = gapComposer;
                gapComposer.end(false);
                z = false;
            }
            if (loaded.getShowErrorDialog()) {
                gapComposer.startReplaceGroup(-2063351824);
                String stringResource3 = Room.stringResource(gapComposer, R.string.work_views_please_try_again_later);
                boolean z11 = i3 == i4 ? true : z;
                Object rememberedValue9 = gapComposer.rememberedValue();
                if (z11 || rememberedValue9 == neverEqualPolicy2) {
                    neverEqualPolicy3 = neverEqualPolicy2;
                    i5 = i4;
                    i6 = i3;
                    RealOverlayLayer$show$3 realOverlayLayer$show$37 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onErrorDialogDismissed", "onErrorDialogDismissed()V", 0, 10);
                    gapComposer.updateRememberedValue(realOverlayLayer$show$37);
                    rememberedValue9 = realOverlayLayer$show$37;
                } else {
                    i6 = i3;
                    neverEqualPolicy3 = neverEqualPolicy2;
                    i5 = i4;
                }
                Function0 function08 = (Function0) ((KFunction) rememberedValue9);
                boolean z12 = i6 == i5 ? true : z;
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (z12 || rememberedValue10 == neverEqualPolicy3) {
                    RealOverlayLayer$show$3 realOverlayLayer$show$38 = new RealOverlayLayer$show$3(0, clockInOverlayState, ClockInOverlayState.class, "onErrorDialogDismissed", "onErrorDialogDismissed()V", 0, 11);
                    gapComposer.updateRememberedValue(realOverlayLayer$show$38);
                    rememberedValue10 = realOverlayLayer$show$38;
                }
                ClockInOverlayDialog(R.string.work_views_something_went_wrong, stringResource3, R.string.work_shift_not_started_got_it, function08, (Function0) ((KFunction) rememberedValue10), null, null, gapComposer, 0, 96);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-2063006825);
                gapComposer.end(z);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ClockInOverlayViewKt$$ExternalSyntheticLambda7(clockInOverlayState, loaded, paddingValuesImpl, i, 0);
        }
    }

    public static final void ClockInOverlayLoadingDimmer(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1595337443);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda0(27);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ModalKt.Dimmer(null, (Function0) rememberedValue, null, f763lambda$326310692, gapComposer, 3120, 5);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayHomeViewKt$$ExternalSyntheticLambda19(i, 10);
        }
    }

    public static final void ClockInOverlayLoadingErrorContent(ClockInOverlayViewModel clockInOverlayViewModel, PaddingValuesImpl paddingValuesImpl, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer;
        clockInOverlayViewModel.getClass();
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(733097436);
        int i2 = i | (gapComposer2.changedInstance(clockInOverlayViewModel) ? 4 : 2) | (gapComposer2.changed(paddingValuesImpl) ? 32 : 16) | (gapComposer2.changedInstance(function0) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changed = gapComposer2.changed(clockInOverlayViewModel);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline1.m(clockInOverlayViewModel instanceof ClockInOverlayViewModel.Error, gapComposer2);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxSize);
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
            int i3 = 7;
            gapComposer = gapComposer2;
            ScreenScaffoldKt.ScreenScaffoldColumn(null, null, paddingValuesImpl, Expect_jvmKt.rememberComposableLambda(493171386, new ActionPillKt$$ExternalSyntheticLambda0(7, function0), gapComposer2), null, Expect_jvmKt.rememberComposableLambda(1797541668, new CardAppletTile$$ExternalSyntheticLambda1(clockInOverlayViewModel, 9), gapComposer2), gapComposer, ((i2 << 3) & 896) | 199680, 19);
            if ((clockInOverlayViewModel instanceof ClockInOverlayViewModel.Error) && ((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1753822393);
                boolean changed2 = gapComposer.changed(mutableState);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new WalletHomeViewKt$$ExternalSyntheticLambda6(11, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ModalKt.Dimmer(null, (Function0) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(594595190, new HeroCardViewKt$$ExternalSyntheticLambda28(i3, mutableState), gapComposer), gapComposer, 3072, 5);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1754259648);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) clockInOverlayViewModel, (Object) paddingValuesImpl, (Function) function0, i, 4);
        }
    }

    public static final void ClockInOverlayMainContent(ClockInOverlayState clockInOverlayState, ClockInOverlayViewModel.Loaded loaded, PaddingValuesImpl paddingValuesImpl, Composer composer, int i) {
        Object currentState;
        Object currentState2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2094364015);
        int i2 = (gapComposer.changed(clockInOverlayState) ? 4 : 2) | i | (gapComposer.changedInstance(loaded) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(paddingValuesImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Transition updateTransition = AnimatableKt.updateTransition(loaded, "ClockInOverlayState", gapComposer, ((i2 >> 3) & 14) | 48, 0);
            InteractionResult interactionResult = updateTransition.transitionState;
            CubicBezierEasing cubicBezierEasing = ClockInOverlayTransitionsKt.ClockInOverlayEasing;
            TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
            boolean isSeeking = updateTransition.isSeeking();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (isSeeking) {
                gapComposer.startReplaceGroup(1666827533);
                gapComposer.end(false);
                currentState = interactionResult.getCurrentState();
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed = gapComposer.changed(updateTransition);
                currentState = gapComposer.rememberedValue();
                if (changed || currentState == neverEqualPolicy) {
                    Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState3 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState3);
                        currentState = currentState3;
                    } catch (Throwable th) {
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        throw th;
                    }
                }
                gapComposer.end(false);
            }
            ClockInOverlayViewModel.Loaded loaded2 = (ClockInOverlayViewModel.Loaded) currentState;
            gapComposer.startReplaceGroup(1667748452);
            float f = 1.0f;
            float f2 = ((loaded2 instanceof ClockInOverlayViewModel.Loaded.ClockedIn) || (loaded2 instanceof ClockInOverlayViewModel.Loaded.OnBreak)) ? 1.0f : 0.3f;
            gapComposer.end(false);
            Float valueOf = Float.valueOf(f2);
            boolean changed2 = gapComposer.changed(updateTransition);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 1));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ClockInOverlayViewModel.Loaded loaded3 = (ClockInOverlayViewModel.Loaded) ((State) rememberedValue).getValue();
            gapComposer.startReplaceGroup(1667748452);
            float f3 = ((loaded3 instanceof ClockInOverlayViewModel.Loaded.ClockedIn) || (loaded3 instanceof ClockInOverlayViewModel.Loaded.OnBreak)) ? 1.0f : 0.3f;
            gapComposer.end(false);
            Float valueOf2 = Float.valueOf(f3);
            boolean changed3 = gapComposer.changed(updateTransition);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 2));
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ((Transition.Segment) ((State) rememberedValue2).getValue()).getClass();
            gapComposer.startReplaceGroup(309119308);
            CubicBezierEasing cubicBezierEasing2 = ClockInOverlayTransitionsKt.ClockInOverlayEasing;
            int i3 = i2;
            TweenSpec tweenSpec = new TweenSpec(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 100, cubicBezierEasing2);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, tweenSpec, twoWayConverterImpl, gapComposer, 196608);
            if (updateTransition.isSeeking()) {
                gapComposer.startReplaceGroup(1666827533);
                gapComposer.end(false);
                currentState2 = interactionResult.getCurrentState();
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed4 = gapComposer.changed(updateTransition);
                currentState2 = gapComposer.rememberedValue();
                if (changed4 || currentState2 == neverEqualPolicy) {
                    Snapshot currentThreadSnapshot2 = zzg.getCurrentThreadSnapshot();
                    Function1 readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable2 = zzg.makeCurrentNonObservable(currentThreadSnapshot2);
                    try {
                        Object currentState4 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot2, makeCurrentNonObservable2, readObserver2);
                        gapComposer.updateRememberedValue(currentState4);
                        currentState2 = currentState4;
                    } catch (Throwable th2) {
                        zzg.restoreNonObservable(currentThreadSnapshot2, makeCurrentNonObservable2, readObserver2);
                        throw th2;
                    }
                }
                gapComposer.end(false);
            }
            ClockInOverlayViewModel.Loaded loaded4 = (ClockInOverlayViewModel.Loaded) currentState2;
            gapComposer.startReplaceGroup(-1387387056);
            float f4 = ((loaded4 instanceof ClockInOverlayViewModel.Loaded.ClockedIn) || (loaded4 instanceof ClockInOverlayViewModel.Loaded.OnBreak)) ? 1.0f : 0.95f;
            gapComposer.end(false);
            Float valueOf3 = Float.valueOf(f4);
            boolean changed5 = gapComposer.changed(updateTransition);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed5 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 3));
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            ClockInOverlayViewModel.Loaded loaded5 = (ClockInOverlayViewModel.Loaded) ((State) rememberedValue3).getValue();
            gapComposer.startReplaceGroup(-1387387056);
            if (!(loaded5 instanceof ClockInOverlayViewModel.Loaded.ClockedIn) && !(loaded5 instanceof ClockInOverlayViewModel.Loaded.OnBreak)) {
                f = 0.95f;
            }
            gapComposer.end(false);
            Float valueOf4 = Float.valueOf(f);
            boolean changed6 = gapComposer.changed(updateTransition);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed6 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.derivedStateOf(new TextFieldTransitionScope$TransitionDTcfvLk$$inlined$animateColor$1(updateTransition, 4));
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            ((Transition.Segment) ((State) rememberedValue4).getValue()).getClass();
            gapComposer.startReplaceGroup(1548951096);
            TweenSpec tweenSpec2 = new TweenSpec(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 100, cubicBezierEasing2);
            gapComposer.end(false);
            ScreenScaffoldKt.ScreenScaffoldColumn(null, null, paddingValuesImpl, Expect_jvmKt.rememberComposableLambda(1380411497, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(10, updateTransition, clockInOverlayState), gapComposer), Expect_jvmKt.rememberComposableLambda(-1726424166, new PayCellViewKt$$ExternalSyntheticLambda0(6, updateTransition, clockInOverlayState, loaded), gapComposer), Expect_jvmKt.rememberComposableLambda(-534850349, new SwipeToDismissKt$$ExternalSyntheticLambda2(createTransitionAnimation, AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, tweenSpec2, twoWayConverterImpl, gapComposer, 196608), loaded, updateTransition, clockInOverlayState, 16), gapComposer), gapComposer, (i3 & 896) | 224256, 3);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(clockInOverlayState, loaded, paddingValuesImpl, i, 2);
        }
    }

    public static final void ClockInOverlayModeContent(ClockInOverlayState clockInOverlayState, ClockInOverlayViewModel.Loaded loaded, PaddingValuesImpl paddingValuesImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(869738983);
        int i2 = 16;
        int i3 = (gapComposer.changed(clockInOverlayState) ? 4 : 2) | i | (gapComposer.changedInstance(loaded) ? 32 : 16) | (gapComposer.changed(paddingValuesImpl) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ClockInOverlayMode clockInOverlayMode = (ClockInOverlayMode) clockInOverlayState.overlayMode$delegate.getValue();
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new StripePaymentController$$ExternalSyntheticLambda1(15);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AnimatedContentKt.AnimatedContent(clockInOverlayMode, null, (Function1) rememberedValue, null, "ClockInOverlayModeTransition", null, Expect_jvmKt.rememberComposableLambda(1404858688, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(i2, clockInOverlayState, loaded, paddingValuesImpl), gapComposer), gapComposer, 1597824, 42);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ClockInOverlayViewKt$$ExternalSyntheticLambda7(clockInOverlayState, loaded, paddingValuesImpl, i, 1);
        }
    }

    public static final void ClockInOverlayToast(ToastState toastState, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(178367227);
        int i2 = (gapComposer.changedInstance(toastState) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ComposableLambdaImpl composableLambdaImpl = toastState.f1221type == ToastType.Success ? f767lambda$791921321 : null;
            Object obj = toastState.key;
            String str = toastState.message;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ModalKt.m3381ToastBAHpl2s(companion, obj, str, composableLambdaImpl, null, null, null, gapComposer, 6, 496);
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(toastState, modifier, i, 28);
        }
    }

    public static final void ClockInOverlayView(ClockInOverlayViewModel clockInOverlayViewModel, Function1 function1, Composer composer, int i) {
        Object failure;
        clockInOverlayViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(983823372);
        int i2 = (gapComposer.changedInstance(clockInOverlayViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            boolean changed = gapComposer.changed(view);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                try {
                    Result.Companion companion = Result.Companion;
                    failure = new WindowInsetsControllerCompat(Views.findActivity(view).getWindow(), view);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                rememberedValue = (WindowInsetsControllerCompat) failure;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            WindowInsetsControllerCompat windowInsetsControllerCompat = (WindowInsetsControllerCompat) rememberedValue;
            boolean changed2 = gapComposer.changed(windowInsetsControllerCompat);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = windowInsetsControllerCompat != null ? Boolean.valueOf(windowInsetsControllerCompat.mImpl.isAppearanceLightStatusBars()) : null;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Boolean bool = (Boolean) rememberedValue2;
            boolean changed3 = gapComposer.changed(windowInsetsControllerCompat) | gapComposer.changed(bool);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new ListsKt$$ExternalSyntheticLambda0(14, windowInsetsControllerCompat, bool);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            boolean changedInstance = gapComposer.changedInstance(windowInsetsControllerCompat) | gapComposer.changed(function0);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new HeroCardViewKt$$ExternalSyntheticLambda0(9, windowInsetsControllerCompat, function0);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.DisposableEffect(windowInsetsControllerCompat, (Function1) rememberedValue4, gapComposer);
            boolean changed4 = ((i2 & 112) == 32) | gapComposer.changed(function0);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new WithdrawViewKt$$ExternalSyntheticLambda2(2, function0, function1);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Function0 function02 = (Function0) rememberedValue5;
            function02.getClass();
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(function02, gapComposer);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new ClockInOverlayState(new HeroTagViewKt$$ExternalSyntheticLambda7(10, rememberUpdatedState), new WalletHomeViewKt$$ExternalSyntheticLambda6(13, rememberUpdatedState2));
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            ClockInOverlayState clockInOverlayState = (ClockInOverlayState) rememberedValue6;
            KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(clockInOverlayViewModel.getClass());
            Boolean valueOf = Boolean.valueOf(clockInOverlayViewModel.getShowErrorDialog());
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new CameraHelper$unbind$2(clockInOverlayState, null, 11);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            Updater.LaunchedEffect(orCreateKotlinClass, valueOf, (Function2) rememberedValue7, gapComposer);
            Boolean valueOf2 = Boolean.valueOf(clockInOverlayViewModel instanceof ClockInOverlayViewModel.Loaded.OnBreak);
            boolean changedInstance2 = gapComposer.changedInstance(clockInOverlayViewModel);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = new ClockInOverlayStateKt$rememberClockInOverlayState$2$1(clockInOverlayViewModel, clockInOverlayState, null, 0);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            Updater.LaunchedEffect(gapComposer, valueOf2, (Function2) rememberedValue8);
            Boolean valueOf3 = Boolean.valueOf(clockInOverlayViewModel instanceof ClockInOverlayViewModel.Loaded.ClockedOutSummary);
            boolean changedInstance3 = gapComposer.changedInstance(clockInOverlayViewModel);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue9 == neverEqualPolicy) {
                rememberedValue9 = new ClockInOverlayStateKt$rememberClockInOverlayState$2$1(clockInOverlayViewModel, clockInOverlayState, null, 1);
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            Updater.LaunchedEffect(gapComposer, valueOf3, (Function2) rememberedValue9);
            boolean z = ((ClockInOverlayMode) clockInOverlayState.overlayMode$delegate.getValue()) != ClockInOverlayMode.Main;
            boolean changed5 = gapComposer.changed(clockInOverlayState);
            Object rememberedValue10 = gapComposer.rememberedValue();
            if (changed5 || rememberedValue10 == neverEqualPolicy) {
                rememberedValue10 = new HCaptcha$$ExternalSyntheticLambda0(clockInOverlayState, 3);
                gapComposer.updateRememberedValue(rememberedValue10);
            }
            DBUtil.BackHandler(z, (Function0) rememberedValue10, gapComposer, 0, 0);
            ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(2073270551, new WorkViewFactory$$ExternalSyntheticLambda12((Object) clockInOverlayState, (Object) clockInOverlayViewModel, false, 27), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(clockInOverlayViewModel, function1, i, 4);
        }
    }

    public static final void ClockInStatusDataContent(ClockInOverlayViewModel.Loaded loaded, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        loaded.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1494333573);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOut) {
            gapComposer.startReplaceGroup(-355236146);
            ClockedOutSection((ClockInOverlayViewModel.Loaded.ClockedOut) loaded, function0, function02, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            gapComposer.end(false);
        } else if (loaded instanceof ClockInOverlayViewModel.Loaded.ClockedIn) {
            gapComposer.startReplaceGroup(-1535473422);
            ClockedInSection((ClockInOverlayViewModel.Loaded.ClockedIn) loaded, gapComposer, i2 & 14);
            gapComposer.end(false);
        } else if (loaded instanceof ClockInOverlayViewModel.Loaded.OnBreak) {
            gapComposer.startReplaceGroup(-1535471088);
            OnBreakSection((ClockInOverlayViewModel.Loaded.OnBreak) loaded, gapComposer, i2 & 14);
            gapComposer.end(false);
        } else {
            if (!(loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOutSummary)) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1535481590, false);
            }
            gapComposer.startReplaceGroup(-354878809);
            ClockInOverlayViewModel.Loaded.ClockedOutSummary clockedOutSummary = (ClockInOverlayViewModel.Loaded.ClockedOutSummary) loaded;
            ClockOutSummarySection(clockedOutSummary.wagesText, clockedOutSummary.cashTipsText, clockedOutSummary.timeText, gapComposer, 0);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(loaded, function0, function02, i, 3);
        }
    }

    public static final void ClockOutConfirmationContent(Function0 function0, Function0 function02, boolean z, Composer composer, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(651052814);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer.changedInstance(function0) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function02) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | MLKEMEngine.KyberPolyBytes;
        } else {
            i4 = i3 | (gapComposer.changed(z) ? 256 : 128);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            boolean z3 = i5 != 0 ? false : z;
            ScreenScaffoldKt.ScreenScaffoldColumn(null, null, null, Expect_jvmKt.rememberComposableLambda(1186511590, new ActionPillKt$$ExternalSyntheticLambda0(8, function0), gapComposer), Expect_jvmKt.rememberComposableLambda(83838551, new AccountToolbarKt$$ExternalSyntheticLambda1(z3, function02, 2, (byte) 0), gapComposer), f758lambda$1787545136, gapComposer, 224256, 7);
            z2 = z3;
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PasscodeKt$$ExternalSyntheticLambda2(function0, function02, z2, i, i2, 8);
        }
    }

    public static final void ClockOutSummarySection(String str, String str2, String str3, Composer composer, int i) {
        str.getClass();
        str3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-990197057);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(str3) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Strings.getSizes(gapComposer).getClass();
            zzc zzcVar = DefaultSizes.spacing;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            zzcVar.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            m3807SummaryRowN3hlwXA(Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_wages_label), str, 8.0f, j, gapComposer, (i2 << 3) & 112);
            gapComposer = gapComposer;
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            if (str2 != null) {
                gapComposer.startReplaceGroup(-1796967295);
                m3807SummaryRowN3hlwXA(Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_cash_tips_label), str2, 16.0f, j, gapComposer, i2 & 112);
                ModalKt.HorizontalDivider(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1796728967);
                gapComposer.end(false);
            }
            m3807SummaryRowN3hlwXA(Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_time_label), str3, 16.0f, j, gapComposer, (i2 >> 3) & 112);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            re$$ExternalSyntheticOutline0.m(companion, 128.0f, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0(str, str2, str3, i, 7);
        }
    }

    public static final void ClockStatusBadge(ClockInOverlayViewModel.Loaded loaded, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        loaded.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1513652833);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.subtle;
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.Center, 17, 0), 0, 15204351);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(companion2, j, roundedCornerShape), 12.0f, 4.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(6.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
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
            if (loaded instanceof ClockInOverlayViewModel.Loaded.ClockedIn) {
                gapComposer.startReplaceGroup(1854296489);
                ClockedInStatusDotKt.ClockedInStatusDot(null, gapComposer, 0);
                companion = companion2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_status_clocked_in), (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                companion = companion2;
                if (loaded instanceof ClockInOverlayViewModel.Loaded.OnBreak) {
                    gapComposer.startReplaceGroup(1854529795);
                    ClockedInStatusDotKt.OnBreakStatusDot(0, 3, gapComposer, null, false);
                    ClockInOverlayViewModel.Loaded.OnBreak onBreak = (ClockInOverlayViewModel.Loaded.OnBreak) loaded;
                    long j2 = onBreak.elapsedTimeStartMillis;
                    CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 = onBreak.currentTimeMillisProvider;
                    boolean changedInstance = gapComposer.changedInstance(currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new RealOverlayLayer$show$3(0, currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0, CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0.class, "currentTimeMillis", "currentTimeMillis()J", 0, 27);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    OnBreakStatusText(j2, (Function0) ((KFunction) rememberedValue), m994copyp1EtxEg$default, gapComposer, 0);
                    gapComposer.end(false);
                } else if (loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOut) {
                    gapComposer.startReplaceGroup(1854831239);
                    ClockedInStatusDotKt.ClockedOutStatusDot(null, gapComposer, 0);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_status_clocked_out), (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                } else {
                    if (!(loaded instanceof ClockInOverlayViewModel.Loaded.ClockedOutSummary)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1445288021, false);
                    }
                    gapComposer.startReplaceGroup(1855074279);
                    ClockedInStatusDotKt.ClockedOutStatusDot(null, gapComposer, 0);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_status_clocked_out), (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(loaded, modifier2, i, 3);
        }
    }

    public static final void ClockedInFooter(boolean z, boolean z2, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-763483940);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.VERTICAL, null, Expect_jvmKt.rememberComposableLambda(-1250076450, new PoolDetailsViewKt$$ExternalSyntheticLambda18(z2, function02, z, function0, 1), gapComposer), gapComposer, 24960, 11);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OnBreakOverlayContentKt$$ExternalSyntheticLambda2(z, z2, function0, function02, i, 1);
        }
    }

    public static final void ClockedInSection(ClockInOverlayViewModel.Loaded.ClockedIn clockedIn, Composer composer, int i) {
        int i2;
        clockedIn.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-350953804);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(clockedIn) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Strings.getSizes(gapComposer).getClass();
            zzc zzcVar = DefaultSizes.spacing;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            zzcVar.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 1);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_wages_label), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).headlineSmall, (TextLineBalancing) null, clockedIn.wagesText, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, 1);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 54);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default3);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_time_label), (Map) null, (Function1) null, false);
            long j2 = clockedIn.elapsedTimeStartMillis;
            TextStyle textStyle = Strings.getTypography(gapComposer).headlineSmall;
            CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 = clockedIn.currentTimeMillisProvider;
            boolean changedInstance = gapComposer.changedInstance(currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                RealOverlayLayer$show$3 realOverlayLayer$show$3 = new RealOverlayLayer$show$3(0, currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0, CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0.class, "currentTimeMillis", "currentTimeMillis()J", 0, 28);
                gapComposer.updateRememberedValue(realOverlayLayer$show$3);
                rememberedValue = realOverlayLayer$show$3;
            }
            m3806ElapsedTimeTimeruDo3WH8(j2, null, textStyle, j, (Function0) ((KFunction) rememberedValue), gapComposer, 0);
            gapComposer.end(true);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda1(clockedIn, i, 4);
        }
    }

    public static final void ClockedOutFooter(boolean z, boolean z2, String str, String str2, Function0 function0, Function0 function02, Function0 function03, Composer composer, int i) {
        int i2;
        boolean z3;
        Function0 function04;
        Function0 function05;
        ComposableLambdaImpl rememberComposableLambda;
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(784423734);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z2;
            i2 |= gapComposer.changed(z3) ? 32 : 16;
        } else {
            z3 = z2;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            function04 = function02;
            i2 |= gapComposer.changedInstance(function04) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function04 = function02;
        }
        if ((1572864 & i) == 0) {
            function05 = function03;
            i2 |= gapComposer.changedInstance(function05) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            function05 = function03;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            if (str == null) {
                gapComposer.startReplaceGroup(-149229909);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(-149229908);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(815154187, new BufferedChannel$$ExternalSyntheticLambda4(3, str, str2, function0), gapComposer);
                gapComposer.end(false);
            }
            DimensionKt.ButtonCtaGroup(null, false, null, rememberComposableLambda, Expect_jvmKt.rememberComposableLambda(-423187272, new PoolDetailsViewKt$$ExternalSyntheticLambda18(z, z3, function04, function05, 2), gapComposer), gapComposer, 24576, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwitchKt$$ExternalSyntheticLambda1(z, z2, str, str2, function0, function02, function03, i, 1);
        }
    }

    public static final void ClockedOutSection(final ClockInOverlayViewModel.Loaded.ClockedOut clockedOut, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        boolean z;
        CellDefaultAccessory cellDefaultAccessory;
        int i3;
        Function0 function03;
        CellDefaultAccessory cellDefaultAccessory2;
        boolean z2;
        Object obj;
        clockedOut.getClass();
        List list = clockedOut.locations;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1925663819);
        final int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(clockedOut) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function02) ? 256 : 128;
        }
        final int i5 = 1;
        final int i6 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.Companion.$$INSTANCE);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f768lambda$798756967, Expect_jvmKt.rememberComposableLambda(1413658970, new Function2() { // from class: com.squareup.cash.work.views.clockin.ClockedOutOverlayContentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    String m;
                    Object obj4;
                    int i7 = i6;
                    ClockInOverlayViewModel.Loaded.ClockedOut clockedOut2 = clockedOut;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                ClockInOverlayViewModel.ShiftScheduleDisplay shiftScheduleDisplay = clockedOut2.shiftSchedule;
                                if (!clockedOut2.shouldSendShiftToken || shiftScheduleDisplay == null) {
                                    m = re$$ExternalSyntheticOutline0.m(gapComposer3, -2134749194, R.string.work_views_clock_in_unscheduled, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-2134795167);
                                    gapComposer3.end(false);
                                    m = shiftScheduleDisplay.text;
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, m, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                Iterator it = clockedOut2.locations.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        if (((ClockInOverlayViewModel.PickerItem) obj4).isSelected) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                ClockInOverlayViewModel.PickerItem pickerItem = (ClockInOverlayViewModel.PickerItem) obj4;
                                String str = pickerItem != null ? pickerItem.name : null;
                                if (str == null) {
                                    str = re$$ExternalSyntheticOutline0.m(gapComposer4, -1219211869, R.string.work_views_location_label, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1219212799);
                                    gapComposer4.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String selectedJobTitle = clockedOut2.getSelectedJobTitle();
                                if (selectedJobTitle == null) {
                                    selectedJobTitle = re$$ExternalSyntheticOutline0.m(gapComposer5, 1379731679, R.string.work_views_job_label, gapComposer5, false);
                                } else {
                                    gapComposer5.startReplaceGroup(1379730873);
                                    gapComposer5.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, selectedJobTitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, null, false, false, null, null, null, 0L, gapComposer2, 54, 4092);
            List list2 = clockedOut.jobs;
            if (list.size() > 1) {
                gapComposer2.startReplaceGroup(664508497);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ClockInOverlayViewModel.PickerItem) obj).isSelected) {
                            break;
                        }
                    }
                }
                ClockInOverlayViewModel.PickerItem pickerItem = (ClockInOverlayViewModel.PickerItem) obj;
                if ((pickerItem != null ? pickerItem.name : null) == null) {
                    gapComposer2.startReplaceGroup(664556392);
                    cellDefaultAccessory = new CellDefaultAccessory.Label(Room.stringResource(gapComposer2, R.string.work_views_clock_in_select), 2);
                    z = false;
                    gapComposer2.end(false);
                } else {
                    z = false;
                    gapComposer2.startReplaceGroup(664670596);
                    gapComposer2.end(false);
                    cellDefaultAccessory = CellDefaultAccessory.Push.INSTANCE;
                }
                gapComposer2.end(z);
            } else {
                z = false;
                gapComposer2.startReplaceGroup(664736936);
                gapComposer2.end(false);
                cellDefaultAccessory = CellDefaultAccessory.None.INSTANCE;
            }
            CellDefaultAccessory cellDefaultAccessory3 = cellDefaultAccessory;
            if (list.size() > 1) {
                i3 = R.string.work_views_clock_in_select;
                function03 = function0;
            } else {
                i3 = R.string.work_views_clock_in_select;
                function03 = null;
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(lambda$90352272, Expect_jvmKt.rememberComposableLambda(213256209, new Function2() { // from class: com.squareup.cash.work.views.clockin.ClockedOutOverlayContentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    String m;
                    Object obj4;
                    int i7 = i5;
                    ClockInOverlayViewModel.Loaded.ClockedOut clockedOut2 = clockedOut;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                ClockInOverlayViewModel.ShiftScheduleDisplay shiftScheduleDisplay = clockedOut2.shiftSchedule;
                                if (!clockedOut2.shouldSendShiftToken || shiftScheduleDisplay == null) {
                                    m = re$$ExternalSyntheticOutline0.m(gapComposer3, -2134749194, R.string.work_views_clock_in_unscheduled, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-2134795167);
                                    gapComposer3.end(false);
                                    m = shiftScheduleDisplay.text;
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, m, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                Iterator it2 = clockedOut2.locations.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj4 = it2.next();
                                        if (((ClockInOverlayViewModel.PickerItem) obj4).isSelected) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                ClockInOverlayViewModel.PickerItem pickerItem2 = (ClockInOverlayViewModel.PickerItem) obj4;
                                String str = pickerItem2 != null ? pickerItem2.name : null;
                                if (str == null) {
                                    str = re$$ExternalSyntheticOutline0.m(gapComposer4, -1219211869, R.string.work_views_location_label, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1219212799);
                                    gapComposer4.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String selectedJobTitle = clockedOut2.getSelectedJobTitle();
                                if (selectedJobTitle == null) {
                                    selectedJobTitle = re$$ExternalSyntheticOutline0.m(gapComposer5, 1379731679, R.string.work_views_job_label, gapComposer5, false);
                                } else {
                                    gapComposer5.startReplaceGroup(1379730873);
                                    gapComposer5.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, selectedJobTitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, function03, false, false, null, null, cellDefaultAccessory3, 0L, gapComposer2, 54, 3572);
            if (list2.size() > 1) {
                gapComposer2.startReplaceGroup(665111509);
                if (clockedOut.getSelectedJobTitle() == null) {
                    gapComposer2.startReplaceGroup(665155560);
                    cellDefaultAccessory2 = new CellDefaultAccessory.Label(Room.stringResource(gapComposer2, i3), 2);
                    z2 = false;
                    gapComposer2.end(false);
                } else {
                    z2 = false;
                    gapComposer2.startReplaceGroup(665269764);
                    gapComposer2.end(false);
                    cellDefaultAccessory2 = CellDefaultAccessory.Push.INSTANCE;
                }
                gapComposer2.end(z2);
            } else {
                gapComposer2.startReplaceGroup(665336104);
                gapComposer2.end(false);
                cellDefaultAccessory2 = CellDefaultAccessory.None.INSTANCE;
            }
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f761lambda$2061130863, Expect_jvmKt.rememberComposableLambda(-1938226926, new Function2() { // from class: com.squareup.cash.work.views.clockin.ClockedOutOverlayContentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    String m;
                    Object obj4;
                    int i7 = i4;
                    ClockInOverlayViewModel.Loaded.ClockedOut clockedOut2 = clockedOut;
                    switch (i7) {
                        case 0:
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                ClockInOverlayViewModel.ShiftScheduleDisplay shiftScheduleDisplay = clockedOut2.shiftSchedule;
                                if (!clockedOut2.shouldSendShiftToken || shiftScheduleDisplay == null) {
                                    m = re$$ExternalSyntheticOutline0.m(gapComposer3, -2134749194, R.string.work_views_clock_in_unscheduled, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-2134795167);
                                    gapComposer3.end(false);
                                    m = shiftScheduleDisplay.text;
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, m, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                Iterator it2 = clockedOut2.locations.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj4 = it2.next();
                                        if (((ClockInOverlayViewModel.PickerItem) obj4).isSelected) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                ClockInOverlayViewModel.PickerItem pickerItem2 = (ClockInOverlayViewModel.PickerItem) obj4;
                                String str = pickerItem2 != null ? pickerItem2.name : null;
                                if (str == null) {
                                    str = re$$ExternalSyntheticOutline0.m(gapComposer4, -1219211869, R.string.work_views_location_label, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1219212799);
                                    gapComposer4.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                String selectedJobTitle = clockedOut2.getSelectedJobTitle();
                                if (selectedJobTitle == null) {
                                    selectedJobTitle = re$$ExternalSyntheticOutline0.m(gapComposer5, 1379731679, R.string.work_views_job_label, gapComposer5, false);
                                } else {
                                    gapComposer5.startReplaceGroup(1379730873);
                                    gapComposer5.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, selectedJobTitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, list2.size() > 1 ? function02 : null, false, false, null, null, cellDefaultAccessory2, 0L, gapComposer2, 54, 3572);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(clockedOut, function0, function02, i, 4);
        }
    }

    public static final void DeclareCashTipBottomSheetView(DeclareCashTipBottomSheetViewModel declareCashTipBottomSheetViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        declareCashTipBottomSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-864084737);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(declareCashTipBottomSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1087011500, new WorkViewFactory$$ExternalSyntheticLambda12((Object) function1, (Object) declareCashTipBottomSheetViewModel, false, 29), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(declareCashTipBottomSheetViewModel, function1, i, 5);
        }
    }

    public static final void DeclareCashTipContent(String str, String str2, Function0 function0, Function1 function1, boolean z, Composer composer, int i) {
        function0.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1458129807);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked);
        boolean z2 = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(null, 0L, gapComposer, 0, 3);
            int i3 = i2 >> 3;
            int i4 = 6;
            if ((((i3 & 14) ^ 6) <= 4 || !gapComposer.changed(str2)) && (i3 & 6) != 4) {
                z2 = false;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                try {
                    rememberedValue = CurrencyCode.valueOf(str2);
                } catch (IllegalArgumentException unused) {
                    rememberedValue = CurrencyCode.USD;
                }
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CurrencyCode currencyCode = (CurrencyCode) rememberedValue;
            boolean changed = gapComposer.changed(currencyCode.ordinal());
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                Locale locale = Locale.getDefault();
                locale.getClass();
                rememberedValue2 = CurrencyConfig.Companion.toCurrencyConfig(currencyCode, locale);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CurrencyConfig currencyConfig = (CurrencyConfig) rememberedValue2;
            boolean changed2 = gapComposer.changed(currencyCode.ordinal());
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MoneyScrubber(currencyCode, (Integer) 9);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MoneyScrubber moneyScrubber = (MoneyScrubber) rememberedValue3;
            boolean changed3 = gapComposer.changed(moneyScrubber);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new DeclareCashTipContentKt$$ExternalSyntheticLambda5(moneyScrubber, 0);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            InputTransformation inputTransformation = (InputTransformation) rememberedValue4;
            boolean changed4 = gapComposer.changed(currencyConfig);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new DeclareCashTipContentKt$$ExternalSyntheticLambda6(currencyConfig, 0);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            ScreenScaffoldKt.ScreenScaffoldColumn(null, null, null, Expect_jvmKt.rememberComposableLambda(637938023, new ActionPillKt$$ExternalSyntheticLambda0(9, function0), gapComposer), Expect_jvmKt.rememberComposableLambda(1826069656, new ShiftListViewKt$$ExternalSyntheticLambda16(m382rememberTextFieldStateLepunE, z, function1, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(-1277323823, new BasicShieetScope$$ExternalSyntheticLambda0(m382rememberTextFieldStateLepunE, str, inputTransformation, (OutputTransformation) rememberedValue5, 13), gapComposer), gapComposer, 224256, 7);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(str, str2, function0, function1, z, i);
        }
    }

    public static final void DeclareCashTipSheetContent(DeclareCashTipBottomSheetViewModel declareCashTipBottomSheetViewModel, PaddingValues paddingValues, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        CurrencyCode currencyCode;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1580622573);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(declareCashTipBottomSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(paddingValues) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(null, 0L, gapComposer2, 0, 3);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            String str = declareCashTipBottomSheetViewModel.currencyCode;
            boolean changed = gapComposer2.changed(str);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                try {
                    currencyCode = CurrencyCode.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    currencyCode = CurrencyCode.USD;
                }
                rememberedValue = currencyCode;
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            CurrencyCode currencyCode2 = (CurrencyCode) rememberedValue;
            boolean changed2 = gapComposer2.changed(currencyCode2.ordinal());
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                Locale locale = Locale.getDefault();
                locale.getClass();
                rememberedValue2 = CurrencyConfig.Companion.toCurrencyConfig(currencyCode2, locale);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            CurrencyConfig currencyConfig = (CurrencyConfig) rememberedValue2;
            boolean changed3 = gapComposer2.changed(currencyCode2.ordinal());
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MoneyScrubber(currencyCode2, (Integer) 9);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MoneyScrubber moneyScrubber = (MoneyScrubber) rememberedValue3;
            boolean changed4 = gapComposer2.changed(moneyScrubber);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new DeclareCashTipContentKt$$ExternalSyntheticLambda5(moneyScrubber, 1);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            InputTransformation inputTransformation = (InputTransformation) rememberedValue4;
            boolean changed5 = gapComposer2.changed(currencyConfig);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed5 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new DeclareCashTipContentKt$$ExternalSyntheticLambda6(currencyConfig, 1);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            OutputTransformation outputTransformation = (OutputTransformation) rememberedValue5;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier padding = SpacerKt.padding(companion, paddingValues);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, padding);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(companion, 1.0f), ImageKt.rememberScrollState(gapComposer2), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer2, R.string.work_views_declare_cash_tips), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            InputFieldKt.InputField(m382rememberTextFieldStateLepunE, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), false, false, false, null, Expect_jvmKt.rememberComposableLambda(737668812, new FieldBinding$$ExternalSyntheticLambda4(declareCashTipBottomSheetViewModel, 19), gapComposer2), null, null, "0" + currencyConfig.decimalSeparator + "00", new KeyboardOptions(0, (Boolean) null, 9, 0, (Boolean) null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE), null, inputTransformation, outputTransformation, null, null, gapComposer2, 1572864, 6, 51644);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-221967765, new BufferedChannel$$ExternalSyntheticLambda4(4, function1, m382rememberTextFieldStateLepunE, declareCashTipBottomSheetViewModel), gapComposer2), gapComposer2, 24576, 15);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            ToastState toastState = declareCashTipBottomSheetViewModel.toastState;
            if (toastState == null) {
                gapComposer.startReplaceGroup(-1220274001);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1220274000);
                ModalKt.m3381ToastBAHpl2s(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), toastState.key, toastState.message, null, null, null, null, gapComposer, 0, 504);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12((Object) declareCashTipBottomSheetViewModel, (Object) paddingValues, function1, i, 5);
        }
    }

    public static final void DisclaimerText(String str, String str2, Function0 function0, Composer composer, int i) {
        RecomposeScopeImpl recomposeScopeImpl;
        DisclaimerTextKt$$ExternalSyntheticLambda0 disclaimerTextKt$$ExternalSyntheticLambda0;
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-795125284);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            if (str2 == null || function0 == null) {
                gapComposer.startReplaceGroup(-832404446);
                Room.m1165Text25TpFw(0, 0, 0, 3, (i2 & 14) | 48, 0, 3824, j, (Composer) gapComposer, fillMaxWidth, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
                recomposeScopeImpl = gapComposer.endRestartGroup();
                if (recomposeScopeImpl != null) {
                    disclaimerTextKt$$ExternalSyntheticLambda0 = new DisclaimerTextKt$$ExternalSyntheticLambda0(i, 0, str, str2, function0);
                    recomposeScopeImpl.block = disclaimerTextKt$$ExternalSyntheticLambda0;
                }
                return;
            }
            gapComposer.startReplaceGroup(-832246842);
            gapComposer.end(false);
            TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(j, 0L, FontWeight.Medium, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61434), (SpanStyle) null, (SpanStyle) null, 14);
            gapComposer.startReplaceGroup(388803176);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.append(str);
            builder.append('\n');
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DisclaimerTextKt$$ExternalSyntheticLambda1(function0, 0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            int pushLink = builder.pushLink(new LinkAnnotation.Clickable("reason_action", textLinkStyles, (LinkInteractionListener) rememberedValue));
            try {
                builder.append(str2);
                builder.pop(pushLink);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                gapComposer.end(false);
                Room.m1164Text25TpFw(0, 0, 0, 3, 48, 0, 3824, j, (Composer) gapComposer, fillMaxWidth, annotatedString, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
            } catch (Throwable th) {
                builder.pop(pushLink);
                throw th;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        recomposeScopeImpl = gapComposer.endRestartGroup();
        if (recomposeScopeImpl != null) {
            disclaimerTextKt$$ExternalSyntheticLambda0 = new DisclaimerTextKt$$ExternalSyntheticLambda0(i, 4, str, str2, function0);
            recomposeScopeImpl.block = disclaimerTextKt$$ExternalSyntheticLambda0;
        }
    }

    /* renamed from: ElapsedTimeTimer-uDo3WH8, reason: not valid java name */
    public static final void m3806ElapsedTimeTimeruDo3WH8(long j, Modifier modifier, TextStyle textStyle, long j2, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        Modifier modifier3;
        Modifier modifier4;
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1134571478);
        int i2 = i | (gapComposer.changed(j) ? 4 : 2) | 48 | (gapComposer.changed(textStyle) ? 256 : 128) | (gapComposer.changed(j2) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                modifier4 = modifier3;
                rememberedValue = new ParcelableSnapshotMutableLongState(((Number) function0.invoke()).longValue() - j);
                gapComposer.updateRememberedValue(rememberedValue);
            } else {
                modifier4 = modifier3;
            }
            ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState2 = (ParcelableSnapshotMutableLongState) rememberedValue;
            Long valueOf = Long.valueOf(j);
            boolean changed = ((i2 & 57344) == 16384) | gapComposer.changed(parcelableSnapshotMutableLongState2) | (i3 == 4);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                parcelableSnapshotMutableLongState = parcelableSnapshotMutableLongState2;
                ElapsedTimeTimerKt$ElapsedTimeTimer$2$1 elapsedTimeTimerKt$ElapsedTimeTimer$2$1 = new ElapsedTimeTimerKt$ElapsedTimeTimer$2$1(function0, j, parcelableSnapshotMutableLongState, (Continuation) null);
                gapComposer.updateRememberedValue(elapsedTimeTimerKt$ElapsedTimeTimer$2$1);
                rememberedValue2 = elapsedTimeTimerKt$ElapsedTimeTimer$2$1;
            } else {
                parcelableSnapshotMutableLongState = parcelableSnapshotMutableLongState2;
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            long longValue = parcelableSnapshotMutableLongState.getLongValue() / 1000;
            int i4 = i2 & 8176;
            Modifier modifier5 = modifier4;
            Room.m1165Text25TpFw(0, 0, 0, 0, i4, 0, 4080, j2, (Composer) gapComposer, modifier5, textStyle, (TextLineBalancing) null, String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(longValue / 3600), Long.valueOf((longValue % 3600) / 60), Long.valueOf(longValue % 60)}, 3)), (Map) null, (Function1) null, false);
            modifier2 = modifier5;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda8(j, modifier2, textStyle, j2, function0, i);
        }
    }

    public static final void ItemPickerContent(String str, String str2, List list, Function1 function1, Function0 function0, Function1 function12, boolean z, Composer composer, int i, int i2) {
        int i3;
        Function1 function13;
        boolean z2;
        int i4;
        boolean z3;
        Object obj;
        str.getClass();
        str2.getClass();
        list.getClass();
        function1.getClass();
        function0.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-645640062);
        int i5 = 4;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str2) ? 32 : 16;
        }
        int i6 = i3 | (gapComposer.changedInstance(list) ? 256 : 128);
        if ((i & 24576) == 0) {
            i6 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            function13 = function12;
            i6 |= gapComposer.changedInstance(function13) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function13 = function12;
        }
        int i7 = i2 & 64;
        if (i7 != 0) {
            i4 = i6 | 1572864;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (gapComposer.changed(z2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        }
        if (gapComposer.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
            boolean z4 = i7 != 0 ? false : z2;
            boolean changed = gapComposer.changed(list);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = null;
            if (changed || rememberedValue == Composer.Companion.Empty) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ClockInOverlayViewModel.PickerItem) obj).isSelected) {
                            break;
                        }
                    }
                }
                ClockInOverlayViewModel.PickerItem pickerItem = (ClockInOverlayViewModel.PickerItem) obj;
                rememberedValue = Updater.mutableStateOf$default(pickerItem != null ? pickerItem.identifier : null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object value = mutableState.getValue();
            String str3 = value != null ? (String) function1.invoke(value) : null;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(function1.invoke(((ClockInOverlayViewModel.PickerItem) next).identifier), str3)) {
                    obj2 = next;
                    break;
                }
            }
            ScreenScaffoldKt.ScreenScaffoldColumn(null, null, null, Expect_jvmKt.rememberComposableLambda(1132205146, new ArcadeInfoBlockerKt$$ExternalSyntheticLambda0(str, function0, i5), gapComposer), Expect_jvmKt.rememberComposableLambda(-1941463605, new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(z4, (ClockInOverlayViewModel.PickerItem) obj2, mutableState, function13, str2), gapComposer), Expect_jvmKt.rememberComposableLambda(314605380, new BasicShieetScope$$ExternalSyntheticLambda0(list, function1, str3, mutableState, 12), gapComposer), gapComposer, 224256, 7);
            z3 = z4;
        } else {
            gapComposer.skipToGroupEnd();
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(str, str2, list, function1, function0, function12, z3, i, i2);
        }
    }

    public static final void JobPickerContent(List list, JobIdentifier jobIdentifier, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1646528430);
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changedInstance(jobIdentifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | 3072;
        boolean z = false;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean changed = gapComposer.changed(jobIdentifier);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(jobIdentifier);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
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
            gapComposer.startReplaceGroup(-595348392);
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                ClockInBottomSheetViewModel.JobItem jobItem = (ClockInBottomSheetViewModel.JobItem) it.next();
                ComposableLambdaImpl composableLambdaImpl = jobItem.isScheduled ? f762lambda$305587284 : null;
                CellDefaultAccessory.Radio radio = new CellDefaultAccessory.Radio(jobItem.identifier.equals((JobIdentifier) mutableState.getValue()));
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1579790319, new ClockInBottomSheetViewKt$$ExternalSyntheticLambda17(jobItem, i3), gapComposer);
                boolean changed2 = gapComposer.changed(mutableState) | gapComposer.changedInstance(jobItem);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ListsKt$$ExternalSyntheticLambda0(9, jobItem, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue2, false, false, composableLambdaImpl, null, 0L, radio, null, gapComposer2, 6, 1466);
                z = z;
                gapComposer = gapComposer2;
                neverEqualPolicy = neverEqualPolicy;
                companion = companion;
                i3 = 1;
            }
            gapComposer.end(z);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1020052022, new ShiftListViewKt$$ExternalSyntheticLambda11(mutableState, function1, 6), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(list, i, jobIdentifier, function1, modifier2, 17);
        }
    }

    public static final void LocationPickerContent(List list, LocationIdentifier locationIdentifier, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1465530170);
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changedInstance(locationIdentifier) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | 3072;
        boolean z = false;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean changed = gapComposer.changed(locationIdentifier);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(locationIdentifier);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
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
            gapComposer.startReplaceGroup(1018560145);
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                ClockInBottomSheetViewModel.LocationItem locationItem = (ClockInBottomSheetViewModel.LocationItem) it.next();
                ComposableLambdaImpl composableLambdaImpl = locationItem.isScheduled ? lambda$840913324 : null;
                CellDefaultAccessory.Radio radio = new CellDefaultAccessory.Radio(locationItem.identifier.equals((LocationIdentifier) mutableState.getValue()));
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1395740425, new ClockInBottomSheetViewKt$$ExternalSyntheticLambda16(locationItem, i3), gapComposer);
                boolean changed2 = gapComposer.changed(mutableState) | gapComposer.changedInstance(locationItem);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ListsKt$$ExternalSyntheticLambda0(10, locationItem, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue2, false, false, composableLambdaImpl, null, 0L, radio, null, gapComposer2, 6, 1466);
                z = z;
                gapComposer = gapComposer2;
                neverEqualPolicy = neverEqualPolicy;
                companion = companion;
                i3 = 1;
            }
            gapComposer.end(z);
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1800603314, new ShiftListViewKt$$ExternalSyntheticLambda11(mutableState, function1, 7), gapComposer), gapComposer, 24576, 15);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(list, i, locationIdentifier, function1, modifier2, 18);
        }
    }

    public static final void OnBreakFooter(boolean z, boolean z2, Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(102148252);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(211954078, new PoolDetailsViewKt$$ExternalSyntheticLambda18(z, z2, function0, function02, 3), gapComposer), gapComposer, 24576, 15);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OnBreakOverlayContentKt$$ExternalSyntheticLambda2(z, z2, function0, function02, i, 0);
        }
    }

    public static final void OnBreakSection(ClockInOverlayViewModel.Loaded.OnBreak onBreak, Composer composer, int i) {
        int i2;
        onBreak.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(410276678);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(onBreak) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Strings.getSizes(gapComposer).getClass();
            zzc zzcVar = DefaultSizes.spacing;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(companion, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape);
            zzcVar.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m177backgroundbw27NRU, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 1);
            Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_wages_label), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).headlineSmall, (TextLineBalancing) null, onBreak.wagesText, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, 1);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer, 54);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default3);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_time_label), (Map) null, (Function1) null, false);
            long j2 = onBreak.elapsedTimeStartMillis;
            TextStyle textStyle = Strings.getTypography(gapComposer).headlineSmall;
            CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 = onBreak.currentTimeMillisProvider;
            boolean changedInstance = gapComposer.changedInstance(currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                RealOverlayLayer$show$3 realOverlayLayer$show$3 = new RealOverlayLayer$show$3(0, currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0, CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0.class, "currentTimeMillis", "currentTimeMillis()J", 0, 29);
                gapComposer.updateRememberedValue(realOverlayLayer$show$3);
                rememberedValue = realOverlayLayer$show$3;
            }
            m3806ElapsedTimeTimeruDo3WH8(j2, null, textStyle, j, (Function0) ((KFunction) rememberedValue), gapComposer, 0);
            gapComposer.end(true);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda1(onBreak, i, 5);
        }
    }

    public static final void OnBreakStatusText(long j, Function0 function0, TextStyle textStyle, Composer composer, int i) {
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState;
        String str;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-619629582);
        int i2 = i | (gapComposer.changed(j) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(textStyle) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                long longValue = (((Number) function0.invoke()).longValue() - j) / 60000;
                rememberedValue = new ParcelableSnapshotMutableLongState(longValue < 0 ? 0L : longValue);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState2 = (ParcelableSnapshotMutableLongState) rememberedValue;
            Long valueOf = Long.valueOf(j);
            boolean changed = (i3 == 4) | gapComposer.changed(parcelableSnapshotMutableLongState2) | ((i2 & 112) == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                parcelableSnapshotMutableLongState = parcelableSnapshotMutableLongState2;
                ElapsedTimeTimerKt$ElapsedTimeTimer$2$1 elapsedTimeTimerKt$ElapsedTimeTimer$2$1 = new ElapsedTimeTimerKt$ElapsedTimeTimer$2$1(j, function0, parcelableSnapshotMutableLongState, (Continuation) null);
                gapComposer.updateRememberedValue(elapsedTimeTimerKt$ElapsedTimeTimer$2$1);
                rememberedValue2 = elapsedTimeTimerKt$ElapsedTimeTimer$2$1;
            } else {
                parcelableSnapshotMutableLongState = parcelableSnapshotMutableLongState2;
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            long longValue2 = parcelableSnapshotMutableLongState.getLongValue() / 60;
            long longValue3 = parcelableSnapshotMutableLongState.getLongValue() % 60;
            if (longValue2 > 0) {
                str = longValue2 + "h " + longValue3 + "m";
            } else {
                str = longValue3 + "m";
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 896, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, Recorder$$ExternalSyntheticOutline2.m(Room.stringResource(gapComposer, R.string.work_views_clock_in_overlay_status_on_break), "  ·  ", str), (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TapToPayPaymentKt$$ExternalSyntheticLambda3(j, function0, textStyle, i);
        }
    }

    public static final void ShiftNotStartedDialogView(ShiftNotStartedDialogViewModel shiftNotStartedDialogViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        shiftNotStartedDialogViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2108931144);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(shiftNotStartedDialogViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1509047421, new Radiography$$ExternalSyntheticLambda1(shiftNotStartedDialogViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(shiftNotStartedDialogViewModel, function1, modifier2, i, 6);
        }
    }

    /* renamed from: SummaryRow-N3hlwXA, reason: not valid java name */
    public static final void m3807SummaryRowN3hlwXA(final String str, final String str2, final float f, final long j, Composer composer, final int i) {
        String str3;
        int i2;
        String str4;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1183410526);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (gapComposer2.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= gapComposer2.changed(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(j) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, f, 1);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 7182, 0, 4082, j, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, ((i2 >> 3) & 14) | (i2 & 7168), 0, 4082, j, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).headlineSmall, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.work.views.clockin.ClockOutSummarySectionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    DisclaimerTextKt.m3807SummaryRowN3hlwXA(str, str2, f, j, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void TakeBreakBottomSheetView(TakeBreakBottomSheetViewModel takeBreakBottomSheetViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        takeBreakBottomSheetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-492993491);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(takeBreakBottomSheetViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(220208248, new PayCellViewKt$$ExternalSyntheticLambda0(8, function1, takeBreakBottomSheetViewModel, (MutableState) rememberedValue), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(takeBreakBottomSheetViewModel, function1, i, 6);
        }
    }
}
