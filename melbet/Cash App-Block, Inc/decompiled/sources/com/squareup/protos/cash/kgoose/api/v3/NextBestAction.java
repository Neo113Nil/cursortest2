package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u0019\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0005R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\bR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction$Builder;", "", "next_best_action_id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizedString;", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams;", "prompt", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams;", "getPrompt$annotations", "()V", "", "created_at", "Ljava/lang/Long;", "cta_text", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction$CtaTapAction;", "cta_tap_action", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction$CtaTapAction;", "category", "detail", "expires_at", "Companion", "Builder", "CtaTapAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NextBestAction extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NextBestAction> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 4, tag = 5)
    public final Long created_at;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.NextBestAction$CtaTapAction#ADAPTER", schemaIndex = 6, tag = 7)
    public final CtaTapAction cta_tap_action;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 5, tag = 6)
    public final LocalizedString cta_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 8, tag = 9)
    public final LocalizedString detail;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 9, tag = 10)
    public final Long expires_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String next_best_action_id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.ClientKickoffParams#ADAPTER", schemaIndex = 3, tag = 4)
    public final ClientKickoffParams prompt;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 2, tag = 3)
    public final LocalizedString subtitle;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizedString#ADAPTER", schemaIndex = 1, tag = 2)
    public final LocalizedString title;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0012\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0015J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\bJ\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction;", "<init>", "()V", "next_best_action_id", "", "title", "Lcom/squareup/protos/cash/localization/LocalizedString;", "subtitle", "prompt", "Lcom/squareup/protos/cash/kgoose/api/v3/ClientKickoffParams;", "created_at", "", "Ljava/lang/Long;", "cta_text", "cta_tap_action", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction$CtaTapAction;", "category", "detail", "expires_at", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String category;
        public Long created_at;
        public CtaTapAction cta_tap_action;
        public LocalizedString cta_text;
        public LocalizedString detail;
        public Long expires_at;
        public String next_best_action_id;
        public ClientKickoffParams prompt;
        public LocalizedString subtitle;
        public LocalizedString title;

        @Override // com.squareup.wire.Message.Builder
        public NextBestAction build() {
            return new NextBestAction(this.next_best_action_id, this.title, this.subtitle, this.prompt, this.created_at, this.cta_text, this.cta_tap_action, this.category, this.detail, this.expires_at, buildUnknownFields());
        }

        public final Builder category(String category) {
            this.category = category;
            return this;
        }

        public final Builder created_at(Long created_at) {
            this.created_at = created_at;
            return this;
        }

        public final Builder cta_tap_action(CtaTapAction cta_tap_action) {
            this.cta_tap_action = cta_tap_action;
            return this;
        }

        public final Builder cta_text(LocalizedString cta_text) {
            this.cta_text = cta_text;
            return this;
        }

        public final Builder detail(LocalizedString detail) {
            this.detail = detail;
            return this;
        }

        public final Builder expires_at(Long expires_at) {
            this.expires_at = expires_at;
            return this;
        }

        public final Builder next_best_action_id(String next_best_action_id) {
            this.next_best_action_id = next_best_action_id;
            return this;
        }

        @Deprecated
        public final Builder prompt(ClientKickoffParams prompt) {
            this.prompt = prompt;
            return this;
        }

        public final Builder subtitle(LocalizedString subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder title(LocalizedString title) {
            this.title = title;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction$CtaTapAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction$CtaTapAction$Builder;", "", "client_route_url", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CtaTapAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CtaTapAction> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String client_route_url;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction$CtaTapAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NextBestAction$CtaTapAction;", "<init>", "()V", "client_route_url", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String client_route_url;

            @Override // com.squareup.wire.Message.Builder
            public CtaTapAction build() {
                return new CtaTapAction(this.client_route_url, buildUnknownFields());
            }

            public final Builder client_route_url(String client_route_url) {
                this.client_route_url = client_route_url;
                return this;
            }
        }

        static {
            NextBestAction$CtaTapAction$Companion$ADAPTER$1 nextBestAction$CtaTapAction$Companion$ADAPTER$1 = new NextBestAction$CtaTapAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CtaTapAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.NextBestAction.CtaTapAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/next_best_action_messages.proto");
            ADAPTER = nextBestAction$CtaTapAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(nextBestAction$CtaTapAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CtaTapAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.client_route_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CtaTapAction)) {
                return false;
            }
            CtaTapAction ctaTapAction = (CtaTapAction) obj;
            return Intrinsics.areEqual(unknownFields(), ctaTapAction.unknownFields()) && Intrinsics.areEqual(this.client_route_url, ctaTapAction.client_route_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.client_route_url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.client_route_url = this.client_route_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.client_route_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CtaTapAction{", "}", 0, null, null, 56);
        }
    }

    static {
        NextBestAction$Companion$ADAPTER$1 nextBestAction$Companion$ADAPTER$1 = new NextBestAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NextBestAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.NextBestAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/cash/next_best_action_messages.proto");
        ADAPTER = nextBestAction$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(nextBestAction$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NextBestAction(String str, LocalizedString localizedString, LocalizedString localizedString2, ClientKickoffParams clientKickoffParams, Long l, LocalizedString localizedString3, CtaTapAction ctaTapAction, String str2, LocalizedString localizedString4, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.next_best_action_id = str;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.prompt = clientKickoffParams;
        this.created_at = l;
        this.cta_text = localizedString3;
        this.cta_tap_action = ctaTapAction;
        this.category = str2;
        this.detail = localizedString4;
        this.expires_at = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NextBestAction)) {
            return false;
        }
        NextBestAction nextBestAction = (NextBestAction) obj;
        return Intrinsics.areEqual(unknownFields(), nextBestAction.unknownFields()) && Intrinsics.areEqual(this.next_best_action_id, nextBestAction.next_best_action_id) && Intrinsics.areEqual(this.title, nextBestAction.title) && Intrinsics.areEqual(this.subtitle, nextBestAction.subtitle) && Intrinsics.areEqual(this.prompt, nextBestAction.prompt) && Intrinsics.areEqual(this.created_at, nextBestAction.created_at) && Intrinsics.areEqual(this.cta_text, nextBestAction.cta_text) && Intrinsics.areEqual(this.cta_tap_action, nextBestAction.cta_tap_action) && Intrinsics.areEqual(this.category, nextBestAction.category) && Intrinsics.areEqual(this.detail, nextBestAction.detail) && Intrinsics.areEqual(this.expires_at, nextBestAction.expires_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.next_best_action_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        ClientKickoffParams clientKickoffParams = this.prompt;
        int hashCode5 = (hashCode4 + (clientKickoffParams != null ? clientKickoffParams.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        LocalizedString localizedString3 = this.cta_text;
        int hashCode7 = (hashCode6 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        CtaTapAction ctaTapAction = this.cta_tap_action;
        int hashCode8 = (hashCode7 + (ctaTapAction != null ? ctaTapAction.hashCode() : 0)) * 37;
        String str2 = this.category;
        int hashCode9 = (hashCode8 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalizedString localizedString4 = this.detail;
        int hashCode10 = (hashCode9 + (localizedString4 != null ? localizedString4.hashCode() : 0)) * 37;
        Long l2 = this.expires_at;
        int hashCode11 = hashCode10 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.next_best_action_id = this.next_best_action_id;
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.prompt = this.prompt;
        builder.created_at = this.created_at;
        builder.cta_text = this.cta_text;
        builder.cta_tap_action = this.cta_tap_action;
        builder.category = this.category;
        builder.detail = this.detail;
        builder.expires_at = this.expires_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.next_best_action_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_best_action_id=", arrayList);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        ClientKickoffParams clientKickoffParams = this.prompt;
        if (clientKickoffParams != null) {
            arrayList.add("prompt=" + clientKickoffParams);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        LocalizedString localizedString3 = this.cta_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("cta_text=", localizedString3, arrayList);
        }
        CtaTapAction ctaTapAction = this.cta_tap_action;
        if (ctaTapAction != null) {
            arrayList.add("cta_tap_action=" + ctaTapAction);
        }
        String str2 = this.category;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "category=", arrayList);
        }
        LocalizedString localizedString4 = this.detail;
        if (localizedString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("detail=", localizedString4, arrayList);
        }
        Long l2 = this.expires_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NextBestAction{", "}", 0, null, null, 56);
    }
}
