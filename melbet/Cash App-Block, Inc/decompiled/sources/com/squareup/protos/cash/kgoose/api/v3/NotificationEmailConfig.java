package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailConfig$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectConfig;", "subject", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectConfig;", "", "", "recipients", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NotificationEmailConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NotificationEmailConfig> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<String> recipients;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.NotificationEmailSubjectConfig#ADAPTER", schemaIndex = 1, tag = 2)
    public final NotificationEmailSubjectConfig subject;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailConfig;", "<init>", "()V", "recipients", "", "", "subject", "Lcom/squareup/protos/cash/kgoose/api/v3/NotificationEmailSubjectConfig;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<String> recipients = EmptyList.INSTANCE;
        public NotificationEmailSubjectConfig subject;

        @Override // com.squareup.wire.Message.Builder
        public NotificationEmailConfig build() {
            return new NotificationEmailConfig(this.recipients, this.subject, buildUnknownFields());
        }

        public final Builder recipients(List<String> recipients) {
            recipients.getClass();
            TransactorKt.checkElementsNotNull(recipients);
            this.recipients = recipients;
            return this;
        }

        public final Builder subject(NotificationEmailSubjectConfig subject) {
            this.subject = subject;
            return this;
        }
    }

    static {
        NotificationEmailConfig$Companion$ADAPTER$1 notificationEmailConfig$Companion$ADAPTER$1 = new NotificationEmailConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(NotificationEmailConfig.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.NotificationEmailConfig", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/triggered_action_messages.proto");
        ADAPTER = notificationEmailConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(notificationEmailConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationEmailConfig(List list, NotificationEmailSubjectConfig notificationEmailSubjectConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.subject = notificationEmailSubjectConfig;
        this.recipients = TransactorKt.immutableCopyOf("recipients", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NotificationEmailConfig)) {
            return false;
        }
        NotificationEmailConfig notificationEmailConfig = (NotificationEmailConfig) obj;
        return Intrinsics.areEqual(unknownFields(), notificationEmailConfig.unknownFields()) && Intrinsics.areEqual(this.recipients, notificationEmailConfig.recipients) && Intrinsics.areEqual(this.subject, notificationEmailConfig.subject);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.recipients);
        NotificationEmailSubjectConfig notificationEmailSubjectConfig = this.subject;
        int hashCode = m + (notificationEmailSubjectConfig != null ? notificationEmailSubjectConfig.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.recipients = this.recipients;
        builder.subject = this.subject;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.recipients.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("recipients=", arrayList, this.recipients);
        }
        NotificationEmailSubjectConfig notificationEmailSubjectConfig = this.subject;
        if (notificationEmailSubjectConfig != null) {
            arrayList.add("subject=" + notificationEmailSubjectConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NotificationEmailConfig{", "}", 0, null, null, 56);
    }
}
