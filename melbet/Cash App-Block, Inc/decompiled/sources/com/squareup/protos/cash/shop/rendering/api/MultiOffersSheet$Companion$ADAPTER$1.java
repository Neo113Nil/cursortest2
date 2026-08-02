package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.MultiOffersSheet;
import com.squareup.protos.franklin.ui.Avatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class MultiOffersSheet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MultiOffersSheet((Avatar) obj, (String) obj2, (String) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(MultiOffersSheet.OfferPreview.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MultiOffersSheet multiOffersSheet = (MultiOffersSheet) obj;
        reverseProtoWriter.getClass();
        multiOffersSheet.getClass();
        reverseProtoWriter.writeBytes(multiOffersSheet.unknownFields());
        MultiOffersSheet.OfferPreview.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, multiOffersSheet.offer_previews);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, multiOffersSheet.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, multiOffersSheet.title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, multiOffersSheet.business_logo);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MultiOffersSheet multiOffersSheet = (MultiOffersSheet) obj;
        multiOffersSheet.getClass();
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(2, multiOffersSheet.business_logo) + multiOffersSheet.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return MultiOffersSheet.OfferPreview.ADAPTER.asRepeated().encodedSizeWithTag(5, multiOffersSheet.offer_previews) + protoAdapter.encodedSizeWithTag(4, multiOffersSheet.subtitle) + protoAdapter.encodedSizeWithTag(3, multiOffersSheet.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MultiOffersSheet multiOffersSheet = (MultiOffersSheet) obj;
        multiOffersSheet.getClass();
        Avatar avatar = multiOffersSheet.business_logo;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(multiOffersSheet.offer_previews, MultiOffersSheet.OfferPreview.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = multiOffersSheet.title;
        String str2 = multiOffersSheet.subtitle;
        byteString.getClass();
        return new MultiOffersSheet(avatar2, str, str2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MultiOffersSheet multiOffersSheet = (MultiOffersSheet) obj;
        multiOffersSheet.getClass();
        Avatar.ADAPTER.encodeWithTag(protoWriter, 2, multiOffersSheet.business_logo);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, multiOffersSheet.title);
        protoAdapter.encodeWithTag(protoWriter, 4, multiOffersSheet.subtitle);
        MultiOffersSheet.OfferPreview.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, multiOffersSheet.offer_previews);
        protoWriter.writeBytes(multiOffersSheet.unknownFields());
    }
}
