package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class BatchGetTimecardBreakDefinitionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BatchGetTimecardBreakDefinitionRequest> CREATOR;
    public final String merchant_token;
    public final String unit_token;

    static {
        BatchGetTimecardBreakDefinitionRequest$Companion$ADAPTER$1 batchGetTimecardBreakDefinitionRequest$Companion$ADAPTER$1 = new BatchGetTimecardBreakDefinitionRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BatchGetTimecardBreakDefinitionRequest.class), "type.googleapis.com/squareup.timecards.BatchGetTimecardBreakDefinitionRequest", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = batchGetTimecardBreakDefinitionRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(batchGetTimecardBreakDefinitionRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchGetTimecardBreakDefinitionRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.merchant_token = str;
        this.unit_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchGetTimecardBreakDefinitionRequest)) {
            return false;
        }
        BatchGetTimecardBreakDefinitionRequest batchGetTimecardBreakDefinitionRequest = (BatchGetTimecardBreakDefinitionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), batchGetTimecardBreakDefinitionRequest.unknownFields()) && Intrinsics.areEqual(this.merchant_token, batchGetTimecardBreakDefinitionRequest.merchant_token) && Intrinsics.areEqual(this.unit_token, batchGetTimecardBreakDefinitionRequest.unit_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.merchant_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.unit_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(18);
        builder.server = this.merchant_token;
        builder.local = this.unit_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        String str2 = this.unit_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "unit_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchGetTimecardBreakDefinitionRequest{", "}", 0, null, null, 56);
    }
}
