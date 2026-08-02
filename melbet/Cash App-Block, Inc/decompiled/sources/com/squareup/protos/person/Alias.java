package com.squareup.protos.person;

import android.os.Parcelable;
import androidx.camera.camera2.pipe.AeMode;
import com.google.android.gms.internal.mlkit_vision_face.zzeb;
import com.google.android.gms.internal.mlkit_vision_face.zzkn;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.core.model.DigitalWalletType;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Headers;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.document.VersionData;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.FileCategory;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.app.LinkCardResponse;
import com.squareup.protos.franklin.app.RefreshSessionResponse;
import com.squareup.protos.franklin.app.UploadFileRequest;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.FieldName;
import com.squareup.protos.franklin.common.P2pPoolRenderData;
import com.squareup.protos.franklin.common.PaymentPlanEligibilityRenderData;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.ScheduledReloadData;
import com.squareup.protos.franklin.common.SetPasscodeRequest;
import com.squareup.protos.franklin.common.StatusResultButton;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.protos.franklin.data.BrowserInteraction;
import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.protos.franklin.lending.InitiateLoanPaymentRequest;
import com.squareup.protos.franklin.loyalty.LoyaltyProgram;
import com.squareup.protos.franklin.loyalty.LoyaltyUnit;
import com.squareup.protos.franklin.loyalty.ProgramRewards;
import com.squareup.protos.franklin.persona.ResolvePersonaDidvBlockerRequest;
import com.squareup.protos.franklin.support.ContactOption;
import com.squareup.protos.franklin.support.CreateSupportCaseRequest;
import com.squareup.protos.franklin.support.SupportContactType;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.protos.franklin.ui.CustomerData;
import com.squareup.protos.moneta.api.CashInRequest;
import com.squareup.protos.timecards.LaborCalculationSummary;
import com.squareup.protos.timecards.LocalDateTimeRange;
import com.squareup.protos.timecards.scheduling.TimeOff;
import com.squareup.stafftasks.resources.TargetEntity;
import com.squareup.stafftasks.resources.Task;
import com.squareup.stafftasks.resources.TaskStatus;
import com.squareup.stafftasks.resources.TaskType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;
import okio.ByteString;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.bankingbenefits.ui.RiskStatus;
import squareup.cash.cryptocurrency.CryptoEligibilities;
import squareup.cash.cryptocurrency.CryptoEligibilityStatus;
import squareup.cash.savings.SavingsFolderV2;
import squareup.cash.savings.SavingsHome;
import squareup.cash.savings.action.Card;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.savings.action.CompactCard;
import squareup.cash.savings.bespoke_elements.FolderList;

/* loaded from: classes8.dex */
public final class Alias extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Alias> CREATOR;
    public final Long created_at;
    public final Long first_verified_at_ms;
    public final Long last_verified_at_ms;
    public final String scope;

    /* renamed from: type, reason: collision with root package name */
    public final AliasType f1406type;
    public final Long updated_at;
    public final String value;

    public enum AliasType implements WireEnum {
        UNKNOWN(0),
        EMAIL(1),
        PHONE(2),
        PAN_FIDELIUS(3);

        public static final Alias$AliasType$Companion$ADAPTER$1 ADAPTER;
        public static final y0 Companion;
        public final int value;

        static {
            AliasType aliasType = UNKNOWN;
            Companion = new y0();
            ADAPTER = new Alias$AliasType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AliasType.class), Syntax.PROTO_2, aliasType);
        }

        AliasType(int i) {
            this.value = i;
        }

        public static final AliasType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return EMAIL;
            }
            if (i == 2) {
                return PHONE;
            }
            if (i != 3) {
                return null;
            }
            return PAN_FIDELIUS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Alias$Companion$ADAPTER$1 alias$Companion$ADAPTER$1 = new Alias$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Alias.class), "type.googleapis.com/squareup.person.Alias", Syntax.PROTO_2, null, "squareup/person/service.proto");
        ADAPTER = alias$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(alias$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Alias(AliasType aliasType, String str, String str2, Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1406type = aliasType;
        this.scope = str;
        this.value = str2;
        this.first_verified_at_ms = l;
        this.last_verified_at_ms = l2;
        this.created_at = l3;
        this.updated_at = l4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Alias)) {
            return false;
        }
        Alias alias = (Alias) obj;
        return Intrinsics.areEqual(unknownFields(), alias.unknownFields()) && this.f1406type == alias.f1406type && Intrinsics.areEqual(this.scope, alias.scope) && Intrinsics.areEqual(this.value, alias.value) && Intrinsics.areEqual(this.first_verified_at_ms, alias.first_verified_at_ms) && Intrinsics.areEqual(this.last_verified_at_ms, alias.last_verified_at_ms) && Intrinsics.areEqual(this.created_at, alias.created_at) && Intrinsics.areEqual(this.updated_at, alias.updated_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AliasType aliasType = this.f1406type;
        int hashCode2 = (hashCode + (aliasType != null ? aliasType.hashCode() : 0)) * 37;
        String str = this.scope;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.value;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.first_verified_at_ms;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.last_verified_at_ms;
        int hashCode6 = (hashCode5 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.created_at;
        int hashCode7 = (hashCode6 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.updated_at;
        int hashCode8 = hashCode7 + (l4 != null ? Long.hashCode(l4.longValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.f1407type = this.f1406type;
        builder.scope = this.scope;
        builder.value = this.value;
        builder.first_verified_at_ms = this.first_verified_at_ms;
        builder.last_verified_at_ms = this.last_verified_at_ms;
        builder.created_at = this.created_at;
        builder.updated_at = this.updated_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AliasType aliasType = this.f1406type;
        if (aliasType != null) {
            arrayList.add("type=" + aliasType);
        }
        String str = this.scope;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "scope=", arrayList);
        }
        if (this.value != null) {
            arrayList.add("value=██");
        }
        Long l = this.first_verified_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("first_verified_at_ms=", l, arrayList);
        }
        Long l2 = this.last_verified_at_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_verified_at_ms=", l2, arrayList);
        }
        Long l3 = this.created_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l3, arrayList);
        }
        Long l4 = this.updated_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Alias{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Object created_at;
        public Serializable first_verified_at_ms;
        public Object last_verified_at_ms;
        public Serializable scope;

        /* renamed from: type, reason: collision with root package name */
        public Object f1407type;
        public Object updated_at;
        public Object value;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 8:
                    this.created_at = EmptyList.INSTANCE;
                    break;
                case 9:
                default:
                    this.created_at = EmptyList.INSTANCE;
                    break;
                case 10:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.f1407type = emptyList;
                    this.value = emptyList;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Alias((AliasType) this.f1407type, (String) this.scope, (String) this.value, (Long) this.first_verified_at_ms, (Long) this.last_verified_at_ms, (Long) this.created_at, (Long) this.updated_at, buildUnknownFields());
                case 1:
                    return new DocumentCategoryEntity((String) this.scope, (String) this.value, (String) this.f1407type, (Integer) this.first_verified_at_ms, (DocumentCategoryEntity.RenderStyle) this.last_verified_at_ms, (VersionData) this.created_at, (LocalizableString) this.updated_at, buildUnknownFields());
                case 2:
                    return new LinkCardResponse((ResponseContext) this.f1407type, (LinkCardResponse.Status) this.first_verified_at_ms, (FieldName) this.last_verified_at_ms, (String) this.scope, (String) this.value, (Instrument) this.created_at, (String) this.updated_at, buildUnknownFields());
                case 3:
                    return new RefreshSessionResponse((RefreshSessionResponse.Status) this.f1407type, (String) this.scope, (String) this.value, (String) this.first_verified_at_ms, (String) this.last_verified_at_ms, (String) this.created_at, (String) this.updated_at, buildUnknownFields());
                case 4:
                    return new UploadFileRequest((RequestContext) this.f1407type, (String) this.scope, (ByteString) this.first_verified_at_ms, (String) this.value, (FileCategory) this.last_verified_at_ms, (List) this.created_at, (String) this.updated_at, buildUnknownFields());
                case 5:
                    return new BalanceData.Dialog((String) this.scope, (LocalizableString) this.f1407type, (String) this.value, (LocalizableString) this.first_verified_at_ms, (BalanceData.Dialog.Button) this.last_verified_at_ms, (BalanceData.Dialog.Button) this.created_at, (BalanceData.Dialog.Button) this.updated_at, buildUnknownFields());
                case 6:
                    return new P2pPoolRenderData((String) this.scope, (String) this.value, (String) this.f1407type, (Avatar) this.first_verified_at_ms, (Money) this.last_verified_at_ms, (Money) this.created_at, (P2pPoolRenderData.PoolState) this.updated_at, buildUnknownFields());
                case 7:
                    return new PaymentPlanEligibilityRenderData.EligibleUiData((PaymentPlanEligibilityRenderData.LoanDuration) this.f1407type, (String) this.scope, (Money) this.first_verified_at_ms, (Boolean) this.last_verified_at_ms, (String) this.value, (Money) this.created_at, (Boolean) this.updated_at, buildUnknownFields());
                case 8:
                    return new SetPasscodeRequest((RequestContext) this.f1407type, (String) this.scope, (String) this.value, (String) this.first_verified_at_ms, (String) this.last_verified_at_ms, (List) this.created_at, (String) this.updated_at, buildUnknownFields());
                case 9:
                    return new StatusResultButton((StatusResultButton.ButtonAction) this.f1407type, (String) this.scope, (LocalizableString) this.first_verified_at_ms, (String) this.value, (ClientScenario) this.last_verified_at_ms, (String) this.created_at, (BlockerAction) this.updated_at, buildUnknownFields());
                case 10:
                    return new SyncEntitiesResponse((List) this.f1407type, (Boolean) this.scope, (Long) this.first_verified_at_ms, (List) this.value, (Boolean) this.last_verified_at_ms, (SyncEntitiesResponse.RefreshAllEntitiesType) this.created_at, (Boolean) this.updated_at, buildUnknownFields());
                case 11:
                    return new SyncInvestmentHolding((String) this.scope, (String) this.value, (Money) this.f1407type, (SyncInvestmentHolding.InvestmentHoldingState) this.first_verified_at_ms, (ScheduledReloadData) this.last_verified_at_ms, (SyncInvestmentHolding.DailyGainParams) this.created_at, (Money) this.updated_at, buildUnknownFields());
                case 12:
                    return new BrowserInteraction((Long) this.first_verified_at_ms, (String) this.scope, (String) this.value, (List) this.f1407type, (String) this.last_verified_at_ms, (String) this.created_at, (Headers) this.updated_at, buildUnknownFields());
                case 13:
                    return new CreditLine.CreditLineStatusData((CreditLine.CreditLineStatusData.Icon) this.f1407type, (String) this.scope, (String) this.value, (Boolean) this.first_verified_at_ms, (zzeb) this.last_verified_at_ms, (LocalizableString) this.created_at, (LocalizableString) this.updated_at, buildUnknownFields());
                case 14:
                    return new InitiateLoanPaymentRequest((RequestContext) this.f1407type, (String) this.scope, (String) this.value, (Money) this.first_verified_at_ms, (Money) this.last_verified_at_ms, (String) this.created_at, (String) this.updated_at, buildUnknownFields());
                case 15:
                    return new LoyaltyProgram((String) this.scope, (String) this.value, (ProgramRewards) this.f1407type, (LoyaltyUnit) this.first_verified_at_ms, (String) this.last_verified_at_ms, (String) this.created_at, (String) this.updated_at, buildUnknownFields());
                case 16:
                    return new ResolvePersonaDidvBlockerRequest((RequestContext) this.f1407type, (ResolvePersonaDidvBlockerRequest.InquiryResponse) this.first_verified_at_ms, (String) this.scope, (String) this.value, (String) this.last_verified_at_ms, (String) this.created_at, (Boolean) this.updated_at, buildUnknownFields());
                case 17:
                    return new ContactOption((SupportContactType) this.f1407type, (Boolean) this.first_verified_at_ms, (String) this.scope, (String) this.value, (String) this.last_verified_at_ms, (Boolean) this.created_at, (String) this.updated_at, buildUnknownFields());
                case 18:
                    return new CreateSupportCaseRequest((String) this.scope, (String) this.value, (SupportContactType) this.f1407type, (String) this.first_verified_at_ms, (String) this.last_verified_at_ms, (String) this.created_at, (Boolean) this.updated_at, buildUnknownFields());
                case 19:
                    return new CustomerData((CustomerData.State) this.f1407type, (Region) this.value, (CustomerData.IDVStatus) this.last_verified_at_ms, (Boolean) this.created_at, (Boolean) this.updated_at, (String) this.scope, (Long) this.first_verified_at_ms, buildUnknownFields());
                case 20:
                    return new CashInRequest((RequestContext) this.f1407type, (String) this.scope, (Instrument) this.first_verified_at_ms, (Instrument) this.last_verified_at_ms, (Money) this.created_at, (String) this.value, (DigitalWalletType) this.updated_at, buildUnknownFields());
                case 21:
                    return new Person((String) this.scope, (Long) this.first_verified_at_ms, (Long) this.last_verified_at_ms, (Long) this.created_at, (List) this.f1407type, (List) this.value, (List) this.updated_at, buildUnknownFields());
                case 22:
                    return new LaborCalculationSummary((LocalDateTimeRange) this.f1407type, (Money) this.scope, (Long) this.first_verified_at_ms, (Money) this.value, (List) this.last_verified_at_ms, (List) this.created_at, (List) this.updated_at, buildUnknownFields());
                case 23:
                    return new TimeOff((String) this.scope, (String) this.value, (String) this.f1407type, (String) this.first_verified_at_ms, (String) this.last_verified_at_ms, (zzkn) this.created_at, (TimeOff.State) this.updated_at, buildUnknownFields());
                case 24:
                    return new Task((String) this.scope, (String) this.value, (String) this.f1407type, (TaskType) this.first_verified_at_ms, (TaskStatus) this.last_verified_at_ms, (TargetEntity) this.created_at, (Task.Metadata) this.updated_at, buildUnknownFields());
                case 25:
                    return new CashGreenV1((CashGreenV1.Status) this.f1407type, (Long) this.first_verified_at_ms, (List) this.last_verified_at_ms, (String) this.scope, (CashGreenV1.StatusMethod) this.created_at, (RiskStatus) this.updated_at, (String) this.value, buildUnknownFields());
                case 26:
                    return new CryptoEligibilities((CryptoEligibilityStatus) this.f1407type, (CryptoEligibilityStatus) this.scope, (CryptoEligibilityStatus) this.value, (CryptoEligibilityStatus) this.first_verified_at_ms, (CryptoEligibilityStatus) this.last_verified_at_ms, (CryptoEligibilityStatus) this.created_at, (CryptoEligibilityStatus) this.updated_at, buildUnknownFields());
                case 27:
                    return new SavingsFolderV2((AeMode.Companion) this.f1407type, (Money) this.first_verified_at_ms, (String) this.scope, (String) this.value, (String) this.last_verified_at_ms, (String) this.created_at, (String) this.updated_at, buildUnknownFields());
                case 28:
                    return new SavingsHome((SavingsHome.SavingsOptionsSection) this.f1407type, (SavingsHome.ActivitySection) this.scope, (SavingsHome.TransfersSection) this.value, (Card) this.first_verified_at_ms, (SavingsHome.Header) this.last_verified_at_ms, (SavingsHome.Footer) this.created_at, (CompactCard) this.updated_at, buildUnknownFields());
                default:
                    return new FolderList((LocalizedString) this.f1407type, (LocalizedString) this.value, (FolderList.LocalizedTemplateString) this.first_verified_at_ms, (ClientRouteTemplate) this.last_verified_at_ms, (String) this.scope, (LocalizedString) this.created_at, (CdfEvent) this.updated_at, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
