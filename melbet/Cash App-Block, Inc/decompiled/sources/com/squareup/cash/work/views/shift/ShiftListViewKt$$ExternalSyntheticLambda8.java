package com.squareup.cash.work.views.shift;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.views.instore.TableQrCodeScannerViewKt;
import app.cash.molecule.PlatformKt;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.billssubscriptions.views.BillsSubscriptionsMerchantListViewKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.util.Strings;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationScreenKt;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton$Type$Secondary;
import com.stripe.android.financialconnections.ui.components.TextKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShiftListViewKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function0 f$0;

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda8(Function0 function0) {
        this.$r8$classId = 8;
        this.f$0 = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function0 function0 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ShiftListViewKt.MinimalTitleBar(function0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                TableQrCodeScannerViewKt.TableQrCodeScannerChrome(function0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) ((Composer) obj);
                gapComposer.startReplaceGroup(-1770466100);
                ActivityFeedEntry activityFeedEntry = (ActivityFeedEntry) function0.invoke();
                gapComposer.end(false);
                return activityFeedEntry;
            case 3:
                ((Integer) obj2).getClass();
                BillsSubscriptionsMerchantListViewKt.DoneFooter(function0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    SizeKt.ButtonCompact(this.f$0, null, ButtonProminence.SUBTLE, false, false, null, CustomOrderKt.lambda$21709586, gapComposer2, 1573248, 58);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function0.invoke();
                return Unit.INSTANCE;
            case 6:
                ((String) obj).getClass();
                ((String) obj2).getClass();
                function0.invoke();
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                MessageFileKt.ActivityLoadingContent(function0, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    StorageUtil.ButtonIcon(Icons.AlertFill24, Room.stringResource(gapComposer3, R.string.support_chat_failed_message_options_button), this.f$0, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion, 24.0f), false, null, gapComposer3, 6, 48);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier = gapComposer4.applier;
                if (shouldExecute) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(ClipKt.clip(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion2, 1.0f), Strings.getColors(gapComposer4).semantic.background.f1047app, ColorKt.RectangleShape), 1.0f, Strings.getColors(gapComposer4).semantic.border.subtle, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)), false, null, null, this.f$0, 15), 32.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, 48);
                    int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer4, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion2, 64.0f), Strings.getColors(gapComposer4).semantic.icon.warning, RoundedCornerShapeKt.CircleShape);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, m177backgroundbw27NRU);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Trace.m1191Iconww6aTOc(Icons.Alert32, (String) null, androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion2, 32.0f), Strings.getColors(gapComposer4).semantic.icon.inverse, gapComposer4, 438, 0);
                    gapComposer4.end(true);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer4, null);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 3058, Strings.getColors(gapComposer4).semantic.text.standard, (Composer) gapComposer4, (Modifier) null, Strings.getTypography(gapComposer4).sectionTitle, new TextLineBalancing(1), Room.stringResource(gapComposer4, R.string.support_chat_unknown_body_text_uplifted), (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer4, null);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer4, 48);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, companion2);
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer4, composeUiNode$Companion$SetModifier$13, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer4, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer4).semantic.text.standard, (Composer) gapComposer4, SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 11), Strings.getTypography(gapComposer4).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.support_chat_unknown_body_button_text), (Map) null, (Function1) null, false);
                    Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, (Modifier) null, Strings.getColors(gapComposer4).semantic.icon.subtle, gapComposer4, 54, 4);
                    gapComposer4.end(true);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    TextKt.FinancialConnectionsButton(this.f$0, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f), FinancialConnectionsButton$Type$Secondary.INSTANCE, null, false, false, NetworkingSaveToLinkVerificationScreenKt.f808lambda$1966495693, gapComposer5, 1573296, 56);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda8(int i, Function0 function0) {
        this.$r8$classId = i;
        this.f$0 = function0;
    }

    public /* synthetic */ ShiftListViewKt$$ExternalSyntheticLambda8(Function0 function0, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = function0;
    }
}
