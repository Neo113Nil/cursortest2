package com.squareup.cash.work.views.shift;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.OutlinedTextFieldKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputAreaKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda18;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.shopping.views.ActionPillKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda32;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.work.viewmodels.FilterSelectionMode;
import com.squareup.cash.work.viewmodels.ScheduleCalendarViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftFilterType;
import com.squareup.cash.work.viewmodels.ShiftFilterViewModel;
import com.squareup.cash.work.viewmodels.ShiftListDayViewModel;
import com.squareup.cash.work.viewmodels.ShiftListScheduleViewModel;
import com.squareup.cash.work.viewmodels.ShiftListTimecardViewModel;
import com.squareup.cash.work.viewmodels.ShiftListViewModel;
import com.squareup.cash.work.viewmodels.ShiftNoteViewModel;
import com.squareup.cash.work.views.SellerCardKt;
import com.squareup.cash.work.views.SellerCardShape;
import com.squareup.cash.work.views.SellerCardSize;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda9;
import com.squareup.cash.work.views.pay.PayCellViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda19;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import com.squareup.util.android.ViewGroups$$ExternalSyntheticLambda0;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4;
import com.stripe.android.cards.DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.channels.BufferedChannel$$ExternalSyntheticLambda4;
import radiography.Radiography$$ExternalSyntheticLambda1;

/* loaded from: classes7.dex */
public abstract class ShiftListViewKt {

    /* renamed from: lambda$-1140103375, reason: not valid java name */
    public static final ComposableLambdaImpl f781lambda$1140103375;

    /* renamed from: lambda$-1363358327, reason: not valid java name */
    public static final ComposableLambdaImpl f782lambda$1363358327;

    /* renamed from: lambda$-1369447482, reason: not valid java name */
    public static final ComposableLambdaImpl f783lambda$1369447482;

    /* renamed from: lambda$-1930688450, reason: not valid java name */
    public static final ComposableLambdaImpl f784lambda$1930688450;

    /* renamed from: lambda$-444520987, reason: not valid java name */
    public static final ComposableLambdaImpl f785lambda$444520987;

    /* renamed from: lambda$-563747728, reason: not valid java name */
    public static final ComposableLambdaImpl f786lambda$563747728;

    /* renamed from: lambda$-622504687, reason: not valid java name */
    public static final ComposableLambdaImpl f787lambda$622504687;

    /* renamed from: lambda$-625849483, reason: not valid java name */
    public static final ComposableLambdaImpl f788lambda$625849483;
    public static final ComposableLambdaImpl lambda$2076860317;
    public static final ComposableLambdaImpl lambda$572887105;
    public static final ComposableLambdaImpl lambda$742374720;
    public static final ComposableLambdaImpl lambda$1193818120 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(3), false, 1193818120);
    public static final ComposableLambdaImpl lambda$605600084 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(4), false, 605600084);

    static {
        new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(5), false, 164070113);
        f782lambda$1363358327 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(25), false, -1363358327);
        f785lambda$444520987 = new ComposableLambdaImpl(new PayHomeViewKt$$ExternalSyntheticLambda19(26), false, -444520987);
        f784lambda$1930688450 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(6), false, -1930688450);
        f787lambda$622504687 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(7), false, -622504687);
        lambda$572887105 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(8), false, 572887105);
        f786lambda$563747728 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(9), false, -563747728);
        f788lambda$625849483 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(10), false, -625849483);
        f781lambda$1140103375 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(11), false, -1140103375);
        lambda$2076860317 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(12), false, 2076860317);
        f783lambda$1369447482 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(13), false, -1369447482);
        lambda$742374720 = new ComposableLambdaImpl(new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(14), false, 742374720);
    }

    public static final void AuthorAvatar(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(446434896);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            AvatarSize avatarSize = AvatarSize.Size48;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors.semantic.icon.standard, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.Avatar32, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 199734, 0, 2000);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayHomeViewKt$$ExternalSyntheticLambda19(i, 27);
        }
    }

    public static final void DeleteConfirmationDialog(Function0 function0, Function0 function02, Composer composer, int i) {
        int i2;
        Function0 function03;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-467336564);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function03 = function02;
            ModalKt.Dimmer(null, function03, null, Expect_jvmKt.rememberComposableLambda(-1262079821, new ShiftNoteViewKt$$ExternalSyntheticLambda9(function0, function02, i3), gapComposer), gapComposer, 3120, 5);
        } else {
            function03 = function02;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftNoteViewKt$$ExternalSyntheticLambda10(function0, function03, i, 0);
        }
    }

    public static final void MinimalTitleBar(Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1925529004);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            function02 = function0;
            DBUtil.TitleBarSub((String) null, NavigationType.BACK, (Modifier) null, (DynamicColorConfiguration) null, function02, (Modifier) null, (Function3) null, gapComposer, ((i2 << 12) & 57344) | 54, 108);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda8(function02, i, i3);
        }
    }

    public static final void NoteButtonSection(boolean z, boolean z2, LoadingAction loadingAction, Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-187528569);
        int i2 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changed(z2) ? 32 : 16) | (gapComposer.changed(loadingAction == null ? -1 : loadingAction.ordinal()) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-455743095, new MainPaymentViewKt$$ExternalSyntheticLambda18(z2, loadingAction != null, function0, z, function02, loadingAction), gapComposer), gapComposer, 24576, 15);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldKt$$ExternalSyntheticLambda4(z, z2, loadingAction, function0, function02, i, 3);
        }
    }

    public static final void NoteInputSection(TextFieldState textFieldState, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(851182956);
        int i2 = i | (gapComposer.changed(textFieldState) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            InputAreaKt.InputArea(textFieldState, SizeKt.fillMaxWidth(modifier, 1.0f), false, false, false, f785lambda$444520987, null, Room.stringResource(gapComposer, R.string.work_views_shift_note_input_placeholder), null, null, new TextFieldLineLimits.MultiLine(4, 8), null, null, null, null, gapComposer, (i2 & 14) | 196608, 6, 31580);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(textFieldState, modifier, i, 10);
        }
    }

    public static final void SellerCardWithOptionalCheck(SellerCardViewModel sellerCardViewModel, boolean z, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(102734004);
        Applier applier = gapComposer2.applier;
        int i2 = (gapComposer2.changedInstance(sellerCardViewModel) ? 4 : 2) | i | (gapComposer2.changed(z) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            gapComposer = gapComposer2;
            SellerCardKt.SellerCard(sellerCardViewModel, null, SellerCardSize.Medium, SellerCardShape.Circle, gapComposer, (i2 & 14) | 3456, 2);
            if (z) {
                gapComposer.startReplaceGroup(-429373777);
                Modifier m272offsetVpY3zN4 = OffsetKt.m272offsetVpY3zN4(SizeKt.m285size3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomEnd), 25.0f), 8.0f, 8.0f);
                long j = Strings.getColors(gapComposer).semantic.background.f1047app;
                RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(ImageKt.m178borderxT4_qwU(m272offsetVpY3zN4, 2.0f, j, roundedCornerShape), roundedCornerShape), Strings.getColors(gapComposer).semantic.background.subtle, ColorKt.RectangleShape);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
                z2 = true;
                Trace.m1191Iconww6aTOc(Icons.Check16, (String) null, SpacerKt.m298padding3ABfNKs(companion, 5.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 438, 0);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                z2 = true;
                gapComposer.startReplaceGroup(-428723180);
                gapComposer.end(false);
            }
            gapComposer.end(z2);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderDefaults$$ExternalSyntheticLambda0(sellerCardViewModel, z, i, 12);
        }
    }

    public static final void ShiftListContent(ImmutableList immutableList, LocalDate localDate, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        immutableList.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(4692056);
        int i2 = i | (gapComposer2.changedInstance(immutableList) ? 4 : 2) | (gapComposer2.changedInstance(localDate) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | (gapComposer2.changed(modifier) ? 2048 : 1024);
        int i3 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            LazyListState rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            boolean changedInstance = gapComposer2.changedInstance(immutableList) | gapComposer2.changedInstance(localDate) | gapComposer2.changed(rememberLazyListState);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                Object takeUntil$collectSafely$2 = new TakeUntil$collectSafely$2(immutableList, rememberLazyListState, localDate, mutableState, null, 24);
                gapComposer2.updateRememberedValue(takeUntil$collectSafely$2);
                rememberedValue2 = takeUntil$collectSafely$2;
            }
            Updater.LaunchedEffect(localDate, immutableList, (Function2) rememberedValue2, gapComposer2);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            boolean changedInstance2 = gapComposer2.changedInstance(immutableList) | ((i2 & 896) == 256);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == obj) {
                rememberedValue3 = new ShiftListContentKt$$ExternalSyntheticLambda0(immutableList, function1, i3);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            gapComposer = gapComposer2;
            LazyDslKt.LazyColumn(fillMaxWidth, rememberLazyListState, null, null, null, null, false, null, (Function1) rememberedValue3, gapComposer, 0, 508);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(immutableList, i, localDate, function1, modifier, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void ShiftListDaySection(ShiftListDayViewModel shiftListDayViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier.Companion companion;
        final ?? r1;
        ImmutableList immutableList;
        ImmutableList<ShiftListScheduleViewModel> immutableList2;
        Object obj;
        Modifier modifier;
        char c;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1216060262);
        int i2 = i | (gapComposer3.changedInstance(shiftListDayViewModel) ? 4 : 2) | (gapComposer3.changedInstance(function1) ? 32 : 16);
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Strings.getSizes(gapComposer3).getClass();
            DefaultSizes.spacing.getClass();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer3, null);
            boolean z = shiftListDayViewModel.isToday;
            ImmutableList immutableList3 = shiftListDayViewModel.timecards;
            ImmutableList immutableList4 = shiftListDayViewModel.schedules;
            if (z) {
                gapComposer3.startReplaceGroup(-274146415);
                immutableList2 = immutableList4;
                immutableList = immutableList3;
                companion = companion2;
                r1 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer3).labelSmall, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.work_views_shift_list_today), (Map) null, (Function1) null, false);
                re$$ExternalSyntheticOutline0.m(companion, 4.0f, gapComposer3, false);
            } else {
                companion = companion2;
                r1 = 0;
                immutableList = immutableList3;
                immutableList2 = immutableList4;
                gapComposer3.startReplaceGroup(-273826402);
                gapComposer3.end(false);
            }
            ViewfinderDefaults.SectionHeader(Expect_jvmKt.rememberComposableLambda(1929868957, new FieldBinding$$ExternalSyntheticLambda4(shiftListDayViewModel, 26), gapComposer3), SizeKt.fillMaxWidth(companion, 1.0f), (Function2) null, (Function0) null, (Function2) null, gapComposer3, 438, 24);
            SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion, 8.0f));
            if (immutableList2.isEmpty() && immutableList.isEmpty()) {
                gapComposer3.startReplaceGroup(-273414536);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer3).semantic.text.subtle, (Composer) gapComposer3, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer3).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.work_views_shift_list_not_scheduled), (Map) null, (Function1) null, false);
                modifier = null;
                DBUtil.SpacerWithinSectionMedium(r1, 1, gapComposer3, null);
                gapComposer3.end(r1);
                gapComposer2 = gapComposer3;
            } else {
                Object obj2 = null;
                gapComposer3.startReplaceGroup(-273066623);
                gapComposer3.startReplaceGroup(1930854266);
                Iterator<E> it = immutableList.iterator();
                GapComposer gapComposer4 = gapComposer3;
                while (true) {
                    boolean hasNext = it.hasNext();
                    obj = Composer.Companion.Empty;
                    if (!hasNext) {
                        break;
                    }
                    final ShiftListTimecardViewModel shiftListTimecardViewModel = (ShiftListTimecardViewModel) it.next();
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-278691707, new Radiography$$ExternalSyntheticLambda1(7, shiftListTimecardViewModel, shiftListDayViewModel), gapComposer4);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(946974086, new Function2() { // from class: com.squareup.cash.work.views.shift.ShiftListContentKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i3 = r1;
                            ShiftListTimecardViewModel shiftListTimecardViewModel2 = shiftListTimecardViewModel;
                            switch (i3) {
                                case 0:
                                    Composer composer2 = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, shiftListTimecardViewModel2.merchantName, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer3;
                                    if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, shiftListTimecardViewModel2.body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer4);
                    boolean changedInstance = ((i2 & 112) == 32 ? true : r1) | gapComposer4.changedInstance(shiftListTimecardViewModel);
                    Object rememberedValue = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue == obj) {
                        rememberedValue = new ListsKt$$ExternalSyntheticLambda0(19, (Object) shiftListTimecardViewModel, function1);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    final int i3 = 1;
                    Composer composer2 = gapComposer4;
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(-288965748, new Function2() { // from class: com.squareup.cash.work.views.shift.ShiftListContentKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i32 = i3;
                            ShiftListTimecardViewModel shiftListTimecardViewModel2 = shiftListTimecardViewModel;
                            switch (i32) {
                                case 0:
                                    Composer composer22 = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer22;
                                    if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, shiftListTimecardViewModel2.merchantName, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer3;
                                    if (gapComposer6.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, shiftListTimecardViewModel2.body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer4), null, null, 0L, null, composer2, 12582966, 0, 3956);
                    gapComposer4 = composer2;
                    obj2 = null;
                }
                gapComposer4.end(r1);
                GapComposer gapComposer5 = gapComposer4;
                for (final ShiftListScheduleViewModel shiftListScheduleViewModel : immutableList2) {
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1364265624, new Radiography$$ExternalSyntheticLambda1(8, shiftListScheduleViewModel, shiftListDayViewModel), gapComposer5);
                    ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(-320477655, new Function2() { // from class: com.squareup.cash.work.views.shift.ShiftListContentKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i4 = r1;
                            ShiftListScheduleViewModel shiftListScheduleViewModel2 = shiftListScheduleViewModel;
                            switch (i4) {
                                case 0:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer3;
                                    if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, shiftListScheduleViewModel2.merchantName, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer7 = (GapComposer) composer4;
                                    if (gapComposer7.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, shiftListScheduleViewModel2.body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer5);
                    boolean changedInstance2 = ((i2 & 112) == 32 ? true : r1) | gapComposer5.changedInstance(shiftListScheduleViewModel);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == obj) {
                        c = 18;
                        rememberedValue2 = new ListsKt$$ExternalSyntheticLambda0(18, (Object) shiftListScheduleViewModel, function1);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    } else {
                        c = 18;
                    }
                    final int i4 = 1;
                    GapComposer gapComposer6 = gapComposer5;
                    CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda3, rememberComposableLambda4, null, (Function0) rememberedValue2, null, false, false, Expect_jvmKt.rememberComposableLambda(1647282863, new Function2() { // from class: com.squareup.cash.work.views.shift.ShiftListContentKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i42 = i4;
                            ShiftListScheduleViewModel shiftListScheduleViewModel2 = shiftListScheduleViewModel;
                            switch (i42) {
                                case 0:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    GapComposer gapComposer62 = (GapComposer) composer3;
                                    if (gapComposer62.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer62, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, shiftListScheduleViewModel2.merchantName, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer62.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer7 = (GapComposer) composer4;
                                    if (gapComposer7.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, shiftListScheduleViewModel2.body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer5), null, null, 0L, null, gapComposer6, 12582966, 0, 3956);
                    gapComposer5 = gapComposer6;
                    obj = obj;
                }
                gapComposer5.end(r1);
                modifier = null;
                gapComposer2 = gapComposer5;
            }
            DBUtil.SpacerWithinSectionMedium(r1, 1, gapComposer2, modifier);
            ModalKt.HorizontalDivider(r1, r1, gapComposer2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
            gapComposer2.end(true);
            gapComposer = gapComposer2;
        } else {
            gapComposer3.skipToGroupEnd();
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Radiography$$ExternalSyntheticLambda1(shiftListDayViewModel, function1, i, 6);
        }
    }

    public static final void ShiftListFilterSheet(ShiftFilterViewModel shiftFilterViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        Set set;
        ShiftFilterViewModel.Section section;
        MutableState mutableState;
        List list = shiftFilterViewModel.sections;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1413777881);
        int i2 = 2;
        int i3 = i | (gapComposer2.changedInstance(shiftFilterViewModel) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i3 | (gapComposer2.changed(modifier) ? 256 : 128);
        boolean z = false;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            boolean changed = gapComposer2.changed(shiftFilterViewModel);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj = rememberedValue;
            if (changed || rememberedValue == neverEqualPolicy) {
                List<ShiftFilterViewModel.Section> list2 = list;
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
                for (ShiftFilterViewModel.Section section2 : list2) {
                    section2.getClass();
                    ShiftFilterType shiftFilterType = ShiftFilterType.LOCATION;
                    List list3 = section2.options;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list3) {
                        if (((ShiftFilterViewModel.Option) obj2).isSelected) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((ShiftFilterViewModel.Option) it.next()).id);
                    }
                    linkedHashMap.put(shiftFilterType, CollectionsKt.toSet(arrayList2));
                }
                ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(linkedHashMap);
                gapComposer2.updateRememberedValue(mutableStateOf$default);
                obj = mutableStateOf$default;
            }
            MutableState mutableState2 = (MutableState) obj;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(modifier, 1.0f), ImageKt.rememberScrollState(gapComposer2), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
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
            ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer2, R.string.work_views_shift_list_filter), (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, 0, 30);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(companion, 36.0f));
            gapComposer2.startReplaceGroup(-1895430343);
            Iterator it2 = list.iterator();
            GapComposer gapComposer3 = gapComposer2;
            while (it2.hasNext()) {
                ShiftFilterViewModel.Section section3 = (ShiftFilterViewModel.Section) it2.next();
                String str = section3.title;
                TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z);
                } else {
                    gapComposer3.startReplaceGroup(-1762997739);
                    gapComposer3.end(z);
                }
                long j = colors.semantic.text.subtle;
                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                GapComposer gapComposer4 = gapComposer3;
                int i5 = i2;
                Modifier.Companion companion2 = companion;
                boolean z2 = z;
                NeverEqualPolicy neverEqualPolicy2 = neverEqualPolicy;
                Iterator it3 = it2;
                MutableState mutableState3 = mutableState2;
                ShiftFilterViewModel.Section section4 = section3;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer4, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, i2), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                GapComposer gapComposer5 = gapComposer4;
                SpacerKt.Spacer(gapComposer5, SizeKt.m277height3ABfNKs(companion2, 12.0f));
                Set set2 = (Set) ((Map) mutableState3.getValue()).get(ShiftFilterType.LOCATION);
                if (set2 == null) {
                    set2 = EmptySet.INSTANCE;
                }
                gapComposer5.startReplaceGroup(-1895418631);
                GapComposer gapComposer6 = gapComposer5;
                for (ShiftFilterViewModel.Option option : section4.options) {
                    boolean contains = set2.contains(option.id);
                    FilterSelectionMode filterSelectionMode = FilterSelectionMode.MULTI;
                    CellDefaultAccessory.Checkbox checkbox = new CellDefaultAccessory.Checkbox(contains);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(366741885, new FieldBinding$$ExternalSyntheticLambda4(option, 27), gapComposer6);
                    MutableState mutableState4 = mutableState3;
                    boolean changedInstance = gapComposer6.changedInstance(section4) | gapComposer6.changed(contains) | gapComposer6.changedInstance(set2) | gapComposer6.changedInstance(option) | gapComposer6.changed(mutableState4);
                    Object rememberedValue2 = gapComposer6.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                        ShiftFilterViewModel.Section section5 = section4;
                        set = set2;
                        rememberedValue2 = new ShiftListViewKt$$ExternalSyntheticLambda10(section5, contains, set, option, mutableState4);
                        section = section5;
                        mutableState = mutableState4;
                        gapComposer6.updateRememberedValue(rememberedValue2);
                    } else {
                        section = section4;
                        set = set2;
                        mutableState = mutableState4;
                    }
                    GapComposer gapComposer7 = gapComposer6;
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda, null, (Function0) rememberedValue2, false, false, null, null, 0L, checkbox, null, gapComposer7, 6, 1530);
                    mutableState3 = mutableState;
                    gapComposer6 = gapComposer7;
                    set2 = set;
                    section4 = section;
                }
                gapComposer6.end(z2);
                mutableState2 = mutableState3;
                companion = companion2;
                z = z2;
                neverEqualPolicy = neverEqualPolicy2;
                i2 = i5;
                it2 = it3;
                gapComposer3 = gapComposer6;
            }
            boolean z3 = z;
            gapComposer3.end(z3);
            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer3, SizeKt.m277height3ABfNKs(companion, 16.0f));
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1859954095, new ShiftListViewKt$$ExternalSyntheticLambda11(function12, mutableState2, z3 ? 1 : 0), gapComposer3), gapComposer3, 24576, 15);
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            function12 = function1;
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda12(shiftFilterViewModel, function12, modifier, i, 0);
        }
    }

    public static final void ShiftListLoadedContent(ShiftListViewModel.Loaded loaded, Function1 function1, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1681220830);
        int i2 = i | (gapComposer.changedInstance(loaded) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            String str = loaded.monthTitle;
            ScheduleCalendarViewModel scheduleCalendarViewModel = loaded.calendar;
            int i3 = i2 & 896;
            ShiftListTitleBar(str, scheduleCalendarViewModel.isExpanded, function1, function0, gapComposer, i2 & 8064);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            boolean z = i3 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ViewGroups$$ExternalSyntheticLambda0(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean z2 = i3 == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ViewGroups$$ExternalSyntheticLambda0(16, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            SellerCardKt.ScheduleCalendar(scheduleCalendarViewModel, function12, (Function1) rememberedValue2, gapComposer, 0);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            ImmutableList immutableList = loaded.days;
            LocalDate localDate = scheduleCalendarViewModel.selectedDate;
            if (1.0f <= 0.0d) {
                InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
            }
            ShiftListContent(immutableList, localDate, function1, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), gapComposer, i3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PayCellViewKt$$ExternalSyntheticLambda0((Object) loaded, (Object) function1, (Function) function0, i, 13);
        }
    }

    public static final void ShiftListMonthTitle(int i, Composer composer, String str, Function0 function0, boolean z) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-802334587);
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changedInstance(function0) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m183clickableoSLSa3U$default(ClipKt.clip(companion, m340RoundedCornerShape0680j_4), false, null, new Role(0), function0, 11), 8.0f, 4.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 4.0f));
            Trace.m1191Iconww6aTOc(z ? Icons.CaretUp16 : Icons.CaretDown16, (String) null, SizeKt.m285size3ABfNKs(companion, 16.0f), 0L, gapComposer, 432, 8);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftListViewKt$$ExternalSyntheticLambda22(str, z, function0, i);
        }
    }

    public static final void ShiftListTitleBar(String str, boolean z, Function1 function1, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(464367183);
        int i2 = (gapComposer.changed(str) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1488534123, new ShiftListViewKt$$ExternalSyntheticLambda16(str, z, function1, r3), gapComposer);
            NavigationType navigationType = NavigationType.BACK;
            r3 = (i2 & 896) == 256 ? 1 : 0;
            Object rememberedValue = gapComposer.rememberedValue();
            if (r3 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ShiftListViewKt$$ExternalSyntheticLambda4(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1052015408, new ActionPillKt$$ExternalSyntheticLambda0(10, function0), gapComposer), gapComposer, 1572918, 44);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HeroCardViewKt$$ExternalSyntheticLambda32(str, z, function1, function0, i);
        }
    }

    public static final void ShiftListView(ShiftListViewModel shiftListViewModel, Function1 function1, Composer composer, int i) {
        shiftListViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1350623856);
        int i2 = (gapComposer.changedInstance(shiftListViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1081951739, new PayCellViewKt$$ExternalSyntheticLambda0(12, shiftListViewModel, function1, mutableState), gapComposer), gapComposer, 3072, 7);
            if (((Boolean) mutableState.getValue()).booleanValue() && (shiftListViewModel instanceof ShiftListViewModel.Loaded)) {
                gapComposer.startReplaceGroup(1182983662);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new WalletHomeViewKt$$ExternalSyntheticLambda6(16, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                SheetKt.Sheet((Function0) rememberedValue2, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1674186228, new BufferedChannel$$ExternalSyntheticLambda4(7, shiftListViewModel, function1, mutableState), gapComposer), gapComposer, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1183325778);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkViewFactory$$ExternalSyntheticLambda9(shiftListViewModel, function1, i);
        }
    }

    public static final void ShiftNoteCell(ShiftNoteViewModel.ShiftNoteSection shiftNoteSection, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1134115733);
        int i2 = (gapComposer.changedInstance(shiftNoteSection) ? 4 : 2) | i;
        byte b = 0;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(f782lambda$1363358327, Expect_jvmKt.rememberComposableLambda(-1655744152, new ShiftNoteViewKt$$ExternalSyntheticLambda11(shiftNoteSection, b, b), gapComposer), null, null, null, false, false, Expect_jvmKt.rememberComposableLambda(884908194, new ShiftNoteViewKt$$ExternalSyntheticLambda11(shiftNoteSection, i3, b), gapComposer), null, null, 0L, null, gapComposer, 12582966, 0, 3964);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShiftNoteViewKt$$ExternalSyntheticLambda11(shiftNoteSection, i);
        }
    }

    public static final void ShiftNoteView(ShiftNoteViewModel shiftNoteViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        shiftNoteViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-299255308);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(shiftNoteViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1563136393, new Radiography$$ExternalSyntheticLambda1(9, shiftNoteViewModel, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new KotterKnifeKt$$ExternalSyntheticLambda1(shiftNoteViewModel, function1, i, 11);
        }
    }
}
