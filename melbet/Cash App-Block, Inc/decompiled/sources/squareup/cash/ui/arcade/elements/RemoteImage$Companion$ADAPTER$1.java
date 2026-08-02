package squareup.cash.ui.arcade.elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class RemoteImage$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new RemoteImage((Integer) obj, (Integer) obj2, (Image) obj3, (HorizontalAlignment) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.UINT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                try {
                    obj4 = HorizontalAlignment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RemoteImage remoteImage = (RemoteImage) obj;
        reverseProtoWriter.getClass();
        remoteImage.getClass();
        reverseProtoWriter.writeBytes(remoteImage.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, remoteImage.accessibility_label);
        HorizontalAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 4, remoteImage.horizontal_alignment);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, remoteImage.image);
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, remoteImage.height);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, remoteImage.width);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RemoteImage remoteImage = (RemoteImage) obj;
        remoteImage.getClass();
        int size$okio = remoteImage.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        return ProtoAdapter.STRING.encodedSizeWithTag(5, remoteImage.accessibility_label) + HorizontalAlignment.ADAPTER.encodedSizeWithTag(4, remoteImage.horizontal_alignment) + Image.ADAPTER.encodedSizeWithTag(3, remoteImage.image) + protoAdapter.encodedSizeWithTag(2, remoteImage.height) + protoAdapter.encodedSizeWithTag(1, remoteImage.width) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RemoteImage remoteImage = (RemoteImage) obj;
        remoteImage.getClass();
        Image image = remoteImage.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = remoteImage.width;
        Integer num2 = remoteImage.height;
        HorizontalAlignment horizontalAlignment = remoteImage.horizontal_alignment;
        String str = remoteImage.accessibility_label;
        byteString.getClass();
        return new RemoteImage(num, num2, image2, horizontalAlignment, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RemoteImage remoteImage = (RemoteImage) obj;
        remoteImage.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT32;
        protoAdapter.encodeWithTag(protoWriter, 1, remoteImage.width);
        protoAdapter.encodeWithTag(protoWriter, 2, remoteImage.height);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, remoteImage.image);
        HorizontalAlignment.ADAPTER.encodeWithTag(protoWriter, 4, remoteImage.horizontal_alignment);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, remoteImage.accessibility_label);
        protoWriter.writeBytes(remoteImage.unknownFields());
    }
}
