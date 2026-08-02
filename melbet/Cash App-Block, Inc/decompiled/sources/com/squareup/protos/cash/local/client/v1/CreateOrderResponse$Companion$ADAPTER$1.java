package com.squareup.protos.cash.local.client.v1;

import com.datadog.android.core.persistence.SerializerKt;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateOrderResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        SerializerKt serializerKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOrderResponse(serializerKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    serializerKt = new CreateOrderResponse$Response$Success((CreateOrderResponse.Success) CreateOrderResponse.Success.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    serializerKt = new CreateOrderResponse$Response$ErrorResponse((CreateOrderResponse.ErrorResponse) CreateOrderResponse.ErrorResponse.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    serializerKt = new CreateOrderResponse$Response$ErrorResponses((LocalErrorResponse) LocalErrorResponse.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    serializerKt = new CreateOrderResponse$Response$UpdatedCartResponse((CreateOrderResponse.UpdatedCartResponse) CreateOrderResponse.UpdatedCartResponse.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    serializerKt = new CreateOrderResponse$Response$InputsNotFulfilled((CreateOrderResponse.InputsNotFulfilled) CreateOrderResponse.InputsNotFulfilled.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    serializerKt = new CreateOrderResponse$Response$OpenTab((CreateOrderResponse.OpenTab) CreateOrderResponse.OpenTab.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOrderResponse createOrderResponse = (CreateOrderResponse) obj;
        reverseProtoWriter.getClass();
        createOrderResponse.getClass();
        reverseProtoWriter.writeBytes(createOrderResponse.unknownFields());
        SerializerKt serializerKt = createOrderResponse.response;
        if (serializerKt instanceof CreateOrderResponse$Response$Success) {
            CreateOrderResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((CreateOrderResponse$Response$Success) serializerKt).value);
            return;
        }
        if (serializerKt instanceof CreateOrderResponse$Response$ErrorResponse) {
            CreateOrderResponse.ErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((CreateOrderResponse$Response$ErrorResponse) serializerKt).value);
            return;
        }
        if (serializerKt instanceof CreateOrderResponse$Response$ErrorResponses) {
            LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((CreateOrderResponse$Response$ErrorResponses) serializerKt).value);
            return;
        }
        if (serializerKt instanceof CreateOrderResponse$Response$UpdatedCartResponse) {
            CreateOrderResponse.UpdatedCartResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((CreateOrderResponse$Response$UpdatedCartResponse) serializerKt).value);
            return;
        }
        if (serializerKt instanceof CreateOrderResponse$Response$InputsNotFulfilled) {
            CreateOrderResponse.InputsNotFulfilled.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((CreateOrderResponse$Response$InputsNotFulfilled) serializerKt).value);
        } else if (serializerKt instanceof CreateOrderResponse$Response$OpenTab) {
            CreateOrderResponse.OpenTab.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((CreateOrderResponse$Response$OpenTab) serializerKt).value);
        } else {
            if (serializerKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        CreateOrderResponse createOrderResponse = (CreateOrderResponse) obj;
        createOrderResponse.getClass();
        int size$okio = createOrderResponse.unknownFields().getSize$okio();
        SerializerKt serializerKt = createOrderResponse.response;
        if (serializerKt instanceof CreateOrderResponse$Response$Success) {
            encodedSizeWithTag = CreateOrderResponse.Success.ADAPTER.encodedSizeWithTag(1, ((CreateOrderResponse$Response$Success) serializerKt).value);
        } else if (serializerKt instanceof CreateOrderResponse$Response$ErrorResponse) {
            encodedSizeWithTag = CreateOrderResponse.ErrorResponse.ADAPTER.encodedSizeWithTag(2, ((CreateOrderResponse$Response$ErrorResponse) serializerKt).value);
        } else if (serializerKt instanceof CreateOrderResponse$Response$ErrorResponses) {
            encodedSizeWithTag = LocalErrorResponse.ADAPTER.encodedSizeWithTag(3, ((CreateOrderResponse$Response$ErrorResponses) serializerKt).value);
        } else if (serializerKt instanceof CreateOrderResponse$Response$UpdatedCartResponse) {
            encodedSizeWithTag = CreateOrderResponse.UpdatedCartResponse.ADAPTER.encodedSizeWithTag(4, ((CreateOrderResponse$Response$UpdatedCartResponse) serializerKt).value);
        } else if (serializerKt instanceof CreateOrderResponse$Response$InputsNotFulfilled) {
            encodedSizeWithTag = CreateOrderResponse.InputsNotFulfilled.ADAPTER.encodedSizeWithTag(5, ((CreateOrderResponse$Response$InputsNotFulfilled) serializerKt).value);
        } else {
            if (!(serializerKt instanceof CreateOrderResponse$Response$OpenTab)) {
                if (serializerKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = CreateOrderResponse.OpenTab.ADAPTER.encodedSizeWithTag(6, ((CreateOrderResponse$Response$OpenTab) serializerKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOrderResponse createOrderResponse = (CreateOrderResponse) obj;
        createOrderResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        SerializerKt serializerKt = createOrderResponse.response;
        byteString.getClass();
        return new CreateOrderResponse(serializerKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOrderResponse createOrderResponse = (CreateOrderResponse) obj;
        createOrderResponse.getClass();
        SerializerKt serializerKt = createOrderResponse.response;
        if (serializerKt instanceof CreateOrderResponse$Response$Success) {
            CreateOrderResponse.Success.ADAPTER.encodeWithTag(protoWriter, 1, ((CreateOrderResponse$Response$Success) serializerKt).value);
        } else if (serializerKt instanceof CreateOrderResponse$Response$ErrorResponse) {
            CreateOrderResponse.ErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, ((CreateOrderResponse$Response$ErrorResponse) serializerKt).value);
        } else if (serializerKt instanceof CreateOrderResponse$Response$ErrorResponses) {
            LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 3, ((CreateOrderResponse$Response$ErrorResponses) serializerKt).value);
        } else if (serializerKt instanceof CreateOrderResponse$Response$UpdatedCartResponse) {
            CreateOrderResponse.UpdatedCartResponse.ADAPTER.encodeWithTag(protoWriter, 4, ((CreateOrderResponse$Response$UpdatedCartResponse) serializerKt).value);
        } else if (serializerKt instanceof CreateOrderResponse$Response$InputsNotFulfilled) {
            CreateOrderResponse.InputsNotFulfilled.ADAPTER.encodeWithTag(protoWriter, 5, ((CreateOrderResponse$Response$InputsNotFulfilled) serializerKt).value);
        } else if (serializerKt instanceof CreateOrderResponse$Response$OpenTab) {
            CreateOrderResponse.OpenTab.ADAPTER.encodeWithTag(protoWriter, 6, ((CreateOrderResponse$Response$OpenTab) serializerKt).value);
        } else if (serializerKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(createOrderResponse.unknownFields());
    }
}
