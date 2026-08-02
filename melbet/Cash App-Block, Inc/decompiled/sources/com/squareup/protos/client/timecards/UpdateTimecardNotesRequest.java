package com.squareup.protos.client.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
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
public final class UpdateTimecardNotesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateTimecardNotesRequest> CREATOR;
    public final String note_content;
    public final String timecard_token;

    static {
        UpdateTimecardNotesRequest$Companion$ADAPTER$1 updateTimecardNotesRequest$Companion$ADAPTER$1 = new UpdateTimecardNotesRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateTimecardNotesRequest.class), "type.googleapis.com/squareup.client.timecards.UpdateTimecardNotesRequest", Syntax.PROTO_2, null, "squareup/client/timecards/service.proto");
        ADAPTER = updateTimecardNotesRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateTimecardNotesRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTimecardNotesRequest(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.timecard_token = str;
        this.note_content = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateTimecardNotesRequest)) {
            return false;
        }
        UpdateTimecardNotesRequest updateTimecardNotesRequest = (UpdateTimecardNotesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateTimecardNotesRequest.unknownFields()) && Intrinsics.areEqual(this.timecard_token, updateTimecardNotesRequest.timecard_token) && Intrinsics.areEqual(this.note_content, updateTimecardNotesRequest.note_content);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.timecard_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.note_content;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Header.Builder builder = new Header.Builder(21);
        builder.name = this.timecard_token;
        builder.value = this.note_content;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.timecard_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "timecard_token=", arrayList);
        }
        String str2 = this.note_content;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "note_content=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateTimecardNotesRequest{", "}", 0, null, null, 56);
    }
}
