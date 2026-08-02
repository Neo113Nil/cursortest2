package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionMetadata;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionMetadata$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotMetadata;", "moneybot_metadata", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotMetadata;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TriggeredActionMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TriggeredActionMetadata> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.MoneybotMetadata#ADAPTER", schemaIndex = 0, tag = 1)
    public final MoneybotMetadata moneybot_metadata;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionMetadata$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TriggeredActionMetadata;", "<init>", "()V", "moneybot_metadata", "Lcom/squareup/protos/cash/kgoose/api/v3/MoneybotMetadata;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public MoneybotMetadata moneybot_metadata;

        @Override // com.squareup.wire.Message.Builder
        public TriggeredActionMetadata build() {
            return new TriggeredActionMetadata(this.moneybot_metadata, buildUnknownFields());
        }

        public final Builder moneybot_metadata(MoneybotMetadata moneybot_metadata) {
            this.moneybot_metadata = moneybot_metadata;
            return this;
        }
    }

    static {
        TriggeredActionMetadata$Companion$ADAPTER$1 triggeredActionMetadata$Companion$ADAPTER$1 = new TriggeredActionMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TriggeredActionMetadata.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TriggeredActionMetadata", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = triggeredActionMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(triggeredActionMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggeredActionMetadata(MoneybotMetadata moneybotMetadata, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.moneybot_metadata = moneybotMetadata;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TriggeredActionMetadata)) {
            return false;
        }
        TriggeredActionMetadata triggeredActionMetadata = (TriggeredActionMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), triggeredActionMetadata.unknownFields()) && Intrinsics.areEqual(this.moneybot_metadata, triggeredActionMetadata.moneybot_metadata);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MoneybotMetadata moneybotMetadata = this.moneybot_metadata;
        int hashCode2 = hashCode + (moneybotMetadata != null ? moneybotMetadata.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.moneybot_metadata = this.moneybot_metadata;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MoneybotMetadata moneybotMetadata = this.moneybot_metadata;
        if (moneybotMetadata != null) {
            arrayList.add("moneybot_metadata=" + moneybotMetadata);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TriggeredActionMetadata{", "}", 0, null, null, 56);
    }
}
