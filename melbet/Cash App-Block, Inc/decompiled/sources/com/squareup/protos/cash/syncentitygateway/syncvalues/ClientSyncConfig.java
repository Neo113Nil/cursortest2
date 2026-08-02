package com.squareup.protos.cash.syncentitygateway.syncvalues;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.giftly.app.GetGiftCardStoreInfoResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ClientSyncConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientSyncConfig> CREATOR;
    public final List all_active_topics;
    public final List app_launch_topic_sync_allowlist;
    public final List topic_sync_allowlist;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClientSyncConfig.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.syncentitygateway.syncvalues.ClientSyncConfig$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new ClientSyncConfig(m, arrayList, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag == 2) {
                        arrayList.add(ProtoAdapter.INT32.decode(protoReader));
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList2.add(ProtoAdapter.INT32.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                ClientSyncConfig clientSyncConfig = (ClientSyncConfig) obj;
                reverseProtoWriter.getClass();
                clientSyncConfig.getClass();
                reverseProtoWriter.writeBytes(clientSyncConfig.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 3, clientSyncConfig.app_launch_topic_sync_allowlist);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 2, clientSyncConfig.topic_sync_allowlist);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 1, clientSyncConfig.all_active_topics);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                ClientSyncConfig clientSyncConfig = (ClientSyncConfig) obj;
                clientSyncConfig.getClass();
                int size$okio = clientSyncConfig.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                return protoAdapter2.asRepeated().encodedSizeWithTag(3, clientSyncConfig.app_launch_topic_sync_allowlist) + protoAdapter2.asRepeated().encodedSizeWithTag(2, clientSyncConfig.topic_sync_allowlist) + protoAdapter2.asRepeated().encodedSizeWithTag(1, clientSyncConfig.all_active_topics) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                ClientSyncConfig clientSyncConfig = (ClientSyncConfig) obj;
                clientSyncConfig.getClass();
                ByteString byteString = ByteString.EMPTY;
                List list = clientSyncConfig.all_active_topics;
                List list2 = clientSyncConfig.topic_sync_allowlist;
                List list3 = clientSyncConfig.app_launch_topic_sync_allowlist;
                list.getClass();
                list2.getClass();
                list3.getClass();
                byteString.getClass();
                return new ClientSyncConfig(list, list2, list3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                ClientSyncConfig clientSyncConfig = (ClientSyncConfig) obj;
                clientSyncConfig.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 1, clientSyncConfig.all_active_topics);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, clientSyncConfig.topic_sync_allowlist);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, clientSyncConfig.app_launch_topic_sync_allowlist);
                protoWriter.writeBytes(clientSyncConfig.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientSyncConfig(List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.all_active_topics = TransactorKt.immutableCopyOf("all_active_topics", list);
        this.topic_sync_allowlist = TransactorKt.immutableCopyOf("topic_sync_allowlist", list2);
        this.app_launch_topic_sync_allowlist = TransactorKt.immutableCopyOf("app_launch_topic_sync_allowlist", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientSyncConfig)) {
            return false;
        }
        ClientSyncConfig clientSyncConfig = (ClientSyncConfig) obj;
        return Intrinsics.areEqual(unknownFields(), clientSyncConfig.unknownFields()) && Intrinsics.areEqual(this.all_active_topics, clientSyncConfig.all_active_topics) && Intrinsics.areEqual(this.topic_sync_allowlist, clientSyncConfig.topic_sync_allowlist) && Intrinsics.areEqual(this.app_launch_topic_sync_allowlist, clientSyncConfig.app_launch_topic_sync_allowlist);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.app_launch_topic_sync_allowlist.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.all_active_topics), 37, this.topic_sync_allowlist);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetGiftCardStoreInfoResponse.Builder builder = new GetGiftCardStoreInfoResponse.Builder();
        builder.gift_card_types = this.all_active_topics;
        builder.gift_card_categories = this.topic_sync_allowlist;
        builder.gift_card_upsells = this.app_launch_topic_sync_allowlist;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.all_active_topics;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("all_active_topics=", arrayList, list);
        }
        List list2 = this.topic_sync_allowlist;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("topic_sync_allowlist=", arrayList, list2);
        }
        List list3 = this.app_launch_topic_sync_allowlist;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("app_launch_topic_sync_allowlist=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientSyncConfig{", "}", 0, null, null, 56);
    }
}
