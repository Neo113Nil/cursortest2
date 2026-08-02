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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectConfig$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectMode;", "mode", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectMode;", "", "custom_subject", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationEmailSubjectConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationEmailSubjectConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String custom_subject;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.NotificationEmailSubjectMode#ADAPTER", schemaIndex = 0, tag = 1)
    public final NotificationEmailSubjectMode mode;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectConfig;", "<init>", "()V", "mode", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectMode;", "custom_subject", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String custom_subject;
        public NotificationEmailSubjectMode mode;

        @Override // com.squareup.wire.Message.Builder
        public NotificationEmailSubjectConfig build() {
            return new NotificationEmailSubjectConfig(this.mode, this.custom_subject, buildUnknownFields());
        }

        public final Builder custom_subject(String custom_subject) {
            this.custom_subject = custom_subject;
            return this;
        }

        public final Builder mode(NotificationEmailSubjectMode mode) {
            this.mode = mode;
            return this;
        }
    }

    static {
        NotificationEmailSubjectConfig$Companion$ADAPTER$1 notificationEmailSubjectConfig$Companion$ADAPTER$1 = new NotificationEmailSubjectConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationEmailSubjectConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.NotificationEmailSubjectConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = notificationEmailSubjectConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationEmailSubjectConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationEmailSubjectConfig(NotificationEmailSubjectMode notificationEmailSubjectMode, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.mode = notificationEmailSubjectMode;
        this.custom_subject = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationEmailSubjectConfig)) {
            return false;
        }
        NotificationEmailSubjectConfig notificationEmailSubjectConfig = (NotificationEmailSubjectConfig) obj;
        return Intrinsics.areEqual(unknownFields(), notificationEmailSubjectConfig.unknownFields()) && this.mode == notificationEmailSubjectConfig.mode && Intrinsics.areEqual(this.custom_subject, notificationEmailSubjectConfig.custom_subject);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        NotificationEmailSubjectMode notificationEmailSubjectMode = this.mode;
        int hashCode2 = (hashCode + (notificationEmailSubjectMode != null ? notificationEmailSubjectMode.hashCode() : 0)) * 37;
        String str = this.custom_subject;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.mode = this.mode;
        builder.custom_subject = this.custom_subject;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        NotificationEmailSubjectMode notificationEmailSubjectMode = this.mode;
        if (notificationEmailSubjectMode != null) {
            arrayList.add("mode=" + notificationEmailSubjectMode);
        }
        String str = this.custom_subject;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "custom_subject=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationEmailSubjectConfig{", "}", 0, null, null, 56);
    }
}
