package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Collection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/timecards/BatchTimecardBreakDefinitionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Collection$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BatchTimecardBreakDefinitionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BatchTimecardBreakDefinitionResponse> CREATOR;
    public final List timecard_break_definition;

    static {
        BatchTimecardBreakDefinitionResponse$Companion$ADAPTER$1 batchTimecardBreakDefinitionResponse$Companion$ADAPTER$1 = new BatchTimecardBreakDefinitionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BatchTimecardBreakDefinitionResponse.class), "type.googleapis.com/squareup.timecards.BatchTimecardBreakDefinitionResponse", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = batchTimecardBreakDefinitionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(batchTimecardBreakDefinitionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchTimecardBreakDefinitionResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.timecard_break_definition = TransactorKt.immutableCopyOf("timecard_break_definition", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchTimecardBreakDefinitionResponse)) {
            return false;
        }
        BatchTimecardBreakDefinitionResponse batchTimecardBreakDefinitionResponse = (BatchTimecardBreakDefinitionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), batchTimecardBreakDefinitionResponse.unknownFields()) && Intrinsics.areEqual(this.timecard_break_definition, batchTimecardBreakDefinitionResponse.timecard_break_definition);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.timecard_break_definition.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(19, false);
        builder.items = this.timecard_break_definition;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.timecard_break_definition;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("timecard_break_definition=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchTimecardBreakDefinitionResponse{", "}", 0, null, null, 56);
    }
}
