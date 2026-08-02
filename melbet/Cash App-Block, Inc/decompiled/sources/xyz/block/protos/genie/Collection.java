package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.TransactionAmountHistory;
import com.squareup.protos.franklin.common.TreehouseConfig;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.loyalty.ProgramRewards;
import com.squareup.protos.franklin.ui.InitialBlockerData;
import com.squareup.protos.franklin.ui.ProfileUpsellConfiguration;
import com.squareup.protos.hieroglyph.service.ProvisionKeysResponse;
import com.squareup.protos.investing.notifications.settings.NotificationsSettings;
import com.squareup.protos.lending.PrepurchaseAfterpayAppletData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletCreditLimitAndBorrowButtonTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLinksTile;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.protos.rewardly.ui.UiRewardAvatars;
import com.squareup.protos.roster.business_hours.BusinessHours;
import com.squareup.protos.roster.business_hours.SpecialBusinessHours;
import com.squareup.protos.timecards.BatchTimecardBreakDefinitionResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForComparisonBookletResponse;
import squareup.cash.earnings.ActionButtonGroupSection;
import squareup.cash.earnings.EarningsHomeUi;
import squareup.cash.paychecks.PaychecksHomeUi;
import squareup.cash.paychecks.UiConfiguration;
import squareup.cash.savings.SavingsScreen;
import squareup.cash.scheduledreloader.api.external.v1.ExternalGetEnabledScheduledReloadPreferencesResponse;
import squareup.playpen_bff.v1.GetPlaypensResponse;
import squareup.playpen_bff.v1.GetServicesResponse;

/* loaded from: classes10.dex */
public final class Collection extends Message {
    public static final ProtoAdapter ADAPTER = new Collection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Collection.class), "type.googleapis.com/xyz.block.genie.v1.Collection", Syntax.PROTO_2, null, "xyz/block/genie/v1/state.proto");
    public final List items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Collection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Collection)) {
            return false;
        }
        Collection collection = (Collection) obj;
        return Intrinsics.areEqual(unknownFields(), collection.unknownFields()) && Intrinsics.areEqual(this.items, collection.items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.items = this.items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Collection{", "}", 0, null, null, 56);
    }

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List items;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 3:
                    this.items = EmptyList.INSTANCE;
                    break;
                case 4:
                    this.items = EmptyList.INSTANCE;
                    break;
                case 16:
                    this.items = EmptyList.INSTANCE;
                    break;
                default:
                    this.items = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Collection(this.items, buildUnknownFields());
                case 1:
                    return new TransactionAmountHistory(this.items, buildUnknownFields());
                case 2:
                    return new TreehouseConfig(this.items, buildUnknownFields());
                case 3:
                    return new CustomOrderConfiguration(this.items, buildUnknownFields());
                case 4:
                    return new ProgramRewards(this.items, buildUnknownFields());
                case 5:
                    return new InitialBlockerData(this.items, buildUnknownFields());
                case 6:
                    return new ProfileUpsellConfiguration(this.items, buildUnknownFields());
                case 7:
                    return new ProvisionKeysResponse(this.items, buildUnknownFields());
                case 8:
                    return new NotificationsSettings(this.items, buildUnknownFields());
                case 9:
                    return new PrepurchaseAfterpayAppletData.AppletRow.UnorderedList(this.items, buildUnknownFields());
                case 10:
                    return new BorrowAppletBulletinsTile(this.items, buildUnknownFields());
                case 11:
                    return new BorrowAppletCreditLimitAndBorrowButtonTile(this.items, buildUnknownFields());
                case 12:
                    return new BorrowAppletLinksTile(this.items, buildUnknownFields());
                case 13:
                    return new BorrowAppletLoanHistoryTile(this.items, buildUnknownFields());
                case 14:
                    return new BorrowAppletPaymentTimelineTile(this.items, buildUnknownFields());
                case 15:
                    return new BorrowData.AppletData.EntryPointData.TileEntryPoint.Row.Allocations(this.items, buildUnknownFields());
                case 16:
                    return new UiRewardAvatars(this.items, buildUnknownFields());
                case 17:
                    return new BusinessHours(this.items, buildUnknownFields());
                case 18:
                    return new SpecialBusinessHours(this.items, buildUnknownFields());
                case 19:
                    return new BatchTimecardBreakDefinitionResponse(this.items, buildUnknownFields());
                case 20:
                    return new GetBankingBenefitsForComparisonBookletResponse(this.items, buildUnknownFields());
                case 21:
                    return new ActionButtonGroupSection(this.items, buildUnknownFields());
                case 22:
                    return new EarningsHomeUi(this.items, buildUnknownFields());
                case 23:
                    return new PaychecksHomeUi.Header.NullStateUpsell(this.items, buildUnknownFields());
                case 24:
                    return new PaychecksHomeUi.TermsOfService(this.items, buildUnknownFields());
                case 25:
                    return new UiConfiguration.WheelColorList(this.items, buildUnknownFields());
                case 26:
                    return new SavingsScreen(this.items, buildUnknownFields());
                case 27:
                    return new ExternalGetEnabledScheduledReloadPreferencesResponse(this.items, buildUnknownFields());
                case 28:
                    return new GetPlaypensResponse(this.items, buildUnknownFields());
                default:
                    return new GetServicesResponse(this.items, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
