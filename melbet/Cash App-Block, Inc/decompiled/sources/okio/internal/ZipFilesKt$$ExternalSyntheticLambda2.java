package okio.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerDefaults$AllDates$1;
import androidx.compose.material3.DatePickerFormatterImpl;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda5;
import com.squareup.cash.shopping.sup.views.CartTotalDiscrepancy;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.ranges.IntRange;
import okhttp3.internal.Tags;
import okio.RealBufferedSource;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class ZipFilesKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ ZipFilesKt$$ExternalSyntheticLambda2(long j, AvatarImage.LocalIcon localIcon, AvatarOverlay.LocalIcon localIcon2, String str, String str2, CartTotalDiscrepancy cartTotalDiscrepancy, Function0 function0, ButtonProminence buttonProminence, String str3) {
        this.f$1 = j;
        this.f$0 = localIcon;
        this.f$2 = localIcon2;
        this.f$4 = str;
        this.f$5 = str2;
        this.f$3 = cartTotalDiscrepancy;
        this.f$6 = function0;
        this.f$7 = buttonProminence;
        this.f$8 = str3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.$r8$classId;
        Object obj3 = this.f$8;
        Object obj4 = this.f$7;
        Object obj5 = this.f$6;
        Object obj6 = this.f$3;
        Object obj7 = this.f$5;
        Object obj8 = this.f$4;
        Object obj9 = this.f$2;
        Object obj10 = this.f$0;
        switch (i) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj10;
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj9;
                RealBufferedSource realBufferedSource = (RealBufferedSource) obj6;
                Ref$LongRef ref$LongRef2 = (Ref$LongRef) obj8;
                Ref$LongRef ref$LongRef3 = (Ref$LongRef) obj7;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj5;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj4;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) obj3;
                int intValue = ((Integer) obj).intValue();
                long longValue = ((Long) obj2).longValue();
                if (intValue != 1) {
                    if (intValue == 10) {
                        if (longValue < 4) {
                            a$$ExternalSyntheticBUOutline0.m$4("bad zip: NTFS extra too short");
                            return null;
                        }
                        realBufferedSource.skip(4L);
                        ZipFilesKt.readExtra(realBufferedSource, (int) (longValue - 4), new ZipFilesKt$$ExternalSyntheticLambda1(ref$ObjectRef, realBufferedSource, ref$ObjectRef2, ref$ObjectRef3));
                    }
                    return Unit.INSTANCE;
                }
                if (ref$BooleanRef.element) {
                    a$$ExternalSyntheticBUOutline0.m$4("bad zip: zip64 extra repeated");
                } else {
                    ref$BooleanRef.element = true;
                    if (longValue >= this.f$1) {
                        long j = ref$LongRef.element;
                        if (j == BodyPartID.bodyIdMax) {
                            j = realBufferedSource.readLongLe();
                        }
                        ref$LongRef.element = j;
                        ref$LongRef2.element = ref$LongRef2.element == BodyPartID.bodyIdMax ? realBufferedSource.readLongLe() : 0L;
                        ref$LongRef3.element = ref$LongRef3.element == BodyPartID.bodyIdMax ? realBufferedSource.readLongLe() : 0L;
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$4("bad zip: zip64 extra too short");
                }
                return null;
            case 1:
                ((Integer) obj2).getClass();
                DatePickerKt.DatePickerContent((Long) obj10, this.f$1, (Function1) obj9, (Function1) obj8, (CalendarModelImpl) obj7, (IntRange) obj6, (DatePickerFormatterImpl) obj5, (DatePickerDefaults$AllDates$1) obj4, (DatePickerColors) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                AvatarImage.LocalIcon localIcon = (AvatarImage.LocalIcon) obj10;
                AvatarOverlay.LocalIcon localIcon2 = (AvatarOverlay.LocalIcon) obj9;
                String str = (String) obj8;
                String str2 = (String) obj7;
                CartTotalDiscrepancy cartTotalDiscrepancy = (CartTotalDiscrepancy) obj6;
                Function0 function0 = (Function0) obj5;
                ButtonProminence buttonProminence = (ButtonProminence) obj4;
                String str3 = (String) obj3;
                Composer composer = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 27.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
                    TextViewKt.Avatar(AvatarSize.Size64, new AvatarEntry("", this.f$1, null, localIcon, "Cash logo", localIcon2, null, null, EnumC0170g.SDK_ASSET_ICON_ARROW_DOWN_VALUE), SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, gapComposer, 390, 24);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 12.0f));
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).header, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion, 4.0f));
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    if (cartTotalDiscrepancy == null) {
                        gapComposer.startReplaceGroup(159675857);
                        gapComposer.end(false);
                        z = true;
                    } else {
                        gapComposer.startReplaceGroup(159675858);
                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                        ListUnorderedItem listUnorderedItem = new ListUnorderedItem(Room.stringResource(gapComposer, R.string.sup_credit_limit_exceeded_available_limit), null, cartTotalDiscrepancy.availableLimit, null, 10);
                        if (cartTotalDiscrepancy.availableLimit == null) {
                            listUnorderedItem = null;
                        }
                        ListUnorderedItem listUnorderedItem2 = new ListUnorderedItem(Room.stringResource(gapComposer, R.string.sup_credit_limit_exceeded_available_limit), null, cartTotalDiscrepancy.minimumOrderAmount, null, 10);
                        if (cartTotalDiscrepancy.minimumOrderAmount == null) {
                            listUnorderedItem2 = null;
                        }
                        ListUnorderedKt.ListUnordered(Tags.toImmutableList(ArraysKt___ArraysKt.filterNotNull(new ListUnorderedItem[]{listUnorderedItem, listUnorderedItem2, new ListUnorderedItem(Room.stringResource(gapComposer, R.string.sup_limit_error_cart_total), null, cartTotalDiscrepancy.cartTotal, null, 10)})), (Modifier) null, (ListUnorderedState) null, ListUnorderedProminence.Subtle, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, gapComposer, 3072, 54);
                        z = true;
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z);
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-904641643, new SheetKt$$ExternalSyntheticLambda5(14, function0, buttonProminence, str3), gapComposer), gapComposer, 24576, 15);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ZipFilesKt$$ExternalSyntheticLambda2(Long l, long j, Function1 function1, Function1 function12, CalendarModelImpl calendarModelImpl, IntRange intRange, DatePickerFormatterImpl datePickerFormatterImpl, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, DatePickerColors datePickerColors, int i) {
        this.f$0 = l;
        this.f$1 = j;
        this.f$2 = function1;
        this.f$4 = function12;
        this.f$5 = calendarModelImpl;
        this.f$3 = intRange;
        this.f$6 = datePickerFormatterImpl;
        this.f$7 = datePickerDefaults$AllDates$1;
        this.f$8 = datePickerColors;
    }

    public /* synthetic */ ZipFilesKt$$ExternalSyntheticLambda2(Ref$BooleanRef ref$BooleanRef, long j, Ref$LongRef ref$LongRef, RealBufferedSource realBufferedSource, Ref$LongRef ref$LongRef2, Ref$LongRef ref$LongRef3, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3) {
        this.f$0 = ref$BooleanRef;
        this.f$1 = j;
        this.f$2 = ref$LongRef;
        this.f$3 = realBufferedSource;
        this.f$4 = ref$LongRef2;
        this.f$5 = ref$LongRef3;
        this.f$6 = ref$ObjectRef;
        this.f$7 = ref$ObjectRef2;
        this.f$8 = ref$ObjectRef3;
    }
}
