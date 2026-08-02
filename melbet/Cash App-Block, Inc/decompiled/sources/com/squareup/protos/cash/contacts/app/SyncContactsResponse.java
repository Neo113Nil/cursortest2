package com.squareup.protos.cash.contacts.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.LoanOption;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/contacts/app/SyncContactsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/grantly/api/LoanOption$Builder;", "Builder", "ResponseCode", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SyncContactsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SyncContactsResponse> CREATOR;
    public final Long modified_count;
    public final String patch_id;
    public final ResponseCode response_code;

    public enum ResponseCode implements WireEnum {
        SUCCESS(1),
        RESYNC_NEEDED(2);

        public final int value;
        public static final Alignment.Companion Companion = new Alignment.Companion();
        public static final SyncContactsResponse$ResponseCode$Companion$ADAPTER$1 ADAPTER = new SyncContactsResponse$ResponseCode$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ResponseCode.class), Syntax.PROTO_2, null);

        ResponseCode(int i) {
            this.value = i;
        }

        public static final ResponseCode fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return null;
            }
            return RESYNC_NEEDED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SyncContactsResponse$Companion$ADAPTER$1 syncContactsResponse$Companion$ADAPTER$1 = new SyncContactsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SyncContactsResponse.class), "type.googleapis.com/squareup.cash.contacts.app.SyncContactsResponse", Syntax.PROTO_2, null, "squareup/cash/contacts/app/api.proto");
        ADAPTER = syncContactsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(syncContactsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncContactsResponse(Long l, String str, ResponseCode responseCode, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.modified_count = l;
        this.patch_id = str;
        this.response_code = responseCode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncContactsResponse)) {
            return false;
        }
        SyncContactsResponse syncContactsResponse = (SyncContactsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), syncContactsResponse.unknownFields()) && Intrinsics.areEqual(this.modified_count, syncContactsResponse.modified_count) && Intrinsics.areEqual(this.patch_id, syncContactsResponse.patch_id) && this.response_code == syncContactsResponse.response_code;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.modified_count;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str = this.patch_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ResponseCode responseCode = this.response_code;
        int hashCode4 = hashCode3 + (responseCode != null ? responseCode.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LoanOption.Builder builder = new LoanOption.Builder(3);
        builder.loan_type = this.modified_count;
        builder.payment_schedule = this.patch_id;
        builder.tila_data = this.response_code;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.modified_count;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("modified_count=", l, arrayList);
        }
        String str = this.patch_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "patch_id=", arrayList);
        }
        ResponseCode responseCode = this.response_code;
        if (responseCode != null) {
            arrayList.add("response_code=" + responseCode);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SyncContactsResponse{", "}", 0, null, null, 56);
    }
}
