package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalActionOrdering$PopularOrder$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalActionOrdering.PopularOrder((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(LocalCart.Line.Selection.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalActionOrdering.PopularOrder popularOrder = (LocalActionOrdering.PopularOrder) obj;
        reverseProtoWriter.getClass();
        popularOrder.getClass();
        reverseProtoWriter.writeBytes(popularOrder.unknownFields());
        LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, popularOrder.cart_line_selections);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, popularOrder.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalActionOrdering.PopularOrder popularOrder = (LocalActionOrdering.PopularOrder) obj;
        popularOrder.getClass();
        return LocalCart.Line.Selection.ADAPTER.asRepeated().encodedSizeWithTag(2, popularOrder.cart_line_selections) + ProtoAdapter.STRING.encodedSizeWithTag(1, popularOrder.name) + popularOrder.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalActionOrdering.PopularOrder popularOrder = (LocalActionOrdering.PopularOrder) obj;
        popularOrder.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(popularOrder.cart_line_selections, LocalCart.Line.Selection.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = popularOrder.name;
        byteString.getClass();
        return new LocalActionOrdering.PopularOrder(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalActionOrdering.PopularOrder popularOrder = (LocalActionOrdering.PopularOrder) obj;
        popularOrder.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, popularOrder.name);
        LocalCart.Line.Selection.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, popularOrder.cart_line_selections);
        protoWriter.writeBytes(popularOrder.unknownFields());
    }
}
