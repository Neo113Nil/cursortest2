package com.squareup.protos.cash.cashsuggest.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.clientsync.service.GetSyncEntitiesByTargetResponse;
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
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AfterpayAppletRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppletRequest> CREATOR;
    public final Boolean has_viewed_applet;
    public final List viewed_display_message_ids;
    public final List viewed_section_ids;

    /* loaded from: classes7.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Boolean has_viewed_applet;
        public List viewed_display_message_ids;
        public List viewed_section_ids;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    break;
                default:
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.viewed_display_message_ids = emptyList;
                    this.viewed_section_ids = emptyList;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new AfterpayAppletRequest(this.has_viewed_applet, this.viewed_display_message_ids, this.viewed_section_ids, buildUnknownFields());
                default:
                    return new GetSyncEntitiesByTargetResponse(this.has_viewed_applet, this.viewed_display_message_ids, this.viewed_section_ids, buildUnknownFields());
            }
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AfterpayAppletRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashsuggest.api.AfterpayAppletRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AfterpayAppletRequest((Boolean) obj, m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 2) {
                        obj = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AfterpayAppletRequest afterpayAppletRequest = (AfterpayAppletRequest) obj;
                reverseProtoWriter.getClass();
                afterpayAppletRequest.getClass();
                reverseProtoWriter.writeBytes(afterpayAppletRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 3, afterpayAppletRequest.viewed_section_ids);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, afterpayAppletRequest.has_viewed_applet);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 1, afterpayAppletRequest.viewed_display_message_ids);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                AfterpayAppletRequest afterpayAppletRequest = (AfterpayAppletRequest) obj;
                afterpayAppletRequest.getClass();
                int size$okio = afterpayAppletRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(3, afterpayAppletRequest.viewed_section_ids) + ProtoAdapter.BOOL.encodedSizeWithTag(2, afterpayAppletRequest.has_viewed_applet) + protoAdapter2.asRepeated().encodedSizeWithTag(1, afterpayAppletRequest.viewed_display_message_ids) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AfterpayAppletRequest afterpayAppletRequest = (AfterpayAppletRequest) obj;
                afterpayAppletRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                List list = afterpayAppletRequest.viewed_display_message_ids;
                Boolean bool = afterpayAppletRequest.has_viewed_applet;
                List list2 = afterpayAppletRequest.viewed_section_ids;
                list.getClass();
                list2.getClass();
                byteString.getClass();
                return new AfterpayAppletRequest(bool, list, list2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AfterpayAppletRequest afterpayAppletRequest = (AfterpayAppletRequest) obj;
                afterpayAppletRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 1, afterpayAppletRequest.viewed_display_message_ids);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, afterpayAppletRequest.has_viewed_applet);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, afterpayAppletRequest.viewed_section_ids);
                protoWriter.writeBytes(afterpayAppletRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppletRequest(Boolean bool, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.has_viewed_applet = bool;
        this.viewed_display_message_ids = TransactorKt.immutableCopyOf("viewed_display_message_ids", list);
        this.viewed_section_ids = TransactorKt.immutableCopyOf("viewed_section_ids", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletRequest)) {
            return false;
        }
        AfterpayAppletRequest afterpayAppletRequest = (AfterpayAppletRequest) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppletRequest.unknownFields()) && Intrinsics.areEqual(this.viewed_display_message_ids, afterpayAppletRequest.viewed_display_message_ids) && Intrinsics.areEqual(this.has_viewed_applet, afterpayAppletRequest.has_viewed_applet) && Intrinsics.areEqual(this.viewed_section_ids, afterpayAppletRequest.viewed_section_ids);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.viewed_display_message_ids);
        Boolean bool = this.has_viewed_applet;
        int hashCode = this.viewed_section_ids.hashCode() + ((m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.viewed_display_message_ids = this.viewed_display_message_ids;
        builder.has_viewed_applet = this.has_viewed_applet;
        builder.viewed_section_ids = this.viewed_section_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.viewed_display_message_ids;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("viewed_display_message_ids=", arrayList, list);
        }
        Boolean bool = this.has_viewed_applet;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_viewed_applet=", bool, arrayList);
        }
        List list2 = this.viewed_section_ids;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("viewed_section_ids=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppletRequest{", "}", 0, null, null, 56);
    }

    public AfterpayAppletRequest(List list, Boolean bool, List list2) {
        this(bool, list, list2, ByteString.EMPTY);
    }
}
