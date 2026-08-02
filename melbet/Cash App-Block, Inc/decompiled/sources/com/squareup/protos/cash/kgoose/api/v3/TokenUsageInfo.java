package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TokenUsageInfo;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/TokenUsageInfo$Builder;", "", "model_name", "Ljava/lang/String;", "", "token_limit", "Ljava/lang/Integer;", "token_usage", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TokenUsageInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TokenUsageInfo> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String model_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
    public final Integer token_limit;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
    public final Integer token_usage;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\r"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/TokenUsageInfo$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/TokenUsageInfo;", "<init>", "()V", "model_name", "", "token_limit", "", "Ljava/lang/Integer;", "token_usage", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/TokenUsageInfo$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String model_name;
        public Integer token_limit;
        public Integer token_usage;

        @Override // com.squareup.wire.Message.Builder
        public TokenUsageInfo build() {
            return new TokenUsageInfo(this.model_name, this.token_limit, this.token_usage, buildUnknownFields());
        }

        public final Builder model_name(String model_name) {
            this.model_name = model_name;
            return this;
        }

        public final Builder token_limit(Integer token_limit) {
            this.token_limit = token_limit;
            return this;
        }

        public final Builder token_usage(Integer token_usage) {
            this.token_usage = token_usage;
            return this;
        }
    }

    static {
        TokenUsageInfo$Companion$ADAPTER$1 tokenUsageInfo$Companion$ADAPTER$1 = new TokenUsageInfo$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TokenUsageInfo.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.TokenUsageInfo", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = tokenUsageInfo$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tokenUsageInfo$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUsageInfo(String str, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.model_name = str;
        this.token_limit = num;
        this.token_usage = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenUsageInfo)) {
            return false;
        }
        TokenUsageInfo tokenUsageInfo = (TokenUsageInfo) obj;
        return Intrinsics.areEqual(unknownFields(), tokenUsageInfo.unknownFields()) && Intrinsics.areEqual(this.model_name, tokenUsageInfo.model_name) && Intrinsics.areEqual(this.token_limit, tokenUsageInfo.token_limit) && Intrinsics.areEqual(this.token_usage, tokenUsageInfo.token_usage);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.model_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.token_limit;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.token_usage;
        int hashCode4 = hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.model_name = this.model_name;
        builder.token_limit = this.token_limit;
        builder.token_usage = this.token_usage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.model_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "model_name=", arrayList);
        }
        Integer num = this.token_limit;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("token_limit=", num, arrayList);
        }
        Integer num2 = this.token_usage;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("token_usage=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TokenUsageInfo{", "}", 0, null, null, 56);
    }
}
