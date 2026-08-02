package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashliteflow.api.v1.Row;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/BuildUserOpResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteflow/api/v1/Row$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuildUserOpResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BuildUserOpResponse> CREATOR;
    public final List calls;
    public final Chain dest_chain;
    public final Chain source_chain;

    static {
        BuildUserOpResponse$Companion$ADAPTER$1 buildUserOpResponse$Companion$ADAPTER$1 = new BuildUserOpResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BuildUserOpResponse.class), "type.googleapis.com/squareup.cash.cashliteorchestrator.api.v1beta1.BuildUserOpResponse", Syntax.PROTO_2, null, "squareup/cash/cashliteorchestrator/api/v1beta1/orchestrator.proto");
        ADAPTER = buildUserOpResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(buildUserOpResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuildUserOpResponse(List list, Chain chain, Chain chain2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.source_chain = chain;
        this.dest_chain = chain2;
        this.calls = TransactorKt.immutableCopyOf("calls", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BuildUserOpResponse)) {
            return false;
        }
        BuildUserOpResponse buildUserOpResponse = (BuildUserOpResponse) obj;
        return Intrinsics.areEqual(unknownFields(), buildUserOpResponse.unknownFields()) && Intrinsics.areEqual(this.calls, buildUserOpResponse.calls) && this.source_chain == buildUserOpResponse.source_chain && this.dest_chain == buildUserOpResponse.dest_chain;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.calls);
        Chain chain = this.source_chain;
        int hashCode = (m + (chain != null ? chain.hashCode() : 0)) * 37;
        Chain chain2 = this.dest_chain;
        int hashCode2 = hashCode + (chain2 != null ? chain2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Row.Builder builder = new Row.Builder(15);
        builder.title = this.calls;
        builder.subtitle = this.source_chain;
        builder.action = this.dest_chain;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.calls;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("calls=", arrayList, list);
        }
        Chain chain = this.source_chain;
        if (chain != null) {
            arrayList.add("source_chain=" + chain);
        }
        Chain chain2 = this.dest_chain;
        if (chain2 != null) {
            arrayList.add("dest_chain=" + chain2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BuildUserOpResponse{", "}", 0, null, null, 56);
    }
}
