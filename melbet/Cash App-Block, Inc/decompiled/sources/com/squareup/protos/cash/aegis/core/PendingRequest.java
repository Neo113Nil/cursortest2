package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.Node;
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

/* loaded from: classes7.dex */
public final class PendingRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PendingRequest> CREATOR;
    public final String activity_row_id;
    public final ViewRequestLink request_action_link;
    public final String requester_customer_token;
    public final String subtitle;
    public final String title;

    static {
        PendingRequest$Companion$ADAPTER$1 pendingRequest$Companion$ADAPTER$1 = new PendingRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PendingRequest.class), "type.googleapis.com/squareup.cash.aegis.core.PendingRequest", Syntax.PROTO_2, null, "squareup/cash/aegis/core/FamilyAccountsParameters.proto");
        ADAPTER = pendingRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(pendingRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingRequest(String str, String str2, String str3, ViewRequestLink viewRequestLink, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.requester_customer_token = str2;
        this.subtitle = str3;
        this.request_action_link = viewRequestLink;
        this.activity_row_id = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PendingRequest)) {
            return false;
        }
        PendingRequest pendingRequest = (PendingRequest) obj;
        return Intrinsics.areEqual(unknownFields(), pendingRequest.unknownFields()) && Intrinsics.areEqual(this.title, pendingRequest.title) && Intrinsics.areEqual(this.requester_customer_token, pendingRequest.requester_customer_token) && Intrinsics.areEqual(this.subtitle, pendingRequest.subtitle) && Intrinsics.areEqual(this.request_action_link, pendingRequest.request_action_link) && Intrinsics.areEqual(this.activity_row_id, pendingRequest.activity_row_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.requester_customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.subtitle;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ViewRequestLink viewRequestLink = this.request_action_link;
        int hashCode5 = (hashCode4 + (viewRequestLink != null ? viewRequestLink.hashCode() : 0)) * 37;
        String str4 = this.activity_row_id;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Node.Builder builder = new Node.Builder(15);
        builder.for_each = this.title;
        builder.moneybot_scaffold = this.requester_customer_token;
        builder.compose_platform = this.subtitle;
        builder.is_included = this.request_action_link;
        builder.motion = this.activity_row_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.title != null) {
            arrayList.add("title=██");
        }
        String str = this.requester_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "requester_customer_token=", arrayList);
        }
        if (this.subtitle != null) {
            arrayList.add("subtitle=██");
        }
        ViewRequestLink viewRequestLink = this.request_action_link;
        if (viewRequestLink != null) {
            arrayList.add("request_action_link=" + viewRequestLink);
        }
        String str2 = this.activity_row_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "activity_row_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PendingRequest{", "}", 0, null, null, 56);
    }
}
