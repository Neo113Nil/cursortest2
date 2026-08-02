package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.cash.api.Error;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateBusinessAccountTaxInfoFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateBusinessAccountTaxInfoFlowParameters> CREATOR;
    public final BusinessAccountSegment business_account_segment;
    public final EntryPoint entry_point;
    public final EntryPointType entry_point_type;
    public final Boolean rerequest;
    public final String root_flow_token;

    public enum EntryPoint implements WireEnum {
        UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_EMAIL(1),
        UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_SMS(2),
        UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_PUSH(3),
        UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_IAM_INLINE(4),
        UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_IAM_POPUP(5),
        IN_APP_BUSINESS_INFO_SECTION(6),
        REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_TAX_CHANGES_INFO(7);

        public final int value;
        public static final Error.Code.Companion Companion = new Error.Code.Companion(23);
        public static final UpdateBusinessAccountTaxInfoFlowParameters$EntryPoint$Companion$ADAPTER$1 ADAPTER = new UpdateBusinessAccountTaxInfoFlowParameters$EntryPoint$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntryPoint.class), Syntax.PROTO_2, null);

        EntryPoint(int i) {
            this.value = i;
        }

        public static final EntryPoint fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 1:
                    return UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_EMAIL;
                case 2:
                    return UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_SMS;
                case 3:
                    return UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_PUSH;
                case 4:
                    return UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_IAM_INLINE;
                case 5:
                    return UPDATE_BUSINESS_ACCOUNT_TAX_INFO_NOTIFICATION_IAM_POPUP;
                case 6:
                    return IN_APP_BUSINESS_INFO_SECTION;
                case 7:
                    return REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_TAX_CHANGES_INFO;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        UpdateBusinessAccountTaxInfoFlowParameters$Companion$ADAPTER$1 updateBusinessAccountTaxInfoFlowParameters$Companion$ADAPTER$1 = new UpdateBusinessAccountTaxInfoFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateBusinessAccountTaxInfoFlowParameters.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.plasma.v1.UpdateBusinessAccountTaxInfoFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/plasma/v1/update_business_account_tax_info_flow.proto");
        ADAPTER = updateBusinessAccountTaxInfoFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateBusinessAccountTaxInfoFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateBusinessAccountTaxInfoFlowParameters(EntryPointType entryPointType, BusinessAccountSegment businessAccountSegment, String str, EntryPoint entryPoint, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entry_point_type = entryPointType;
        this.business_account_segment = businessAccountSegment;
        this.root_flow_token = str;
        this.entry_point = entryPoint;
        this.rerequest = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateBusinessAccountTaxInfoFlowParameters)) {
            return false;
        }
        UpdateBusinessAccountTaxInfoFlowParameters updateBusinessAccountTaxInfoFlowParameters = (UpdateBusinessAccountTaxInfoFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), updateBusinessAccountTaxInfoFlowParameters.unknownFields()) && this.entry_point_type == updateBusinessAccountTaxInfoFlowParameters.entry_point_type && this.business_account_segment == updateBusinessAccountTaxInfoFlowParameters.business_account_segment && Intrinsics.areEqual(this.root_flow_token, updateBusinessAccountTaxInfoFlowParameters.root_flow_token) && this.entry_point == updateBusinessAccountTaxInfoFlowParameters.entry_point && Intrinsics.areEqual(this.rerequest, updateBusinessAccountTaxInfoFlowParameters.rerequest);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EntryPointType entryPointType = this.entry_point_type;
        int hashCode2 = (hashCode + (entryPointType != null ? entryPointType.hashCode() : 0)) * 37;
        BusinessAccountSegment businessAccountSegment = this.business_account_segment;
        int hashCode3 = (hashCode2 + (businessAccountSegment != null ? businessAccountSegment.hashCode() : 0)) * 37;
        String str = this.root_flow_token;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        EntryPoint entryPoint = this.entry_point;
        int hashCode5 = (hashCode4 + (entryPoint != null ? entryPoint.hashCode() : 0)) * 37;
        Boolean bool = this.rerequest;
        int hashCode6 = hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(27);
        builder.for_each = this.entry_point_type;
        builder.moneybot_scaffold = this.business_account_segment;
        builder.compose_platform = this.root_flow_token;
        builder.is_included = this.entry_point;
        builder.motion = this.rerequest;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EntryPointType entryPointType = this.entry_point_type;
        if (entryPointType != null) {
            arrayList.add("entry_point_type=" + entryPointType);
        }
        BusinessAccountSegment businessAccountSegment = this.business_account_segment;
        if (businessAccountSegment != null) {
            arrayList.add("business_account_segment=" + businessAccountSegment);
        }
        String str = this.root_flow_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "root_flow_token=", arrayList);
        }
        EntryPoint entryPoint = this.entry_point;
        if (entryPoint != null) {
            arrayList.add("entry_point=" + entryPoint);
        }
        Boolean bool = this.rerequest;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("rerequest=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateBusinessAccountTaxInfoFlowParameters{", "}", 0, null, null, 56);
    }
}
