package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class POSBrandOnboarding$LocalCashDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new POSBrandOnboarding.LocalCashDetails((Long) obj, (LocalImage) obj2, (String) obj3, (ShortlinkAction) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalImage.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(ShortlinkAction.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        POSBrandOnboarding.LocalCashDetails localCashDetails = (POSBrandOnboarding.LocalCashDetails) obj;
        reverseProtoWriter.getClass();
        localCashDetails.getClass();
        reverseProtoWriter.writeBytes(localCashDetails.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, localCashDetails.title);
        ShortlinkAction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, localCashDetails.primary_button_shortlink);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localCashDetails.body);
        LocalImage.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localCashDetails.image);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, localCashDetails.local_cash_amount);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        POSBrandOnboarding.LocalCashDetails localCashDetails = (POSBrandOnboarding.LocalCashDetails) obj;
        localCashDetails.getClass();
        int encodedSizeWithTag = LocalImage.ADAPTER.encodedSizeWithTag(2, localCashDetails.image) + ProtoAdapter.INT64.encodedSizeWithTag(1, localCashDetails.local_cash_amount) + localCashDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, localCashDetails.title) + ShortlinkAction.ADAPTER.encodedSizeWithTag(4, localCashDetails.primary_button_shortlink) + protoAdapter.encodedSizeWithTag(3, localCashDetails.body) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        POSBrandOnboarding.LocalCashDetails localCashDetails = (POSBrandOnboarding.LocalCashDetails) obj;
        localCashDetails.getClass();
        LocalImage localImage = localCashDetails.image;
        LocalImage localImage2 = localImage != null ? (LocalImage) LocalImage.ADAPTER.redact(localImage) : null;
        ShortlinkAction shortlinkAction = localCashDetails.primary_button_shortlink;
        ShortlinkAction shortlinkAction2 = shortlinkAction != null ? (ShortlinkAction) ShortlinkAction.ADAPTER.redact(shortlinkAction) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = localCashDetails.local_cash_amount;
        String str = localCashDetails.body;
        String str2 = localCashDetails.title;
        byteString.getClass();
        return new POSBrandOnboarding.LocalCashDetails(l, localImage2, str, shortlinkAction2, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        POSBrandOnboarding.LocalCashDetails localCashDetails = (POSBrandOnboarding.LocalCashDetails) obj;
        localCashDetails.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, localCashDetails.local_cash_amount);
        LocalImage.ADAPTER.encodeWithTag(protoWriter, 2, localCashDetails.image);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, localCashDetails.body);
        ShortlinkAction.ADAPTER.encodeWithTag(protoWriter, 4, localCashDetails.primary_button_shortlink);
        protoAdapter.encodeWithTag(protoWriter, 5, localCashDetails.title);
        protoWriter.writeBytes(localCashDetails.unknownFields());
    }
}
