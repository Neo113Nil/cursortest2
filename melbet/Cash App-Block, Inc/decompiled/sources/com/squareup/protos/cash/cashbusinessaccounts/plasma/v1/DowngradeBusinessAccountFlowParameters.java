package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.notifications.Op;
import com.squareup.protos.cash.api.ResponseMetadata;
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
public final class DowngradeBusinessAccountFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DowngradeBusinessAccountFlowParameters> CREATOR;
    public final EntryPoint entry_point;
    public final String root_flow_token;

    /* loaded from: classes6.dex */
    public enum EntryPoint implements WireEnum {
        REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_TAX_CHANGES_INFO(1),
        REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_FAQ(2),
        IN_APP_BUSINESS_INFO_SECTION(3),
        IN_APP_PERSONAL_SECTION(4),
        IN_APP_EDIT_PROFILE_SECTION(5),
        REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_EMAIL(6),
        REVIEW_BUSINESS_ACCOUNT_TAX_NOTIFICATION_BUSINESS_USE_CASE(7),
        IN_APP_BUSINESS_USE_CASE(8),
        KYB_REMEDIATION_FLOW_UNSUPPORTED(9),
        KYB_REMEDIATION_ELIGIBILITY_UNSUPPORTED(10),
        KYB_REMEDIATION_NON_RETRIABLE_FAILURE(11),
        KYB_REMEDIATION_SQ_ONBOARDING(12),
        IN_APP_FEATURE_RESTRICTION(13),
        KYB_REMEDIATION_NOT_A_BUSINESS(14);

        public final int value;
        public static final Op.Companion Companion = new Op.Companion();
        public static final DowngradeBusinessAccountFlowParameters$EntryPoint$Companion$ADAPTER$1 ADAPTER = new DowngradeBusinessAccountFlowParameters$EntryPoint$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EntryPoint.class), Syntax.PROTO_2, null);

        EntryPoint(int i) {
            this.value = i;
        }

        public static final EntryPoint fromValue(int i) {
            Companion.getClass();
            return Op.Companion.m3674fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        DowngradeBusinessAccountFlowParameters$Companion$ADAPTER$1 downgradeBusinessAccountFlowParameters$Companion$ADAPTER$1 = new DowngradeBusinessAccountFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DowngradeBusinessAccountFlowParameters.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.plasma.v1.DowngradeBusinessAccountFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/plasma/v1/downgrade_business_account_flow.proto");
        ADAPTER = downgradeBusinessAccountFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(downgradeBusinessAccountFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DowngradeBusinessAccountFlowParameters(EntryPoint entryPoint, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entry_point = entryPoint;
        this.root_flow_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DowngradeBusinessAccountFlowParameters)) {
            return false;
        }
        DowngradeBusinessAccountFlowParameters downgradeBusinessAccountFlowParameters = (DowngradeBusinessAccountFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), downgradeBusinessAccountFlowParameters.unknownFields()) && this.entry_point == downgradeBusinessAccountFlowParameters.entry_point && Intrinsics.areEqual(this.root_flow_token, downgradeBusinessAccountFlowParameters.root_flow_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EntryPoint entryPoint = this.entry_point;
        int hashCode2 = (hashCode + (entryPoint != null ? entryPoint.hashCode() : 0)) * 37;
        String str = this.root_flow_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResponseMetadata.Builder builder = new ResponseMetadata.Builder(14);
        builder.errors = this.entry_point;
        builder.result = this.root_flow_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EntryPoint entryPoint = this.entry_point;
        if (entryPoint != null) {
            arrayList.add("entry_point=" + entryPoint);
        }
        String str = this.root_flow_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "root_flow_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DowngradeBusinessAccountFlowParameters{", "}", 0, null, null, 56);
    }

    public /* synthetic */ DowngradeBusinessAccountFlowParameters(EntryPoint entryPoint) {
        this(entryPoint, null, ByteString.EMPTY);
    }
}
