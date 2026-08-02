package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzll;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.cash.profiles.ProfileDetails;
import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import com.squareup.protos.franklin.app.GetProfileRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetChatMessagesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetChatMessagesRequest> CREATOR;
    public final zzll criteria;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetChatMessagesRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.supportal.app.GetChatMessagesRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                zzll zzllVar = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetChatMessagesRequest(zzllVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        zzllVar = new GetChatMessagesRequest$Criteria$Recent((GetChatMessagesRequest.RecentHistory) GetChatMessagesRequest.RecentHistory.ADAPTER.decode(protoReader));
                    } else if (nextTag == 2) {
                        zzllVar = new GetChatMessagesRequest$Criteria$After((GetChatMessagesRequest.After) GetChatMessagesRequest.After.ADAPTER.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        zzllVar = new GetChatMessagesRequest$Criteria$Before((GetChatMessagesRequest.Before) GetChatMessagesRequest.Before.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetChatMessagesRequest getChatMessagesRequest = (GetChatMessagesRequest) obj;
                reverseProtoWriter.getClass();
                getChatMessagesRequest.getClass();
                reverseProtoWriter.writeBytes(getChatMessagesRequest.unknownFields());
                zzll zzllVar = getChatMessagesRequest.criteria;
                if (zzllVar instanceof GetChatMessagesRequest$Criteria$Recent) {
                    GetChatMessagesRequest.RecentHistory.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((GetChatMessagesRequest$Criteria$Recent) zzllVar).value);
                    return;
                }
                if (zzllVar instanceof GetChatMessagesRequest$Criteria$After) {
                    GetChatMessagesRequest.After.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((GetChatMessagesRequest$Criteria$After) zzllVar).value);
                } else if (zzllVar instanceof GetChatMessagesRequest$Criteria$Before) {
                    GetChatMessagesRequest.Before.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((GetChatMessagesRequest$Criteria$Before) zzllVar).value);
                } else {
                    if (zzllVar == null) {
                        return;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                GetChatMessagesRequest getChatMessagesRequest = (GetChatMessagesRequest) obj;
                getChatMessagesRequest.getClass();
                int size$okio = getChatMessagesRequest.unknownFields().getSize$okio();
                zzll zzllVar = getChatMessagesRequest.criteria;
                if (zzllVar instanceof GetChatMessagesRequest$Criteria$Recent) {
                    encodedSizeWithTag = GetChatMessagesRequest.RecentHistory.ADAPTER.encodedSizeWithTag(1, ((GetChatMessagesRequest$Criteria$Recent) zzllVar).value);
                } else if (zzllVar instanceof GetChatMessagesRequest$Criteria$After) {
                    encodedSizeWithTag = GetChatMessagesRequest.After.ADAPTER.encodedSizeWithTag(2, ((GetChatMessagesRequest$Criteria$After) zzllVar).value);
                } else {
                    if (!(zzllVar instanceof GetChatMessagesRequest$Criteria$Before)) {
                        if (zzllVar == null) {
                            return size$okio;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    encodedSizeWithTag = GetChatMessagesRequest.Before.ADAPTER.encodedSizeWithTag(3, ((GetChatMessagesRequest$Criteria$Before) zzllVar).value);
                }
                return encodedSizeWithTag + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetChatMessagesRequest getChatMessagesRequest = (GetChatMessagesRequest) obj;
                getChatMessagesRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                zzll zzllVar = getChatMessagesRequest.criteria;
                byteString.getClass();
                return new GetChatMessagesRequest(zzllVar, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetChatMessagesRequest getChatMessagesRequest = (GetChatMessagesRequest) obj;
                getChatMessagesRequest.getClass();
                zzll zzllVar = getChatMessagesRequest.criteria;
                if (zzllVar instanceof GetChatMessagesRequest$Criteria$Recent) {
                    GetChatMessagesRequest.RecentHistory.ADAPTER.encodeWithTag(protoWriter, 1, ((GetChatMessagesRequest$Criteria$Recent) zzllVar).value);
                } else if (zzllVar instanceof GetChatMessagesRequest$Criteria$After) {
                    GetChatMessagesRequest.After.ADAPTER.encodeWithTag(protoWriter, 2, ((GetChatMessagesRequest$Criteria$After) zzllVar).value);
                } else if (zzllVar instanceof GetChatMessagesRequest$Criteria$Before) {
                    GetChatMessagesRequest.Before.ADAPTER.encodeWithTag(protoWriter, 3, ((GetChatMessagesRequest$Criteria$Before) zzllVar).value);
                } else if (zzllVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(getChatMessagesRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetChatMessagesRequest(zzll zzllVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.criteria = zzllVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetChatMessagesRequest)) {
            return false;
        }
        GetChatMessagesRequest getChatMessagesRequest = (GetChatMessagesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getChatMessagesRequest.unknownFields()) && Intrinsics.areEqual(this.criteria, getChatMessagesRequest.criteria);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        zzll zzllVar = this.criteria;
        int hashCode2 = hashCode + (zzllVar != null ? zzllVar.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(26);
        builder.pool_lifecycle_filter = this.criteria;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        zzll zzllVar = this.criteria;
        if (zzllVar != null) {
            arrayList.add("criteria=" + zzllVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetChatMessagesRequest{", "}", 0, null, null, 56);
    }

    /* loaded from: classes8.dex */
    public final class RecentHistory extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RecentHistory> CREATOR;

        static {
            GetChatMessagesRequest$RecentHistory$Companion$ADAPTER$1 getChatMessagesRequest$RecentHistory$Companion$ADAPTER$1 = new GetChatMessagesRequest$RecentHistory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecentHistory.class), "type.googleapis.com/squareup.cash.supportal.app.GetChatMessagesRequest.RecentHistory", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = getChatMessagesRequest$RecentHistory$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getChatMessagesRequest$RecentHistory$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecentHistory(ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof RecentHistory) && Intrinsics.areEqual(unknownFields(), ((RecentHistory) obj).unknownFields());
        }

        public final int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GetProfileRequest.Builder builder = new GetProfileRequest.Builder(7);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            return "RecentHistory{}";
        }

        public /* synthetic */ RecentHistory() {
            this(ByteString.EMPTY);
        }
    }

    /* loaded from: classes8.dex */
    public final class After extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<After> CREATOR;
        public final String message_token;

        static {
            GetChatMessagesRequest$After$Companion$ADAPTER$1 getChatMessagesRequest$After$Companion$ADAPTER$1 = new GetChatMessagesRequest$After$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(After.class), "type.googleapis.com/squareup.cash.supportal.app.GetChatMessagesRequest.After", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = getChatMessagesRequest$After$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getChatMessagesRequest$After$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public After(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.message_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof After)) {
                return false;
            }
            After after = (After) obj;
            return Intrinsics.areEqual(unknownFields(), after.unknownFields()) && Intrinsics.areEqual(this.message_token, after.message_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.message_token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileDetails.Builder builder = new ProfileDetails.Builder(21);
            builder.bio = this.message_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.message_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "After{", "}", 0, null, null, 56);
        }

        public /* synthetic */ After(String str) {
            this(str, ByteString.EMPTY);
        }
    }

    /* loaded from: classes8.dex */
    public final class Before extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Before> CREATOR;
        public final String message_token;

        static {
            GetChatMessagesRequest$Before$Companion$ADAPTER$1 getChatMessagesRequest$Before$Companion$ADAPTER$1 = new GetChatMessagesRequest$Before$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Before.class), "type.googleapis.com/squareup.cash.supportal.app.GetChatMessagesRequest.Before", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
            ADAPTER = getChatMessagesRequest$Before$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getChatMessagesRequest$Before$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Before(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.message_token = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Before)) {
                return false;
            }
            Before before = (Before) obj;
            return Intrinsics.areEqual(unknownFields(), before.unknownFields()) && Intrinsics.areEqual(this.message_token, before.message_token);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.message_token;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileDetails.Builder builder = new ProfileDetails.Builder(22);
            builder.bio = this.message_token;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.message_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_token=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Before{", "}", 0, null, null, 56);
        }

        public /* synthetic */ Before(String str) {
            this(str, ByteString.EMPTY);
        }
    }

    public /* synthetic */ GetChatMessagesRequest(zzll zzllVar) {
        this(zzllVar, ByteString.EMPTY);
    }
}
