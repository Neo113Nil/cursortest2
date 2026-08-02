package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import com.appsflyer.AppsFlyerProperties;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NotificationChannelConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationChannelConfig$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationChannel;", AppsFlyerProperties.CHANNEL, "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationChannel;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailConfig;", "email_config", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailConfig;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationChannelConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationChannelConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.NotificationChannel#ADAPTER", schemaIndex = 0, tag = 1)
    public final NotificationChannel channel;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.NotificationEmailConfig#ADAPTER", schemaIndex = 1, tag = 2)
    public final NotificationEmailConfig email_config;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NotificationChannelConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationChannelConfig;", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationChannel;", "email_config", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public NotificationChannel channel;
        public NotificationEmailConfig email_config;

        @Override // com.squareup.wire.Message.Builder
        public NotificationChannelConfig build() {
            return new NotificationChannelConfig(this.channel, this.email_config, buildUnknownFields());
        }

        public final Builder channel(NotificationChannel channel) {
            this.channel = channel;
            return this;
        }

        public final Builder email_config(NotificationEmailConfig email_config) {
            this.email_config = email_config;
            return this;
        }
    }

    static {
        NotificationChannelConfig$Companion$ADAPTER$1 notificationChannelConfig$Companion$ADAPTER$1 = new NotificationChannelConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationChannelConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.NotificationChannelConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = notificationChannelConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationChannelConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationChannelConfig(NotificationChannel notificationChannel, NotificationEmailConfig notificationEmailConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.channel = notificationChannel;
        this.email_config = notificationEmailConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationChannelConfig)) {
            return false;
        }
        NotificationChannelConfig notificationChannelConfig = (NotificationChannelConfig) obj;
        return Intrinsics.areEqual(unknownFields(), notificationChannelConfig.unknownFields()) && this.channel == notificationChannelConfig.channel && Intrinsics.areEqual(this.email_config, notificationChannelConfig.email_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NotificationChannel notificationChannel = this.channel;
        int hashCode2 = (hashCode + (notificationChannel != null ? notificationChannel.hashCode() : 0)) * 37;
        NotificationEmailConfig notificationEmailConfig = this.email_config;
        int hashCode3 = hashCode2 + (notificationEmailConfig != null ? notificationEmailConfig.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.channel = this.channel;
        builder.email_config = this.email_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NotificationChannel notificationChannel = this.channel;
        if (notificationChannel != null) {
            arrayList.add("channel=" + notificationChannel);
        }
        NotificationEmailConfig notificationEmailConfig = this.email_config;
        if (notificationEmailConfig != null) {
            arrayList.add("email_config=" + notificationEmailConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationChannelConfig{", "}", 0, null, null, 56);
    }
}
