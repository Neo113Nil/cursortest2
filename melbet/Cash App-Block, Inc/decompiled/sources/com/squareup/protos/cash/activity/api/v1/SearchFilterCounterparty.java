package com.squareup.protos.cash.activity.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0007\b\u0006\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$TokenMatcher;", "token_matcher", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$TokenMatcher;", "Companion", "Builder", "TokenMatcher", "SenderRecipientTokens", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchFilterCounterparty extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SearchFilterCounterparty> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final TokenMatcher token_matcher;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty;", "<init>", "()V", "token_matcher", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$TokenMatcher;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public TokenMatcher token_matcher;

        @Override // com.squareup.wire.Message.Builder
        public SearchFilterCounterparty build() {
            return new SearchFilterCounterparty(this.token_matcher, buildUnknownFields());
        }

        public final Builder token_matcher(TokenMatcher token_matcher) {
            this.token_matcher = token_matcher;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$SenderRecipientTokens;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$SenderRecipientTokens$Builder;", "", "sender_token", "Ljava/lang/String;", "recipient_token", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SenderRecipientTokens extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SenderRecipientTokens> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String recipient_token;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String sender_token;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$SenderRecipientTokens$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$SenderRecipientTokens;", "<init>", "()V", "sender_token", "", "recipient_token", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String recipient_token;
            public String sender_token;

            @Override // com.squareup.wire.Message.Builder
            public SenderRecipientTokens build() {
                return new SenderRecipientTokens(this.sender_token, this.recipient_token, buildUnknownFields());
            }

            public final Builder recipient_token(String recipient_token) {
                this.recipient_token = recipient_token;
                return this;
            }

            public final Builder sender_token(String sender_token) {
                this.sender_token = sender_token;
                return this;
            }
        }

        static {
            SearchFilterCounterparty$SenderRecipientTokens$Companion$ADAPTER$1 searchFilterCounterparty$SenderRecipientTokens$Companion$ADAPTER$1 = new SearchFilterCounterparty$SenderRecipientTokens$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SenderRecipientTokens.class), "type.googleapis.com/squareup.cash.activity.api.v1.SearchFilterCounterparty.SenderRecipientTokens", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
            ADAPTER = searchFilterCounterparty$SenderRecipientTokens$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(searchFilterCounterparty$SenderRecipientTokens$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SenderRecipientTokens(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.sender_token = str;
            this.recipient_token = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SenderRecipientTokens)) {
                return false;
            }
            SenderRecipientTokens senderRecipientTokens = (SenderRecipientTokens) obj;
            return Intrinsics.areEqual(unknownFields(), senderRecipientTokens.unknownFields()) && Intrinsics.areEqual(this.sender_token, senderRecipientTokens.sender_token) && Intrinsics.areEqual(this.recipient_token, senderRecipientTokens.recipient_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.sender_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.recipient_token;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.sender_token = this.sender_token;
            builder.recipient_token = this.recipient_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.sender_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sender_token=", arrayList);
            }
            String str2 = this.recipient_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "recipient_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SenderRecipientTokens{", "}", 0, null, null, 56);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$TokenMatcher;", "", "CounterpartyToken", "SenderRecipientTokens", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$TokenMatcher$CounterpartyToken;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$TokenMatcher$SenderRecipientTokens;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class TokenMatcher {

        @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "counterparty_token", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$TokenMatcher$CounterpartyToken;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$TokenMatcher;", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CounterpartyToken extends TokenMatcher {
            private final String value;

            public CounterpartyToken(String str) {
                str.getClass();
                this.value = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CounterpartyToken) && Intrinsics.areEqual(this.value, ((CounterpartyToken) obj).value);
            }

            public final String getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CounterpartyToken(value=", this.value, ")");
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.activity.api.v1.SearchFilterCounterparty$SenderRecipientTokens#ADAPTER", declaredName = "sender_recipient_tokens", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$TokenMatcher$SenderRecipientTokens;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$TokenMatcher;", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$SenderRecipientTokens;", "value", "Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$SenderRecipientTokens;", "getValue", "()Lcom/squareup/protos/cash/activity/api/v1/SearchFilterCounterparty$SenderRecipientTokens;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SenderRecipientTokens extends TokenMatcher {
            private final SenderRecipientTokens value;

            public SenderRecipientTokens(SenderRecipientTokens senderRecipientTokens) {
                senderRecipientTokens.getClass();
                this.value = senderRecipientTokens;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SenderRecipientTokens) && Intrinsics.areEqual(this.value, ((SenderRecipientTokens) obj).value);
            }

            public final SenderRecipientTokens getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SenderRecipientTokens(value=" + this.value + ")";
            }
        }
    }

    static {
        SearchFilterCounterparty$Companion$ADAPTER$1 searchFilterCounterparty$Companion$ADAPTER$1 = new SearchFilterCounterparty$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SearchFilterCounterparty.class), "type.googleapis.com/squareup.cash.activity.api.v1.SearchFilterCounterparty", Syntax.PROTO_2, null, "squareup/cash/activity/api/v1/search.proto");
        ADAPTER = searchFilterCounterparty$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(searchFilterCounterparty$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFilterCounterparty(TokenMatcher tokenMatcher, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token_matcher = tokenMatcher;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchFilterCounterparty)) {
            return false;
        }
        SearchFilterCounterparty searchFilterCounterparty = (SearchFilterCounterparty) obj;
        return Intrinsics.areEqual(unknownFields(), searchFilterCounterparty.unknownFields()) && Intrinsics.areEqual(this.token_matcher, searchFilterCounterparty.token_matcher);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TokenMatcher tokenMatcher = this.token_matcher;
        int hashCode2 = hashCode + (tokenMatcher != null ? tokenMatcher.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.token_matcher = this.token_matcher;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TokenMatcher tokenMatcher = this.token_matcher;
        if (tokenMatcher != null) {
            arrayList.add("token_matcher=" + tokenMatcher);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SearchFilterCounterparty{", "}", 0, null, null, 56);
    }
}
