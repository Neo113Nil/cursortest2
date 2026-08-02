package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/franklin/app/SetAppLockActivatedResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/bankbook/Institution$Builder;", "Builder", "Status", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SetAppLockActivatedResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetAppLockActivatedResponse> CREATOR;
    public final String passcode_token;
    public final ResponseContext response_context;
    public final Status status;

    public enum Status implements WireEnum {
        INVALID(0),
        SUCCESS(1),
        INVALID_PASSCODE_TOKEN(2),
        INVALID_PASSCODE(3),
        TOO_MANY_ATTEMPTS(4),
        OP_NOT_PERMITTED(5);

        public static final SetAppLockActivatedResponse$Status$Companion$ADAPTER$1 ADAPTER;
        public static final ActionType.Companion Companion;
        public final int value;

        static {
            Status status = INVALID;
            Companion = new ActionType.Companion();
            ADAPTER = new SetAppLockActivatedResponse$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            return ActionType.Companion.m3939fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SetAppLockActivatedResponse$Companion$ADAPTER$1 setAppLockActivatedResponse$Companion$ADAPTER$1 = new SetAppLockActivatedResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SetAppLockActivatedResponse.class), "type.googleapis.com/squareup.franklin.app.SetAppLockActivatedResponse", Syntax.PROTO_2, null, "squareup/franklin/app/app_lock.proto");
        ADAPTER = setAppLockActivatedResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(setAppLockActivatedResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetAppLockActivatedResponse(ResponseContext responseContext, Status status, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.status = status;
        this.passcode_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetAppLockActivatedResponse)) {
            return false;
        }
        SetAppLockActivatedResponse setAppLockActivatedResponse = (SetAppLockActivatedResponse) obj;
        return Intrinsics.areEqual(unknownFields(), setAppLockActivatedResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, setAppLockActivatedResponse.response_context) && this.status == setAppLockActivatedResponse.status && Intrinsics.areEqual(this.passcode_token, setAppLockActivatedResponse.passcode_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode3 = (hashCode2 + (status != null ? status.hashCode() : 0)) * 37;
        String str = this.passcode_token;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Institution.Builder builder = new Institution.Builder(2, false);
        builder.display_info = this.response_context;
        builder.help_menu_items = this.status;
        builder.institution_token = this.passcode_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        if (this.passcode_token != null) {
            arrayList.add("passcode_token=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetAppLockActivatedResponse{", "}", 0, null, null, 56);
    }
}
