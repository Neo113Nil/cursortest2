package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class RecipientConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecipientConfig> CREATOR;
    public final Boolean confirm_cashtag_recipients;
    public final SuggestedRecipientsData pay_data;
    public final SuggestedRecipientsData request_data;

    static {
        RecipientConfig$Companion$ADAPTER$1 recipientConfig$Companion$ADAPTER$1 = new RecipientConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecipientConfig.class), "type.googleapis.com/squareup.franklin.common.RecipientConfig", Syntax.PROTO_2, null, "squareup/franklin/common/recipient.proto");
        ADAPTER = recipientConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recipientConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecipientConfig(SuggestedRecipientsData suggestedRecipientsData, SuggestedRecipientsData suggestedRecipientsData2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.pay_data = suggestedRecipientsData;
        this.request_data = suggestedRecipientsData2;
        this.confirm_cashtag_recipients = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecipientConfig)) {
            return false;
        }
        RecipientConfig recipientConfig = (RecipientConfig) obj;
        return Intrinsics.areEqual(unknownFields(), recipientConfig.unknownFields()) && Intrinsics.areEqual(this.pay_data, recipientConfig.pay_data) && Intrinsics.areEqual(this.request_data, recipientConfig.request_data) && Intrinsics.areEqual(this.confirm_cashtag_recipients, recipientConfig.confirm_cashtag_recipients);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SuggestedRecipientsData suggestedRecipientsData = this.pay_data;
        int hashCode2 = (hashCode + (suggestedRecipientsData != null ? suggestedRecipientsData.hashCode() : 0)) * 37;
        SuggestedRecipientsData suggestedRecipientsData2 = this.request_data;
        int hashCode3 = (hashCode2 + (suggestedRecipientsData2 != null ? suggestedRecipientsData2.hashCode() : 0)) * 37;
        Boolean bool = this.confirm_cashtag_recipients;
        int hashCode4 = hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(26, false);
        builder.institution_token = this.pay_data;
        builder.display_info = this.request_data;
        builder.help_menu_items = this.confirm_cashtag_recipients;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SuggestedRecipientsData suggestedRecipientsData = this.pay_data;
        if (suggestedRecipientsData != null) {
            arrayList.add("pay_data=" + suggestedRecipientsData);
        }
        SuggestedRecipientsData suggestedRecipientsData2 = this.request_data;
        if (suggestedRecipientsData2 != null) {
            arrayList.add("request_data=" + suggestedRecipientsData2);
        }
        Boolean bool = this.confirm_cashtag_recipients;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("confirm_cashtag_recipients=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecipientConfig{", "}", 0, null, null, 56);
    }
}
