package com.squareup.stafftasks.endpoints;

import android.os.Parcelable;
import com.squareup.stafftasks.resources.Task;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningTool;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/stafftasks/endpoints/UpsertTaskResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/earnings/EarningTool$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UpsertTaskResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpsertTaskResponse> CREATOR;
    public final Task task;

    static {
        UpsertTaskResponse$Companion$ADAPTER$1 upsertTaskResponse$Companion$ADAPTER$1 = new UpsertTaskResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpsertTaskResponse.class), "type.googleapis.com/squareup.stafftasks.UpsertTaskResponse", Syntax.PROTO_2, null, "squareup/stafftasks/endpoints/upsert-task.proto");
        ADAPTER = upsertTaskResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(upsertTaskResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpsertTaskResponse(Task task, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.task = task;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpsertTaskResponse)) {
            return false;
        }
        UpsertTaskResponse upsertTaskResponse = (UpsertTaskResponse) obj;
        return Intrinsics.areEqual(unknownFields(), upsertTaskResponse.unknownFields()) && Intrinsics.areEqual(this.task, upsertTaskResponse.task);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Task task = this.task;
        int hashCode2 = hashCode + (task != null ? task.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(6);
        builder.tool = this.task;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Task task = this.task;
        if (task != null) {
            arrayList.add("task=" + task);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpsertTaskResponse{", "}", 0, null, null, 56);
    }
}
