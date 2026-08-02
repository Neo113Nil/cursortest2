package com.squareup.protos.cash.money.content;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class FinishSetupTileV1$Companion$ADAPTER$1 extends ProtoAdapter {
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FinishSetupTileV1((String) obj, (Integer) obj2, (Integer) obj3, (Image) obj4, (String) obj5, (Boolean) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FinishSetupTileV1 finishSetupTileV1 = (FinishSetupTileV1) obj;
        reverseProtoWriter.getClass();
        finishSetupTileV1.getClass();
        reverseProtoWriter.writeBytes(finishSetupTileV1.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, finishSetupTileV1.is_badged);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, finishSetupTileV1.completed);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, finishSetupTileV1.client_route);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 4, finishSetupTileV1.image);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 3, finishSetupTileV1.tasks_total);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, finishSetupTileV1.tasks_completed);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, finishSetupTileV1.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FinishSetupTileV1 finishSetupTileV1 = (FinishSetupTileV1) obj;
        finishSetupTileV1.getClass();
        int size$okio = finishSetupTileV1.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, finishSetupTileV1.title) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, finishSetupTileV1.client_route) + Image.ADAPTER.encodedSizeWithTag(4, finishSetupTileV1.image) + protoAdapter2.encodedSizeWithTag(3, finishSetupTileV1.tasks_total) + protoAdapter2.encodedSizeWithTag(2, finishSetupTileV1.tasks_completed) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        return protoAdapter3.encodedSizeWithTag(7, finishSetupTileV1.is_badged) + protoAdapter3.encodedSizeWithTag(6, finishSetupTileV1.completed) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FinishSetupTileV1 finishSetupTileV1 = (FinishSetupTileV1) obj;
        finishSetupTileV1.getClass();
        Image image = finishSetupTileV1.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = finishSetupTileV1.title;
        Integer num = finishSetupTileV1.tasks_completed;
        Integer num2 = finishSetupTileV1.tasks_total;
        String str2 = finishSetupTileV1.client_route;
        Boolean bool = finishSetupTileV1.completed;
        Boolean bool2 = finishSetupTileV1.is_badged;
        byteString.getClass();
        return new FinishSetupTileV1(str, num, num2, image2, str2, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FinishSetupTileV1 finishSetupTileV1 = (FinishSetupTileV1) obj;
        finishSetupTileV1.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, finishSetupTileV1.title);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
        protoAdapter2.encodeWithTag(protoWriter, 2, finishSetupTileV1.tasks_completed);
        protoAdapter2.encodeWithTag(protoWriter, 3, finishSetupTileV1.tasks_total);
        Image.ADAPTER.encodeWithTag(protoWriter, 4, finishSetupTileV1.image);
        protoAdapter.encodeWithTag(protoWriter, 5, finishSetupTileV1.client_route);
        ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
        protoAdapter3.encodeWithTag(protoWriter, 6, finishSetupTileV1.completed);
        protoAdapter3.encodeWithTag(protoWriter, 7, finishSetupTileV1.is_badged);
        protoWriter.writeBytes(finishSetupTileV1.unknownFields());
    }
}
