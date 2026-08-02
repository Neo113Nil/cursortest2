package com.squareup.protos.cash.postcard.app;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class CreateKnotSessionRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateKnotSessionRequest> CREATOR;
    public final KnotEntryPoint entry_point;
    public final Integer knot_merchant_id;
    public final KnotSessionType session_type;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CreateKnotSessionRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.postcard.app.CreateKnotSessionRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CreateKnotSessionRequest((KnotEntryPoint) obj, (Integer) obj2, (KnotSessionType) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = KnotEntryPoint.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj3 = KnotSessionType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CreateKnotSessionRequest createKnotSessionRequest = (CreateKnotSessionRequest) obj;
                reverseProtoWriter.getClass();
                createKnotSessionRequest.getClass();
                reverseProtoWriter.writeBytes(createKnotSessionRequest.unknownFields());
                KnotSessionType.ADAPTER.encodeWithTag(reverseProtoWriter, 3, createKnotSessionRequest.session_type);
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, createKnotSessionRequest.knot_merchant_id);
                KnotEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createKnotSessionRequest.entry_point);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CreateKnotSessionRequest createKnotSessionRequest = (CreateKnotSessionRequest) obj;
                createKnotSessionRequest.getClass();
                return KnotSessionType.ADAPTER.encodedSizeWithTag(3, createKnotSessionRequest.session_type) + ProtoAdapter.INT32.encodedSizeWithTag(2, createKnotSessionRequest.knot_merchant_id) + KnotEntryPoint.ADAPTER.encodedSizeWithTag(1, createKnotSessionRequest.entry_point) + createKnotSessionRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CreateKnotSessionRequest createKnotSessionRequest = (CreateKnotSessionRequest) obj;
                createKnotSessionRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                KnotEntryPoint knotEntryPoint = createKnotSessionRequest.entry_point;
                Integer num = createKnotSessionRequest.knot_merchant_id;
                KnotSessionType knotSessionType = createKnotSessionRequest.session_type;
                byteString.getClass();
                return new CreateKnotSessionRequest(knotEntryPoint, num, knotSessionType, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CreateKnotSessionRequest createKnotSessionRequest = (CreateKnotSessionRequest) obj;
                createKnotSessionRequest.getClass();
                KnotEntryPoint.ADAPTER.encodeWithTag(protoWriter, 1, createKnotSessionRequest.entry_point);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, createKnotSessionRequest.knot_merchant_id);
                KnotSessionType.ADAPTER.encodeWithTag(protoWriter, 3, createKnotSessionRequest.session_type);
                protoWriter.writeBytes(createKnotSessionRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateKnotSessionRequest(KnotEntryPoint knotEntryPoint, Integer num, KnotSessionType knotSessionType, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.entry_point = knotEntryPoint;
        this.knot_merchant_id = num;
        this.session_type = knotSessionType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateKnotSessionRequest)) {
            return false;
        }
        CreateKnotSessionRequest createKnotSessionRequest = (CreateKnotSessionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createKnotSessionRequest.unknownFields()) && this.entry_point == createKnotSessionRequest.entry_point && Intrinsics.areEqual(this.knot_merchant_id, createKnotSessionRequest.knot_merchant_id) && this.session_type == createKnotSessionRequest.session_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        KnotEntryPoint knotEntryPoint = this.entry_point;
        int hashCode2 = (hashCode + (knotEntryPoint != null ? knotEntryPoint.hashCode() : 0)) * 37;
        Integer num = this.knot_merchant_id;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        KnotSessionType knotSessionType = this.session_type;
        int hashCode4 = hashCode3 + (knotSessionType != null ? knotSessionType.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CardScheme.Builder builder = new CardScheme.Builder(12);
        builder.modules = this.entry_point;
        builder.overflow_modules = this.knot_merchant_id;
        builder.card_home_actions = this.session_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        KnotEntryPoint knotEntryPoint = this.entry_point;
        if (knotEntryPoint != null) {
            arrayList.add("entry_point=" + knotEntryPoint);
        }
        Integer num = this.knot_merchant_id;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("knot_merchant_id=", num, arrayList);
        }
        KnotSessionType knotSessionType = this.session_type;
        if (knotSessionType != null) {
            arrayList.add("session_type=" + knotSessionType);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateKnotSessionRequest{", "}", 0, null, null, 56);
    }
}
