package kotlin.reflect.jvm;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.memory.RealWeakMemoryCache;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.mac.ChunkedMac;
import com.google.crypto.tink.mac.MacKey;
import com.google.crypto.tink.mac.internal.ChunkedHmacImpl;
import com.google.crypto.tink.util.Bytes;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda17;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.growtools.views.manager.GrowToolsManagerViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda3;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda4;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda35;
import com.squareup.util.Strings;
import com.squareup.util.compose.ModifierKt;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.KTypeParameterBase;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class KTypesJvm {
    public static final void DetailRows(List list, Function1 function1, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-847174060);
        int i2 = 2;
        int i3 = 32;
        int i4 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        boolean z = false;
        boolean z2 = true;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
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
            gapComposer.startReplaceGroup(-690073392);
            int i5 = 0;
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                GrowToolsManagerViewModel.Loaded.DetailRow detailRow = (GrowToolsManagerViewModel.Loaded.DetailRow) obj;
                String str = detailRow.subLabel;
                int i7 = 26;
                if (str == null) {
                    gapComposer.startReplaceGroup(881995847);
                    gapComposer.end(z);
                    rememberComposableLambda = null;
                } else {
                    gapComposer.startReplaceGroup(881995848);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1076722148, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, i7), gapComposer);
                    gapComposer.end(z);
                }
                CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(detailRow.value, i2);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1990508698, new ArcadeModal$$ExternalSyntheticLambda5(detailRow, i7), gapComposer);
                boolean changed = ((i4 & 112) == i3 ? z2 : z) | gapComposer.changed(i5);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda18(i5, 8, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(rememberComposableLambda2, null, (Function0) rememberedValue, false, false, rememberComposableLambda, null, 0L, label, null, gapComposer, 6, 1466);
                z = z;
                i5 = i6;
                i3 = i3;
                i2 = 2;
                z2 = true;
            }
            gapComposer.end(z);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, 2);
        }
    }

    public static final void GrowToolsAvatar(GrowToolsManagerViewModel.Loaded.Header.Target target, Modifier modifier, boolean z, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-546414158);
        int i2 = i | (gapComposer.changedInstance(target) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar growToolsAvatar = target.avatar;
            Icons icons = target.badge;
            if (growToolsAvatar instanceof GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar) {
                gapComposer.startReplaceGroup(-297972803);
                AvatarEntry avatarEntry = AvatarsKt.toAvatarEntry(((GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.DefaultAvatar) growToolsAvatar).avatar, null, null, gapComposer, 8, 3);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                TextViewKt.Avatar(AvatarSize.Size48, AvatarEntry.m3382copyDuSw1wk$default(avatarEntry, 0L, null, new AvatarOverlay.LocalIcon(12, colors.semantic.background.subtle, 0L, icons), EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE), modifier, false, gapComposer, ((i2 << 3) & 896) | 6, 24);
                gapComposer.end(false);
            } else if (growToolsAvatar instanceof GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.EmojiAvatar) {
                gapComposer.startReplaceGroup(-297528604);
                RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
                gapComposer.startReplaceGroup(1313216736);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomEnd, false);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                String str = ((GrowToolsManagerViewModel.Loaded.Header.Target.GrowToolsAvatar.EmojiAvatar) growToolsAvatar).iconId;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(AlphaKt.alpha(modifier, z ? 1.0f : 0.4f), 48.0f);
                RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                VisibleKt.m3496ProgressEmojiIconLzaahlw(str, null, RealWeakMemoryCache.m1458clippedOutlinewH6b6FI$default(realWeakMemoryCache, m285size3ABfNKs, roundedCornerShape, 2), 1.0f, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, gapComposer, 48, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(gapComposer).getClass();
                Modifier m272offsetVpY3zN4 = OffsetKt.m272offsetVpY3zN4(m285size3ABfNKs2, 8.0f, 8.0f);
                Strings.getSizes(gapComposer).getClass();
                Object obj = DefaultSizes.border.annotationsMap;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ModifierKt.clipOffscreen(AlphaKt.alpha(realWeakMemoryCache.m1459clippedOutlinewH6b6FI(m272offsetVpY3zN4, roundedCornerShape, 2.0f), z ? 1.0f : 0.4f), roundedCornerShape), Strings.getColors(gapComposer).semantic.background.subtle, ColorKt.RectangleShape);
                Strings.getSizes(gapComposer).getClass();
                Trace.m1191Iconww6aTOc(icons, (String) null, SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 4.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 48, 0);
                gapComposer = gapComposer;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, false, false);
            } else {
                gapComposer.startReplaceGroup(-296467536);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(target, modifier, z, i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    public static final void GrowToolsManagerView(GrowToolsManagerViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ?? r5;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2004145403);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changed(loaded) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            int i4 = i2 & 112;
            boolean z2 = z | (i4 == 32);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z2 || rememberedValue == obj) {
                rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(i3, loaded, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1), 1.0f));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$15);
            NavigationType navigationType = NavigationType.BACK;
            boolean z3 = i4 == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z3 || rememberedValue2 == obj) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                rememberedValue2 = new ErrorView$$ExternalSyntheticLambda4(10, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue2, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(companion, 1.0f), ImageKt.rememberScrollState(gapComposer2), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, verticalScroll$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$16);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$14, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            GrowToolsManagerViewModel.Loaded.Header header = loaded.header;
            List list = loaded.detailRows;
            Header(header, function1, gapComposer2, i4);
            DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer2, null);
            if (!loaded.header.isToggleOn || list.isEmpty()) {
                r5 = 0;
                gapComposer2.startReplaceGroup(349287003);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(349088076);
                boolean z4 = i4 == 32;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (z4 || rememberedValue3 == obj) {
                    rememberedValue3 = new InviteContactsBodyKt$$ExternalSyntheticLambda5(2, function1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                r5 = 0;
                DetailRows(list, (Function1) rememberedValue3, gapComposer2, 0);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            }
            GrowToolsManagerViewModel.Loaded.TotalStats totalStats = loaded.totalStats;
            if (totalStats == null) {
                gapComposer2.startReplaceGroup(349314933);
                gapComposer2.end(r5);
            } else {
                gapComposer2.startReplaceGroup(349314934);
                Totals(totalStats, gapComposer2, r5);
                DBUtil.SpacerBetweenSectionXLarge(r5, 1, gapComposer2, null);
                gapComposer2.end(r5);
            }
            com.squareup.cash.activity.views.AvatarsKt.ActivityEmbeddedView(loaded.activityEmbeddedViewModel, null, Expect_jvmKt.rememberComposableLambda(-1320449021, new ErrorView$$ExternalSyntheticLambda3(20, function1), gapComposer2), null, null, gapComposer2, MLKEMEngine.KyberPolyBytes, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
            gapComposer = gapComposer2;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            gapComposer.end(true);
            gapComposer.end(true);
            GrowToolsManagerViewModel.Loaded.Dialog dialog = loaded.dialog;
            if (dialog == null) {
                gapComposer.startReplaceGroup(1156870101);
            } else {
                gapComposer.startReplaceGroup(1156870102);
                ShowDialog(dialog, function1, gapComposer, i4);
            }
            gapComposer.end(false);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(loaded, function1, i, 9);
        }
    }

    public static final void Header(GrowToolsManagerViewModel.Loaded.Header header, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        Function1 function12;
        GrowToolsManagerViewModel.Loaded.Header.Target target;
        Function0 function0;
        CellDefaultAccessory.ButtonCompact buttonCompact;
        Function0 function02;
        final GrowToolsManagerViewModel.Loaded.Header header2 = header;
        Function1 function13 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(562700320);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = i | (gapComposer.changedInstance(header2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function13) ? 32 : 16;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
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
            String str = header2.title;
            GrowToolsManagerViewModel.Loaded.Header.Target target2 = header2.target;
            ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth(companion, 1.0f), "Round_Ups_Toggle");
            boolean z2 = header2.isToggleOn;
            boolean z3 = header2.isInteractive;
            Role role = new Role(2);
            int i4 = i3 & 112;
            boolean z4 = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z4 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new InviteContactsBodyKt$$ExternalSyntheticLambda5(3, function13);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m337toggleableoSLSa3U$default = SelectableKt.m337toggleableoSLSa3U$default(testTag, z2, z3, role, (Function1) rememberedValue, 8);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(m337toggleableoSLSa3U$default, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            String str2 = header2.toggleText;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                z = false;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, true), textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            header2 = header;
            ModalKt.Toggle(0, 2, gapComposer, null, header2.isToggleOn, header2.isInteractive);
            gapComposer.end(true);
            final int i5 = 0;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            boolean z5 = header2.isToggleOn;
            if (header2.isInteractive) {
                gapComposer.startReplaceGroup(-627082491);
                target = target2;
                if (target.actionButtonText == null) {
                    gapComposer.startReplaceGroup(-627082492);
                    gapComposer.end(false);
                    function12 = function1;
                    function02 = null;
                } else {
                    gapComposer.startReplaceGroup(-627082491);
                    boolean z6 = i4 == 32;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z6 || rememberedValue2 == neverEqualPolicy) {
                        function12 = function1;
                        rememberedValue2 = new ErrorView$$ExternalSyntheticLambda4(7, function12);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    } else {
                        function12 = function1;
                    }
                    function02 = (Function0) rememberedValue2;
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                function0 = function02;
            } else {
                function12 = function1;
                target = target2;
                gapComposer.startReplaceGroup(-627028334);
                gapComposer.end(false);
                function0 = null;
            }
            String str3 = target.actionButtonText;
            if (str3 == null) {
                gapComposer.startReplaceGroup(-626942341);
                gapComposer.end(false);
                buttonCompact = null;
            } else {
                gapComposer.startReplaceGroup(-626942340);
                buttonCompact = new CellDefaultAccessory.ButtonCompact(null, null, false, Expect_jvmKt.rememberComposableLambda(-633257717, new GlobalSearchFeedKt$$ExternalSyntheticLambda17(str3, 19), gapComposer), 15);
                gapComposer.end(false);
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1486005304, new ErrorView$$ExternalSyntheticLambda1(27, header2, function12), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-210018055, new Function2() { // from class: com.squareup.cash.growtools.views.manager.GrowToolsManagerViewKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i5;
                    GrowToolsManagerViewModel.Loaded.Header header3 = header2;
                    switch (i6) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, header3.target.name, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, header3.target.description, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            final int i6 = 1;
            function13 = function1;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, function0, null, z5, false, Expect_jvmKt.rememberComposableLambda(-1796223617, new Function2() { // from class: com.squareup.cash.growtools.views.manager.GrowToolsManagerViewKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i6;
                    GrowToolsManagerViewModel.Loaded.Header header3 = header2;
                    switch (i62) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, header3.target.name, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, header3.target.description, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, buttonCompact, 0L, null, gapComposer, 12582966, 0, 3412);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(header2, function13, i, 8);
        }
    }

    public static final void ShowDialog(GrowToolsManagerViewModel.Loaded.Dialog dialog, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1299560707);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(dialog) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean changed = gapComposer.changed(dialog);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ModalKt.Dimmer(null, null, null, Expect_jvmKt.rememberComposableLambda(-1833135044, new GrowToolsManagerViewKt$$ExternalSyntheticLambda7(dialog, (MutableState) rememberedValue, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(dialog, function1, i, 10);
        }
    }

    /* renamed from: StatView-xkNWiIY, reason: not valid java name */
    public static final void m4140StatViewxkNWiIY(String str, String str2, Modifier modifier, int i, Composer composer, int i2) {
        str.getClass();
        str2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1571789187);
        int i3 = i2 | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128) | (gapComposer.changed(i) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i2 & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            int i4 = i3 & 14;
            boolean z = (i4 == 4) | ((i3 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str2, str, 20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle textStyle = Strings.getTypography(gapComposer).header;
            long j = Strings.getColors(gapComposer).semantic.text.standard;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            int i5 = (i3 << 15) & 234881024;
            Room.m1165Text25TpFw(0, 0, 0, i, i4 | 48 | i5, 0, 3824, j, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
            Room.m1165Text25TpFw(0, 0, 0, i, ((i3 >> 3) & 14) | 48 | i5, 0, 3824, Strings.getColors(gapComposer).component.button.standard.text.f165default, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolDetailsViewKt$$ExternalSyntheticLambda35(str, str2, modifier, i, i2);
        }
    }

    public static final void Totals(GrowToolsManagerViewModel.Loaded.TotalStats totalStats, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1958453343);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(totalStats) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
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
            ViewfinderDefaults.SectionHeader(totalStats.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            String str = totalStats.count;
            String str2 = totalStats.countLabel;
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m4140StatViewxkNWiIY(str, str2, rowScopeInstance.weight(1.0f, companion, true), 5, gapComposer, 0);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            m4140StatViewxkNWiIY(totalStats.amount, totalStats.amountLabel, rowScopeInstance.weight(1.0f, companion, true), 6, gapComposer, 0);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(totalStats, i, 27);
        }
    }

    public static ChunkedHmacImpl create(KeysetHandle keysetHandle, PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0) {
        Bytes outputPrefix;
        List list;
        KeysetHandle.Entry primary$1 = keysetHandle.getPrimary$1();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < ((List) keysetHandle.entries).size(); i++) {
            KeysetHandle.Entry at = keysetHandle.getAt(i);
            if (at.keyStatus.equals(KeyStatus.ENABLED)) {
                ChunkedMac chunkedMac = (ChunkedMac) primitiveRegistry$$ExternalSyntheticLambda0.create(at);
                TransactorKt key = at.getKey();
                if (key instanceof MacKey) {
                    outputPrefix = ((MacKey) key).getOutputPrefix();
                } else {
                    if (!(key instanceof LegacyProtoKey)) {
                        throw new GeneralSecurityException("Cannot get output prefix for key of class " + key.getClass().getName() + " with parameters " + key.getParameters());
                    }
                    outputPrefix = ((LegacyProtoKey) key).getOutputPrefix();
                }
                byte[] bArr = outputPrefix.data;
                if (bArr.length != 0 && bArr.length != 5) {
                    a$$ExternalSyntheticBUOutline0.m$6("PrefixMap only supports 0 and 5 byte prefixes");
                    return null;
                }
                if (hashMap.containsKey(outputPrefix)) {
                    list = (List) hashMap.get(outputPrefix);
                } else {
                    ArrayList arrayList = new ArrayList();
                    hashMap.put(outputPrefix, arrayList);
                    list = arrayList;
                }
                list.add(chunkedMac);
            }
        }
        return new ChunkedHmacImpl();
    }

    public static final KClass getJvmErasure(KClassifier kClassifier) {
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        Object obj = null;
        if (!(kClassifier instanceof KTypeParameterBase)) {
            f$$ExternalSyntheticLambda0.m$1(kClassifier, "Cannot calculate JVM erasure for type: ");
            return null;
        }
        List upperBounds = ((KTypeParameterBase) kClassifier).getUpperBounds();
        Iterator it = upperBounds.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            KClassifier classifier = ((KType) next).getClassifier();
            KClassImpl kClassImpl = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
            if (kClassImpl != null && kClassImpl.getClassKind$kotlin_reflection() != ClassKind.INTERFACE && kClassImpl.getClassKind$kotlin_reflection() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        KType kType = (KType) obj;
        if (kType == null) {
            kType = (KType) CollectionsKt.firstOrNull(upperBounds);
        }
        return kType != null ? getJvmErasure(kType) : Reflection.factory.getOrCreateKotlinClass(Object.class);
    }

    public static final KClass getJvmErasure(KType kType) {
        kType.getClass();
        KClassifier classifier = kType.getClassifier();
        if (classifier != null) {
            return getJvmErasure(classifier);
        }
        f$$ExternalSyntheticLambda0.m$1(kType, "Cannot calculate JVM erasure for type: ");
        return null;
    }
}
