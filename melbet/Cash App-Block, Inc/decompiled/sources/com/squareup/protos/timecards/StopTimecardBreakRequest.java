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
public final class StopTimecardBreakRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StopTimecardBreakRequest> CREATOR;
    public final String merchant_token;
    public final String timecard_break_token;

    static {
        StopTimecardBreakRequest$Companion$ADAPTER$1 stopTimecardBreakRequest$Companion$ADAPTER$1 = new StopTimecardBreakRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StopTimecardBreakRequest.class), "type.googleapis.com/squareup.timecards.StopTimecardBreakRequest", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = stopTimecardBreakRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(stopTimecardBreakRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTimecardBreakRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.merchant_token = str;
        this.timecard_break_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StopTimecardBreakRequest)) {
            return false;
        }
        StopTimecardBreakRequest stopTimecardBreakRequest = (StopTimecardBreakRequest) obj;
        return Intrinsics.areEqual(unknownFields(), stopTimecardBreakRequest.unknownFields()) && Intrinsics.areEqual(this.merchant_token, stopTimecardBreakRequest.merchant_token) && Intrinsics.areEqual(this.timecard_break_token, stopTimecardBreakRequest.timecard_break_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.merchant_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.timecard_break_token;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(21);
        builder.server = this.merchant_token;
        builder.local = this.timecard_break_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        String str2 = this.timecard_break_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "timecard_break_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StopTimecardBreakRequest{", "}", 0, null, null, 56);
    }
}
