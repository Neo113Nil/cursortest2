package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/RelayContext;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/RelayContext$Builder;", "", "channel_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/RelayProvider;", "provider", "Lcom/squareup/protos/cash/kgoose/api/v3/RelayProvider;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RelayContext extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RelayContext> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String channel_id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.RelayProvider#ADAPTER", schemaIndex = 1, tag = 2)
    public final RelayProvider provider;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/RelayContext$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/RelayContext;", "<init>", "()V", "channel_id", "", "provider", "Lcom/squareup/protos/cash/kgoose/api/v3/RelayProvider;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String channel_id;
        public RelayProvider provider;

        @Override // com.squareup.wire.Message.Builder
        public RelayContext build() {
            return new RelayContext(this.channel_id, this.provider, buildUnknownFields());
        }

        public final Builder channel_id(String channel_id) {
            this.channel_id = channel_id;
            return this;
        }

        public final Builder provider(RelayProvider provider) {
            this.provider = provider;
            return this;
        }
    }

    static {
        RelayContext$Companion$ADAPTER$1 relayContext$Companion$ADAPTER$1 = new RelayContext$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RelayContext.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.RelayContext", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = relayContext$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(relayContext$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelayContext(String str, RelayProvider relayProvider, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.channel_id = str;
        this.provider = relayProvider;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelayContext)) {
            return false;
        }
        RelayContext relayContext = (RelayContext) obj;
        return Intrinsics.areEqual(unknownFields(), relayContext.unknownFields()) && Intrinsics.areEqual(this.channel_id, relayContext.channel_id) && this.provider == relayContext.provider;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.channel_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        RelayProvider relayProvider = this.provider;
        int hashCode3 = hashCode2 + (relayProvider != null ? relayProvider.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.channel_id = this.channel_id;
        builder.provider = this.provider;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.channel_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "channel_id=", arrayList);
        }
        RelayProvider relayProvider = this.provider;
        if (relayProvider != null) {
            arrayList.add("provider=" + relayProvider);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RelayContext{", "}", 0, null, null, 56);
    }
}
