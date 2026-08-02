package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage$Builder;", "", "hidden", "Ljava/lang/Boolean;", "", "id", "Ljava/lang/String;", "Lcom/squareup/protos/cash/kgoose/api/v3/Role;", "role", "Lcom/squareup/protos/cash/kgoose/api/v3/Role;", "", "created", "Ljava/lang/Long;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent;", "message_contents", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InputMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InputMessage> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 4, tag = 5)
    public final Long created;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean hidden;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String id;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.MessageContent#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<MessageContent> message_contents;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Role#ADAPTER", schemaIndex = 3, tag = 4)
    public final Role role;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0012J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage;", "<init>", "()V", "message_contents", "", "Lcom/squareup/protos/cash/kgoose/api/v3/MessageContent;", "hidden", "", "Ljava/lang/Boolean;", "id", "", "role", "Lcom/squareup/protos/cash/kgoose/api/v3/Role;", "created", "", "Ljava/lang/Long;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage$Builder;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/InputMessage$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Long created;
        public Boolean hidden;
        public String id;
        public List<MessageContent> message_contents = EmptyList.INSTANCE;
        public Role role;

        @Override // com.squareup.wire.Message.Builder
        public InputMessage build() {
            return new InputMessage(this.message_contents, this.hidden, this.id, this.role, this.created, buildUnknownFields());
        }

        public final Builder created(Long created) {
            this.created = created;
            return this;
        }

        public final Builder hidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public final Builder id(String id) {
            this.id = id;
            return this;
        }

        public final Builder message_contents(List<MessageContent> message_contents) {
            message_contents.getClass();
            TransactorKt.checkElementsNotNull(message_contents);
            this.message_contents = message_contents;
            return this;
        }

        public final Builder role(Role role) {
            this.role = role;
            return this;
        }
    }

    static {
        InputMessage$Companion$ADAPTER$1 inputMessage$Companion$ADAPTER$1 = new InputMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InputMessage.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.InputMessage", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/chat_messages.proto");
        ADAPTER = inputMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inputMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMessage(List list, Boolean bool, String str, Role role, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.hidden = bool;
        this.id = str;
        this.role = role;
        this.created = l;
        this.message_contents = TransactorKt.immutableCopyOf("message_contents", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InputMessage copy$default(InputMessage inputMessage, ArrayList arrayList, String str, ByteString byteString, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = inputMessage.message_contents;
        }
        List list2 = list;
        Boolean bool = inputMessage.hidden;
        if ((i & 4) != 0) {
            str = inputMessage.id;
        }
        String str2 = str;
        Role role = inputMessage.role;
        Long l = inputMessage.created;
        if ((i & 32) != 0) {
            byteString = inputMessage.unknownFields();
        }
        ByteString byteString2 = byteString;
        inputMessage.getClass();
        list2.getClass();
        byteString2.getClass();
        return new InputMessage(list2, bool, str2, role, l, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InputMessage)) {
            return false;
        }
        InputMessage inputMessage = (InputMessage) obj;
        return Intrinsics.areEqual(unknownFields(), inputMessage.unknownFields()) && Intrinsics.areEqual(this.message_contents, inputMessage.message_contents) && Intrinsics.areEqual(this.hidden, inputMessage.hidden) && Intrinsics.areEqual(this.id, inputMessage.id) && this.role == inputMessage.role && Intrinsics.areEqual(this.created, inputMessage.created);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.message_contents);
        Boolean bool = this.hidden;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Role role = this.role;
        int hashCode3 = (hashCode2 + (role != null ? role.hashCode() : 0)) * 37;
        Long l = this.created;
        int hashCode4 = hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.message_contents = this.message_contents;
        builder.hidden = this.hidden;
        builder.id = this.id;
        builder.role = this.role;
        builder.created = this.created;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.message_contents.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("message_contents=", arrayList, this.message_contents);
        }
        Boolean bool = this.hidden;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("hidden=", bool, arrayList);
        }
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        Role role = this.role;
        if (role != null) {
            arrayList.add("role=" + role);
        }
        Long l = this.created;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InputMessage{", "}", 0, null, null, 56);
    }
}
