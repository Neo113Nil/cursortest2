package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OnFilePayment$CheckoutOptions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OnFilePayment.CheckoutOptions((Action.ScopeOptions) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Action.ScopeOptions.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OnFilePayment.CheckoutOptions checkoutOptions = (Action.OnFilePayment.CheckoutOptions) obj;
        reverseProtoWriter.getClass();
        checkoutOptions.getClass();
        reverseProtoWriter.writeBytes(checkoutOptions.unknownFields());
        Action.ScopeOptions.ADAPTER.encodeWithTag(reverseProtoWriter, 1, checkoutOptions.scope_options);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OnFilePayment.CheckoutOptions checkoutOptions = (Action.OnFilePayment.CheckoutOptions) obj;
        checkoutOptions.getClass();
        return Action.ScopeOptions.ADAPTER.encodedSizeWithTag(1, checkoutOptions.scope_options) + checkoutOptions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OnFilePayment.CheckoutOptions checkoutOptions = (Action.OnFilePayment.CheckoutOptions) obj;
        checkoutOptions.getClass();
        Action.ScopeOptions scopeOptions = checkoutOptions.scope_options;
        Action.ScopeOptions scopeOptions2 = scopeOptions != null ? (Action.ScopeOptions) Action.ScopeOptions.ADAPTER.redact(scopeOptions) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Action.OnFilePayment.CheckoutOptions(scopeOptions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OnFilePayment.CheckoutOptions checkoutOptions = (Action.OnFilePayment.CheckoutOptions) obj;
        checkoutOptions.getClass();
        Action.ScopeOptions.ADAPTER.encodeWithTag(protoWriter, 1, checkoutOptions.scope_options);
        protoWriter.writeBytes(checkoutOptions.unknownFields());
    }
}
