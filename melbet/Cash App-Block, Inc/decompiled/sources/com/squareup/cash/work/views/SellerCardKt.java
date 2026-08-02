package com.squareup.cash.work.views;

import android.content.res.Configuration;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1;
import androidx.compose.runtime.Applier;
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
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda17;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.memory.RealWeakMemoryCache;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountAvatarKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.work.viewmodels.ScheduleCalendarDot;
import com.squareup.cash.work.viewmodels.ScheduleCalendarViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.WorkHomeTitleBarViewModel;
import com.squareup.cash.work.viewmodels.WorkHomeViewModel;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import com.squareup.util.compose.ScaledSizeKt;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.camera.GovernmentIdFeed$analyze$5;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda4;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;
import timber.log.Timber;
import xyz.block.genie.state.StateBindingsKt$$ExternalSyntheticLambda0;

/* loaded from: classes7.dex */
public abstract class SellerCardKt {

    /* renamed from: lambda$-231248476, reason: not valid java name */
    public static final ComposableLambdaImpl f752lambda$231248476 = new ComposableLambdaImpl(new Hero3DCardViewKt$$ExternalSyntheticLambda11(9), false, -231248476);
    public static final ComposableLambdaImpl lambda$1598679778 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(7), false, 1598679778);
    public static final ComposableLambdaImpl lambda$1396414312 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(0), false, 1396414312);

    /* renamed from: lambda$-1909908703, reason: not valid java name */
    public static final ComposableLambdaImpl f750lambda$1909908703 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(16), false, -1909908703);

    /* renamed from: lambda$-973799356, reason: not valid java name */
    public static final ComposableLambdaImpl f755lambda$973799356 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(17), false, -973799356);
    public static final ComposableLambdaImpl lambda$417272805 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(18), false, 417272805);

    /* renamed from: lambda$-537779040, reason: not valid java name */
    public static final ComposableLambdaImpl f753lambda$537779040 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(19), false, -537779040);
    public static final ComposableLambdaImpl lambda$528145231 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(20), false, 528145231);

    /* renamed from: lambda$-624248543, reason: not valid java name */
    public static final ComposableLambdaImpl f754lambda$624248543 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(21), false, -624248543);

    /* renamed from: lambda$-2133175820, reason: not valid java name */
    public static final ComposableLambdaImpl f751lambda$2133175820 = new ComposableLambdaImpl(new ComposableSingletons$WorkViewFactoryKt$$ExternalSyntheticLambda0(22), false, -2133175820);

    /* renamed from: ArtworkSellerCard-0uFHTRA, reason: not valid java name */
    public static final void m3803ArtworkSellerCard0uFHTRA(final String str, final Color color, final Color color2, final float f, final float f2, final float f3, final Shape shape, final Modifier modifier, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer;
        int i3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1755941368);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(color) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(color2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(f2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(f3) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changed(shape) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier clip = ClipKt.clip(SizeKt.m287sizeVpY3zN4(modifier, f, f2), shape);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (color != null) {
                color.getClass();
                i3 = i2;
                clip = clip.then(ImageKt.m177backgroundbw27NRU(companion, color.value, ColorKt.RectangleShape));
            } else {
                i3 = i2;
            }
            if (color2 != null) {
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 0.17f);
                color2.getClass();
                clip = clip.then(ImageKt.m178borderxT4_qwU(m298padding3ABfNKs, 0.34f, color2.value, shape));
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, clip);
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
            AsyncImageKt.m1438AsyncImage10Xjiaw(str, null, SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxSize(companion, 1.0f), f3), null, ContentScale.Companion.Fit, null, gapComposer2, (i3 & 14) | 1572912, 1976);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.work.views.SellerCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SellerCardKt.m3803ArtworkSellerCard0uFHTRA(str, color, color2, f, f2, f3, shape, modifier, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void CalendarDayCell(Modifier modifier, LocalDate localDate, boolean z, boolean z2, Set set, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        long j;
        boolean z3;
        ?? r5;
        int i2;
        long j2;
        boolean z4;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1398281957);
        Applier applier = gapComposer2.applier;
        int i3 = (i & 6) == 0 ? (gapComposer2.changed(modifier) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(localDate) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changedInstance(set) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 131072 : 65536;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            gapComposer2.startReplaceGroup(-575791973);
            Modifier clip = ClipKt.clip(SpacerKt.m299paddingVpY3zN4(modifier, 2.0f, 2.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            int i4 = i3;
            if (z2) {
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                clip = clip.then(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.subtle, rectangleShapeKt$RectangleShape$1));
            }
            Modifier modifier2 = clip;
            gapComposer2.end(false);
            boolean changedInstance = ((i4 & 458752) == 131072) | gapComposer2.changedInstance(localDate);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ScheduleCalendarKt$$ExternalSyntheticLambda4(function1, localDate, 0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m183clickableoSLSa3U$default(modifier2, false, null, null, (Function0) rememberedValue, 15), RecyclerView.DECELERATION_RATE, 8.0f, 1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
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
            if (z) {
                gapComposer2.startReplaceGroup(-220525406);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors2.semantic.text.standard;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-220591932);
                Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    z4 = false;
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    z4 = false;
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                long j3 = colors3.semantic.text.subtle;
                gapComposer2.end(z4);
                j = j3;
            }
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, j, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, String.valueOf(DimensionKt.getSafeDayOfMonth(localDate)), (Map) null, (Function1) null, false);
            GapComposer gapComposer3 = gapComposer2;
            SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion, 4.0f));
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer3, 54);
            int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, companion);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            if (set.isEmpty()) {
                gapComposer3.startReplaceGroup(-874804108);
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(companion, 4.0f), Color.Transparent, rectangleShapeKt$RectangleShape$1), gapComposer3, 6);
                gapComposer3.end(false);
                z3 = true;
            } else {
                gapComposer3.startReplaceGroup(-874650348);
                int i5 = 0;
                for (Object obj : CollectionsKt.sorted(set)) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    int ordinal = ((ScheduleCalendarDot) obj).ordinal();
                    if (ordinal != 0) {
                        i2 = 1;
                        if (ordinal != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, 1262288585, false);
                        }
                        gapComposer3.startReplaceGroup(1262294180);
                        Colors colors4 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        r5 = 0;
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        j2 = colors4.semantic.text.standard;
                        gapComposer3.end(false);
                    } else {
                        r5 = 0;
                        i2 = 1;
                        gapComposer3.startReplaceGroup(1262291427);
                        Colors colors5 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors5 == null) {
                            colors5 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(false);
                        }
                        j2 = colors5.semantic.background.warning;
                        gapComposer3.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 4.0f), RoundedCornerShapeKt.CircleShape), j2, rectangleShapeKt$RectangleShape$1), gapComposer3, r5);
                    if (i5 < set.size() - i2) {
                        gapComposer3.startReplaceGroup(476565601);
                        SpacerKt.Spacer(gapComposer3, SizeKt.m290width3ABfNKs(companion, 2.0f));
                        gapComposer3.end(r5);
                    } else {
                        gapComposer3.startReplaceGroup(476631910);
                        gapComposer3.end(r5);
                    }
                    i5 = i6;
                }
                z3 = true;
                gapComposer3.end(false);
            }
            Boxes$$ExternalSyntheticOutline1.m(gapComposer3, z3, z3, z3);
            gapComposer = gapComposer3;
        } else {
            GapComposer gapComposer4 = gapComposer2;
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScheduleCalendarKt$$ExternalSyntheticLambda5(modifier, localDate, z, z2, set, function1, i);
        }
    }

    /* renamed from: ColoredInitialsSellerCard-v0ffE4w, reason: not valid java name */
    public static final void m3804ColoredInitialsSellerCardv0ffE4w(final String str, final long j, final long j2, final Color color, SellerCardSize sellerCardSize, final float f, final float f2, final Shape shape, final Modifier modifier, Composer composer, final int i) {
        int i2;
        final SellerCardSize sellerCardSize2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-44002654);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(j) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(color) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(sellerCardSize.ordinal()) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(f) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changed(f2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changed(shape) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 67108864 : 33554432;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            sellerCardSize2 = sellerCardSize;
            TextStyle textStyle = textStyle(sellerCardSize2, gapComposer2);
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(ClipKt.clip(modifier, shape), f, f2), j, ColorKt.RectangleShape);
            if (color != null) {
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 0.17f);
                color.getClass();
                m177backgroundbw27NRU = m177backgroundbw27NRU.then(ImageKt.m178borderxT4_qwU(m298padding3ABfNKs, 0.34f, color.value, shape));
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 & 14) | ((i2 << 3) & 7168), 0, 4082, j2, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            sellerCardSize2 = sellerCardSize;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.work.views.SellerCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SellerCardKt.m3804ColoredInitialsSellerCardv0ffE4w(str, j, j2, color, sellerCardSize2, f, f2, shape, modifier, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void DisabledClickableButtonCta(boolean z, final int i, Function0 function0, Modifier modifier, ButtonProminence buttonProminence, boolean z2, Function0 function02, String str, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        final boolean z3;
        int i5;
        String str2;
        int i6;
        ButtonProminence buttonProminence2;
        boolean z4;
        boolean z5;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-50595454);
        int i7 = i2 | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changed(i) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        int i8 = i3 & 8;
        if (i8 != 0) {
            i4 = i7 | 3072;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i4 = i7 | (gapComposer.changed(modifier2) ? 2048 : 1024);
        }
        int i9 = i4 | 24576;
        int i10 = i3 & 32;
        if (i10 != 0) {
            i5 = i4 | 221184;
            z3 = z2;
        } else {
            z3 = z2;
            i5 = i9 | (gapComposer.changed(z3) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i11 = i5 | (gapComposer.changedInstance(function02) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        int i12 = i3 & 128;
        if (i12 != 0) {
            i6 = i11 | 12582912;
            str2 = str;
        } else {
            str2 = str;
            i6 = i11 | (gapComposer.changed(str2) ? 8388608 : 4194304);
        }
        int i13 = i6;
        if (gapComposer.shouldExecute(i13 & 1, (i13 & 4793491) != 4793490)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier modifier3 = i8 != 0 ? companion : modifier2;
            ButtonProminence buttonProminence3 = ButtonProminence.PROMINENT;
            if (i10 != 0) {
                z3 = false;
            }
            if (i12 != 0) {
                str2 = null;
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            String str3 = str2;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier3);
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
            gapComposer.startReplaceGroup(2078864261);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || str3 == null) {
                str2 = str3;
                z5 = false;
                gapComposer.startReplaceGroup(543499830);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-331460291);
                boolean z6 = (i13 & 29360128) == 8388608;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z6 || rememberedValue == neverEqualPolicy) {
                    str2 = str3;
                    rememberedValue = new StateBindingsKt$$ExternalSyntheticLambda0(str2, 12);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    str2 = str3;
                }
                z5 = false;
                fillMaxWidth = SemanticsModifierKt.semantics(fillMaxWidth, false, (Function1) rememberedValue);
                gapComposer.end(false);
            }
            gapComposer.end(z5);
            boolean z7 = z3;
            coil3.size.SizeKt.ButtonCta(function0, fillMaxWidth, buttonProminence3, false, z, null, Expect_jvmKt.rememberComposableLambda(1720155447, new Function3() { // from class: com.squareup.cash.work.views.DisabledClickableButtonCtaKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((RowScope) obj).getClass();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (!gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                        gapComposer2.skipToGroupEnd();
                    } else if (z3) {
                        gapComposer2.startReplaceGroup(1896142391);
                        TextStyle textStyle = (TextStyle) gapComposer2.consume(ArcadeThemeKt.LocalTextStyle);
                        if (textStyle == null) {
                            gapComposer2.startReplaceGroup(-1100573765);
                            textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        } else {
                            gapComposer2.startReplaceGroup(-1100574912);
                        }
                        gapComposer2.end(false);
                        ProgressCircularKt.ProgressCircular(0, 0, gapComposer2, ScaledSizeKt.m3994scaleHeightToTextHeightr9BaKPg(Modifier.Companion.$$INSTANCE, textStyle.paragraphStyle.lineHeight, gapComposer2));
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1896292338);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, i), (Map) null, (Function1) null, false);
                        gapComposer2.end(false);
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, ((i13 << 12) & 57344) | ((i13 >> 6) & 14) | 1573248, 40);
            if (z || z7 || function02 == null) {
                gapComposer.startReplaceGroup(21025382);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(20827416);
                Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new StripePaymentController$$ExternalSyntheticLambda1(2);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(matchParentSize, (Function1) rememberedValue2);
                boolean z8 = (i13 & 3670016) == 1048576;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z8 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(4, function02);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                BoxKt.Box(SuspendingPointerInputFilterKt.pointerInput(clearAndSetSemantics, function02, (PointerInputEventHandler) rememberedValue3), gapComposer, 0);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            buttonProminence2 = buttonProminence3;
            modifier2 = modifier3;
            z4 = z7;
        } else {
            gapComposer.skipToGroupEnd();
            buttonProminence2 = buttonProminence;
            z4 = z3;
        }
        String str4 = str2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AccountAvatarKt$$ExternalSyntheticLambda2(z, i, function0, modifier2, buttonProminence2, z4, function02, str4, i2, i3);
        }
    }

    /* renamed from: FallbackSellerCard-1yyLQnY, reason: not valid java name */
    public static final void m3805FallbackSellerCard1yyLQnY(String str, SellerCardSize sellerCardSize, float f, float f2, Shape shape, Modifier modifier, Composer composer, int i) {
        String str2;
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(482126580);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (gapComposer2.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(sellerCardSize.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(shape) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            TextStyle textStyle = textStyle(sellerCardSize, gapComposer2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Colors.Semantic.Icon icon = colors.semantic.icon;
            Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors2.isLight ? icon.standard : icon.inverse;
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(ClipKt.clip(modifier, shape), f, f2), icon.brand, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, j, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SellerCardKt$$ExternalSyntheticLambda3(str, sellerCardSize, f, f2, shape, modifier, i);
        }
    }

    public static final void OverflowCountCard(String str, SellerCardSize sellerCardSize, Modifier modifier, Composer composer, int i) {
        SellerCardShape sellerCardShape = SellerCardShape.Circle;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1213565991);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(sellerCardSize.ordinal()) ? 32 : 16) | (gapComposer.changed(1) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            float f = sellerCardSize.width;
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(SizeKt.m287sizeVpY3zN4(ClipKt.clip(modifier, roundedCornerShape), f, 1.0f * f), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), 0.17f), 0.34f, Strings.getColors(gapComposer).semantic.border.subtle, roundedCornerShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0(str, sellerCardSize, modifier, i);
        }
    }

    public static final void OverlappingSellerCards(int i, Composer composer, Modifier modifier, List list) {
        Modifier modifier2;
        SellerCardShape sellerCardShape = SellerCardShape.Circle;
        SellerCardSize sellerCardSize = SellerCardSize.Large;
        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-218068296);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int size = list.size();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (size == 0) {
                modifier2 = companion;
                gapComposer.startReplaceGroup(889772476);
                gapComposer.end(false);
            } else if (size != 1) {
                if (size != 2) {
                    gapComposer.startReplaceGroup(1813818751);
                    String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size() - 1, Marker.ANY_NON_NULL_MARKER);
                    RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
                    gapComposer.startReplaceGroup(1591670467);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(-(64.0f / 3.0f), true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    SellerCardViewModel sellerCardViewModel = (SellerCardViewModel) CollectionsKt.first(list);
                    RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                    SellerCard(sellerCardViewModel, realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 3.0f), sellerCardSize, sellerCardShape, gapComposer, 0, 0);
                    OverflowCountCard(m, sellerCardSize, realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 3.0f), gapComposer, 0);
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, false, false);
                } else {
                    gapComposer.startReplaceGroup(1813266641);
                    RealWeakMemoryCache realWeakMemoryCache2 = new RealWeakMemoryCache(1);
                    gapComposer.startReplaceGroup(-678674171);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(-(64.0f / 3.0f), true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer, 48);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
                    Updater.m576setimpl(gapComposer, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    gapComposer.startReplaceGroup(-671394458);
                    Iterator it = CollectionsKt.take(list, 2).iterator();
                    while (it.hasNext()) {
                        SellerCard((SellerCardViewModel) it.next(), realWeakMemoryCache2.m1459clippedOutlinewH6b6FI(companion, RoundedCornerShapeKt.CircleShape, 3.0f), sellerCardSize, sellerCardShape, gapComposer, 0, 0);
                    }
                    gapComposer.end(false);
                    gapComposer.end(true);
                    gapComposer.end(false);
                    gapComposer.end(false);
                }
                modifier2 = companion;
            } else {
                gapComposer.startReplaceGroup(889773003);
                modifier2 = companion;
                SellerCard((SellerCardViewModel) CollectionsKt.first(list), modifier2, sellerCardSize, sellerCardShape, gapComposer, 3504, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(list, modifier2, i, 12);
        }
    }

    public static final void ScheduleCalendar(ScheduleCalendarViewModel scheduleCalendarViewModel, Function1 function1, Function1 function12, Composer composer, int i) {
        Function1 function13;
        int i2;
        DayOfWeek dayOfWeek = scheduleCalendarViewModel.firstDayOfWeek;
        BiasAlignment.Vertical vertical = Alignment.Companion.Top;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1377618986);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(scheduleCalendarViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Locale locale = ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).getLocales().get(0);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            gapComposer.startReplaceGroup(-2075258850);
            for (int i4 = 0; i4 < 7; i4++) {
                String displayName = dayOfWeek.plus(i4).getDisplayName(java.time.format.TextStyle.NARROW, locale);
                displayName.getClass();
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelXSmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) layoutWeightElement, textStyle, (TextLineBalancing) null, displayName, (Map) null, (Function1) null, false);
            }
            gapComposer.end(false);
            gapComposer.end(true);
            boolean z = scheduleCalendarViewModel.isExpanded;
            YearMonth yearMonth = scheduleCalendarViewModel.viewedMonth;
            if (z) {
                gapComposer.startReplaceGroup(1596544457);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    gapComposer.updateRememberedValue(yearMonth);
                    rememberedValue = yearMonth;
                }
                YearMonth yearMonth2 = (YearMonth) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = 1073741823;
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                int intValue = ((Number) rememberedValue2).intValue();
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new MotionKt$$ExternalSyntheticLambda0(20);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(intValue, (Function0) rememberedValue3, gapComposer, 390, 2);
                boolean changedInstance = gapComposer.changedInstance(yearMonth2) | gapComposer.changedInstance(scheduleCalendarViewModel) | gapComposer.changed(rememberPagerState);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                    GovernmentIdFeed$analyze$5 governmentIdFeed$analyze$5 = new GovernmentIdFeed$analyze$5(scheduleCalendarViewModel, rememberPagerState, intValue, yearMonth2, (Continuation) null, 10);
                    i2 = intValue;
                    gapComposer.updateRememberedValue(governmentIdFeed$analyze$5);
                    rememberedValue4 = governmentIdFeed$analyze$5;
                } else {
                    i2 = intValue;
                }
                Updater.LaunchedEffect(gapComposer, yearMonth, (Function2) rememberedValue4);
                function13 = function12;
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(function13, gapComposer);
                boolean changed = gapComposer.changed(rememberPagerState) | gapComposer.changedInstance(yearMonth2) | gapComposer.changed(rememberUpdatedState);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed || rememberedValue5 == neverEqualPolicy) {
                    GovernmentIdFeed$analyze$5 governmentIdFeed$analyze$52 = new GovernmentIdFeed$analyze$5(rememberPagerState, yearMonth2, i2, rememberUpdatedState, (Continuation) null, 11);
                    gapComposer.updateRememberedValue(governmentIdFeed$analyze$52);
                    rememberedValue5 = governmentIdFeed$analyze$52;
                }
                Updater.LaunchedEffect(gapComposer, rememberPagerState, (Function2) rememberedValue5);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(255248881, new ScheduleCalendarKt$$ExternalSyntheticLambda0(scheduleCalendarViewModel, function1, yearMonth2, i2, 0), gapComposer);
                gapComposer = gapComposer;
                PagerKt.m328HorizontalPager8jOkeI(rememberPagerState, fillMaxWidth2, null, null, 0, 24.0f, vertical, null, false, null, null, null, rememberComposableLambda, gapComposer, 1769520, 24576, 16284);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1596227017);
                LocalDate minusDays = scheduleCalendarViewModel.selectedDate.minusDays(((r2.getDayOfWeek().getValue() - dayOfWeek.getValue()) + 7) % 7);
                minusDays.getClass();
                ScheduleCalendarWeekRow(minusDays, scheduleCalendarViewModel, null, function1, gapComposer, ((i3 << 3) & 112) | MLKEMEngine.KyberPolyBytes | ((i3 << 6) & 7168));
                gapComposer.end(false);
                function13 = function12;
            }
            gapComposer.end(true);
        } else {
            function13 = function12;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) scheduleCalendarViewModel, (Object) function1, (Object) function13, i, 2);
        }
    }

    public static final void ScheduleCalendarMonthGrid(YearMonth yearMonth, ScheduleCalendarViewModel scheduleCalendarViewModel, Function1 function1, Composer composer, int i) {
        YearMonth yearMonth2 = yearMonth;
        ScheduleCalendarViewModel scheduleCalendarViewModel2 = scheduleCalendarViewModel;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1146361676);
        Function1 function12 = function1;
        int i2 = i | (gapComposer.changedInstance(yearMonth2) ? 4 : 2) | (gapComposer.changedInstance(scheduleCalendarViewModel2) ? 32 : 16) | (gapComposer.changedInstance(function12) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DayOfWeek dayOfWeek = scheduleCalendarViewModel2.firstDayOfWeek;
            LocalDate atDay = yearMonth2.atDay(1);
            atDay.getClass();
            LocalDate minusDays = atDay.minusDays(((atDay.getDayOfWeek().getValue() - dayOfWeek.getValue()) + 7) % 7);
            minusDays.getClass();
            int lengthOfMonth = yearMonth2.lengthOfMonth();
            LocalDate atDay2 = yearMonth2.atDay(1);
            atDay2.getClass();
            int between = ((lengthOfMonth + ((int) ChronoUnit.DAYS.between(minusDays, atDay2))) + 6) / 7;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
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
            gapComposer.startReplaceGroup(1880257742);
            int i3 = 0;
            while (i3 < between) {
                LocalDate plusDays = minusDays.plusDays(i3 * 7);
                plusDays.getClass();
                ScheduleCalendarWeekRow(plusDays, scheduleCalendarViewModel2, yearMonth2, function12, gapComposer, (i2 & 112) | ((i2 << 6) & 896) | ((i2 << 3) & 7168));
                i3++;
                yearMonth2 = yearMonth;
                scheduleCalendarViewModel2 = scheduleCalendarViewModel;
                function12 = function1;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) yearMonth, (Object) scheduleCalendarViewModel, (Object) function1, i, 3);
        }
    }

    public static final void ScheduleCalendarWeekRow(LocalDate localDate, ScheduleCalendarViewModel scheduleCalendarViewModel, YearMonth yearMonth, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1570633887);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(localDate) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(scheduleCalendarViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(yearMonth) ? 256 : 128;
        }
        Function1 function12 = function1;
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-2042709896);
            int i3 = 0;
            while (i3 < 7) {
                LocalDate plusDays = localDate.plusDays(i3);
                boolean z = yearMonth == null || Intrinsics.areEqual(YearMonth.from(plusDays), yearMonth);
                int i4 = i3;
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                plusDays.getClass();
                boolean equals = plusDays.equals(scheduleCalendarViewModel.today);
                Set set = (Set) scheduleCalendarViewModel.dots.get(plusDays);
                if (set == null) {
                    set = EmptySet.INSTANCE;
                }
                CalendarDayCell(layoutWeightElement, plusDays, z, equals, set, function12, gapComposer, (i2 << 6) & 458752);
                i3 = i4 + 1;
                function12 = function1;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertBannerKt$$ExternalSyntheticLambda1(localDate, i, scheduleCalendarViewModel, yearMonth, function1, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SellerCard(SellerCardViewModel sellerCardViewModel, Modifier modifier, SellerCardSize sellerCardSize, SellerCardShape sellerCardShape, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        SellerCardShape sellerCardShape2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        RoundedCornerShape m340RoundedCornerShape0680j_4;
        int i5;
        String str;
        String str2;
        String str3;
        String str4;
        SellerCardShape sellerCardShape3;
        sellerCardViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1572822185);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(sellerCardViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changed(sellerCardSize.ordinal()) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= gapComposer.changed(sellerCardShape == null ? -1 : sellerCardShape.ordinal()) ? 2048 : 1024;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                sellerCardShape2 = sellerCardShape;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                SellerCardShape sellerCardShape4 = i4 != 0 ? SellerCardShape.Circle : sellerCardShape;
                int ordinal = sellerCardShape4.ordinal();
                if (ordinal == 0) {
                    m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(sellerCardSize.cornerRadius);
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.CircleShape;
                }
                RoundedCornerShape roundedCornerShape = m340RoundedCornerShape0680j_4;
                float f = sellerCardSize.width;
                float f2 = sellerCardShape4.heightRatio * f;
                String str5 = sellerCardViewModel.initials;
                String str6 = sellerCardViewModel.outlineLightHex;
                String str7 = sellerCardViewModel.foregroundLightHex;
                String str8 = sellerCardViewModel.backgroundLightHex;
                String str9 = sellerCardViewModel.artworkLightUrl;
                String take = StringsKt___StringsKt.take(1, str5);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    i5 = i3;
                } else {
                    i5 = i3;
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                boolean z = colors.isLight;
                boolean changed = gapComposer.changed(sellerCardViewModel) | gapComposer.changed(z);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    if (!z && (str = sellerCardViewModel.artworkDarkUrl) != null) {
                        if (StringsKt.isBlank(str)) {
                            str = null;
                        }
                        if (str != null) {
                            str9 = str;
                        }
                    }
                    gapComposer.updateRememberedValue(str9);
                    rememberedValue = str9;
                }
                String str10 = (String) rememberedValue;
                boolean changed2 = gapComposer.changed(sellerCardViewModel) | gapComposer.changed(z);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy) {
                    if (!z && (str2 = sellerCardViewModel.backgroundDarkHex) != null) {
                        if (StringsKt.isBlank(str2)) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            str8 = str2;
                        }
                    }
                    rememberedValue2 = str8 != null ? parseHexColor(str8) : null;
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Color color = (Color) rememberedValue2;
                boolean changed3 = gapComposer.changed(sellerCardViewModel) | gapComposer.changed(z);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue3 == neverEqualPolicy) {
                    if (!z && (str3 = sellerCardViewModel.foregroundDarkHex) != null) {
                        if (StringsKt.isBlank(str3)) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            str7 = str3;
                        }
                    }
                    rememberedValue3 = str7 != null ? parseHexColor(str7) : null;
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Color color2 = (Color) rememberedValue3;
                boolean changed4 = gapComposer.changed(sellerCardViewModel) | gapComposer.changed(z);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed4 || rememberedValue4 == neverEqualPolicy) {
                    if (!z && (str4 = sellerCardViewModel.outlineDarkHex) != null) {
                        if (StringsKt.isBlank(str4)) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            str6 = str4;
                        }
                    }
                    Color parseHexColor = str6 != null ? parseHexColor(str6) : null;
                    gapComposer.updateRememberedValue(parseHexColor);
                    rememberedValue4 = parseHexColor;
                }
                Color color3 = (Color) rememberedValue4;
                if (str10 != null) {
                    gapComposer.startReplaceGroup(-2146548665);
                    m3803ArtworkSellerCard0uFHTRA(str10, color, color3, f, f2, sellerCardSize.padding, roundedCornerShape, modifier4, gapComposer, (i5 << 18) & 29360128);
                    gapComposer.end(false);
                    sellerCardShape3 = sellerCardShape4;
                } else if (color != null) {
                    gapComposer.startReplaceGroup(-2146225490);
                    Modifier modifier5 = modifier4;
                    sellerCardShape3 = sellerCardShape4;
                    m3804ColoredInitialsSellerCardv0ffE4w(take, color.value, color2 != null ? color2.value : Color.White, color3, sellerCardSize, f, f2, roundedCornerShape, modifier5, gapComposer, (57344 & (i5 << 6)) | ((i5 << 21) & 234881024));
                    modifier4 = modifier5;
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else {
                    sellerCardShape3 = sellerCardShape4;
                    gapComposer.startReplaceGroup(-2145870881);
                    m3805FallbackSellerCard1yyLQnY(take, sellerCardSize, f, f2, roundedCornerShape, modifier4, gapComposer, ((i5 >> 3) & 112) | ((i5 << 12) & 458752));
                    gapComposer.end(false);
                }
                sellerCardShape2 = sellerCardShape3;
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(sellerCardViewModel, modifier3, sellerCardSize, sellerCardShape2, i, i2, 25);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void WorkHomeView(WorkHomeViewModel workHomeViewModel, Function1 function1, Composer composer, int i) {
        workHomeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(935436894);
        int i2 = (gapComposer.changedInstance(workHomeViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(702807849, new WorkHomeViewKt$$ExternalSyntheticLambda0(workHomeViewModel, function1, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(workHomeViewModel, function1, i, 1);
        }
    }

    public static final void WorkTitleBarView(WorkHomeTitleBarViewModel workHomeTitleBarViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-428909855);
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(workHomeTitleBarViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.work_views_shift_list_action_label);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PayHomeViewKt$$ExternalSyntheticLambda2(6, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(310647270, new BufferedChannel$$ExternalSyntheticLambda4(i2, stringResource, function1, workHomeTitleBarViewModel), gapComposer), gapComposer, 1572918, 44);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda12(workHomeTitleBarViewModel, function1, i, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Color parseHexColor(String str) {
        Integer valueOf;
        String m = (str.length() == 9 && StringsKt.startsWith$default(str, '#')) ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("#", str.substring(7, 9), str.substring(1, 7)) : str;
        if (!StringsKt.isBlank(m)) {
            try {
                valueOf = Integer.valueOf(com.squareup.util.android.StringsKt.strictParseColor(m));
            } catch (IllegalArgumentException e) {
                Timber.Forest.w("Failed to parse color: ".concat(str), new Object[0], new IllegalArgumentException(Recorder$$ExternalSyntheticOutline2.m("Unknown color: ", m), e));
            }
            if (valueOf == null) {
                return new Color(ColorKt.Color(valueOf.intValue()));
            }
            return null;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static final TextStyle textStyle(SellerCardSize sellerCardSize, Composer composer) {
        int ordinal = sellerCardSize.ordinal();
        if (ordinal == 0) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(219467757);
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelXSmall;
            gapComposer.end(false);
            return textStyle;
        }
        if (ordinal == 1) {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(219469772);
            TextStyle textStyle2 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
            gapComposer2.end(false);
            return textStyle2;
        }
        if (ordinal == 2) {
            GapComposer gapComposer3 = (GapComposer) composer;
            gapComposer3.startReplaceGroup(219471789);
            TextStyle textStyle3 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            gapComposer3.end(false);
            return textStyle3;
        }
        if (ordinal == 3) {
            GapComposer gapComposer4 = (GapComposer) composer;
            gapComposer4.startReplaceGroup(219473807);
            TextStyle textStyle4 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).headlineSmall;
            gapComposer4.end(false);
            return textStyle4;
        }
        if (ordinal != 4) {
            throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer, 219466021, false);
        }
        GapComposer gapComposer5 = (GapComposer) composer;
        gapComposer5.startReplaceGroup(219476588);
        TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).headlineLarge, 0L, Room.getSp(60), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(60), null, null, 0, 16646141);
        gapComposer5.end(false);
        return m994copyp1EtxEg$default;
    }
}
