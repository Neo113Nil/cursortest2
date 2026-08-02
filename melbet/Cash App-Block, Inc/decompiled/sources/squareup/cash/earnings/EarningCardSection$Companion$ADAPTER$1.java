package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningCardSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new EarningCardSection((Image) obj, (LocalizedString) obj2, (LocalizedString) obj3, (String) obj4, (LocalizedString) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningCardSection earningCardSection = (EarningCardSection) obj;
        reverseProtoWriter.getClass();
        earningCardSection.getClass();
        reverseProtoWriter.writeBytes(earningCardSection.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, earningCardSection.call_to_action_text);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, earningCardSection.client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, earningCardSection.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, earningCardSection.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, earningCardSection.header_image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningCardSection earningCardSection = (EarningCardSection) obj;
        earningCardSection.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, earningCardSection.header_image) + earningCardSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, earningCardSection.call_to_action_text) + ProtoAdapter.STRING.encodedSizeWithTag(4, earningCardSection.client_route) + protoAdapter.encodedSizeWithTag(3, earningCardSection.subtitle) + protoAdapter.encodedSizeWithTag(2, earningCardSection.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningCardSection earningCardSection = (EarningCardSection) obj;
        earningCardSection.getClass();
        Image image = earningCardSection.header_image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        LocalizedString localizedString = earningCardSection.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = earningCardSection.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = earningCardSection.call_to_action_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = earningCardSection.client_route;
        byteString.getClass();
        return new EarningCardSection(image2, localizedString2, localizedString4, str, localizedString6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningCardSection earningCardSection = (EarningCardSection) obj;
        earningCardSection.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, earningCardSection.header_image);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, earningCardSection.title);
        protoAdapter.encodeWithTag(protoWriter, 3, earningCardSection.subtitle);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, earningCardSection.client_route);
        protoAdapter.encodeWithTag(protoWriter, 5, earningCardSection.call_to_action_text);
        protoWriter.writeBytes(earningCardSection.unknownFields());
    }
}
