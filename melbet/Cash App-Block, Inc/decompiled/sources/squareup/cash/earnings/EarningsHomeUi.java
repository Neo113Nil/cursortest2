package squareup.cash.earnings;

import android.os.Build;
import android.os.Parcelable;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.yoga.internal.YGFloatOptional;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.booklet.ListUnorderedCardSection;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda13;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$CardSection;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletHomeSection$Section$OrderList;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection$Content$TransactionList;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection;
import com.squareup.protos.cash.cashsuggest.api.OrderListSection$ScreenContent$EligibleOrders;
import com.squareup.util.Strings;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.ByteString;
import squareup.cash.earnings.EarningTool;
import xyz.block.protos.genie.Collection;

/* loaded from: classes10.dex */
public final class EarningsHomeUi extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsHomeUi> CREATOR;
    public final List sections;

    public final class Section extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Section> CREATOR;
        public final AbstractC0087Section section;

        /* renamed from: squareup.cash.earnings.EarningsHomeUi$Section$Section, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public abstract class AbstractC0087Section {

            /* renamed from: squareup.cash.earnings.EarningsHomeUi$Section$Section$ActionButtons */
            /* loaded from: classes10.dex */
            public final class ActionButtons extends AbstractC0087Section {
                public final ActionButtonGroupSection value;

                public ActionButtons(ActionButtonGroupSection actionButtonGroupSection) {
                    actionButtonGroupSection.getClass();
                    this.value = actionButtonGroupSection;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ActionButtons) && Intrinsics.areEqual(this.value, ((ActionButtons) obj).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "ActionButtons(value=" + this.value + ")";
                }
            }

            /* renamed from: squareup.cash.earnings.EarningsHomeUi$Section$Section$ActiveDistribution */
            /* loaded from: classes10.dex */
            public final class ActiveDistribution extends AbstractC0087Section {
                public final ActiveDistributionSection value;

                public ActiveDistribution(ActiveDistributionSection activeDistributionSection) {
                    activeDistributionSection.getClass();
                    this.value = activeDistributionSection;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ActiveDistribution) && Intrinsics.areEqual(this.value, ((ActiveDistribution) obj).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "ActiveDistribution(value=" + this.value + ")";
                }
            }

            /* renamed from: squareup.cash.earnings.EarningsHomeUi$Section$Section$Activity */
            /* loaded from: classes10.dex */
            public final class Activity extends AbstractC0087Section {
                public final ActivitySection value;

                public Activity(ActivitySection activitySection) {
                    activitySection.getClass();
                    this.value = activitySection;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Activity) && Intrinsics.areEqual(this.value, ((Activity) obj).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "Activity(value=" + this.value + ")";
                }
            }

            /* renamed from: squareup.cash.earnings.EarningsHomeUi$Section$Section$EarningCard */
            /* loaded from: classes10.dex */
            public final class EarningCard extends AbstractC0087Section {
                public final EarningCardSection value;

                public EarningCard(EarningCardSection earningCardSection) {
                    earningCardSection.getClass();
                    this.value = earningCardSection;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof EarningCard) && Intrinsics.areEqual(this.value, ((EarningCard) obj).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "EarningCard(value=" + this.value + ")";
                }
            }

            /* renamed from: squareup.cash.earnings.EarningsHomeUi$Section$Section$EarningTools */
            /* loaded from: classes10.dex */
            public final class EarningTools extends AbstractC0087Section {
                public final EarningToolsSection value;

                public EarningTools(EarningToolsSection earningToolsSection) {
                    earningToolsSection.getClass();
                    this.value = earningToolsSection;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof EarningTools) && Intrinsics.areEqual(this.value, ((EarningTools) obj).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "EarningTools(value=" + this.value + ")";
                }
            }

            /* renamed from: squareup.cash.earnings.EarningsHomeUi$Section$Section$FdicFooter */
            /* loaded from: classes10.dex */
            public final class FdicFooter extends AbstractC0087Section {
                public final EarningFdicFooterSection value;

                public FdicFooter(EarningFdicFooterSection earningFdicFooterSection) {
                    earningFdicFooterSection.getClass();
                    this.value = earningFdicFooterSection;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof FdicFooter) && Intrinsics.areEqual(this.value, ((FdicFooter) obj).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "FdicFooter(value=" + this.value + ")";
                }
            }

            /* renamed from: squareup.cash.earnings.EarningsHomeUi$Section$Section$Header */
            /* loaded from: classes10.dex */
            public final class Header extends AbstractC0087Section {
                public final EarningHeaderSection value;

                public Header(EarningHeaderSection earningHeaderSection) {
                    earningHeaderSection.getClass();
                    this.value = earningHeaderSection;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Header) && Intrinsics.areEqual(this.value, ((Header) obj).value);
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "Header(value=" + this.value + ")";
                }
            }

            public static final void ListUnorderedCardSection(ListUnorderedCardSection listUnorderedCardSection, Composer composer, int i) {
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(2081883393);
                int i2 = i | (gapComposer.changedInstance(listUnorderedCardSection) ? 4 : 2);
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    Strings.getSizes(gapComposer).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Strings.getSizes(gapComposer).getClass();
                    Object obj = DefaultSizes.border.entries;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m300paddingVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), Strings.getColors(gapComposer).semantic.background.subtle, ColorKt.RectangleShape);
                    Strings.getSizes(gapComposer).getClass();
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU, 8.0f, 32.0f);
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
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda13(3);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(fillMaxWidth2, false, (Function1) rememberedValue);
                    Strings.getSizes(gapComposer).getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(semantics, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getTypography(gapComposer).headlineSmall, (TextLineBalancing) null, listUnorderedCardSection.title, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer;
                    Strings.getSizes(gapComposer).getClass();
                    ListUnorderedKt.ListUnordered(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (ListUnorderedState) null, (ListUnorderedProminence) null, ListUnorderedSize.Large, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(248126225, new HypeWelcomeUIKt$$ExternalSyntheticLambda5(listUnorderedCardSection, 16), gapComposer), gapComposer, 199680, 22);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new CashMapViewKt$$ExternalSyntheticLambda5(listUnorderedCardSection, i, 25);
                }
            }

            public static final AppletCardSection access$getCardSection(LocalMenuHoursViewKt localMenuHoursViewKt) {
                AfterpayAppletHomeSection$Section$CardSection afterpayAppletHomeSection$Section$CardSection = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$CardSection ? (AfterpayAppletHomeSection$Section$CardSection) localMenuHoursViewKt : null;
                if (afterpayAppletHomeSection$Section$CardSection != null) {
                    return afterpayAppletHomeSection$Section$CardSection.value;
                }
                return null;
            }

            public static final OrderListSection.EligibleRetroOrders access$getEligibleOrders(YGFloatOptional yGFloatOptional) {
                OrderListSection$ScreenContent$EligibleOrders orderListSection$ScreenContent$EligibleOrders = yGFloatOptional instanceof OrderListSection$ScreenContent$EligibleOrders ? (OrderListSection$ScreenContent$EligibleOrders) yGFloatOptional : null;
                if (orderListSection$ScreenContent$EligibleOrders != null) {
                    return orderListSection$ScreenContent$EligibleOrders.value;
                }
                return null;
            }

            public static final OrderListSection access$getOrderList(LocalMenuHoursViewKt localMenuHoursViewKt) {
                AfterpayAppletHomeSection$Section$OrderList afterpayAppletHomeSection$Section$OrderList = localMenuHoursViewKt instanceof AfterpayAppletHomeSection$Section$OrderList ? (AfterpayAppletHomeSection$Section$OrderList) localMenuHoursViewKt : null;
                if (afterpayAppletHomeSection$Section$OrderList != null) {
                    return afterpayAppletHomeSection$Section$OrderList.value;
                }
                return null;
            }

            public static final AppletCardSection.TransactionList access$getTransactionList(zzuv zzuvVar) {
                AppletCardSection$Content$TransactionList appletCardSection$Content$TransactionList = zzuvVar instanceof AppletCardSection$Content$TransactionList ? (AppletCardSection$Content$TransactionList) zzuvVar : null;
                if (appletCardSection$Content$TransactionList != null) {
                    return appletCardSection$Content$TransactionList.value;
                }
                return null;
            }

            public static boolean isAffectedModel(List list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String str2 = Build.MODEL;
                    str2.getClass();
                    String upperCase = str2.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    if (StringsKt__StringsJVMKt.startsWith(upperCase, str, false)) {
                        return true;
                    }
                }
                return false;
            }
        }

        static {
            EarningsHomeUi$Section$Companion$ADAPTER$1 earningsHomeUi$Section$Companion$ADAPTER$1 = new EarningsHomeUi$Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.earnings.EarningsHomeUi.Section", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
            ADAPTER = earningsHomeUi$Section$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsHomeUi$Section$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Section(AbstractC0087Section abstractC0087Section, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.section = abstractC0087Section;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.section, section.section);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AbstractC0087Section abstractC0087Section = this.section;
            int hashCode2 = hashCode + (abstractC0087Section != null ? abstractC0087Section.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningTool.Builder builder = new EarningTool.Builder(16);
            builder.tool = this.section;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AbstractC0087Section abstractC0087Section = this.section;
            if (abstractC0087Section != null) {
                arrayList.add("section=" + abstractC0087Section);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
        }
    }

    static {
        EarningsHomeUi$Companion$ADAPTER$1 earningsHomeUi$Companion$ADAPTER$1 = new EarningsHomeUi$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsHomeUi.class), "type.googleapis.com/squareup.cash.earnings.EarningsHomeUi", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = earningsHomeUi$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsHomeUi$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsHomeUi(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsHomeUi)) {
            return false;
        }
        EarningsHomeUi earningsHomeUi = (EarningsHomeUi) obj;
        return Intrinsics.areEqual(unknownFields(), earningsHomeUi.unknownFields()) && Intrinsics.areEqual(this.sections, earningsHomeUi.sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.sections.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(22, false);
        builder.items = this.sections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsHomeUi{", "}", 0, null, null, 56);
    }
}
