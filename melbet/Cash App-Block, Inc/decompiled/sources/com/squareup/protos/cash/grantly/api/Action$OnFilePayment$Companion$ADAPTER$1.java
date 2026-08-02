package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OnFilePayment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OnFilePayment((String) obj, (String) obj2, (Action.OnFilePayment.Context) obj3, (Action.OnFilePayment.CheckoutOptions) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Action.OnFilePayment.Context.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Action.OnFilePayment.CheckoutOptions.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OnFilePayment onFilePayment = (Action.OnFilePayment) obj;
        reverseProtoWriter.getClass();
        onFilePayment.getClass();
        reverseProtoWriter.writeBytes(onFilePayment.unknownFields());
        Action.OnFilePayment.CheckoutOptions.ADAPTER.encodeWithTag(reverseProtoWriter, 4, onFilePayment.checkout_options);
        Action.OnFilePayment.Context.ADAPTER.encodeWithTag(reverseProtoWriter, 3, onFilePayment.context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, onFilePayment.account_reference_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, onFilePayment.scope_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OnFilePayment onFilePayment = (Action.OnFilePayment) obj;
        onFilePayment.getClass();
        int size$okio = onFilePayment.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Action.OnFilePayment.CheckoutOptions.ADAPTER.encodedSizeWithTag(4, onFilePayment.checkout_options) + Action.OnFilePayment.Context.ADAPTER.encodedSizeWithTag(3, onFilePayment.context) + protoAdapter.encodedSizeWithTag(2, onFilePayment.account_reference_id) + protoAdapter.encodedSizeWithTag(1, onFilePayment.scope_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OnFilePayment onFilePayment = (Action.OnFilePayment) obj;
        onFilePayment.getClass();
        Action.OnFilePayment.Context context = onFilePayment.context;
        Action.OnFilePayment.Context context2 = context != null ? (Action.OnFilePayment.Context) Action.OnFilePayment.Context.ADAPTER.redact(context) : null;
        Action.OnFilePayment.CheckoutOptions checkoutOptions = onFilePayment.checkout_options;
        Action.OnFilePayment.CheckoutOptions checkoutOptions2 = checkoutOptions != null ? (Action.OnFilePayment.CheckoutOptions) Action.OnFilePayment.CheckoutOptions.ADAPTER.redact(checkoutOptions) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = onFilePayment.scope_id;
        String str2 = onFilePayment.account_reference_id;
        byteString.getClass();
        return new Action.OnFilePayment(str, str2, context2, checkoutOptions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OnFilePayment onFilePayment = (Action.OnFilePayment) obj;
        onFilePayment.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, onFilePayment.scope_id);
        protoAdapter.encodeWithTag(protoWriter, 2, onFilePayment.account_reference_id);
        Action.OnFilePayment.Context.ADAPTER.encodeWithTag(protoWriter, 3, onFilePayment.context);
        Action.OnFilePayment.CheckoutOptions.ADAPTER.encodeWithTag(protoWriter, 4, onFilePayment.checkout_options);
        protoWriter.writeBytes(onFilePayment.unknownFields());
    }
}
