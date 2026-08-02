package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.app.GetBoostConfigResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetBoostConfigResponse$BtcBoostUpsell$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new GetBoostConfigResponse.BtcBoostUpsell((String) obj, (String) obj2, (String) obj3, (GetBoostConfigResponse.BtcBoostUpsell.Button) obj4, (Image) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(GetBoostConfigResponse.BtcBoostUpsell.Button.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetBoostConfigResponse.BtcBoostUpsell btcBoostUpsell = (GetBoostConfigResponse.BtcBoostUpsell) obj;
        reverseProtoWriter.getClass();
        btcBoostUpsell.getClass();
        reverseProtoWriter.writeBytes(btcBoostUpsell.unknownFields());
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, btcBoostUpsell.image);
        GetBoostConfigResponse.BtcBoostUpsell.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 4, btcBoostUpsell.primary_button);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, btcBoostUpsell.body_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, btcBoostUpsell.title_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, btcBoostUpsell.image_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetBoostConfigResponse.BtcBoostUpsell btcBoostUpsell = (GetBoostConfigResponse.BtcBoostUpsell) obj;
        btcBoostUpsell.getClass();
        int size$okio = btcBoostUpsell.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Image.ADAPTER.encodedSizeWithTag(5, btcBoostUpsell.image) + GetBoostConfigResponse.BtcBoostUpsell.Button.ADAPTER.encodedSizeWithTag(4, btcBoostUpsell.primary_button) + protoAdapter.encodedSizeWithTag(3, btcBoostUpsell.body_text) + protoAdapter.encodedSizeWithTag(2, btcBoostUpsell.title_text) + protoAdapter.encodedSizeWithTag(1, btcBoostUpsell.image_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetBoostConfigResponse.BtcBoostUpsell btcBoostUpsell = (GetBoostConfigResponse.BtcBoostUpsell) obj;
        btcBoostUpsell.getClass();
        GetBoostConfigResponse.BtcBoostUpsell.Button button = btcBoostUpsell.primary_button;
        GetBoostConfigResponse.BtcBoostUpsell.Button button2 = button != null ? (GetBoostConfigResponse.BtcBoostUpsell.Button) GetBoostConfigResponse.BtcBoostUpsell.Button.ADAPTER.redact(button) : null;
        Image image = btcBoostUpsell.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = btcBoostUpsell.image_url;
        String str2 = btcBoostUpsell.title_text;
        String str3 = btcBoostUpsell.body_text;
        byteString.getClass();
        return new GetBoostConfigResponse.BtcBoostUpsell(str, str2, str3, button2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetBoostConfigResponse.BtcBoostUpsell btcBoostUpsell = (GetBoostConfigResponse.BtcBoostUpsell) obj;
        btcBoostUpsell.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, btcBoostUpsell.image_url);
        protoAdapter.encodeWithTag(protoWriter, 2, btcBoostUpsell.title_text);
        protoAdapter.encodeWithTag(protoWriter, 3, btcBoostUpsell.body_text);
        GetBoostConfigResponse.BtcBoostUpsell.Button.ADAPTER.encodeWithTag(protoWriter, 4, btcBoostUpsell.primary_button);
        Image.ADAPTER.encodeWithTag(protoWriter, 5, btcBoostUpsell.image);
        protoWriter.writeBytes(btcBoostUpsell.unknownFields());
    }
}
