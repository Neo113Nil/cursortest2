package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_common.zzln;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.profiles.ProfileDetails;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.protos.cash.taply.app.v1.EncryptedCardData;
import com.squareup.protos.common.Header;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OutgoingMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OutgoingMessage> CREATOR;
    public final zzln body;
    public final String flow_token;
    public final String idempotence_token;

    static {
        OutgoingMessage$Companion$ADAPTER$1 outgoingMessage$Companion$ADAPTER$1 = new OutgoingMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OutgoingMessage.class), "type.googleapis.com/squareup.cash.supportal.app.OutgoingMessage", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = outgoingMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(outgoingMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutgoingMessage(String str, zzln zzlnVar, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.idempotence_token = str;
        this.body = zzlnVar;
        this.flow_token = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutgoingMessage)) {
            return false;
        }
        OutgoingMessage outgoingMessage = (OutgoingMessage) obj;
        return Intrinsics.areEqual(unknownFields(), outgoingMessage.unknownFields()) && Intrinsics.areEqual(this.idempotence_token, outgoingMessage.idempotence_token) && Intrinsics.areEqual(this.body, outgoingMessage.body) && Intrinsics.areEqual(this.flow_token, outgoingMessage.flow_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.idempotence_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        zzln zzlnVar = this.body;
        int hashCode3 = (hashCode2 + (zzlnVar != null ? zzlnVar.hashCode() : 0)) * 37;
        String str2 = this.flow_token;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(26);
        builder.modules = this.idempotence_token;
        builder.overflow_modules = this.body;
        builder.card_home_actions = this.flow_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.idempotence_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "idempotence_token=", arrayList);
        }
        zzln zzlnVar = this.body;
        if (zzlnVar != null) {
            arrayList.add("body=" + zzlnVar);
        }
        String str2 = this.flow_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "flow_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OutgoingMessage{", "}", 0, null, null, 56);
    }

    public final class TextBody extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TextBody> CREATOR;
        public final String text;

        static {
            OutgoingMessage$TextBody$Companion$ADAPTER$1 outgoingMessage$TextBody$Companion$ADAPTER$1 = new OutgoingMessage$TextBody$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextBody.class), "type.googleapis.com/squareup.cash.supportal.app.OutgoingMessage.TextBody", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = outgoingMessage$TextBody$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(outgoingMessage$TextBody$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextBody(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextBody)) {
                return false;
            }
            TextBody textBody = (TextBody) obj;
            return Intrinsics.areEqual(unknownFields(), textBody.unknownFields()) && Intrinsics.areEqual(this.text, textBody.text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileDetails.Builder builder = new ProfileDetails.Builder(23);
            builder.bio = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextBody{", "}", 0, null, null, 56);
        }

        public /* synthetic */ TextBody(String str) {
            this(str, ByteString.EMPTY);
        }
    }

    public final class FileBody extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FileBody> CREATOR;
        public final String file_token;
        public final String text;

        static {
            OutgoingMessage$FileBody$Companion$ADAPTER$1 outgoingMessage$FileBody$Companion$ADAPTER$1 = new OutgoingMessage$FileBody$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FileBody.class), "type.googleapis.com/squareup.cash.supportal.app.OutgoingMessage.FileBody", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = outgoingMessage$FileBody$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(outgoingMessage$FileBody$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileBody(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.file_token = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileBody)) {
                return false;
            }
            FileBody fileBody = (FileBody) obj;
            return Intrinsics.areEqual(unknownFields(), fileBody.unknownFields()) && Intrinsics.areEqual(this.text, fileBody.text) && Intrinsics.areEqual(this.file_token, fileBody.file_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.file_token;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Header.Builder builder = new Header.Builder(16);
            builder.name = this.text;
            builder.value = this.file_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            String str2 = this.file_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "file_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FileBody{", "}", 0, null, null, 56);
        }

        public /* synthetic */ FileBody(String str) {
            this(null, str, ByteString.EMPTY);
        }
    }

    public final class SelectedTransaction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SelectedTransaction> CREATOR;
        public final String entity_id;
        public final ByteString payload;

        static {
            OutgoingMessage$SelectedTransaction$Companion$ADAPTER$1 outgoingMessage$SelectedTransaction$Companion$ADAPTER$1 = new OutgoingMessage$SelectedTransaction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectedTransaction.class), "type.googleapis.com/squareup.cash.supportal.app.OutgoingMessage.SelectedTransaction", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = outgoingMessage$SelectedTransaction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(outgoingMessage$SelectedTransaction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectedTransaction(String str, ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            byteString2.getClass();
            this.payload = byteString;
            this.entity_id = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectedTransaction)) {
                return false;
            }
            SelectedTransaction selectedTransaction = (SelectedTransaction) obj;
            return Intrinsics.areEqual(unknownFields(), selectedTransaction.unknownFields()) && Intrinsics.areEqual(this.payload, selectedTransaction.payload) && Intrinsics.areEqual(this.entity_id, selectedTransaction.entity_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ByteString byteString = this.payload;
            int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
            String str = this.entity_id;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EncryptedCardData.Builder builder = new EncryptedCardData.Builder(4);
            builder.encrypted_card_info = this.payload;
            builder.encrypted_ephemeral_key = this.entity_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ByteString byteString = this.payload;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("payload=", byteString, arrayList);
            }
            String str = this.entity_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SelectedTransaction{", "}", 0, null, null, 56);
        }

        public /* synthetic */ SelectedTransaction(String str) {
            this(str, null, ByteString.EMPTY);
        }
    }

    public final class SelectedReply extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SelectedReply> CREATOR;
        public final ByteString payload;
        public final String reply_token;
        public final String text;

        static {
            OutgoingMessage$SelectedReply$Companion$ADAPTER$1 outgoingMessage$SelectedReply$Companion$ADAPTER$1 = new OutgoingMessage$SelectedReply$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectedReply.class), "type.googleapis.com/squareup.cash.supportal.app.OutgoingMessage.SelectedReply", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = outgoingMessage$SelectedReply$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(outgoingMessage$SelectedReply$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectedReply(String str, String str2, ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            byteString2.getClass();
            this.reply_token = str;
            this.text = str2;
            this.payload = byteString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectedReply)) {
                return false;
            }
            SelectedReply selectedReply = (SelectedReply) obj;
            return Intrinsics.areEqual(unknownFields(), selectedReply.unknownFields()) && Intrinsics.areEqual(this.reply_token, selectedReply.reply_token) && Intrinsics.areEqual(this.text, selectedReply.text) && Intrinsics.areEqual(this.payload, selectedReply.payload);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.reply_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            ByteString byteString = this.payload;
            int hashCode4 = hashCode3 + (byteString != null ? byteString.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ChatMessage.SuggestedReply.Builder builder = new ChatMessage.SuggestedReply.Builder(1);
            builder.token = this.reply_token;
            builder.text = this.text;
            builder.payload = this.payload;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.reply_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "reply_token=", arrayList);
            }
            String str2 = this.text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "text=", arrayList);
            }
            ByteString byteString = this.payload;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("payload=", byteString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SelectedReply{", "}", 0, null, null, 56);
        }

        public /* synthetic */ SelectedReply(String str, String str2, ByteString byteString) {
            this(str, str2, byteString, ByteString.EMPTY);
        }
    }

    public /* synthetic */ OutgoingMessage(String str, zzln zzlnVar) {
        this(str, zzlnVar, null, ByteString.EMPTY);
    }
}
