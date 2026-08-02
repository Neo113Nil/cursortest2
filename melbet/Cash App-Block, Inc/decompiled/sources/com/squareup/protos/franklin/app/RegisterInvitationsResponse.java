package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.franklin.app.BankingConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/RegisterInvitationsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/BankingConfig$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RegisterInvitationsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RegisterInvitationsResponse> CREATOR;
    public final List invitation_tokens;
    public final Status status;

    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1);

        public static final RegisterInvitationsResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new ActionType.Companion();
            ADAPTER = new RegisterInvitationsResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return INVALID;
            }
            if (i != 1) {
                return null;
            }
            return SUCCESS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        RegisterInvitationsResponse$Companion$ADAPTER$1 registerInvitationsResponse$Companion$ADAPTER$1 = new RegisterInvitationsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RegisterInvitationsResponse.class), "type.googleapis.com/squareup.franklin.app.RegisterInvitationsResponse", Syntax.PROTO_2, null, "squareup/franklin/app/invitations.proto");
        ADAPTER = registerInvitationsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(registerInvitationsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterInvitationsResponse(Status status, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.status = status;
        this.invitation_tokens = TransactorKt.immutableCopyOf("invitation_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterInvitationsResponse)) {
            return false;
        }
        RegisterInvitationsResponse registerInvitationsResponse = (RegisterInvitationsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), registerInvitationsResponse.unknownFields()) && this.status == registerInvitationsResponse.status && Intrinsics.areEqual(this.invitation_tokens, registerInvitationsResponse.invitation_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = this.invitation_tokens.hashCode() + ((hashCode + (status != null ? status.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BankingConfig.Builder builder = new BankingConfig.Builder(27);
        builder.strings = this.status;
        builder.recurring_deposits_dda_upsell = this.invitation_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        List list = this.invitation_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("invitation_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RegisterInvitationsResponse{", "}", 0, null, null, 56);
    }
}
