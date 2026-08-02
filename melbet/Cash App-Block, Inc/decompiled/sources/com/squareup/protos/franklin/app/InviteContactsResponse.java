package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/InviteContactsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/UiAlias$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InviteContactsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InviteContactsResponse> CREATOR;
    public final List invitation_tokens;
    public final ResponseContext response_context;
    public final List unsent_email_addresses;

    static {
        InviteContactsResponse$Companion$ADAPTER$1 inviteContactsResponse$Companion$ADAPTER$1 = new InviteContactsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InviteContactsResponse.class), "type.googleapis.com/squareup.franklin.app.InviteContactsResponse", Syntax.PROTO_2, null, "squareup/franklin/app/contacts.proto");
        ADAPTER = inviteContactsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inviteContactsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteContactsResponse(ResponseContext responseContext, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.response_context = responseContext;
        this.unsent_email_addresses = TransactorKt.immutableCopyOf("unsent_email_addresses", list);
        this.invitation_tokens = TransactorKt.immutableCopyOf("invitation_tokens", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteContactsResponse)) {
            return false;
        }
        InviteContactsResponse inviteContactsResponse = (InviteContactsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), inviteContactsResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, inviteContactsResponse.response_context) && Intrinsics.areEqual(this.unsent_email_addresses, inviteContactsResponse.unsent_email_addresses) && Intrinsics.areEqual(this.invitation_tokens, inviteContactsResponse.invitation_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = this.invitation_tokens.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37, 37, this.unsent_email_addresses);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(26);
        builder.f1364type = this.response_context;
        builder.canonical_text = this.unsent_email_addresses;
        builder.formatted = this.invitation_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        if (!this.unsent_email_addresses.isEmpty()) {
            arrayList.add("unsent_email_addresses=██");
        }
        List list = this.invitation_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("invitation_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InviteContactsResponse{", "}", 0, null, null, 56);
    }
}
