package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.datadog.android.rum.model.ActionEvent;
import com.squareup.protos.cash.local.client.v1.UpdateCartResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateCartResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        ActionEvent.Dd.Companion companion = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateCartResponse((CreateCartResponse) obj, companion, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CreateCartResponse.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                companion = new UpdateCartResponse$Response$Success((UpdateCartResponse.Success) UpdateCartResponse.Success.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                companion = new UpdateCartResponse$Response$Error((UpdateCartResponse.Error) UpdateCartResponse.Error.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateCartResponse updateCartResponse = (UpdateCartResponse) obj;
        reverseProtoWriter.getClass();
        updateCartResponse.getClass();
        reverseProtoWriter.writeBytes(updateCartResponse.unknownFields());
        ActionEvent.Dd.Companion companion = updateCartResponse.response;
        if (companion instanceof UpdateCartResponse$Response$Success) {
            UpdateCartResponse.Success.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((UpdateCartResponse$Response$Success) companion).value);
        } else if (companion instanceof UpdateCartResponse$Response$Error) {
            UpdateCartResponse.Error.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((UpdateCartResponse$Response$Error) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        CreateCartResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 1, updateCartResponse.create_cart_response);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateCartResponse updateCartResponse = (UpdateCartResponse) obj;
        updateCartResponse.getClass();
        int encodedSizeWithTag = CreateCartResponse.ADAPTER.encodedSizeWithTag(1, updateCartResponse.create_cart_response) + updateCartResponse.unknownFields().getSize$okio();
        ActionEvent.Dd.Companion companion = updateCartResponse.response;
        if (companion instanceof UpdateCartResponse$Response$Success) {
            return UpdateCartResponse.Success.ADAPTER.encodedSizeWithTag(2, ((UpdateCartResponse$Response$Success) companion).value) + encodedSizeWithTag;
        }
        if (companion instanceof UpdateCartResponse$Response$Error) {
            return UpdateCartResponse.Error.ADAPTER.encodedSizeWithTag(3, ((UpdateCartResponse$Response$Error) companion).value) + encodedSizeWithTag;
        }
        if (companion == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UpdateCartResponse updateCartResponse = (UpdateCartResponse) obj;
        updateCartResponse.getClass();
        CreateCartResponse createCartResponse = updateCartResponse.create_cart_response;
        CreateCartResponse createCartResponse2 = createCartResponse != null ? (CreateCartResponse) CreateCartResponse.ADAPTER.redact(createCartResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        ActionEvent.Dd.Companion companion = updateCartResponse.response;
        byteString.getClass();
        return new UpdateCartResponse(createCartResponse2, companion, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateCartResponse updateCartResponse = (UpdateCartResponse) obj;
        updateCartResponse.getClass();
        CreateCartResponse.ADAPTER.encodeWithTag(protoWriter, 1, updateCartResponse.create_cart_response);
        ActionEvent.Dd.Companion companion = updateCartResponse.response;
        if (companion instanceof UpdateCartResponse$Response$Success) {
            UpdateCartResponse.Success.ADAPTER.encodeWithTag(protoWriter, 2, ((UpdateCartResponse$Response$Success) companion).value);
        } else if (companion instanceof UpdateCartResponse$Response$Error) {
            UpdateCartResponse.Error.ADAPTER.encodeWithTag(protoWriter, 3, ((UpdateCartResponse$Response$Error) companion).value);
        } else if (companion != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(updateCartResponse.unknownFields());
    }
}
