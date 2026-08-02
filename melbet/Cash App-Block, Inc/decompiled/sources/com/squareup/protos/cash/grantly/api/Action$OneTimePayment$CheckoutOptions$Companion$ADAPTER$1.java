package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OneTimePayment$CheckoutOptions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OneTimePayment.CheckoutOptions((Boolean) obj, (Action.ScopeOptions) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Action.ScopeOptions.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OneTimePayment.CheckoutOptions checkoutOptions = (Action.OneTimePayment.CheckoutOptions) obj;
        reverseProtoWriter.getClass();
        checkoutOptions.getClass();
        reverseProtoWriter.writeBytes(checkoutOptions.unknownFields());
        Action.ScopeOptions.ADAPTER.encodeWithTag(reverseProtoWriter, 2, checkoutOptions.scope_options);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, checkoutOptions.automatic_discounts);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OneTimePayment.CheckoutOptions checkoutOptions = (Action.OneTimePayment.CheckoutOptions) obj;
        checkoutOptions.getClass();
        return Action.ScopeOptions.ADAPTER.encodedSizeWithTag(2, checkoutOptions.scope_options) + ProtoAdapter.BOOL.encodedSizeWithTag(1, checkoutOptions.automatic_discounts) + checkoutOptions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OneTimePayment.CheckoutOptions checkoutOptions = (Action.OneTimePayment.CheckoutOptions) obj;
        checkoutOptions.getClass();
        Action.ScopeOptions scopeOptions = checkoutOptions.scope_options;
        Action.ScopeOptions scopeOptions2 = scopeOptions != null ? (Action.ScopeOptions) Action.ScopeOptions.ADAPTER.redact(scopeOptions) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = checkoutOptions.automatic_discounts;
        byteString.getClass();
        return new Action.OneTimePayment.CheckoutOptions(bool, scopeOptions2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OneTimePayment.CheckoutOptions checkoutOptions = (Action.OneTimePayment.CheckoutOptions) obj;
        checkoutOptions.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, checkoutOptions.automatic_discounts);
        Action.ScopeOptions.ADAPTER.encodeWithTag(protoWriter, 2, checkoutOptions.scope_options);
        protoWriter.writeBytes(checkoutOptions.unknownFields());
    }
}
