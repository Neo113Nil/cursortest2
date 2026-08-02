package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaperCashDepositRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaperCashDepositRenderData((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (LocalizableString) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj8);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaperCashDepositRenderData paperCashDepositRenderData = (PaperCashDepositRenderData) obj;
        reverseProtoWriter.getClass();
        paperCashDepositRenderData.getClass();
        reverseProtoWriter.writeBytes(paperCashDepositRenderData.unknownFields());
        LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 8, paperCashDepositRenderData.localizable_declined_reason);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, paperCashDepositRenderData.retailer_location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, paperCashDepositRenderData.retailer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, paperCashDepositRenderData.declined_reason);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, paperCashDepositRenderData.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, paperCashDepositRenderData.barcode);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paperCashDepositRenderData.retailer_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, paperCashDepositRenderData.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaperCashDepositRenderData paperCashDepositRenderData = (PaperCashDepositRenderData) obj;
        paperCashDepositRenderData.getClass();
        int size$okio = paperCashDepositRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return LocalizableString.ADAPTER.encodedSizeWithTag(8, paperCashDepositRenderData.localizable_declined_reason) + protoAdapter.encodedSizeWithTag(7, paperCashDepositRenderData.retailer_location_token) + protoAdapter.encodedSizeWithTag(6, paperCashDepositRenderData.retailer_token) + protoAdapter.encodedSizeWithTag(5, paperCashDepositRenderData.declined_reason) + protoAdapter.encodedSizeWithTag(4, paperCashDepositRenderData.state) + protoAdapter.encodedSizeWithTag(3, paperCashDepositRenderData.barcode) + protoAdapter.encodedSizeWithTag(2, paperCashDepositRenderData.retailer_name) + protoAdapter.encodedSizeWithTag(1, paperCashDepositRenderData.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaperCashDepositRenderData paperCashDepositRenderData = (PaperCashDepositRenderData) obj;
        paperCashDepositRenderData.getClass();
        LocalizableString localizableString = paperCashDepositRenderData.localizable_declined_reason;
        LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = paperCashDepositRenderData.token;
        String str2 = paperCashDepositRenderData.retailer_name;
        String str3 = paperCashDepositRenderData.barcode;
        String str4 = paperCashDepositRenderData.state;
        String str5 = paperCashDepositRenderData.declined_reason;
        String str6 = paperCashDepositRenderData.retailer_token;
        String str7 = paperCashDepositRenderData.retailer_location_token;
        byteString.getClass();
        return new PaperCashDepositRenderData(str, str2, str3, str4, str5, str6, str7, localizableString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaperCashDepositRenderData paperCashDepositRenderData = (PaperCashDepositRenderData) obj;
        paperCashDepositRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, paperCashDepositRenderData.token);
        protoAdapter.encodeWithTag(protoWriter, 2, paperCashDepositRenderData.retailer_name);
        protoAdapter.encodeWithTag(protoWriter, 3, paperCashDepositRenderData.barcode);
        protoAdapter.encodeWithTag(protoWriter, 4, paperCashDepositRenderData.state);
        protoAdapter.encodeWithTag(protoWriter, 5, paperCashDepositRenderData.declined_reason);
        protoAdapter.encodeWithTag(protoWriter, 6, paperCashDepositRenderData.retailer_token);
        protoAdapter.encodeWithTag(protoWriter, 7, paperCashDepositRenderData.retailer_location_token);
        LocalizableString.ADAPTER.encodeWithTag(protoWriter, 8, paperCashDepositRenderData.localizable_declined_reason);
        protoWriter.writeBytes(paperCashDepositRenderData.unknownFields());
    }
}
