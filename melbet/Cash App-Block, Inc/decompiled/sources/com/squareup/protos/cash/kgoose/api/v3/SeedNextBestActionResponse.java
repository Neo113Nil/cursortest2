package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionResponse$Builder;", "", "", "next_best_action_ids", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SeedNextBestActionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SeedNextBestActionResponse> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<String> next_best_action_ids;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionResponse$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/SeedNextBestActionResponse;", "<init>", "()V", "next_best_action_ids", "", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<String> next_best_action_ids = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public SeedNextBestActionResponse build() {
            return new SeedNextBestActionResponse(this.next_best_action_ids, buildUnknownFields());
        }

        public final Builder next_best_action_ids(List<String> next_best_action_ids) {
            next_best_action_ids.getClass();
            TransactorKt.checkElementsNotNull(next_best_action_ids);
            this.next_best_action_ids = next_best_action_ids;
            return this;
        }
    }

    static {
        SeedNextBestActionResponse$Companion$ADAPTER$1 seedNextBestActionResponse$Companion$ADAPTER$1 = new SeedNextBestActionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SeedNextBestActionResponse.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.SeedNextBestActionResponse", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/next_best_action_messages.proto");
        ADAPTER = seedNextBestActionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(seedNextBestActionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeedNextBestActionResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.next_best_action_ids = TransactorKt.immutableCopyOf("next_best_action_ids", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeedNextBestActionResponse)) {
            return false;
        }
        SeedNextBestActionResponse seedNextBestActionResponse = (SeedNextBestActionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), seedNextBestActionResponse.unknownFields()) && Intrinsics.areEqual(this.next_best_action_ids, seedNextBestActionResponse.next_best_action_ids);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.next_best_action_ids.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.next_best_action_ids = this.next_best_action_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.next_best_action_ids.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_best_action_ids=", arrayList, this.next_best_action_ids);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SeedNextBestActionResponse{", "}", 0, null, null, 56);
    }
}
