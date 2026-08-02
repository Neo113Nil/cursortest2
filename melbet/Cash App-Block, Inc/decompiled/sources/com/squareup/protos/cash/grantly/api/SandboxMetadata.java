package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.sandbox.MagicValue;
import com.squareup.protos.cash.customersearch.api.SearchCommonTextRowSection;
import com.squareup.protos.cash.customersearch.api.SelectionList;
import com.squareup.protos.cash.customersearch.api.ShopSearchBrandsResponse;
import com.squareup.protos.cash.customersearch.api.ShopSearchProductFiltersResponse;
import com.squareup.protos.cash.customersearch.api.ShopSearchResponse;
import com.squareup.protos.cash.dataprivacy.settings.DataPrivacySettings;
import com.squareup.protos.cash.deviceintegritly.api.GetSignedCertificateResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarSection;
import com.squareup.protos.cash.discover.api.app.v1.model.CardSection;
import com.squareup.protos.cash.discover.api.app.v1.model.RowSection;
import com.squareup.protos.cash.discover.api.app.v2.api.GetMoneyTabAppletsResponse;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchResponse;
import com.squareup.protos.cash.familynotifications.api.v1.ListNotificationSettingsResponse;
import com.squareup.protos.cash.familynotifications.api.v1.UpdateNotificationSettingsResponse;
import com.squareup.protos.cash.genericelements.ui.CardSeriesContainer;
import com.squareup.protos.cash.genericelements.ui.RefreshTrigger;
import com.squareup.protos.cash.grantly.api.SessionScope;
import com.squareup.protos.cash.groups.GroupParticipant;
import com.squareup.protos.cash.incidentalerts.app.v1.GetIncidentsListResponse;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.protos.cash.janus.api.GetAccountsResponse;
import com.squareup.protos.cash.janus.api.GetAuthorizedAccountsResponse;
import com.squareup.protos.cash.janus.api.GetContactAliasesResponse;
import com.squareup.protos.cash.janus.api.GetWebAuthnCredentialsResponse;
import com.squareup.protos.cash.janus.syncvalues.SyncValueAccounts;
import com.squareup.protos.cash.librarian.api.LegalDocumentsResponse;
import com.squareup.protos.cash.local.client.app.v1.GetActiveOffersResponse;
import com.squareup.protos.cash.local.client.app.v1.GetOffersResponse;
import com.squareup.protos.cash.local.client.app.v1.GetStaffBrandDetailsRequest;
import com.squareup.wire.AndroidMessage;
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

/* loaded from: classes7.dex */
public final class SandboxMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SandboxMetadata> CREATOR;
    public final List scenarios;

    public final class Scenario extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Scenario> CREATOR;
        public final MagicValue magic_value;

        static {
            SandboxMetadata$Scenario$Companion$ADAPTER$1 sandboxMetadata$Scenario$Companion$ADAPTER$1 = new SandboxMetadata$Scenario$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Scenario.class), "type.googleapis.com/squareup.cash.grantly.api.SandboxMetadata.Scenario", Syntax.PROTO_2, null, "squareup/cash/grantly/api/sandbox_metadata.proto");
            ADAPTER = sandboxMetadata$Scenario$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(sandboxMetadata$Scenario$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Scenario(MagicValue magicValue, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.magic_value = magicValue;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Scenario)) {
                return false;
            }
            Scenario scenario = (Scenario) obj;
            return Intrinsics.areEqual(unknownFields(), scenario.unknownFields()) && this.magic_value == scenario.magic_value;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            MagicValue magicValue = this.magic_value;
            int hashCode2 = hashCode + (magicValue != null ? magicValue.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GroupParticipant.Builder builder = new GroupParticipant.Builder(1);
            builder.f1276type = this.magic_value;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            MagicValue magicValue = this.magic_value;
            if (magicValue != null) {
                arrayList.add("magic_value=" + magicValue);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Scenario{", "}", 0, null, null, 56);
        }
    }

    static {
        SandboxMetadata$Companion$ADAPTER$1 sandboxMetadata$Companion$ADAPTER$1 = new SandboxMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SandboxMetadata.class), "type.googleapis.com/squareup.cash.grantly.api.SandboxMetadata", Syntax.PROTO_2, null, "squareup/cash/grantly/api/sandbox_metadata.proto");
        ADAPTER = sandboxMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sandboxMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxMetadata(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.scenarios = TransactorKt.immutableCopyOf("scenarios", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SandboxMetadata)) {
            return false;
        }
        SandboxMetadata sandboxMetadata = (SandboxMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), sandboxMetadata.unknownFields()) && Intrinsics.areEqual(this.scenarios, sandboxMetadata.scenarios);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.scenarios.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0, false);
        builder.scenarios = this.scenarios;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.scenarios;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("scenarios=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SandboxMetadata{", "}", 0, null, null, 56);
    }

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List scenarios;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 25:
                    this.scenarios = EmptyList.INSTANCE;
                    break;
                case 29:
                    this.scenarios = EmptyList.INSTANCE;
                    break;
                default:
                    this.scenarios = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SandboxMetadata(this.scenarios, buildUnknownFields());
                case 1:
                    return new SearchCommonTextRowSection(this.scenarios, buildUnknownFields());
                case 2:
                    return new SelectionList(this.scenarios, buildUnknownFields());
                case 3:
                    return new ShopSearchBrandsResponse(this.scenarios, buildUnknownFields());
                case 4:
                    return new ShopSearchProductFiltersResponse(this.scenarios, buildUnknownFields());
                case 5:
                    return new ShopSearchResponse(this.scenarios, buildUnknownFields());
                case 6:
                    return new DataPrivacySettings(this.scenarios, buildUnknownFields());
                case 7:
                    return new GetSignedCertificateResponse(this.scenarios, buildUnknownFields());
                case 8:
                    return new AvatarSection(this.scenarios, buildUnknownFields());
                case 9:
                    return new CardSection(this.scenarios, buildUnknownFields());
                case 10:
                    return new RowSection(this.scenarios, buildUnknownFields());
                case 11:
                    return new GetMoneyTabAppletsResponse(this.scenarios, buildUnknownFields());
                case 12:
                    return new SearchResponse(this.scenarios, buildUnknownFields());
                case 13:
                    return new ListNotificationSettingsResponse(this.scenarios, buildUnknownFields());
                case 14:
                    return new UpdateNotificationSettingsResponse(this.scenarios, buildUnknownFields());
                case 15:
                    return new CardSeriesContainer(this.scenarios, buildUnknownFields());
                case 16:
                    return new RefreshTrigger.BoostContentUpdateTrigger(this.scenarios, buildUnknownFields());
                case 17:
                    return new SessionScope.RequestsDecideScopeDetails(this.scenarios, buildUnknownFields());
                case 18:
                    return new GetIncidentsListResponse(this.scenarios, buildUnknownFields());
                case 19:
                    return new SubmitInvestmentEntitySelectionRequest.SelectionAction(this.scenarios, buildUnknownFields());
                case 20:
                    return new GetAccountSettingsResponse(this.scenarios, buildUnknownFields());
                case 21:
                    return new GetAccountsResponse(this.scenarios, buildUnknownFields());
                case 22:
                    return new GetAuthorizedAccountsResponse(this.scenarios, buildUnknownFields());
                case 23:
                    return new GetContactAliasesResponse(this.scenarios, buildUnknownFields());
                case 24:
                    return new GetWebAuthnCredentialsResponse(this.scenarios, buildUnknownFields());
                case 25:
                    return new SyncValueAccounts(this.scenarios, buildUnknownFields());
                case 26:
                    return new LegalDocumentsResponse(this.scenarios, buildUnknownFields());
                case 27:
                    return new GetActiveOffersResponse(this.scenarios, buildUnknownFields());
                case 28:
                    return new GetOffersResponse(this.scenarios, buildUnknownFields());
                default:
                    return new GetStaffBrandDetailsRequest(this.scenarios, buildUnknownFields());
            }
        }

        public /* synthetic */ Builder(int i, boolean z) {
            this.$r8$classId = i;
        }
    }
}
