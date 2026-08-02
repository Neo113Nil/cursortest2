package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.cashface.api.Activity;
import com.squareup.protos.cash.cashface.api.TrustsData;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Experiments extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Experiments> CREATOR;
    public final BNPLAssistantExperiment bnpl_assistant_experiment;

    public final class BNPLAssistantExperiment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BNPLAssistantExperiment> CREATOR;
        public final List messages;

        public final class Message extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Message> CREATOR;
            public final String query;
            public final String response;

            static {
                Experiments$BNPLAssistantExperiment$Message$Companion$ADAPTER$1 experiments$BNPLAssistantExperiment$Message$Companion$ADAPTER$1 = new Experiments$BNPLAssistantExperiment$Message$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Message.class), "type.googleapis.com/squareup.cash.cashsuggest.api.Experiments.BNPLAssistantExperiment.Message", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Experiments.proto");
                ADAPTER = experiments$BNPLAssistantExperiment$Message$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(experiments$BNPLAssistantExperiment$Message$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Message(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.query = str;
                this.response = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Message)) {
                    return false;
                }
                Message message = (Message) obj;
                return Intrinsics.areEqual(unknownFields(), message.unknownFields()) && Intrinsics.areEqual(this.query, message.query) && Intrinsics.areEqual(this.response, message.response);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.query;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.response;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Cashtag.Builder builder = new Cashtag.Builder(20);
                builder.prefix = this.query;
                builder.name = this.response;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.query;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "query=", arrayList);
                }
                String str2 = this.response;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "response=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Message{", "}", 0, null, null, 56);
            }
        }

        static {
            Experiments$BNPLAssistantExperiment$Companion$ADAPTER$1 experiments$BNPLAssistantExperiment$Companion$ADAPTER$1 = new Experiments$BNPLAssistantExperiment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BNPLAssistantExperiment.class), "type.googleapis.com/squareup.cash.cashsuggest.api.Experiments.BNPLAssistantExperiment", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Experiments.proto");
            ADAPTER = experiments$BNPLAssistantExperiment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(experiments$BNPLAssistantExperiment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BNPLAssistantExperiment(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.messages = TransactorKt.immutableCopyOf("messages", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BNPLAssistantExperiment)) {
                return false;
            }
            BNPLAssistantExperiment bNPLAssistantExperiment = (BNPLAssistantExperiment) obj;
            return Intrinsics.areEqual(unknownFields(), bNPLAssistantExperiment.unknownFields()) && Intrinsics.areEqual(this.messages, bNPLAssistantExperiment.messages);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.messages.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            TrustsData.Builder builder = new TrustsData.Builder(16);
            builder.trust = this.messages;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.messages;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("messages=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BNPLAssistantExperiment{", "}", 0, null, null, 56);
        }
    }

    static {
        Experiments$Companion$ADAPTER$1 experiments$Companion$ADAPTER$1 = new Experiments$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Experiments.class), "type.googleapis.com/squareup.cash.cashsuggest.api.Experiments", Syntax.PROTO_2, null, "squareup/cash/cashsuggest/api/Experiments.proto");
        ADAPTER = experiments$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(experiments$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Experiments(BNPLAssistantExperiment bNPLAssistantExperiment, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bnpl_assistant_experiment = bNPLAssistantExperiment;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Experiments)) {
            return false;
        }
        Experiments experiments = (Experiments) obj;
        return Intrinsics.areEqual(unknownFields(), experiments.unknownFields()) && Intrinsics.areEqual(this.bnpl_assistant_experiment, experiments.bnpl_assistant_experiment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BNPLAssistantExperiment bNPLAssistantExperiment = this.bnpl_assistant_experiment;
        int hashCode2 = hashCode + (bNPLAssistantExperiment != null ? bNPLAssistantExperiment.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Activity.Builder builder = new Activity.Builder(25);
        builder.activity = this.bnpl_assistant_experiment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BNPLAssistantExperiment bNPLAssistantExperiment = this.bnpl_assistant_experiment;
        if (bNPLAssistantExperiment != null) {
            arrayList.add("bnpl_assistant_experiment=" + bNPLAssistantExperiment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Experiments{", "}", 0, null, null, 56);
    }
}
