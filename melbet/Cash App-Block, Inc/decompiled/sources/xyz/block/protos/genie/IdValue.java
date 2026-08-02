package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.BankAccount;
import com.squareup.protos.franklin.common.CashLiteCardTransactionRenderData;
import com.squareup.protos.franklin.common.ClientDisplayTheme;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningRequestData;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.protos.franklin.common.P2pPoolComment;
import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.SyncInvestmentEntity;
import com.squareup.protos.franklin.investing.resources.Period;
import com.squareup.protos.franklin.onboarding.InvitationOnboardingDeepLinkPayload;
import com.squareup.protos.franklin.service.ThreeDomainSecureV2ActionError;
import com.squareup.protos.franklin.service.ThreeDomainSecureV2ActionSuccess;
import com.squareup.protos.franklin.ui.InputtedLegalName;
import com.squareup.protos.investing.notifications.settings.NotificationSettingsMessageConfig;
import com.squareup.protos.rewardly.ui.UiRewardSelectionState;
import com.squareup.protos.rewardly.ui.UiSelectedReward;
import com.squareup.protos.roster.business_hours.TimePeriod;
import com.squareup.protos.timecards.BatchGetTimecardBreakDefinitionRequest;
import com.squareup.protos.timecards.DateRange;
import com.squareup.protos.timecards.DatetimeInterval;
import com.squareup.protos.timecards.StopTimecardBreakRequest;
import com.squareup.protos.timecards.scheduling.LocalDateRange;
import com.squareup.stafftasks.resources.ReviewDocumentMetadata;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.playpen_bff.v1.Playpen;

/* loaded from: classes10.dex */
public final class IdValue extends Message {
    public static final ProtoAdapter ADAPTER = new IdValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(IdValue.class), "type.googleapis.com/xyz.block.genie.v1.IdValue", Syntax.PROTO_2, null, "xyz/block/genie/v1/state.proto");
    public final String local;
    public final String server;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdValue(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.server = str;
        this.local = str2;
        if (TransactorKt.countNonNull(str, str2) <= 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At most one of server, local may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdValue)) {
            return false;
        }
        IdValue idValue = (IdValue) obj;
        return Intrinsics.areEqual(unknownFields(), idValue.unknownFields()) && Intrinsics.areEqual(this.server, idValue.server) && Intrinsics.areEqual(this.local, idValue.local);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.server;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.local;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.server = this.server;
        builder.local = this.local;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.server;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "server=", arrayList);
        }
        String str2 = this.local;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "local=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IdValue{", "}", 0, null, null, 56);
    }

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String local;
        public String server;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return build();
                case 1:
                    return new BankAccount(this.server, this.local, buildUnknownFields());
                case 2:
                    return new CashLiteCardTransactionRenderData(this.server, this.local, buildUnknownFields());
                case 3:
                    return new ClientDisplayTheme(this.server, this.local, buildUnknownFields());
                case 4:
                    return new DigitalWalletTokenProvisioningRequestData.GooglePayRequest(this.server, this.local, buildUnknownFields());
                case 5:
                    return new LendingRenderData.ContextCard(this.server, this.local, buildUnknownFields());
                case 6:
                    return new P2pPoolComment(this.server, this.local, buildUnknownFields());
                case 7:
                    return new StatusResult.SupportAction(this.server, this.local, buildUnknownFields());
                case 8:
                    return new SyncInvestmentEntity.DetailRow(this.server, this.local, buildUnknownFields());
                case 9:
                    return new Period(this.server, this.local, buildUnknownFields());
                case 10:
                    return new InvitationOnboardingDeepLinkPayload(this.server, this.local, buildUnknownFields());
                case 11:
                    return new ThreeDomainSecureV2ActionError(this.server, this.local, buildUnknownFields());
                case 12:
                    return new ThreeDomainSecureV2ActionSuccess(this.server, this.local, buildUnknownFields());
                case 13:
                    return new InputtedLegalName(this.server, this.local, buildUnknownFields());
                case 14:
                    return new NotificationSettingsMessageConfig(this.server, this.local, buildUnknownFields());
                case 15:
                    return new UiRewardSelectionState.UnlockInProgress.Button(this.server, this.local, buildUnknownFields());
                case 16:
                    return new UiSelectedReward(this.server, this.local, buildUnknownFields());
                case 17:
                    return new TimePeriod(this.server, this.local, buildUnknownFields());
                case 18:
                    return new BatchGetTimecardBreakDefinitionRequest(this.server, this.local, buildUnknownFields());
                case 19:
                    return new DateRange(this.server, this.local, buildUnknownFields());
                case 20:
                    return new DatetimeInterval(this.server, this.local, buildUnknownFields());
                case 21:
                    return new StopTimecardBreakRequest(this.server, this.local, buildUnknownFields());
                case 22:
                    return new LocalDateRange(this.server, this.local, buildUnknownFields());
                case 23:
                    return new ReviewDocumentMetadata(this.server, this.local, buildUnknownFields());
                case 24:
                    return new Playpen(this.server, this.local, buildUnknownFields());
                default:
                    return new DisplayError(this.server, this.local, buildUnknownFields());
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public IdValue build() {
            return new IdValue(this.server, this.local, buildUnknownFields());
        }
    }
}
