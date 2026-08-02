package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.LongTaskEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import com.google.android.gms.internal.mlkit_vision_common.zzli;
import com.google.android.gms.internal.mlkit_vision_common.zzlk;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.profiles.ProfileDetails;
import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.franklin.app.GetProfileRequest;
import com.squareup.protos.lending.Toggle;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.portfolios.syncvalues.PortfolioState;

/* loaded from: classes8.dex */
public final class ChatMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ChatMessage> CREATOR;
    public final Body body;
    public final Disclaimer disclaimer;
    public final String idempotence_token;
    public final String message_token;
    public final Long recorded_at;
    public final zzlk sender;
    public final List suggested_replies;

    public final class ActionBody extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActionBody> CREATOR;
        public final zzli action;
        public final String subtitle;
        public final String title;

        static {
            ChatMessage$ActionBody$Companion$ADAPTER$1 chatMessage$ActionBody$Companion$ADAPTER$1 = new ChatMessage$ActionBody$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActionBody.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.ActionBody", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$ActionBody$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$ActionBody$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBody(String str, String str2, zzli zzliVar, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.action = zzliVar;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActionBody)) {
                return false;
            }
            ActionBody actionBody = (ActionBody) obj;
            return Intrinsics.areEqual(unknownFields(), actionBody.unknownFields()) && Intrinsics.areEqual(this.title, actionBody.title) && Intrinsics.areEqual(this.subtitle, actionBody.subtitle) && Intrinsics.areEqual(this.action, actionBody.action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            zzli zzliVar = this.action;
            int hashCode4 = hashCode3 + (zzliVar != null ? zzliVar.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CardScheme.Builder builder = new CardScheme.Builder(25);
            builder.modules = this.title;
            builder.overflow_modules = this.subtitle;
            builder.card_home_actions = this.action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            zzli zzliVar = this.action;
            if (zzliVar != null) {
                arrayList.add("action=" + zzliVar);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActionBody{", "}", 0, null, null, 56);
        }
    }

    public final class Advocate extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Advocate> CREATOR;
        public final String display_name;

        static {
            ChatMessage$Advocate$Companion$ADAPTER$1 chatMessage$Advocate$Companion$ADAPTER$1 = new ChatMessage$Advocate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Advocate.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.Advocate", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$Advocate$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$Advocate$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Advocate(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_name = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Advocate)) {
                return false;
            }
            Advocate advocate = (Advocate) obj;
            return Intrinsics.areEqual(unknownFields(), advocate.unknownFields()) && Intrinsics.areEqual(this.display_name, advocate.display_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.display_name;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileDetails.Builder builder = new ProfileDetails.Builder(15);
            builder.bio = this.display_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.display_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "display_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Advocate{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes4.dex */
    public abstract class Body {

        /* loaded from: classes8.dex */
        public final class Action extends Body {
            public final ActionBody value;

            public Action(ActionBody actionBody) {
                actionBody.getClass();
                this.value = actionBody;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Action) && Intrinsics.areEqual(this.value, ((Action) obj).value);
            }

            public final ActionBody getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Action(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class File extends Body {
            public final FileBody value;

            public File(FileBody fileBody) {
                fileBody.getClass();
                this.value = fileBody;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof File) && Intrinsics.areEqual(this.value, ((File) obj).value);
            }

            public final FileBody getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "File(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SunshineFile extends Body {
            public final SunshineFileBody value;

            public SunshineFile(SunshineFileBody sunshineFileBody) {
                sunshineFileBody.getClass();
                this.value = sunshineFileBody;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SunshineFile) && Intrinsics.areEqual(this.value, ((SunshineFile) obj).value);
            }

            public final SunshineFileBody getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SunshineFile(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class SystemMessage extends Body {
            public final SystemMessageBody value;

            public SystemMessage(SystemMessageBody systemMessageBody) {
                systemMessageBody.getClass();
                this.value = systemMessageBody;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SystemMessage) && Intrinsics.areEqual(this.value, ((SystemMessage) obj).value);
            }

            public final SystemMessageBody getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "SystemMessage(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Text extends Body {
            public final TextBody value;

            public Text(TextBody textBody) {
                textBody.getClass();
                this.value = textBody;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Text) && Intrinsics.areEqual(this.value, ((Text) obj).value);
            }

            public final TextBody getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Text(value=" + this.value + ")";
            }
        }

        /* loaded from: classes8.dex */
        public final class Transaction extends Body {
            public final TransactionBody value;

            public Transaction(TransactionBody transactionBody) {
                transactionBody.getClass();
                this.value = transactionBody;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Transaction) && Intrinsics.areEqual(this.value, ((Transaction) obj).value);
            }

            public final TransactionBody getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Transaction(value=" + this.value + ")";
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
        
            r3.add(r11);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static LongTaskEvent.Connectivity fromJsonObject(JsonObject jsonObject) {
            ArrayList arrayList;
            JsonObject asJsonObject;
            String asString;
            JsonArray asJsonArray;
            try {
                String asString2 = jsonObject.get("status").getAsString();
                asString2.getClass();
                int i = 0;
                for (int i2 : CameraSelector$$ExternalSyntheticOutline0.values(3)) {
                    if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$2(i2).equals(asString2)) {
                        JsonElement jsonElement = jsonObject.get("interfaces");
                        if (jsonElement != null && (asJsonArray = jsonElement.getAsJsonArray()) != null) {
                            arrayList = new ArrayList(asJsonArray.size());
                            Iterator<JsonElement> it = asJsonArray.iterator();
                            while (it.hasNext()) {
                                String asString3 = it.next().getAsString();
                                asString3.getClass();
                                LongTaskEvent.Interface[] values = LongTaskEvent.Interface.values();
                                int length = values.length;
                                for (int i3 = 0; i3 < length; i3++) {
                                    LongTaskEvent.Interface r11 = values[i3];
                                    if (r11.jsonValue.equals(asString3)) {
                                        break;
                                    }
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                        }
                        arrayList = null;
                        JsonElement jsonElement2 = jsonObject.get("effective_type");
                        if (jsonElement2 != null && (asString = jsonElement2.getAsString()) != null) {
                            int[] values2 = CameraSelector$$ExternalSyntheticOutline0.values(4);
                            int length2 = values2.length;
                            while (i < length2) {
                                int i4 = values2[i];
                                if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$4(i4).equals(asString)) {
                                    i = i4;
                                } else {
                                    i++;
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        JsonElement jsonElement3 = jsonObject.get("cellular");
                        return new LongTaskEvent.Connectivity(i2, arrayList, i, (jsonElement3 == null || (asJsonObject = jsonElement3.getAsJsonObject()) == null) ? null : zzlf.fromJsonObject(asJsonObject));
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (IllegalStateException e) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Connectivity", e);
                return null;
            } catch (NullPointerException e2) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Connectivity", e2);
                return null;
            } catch (NumberFormatException e3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Connectivity", e3);
                return null;
            }
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewSecurity.deepLinkSpecs;
        }
    }

    public final class Bot extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Bot> CREATOR;

        static {
            ChatMessage$Bot$Companion$ADAPTER$1 chatMessage$Bot$Companion$ADAPTER$1 = new ChatMessage$Bot$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Bot.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.Bot", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$Bot$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$Bot$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Bot(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Bot) && Intrinsics.areEqual(unknownFields(), ((Bot) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetProfileRequest.Builder builder = new GetProfileRequest.Builder(3);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Bot{}";
        }
    }

    public final class ChatSystem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ChatSystem> CREATOR;

        static {
            ChatMessage$ChatSystem$Companion$ADAPTER$1 chatMessage$ChatSystem$Companion$ADAPTER$1 = new ChatMessage$ChatSystem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ChatSystem.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.ChatSystem", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$ChatSystem$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$ChatSystem$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChatSystem(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ChatSystem) && Intrinsics.areEqual(unknownFields(), ((ChatSystem) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetProfileRequest.Builder builder = new GetProfileRequest.Builder(4);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "ChatSystem{}";
        }
    }

    public final class Customer extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Customer> CREATOR;

        static {
            ChatMessage$Customer$Companion$ADAPTER$1 chatMessage$Customer$Companion$ADAPTER$1 = new ChatMessage$Customer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Customer.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.Customer", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$Customer$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$Customer$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Customer(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof Customer) && Intrinsics.areEqual(unknownFields(), ((Customer) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetProfileRequest.Builder builder = new GetProfileRequest.Builder(5);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "Customer{}";
        }
    }

    public final class Disclaimer extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Disclaimer> CREATOR;
        public final String text;

        static {
            ChatMessage$Disclaimer$Companion$ADAPTER$1 chatMessage$Disclaimer$Companion$ADAPTER$1 = new ChatMessage$Disclaimer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Disclaimer.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.Disclaimer", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$Disclaimer$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$Disclaimer$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disclaimer(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Disclaimer)) {
                return false;
            }
            Disclaimer disclaimer = (Disclaimer) obj;
            return Intrinsics.areEqual(unknownFields(), disclaimer.unknownFields()) && Intrinsics.areEqual(this.text, disclaimer.text);
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
            ProfileDetails.Builder builder = new ProfileDetails.Builder(16);
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
            return CollectionsKt.joinToString$default(arrayList, ", ", "Disclaimer{", "}", 0, null, null, 56);
        }
    }

    public final class FileBody extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FileBody> CREATOR;
        public final String file_name;
        public final String file_token;
        public final String mime_type;
        public final String text;

        static {
            ChatMessage$FileBody$Companion$ADAPTER$1 chatMessage$FileBody$Companion$ADAPTER$1 = new ChatMessage$FileBody$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FileBody.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.FileBody", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$FileBody$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$FileBody$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileBody(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.file_token = str2;
            this.mime_type = str3;
            this.file_name = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileBody)) {
                return false;
            }
            FileBody fileBody = (FileBody) obj;
            return Intrinsics.areEqual(unknownFields(), fileBody.unknownFields()) && Intrinsics.areEqual(this.text, fileBody.text) && Intrinsics.areEqual(this.file_token, fileBody.file_token) && Intrinsics.areEqual(this.mime_type, fileBody.mime_type) && Intrinsics.areEqual(this.file_name, fileBody.file_name);
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
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.mime_type;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.file_name;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolOwner.Builder builder = new PoolOwner.Builder(12);
            builder.customer_token = this.text;
            builder.full_name = this.file_token;
            builder.profile_photo_url = this.mime_type;
            builder.cashtag = this.file_name;
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
            String str3 = this.mime_type;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "mime_type=", arrayList);
            }
            String str4 = this.file_name;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "file_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FileBody{", "}", 0, null, null, 56);
        }
    }

    public final class OpenLink extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OpenLink> CREATOR;
        public final String url;

        static {
            ChatMessage$OpenLink$Companion$ADAPTER$1 chatMessage$OpenLink$Companion$ADAPTER$1 = new ChatMessage$OpenLink$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenLink.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.OpenLink", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$OpenLink$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$OpenLink$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenLink(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OpenLink)) {
                return false;
            }
            OpenLink openLink = (OpenLink) obj;
            return Intrinsics.areEqual(unknownFields(), openLink.unknownFields()) && Intrinsics.areEqual(this.url, openLink.url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileDetails.Builder builder = new ProfileDetails.Builder(17);
            builder.bio = this.url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OpenLink{", "}", 0, null, null, 56);
        }
    }

    public final class SelectTransaction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SelectTransaction> CREATOR;
        public final ByteString payload;

        static {
            ChatMessage$SelectTransaction$Companion$ADAPTER$1 chatMessage$SelectTransaction$Companion$ADAPTER$1 = new ChatMessage$SelectTransaction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SelectTransaction.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.SelectTransaction", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$SelectTransaction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$SelectTransaction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectTransaction(ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            byteString2.getClass();
            this.payload = byteString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SelectTransaction)) {
                return false;
            }
            SelectTransaction selectTransaction = (SelectTransaction) obj;
            return Intrinsics.areEqual(unknownFields(), selectTransaction.unknownFields()) && Intrinsics.areEqual(this.payload, selectTransaction.payload);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ByteString byteString = this.payload;
            int hashCode2 = hashCode + (byteString != null ? byteString.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Toggle.Builder builder = new Toggle.Builder(2);
            builder.opaque_request_data = this.payload;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ByteString byteString = this.payload;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("payload=", byteString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SelectTransaction{", "}", 0, null, null, 56);
        }
    }

    public final class SuggestedReply extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SuggestedReply> CREATOR;
        public final ByteString payload;
        public final String text;
        public final String token;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public ByteString payload;
            public String text;
            public String token;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new SuggestedReply(this.token, this.text, this.payload, buildUnknownFields());
                    default:
                        return new OutgoingMessage.SelectedReply(this.token, this.text, this.payload, buildUnknownFields());
                }
            }
        }

        static {
            ChatMessage$SuggestedReply$Companion$ADAPTER$1 chatMessage$SuggestedReply$Companion$ADAPTER$1 = new ChatMessage$SuggestedReply$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SuggestedReply.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.SuggestedReply", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$SuggestedReply$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$SuggestedReply$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestedReply(String str, String str2, ByteString byteString, ByteString byteString2) {
            super(ADAPTER, byteString2);
            byteString2.getClass();
            this.token = str;
            this.text = str2;
            this.payload = byteString;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SuggestedReply)) {
                return false;
            }
            SuggestedReply suggestedReply = (SuggestedReply) obj;
            return Intrinsics.areEqual(unknownFields(), suggestedReply.unknownFields()) && Intrinsics.areEqual(this.token, suggestedReply.token) && Intrinsics.areEqual(this.text, suggestedReply.text) && Intrinsics.areEqual(this.payload, suggestedReply.payload);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.token;
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
            Builder builder = new Builder(0);
            builder.token = this.token;
            builder.text = this.text;
            builder.payload = this.payload;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
            }
            String str2 = this.text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "text=", arrayList);
            }
            ByteString byteString = this.payload;
            if (byteString != null) {
                Request$Priority$EnumUnboxingLocalUtility.m("payload=", byteString, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SuggestedReply{", "}", 0, null, null, 56);
        }
    }

    public final class SunshineFileBody extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SunshineFileBody> CREATOR;
        public final String file_name;
        public final String media_type;
        public final String media_url;
        public final String text;

        static {
            ChatMessage$SunshineFileBody$Companion$ADAPTER$1 chatMessage$SunshineFileBody$Companion$ADAPTER$1 = new ChatMessage$SunshineFileBody$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SunshineFileBody.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.SunshineFileBody", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$SunshineFileBody$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$SunshineFileBody$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SunshineFileBody(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.media_url = str2;
            this.media_type = str3;
            this.file_name = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SunshineFileBody)) {
                return false;
            }
            SunshineFileBody sunshineFileBody = (SunshineFileBody) obj;
            return Intrinsics.areEqual(unknownFields(), sunshineFileBody.unknownFields()) && Intrinsics.areEqual(this.text, sunshineFileBody.text) && Intrinsics.areEqual(this.media_url, sunshineFileBody.media_url) && Intrinsics.areEqual(this.media_type, sunshineFileBody.media_type) && Intrinsics.areEqual(this.file_name, sunshineFileBody.file_name);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.media_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.media_type;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.file_name;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolOwner.Builder builder = new PoolOwner.Builder(13);
            builder.customer_token = this.text;
            builder.full_name = this.media_url;
            builder.profile_photo_url = this.media_type;
            builder.cashtag = this.file_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            String str2 = this.media_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "media_url=", arrayList);
            }
            String str3 = this.media_type;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "media_type=", arrayList);
            }
            String str4 = this.file_name;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "file_name=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SunshineFileBody{", "}", 0, null, null, 56);
        }
    }

    public final class SystemMessageBody extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SystemMessageBody> CREATOR;
        public final Styling styling;
        public final String text;

        /* loaded from: classes7.dex */
        public final class Styling extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Styling> CREATOR;
            public final Boolean show_divider;
            public final Boolean show_timestamp;

            static {
                ChatMessage$SystemMessageBody$Styling$Companion$ADAPTER$1 chatMessage$SystemMessageBody$Styling$Companion$ADAPTER$1 = new ChatMessage$SystemMessageBody$Styling$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Styling.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.SystemMessageBody.Styling", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
                ADAPTER = chatMessage$SystemMessageBody$Styling$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$SystemMessageBody$Styling$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Styling(Boolean bool, Boolean bool2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.show_divider = bool;
                this.show_timestamp = bool2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Styling)) {
                    return false;
                }
                Styling styling = (Styling) obj;
                return Intrinsics.areEqual(unknownFields(), styling.unknownFields()) && Intrinsics.areEqual(this.show_divider, styling.show_divider) && Intrinsics.areEqual(this.show_timestamp, styling.show_timestamp);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Boolean bool = this.show_divider;
                int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                Boolean bool2 = this.show_timestamp;
                int hashCode3 = hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                PortfolioState.Builder builder = new PortfolioState.Builder(3);
                builder.has_portfolio = this.show_divider;
                builder.has_holdings = this.show_timestamp;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.show_divider;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("show_divider=", bool, arrayList);
                }
                Boolean bool2 = this.show_timestamp;
                if (bool2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("show_timestamp=", bool2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Styling{", "}", 0, null, null, 56);
            }
        }

        static {
            ChatMessage$SystemMessageBody$Companion$ADAPTER$1 chatMessage$SystemMessageBody$Companion$ADAPTER$1 = new ChatMessage$SystemMessageBody$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SystemMessageBody.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.SystemMessageBody", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$SystemMessageBody$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$SystemMessageBody$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SystemMessageBody(String str, Styling styling, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.styling = styling;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SystemMessageBody)) {
                return false;
            }
            SystemMessageBody systemMessageBody = (SystemMessageBody) obj;
            return Intrinsics.areEqual(unknownFields(), systemMessageBody.unknownFields()) && Intrinsics.areEqual(this.text, systemMessageBody.text) && Intrinsics.areEqual(this.styling, systemMessageBody.styling);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Styling styling = this.styling;
            int hashCode3 = hashCode2 + (styling != null ? styling.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SplitButtons.Builder builder = new SplitButtons.Builder(11);
            builder.primary_button = this.text;
            builder.secondary_button = this.styling;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            Styling styling = this.styling;
            if (styling != null) {
                arrayList.add("styling=" + styling);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SystemMessageBody{", "}", 0, null, null, 56);
        }
    }

    public final class TextBody extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TextBody> CREATOR;
        public final String text;

        static {
            ChatMessage$TextBody$Companion$ADAPTER$1 chatMessage$TextBody$Companion$ADAPTER$1 = new ChatMessage$TextBody$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextBody.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.TextBody", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$TextBody$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$TextBody$Companion$ADAPTER$1);
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
            ProfileDetails.Builder builder = new ProfileDetails.Builder(18);
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
    }

    public final class TransactionBody extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TransactionBody> CREATOR;
        public final String entity_id;

        static {
            ChatMessage$TransactionBody$Companion$ADAPTER$1 chatMessage$TransactionBody$Companion$ADAPTER$1 = new ChatMessage$TransactionBody$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransactionBody.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage.TransactionBody", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = chatMessage$TransactionBody$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$TransactionBody$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionBody(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.entity_id = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TransactionBody)) {
                return false;
            }
            TransactionBody transactionBody = (TransactionBody) obj;
            return Intrinsics.areEqual(unknownFields(), transactionBody.unknownFields()) && Intrinsics.areEqual(this.entity_id, transactionBody.entity_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.entity_id;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileDetails.Builder builder = new ProfileDetails.Builder(19);
            builder.bio = this.entity_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.entity_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TransactionBody{", "}", 0, null, null, 56);
        }
    }

    static {
        ChatMessage$Companion$ADAPTER$1 chatMessage$Companion$ADAPTER$1 = new ChatMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ChatMessage.class), "type.googleapis.com/squareup.cash.supportal.app.ChatMessage", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = chatMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(chatMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessage(String str, Long l, String str2, Body body, zzlk zzlkVar, List list, Disclaimer disclaimer, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.message_token = str;
        this.recorded_at = l;
        this.idempotence_token = str2;
        this.body = body;
        this.sender = zzlkVar;
        this.disclaimer = disclaimer;
        this.suggested_replies = TransactorKt.immutableCopyOf("suggested_replies", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) obj;
        return Intrinsics.areEqual(unknownFields(), chatMessage.unknownFields()) && Intrinsics.areEqual(this.message_token, chatMessage.message_token) && Intrinsics.areEqual(this.recorded_at, chatMessage.recorded_at) && Intrinsics.areEqual(this.idempotence_token, chatMessage.idempotence_token) && Intrinsics.areEqual(this.body, chatMessage.body) && Intrinsics.areEqual(this.sender, chatMessage.sender) && Intrinsics.areEqual(this.suggested_replies, chatMessage.suggested_replies) && Intrinsics.areEqual(this.disclaimer, chatMessage.disclaimer);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.message_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.recorded_at;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.idempotence_token;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Body body = this.body;
        int hashCode5 = (hashCode4 + (body != null ? body.hashCode() : 0)) * 37;
        zzlk zzlkVar = this.sender;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (zzlkVar != null ? zzlkVar.hashCode() : 0)) * 37, 37, this.suggested_replies);
        Disclaimer disclaimer = this.disclaimer;
        int hashCode6 = m + (disclaimer != null ? disclaimer.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(26);
        builder.customer_identifier = this.message_token;
        builder.added_at = this.recorded_at;
        builder.full_name = this.idempotence_token;
        builder.profile_photo_url = this.body;
        builder.cashtag = this.sender;
        builder.participant_type = this.suggested_replies;
        builder.aggregated_contribution_amount = this.disclaimer;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.message_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_token=", arrayList);
        }
        Long l = this.recorded_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("recorded_at=", l, arrayList);
        }
        String str2 = this.idempotence_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "idempotence_token=", arrayList);
        }
        Body body = this.body;
        if (body != null) {
            arrayList.add("body=" + body);
        }
        zzlk zzlkVar = this.sender;
        if (zzlkVar != null) {
            arrayList.add("sender=" + zzlkVar);
        }
        List list = this.suggested_replies;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("suggested_replies=", arrayList, list);
        }
        Disclaimer disclaimer = this.disclaimer;
        if (disclaimer != null) {
            arrayList.add("disclaimer=" + disclaimer);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ChatMessage{", "}", 0, null, null, 56);
    }
}
