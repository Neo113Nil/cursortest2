package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessageByTemplateTokenRequest;
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
public final class StartTimecardBreakRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartTimecardBreakRequest> CREATOR;
    public final String break_definition_token;
    public final String merchant_token;
    public final String timecard_token;
    public final Long version_number;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String break_definition_token;
        public String merchant_token;
        public String timecard_token;
        public Long version_number;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new StartTimecardBreakRequest(this.merchant_token, this.timecard_token, this.break_definition_token, this.version_number, buildUnknownFields());
                default:
                    return new GetAppMessageByTemplateTokenRequest(this.merchant_token, this.timecard_token, this.break_definition_token, this.version_number, buildUnknownFields());
            }
        }
    }

    static {
        StartTimecardBreakRequest$Companion$ADAPTER$1 startTimecardBreakRequest$Companion$ADAPTER$1 = new StartTimecardBreakRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StartTimecardBreakRequest.class), "type.googleapis.com/squareup.timecards.StartTimecardBreakRequest", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = startTimecardBreakRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(startTimecardBreakRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartTimecardBreakRequest(String str, String str2, String str3, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.merchant_token = str;
        this.timecard_token = str2;
        this.break_definition_token = str3;
        this.version_number = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartTimecardBreakRequest)) {
            return false;
        }
        StartTimecardBreakRequest startTimecardBreakRequest = (StartTimecardBreakRequest) obj;
        return Intrinsics.areEqual(unknownFields(), startTimecardBreakRequest.unknownFields()) && Intrinsics.areEqual(this.merchant_token, startTimecardBreakRequest.merchant_token) && Intrinsics.areEqual(this.timecard_token, startTimecardBreakRequest.timecard_token) && Intrinsics.areEqual(this.break_definition_token, startTimecardBreakRequest.break_definition_token) && Intrinsics.areEqual(this.version_number, startTimecardBreakRequest.version_number);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.merchant_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.timecard_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.break_definition_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.version_number;
        int hashCode5 = hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.merchant_token = this.merchant_token;
        builder.timecard_token = this.timecard_token;
        builder.break_definition_token = this.break_definition_token;
        builder.version_number = this.version_number;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        String str2 = this.timecard_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "timecard_token=", arrayList);
        }
        String str3 = this.break_definition_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "break_definition_token=", arrayList);
        }
        Long l = this.version_number;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version_number=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartTimecardBreakRequest{", "}", 0, null, null, 56);
    }
}
